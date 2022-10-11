import java.util.Scanner;  

public class try1{
   
    public static void main(String[] args){
    int i,j,k;
    Scanner scanner = new Scanner(System.in);
    System.out.print(" enter the value n: ");  
    int n= scanner.nextInt();  
    
    	for(i=n;i>0;i--)
    {
	    for(j=n;j>=i;j--){
            System.out.print("*");
	    }
       	System.out.println(" ");
	}
  
   for(i=0;i<n*2;i++)
    System.out.print("-");
System.out.println("");
   
   	  
    for(i=0;i<n;i++)
    {
	    for(j=0;j<n-i;j++){
            System.out.print("*");
	    }
		                System.out.println("");
        	}
    }
} 