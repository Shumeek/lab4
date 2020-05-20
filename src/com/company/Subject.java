package com.company;

public class Subject {
    static final String nameSubjects[] = {"Java","БД","ТСПП","Защита Веб ресурсов","Linux"};
    String nameSubject;
    float mark;
    boolean passed;
    {
        this.mark = (float)Math.random()*5f;
        this.passed = mark > 2 ? true : false;
    }

    public Subject(int i) {
        this.nameSubject = nameSubjects[i];
    }

    public float getMark() {
        return mark;
    }

    public boolean isPassed() {

        return passed;
    }

    public String getNameSubject() {
        return nameSubject;
    }
}

