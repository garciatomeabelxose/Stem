/*1. Al cargar la página:
   - Cambia la imagen por `"lapegatina.jpg"`.
   - Modifica el `alt` de la imagen a `"La Pegatina en vivo"`.*/

   let banda = document.getElementById("banda")
   let nuevaImagen = document.createElement("img")
   nuevaImagen.src = "lapegatina.jpg"
   nuevaImagen.alt = "La Pegatina en vivo"
   banda.src = nuevaImagen.src
   banda.alt = nuevaImagen.alt