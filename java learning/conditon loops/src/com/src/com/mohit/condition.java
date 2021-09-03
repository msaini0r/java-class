package com.mohit;
public class condition{

/*

	syntax of IF statement

			if(bollean expression T or F){
	body
	} else{
				//do this
	}
*/

//	public static void main(String[] args) {
//	int salary = 19550;
//	if(salary > 20000){
//	salary = salary +2000;
//	} else {
//	salary = salary +1000;
//	}
//	System.out.println(salary);
//
//	}
//	}

// syntax of Multiple __IF-else statements

	public static void main(String[] args) {
		int salary = 22000;
		if(salary > 10000){
			salary += 2000;
		} else if (salary > 20000){
			salary +=3000;
		} else {
			salary += 500;
		}
		System.out.println(salary);

	}
}




