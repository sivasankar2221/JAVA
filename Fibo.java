import java.util.Scanner;
class Fibo{
public static void main(String[]args){
 int n,a=0,b=1,c=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");	
n=s.nextInt();
System.out.println("Fibonacciseries of " +n+ "number is");
for(int i=0;i<=n;i++)
 {
   a=b;
   b=c;
   c=a+b;
System.out.println(a+" ");
 }
}
}
