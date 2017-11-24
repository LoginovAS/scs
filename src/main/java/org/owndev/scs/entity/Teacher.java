package org.owndev.scs.entity;

import org.owndev.scs.common.Named;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TEACHERS")
public class Teacher extends Named implements Serializable {


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
