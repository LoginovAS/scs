package org.owndev.scs.model;

import org.owndev.scs.entity.Student;
import org.owndev.scs.entity.Teacher;
import org.owndev.scs.service.TeacherService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named(value = "mainViewListModel")
public class MainViewListModel implements Serializable {

    @Inject
    private TeacherService teacherService;

    private List<Teacher> teachers;
    private List<Student> students;

    @PostConstruct
    private void postConstruct() {
        teachers = teacherService.getObjectList();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
