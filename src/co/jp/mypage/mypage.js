let isOrigin = true;
function changeColor() {
  document.body.style.backgroundColor = isOrigin ? "lightblue" : "#fffacd";
  document.body.style.color = isOrigin ? "white" : "black";
  document.querySelector("a").style.color = isOrigin ? "white" : "black";
  document.querySelector("button").style.color = isOrigin ? "white" : "black";
  isOrigin = !isOrigin;
}