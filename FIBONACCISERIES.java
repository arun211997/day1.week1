package week1.day1;

public class FIBONACCISERIES {

	public static void main(String[] args) {
		int a=0,b=1;
	    int fibo,i;
	    System.out.println(a);
	    System.out.println(b);
	    for(i=0;i<=10;i++)
	    {
	        fibo=a+b;
	        System.out.println(fibo);
	        a=b;
	        b=fibo;
	    }
	}

}
