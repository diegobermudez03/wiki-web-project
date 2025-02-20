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
  
  });