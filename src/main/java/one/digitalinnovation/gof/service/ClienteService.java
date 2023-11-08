package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.dto.ClienteDto;
import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author falvojr
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(ClienteDto cliente);

	void atualizar(Long id, ClienteDto cliente);

	void deletar(Long id);

}
