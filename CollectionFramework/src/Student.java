import java.util.Objects;


public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private String id;
    private Character grade;
    private char gender;
    private String courseName;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", gender=" + gender +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public Student(String name, String surname, String id, char grade, char gender, String courseName) {
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
        return getGender() == student.getGender() && getName().equals(student.getName()) &&
                getSurname().equals(student.getSurname()) && getId().equals(student.getId()) &&
                getGrade().equals(student.getGrade()) && getCourseName().equals(student.getCourseName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getId(), getGrade(), getGender(), getCourseName());
    }

    @Override
    public int compareTo(Student o) {
        return this.grade.compareTo(o.getGrade());
    }


}
