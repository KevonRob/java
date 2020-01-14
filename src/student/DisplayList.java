package student;

import java.util.Scanner;

public class DisplayList {

    public static void main(String[] args) {
        Student[] s = new Student[5];
        Scanner input = new Scanner(System.in);
    
        for (int i=0; i<s.length; i++)
    {
        s[i] = new Student();
        System.out.println("Enter id " + (i+1));
        s[i].setId(input.nextInt());
        
       System.out.println("Enter name " + (i+1));
        s[i].setName(input.nextLine());
        
        System.out.println("Enter age " + (i+1));
        s[i].setAge(input.nextInt());
    }

    }
}
