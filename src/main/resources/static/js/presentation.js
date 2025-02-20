document.addEventListener("DOMContentLoaded", () => {
    const teamMembers = document.querySelectorAll(".member-t");
    const modal = document.getElementById("modal");
    const closeModal = document.getElementById("closeModal") || document.querySelector(".close");
    const modalImg = document.getElementById("modal-img");
    const modalName = document.getElementById("modal-name");
    const modalInfo = document.getElementById("modal-info");
    const modalRole = document.getElementById("modal-role");
  
    teamMembers.forEach(member => {
      member.addEventListener("click", () => {
        const name = member.getAttribute("mem-name");
        const info = member.getAttribute("mem-info");
        const role = member.getAttribute("mem-role");
        const img = member.getAttribute("mem-img").replace("@", "").replace("{", "").replace("}", "");
  
        modalName.textContent = name;
        modalInfo.textContent = info;
        modalRole.textContent = role;
        modalImg.setAttribute("src", img);
  
        modal.style.display = "block";
      });
    });
  
    closeModal.addEventListener("click", () => {
      modal.style.display = "none";
    });
  
    window.addEventListener("click", (event) => {
      if (event.target === modal) {
        modal.style.display = "none";
      }
    });
  });
  