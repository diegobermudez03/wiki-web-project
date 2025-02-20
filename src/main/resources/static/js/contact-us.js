document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("contactForm");
    const messageContainer = document.getElementById("message-container");

    const fields = [
        { id: "firstName", max: 100 },
        { id: "lastName", max: 100 },
        { id: "email", max: 100 },
        { id: "description" },
        { id: "semester" }
    ];

    //for all fields we'll  add some handlers
    fields.forEach(field => {
        const input = document.getElementById(field.id);

        //if the field has the max field, means that it has a limitation of number
        //so we'll add a handler to show the current characters, 
        if (field.max) {
            const counter = document.getElementById(field.id + "Count");

            input.addEventListener("input", function() {
                const value = input.value;
                counter.textContent = `${value.length}/${field.max}`;
                
                //wont allow to write more than the max
                if (value.length > field.max) {
                    input.classList.add("error");
                    input.value = value.substring(0, field.max);
                    counter.textContent = `${field.max}/${field.max}`;
                }
            });
        }

        //this is for all fields, if the field had an error, once the user changes the text
        //like to correct, or to fill the field, then we remove the error class
        input.addEventListener("input", function() {
            if (input.value !== "" && input.classList.contains("error")) {
                input.classList.remove("error");
            }
        });
    });

    
    form.addEventListener("submit", function(event) {

        event.preventDefault();

        //before checking, we remove all errors just in case
        document.querySelectorAll("input, textarea").forEach(input => {
            input.classList.remove("error");
        });


        let isValid = true;
        //the empty fields will show error
        fields.forEach(field => {
            const input = document.getElementById(field.id);
            if (input.value.trim() === "") {
                isValid = false;
                input.classList.add("error");
            }
        });


        const firstName = document.getElementById("firstName");
        const lastName = document.getElementById("lastName");
        const email = document.getElementById("email");
        const semester = document.getElementById("semester");
        const description = document.getElementById("description");

        //validate the first and last name
        if (firstName.value.length > 100 || firstName.value.trim() === "") {
            firstName.classList.add("error");
            isValid = false;
        }
        if (lastName.value.length > 100 || lastName.value.trim() === "") {
            lastName.classList.add("error");
            isValid = false;
        }

        //validate the email
        const emailValue = email.value;
        //if there are invalid spaces
        if (emailValue.trim().replaceAll(" ", "") !== emailValue) {
            email.classList.add("error");
            isValid = false;
        }

        //these are to check if it has @ and a . after that
        const parts = emailValue.split("@");
        if (parts.length !== 2) {
            email.classList.add("error");
            isValid = false;
        } else if (!parts[1].includes(".")) {
            email.classList.add("error");
            isValid = false;
        } else if (emailValue.length > 100) {
            email.classList.add("error");
            isValid = false;
        }

        //checking the semester
        const semesterValue = parseInt(semester.value, 10);
        if (isNaN(semesterValue) || semesterValue < 0 || semesterValue > 16) {
            semester.classList.add("error");
            isValid = false;
        }

        //the description cant be empty
        if (description.value.trim() === "") {
            description.classList.add("error");
            isValid = false;
        }

        //if there were errors found, we show the message
        if (!isValid) {
            showErrorMessage("PHay errores, corrige los campos en rojo para continuar.");
            return;
        }

        //if no errors were found, send the form
        sendForm(
            firstName.value,
            lastName.value,
            email.value.toUpperCase(),
            semester.value,
            description.value,
            form
        );
    });

    //these are the functions that add the error or success elements
    function showSuccessMessage(msg) {
        const div = document.createElement("div");
        div.classList.add("message-box", "success");
        div.textContent = msg;
        messageContainer.appendChild(div);
    }

    function showErrorMessage(msg) {
        const div = document.createElement("div");
        div.classList.add("message-box", "error");
        div.textContent = msg;
        messageContainer.appendChild(div);
    }

    //function to send the form
    async function sendForm(firstN, lastN, mail, sem, desc, form) {
        const formData = {
            firstName: firstN,
            lastName: lastN,
            email: mail,
            semester: sem,
            description: desc
        };

        try {
            const response = await fetch("/contact", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(formData)
            });

            if (!response.ok) {
                //if the backend answerwith an error, we show the exact message recevied
                const errorResponse = await response.json();
                showErrorMessage(`❌ Error: ${errorResponse.error}`);
                return;
            }

            //if everything wqs fine, then show the success message
            showSuccessMessage("El formulario fue enviado, gracias.");
            form.reset();
            document.querySelectorAll(".char-count").forEach(counter => counter.textContent = "0/100");

        } catch (error) {
            showErrorMessage(`❌ Error enviando: ${error.message}`);
        }
    }
});
