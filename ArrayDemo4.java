/*
	���������
	.�洢����
	.Ԥ�������˵�����
	.�����һ���˵�����
	
*/
import java.util.Random;
import java.util.Scanner;
public class ArrayDemo4{
	public static void main(String[] args){
		String[] names = {"����","����","����","֣��","����","����ȱ","����","����","·�˼�","����"};
		
		for(int i = 0;i<names.length;i++){
			System.out.println(names[i]);	
		}
		System.out.println("===================");
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ������������");
		int p = sc.nextInt();
		for(;p>0;p--){
			Random ran = new Random();
			int index = ran.nextInt(names.length);
			System.out.println(names[index]);		
		}
	}
}