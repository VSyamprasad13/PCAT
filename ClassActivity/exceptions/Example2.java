package com.exceptions;

import java.io.IOException;

import javax.imageio.IIOException;

public class Example2 {

	public static void main(String[] args) {
//			try{
//				checkAge(2);
//			}catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
			try {
				readFile();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}

	}
	public static void checkAge(int age) throws ArithmeticException {
		if(age<18)
			throw new ArithmeticException("Under age cannot be processed");
		else System.out.println("Okay");
	}
	public static void readFile()  throws IOException{
		throw new IIOException("file cannot be read");
	}

}
