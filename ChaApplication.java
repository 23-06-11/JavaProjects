package com;

import java.util.Scanner;

public class ChaApplication {

	public static void main(String[] args) {
		float numcups;
		Scanner input = new Scanner(System.in);
		numcups=input.nextFloat();
		float neer=1.5f*numcups;
		float chatapodi=1.5f*numcups;
		float per=0.5f*numcups;
		float sakkare=1f*numcups;
		System.out.println(neer+" Lote neer padle");
		System.out.println(chatapodi+" Chamcha chatapodi padle");
		System.out.println(per+" Lote per padle");
		System.out.println(sakkare+" Chamcha sakkare padle");
		

	}

}
