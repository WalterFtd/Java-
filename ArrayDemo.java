/*
	������������(�������� )
	��������[] ������ = new ��������[�洢Ԫ�صĸ���];
	java�ṩ��һ���������������飨���ȣ�length(int����)��
	��С����0���������length-1
�������Ͷ���(��̬��ʼ��)��
	��������[] ������ = new ��������[]{1��2��3};
	��������[] ������ = {1��2��3};
*/
public class ArrayDemo{
	public static void main(String[] args){
		int[] arr = new int[3];
		//ͨ��������ʽ�����ļ�
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr.length);
		System.out.println("=======================");
		int[] arr2 = new int[]{1,2,3};
		//ͨ��������ʽ�����ļ�
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2.length);
	}
}