document.addEventListener("DOMContentLoaded", () => {
    const menuIcon = document.getElementById("menu-icon");
    const links = document.getElementById("links-menu");
    //this is for the hamburguer (I think thats how its called), so that when pressed
    //it adds the active class to the links and the icon itself
    //what it does is that it does the animation with the burguer and opens the menu
    menuIcon.addEventListener("click", () => {
        links.classList.toggle("active");
        menuIcon.classList.toggle("active");
    });
});
  