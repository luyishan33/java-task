package task;

import java.util.ArrayList;

public class Class {
    
    private String name;
    private ArrayList<Group> groups;
    private ArrayList<Student> students;

    public Class(String name){
        this.name=name;
        this.groups=new ArrayList<>();
        this.students=new ArrayList<>();
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public ArrayList<Group> getGroups(){
        return groups;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Class{name='" + name + "',groups=" + groups +",students=" + students + "}";
    }
}
