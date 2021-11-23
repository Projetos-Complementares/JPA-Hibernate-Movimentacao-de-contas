package br.com.alura.jpa.dao;

import br.com.alura.jpa.modelo.Categoria;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class CategoriaDao {
    private EntityManager manager;

    public void insert(Categoria categoria){
        this.manager.persist(categoria);
    }

}
