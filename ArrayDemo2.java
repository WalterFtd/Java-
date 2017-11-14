/*
	1.数组遍历
	2.数组越界和空指针异常
*/
public class ArrayDemo2{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		System.out.println(arr[7]);//ArrayIndexOutOfBoundsException: 7
		
		arr = null;
		System.out.println(arr[1]);//ArrayIndexOutOfBoundsException: 7
		
	}
}