import java.util.Scanner;

public class five{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int marks=sc.nextInt();
	if(marks>80){
	System.out.println("A");
	}
	if(marks>60 && marks<=80){
	System.out.println("B");
	}
	if(marks>50 && marks<=60){
	System.out.println("C");
	}
	if(marks>45 && marks<=50){
	System.out.println("D");
	}
	if(marks>25 && marks<=45){
	System.out.println("E");
	}
	if(marks<25){
	System.out.println("F");
	}
		}
}