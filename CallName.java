/*
  ����������
  �ѹ��ܶ�������
  1.���ִ�������
*/
import java.util.Random;
public class CallName{
	public static void main(String[] args){
		String[] names = new String[6];
		//����������ַ���
		addStudent(names);
		//���ñ������鷽��
		printStudentName(names);
		
		System.out.println("=============");
		
		//���������ѧ�����ַ���
		String name = randomStudentName(names);
		System.out.println(name);
		
	}
	//�������
	public static void addStudent(String[] names){
		names[0]= "��1";
		names[1]= "��2";
		names[2]= "��3";
		names[3]= "��4";
		names[4]= "��5";
		names[5]= "��6";	
	}
	//��������
	public static void printStudentName(String[] names){
		for(int i = 0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}
	//���������������
	public static String randomStudentName(String[] names){
		Random ran = new Random();
		int index = ran.nextInt(names.length);
		return names[index];
	}
}