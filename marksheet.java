package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

	               // Student class marksheet  //

        String name;

        int roll_num;

        int sub1,sub2,sub3,sub4,sub5,per;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your Name: ");
        name=sc.nextLine();

        System.out.println("Enter your Roll no: ");
        roll_num=sc.nextInt();

        System.out.println("Marks in Maths:");
        sub1=sc.nextInt();

        System.out.println("Marks in Science:");
        sub2=sc.nextInt();

        System.out.println("Marks in Hindi:");
        sub3=sc.nextInt();

        System.out.println("Marks in English:");
        sub4=sc.nextInt();

        System.out.println("Marks in Biology:");
        sub5=sc.nextInt();



                //         Percentage of Student Marks    //

        per=((sub1+sub2+sub3+sub4+sub5)*100)/500;

        System.out.println("Your Name Is: "+ name);
        System.out.println("Your Roll no Is; "+ roll_num);
        System.out.println("Percentage of 5 subjects are: "+ %);

    }
}
