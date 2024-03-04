package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.IUsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioDao _usuarioDao;
    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable int id)
    {
        Usuario usuario = new Usuario();
        return usuario;
    }
    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios(){
        return _usuarioDao.getUsuarios();
    }
    @RequestMapping(value = "api/usuario", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){
        _usuarioDao.registrar(usuario);
    }
    @RequestMapping(value = "usuario/modificar")
    public Usuario modificarUsuario()
    {
        Usuario usuario = new Usuario();
        return usuario;
    }
    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.DELETE)
    public void eliminarUsuario(@PathVariable int id){
        _usuarioDao.eliminar(id);
    }

}
