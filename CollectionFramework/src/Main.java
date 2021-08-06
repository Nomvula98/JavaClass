import java.util.*;

public class Main {
    public static void main(String[] args) {
// I have chosen to use LinkedHasSet data structure because:
        //1. It does not allow duplicates
        //2. I can delete an object that is in any position

        LinkedHashSet<Student> ls = new LinkedHashSet<Student>();

        //Creating students
       Student student1 = new Student("Nomvula", "Skosana", "555000", 'A', 'F', "IT");
       Student student2 = new Student("Portia", "Klark", "222000", 'B', 'F', "Web dev");
       Student student3 = new Student("Linda", "Mahlangu", "333000", 'D', 'M', "Analyst");
       Student student4 = new Student("Kilo", "Beith", "444000", 'C', 'M', "BA");
       Student student5 = new Student("Bella", "Creg", "111000", 'A', 'F', "SA");

        //Adding student to a hash table
        ls.add(student1);
        ls.add(student2);
        ls.add(student3);
        ls.add(student4);
        ls.add(student5);
        System.out.println("----------------------Printing all students------------------------\n");

        //List all Students
        Iterator<Student> itr= ls.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        //Removing student3
        ls.remove(student3);

        System.out.println("\n-------------------Printing remaining students after removing one---------------\n");
        Iterator<Student> itr2= ls.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        //I have chosen to use TreeSet here because:
        //1. I can sort according to any field that I want, in this case, the grade
        //2. I can find the greatest or lowest element in the set
        System.out.println("\n-------------------Sorted According to Grade--------------------\n");
        TreeSet<Student> ts=new TreeSet<Student>();
        ts.add(student1);
        ts.add(student2);
        ts.add(student3);
        ts.add(student4);
        ts.add(student5);

        Iterator<Student> itr3= ts.iterator();

        while(itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        System.out.println("\n-------------------Printing student with Grade 'B'-------------------\n");
        Iterator<Student> itr4= ts.iterator();

        while(itr4.hasNext()) {
            Student next = itr4.next();
            if ((next.getGrade().equals('B'))){
                System.out.println(next);
            }
        }
    }
}
