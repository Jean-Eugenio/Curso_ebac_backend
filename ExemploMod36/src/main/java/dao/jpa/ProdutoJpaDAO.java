package main.java.dao.jpa;

/**
 * 
 */

import main.java.dao.generic.jpa.GenericJpaDAO;
import main.java.domain.jpa.ProdutoJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}