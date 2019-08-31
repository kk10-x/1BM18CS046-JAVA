import java.util.*;
public class matrixdemo
{
    public static void main(String args[])
    {
        matrix ob=new matrix();
        matrix ob1=new matrix(ob);
        ob1.deter();
        ob1.adj();
        ob1.inv();
        ob1.print();
    }
}
        