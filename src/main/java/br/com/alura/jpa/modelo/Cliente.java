package br.com.alura.jpa.modelo;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String nome;
	@NonNull
	private String profissao;
	@NonNull
	private String endereco;
	@NonNull
	@OneToOne
	private Conta conta;
}
