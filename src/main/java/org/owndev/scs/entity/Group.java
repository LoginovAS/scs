package org.owndev.scs.entity;

import org.owndev.scs.common.DBObject;
import org.owndev.scs.common.Named;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "GROUPS")
@NamedQueries({
        @NamedQuery(name = Group.GET_ALL_QUERY, query = "from Group g"),
        @NamedQuery(name = Group.GET_BY_ID_QUERY, query = "from Group g where g.id = :id")
})
public class Group extends Named implements DBObject, Serializable {

    public static final String GET_ALL_QUERY = "Group.getAllQuery";
    public static final String GET_BY_ID_QUERY = "Group.getObjectById";

    private List<Student> students;

    @Id
    @Column(name = "G_ID")
    public long getId() {
        return id;
    }

    @Column(name = "G_NAME")
    public String getName() {
        return name;
    }

    @JoinColumn(name = "STUDENT_ID")
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getAllObjectsQuery() {
        return GET_ALL_QUERY;
    }

    public String getObjectByIdQuery() {
        return GET_BY_ID_QUERY;
    }
}
