package testJDBC;

import java.util.Scanner;

public class ThrowThrowsKeyWords {
	public static void divisiondemo(int dividend, int divisor) throws ArithmeticException {
        System.out.println("The result is : " + dividend / divisor);
    }

    public static void main(String[] args) {
        divisiondemo(10, 0);
    }

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age < 18) {
//            throw new RuntimeException("Sorry You can't vote!!!");
//        } else {
//            System.out.println("You are eligible to vote!!!!");
//        } this about throw keyword where we just throw the exception
//        using throws keyword to a function it tells that which running it it may raise an exception just as 
//        giving hint about the throwing an exception while an exception

//	}

}
