package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import one.digitalinnovation.gof.dto.ClienteDto;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;
	
	/**
	 * Construtor para integrar com o Dto
	 * @param dados
	 */
	public Cliente (ClienteDto dados) {
		this.id = dados.getId();
		this.nome = dados.getNome();
		this.endereco = new Endereco(dados.getEndereco());
	}
	
	
}
