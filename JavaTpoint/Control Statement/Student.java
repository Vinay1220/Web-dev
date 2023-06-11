import java.util.Scanner;
public class Student {  
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt(); 
 int value = 1;
 while(value<=10){
    System.out.println(value*num);
    value++;
    

 }
}  
}  