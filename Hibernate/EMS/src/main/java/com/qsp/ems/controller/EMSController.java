package com.qsp.ems.controller;

import java.util.Scanner;

public class EMSController {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			
			
			System.out.println("ENTER Y TO CONTINUE ...");
		}
		while("y".equalsIgnoreCase(scanner.next()));
		
		scanner.close();
	}

}
