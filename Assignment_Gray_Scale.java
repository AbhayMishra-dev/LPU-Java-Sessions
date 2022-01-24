package abhay;

import java.util.*;

public class Assignment_Gray_Scale {
	public static void main(String []args){
		int grayScale=0;
		int sum=0;

		Scanner scanner = new Scanner(System.in);
		int[][][] image= new int[3][3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter Pixcel"+(j+1));
				for (int k = 0; k < 3; k++) {
					image[i][j][k]=scanner.nextInt();
					sum+=image[i][j][k];
				}
				grayScale=sum/3;
				sum=0;
				for (int k = 0; k < 3 ; k++) {
					image[i][j][k]=grayScale;
				}
				grayScale=0;
			}
		}


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[");
				for (int k = 0; k < 3; k++) {
					System.out.print(+image[i][j][k]+",");
				}
				System.out.print("] ");
			}
			System.out.println(" "+i);
		}
		scanner.close();

	}
}



