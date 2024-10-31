package org.example;

public class Main {
    public static void main(String[] args) {
        University university = new University("1", "Национальный университет", "НУ", 1990, StudyProfile.MEDICINE);
        Student student = new Student("Иван Иванов", university.getId(), 3, 4.5f);

        System.out.println(university);
        System.out.println(student);
    }
}
