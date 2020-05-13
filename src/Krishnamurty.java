import java.util.Scanner;
public class Krishnamurty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number from user:");
        int n=sc.nextInt();
        int sum=0;
        int m=n;
        while (n!=0)
        {
            int c=n%10;
            int fact=1;
            for (int i=c;i>=1;i--)
            {
                fact=fact*i;
            }
            n/=10;
            sum+=fact;
        }
        if(sum==m)
        {
            System.out.println("The number "+m+" is Krishnamurty number");
        }
        else
        {
            System.out.println("The number "+m+" isn't Krishnamurty number");
        }
    }
}
