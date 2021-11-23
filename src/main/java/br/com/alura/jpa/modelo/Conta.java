package br.com.alura.jpa.modelo;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "Contas")
@Data
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String titular;
	@NonNull
	private Integer agencia;
	@NonNull
	private Integer numero;
	@NonNull
	private Double saldo;
}
