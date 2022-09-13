import java.util.Scanner;

public class eight{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int held=sc.nextInt();
	int attend=sc.nextInt();
	int percentage=(attend/held)*100;
	if(percentage>=75){
	System.out.println("You can sit in exam");
	}
	else{
	System.out.println("You cannot sit in exam");
	}
		}
}