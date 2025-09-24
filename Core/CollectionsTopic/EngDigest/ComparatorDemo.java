package Core.CollectionTopic.EngDigest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    The core idea is to do substraction/comparison such that the result is always negative, else if positive it will be swapped
    NEGATIVE: → means o1 < o2 → leave as is

    POSITIVE: → means o1 > o2 → swap

    ZERO: → no change (equal)
* */

// implement class and override compare method
class StringLenghtComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

class DescendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // if o1 > o2, then o1 comes first, which means in ascending: o1 - o2
        // if o1 < o2, then o2 comes first, which means in descending: o2 - o1
        return o2 - o1;
    }
}


// Main class to demonstrate custom sorting using Comparator
// This class contains examples of sorting lists of integers and strings, as well as a more complex
public class ComparatorDemo {
    public static void main(String[] args) {

        // custom sorting: what if I wish to have a proper descending order
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(new DescendingComparator());
        System.out.println("sorting list: " + list);

        // custom sorting: what if I want to sort by the length of characters present instead of lexi.
        List<String> words = Arrays.asList("ban", "apple", "date");
        words.sort(new StringLenghtComparator());
        System.out.println("sorting words: " + words);

        // custom sorting: what if I want to sort in desc order :: lambda expression
        List<String> wordsList2 = Arrays.asList("banana", "apple", "date");
        wordsList2.sort((a, b) -> b.length() - a.length());

        System.out.println("sorting wordsList2: " + wordsList2);


        // ! an example of more complex sorting based on multiple criteria
        // ? Here we sort students by GPA in descending order

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 9.2));
        students.add(new Student("Bob", 8.5));
        students.add(new Student("Charlie", 9.1));

        students.sort((o1, o2) -> {
            if (o2.getGPA() - o1.getGPA() > 0) {
                return 1;
            } else if (o2.getGPA() - o1.getGPA() < 0) {
                return -1;
            } else {
                return 0;
            }
        });

        for (Student s : students) {
            System.out.println(s.getName() + " - " + s.getGPA());
        }

        // ? If two students have the same GPA, we sort them by name in ascending order :: using java 8 and method reference (:: operator)
        // ? students.sort(Comparator.comparing(Student::getGPA).thenComparing(Student::getName));
        Comparator<Student> studentComparator = Comparator.comparing(Student::getGPA).reversed().thenComparing(Student::getName);
        students.sort(studentComparator);
        System.out.println(" ➡️ Sorted students by GPA and name:");
        for (Student s : students) {
            System.out.println(s.getName() + " - " + s.getGPA());
        }
    }
}

class Student {
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }
}