/*
 *  Created by IntelliJ IDEA.
 *  User: Tavishi123-singh
 */
package Lab1;

import java.util.HashSet;
import java.util.Iterator;

public class MyCode {
    static class Employee {
        String name;
        double salary;
        double experience;

        public Employee(String name, double salary, double experience) {
            this.name = name;
            this.salary = salary;
            this.experience = experience;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", experience=" + experience +
                    '}';
        }
    }

    static class Student {
        String name;
        long rollNo;
        double cpi;

        public Student(String name, long rollNo, double cpi) {
            this.name = name;
            this.rollNo = rollNo;
            this.cpi = cpi;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNo=" + rollNo +
                    ", cpi=" + cpi +
                    '}';
        }
    }

    static void searchNo(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("No. Found At Index : " + i);
            }
        }
    }


    static void duplicateEle(int[] arr) {
        System.out.println("Duplicated Elements of Array are : ");
        HashSet<Integer> dup = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c = c + 1;
                    if (c >= 2) {
                        break;
                    }
                }
            }
            if (c > 1) {
                dup.add(arr[i]);
            }
        }
        Iterator<Integer> itr = dup.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }


    public static void SortArrEmployee(Employee[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].salary > arr[j + 1].salary) {
                    Employee temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void SortArrStudent(Student[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].rollNo > arr[j + 1].rollNo) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        //Q1
        System.out.println("Question 1:");
        int[] arr = {1, 2, 3, 40, 4, 50, 3, 20, 2, 30};
        //Scanner sc = new Scanner(System.in);
        int n = 3;
        System.out.println("Searching For:"+ n);
        searchNo(arr, n);

        //Q2
        System.out.println("Question 2:");
        duplicateEle(arr);

        //Q3
        System.out.println("Question 3:");
        Employee[] employees = {new Employee("Tavishi", 50000, 9), new Employee("Tavi", 40000, 1), new Employee("Jay", 10000, 0)};
        System.out.println("Sorted Array--->");
        SortArrEmployee(employees);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        //Q4
        System.out.println("Question 4:");
        Student[] students = {new Student("Tavishi", 123, 8), new Student("Tavi", 456, 9), new Student("Rohit", 567, 3)};
        System.out.println("Sorted Array---->");
        SortArrStudent(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
