/*
	nextInt���������������Χ��0-ָ������ȡ������
	nextDouble()���С�� 0.0-1.0(ȡ����)	
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
