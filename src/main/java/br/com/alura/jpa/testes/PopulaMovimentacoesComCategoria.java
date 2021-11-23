package br.com.alura.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.EntityManager;

import br.com.alura.jpa.dao.CategoriaDao;
import br.com.alura.jpa.dao.ContaDao;
import br.com.alura.jpa.dao.MovimentacaoDao;
import br.com.alura.jpa.modelo.Categoria;
import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.Tipos.TipoMovimentacao;
import br.com.alura.jpa.util.JPAUtil;

public class PopulaMovimentacoesComCategoria {

    public static void main(String[] args) {
		EntityManager em = JPAUtil.createEntityManager();
        CategoriaDao categoriaDao = new CategoriaDao(em);
        ContaDao contaDao = new ContaDao(em);
        MovimentacaoDao movimentacaoDao = new MovimentacaoDao(em);

        Categoria categoria1 = new Categoria("Viagem");
        Categoria categoria2 = new Categoria("Negócios");

        Conta conta = new Conta("Maria",9876, 124512,500.0);
        Conta conta2 = new Conta("Bruno", 6543, 169878, 1300.0);

        Movimentacao movimentacao1 = new Movimentacao(TipoMovimentacao.SAIDA,
                "Viagem à SP",
                BigDecimal.valueOf(100.0),
                conta2);
                movimentacao1.setCategorias(Arrays.asList(categoria1));

        Movimentacao movimentacao2 = new Movimentacao(TipoMovimentacao.SAIDA,
                "Viagem ao RJ",
                BigDecimal.valueOf(300.0),
                conta2);
                movimentacao2.setData(LocalDateTime.now().plusDays(1)); // amanhã
        
        em.getTransaction().begin();

        categoriaDao.insert(categoria1);
        categoriaDao.insert(categoria2);

        contaDao.insert(conta);
        contaDao.insert(conta2);

        movimentacaoDao.insert(movimentacao1);
        movimentacaoDao.insert(movimentacao2);
       
        em.getTransaction().commit();
        em.close();

    }
}