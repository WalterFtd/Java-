/*
	��������Ϸ
	�õ���
	random�����
	scanner��������
	if else�ж����
	whileѭ�����
	break��ֹѭ��
*/
import java.util.Random;
import java.util.Scanner;
public class GuestNumber{
	public static void main(String[] args){
		//����Random�����
		Random ran = new Random();
		
		int ranNumber = ran.nextInt(100)+1;
		//����Scanner�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������Ϸ��ʼ��");
		System.out.println("������1-100֮�������");
		
		while(true){
			int i = sc.nextInt();
			if(i > ranNumber){
				System.out.println("�´���");
			}else if(i < ranNumber){
				System.out.println("��С��");
			}else{
				System.out.println("����");
				break;
			}
		}
		
	}
}