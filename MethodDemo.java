/*
方法的定义格式
  修饰符 返回值类型 方法的名字（参数列表...）{
	  方法的功能主题
	  循环，判断，变量，比较，运算
	  return;
  }
  修饰符：固定写法 public static
  返回值类型：方法在运算后，结果的数据类型
  方法名：自定义名字，满足标识符规范，方法名字首字母小写，后面每个单词首字母大写
  参数列表：方法的运算过程中，是否有未知的数据，如果有未知的数据，定义在参数列表上（定义变量）
  return：方法的返回，将计算结果返回，结束方法
*/
import java.util.Scanner;
public class MethodDemo{
	public static void main(String[] args){
		//调用方法（写方法名就行）
		int area = getArea(4,5); 
		System.out.println("面积是："+area);
		
		printRect();
		
		System.out.println("你敲的是："+getNumber());
		
		printRect2(5,6);
		
		
	}
	
	//计算一个长方形的面积（int类型）
	public static int getArea(int w,int h){
		//int area = w * h;
		return w * h;	
	}
	
	//打印一个3*3的*符号
	public static void printRect(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//得到敲的数（int）
	public static int getNumber(){
		Scanner sc = new Scanner(System.in);
		//int number = sc.nextInt();
		return sc.nextInt();
	}
	//打印一个m*n的*符号
	public static void printRect2(int m,int n){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}