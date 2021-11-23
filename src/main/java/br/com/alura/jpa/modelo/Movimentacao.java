package br.com.alura.jpa.modelo;

import br.com.alura.jpa.Tipos.TipoMovimentacao;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "movimentacoes")
@Data
public class Movimentacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	@Enumerated(EnumType.STRING)
	private TipoMovimentacao tipoMovimentacao;
	private LocalDateTime data = LocalDateTime.now();
	@NonNull
	private String descricao;
	@NonNull
	private BigDecimal valor;
	@NonNull
	@ManyToOne
	private Conta conta;
	@OneToMany
	private List<Categoria> categorias = new ArrayList<>();
}
