import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){;

        
        Person[] people = new Person[3];

        
        System.out.println("Enter Student details:");
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Age: ");
        int age = in.nextInt();
        in.nextLine(); 
        System.out.print("Student ID: ");
        String studentId = in.nextLine();
        people[0] = new Student(name, age, studentId);

        
        System.out.println("Enter Teacher details:");
        System.out.print("Name: ");
        name = in.nextLine();
        System.out.print("Age: ");
        age = in.nextInt();
        in.nextLine(); 
        System.out.print("Department: ");
        String department = in.nextLine();
        people[1] = new Teacher(name, age, department);

       
        System.out.println("Enter Department Head details:");
        System.out.print("Name: ");
        name = in.nextLine();
        System.out.print("Age: ");
        age = in.nextInt();
        in.nextLine(); // Очистка буфера
        System.out.print("Department: ");
        department = in.nextLine();
        System.out.print("Years of Experience: ");
        int yearsOfExperience = in.nextInt();
        people[2] = new DepartmentHead(name, age, department, yearsOfExperience);


        System.out.println("\nDetails of all persons:");
        for (Person person : people) {
            person.show();
            System.out.println();
        }
    }
}


    
    static class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void show() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    
    static class Student extends Person {
        private String studentId;

        public Student(String name, int age, String studentId) {
            super(name, age);
            this.studentId = studentId;
        }

        @Override
        public void show() {
            super.show();
            System.out.println("Student ID: " + studentId);
        }
    }

    
    static class Teacher extends Person {
        private String department;

        public Teacher(String name, int age, String department) {
            super(name, age);
            this.department = department;
        }

        @Override
        public void show() {
            super.show();
            System.out.println("Department: " + department);
        }
    }

    
    static class DepartmentHead extends Teacher {
        private int yearsOfExperience;

        public DepartmentHead(String name, int age, String department, int yearsOfExperience) {
            super(name, age, department);
            this.yearsOfExperience = yearsOfExperience;
        }

        @Override
        public void show() {
            super.show();
            System.out.println("Years of Experience: " + yearsOfExperience);
        }
    }
}


