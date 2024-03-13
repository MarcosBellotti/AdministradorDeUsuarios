$(document).ready(function() {
//on ready
});

async function iniciarSesion(){
     try {
             let datos = {};
             datos.email = document.getElementById('txtEmail').value;
             datos.password = document.getElementById('txtPassword').value;

             const request = await fetch('api/login', {
                 method: 'POST',
                 headers: {
                     'Accept': 'application/json',
                     'Content-Type': 'application/json'
                 },
                 body: JSON.stringify(datos)
             });

             if (request.ok) {
                 const respuesta = await request.json();
                 console.log(respuesta);
             } else {
                 console.error('Error en la solicitud:', request.status);
             }
         } catch (error) {
             console.error('Error en la solicitud:', error);
         }
}