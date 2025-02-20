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

    // Lógica para contar caracteres y limitar
    fields.forEach(field => {
        const input = document.getElementById(field.id);

        // Si el campo tiene 'max', configuramos el contador
        if (field.max) {
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

        // Quita la clase "error" si el usuario vuelve a escribir algo
        input.addEventListener("input", function() {
            if (input.value !== "" && input.classList.contains("error")) {
                input.classList.remove("error");
            }
        });
    });

    // Validación al enviar
    form.addEventListener("submit", function(event) {
        event.preventDefault();
        
        // Resetea el contenedor de mensajes
        messageContainer.innerHTML = "";

        // Revisa campos vacíos y marca con clase "error"
        fields.forEach(field => {
            const input = document.getElementById(field.id);
            if (input.value.trim() === "") {
                input.classList.add("error");
            }
        });

        let isValid = true;

        const firstName = document.getElementById("firstName");
        const lastName = document.getElementById("lastName");
        const email = document.getElementById("email");
        const semester = document.getElementById("semester");
        const description = document.getElementById("description");

        // Limpia clase error antes de volver a asignarla si hay problemas
        document.querySelectorAll("input, textarea").forEach(input => {
            input.classList.remove("error");
        });

        // Validaciones de nombres
        if (firstName.value.length > 100 || firstName.value.trim() === "") {
            firstName.classList.add("error");
            isValid = false;
        }
        if (lastName.value.length > 100 || lastName.value.trim() === "") {
            lastName.classList.add("error");
            isValid = false;
        }

        // Validación de email
        const emailValue = email.value;
        if (emailValue.trim().replaceAll(" ", "") !== emailValue) {
            email.classList.add("error");
            isValid = false;
        }
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

        // Validación de semestre
        const semesterValue = parseInt(semester.value, 10);
        if (isNaN(semesterValue) || semesterValue < 0 || semesterValue > 16) {
            semester.classList.add("error");
            isValid = false;
        }

        // Validación de descripción
        if (description.value.trim() === "") {
            description.classList.add("error");
            isValid = false;
        }

        if (!isValid) {
            showErrorMessage("Por favor revisa los campos en rojo. Hay errores en el formulario.");
            return;
        }

        // Si todo está bien, envía el formulario
        sendForm(
            firstName.value,
            lastName.value,
            email.value.toUpperCase(),
            semester.value,
            description.value,
            form
        );
    });

    // Funciones para mostrar mensajes agradables en lugar de 'alert'
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

    // Envío de formulario (fetch POST)
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
                // Asumimos que la respuesta de error tiene un JSON con { error: "mensaje" }
                const errorResponse = await response.json();
                showErrorMessage(`❌ Error: ${errorResponse.error || "desconocido"}`);
                return;
            }

            // Éxito
            showSuccessMessage("Formulario enviado correctamente. ¡Gracias por contactarnos!");
            form.reset();
            document.querySelectorAll(".char-count").forEach(counter => counter.textContent = "0/100");

        } catch (error) {
            showErrorMessage(`❌ Error al enviar. Detalles: ${error.message}`);
        }
    }
});
