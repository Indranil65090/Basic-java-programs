import java.util.Scanner;
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num=sc.nextInt();
        int a[]=new int[num];
        System.out.println("Enter the number of (which should 1 less than the size of the array) elements to be sorted");
        int n=sc.nextInt();

        int temp,i,j;

        System.out.println("Enter the elements of the array:");

        int m=1;
        for(i=1;i<=n;i++) {
            System.out.println("The element at " + m + " position");
            a[i] = sc.nextInt();
            m++;
        }
        for(i=1;i<=n;i++)
        {
            temp=a[i];
            j=i-1;
            while(temp<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
            System.out.println("The array after pass "+i+" is:");
            for(int k=1;k<=n;k++)
            {
                System.out.println(a[k]);
            }
            System.out.println();
        }
        System.out.println("The sorted list is:");
        for (i=1;i<=n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println();
    }
}
