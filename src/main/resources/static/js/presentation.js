document.addEventListener("DOMContentLoaded", () => {
    const teamMembers = document.querySelectorAll(".member-t");
    const modal = document.getElementById("modal");
    const closeModal = document.getElementById("closeModal") || document.querySelector(".close");
    const modalImg = document.getElementById("modal-img");
    const modalName = document.getElementById("modal-name");
    const modalInfo = document.getElementById("modal-info");
    const modalRole = document.getElementById("modal-role");
  
    //for all member elements we add the callback for when they are clicked
    //when they are, then we''ll replace the modal info with the member information
    //and we change the modal style so that it blocks, which means, it is shown
    teamMembers.forEach(member => {
      member.addEventListener("click", () => {
        const name = member.getAttribute("mem-name");
        const info = member.getAttribute("mem-info");
        const role = member.getAttribute("mem-role");
        const img = member.getAttribute("mem-img").replace("@", "").replace("{", "").replace("}", "");  //this is because the field was being taken with @{image}, so we have to remove @{}
  
        modalName.textContent = name;
        modalInfo.textContent = info;
        modalRole.textContent = role;
        modalImg.setAttribute("src", img);
  
        modal.style.display = "block";
      });
    });
    
    //callback for the modal, so that if the x is clicked then it stops showing up
    closeModal.addEventListener("click", () => {
      modal.style.display = "none";
    });
    
    //callback on all the window, so that it also allows to close the modal by clicking outside
    window.addEventListener("click", (event) => {
      if (event.target === modal) {
        modal.style.display = "none";
      }
    });
  });
  