package org.owndev.scs.service.impl;

import org.owndev.scs.dao.Dao;
import org.owndev.scs.entity.Teacher;
import org.owndev.scs.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.SQLException;
import java.util.List;

public class TeacherService implements ObjectService<Long, Teacher> {

	@Autowired
	@Qualifier
	private Dao dao;

	public List<Teacher> getAll() throws SQLException {
		return dao.getAll();
	}

	public void create(Teacher o) throws SQLException {
		dao.create(o);
	}

	public void update(Teacher o) throws SQLException {
		dao.update(o);
	}

	public void delete(Teacher o) throws SQLException {
		dao.delete(o);
	}

	public Teacher findById(Long id) throws SQLException {
		return (Teacher) dao.getObjectById(id);
	}
}
