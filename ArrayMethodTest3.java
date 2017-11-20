/*
	数组的排序：一般都是升序排列，元素，小到大的排列
	
	两种排序的方式
		选择排序：数组中的每个元素都在进行比较
		冒泡排序：数组中相邻元素进行比较
		规则：比较大小，位置交换
*/
public class ArrayMethodTest3{
	public static void main(String[] args){
		
		int[] arr = {45,67,785,660,-2};
		selectSort(arr);
		printArray(arr);
		
	}
	/*
		定义方法，实现数组的选择排序
		返回值：没有
		参数：数组
		实现步骤：
			1.嵌套循环实现排序
			  外循环，控制的是一共比较了几次
			  内循环，控制的是每次比较了多少个元素
			2.判断元素的大小值
			  小值，存储到小的索引
	*/
	public static void selectSort(int[] arr){
		for(int i = 0;i < arr.length;i++){
			//内循环，是每次都在减少，修改变量的定义
			for(int j = i+1;j < arr.length;j++){
				//数组的元素进行判断
				if(arr[i] > arr[j]){
					//数组的换位
					int temp = arr[i];
					arr[i] = arr[j];
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




