package org.owndev.scs.entity;

import org.owndev.scs.common.Named;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "STUDENTS")
public class Student extends Named  implements Serializable {

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
}
