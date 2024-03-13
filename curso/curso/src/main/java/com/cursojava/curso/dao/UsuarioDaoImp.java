package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements IUsuarioDao{
    @PersistenceContext
    //sirve para hacer la conexion con la bd
    EntityManager entityManager;
    @Override
    public List getUsuarios() {
        String query= "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(int id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public boolean verificarUsuario(Usuario usuario) {
        String query = "FROM Usuario WHERE email = :email AND password = :password";
        List lista = entityManager.createQuery(query)
                .setParameter("email", usuario.getEmail())
                .setParameter("password", usuario.getPassword())
                .getResultList();
        return !lista.isEmpty();
    }
}
