package org.task;
import java.util.*;
import java.util.Map.Entry;

public class Vending {
	public static void main(String[] args) {
		int balance =0;
		int balance1=0;
		char choice;
	System.out.println("\t\tProducts Available");
	Map<String, Integer> products = new LinkedHashMap<>();
	products.put("Coke", 20);
	products.put("Pepsi", 20);
	products.put("Pannersoda", 10);
	products.put("Appyfizz", 30);
	
	System.out.println(products);
	
	Scanner s =new Scanner(System.in);
	System.out.println("\nEnter the Amount:");
	int amount = s.nextInt();
    if (amount<10) {
    	System.err.println("\nAmount not sufficient");
	}else {
		System.out.println("\nProducts under your Amount");
		Set<Entry<String , Integer>> entryset = products.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue()<=amount) {
				System.out.println(entry);
			}
		}
		System.out.println("\nChoose the Product");
		String prod = s.next();
		
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getKey().equalsIgnoreCase(prod)) {
				System.out.println("\n"+entry.getKey()+" is purchased for Rs."+entry.getValue());
				
				balance=amount-products.get(entry.getKey());
				System.out.println("\nYour remaining Amount:"+balance);
			}
		}
		if (balance>=10) {
			System.out.println("\nContinue Shopping");
				System.out.print("Enter Y for yes or N for no: ");
				 choice = s.next().charAt(0);
				if (choice=='y'||choice=='Y') {
					System.out.println("\nProducts under your Amount");
					Set<Entry<String , Integer>> entryset1 = products.entrySet();
					for (Entry<String, Integer> entry : entryset) {
						if (entry.getValue()<=balance) {
							System.out.println(entry);
						}
					}
					System.out.println("\nChoose the Product");
					String prod1 = s.next();
					for (Entry<String, Integer> entry : entryset1) {
						if (entry.getKey().equalsIgnoreCase(prod1)) {
							System.out.println("\n"+entry.getKey()+" is purchased for Rs."+entry.getValue());
							
							balance1=balance-products.get(entry.getKey());
							System.out.println("\nYour remaining Amount:"+balance1);
							System.out.println("\nThanks for shopping");
						}
					}
				}else if (choice=='n'||choice=='N') {
					System.out.println("\nThanks for shopping");
				}
		}else {
			System.out.println("\nThanks for shopping");
		}
	}
	}
}