package day_20210917;

import java.util.Arrays;

public class Average {
	
	
	// 정수를 담고 있는 배열 arr의 평균 값을 return 하는 함수를 만들어라
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		solution(arr);
		
	}
	
	
	static double solution(int[] arr) {
		double result = 0;
		
		int sum = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		result = (double) sum / arr.length;
		System.out.println(sum);
		System.out.println(result);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		return result;
	}
	
	
	
}
