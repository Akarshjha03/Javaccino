import java.util.*;

public class practice1{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        String name = sc.nextLine();
        int roll = sc.nextInt();
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        
        int n = (marks1+marks2+marks3)/3;
        
        System.out.println("Average marks of " + name + " is: " + n);
        sc.close();
    }
}
