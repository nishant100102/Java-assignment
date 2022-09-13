import java.util.Scanner;

public class four{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int salary=sc.nextInt();
	int years=sc.nextInt();
	if(years>=5){
	double net_salary=salary+0.05*salary;
	System.out.println("New salary is:"+net_salary);
	}
	else{
	System.out.println("You still earn:"+salary);
	}
		}
}