const button = document.getElementById("changeColorButton");
function changeColors() {
    const body = document.body;
    if (body.style.background === "blue") {
        body.style.background = "#f5f5f5"; 
        body.style.color
          = "blue";
    } else {
        body.style.background = "blue"; 
        body.style.color = "white";
    }
}
