// Explore labels with break and continue in Java and write a program for the same

package abhay;

public class Assignment2 {
	
	public static void main(String[] args) {
		
		// label with continue
		Work:
		      for(int i=0; i<10; i++){
		          if (i<5){
		             continue Work;
		          }
		          System.out.println("-----"+i );
		       }
		System.out.println();
		
		// label with break
		Break_work:
		 for(int i=0; i<10; i++){
	         if (i==7){
	            break Break_work;
	          }
	          System.out.println("-----"+i );
		 }
	}

}


