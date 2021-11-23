package br.com.alura.jpa.modelo;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
@Data
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String nome;
}
