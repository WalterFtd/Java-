/*
	定义数组容器(引用类型 )
	数据类型[] 变量名 = new 数据类型[存储元素的个数];
	java提供了一个属性来操作数组（长度，length(int类型)）
	最小索引0，最大索引length-1
两种类型定义(静态初始化)：
	数据类型[] 变量名 = new 数据类型[]{1，2，3};
	数据类型[] 变量名 = {1，2，3};
*/
public class ArrayDemo{
	public static void main(String[] args){
		int[] arr = new int[3];
		//通过索引方式访问文件
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr.length);
		System.out.println("=======================");
		int[] arr2 = new int[]{1,2,3};
		//通过索引方式访问文件
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2.length);
	}
}