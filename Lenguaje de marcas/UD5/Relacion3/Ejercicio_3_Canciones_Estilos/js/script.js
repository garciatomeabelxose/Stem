/*1. Al cargar la página:
   - Cambia el color de todas las canciones (`li`) a verde.
   - Agrega un emoji 🎶 al final de cada canción.*/

   let emoji = "🎶"
document.querySelectorAll("li").forEach((li) => {
  li.style.color= "green" 
  li.textContent+=emoji
})
