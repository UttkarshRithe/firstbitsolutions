document.addEventListener("DOMContentLoaded", () => {

    let thumbnails = document.querySelectorAll(".thumb");
    let mainImage = document.getElementById("mainImg");

    for (let i = 0; i < thumbnails.length; i++) {

        thumbnails[i].addEventListener("click", (event) => {

            let temp = mainImage.src;
            mainImage.src = event.target.src;
            event.target.src = temp;

        });

    }

});