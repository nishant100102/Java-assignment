import java.util.Scanner;
public class thrit{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int age= sc.nextInt();
	String sex=sc.next();
	String ms=sc.next();
	if( sex=="m" && age>=20 && age<=40){
		System.out.println("You can work anywhere");
	}
	if( sex=="m" && age>40 && age<=60){
		System.out.println("You can work in urban areas only");
	}
	else{
		System.out.println("ERROR");
	}
		}
}