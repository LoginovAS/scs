package org.owndev.scs.dao.impl;

import org.owndev.scs.common.DBObject;
import org.owndev.scs.dao.Dao;
import org.owndev.scs.entity.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class TeacherDao implements Dao<Long, Teacher> {

    @PersistenceContext(unitName = "scs_PU")
    private EntityManager em;

    public List<Teacher> getAll() throws SQLException {
        Query query = em.createNamedQuery(Teacher.GET_ALL_QUERY);
        return query.getResultList();
    }

    public void create(Teacher o) throws SQLException {
        em.persist(o);
    }

    public void update(Teacher o) throws SQLException {
        em.merge(o);
    }

    public void delete(Teacher o) throws SQLException {
        em.remove(o);
    }

    public Teacher getObjectById(Long id) throws SQLException {
        return em.find(Teacher.class, id);
    }
}
