package org.owndev.scs.entity;

import org.owndev.scs.common.Named;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "GROUPS")
public class Group extends Named implements Serializable {

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
}
