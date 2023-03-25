import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.print("input your string:");
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int count=0;
	    for(int i=0;i<=str.length()-1;i++)
	    {
	        if(str.charAt(i)!=' ')
	        {
	            count++;
	        }
	    }
	    System.out.println("the length of the string is:"+count);
	    
	
	}
}
