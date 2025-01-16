package main.java.dao.jpa;

/**
 * 
 */

import main.java.dao.generic.jpa.GenericJpaDAO;
import main.java.domain.jpa.ClienteJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}