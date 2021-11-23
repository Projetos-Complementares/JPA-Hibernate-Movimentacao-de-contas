package br.com.alura.jpa.modelo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String profissao;
	private String endereco;

	@OneToOne
	private Conta conta;
}
