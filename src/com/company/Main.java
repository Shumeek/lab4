package com.company;

public class Main {

    public static void main(String[] args) {

        Subject sbjcts0[] = new Subject[5];
        Subject sbjcts1[] = new Subject[5];
        Subject sbjcts2[] = new Subject[5];
        Subject sbjcts3[] = new Subject[5];
        Subject sbjcts4[] = new Subject[5];
        for (int i = 0; i < 5; i++) {
            sbjcts0[i] = new Subject(i);
            sbjcts1[i] = new Subject(i);
            sbjcts2[i] = new Subject(i);
            sbjcts3[i] = new Subject(i);
            sbjcts4[i] = new Subject(i);
        }
        Student students[] = new Student[5];
        students[0] = new Student(10, "Yehor", "Shum", "Kb-71", sbjcts0);
        students[1] = new Student(11, "Max", "Basov", "Kb-71", sbjcts1);
        students[2] = new Student(12, "Svyat", "Lotsko", "Kb-71", sbjcts2);
        students[3] = new Student(13, "Oleh", "Tsubin", "Kb-71", sbjcts3);
        students[4] = new Student(14, "Tema", "Menyak", "Kb-71", sbjcts4);


        System.out.println("Лучший ученик: "+Utils.getTheBestStudent(students));
        System.out.println();
        System.out.println("Лучший предмет: "+Utils.getTheBestSubject(students));
        System.out.println();


        for( int i=0 ;i < students.length;i++){
            System.out.println("Средняя оценка для студента номер " + (i+1) +" равна: "+ students[i].avarageMark());
            if(students[i].avarageMark() == 5f)
                System.out.println("У студента повышенная степендия");
            else if(students[i].avarageMark() > 3f)
                System.out.println("Обычная степендия");
            else
                System.out.println("Степендии не видать");
            System.out.println();
        }
            for(int i = 0 ; i< students.length;i++){
                System.out.println();
                System.out.println(students[i].getName() + ' ' + students[i].getSurname() + ':');
                students[i].passedSub();
                System.out.println();


        }
    }
}
