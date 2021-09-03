package array;

import java.util.Arrays;

public class PassingInFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 5,12,85,45,96};
		System.out.println(Arrays.toString(num));
		change(num);
		System.out.println(Arrays.toString(num));
	}
	static void change(int[] arr) {
		arr[2] = 99;
	}

}