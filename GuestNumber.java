/*
	猜数字游戏
	用到：
	random随机数
	scanner输入数据
	if else判断语句
	while循环语句
	break终止循环
*/
import java.util.Random;
import java.util.Scanner;
public class GuestNumber{
	public static void main(String[] args){
		//创建Random类对象
		Random ran = new Random();
		
		int ranNumber = ran.nextInt(100)+1;
		//创建Scanner类对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("猜数字游戏开始了");
		System.out.println("请输入1-100之间的数：");
		
		while(true){
			int i = sc.nextInt();
			if(i > ranNumber){
				System.out.println("猜大了");
			}else if(i < ranNumber){
				System.out.println("猜小了");
			}else{
				System.out.println("中了");
				break;
			}
		}
		
	}
}