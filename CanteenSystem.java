package com.codegnan.controlstatements;

import java.util.Scanner;

public class CanteenSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int teaPrice = 10, cofeePrice = 15, samosaPrice = 20;
		int teaQty = 0, coffeQty = 0, samosaQty = 0;
		int choice;
		double taxRate = 0.05;
		do {
			System.out.println("||========== Canteen Menu ===================||");
			System.out.println("||============= 1. View Menu=================||");
			System.out.println("||============= 2. Order Items===============||");
			System.out.println("||============= 3. View Bill ================||");
			System.out.println("||=============4. CheckOut and Exit==========||");
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("-------- MENU------------");
				System.out.println("1. Tea - $ " + teaPrice);
				System.out.println("2. Coffe - $ " + cofeePrice);
				System.out.println("3. Samosa - $ " + samosaPrice);
				break;
			case 2:
				System.out.println("Enter Item Number to Order (1-3)");
				int item = scanner.nextInt();
				System.out.println("Enter Quantity");
				int qty = scanner.nextInt();
				if (qty <= 0) {
					System.out.println("Quantity Must GreaterThan 0");
					break;
				}
				switch (item) {
				case 1:
					teaQty += qty;
					System.out.println(qty + " Tea(s) Added");
					break;
				case 2:
					coffeQty += qty;
					System.out.println(qty + " Coffe(s) Added");
					break;
				case 3:
					samosaQty += qty;
					System.out.println(qty + " Samosa(s) Added");
					break;
				default:
					System.out.println("Invalid Item Number. please Chhose between 1 to 3");
					break;
				}
				break;
			case 3:
				int teaTotal = teaQty * teaPrice;// tea total price
				int cofeeTotal = coffeQty * cofeePrice;// coffe total proce
				int samosaTotal = samosaQty * samosaPrice;// samosa totalproice
				int subTotal = teaTotal + cofeeTotal + samosaTotal;// subtotal like all item prices.
				double tax = subTotal * taxRate;// tax rate on subtotal
				double grandTotal = subTotal + tax;// grandtotal means subtotal+ tax.
				System.out.println("=========== BILL ================");
				if (teaQty > 0) {
					System.out.println("Tea x " + teaQty + "=$ " + teaTotal);
				}
				if (coffeQty > 0) {
					System.out.println("Coffe x " + coffeQty + "=$ " + cofeeTotal);
				}
				if (samosaQty > 0) {
					System.out.println("Samosa x " + samosaQty + "=$ " + samosaTotal);
				}
				if (subTotal == 0) {
					System.out.println("No Items Orderd Yet");
				} else {
					System.out.println("SubTotal = " + subTotal);
					System.out.println("Tax(5%) = " + tax);
					System.out.println("Grand Total = " + grandTotal);
				}
				break;
			case 4:
				System.out.println("Thank You!. Existing System");
				break;
			default:
				System.out.println("Invalid Choice. Please Enter A number 1 to 4");
				break;
			}
		} while (choice != 4);
		scanner.close();

	}

}
