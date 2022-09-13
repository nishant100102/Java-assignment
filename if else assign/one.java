import java.util.Scanner;
public class one{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
	int breadth=sc.nextInt();
	if(length==breadth){
		System.out.println("The given figure is sqaure");
 	}
   else{
		System.out.println("No");
	}
		}
}