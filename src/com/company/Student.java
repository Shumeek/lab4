package com.company;

public class Student {

    int id;
    static int nextId;
    String name;
    String surname;
    String group;
    Subject[] subjects;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = new Subject[5];
        this.subjects = subjects;
    }

    public Student(int id, String name, String surname, String group, Subject[] subjects) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.subjects = new Subject[5];
        this.subjects = subjects;
    }

    public float avarageMark(){
        float avarageMark = 0;
        for(int i=0;i<subjects.length;i++){
            avarageMark += this.subjects[i].getMark()/subjects.length;
        }
        return avarageMark;
    }

    public void passedSub(){
        for(int i=0;i<subjects.length;i++){
            System.out.println(this.subjects[i].getNameSubject() + " (" + this.subjects[i].isPassed()+") "+this.subjects[i].getMark());

        }
    }

}
