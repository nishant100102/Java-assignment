import java.util.Scanner;

public class three{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
   int qty=sc.nextInt();
	int price=100*qty;
	if(price>=1000){
	double SP=price-0.1*price;
	System.out.println("Final price:"+SP);
	}
	else{
	System.out.println("Pay:"+price);
	}
		}
}