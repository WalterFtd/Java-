/*
	数组的查找功能
		在一个数组中，找到一个元素，是否存在于数组中，
		如果存在，就返回索引
		
	普通查询：
		找到元素在数组中出现的索引，如果没有这个元素，结果就是负数
*/
public class ArrayMethodTest5{
	public static void main(String[] args){
		
		int[] arr = {45,67,785,66,-2};
		//调用冒泡排序
		bubbleSort(arr);
		//输出
		printArray(arr);
		//折半查找
		for(int i = 0;i<arr.length;i++){
			int index = binarySearch(arr,arr[i]);
			System.out.println(index);
		}
		//普通查找
		for(int i = 0;i<arr.length;i++){
			int index = search(arr,arr[i]);
			System.out.println(index);
		}
		
		
	}
	/*
		定义方法，实现，折半查找
		返回值：索引
		参数：数组，被查找的元素
		实现步骤：
		1.需要的变量定义
			三个，三个指针
			
		2.进行循环折半
			可以折半的条件  min<=max
		
		3.让被找元素，和中间索引元素进行比较
			元素 > 中间索引  小指针 = 中间+1
			元素 < 中间索引  大指针 = 中间-1
			元素 == 中间索引  找到了，结束了，返回中间索引
			
		4.循环结束，无法折半
			元素还没找到，返回-1
	*/
	public static int binarySearch(int[] arr,int key){
		//定义三个指针变量
		int min = 0;
		int max = arr.length-1;
		int mid = 0;
		//折半查找，条件min<=max
		while(min <= max){
			//公式，计算中间索引
			mid = (min+max)/2;
			//让被找元素，和中间索引元素进行比较
			if(key > arr[mid]){
				min = mid+1;
			}else if(key < arr[mid]){
				max = mid-1;
			}else{
				//找到元素，返回元素索引
				return mid;
			}
		}
		return -1;
	}
	/*
		定义方法，实现数组的普通查询
		返回值：索引
		参数：数组，被找的元素
		
		实现步骤：
		1.遍历数组
		2.遍历过程中，使用元素和数组中的元素进行比较
		如果相同，返回元素在数组中的索引
		如果不同，返回负数
	*/
	public static int search(int[] arr,int key){
		//遍历数组
		for(int i = 0;i < arr.length;i++){
			//数组元素，被查找的元素比较
			if(arr[i] == key){
				//返回索引
				return i;
			}	
		}
		return -1;
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




