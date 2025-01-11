package org.example.intro;

import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ClassDemo {
    public static void main(String[] args) {

        // switch cases
        int n = 5;

        switch (n) {
            case 1:
                //System.out.println("Monday");
                break;
            case 2:
                //System.out.println("Tuesday");
                break;
            case 3:
                //System.out.println("Wednesday");
                break;
            case 4:
                //System.out.println("Thursday");
                break;
            case 5:
                //System.out.println("Friday");
                break;
            case 6:
                //System.out.println("Saturday");
                break;
            case 7:
                //System.out.println("Sunday");
                break;
            case 8:
                //System.out.println("Invalid Number");
        }


        // do while
        int i = 5;

        do{
            //System.out.println(i);
            i++;
        }while(i<4);


        // classes
        Student s1 = new Student("Bob");
        s1.rollnum = 1;
        s1.setGrade(88);

        Student s2 = new Student("Grace");
        s2.rollnum = 2;
        s2.setGrade(95);

        Student s3 = new Student("Ben");
        s3.rollnum = 3;
        s3.setGrade(82);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students){
            student.printGrade1();
            //Student.printGrade2(student);
        }

        // string buffer (mutable string)
        StringBuffer sb = new StringBuffer("Ben");
        sb.append(" Dover");
        sb.insert(3, " asdf");
        //System.out.println(sb);

        // polymorphism
        Student s4 = new SeniorHighStudent();  // methods will default to Student class
        s4 = new Student();

        // up cast
        Student s5 = new SeniorHighStudent();

        // down casting
        SeniorHighStudent s6 = (SeniorHighStudent) s5;


        // inner class
        Student.InnerClass inner = s1.new InnerClass();

        // inner class override
        Student s7 = new Student()
        {
            public void printGrade1()
            {
                System.out.println("override");
            }
        };
        //s7.printGrade1();
    }
}

// classes
class Student
{
    int rollnum;
    String name;
    private int grade;              // grade is an object member

    private static int gradeSum;    // gradeSum is class member and will be the same for all student objects,
                                    // call static variables with class name not object name

    public int publicVar; // access everywhere
    private int privateVar; // access class only
    protected int protectedVar; // access package and subclasses
    final int finalVar = 2; // cannot change

    public Student()  // default constructor
    {
        this.rollnum = 0;
        this.name = "";
        this.grade = 100;
    }

    public Student(String name)  // parameterized constructor
    {
        this.rollnum = 0;
        this.name = name;
        this.grade = 100;
    }


    // generate code

    // getter and setters
    public int getRollnum() {
        return rollnum;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getGradeSum() {
        return gradeSum;
    }

    public static void setGradeSum(int gradeSum) {
        Student.gradeSum = gradeSum;
    }

    public int getPublicVar() {
        return publicVar;
    }

    public void setPublicVar(int publicVar) {
        this.publicVar = publicVar;
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }

    public int getProtectedVar() {
        return protectedVar;
    }

    public void setProtectedVar(int protectedVar) {
        this.protectedVar = protectedVar;
    }

    public int getFinalVar() {
        return finalVar;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // to string

    @Override
    public String toString() {
        return "Student{" +
                "rollnum=" + rollnum +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", publicVar=" + publicVar +
                ", privateVar=" + privateVar +
                ", protectedVar=" + protectedVar +
                ", finalVar=" + finalVar +
                '}';
    }

    // equals hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollnum == student.rollnum && grade == student.grade && publicVar == student.publicVar && privateVar == student.privateVar && protectedVar == student.protectedVar && finalVar == student.finalVar && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollnum, name, grade, publicVar, privateVar, protectedVar, finalVar);
    }


    public void printGrade1()
    {
        System.out.println(name + ": " + grade);
    }

    public static void printGrade2(Student student)   // static constructor will only be called once for class loader
    {
        System.out.println(student.name + ": " + student.grade);
    }

    class InnerClass  // inner class
    {

    }

}


final class SeniorHighStudent extends Student  // final stops further inheritance
{
    public SeniorHighStudent() // constructor for subclass and default superclass will both be called
    {

    }
    public SeniorHighStudent(String name) // constructor for subclass must specify parameterized super constructor
    {
        super(name);
    }

    public void printGrade1() // method override
    {
        System.out.println(name + ": ");
    }

    public final void finalMethod()  // method cannot be overridden
    {
        return;
    }
}

// abstract methods and classes
abstract class abstractClass
{
    // abstract method
    public abstract void abstractmethod();
}

class extension extends abstractClass
{
    public void abstractmethod()
    {
        return;
    }
}
