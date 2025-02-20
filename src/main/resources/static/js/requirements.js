document.addEventListener("DOMContentLoaded", () => {
    const fadeElements = document.querySelectorAll(".fade-element");
    const observerOptions = { threshold: 0.1 };
  
    const fadeObserver = new IntersectionObserver((entries, obs) => {
      entries.forEach(entry => {
        if (entry.isIntersecting) {
          entry.target.classList.add("appear");
          obs.unobserve(entry.target);
        }
      });
    }, observerOptions);
  
    fadeElements.forEach(el => fadeObserver.observe(el));
  
    const storyCards = document.querySelectorAll(".story-card");
    const modal = document.getElementById("storyModal");
    const closeModalBtn = document.getElementById("closeModal");
  
    const modalStoryId = document.getElementById("modal-story-id");
    const modalStoryTitle = document.getElementById("modal-story-title");
    const modalStoryPhrase = document.getElementById("modal-story-phrase");
    const modalStoryCriteria = document.getElementById("modal-story-criteria");
    const modalStoryType = document.getElementById("modal-story-type");
  
    storyCards.forEach(card => {
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
  
        modal.style.display = "block";
      });
    });
  
    closeModalBtn.addEventListener("click", () => {
      modal.style.display = "none";
    });
  
    window.addEventListener("click", (event) => {
      if (event.target === modal) {
        modal.style.display = "none";
      }
    });
  });
  