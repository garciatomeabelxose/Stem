/*1. Al cargar la página:
   - Cambia el texto del `<h1>` a `"Historia del Ska-Punk: Álbumes Icónicos"`.
   - Cambia el texto del `<h2>` a `"Desde los 80 hasta hoy"`.
   - Modifica el color del título (`h1`) a amarillo y el fondo del subtítulo (`h2`) a negro.*/


   let titulo1 = document.getElementById("titulo")
   let subtitulo1 = document.getElementById("subtitulo")
   titulo1.textContent = "Historia del Ska-Punk: Álbumes Icónicos"
   subtitulo1.textContent = "Desde los 80 hasta hoy"
   titulo1.style.color = "yellow"
   subtitulo1.style.backgroundColor = "black"