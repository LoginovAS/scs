package org.owndev.scs.entity;

import org.owndev.scs.common.DBObject;
import org.owndev.scs.common.Named;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "STUDENTS")
@NamedQueries({
        @NamedQuery(name = Group.GET_ALL_QUERY, query = "from Student s"),
        @NamedQuery(name = Group.GET_BY_ID_QUERY, query = "from Student s where s.id = :id")
})
public class Student extends Named implements DBObject, Serializable {

    public static final String GET_ALL_QUERY = "Student.getAllQuery";
    public static final String GET_BY_ID_QUERY = "Student.getObjectById";

    private Group group;

    @Column(name = "S_NAME")
    public String getName() {
        return null;
    }

    @Id
    @Column(name = "S_ID")
    public long getId() {
        return 0;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getAllObjectsQuery() {
        return GET_ALL_QUERY;
    }

    public String getObjectByIdQuery() {
        return GET_BY_ID_QUERY;
    }
}
