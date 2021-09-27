package arrayQ;

import java.util.Arrays;
import java.util.Scanner;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		arr[0] = 45;
		arr[1] = 82;
		arr[2] = 76;
		arr[3] = 19;
		arr[4] = 02;	

		        /*
		        syntax of Array
		        datatype[] variable_name=new datatype[size];
		        store 5 number
		        ARRAY objects in java may not be continues , it can be contious in c++ or c.
		        so it totally depends on IDE(jvm) whether Array should be continous or not.
		        however array it self means it should be continuos.

		         */

		
//		different way to print array
// for(int i = 0 ; i<arr.length;i++) {
//	 System.out.println(arr[i]);
//		}	
		System.out.println(Arrays.toString(arr));
		
//		dfferent case
//		        String[] arr = new String[4];
//		        System.out.println(arr[0]);
		    }
		}

