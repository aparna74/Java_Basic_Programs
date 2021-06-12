import java.util.Scanner;

public class Add {

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int num1=0,num2=0;
        System.out.println("enter integer numbers to add");
        if(sc.hasNextInt())
            num1 =sc.nextInt();
         if(sc.hasNextInt())   num2=sc.nextInt();
         sc.close();
         System.out.println(num1+num2+" ");


    }
}
