package sort;

import java.util.*;

/**
 * @author : Gathsara
 * created : 2/10/2026 -- 5:24 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList,
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getFname)
                        .thenComparing(Student::getId));
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}


class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

