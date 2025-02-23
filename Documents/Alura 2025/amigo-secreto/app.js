let amigos = []; // Definir la lista de amigos

function agregarAmigo() {
    let input = document.getElementById("amigo");
    let nombre = input.value.trim(); // Elimina espacios extras.

    if (nombre === "") {
        alert("Por favor, escribe un nombre.");
        return;
    }

    if (amigos.includes(nombre)) {
        alert("Este nombre ya está en la lista.");
        return;
    }

    amigos.push(nombre); // Agrega el nombre al array

    // Mostrar el nombre en la lista visualmente
    let lista = document.getElementById("listaAmigos");
    if (!lista) {
        console.error("Error: no se encontró el elemento con id 'listaamigo'.");
        return;
    }
    console.log(lista); // Debería mostrar el <ul> en la consola

    let li = document.createElement("li");
    li.textContent = nombre;
    lista.appendChild(li);

    input.value = ""; // Limpiar el input después de añadir el nombre
}

function sorteoAmigo() {
     if (amigos.length < 2){
        alert("Debe haber al menos 1 amigos para sortear");
        return;
     }

     let resultadoLista = document.getElementById("resultado");

     if (!resultadoLista){
        console.error("Error: no se encontro el elemento con id 'resultado'.");
        return;
     }

     resultadoLista.innerHTML = "";//limpiar resultado previos


    //Seleccionar un amigo aleatoriamente
     let indiceAleatorio = Math.floor(Math.random()* amigos.length);
     let amigoSeleccionado = amigos[indiceAleatorio];

    let li = document.createElement("li");
    li.textContent = `Amigo secreto: ${amigoSeleccionado}`;
    resultadoLista.appendChild(li);
}
