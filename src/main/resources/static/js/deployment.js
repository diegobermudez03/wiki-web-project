document.addEventListener("DOMContentLoaded", () => {
    const fadeElements = document.querySelectorAll(".fade-comp");
  
    const options = {
      threshold: 0.1
    };
  
    const observer = new IntersectionObserver((entries, obs) => {
      entries.forEach(entry => {
        if (entry.isIntersecting) {
          entry.target.classList.add("appear");
          obs.unobserve(entry.target);
        }
      });
    }, options);
  
    fadeElements.forEach(el => {
      observer.observe(el);
    });
});
  