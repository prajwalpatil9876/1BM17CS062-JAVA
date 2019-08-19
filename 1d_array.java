import java.lang.*;
import java.util.*;
class ArraySort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=sc.nextInt();
int a[]=new int [n];
System.out.println("Enter the values:");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int min,temp;
for(int i=0;i<n-1;i++)
{
min=i;
for(int j=i+1;j<n;j++)
{
if(a[j]<a[min])
min=j;
}
temp=a[i];
a[i]=a[min];
a[min]=temp;
}
System.out.println("the sorted array in ascending order is:");
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}