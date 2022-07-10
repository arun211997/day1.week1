package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		int num =23;
	    int i;
	    int flag = 0;
	       for(i=2;i<num;i++)
	        {
	            if(num%i==0)
	             {
	                 flag = 0;
	                 break;
	                 
	             }
	            
	             if(num%i!=0)
	             {
	                 flag=1;
	             }
	        }
	      
	       if(flag==1)
	       {
	       System.out.println("prime number");  
	       }
	       else{
	           System.out.println("non prime number");
	       }
	

	}

}
