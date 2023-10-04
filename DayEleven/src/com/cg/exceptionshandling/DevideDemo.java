package com.cg.exceptionshandling;
import java.util.Scanner;
public class DevideDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sobjr = new Scanner(System.in);
			try {
			System.out.println("Enter first Number");
			int a=sobjr.nextInt();
			System.out.println("Enter Second Number");
			int b=sobjr.nextInt();
			Devide.divideNumber(a, b);
			System.out.println("after the Divide method");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("catch block is end");
			}

		}


}
