package Encapsulation;

import Encapsulation.Student;

class test {
    public static void main(String[] args) {
        Student s = new Student(1, "Stephanie", "GSU", "23 Main street");
        System.out.println(s.getName());
    }
}