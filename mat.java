import java.util.*;
class mat
{
 public static void main(String args[])
  {int i,j;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of array 1 :");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int arr1[][]=new int [a][b];
   System.out.println("Enter the elements of array 1:");
   for(i=0;i<a;i++)
    {
      for(j=0;j<b;j++)
      arr1[i][j]=sc.nextInt();
    }
   int arr2[][]=new int[a][b];
   System.out.println("Enter the elements of array 2:");
   for(i=0;i<a;i++)
   {
    for(j=0;j<b;j++)
    arr2[i][j]=sc.nextInt();
   }
  int c[][]=new int[a][b];
  int d[][]=new int[a][b]; 
   System.out.println("Sum of elements of array1 and array2 :");
   for(i=0;i<a;i++)
    {
    for(j=0;j<b;j++)
    { 
     c[i][j]=arr1[i][j]+arr2[i][j];
    System.out.println(c[i][j]);
    }}
   System.out.println("Difference of elements of array1 and array2:");
   for(i=0;i<a;i++)
   {
    for (j=0;j<b;j++)
    {
     d[i][j]=arr1[i][j]-arr2[i][j];
     System.out.println(d[i][j]);
    }
}
}
}
