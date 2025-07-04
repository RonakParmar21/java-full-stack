/*
DEFINITION :-
--------------
create a class name student with 4 fields and add parameterized constructor and methods.
create two objects with different parameter.
*/

package HW01Constructors;

import java.util.Scanner;

public class HW01Student {

    static Scanner sc = new Scanner(System.in);

    int rollNo;
    String name;
    long phoneNo;
    int standard;

    HW01Student(int rollNo, String name, long phoneNo, int standard) {
        this.rollNo = rollNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.standard = standard;
    }

    public static void main(String[] args) {
        System.out.print("How much student do you want to add : ");
        int studentCount = sc.nextInt();
        for (int i = 0; i < studentCount; i++) {
            int studentRollNo = studentRollNo();
            String studentName = studentName();
            long studentPhoneNO = studentPhoneNo();
            int studentStandard = studentStandard();

            HW01Student hw01Student1 = new HW01Student(studentRollNo, studentName, studentPhoneNO, studentStandard);

            hw01Student1.studentDetails(hw01Student1);
        }
    }

    public static int studentRollNo() {
        System.out.print("Enter Student Roll NO : ");
        return sc.nextInt();
    }

    public static String studentName() {
        System.out.print("Enter Student Name : ");
        return sc.next();
    }

    public static long studentPhoneNo() {
        System.out.print("Enter Student Phone No. : ");
        return sc.nextLong();
    }

    public static int studentStandard() {
        System.out.print("Enter Student Standard : ");
        return sc.nextInt();
    }

    public void studentDetails(HW01Student hw01Student) {
        System.out.println(hw01Student.rollNo);
        System.out.println(hw01Student.name);
        System.out.println(hw01Student.phoneNo);
        System.out.println(hw01Student.standard);
    }
}
