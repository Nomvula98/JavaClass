import java.io.*;
import java.util.*;


public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int id;
    private Character grade;
    private char gender;
    private String courseName;
    private String email;
    private String cellNo;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                ", gender=" + gender +
                ", courseName='" + courseName + '\'' +
                ", email='" + email + '\'' +
                ", cellNo='" + cellNo + '\'' +
                '}';
    }

    public Student(String name, String surname, int id, Character grade, char gender, String courseName) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grade = grade;
        this.gender = gender;
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && gender == student.gender && name.equals(student.name) && surname.equals(student.surname) && getGrade().equals(student.getGrade()) && courseName.equals(student.courseName) && getEmail().equals(student.getEmail()) && getCellNo().equals(student.getCellNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, getGrade(), gender, courseName, getEmail(), getCellNo());
    }

    @Override
    public int compareTo(Student o) {
        return this.grade.compareTo(o.getGrade());
    }

    public void printAll(LinkedHashSet ls){
        System.out.println("----------------------Printing all students------------------------\n");

        //List all Students
        Iterator<Student> itr= ls.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    public void printRemaining(LinkedHashSet ls){
        System.out.println("\n-------------------Printing remaining students after removing one---------------\n");
        Iterator<Student> itr2= ls.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
    public void sortWithGrade(TreeSet ts){
        System.out.println("\n-------------------Printing student with Grade 'B'-------------------\n");
        Iterator<Student> itr4= ts.iterator();

        while(itr4.hasNext()) {
            Student next = itr4.next();
            if ((next.getGrade().equals('B'))){
                System.out.println(next);
            }
        }
    }
    public void saveToFile(Student o){
        try
        {
            File file = new File("Proof of registration.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            String s = o.toString();

            printWriter.write(s);
            printWriter.flush();
            fileOutputStream.close();
            fileOutputStream.close();
            System.out.println("Output Written to file");
        }

        catch(IOException ex)
        {
            ex.printStackTrace();
        }

    }
    }

