package testJDBC;

import java.util.Scanner;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        try {
            System.out.println("I am in first try block!!!");

            try {
                arr[6] = 10;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // try or catch only one block will run
//        finally is a keyword and is a block that will definitely run if the code got any exception also some part of code which is 
//        which is inside the finally block should run

	}

}
