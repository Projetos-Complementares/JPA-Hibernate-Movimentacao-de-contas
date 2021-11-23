package br.com.alura.jpa.dao;

import br.com.alura.jpa.modelo.Conta;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class ContaDao {
    private EntityManager manager;

    public void insert(Conta conta){
        this.manager.persist(conta);
    }
}
