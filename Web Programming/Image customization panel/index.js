document.addEventListener("DOMContentLoaded", () => {

    let img = document.getElementById("myImg");

    let borderBtn = document.getElementById("borderBtn");
    let shapeBtn = document.getElementById("shapeBtn");

    let borderOptions = document.getElementById("borderOptions");
    let shapeOptions = document.getElementById("shapeOptions");

    let applyBtn = document.getElementById("applyBtn");

    // Show Border Options
    borderBtn.addEventListener("click", () => {
        borderOptions.classList.remove("hidden");
        shapeOptions.classList.add("hidden");
    });

    // Show Shape Options
    shapeBtn.addEventListener("click", () => {
        shapeOptions.classList.remove("hidden");
        borderOptions.classList.add("hidden");
    });

    // Apply Button Logic
    applyBtn.addEventListener("click", () => {

        // Border values
        let color = document.getElementById("borderColor").value;
        let style = document.getElementById("borderStyle").value;
        let width = document.getElementById("borderWidth").value;

        // Shape value
        let shape = document.getElementById("shape").value;

        // Apply border
        if (width) {
            img.style.border = width + "px " + style + " " + color;
        }

        // Apply shape
        if (shape === "circle") {
            img.style.borderRadius = "50%";
            img.style.clipPath = "none";
        }
        else if (shape === "rectangle") {
            img.style.borderRadius = "0";
            img.style.clipPath = "none";
        }
        else if (shape === "hexagon") {
            img.style.borderRadius = "0";
            img.style.clipPath =
                "polygon(25% 0%, 75% 0%, 100% 50%, 75% 100%, 25% 100%, 0% 50%)";
        }

    });

});