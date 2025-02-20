document.addEventListener("DOMContentLoaded", () => {
    const menuIcon = document.getElementById("menu-icon");
    const links = document.getElementById("links-menu");
  
    menuIcon.addEventListener("click", () => {
        links.classList.toggle("active");
        menuIcon.classList.toggle("active");
    });
});
  