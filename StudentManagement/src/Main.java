import java.util.*;

public class Main {
    public static void main(String[] args) {
// I have chosen to use LinkedHasSet data structure because:
        //1. It does not allow duplicates
        //2. I can delete an object that is in any position

        LinkedHashSet<Student> ls = new LinkedHashSet<Student>();

        //Creating students
       Student student1 = new Student("Nomvula", "Skosana", 4, 'A', 'F', "IT");
       Student student2 = new Student("Portia", "Klark", 2, 'B', 'F', "Web dev");
       Student student3 = new Student("Linda", "Mahlangu", 5, 'D', 'M', "Analyst");
       Student student4 = new Student("Kilo", "Beith", 1, 'C', 'M', "BA");
       Student student5 = new Student("Bella", "Creg", 6, 'A', 'F', "SA");

        //Adding student to a hash table
        ls.add(student1);
        ls.add(student2);
        ls.add(student3);
        ls.add(student4);
        ls.add(student5);

        //Print all objects
        student1.printAll(ls);

        //Removing student3
        ls.remove(student3);

        //Print remaining objects after deleting one
        student1.printRemaining(ls);

        //I have chosen to use TreeSet here because:
        //1. I can sort according to any field that I want, in this case, the grade
        //2. I can find the greatest or lowest element in the set
        //3. I can find the highest grade
        System.out.println("\n-------------------Sort According to Grade--------------------\n");
        TreeSet<Student> ts=new TreeSet<Student>();
        ts.addAll(ls);
        ts.add(student3);

        Iterator<Student> itr3= ts.iterator();

        while(itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        //Sorting with grade
        student1.sortWithGrade(ts);

        //Saving file as 'Proof of registration'
        student1.saveToFile(student1);

    }
}
