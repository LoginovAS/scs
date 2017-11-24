package org.owndev.scs.service;

import java.sql.SQLException;
import java.util.List;

public interface ObjectService<K, E> {

	List<E> getAll() throws SQLException;
	void create(E o) throws SQLException;
	void update(E o) throws SQLException;
	void delete(E o) throws SQLException;
	E findById(K id) throws SQLException;

}
