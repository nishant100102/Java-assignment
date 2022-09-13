import java.util.Scanner;
public class eleven{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	int cl=ch;
	if(cl>=65 && cl<=90){
	System.out.println("Uppercase");
	}
	else{
	System.out.println("Lowercase");
	}
		}
} 