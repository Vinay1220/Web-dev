
import java.util.Scanner;
  class Solution{ 
  public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int a =1;
   int b =1;
   int c ;
   int n = sc.nextInt();
 for(int i =3 ;i<=n;i++){
   c = a+b;
   a= b;
   b= c;
}
System.out.println(b);
}
}