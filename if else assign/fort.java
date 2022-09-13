import java.util.Scanner;
public class fort{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int r=0;
	while(x>0){
		int y=x%10;
		 r=r*10+y;
		  x=x/10;
	}
    System.out.println(r);
		}
}