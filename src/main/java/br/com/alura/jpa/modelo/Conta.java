package br.com.alura.jpa.modelo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Contas")
@Data
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titular;
	private Integer agencia;
	private Integer numero;
	private Double saldo;
}
