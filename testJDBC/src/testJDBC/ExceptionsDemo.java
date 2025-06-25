package testJDBC;
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dividend=sc.nextInt();
		int divisor=sc.nextInt();
		int arr[]=new int[5];
//		arr[6]=10/0;  //here we will get two exceptions indexoutofboundexception and arithmaric exception also
		try {
//		int result=dividend/divisor;
//		System.out.println("your answer is : "+result);
		arr[6]=10/0;
		}
//		catch(ArithmeticException e) {
////			System.out.println(e.getMessage()); this is already existed method in exception class
//			System.out.println("Divisor can't be 0!");//this is our own prompt for the exception when it arises
//		}//only this arithmatic exception is running and stopped there because of this exception
////		so for this we will combine both the exceptions 
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());// we can combine multiple exceptions in a single catch block
		}

	}

}
