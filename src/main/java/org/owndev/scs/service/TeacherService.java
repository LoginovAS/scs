package org.owndev.scs.service;


import org.owndev.scs.entity.Teacher;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.owndev.scs.service.TeacherService.GET_TEACHER_LIST;

@Named
@NamedQuery(name = GET_TEACHER_LIST, query = "select Teacher from Teacher t")
@Resource
public class TeacherService {

    public static final String GET_TEACHER_LIST = "TeacherService.getTeacherList";

    @PersistenceContext
    private EntityManager em;

    public List<Teacher> getObjectList() {
        return em.createNamedQuery(GET_TEACHER_LIST).getResultList();
    }

}
