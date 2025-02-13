document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("contactForm");

    const fields = [
        { id: "firstName", max: 100 },
        { id: "lastName", max: 100 },
        { id: "email", max: 100 },
        { id: "description"},
        { id: "semester"}
    ];

    fields.forEach(field => {
        const input = document.getElementById(field.id);
        if(field.max){
            const counter = document.getElementById(field.id + "Count");

            input.addEventListener("input", function() {
                const value = input.value;
                counter.textContent = `${value.length}/${field.max}`;
                
                if (value.length > field.max) {
                    input.classList.add("error");
                    input.value = value.substring(0, field.max);
                    counter.textContent = `${field.max}/${field.max}`;
                }
            });
        }

        input.addEventListener("input", function() {
            const value = input.value;
            if(value !== "" && input.classList.contains("error")){
                input.classList.remove("error")
            }
        });
    });

    form.addEventListener("submit", function(event) {
        event.preventDefault();
        
        fields.forEach((field)=>{
            const input = document.getElementById(field.id);
            if(input.value === ""){
                input.classList.add("error")
            }
        });
        let isValid = true;
        const firstName = document.getElementById("firstName");
        const lastName = document.getElementById("lastName");
        const email = document.getElementById("email");
        const semester = document.getElementById("semester");
        const description = document.getElementById("description");

        document.querySelectorAll("input, textarea").forEach(input => {
            input.classList.remove("error");
        });

        //checking first and last names
        if (firstName.value.length > 100 || firstName.value.trim() === "") {
            firstName.classList.add("error");
            isValid = false;
        }

        if (lastName.value.length > 100 || lastName.value.trim() === "") {
            lastName.classList.add("error");
            isValid = false;
        }

        //checking email
        const emailValue = email.value;
        if(emailValue.toUpperCase() !== emailValue){
            email.classList.add("error");
            isValid = false;
        }else if(emailValue.trim().replaceAll(" ", "") !== emailValue){
            email.classList.add("error");
            isValid = false;
        }
        const parts =  emailValue.split("@")
        if(parts.length != 2){
            email.classList.add("error");
            isValid = false;
        }else if(!parts[1].includes(".")){
            email.classList.add("error");
            isValid = false;
        }
        else if ( emailValue.length > 100) {
            email.classList.add("error");
            isValid = false;
        } 

        //check semester
        const semesterValue = parseInt(semester.value, 10);
        if (isNaN(semesterValue) || semesterValue < 0 || semesterValue > 16) {
            semester.classList.add("error");
            isValid = false;
        }

        //check description
        if (description.value.trim() === "") {
            description.classList.add("error");
            isValid = false;
        }
        if (!isValid) {
            return;
        }
        sendForm(firstName.value, lastName.value, email.value, semester.value, description.value, form);
    });
});


async function  sendForm(firstN, lastN, mail, sem, desc, form){ 
    const formData = {
        firstName: firstN,
        lastName: lastN,
        email: mail,
        semester: sem,
        description: desc
    };

    const response = await fetch("/contact", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(formData)
    });
    if (!response.ok) {
        alert("❌ Error: " + errorResponse.error);
        return
    }
    alert("Formulario enviado correctamente :D");
    form.reset();
    document.querySelectorAll(".char-count").forEach(counter => counter.textContent = "0/100");
}
