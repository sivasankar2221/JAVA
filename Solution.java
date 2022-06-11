import java .util.Scanner;
public class Solution{
private static final Scanner sc=new Scanner(System.in);
   public static void main(String[] args){
       int N = sc.nextInt();
    if(N%2==1)
      {
          System.out.println("true");
        }
  else
      {
         if(N>=2&&N<=5)
            {
             System.out.println("not true");
            }
         else if(N<=20) 
             {
              System.out.println("ok");
               }
           else
            {
             System.out.println("not true");
             }
}
}
}