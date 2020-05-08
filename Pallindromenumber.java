import java.util.Scanner;
public class Pallindromenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number from user:");
        int n=sc.nextInt();
        int result=0,temp;
        int a=n;
        while(a!=0)
        {
            temp=a%10;
            result=result*10+temp;
            a/=10;
        }
        if(result==n)
        {
            System.out.println("This number "+n+" is pallindrome");
        }
        else
        {
            System.out.println("This number "+n+" is not pallindrome");
        }
    }
}
