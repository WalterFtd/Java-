/*
  方法定义和使用的注意事项
	1.方法不能定义在另一个方法里面
	2.写错方法名字
	3.写错了参数列表
	4.方法返回值是void，方法中可以省略return 不写
		return 下面不能有代码
	5.方法返回值类型，和return后面数据类型必须匹配
	6.方法重复定义问题
	7.调用方法的时候，返回值是void，不能写在输出语句中
  
  方法重载特性
  一个类中允许同名方法，只要参数列表不同即可（参数，类型，数据）
  println就是一个典型的重载方法
  注意
  1.参数列表必须不同
  2.重载和参数变量名无关
  3.重载和返回值类型无关
  4.重载和修饰符无关
  技巧：重载只看方法名和参数列表
*/
public class MethodDemo2{
	public static void main(String[] args){
		System.out.println(getSum(2,3));
		System.out.println(getSum(2,3,4));
		System.out.println(getSum(2.9,3.4));
	}
	public static int getSum(int a,int b){
		System.out.println("两个int类型");
		return a+b;
	}
	public static int getSum(int a,int b,int c){
		System.out.println("三个int类型");
		return a+b+c;
	}
	public static double getSum(double a,double b){
		System.out.println("两个double类型");
		return a+b;
	}
}