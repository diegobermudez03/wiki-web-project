//this fade is for all screens that share the dynamic loading page affect, which is then the elements
//come from doen,
document.addEventListener("DOMContentLoaded", () => {

  const fadeElements = document.querySelectorAll(".fade-element");
  const observerOptions = { threshold: 0.4 };

  //we create an intersection observer with the options of 0.4, which means
  //it will consider that its observing the element if it sees at least 40% of it
  const fadeObserver = new IntersectionObserver((entries, obs) => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        //when it does see the section, it adds the appear class which is the one that has the default values, so that it makes the animation ot the 
        //correct place
        entry.target.classList.add("appear");
        obs.unobserve(entry.target);
      }
    });
  }, observerOptions);

  fadeElements.forEach(el => fadeObserver.observe(el));
  
});