document.addEventListener("DOMContentLoaded", () => {
    const storyCards = document.querySelectorAll(".story-card");
    const modal = document.getElementById("storyModal");
    const closeModalBtn = document.getElementById("closeModal");
  
    const modalStoryId = document.getElementById("modal-story-id");
    const modalStoryTitle = document.getElementById("modal-story-title");
    const modalStoryPhrase = document.getElementById("modal-story-phrase");
    const modalStoryCriteria = document.getElementById("modal-story-criteria");
    const modalStoryType = document.getElementById("modal-story-type");
  
    //for all the story cards, we are going to make each one of them to add a callback to their click on the details button
    storyCards.forEach(card => {
      //if the detaisl button is clicked, then we change the modal info with the current story info
      card.querySelector(".details-btn").addEventListener("click", () => {
        const id = card.dataset.id;
        const title = card.dataset.title;
        const phrase = card.dataset.phrase;
        const criteria = card.dataset.criteria;
        const type = card.dataset.type;
  
        modalStoryId.textContent = `ID: ${id}`;
        modalStoryTitle.textContent = title;
        modalStoryPhrase.textContent = `Frase: "${phrase}"`;
        modalStoryCriteria.textContent = criteria;
        modalStoryType.textContent = `Tipo de Usuario: ${type}`;
        //same as with the presentation, the modal is blocking
        modal.style.display = "block";
      });
    });
    
    //same as with the presentation screen, callbacks for closing the modal
    closeModalBtn.addEventListener("click", () => {
      modal.style.display = "none";
    });
  
    window.addEventListener("click", (event) => {
      if (event.target === modal) {
        modal.style.display = "none";
      }
    });
  });
  