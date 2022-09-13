import java.util.Scanner;

public class six{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
 	 if(a>b && a>c){
			if(b>c){
		System.out.println("A is oldest and C is youngest");
       }
	 else{
		System.out.println("A is oldest and B is youngest");
   		}
	}
	if(b>a && b>c){
   	       if(a>c){
		System.out.println("B is oldest and C is youngest");
 		}
	 else{
		System.out.println("B is oldest and A is youngest");
		}
	}
	else{
		if(b>a){
	   System.out.println("C is oldest and a is youngest");
		}
	 else{
	   System.out.println("C is oldest and B is youngest");
		}
	}
		}
}