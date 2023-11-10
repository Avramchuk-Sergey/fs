function createNewElement(){

   const newElement = document.createElement("div");
   newElement.classList.add("defaultElement");
   const content = document.createTextNode("new FS element");
   newElement.appendChild(content);
   
   document.getElementById("container").appendChild(newElement);
   dragElement(newElement);
}