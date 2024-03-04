// Call the dataTables jQuery plugin
$(document).ready(function() {
//on ready
});

async function registrarUsuario(){
     let datos = {};
     datos.nombre = document.getElementById('txtNombre').value;
     datos.apellido = document.getElementById('txtApellido').value;
     datos.email = document.getElementById('txtEmail').value;
     datos.telefono = document.getElementById('txtTelefono').value;
     datos.password = document.getElementById('txtPassword').value;

     //verificar contrasena
     let repeatPassword = document.getElementById('txtRepeatPassword').value
     if(repeatPassword !== datos.password){
        alert("La repeticion de la contraseña no coincide con la original");
        return;
     }

      const request = await fetch('api/usuario', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });
      const usuarios = await request.json();

}
