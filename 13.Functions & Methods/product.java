import java.util.*;
public class product{
	public static int prod(int num1, int num2){
		return num1*num2;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value of a : ");
		int a = sc.nextInt();
		System.out.print("enter value of b : ");
		int b = sc.nextInt();
		int answer = prod(a,b);
		System.out.println("the final product is : "+ answer);

	}
}
