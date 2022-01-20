package abhay;
/*
	MODEL
	
	VIEW
	
	CONTROLLER
		Logical Operations
			1. Operators for Computation
			2. if/else and switch case for decision making
			3. loops for iterations
			
			PS: For Controller, MODEL will be data provider
*/

public class operators {

public static void main(String[] args) {
	
	// Operators
	// 1. Arithmetic Operators
	// +, -, *, /, %
	
	double amount = 3565.55;
	double tax = 0.18;
	double total = amount + (tax*amount);
	System.out.println("Total to Pay: \u20b9"+total);
	
	int number = 10;
	int buckets = 3;
	int hashCode = number % buckets; // you will always get just -> 0 1 or 2 
	System.out.println("HashCode for number "+number+" with bucket size of "+buckets+" is: "+hashCode);
	
	// 2. Assignment Operators
	// =  +=, -=, *=, /=, %=
	int eWallet = 500; // assign operator to assign the value
	int myWallet = eWallet; // Value Copy Operation | Copy form Variable to Variable :)
	
	//eWallet = eWallet + 100;
	eWallet += 100; // short hand expression
	System.out.println("eWallet is: "+eWallet);
	
	eWallet %= 7; // eWallet = eWallet % 7; -> eWallet = 600 % 7;
	System.out.println("eWallet now is: "+eWallet);
	
	// 3. Increment and Decrement operators
	// ++ and --
	// ++ increments by 1
	// -- decrements by 1
	int quantity = 1;
	
	quantity++; // postfix
	++quantity; // prefix
	++quantity;
	
	quantity--;
	
	System.out.println("Quantity is: "+quantity); // 3
	
	System.out.println();
	
	//int value = quantity++; // copy the value first and update quantity later i.e. the last copy of data
	int value = ++quantity; // update quantity and copy the data into value i.e. the latest data
	System.out.println("value is: "+value);
	System.out.println("quantity is: "+quantity);
	
	eWallet = 300;
	
	// 4. Conditional or Relational
	// >, <, >=, <=, ==, !=
	int cabFare = 300;
	System.out.println("Can i book a Cab? "+(eWallet >= cabFare));
	
	int promoCode = 101;
	int promoCodeByUser = 201;
	
	System.out.println("Can i get a Dicsount? "+(promoCode == promoCodeByUser));
	
	// 5. Logical Operators
	// &&, ||, !
	System.out.println("Can i book can and get discount? "+ ( (eWallet >= cabFare) && (promoCode == promoCodeByUser) ) );
	
	boolean isGPSEnabled = true;
	System.out.println("Is GPS Enabled: "+isGPSEnabled);
	System.out.println("Is GPS Not Enabled: "+!isGPSEnabled);
	
    System.out.println();
    System.out.println();
	// 5. Bitwise Operators
			//    &, |, ^
			int num1 = 8;				// 1 0 0 0
			int num2 = 10;				// 1 0 1 0
			
			int result1 = num1 & num2;	// 1 0 0 0 -> 8	
			int result2 = num1 | num2;	// 1 0 1 0 -> 10 	
			int result3 = num1 ^ num2;	// 0 0 1 0 -> 2
			
			System.out.println("result1 is: "+result1);
			System.out.println("result2 is: "+result2);
			System.out.println("result3 is: "+result3);
			
			// SE: Where and all we can implement bitwise operators :)
			
			// 6. Shift Operators
			// >>, <<, >>>
			
			int x = 8; // data
			int y = 3; // key
			int z = x >> y; // x / 2powery    8 / 2power3
			System.out.println("z rt shift is: "+z);
			
			z = x << y;  // x * 2powery   8 * 2power3
			System.out.println("z lt shift is: "+z);
			
			int result = z >> y;
			System.out.println("Result is: "+result);
			
			// 8 >> 3
			// 0 0 0 0  1 0 0 0
			// >> 3
			// _ _ _ 0  0 0 0 1
			// 0 0 0 0  0 0 0 1  -> 1
			
			// 8 << 3
			// 0 0 0 0  1 0 0 0
			// << 3
			// 0 1 0 0  0 _ _ _
			// 0 1 0 0  0 0 0 0  -> 64
			
			x = -11;
			y = 2;
			z = x >> y;
			System.out.println("z now is: "+z);
			
			// 0 0 0 0 	1 0 1 1
			// 1 1 1 1  0 1 0 0
			//				+ 1
			// 1 1 1 1  0 1 0 1 -> -11
			// >> 2
			// _ _ 1 1  1 1 0 1
			// 1 1 1 1  1 1 0 1
			// 0 0 0 0  0 0 1 0
			//				+ 1
			// 0 0 0 0  0 0 1 1 -> -3
			
			// SE: see of you can do it with other methods :)
			//     work with right shift for negative numbers
			
			
			// 7. Ternary Operator
			String name = "John Watson";
			 eWallet =  300;
			 cabFare = 500;
			
			
			String message = (eWallet > cabFare) ? "Cab Booked" : "Please recharge your wallet";
			System.out.println("message is: "+message);
}

}
