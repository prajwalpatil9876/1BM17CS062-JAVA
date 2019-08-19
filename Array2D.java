import java.util.Scanner;
class Array2D
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a[][]=new int[3][3];
int i=0,j=0;
while(i<a.length)
{
j=0;
while(j<a[0].length)
{
System.out.print("Enter value : ");
a[i][j++]=in.nextInt();
}
i++;
}
for(int arr[] : a)
{
for(int val : arr)
{
System.out.print(val+" ");
}
System.out.println();
}
}
}