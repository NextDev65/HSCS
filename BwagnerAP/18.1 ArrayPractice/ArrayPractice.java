import java.util.*;

public class ArrayPractice
{
    public void method1()
    {
    	int[] A = new int[5];
    	A[0] = 2;
    	A[1] = 4;
    	A[2] = 6;
    	A[3] = 8;
    	A[4] = 10;
    	// printloop
		for(int spot=0; spot<A.length; spot++)
		{
		     System.out.print(A[spot] + " ");
		}
		System.out.println("\n");
    }

    public void method2()
    {
    	int[] B = {10, 20, 30, 40, 50};
    	// printloop
    	for(int spot=0; spot<B.length; spot++)
		{
		     System.out.print(B[spot] + " ");
		}
		System.out.println("\n");
    }

    public void method3()
    {
    	double[] C = new double[4];
    	C[0] = 5.6;
    	C[1] = 9.9;
    	// printloop
    	for(int spot=0; spot<C.length; spot++)
		{
		     System.out.print(C[spot] + " ");
		}
		System.out.println("\n");
    }

    public void method4()
    {
    	String[] D = new String[3];
    	D[0] = "Dog";
    	D[2] = "Cat";
    	// printloop
    	for(int spot=0; spot<D.length; spot++)
		{
		     System.out.print(D[spot] + " ");
		}
		System.out.println("\n");
    }

    public static void main(String[] args)
    {
       ArrayPractice app = new ArrayPractice();

       app.method1();
       app.method2();
       app.method3();
       app.method4();
    }
}