/*
	nextInt产生随机整数，范围：0-指定数（取不到）
	nextDouble()随机小数 0.0-1.0(取不到)	
*/
import java.util.Random;
public class RandomDemo{
	public static void main(String[] args){
		Random ran = new Random();
		int i = ran.nextInt(100);
		System.out.println(i);
		
		double t = ran.nextDouble();
		System.out.println(t);
		
	}
}
