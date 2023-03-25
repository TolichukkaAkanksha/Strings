import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.print("input your string:");
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int vowel=0;
	    int cons=0;
	   
	    String lowerstr=str.toLowerCase();
	    System.out.println(lowerstr);
	    for(int i=0;i<lowerstr.length();i++)
	    {
	        if(lowerstr.charAt(i)=='a'||lowerstr.charAt(i)=='e'||lowerstr.charAt(i)=='i'||lowerstr.charAt(i)=='o'||lowerstr.charAt(i)=='u')
	       vowel++;
	       else
	       cons++;    
	       
	    }
	    System.out.println("the no.of vowels :"+vowel);
	   System.out.println("the no.of consonants :"+cons);
	    
	}
}
