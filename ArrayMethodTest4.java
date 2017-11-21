/*
	数组的排序：一般都是升序排列，元素，小到大的排列
	
	两种排序的方式
		选择排序：数组中的每个元素都在进行比较
		冒泡排序：数组中相邻元素进行比较
		规则：比较大小，位置交换
*/
public class ArrayMethodTest4{
	public static void main(String[] args){
		
		int[] arr = {45,67,785,660,-2};
		//调用冒泡排序
		bubbleSort(arr);
		//输出
		printArray(arr);
		
		
	}
	/*
		定义方法，实现数组的冒泡排序
		返回值：没有
		参数，数组
	*/
	public static void bubbleSort(int[] arr){
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	
	/*
		定义方法，实现功能
		返回值：void
		方法参数：数组
	*/
	public static void printArray(int[] arr){
		//输出一半的中括号，不要换行打印
		System.out.print("[");
		//数组进行遍历
		for(int i = 0;i < arr.length;i++){
			//判断遍历到的元素，是不是数组的最后一个元素
			//如何判断，循环变量，到达length-1
			if(i == arr.length-1){
				//输出数组元素和]
				System.out.println(arr[i]+"]");
			}else{
			System.out.print(arr[i]+",");
			}
		}
	}
}




