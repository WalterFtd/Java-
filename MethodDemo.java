/*
�����Ķ����ʽ
  ���η� ����ֵ���� ���������֣������б�...��{
	  �����Ĺ�������
	  ѭ�����жϣ��������Ƚϣ�����
	  return;
  }
  ���η����̶�д�� public static
  ����ֵ���ͣ�����������󣬽������������
  ���������Զ������֣������ʶ���淶��������������ĸСд������ÿ����������ĸ��д
  �����б���������������У��Ƿ���δ֪�����ݣ������δ֪�����ݣ������ڲ����б��ϣ����������
  return�������ķ��أ������������أ���������
*/
import java.util.Scanner;
public class MethodDemo{
	public static void main(String[] args){
		//���÷�����д���������У�
		int area = getArea(4,5); 
		System.out.println("����ǣ�"+area);
		
		printRect();
		
		System.out.println("���õ��ǣ�"+getNumber());
		
		printRect2(5,6);
		
		
	}
	
	//����һ�������ε������int���ͣ�
	public static int getArea(int w,int h){
		//int area = w * h;
		return w * h;	
	}
	
	//��ӡһ��3*3��*����
	public static void printRect(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//�õ��õ�����int��
	public static int getNumber(){
		Scanner sc = new Scanner(System.in);
		//int number = sc.nextInt();
		return sc.nextInt();
	}
	//��ӡһ��m*n��*����
	public static void printRect2(int m,int n){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}