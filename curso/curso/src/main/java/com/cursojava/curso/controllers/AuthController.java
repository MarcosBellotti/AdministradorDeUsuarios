package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.IUsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private IUsuarioDao _usuarioDao;
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String registrarUsuario(@RequestBody Usuario usuario){
        if(_usuarioDao.verificarUsuario(usuario)){
            return "Ok";
        }
        return "FAIL";
    }
}
