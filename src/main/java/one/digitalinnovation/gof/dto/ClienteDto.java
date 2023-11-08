package one.digitalinnovation.gof.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import one.digitalinnovation.gof.model.Endereco;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDto {
	
	private Long id;
	private String nome;
	private EnderecoDto endereco;
	
	
	
	

}
