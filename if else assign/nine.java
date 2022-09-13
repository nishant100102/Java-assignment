import java.util.Scanner;

public class nine{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int held=sc.nextInt();
	int attend=sc.nextInt();
	String medical=sc.next();
	double percentage=(attend/held)*100;
	if(percentage>=75 || medical=="y"){
	System.out.println("You can sit in exam");
	}
	else{
	System.out.println("You cannot sit in exam");
	}
		}
}