import java.util.*;
public class matrix
{
    double a[][]=new double[2][2],det,b[][]=new double[2][2];
    matrix()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
                a[i][j]=0;
            System.out.println("");
        }
    }
    matrix(matrix ob1)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                a[i][j]=in.nextDouble(); 
    }
    void deter()
    {
        det=(a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
   
       
    }
    void print()
    {
        System.out.println("The inverse of the matrix is:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
                System.out.print(b[i][j]);
            System.out.println("");
        }
    }        
    void adj()
    {
        b[0][0]=a[1][1];
        b[0][1]=-a[0][1];
        b[1][0]=-a[1][0];
        b[1][1]=a[0][0];
    }
    void inv()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<0;j++)
                b[i][j]=(b[i][j])/det;
            System.out.println("");
        }
    }
}