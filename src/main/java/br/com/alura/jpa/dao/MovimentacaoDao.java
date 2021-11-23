package br.com.alura.jpa.dao;

import br.com.alura.jpa.modelo.Movimentacao;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class MovimentacaoDao {
    private EntityManager manager;

    public void insert(Movimentacao movimentacao){
        this.manager.persist(movimentacao);
    }
}
