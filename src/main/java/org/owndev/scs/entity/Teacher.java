package org.owndev.scs.entity;

import org.owndev.scs.common.DBObject;
import org.owndev.scs.common.Named;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TEACHERS")
@NamedQueries({
        @NamedQuery(name = Teacher.GET_ALL_QUERY, query = "from Teacher t")
})
public class Teacher extends Named implements Serializable {

    public static final String GET_ALL_QUERY = "Teacher.getAllQuery";

    @Id
    @Column(name = "T_ID")
    public long getId() {
        return id;
    }

    @Column(name = "T_NAME")
    public String getName() {
        return name;
    }

}
