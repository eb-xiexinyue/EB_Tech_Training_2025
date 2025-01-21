const button = document.getElementById("changeColorButton");

function changeColors() {
    const body = document.body;
    if (body.style.background === "rgb(102, 204, 255)") {
        body.style.background = "#f5f5f5";
        body.style.color = "pink";
    } else {
        body.style.background = "#66ccff";
        body.style.color = "pink";
    }
}

button.addEventListener("click", changeColors);
