/*
  ���������ʹ�õ�ע������
	1.�������ܶ�������һ����������
	2.д��������
	3.д���˲����б�
	4.��������ֵ��void�������п���ʡ��return ��д
		return ���治���д���
	5.��������ֵ���ͣ���return�����������ͱ���ƥ��
	6.�����ظ���������
	7.���÷�����ʱ�򣬷���ֵ��void������д����������
  
  ������������
  һ����������ͬ��������ֻҪ�����б�ͬ���ɣ����������ͣ����ݣ�
  println����һ�����͵����ط���
  ע��
  1.�����б���벻ͬ
  2.���غͲ����������޹�
  3.���غͷ���ֵ�����޹�
  4.���غ����η��޹�
  ���ɣ�����ֻ���������Ͳ����б�
*/
public class MethodDemo2{
	public static void main(String[] args){
		System.out.println(getSum(2,3));
		System.out.println(getSum(2,3,4));
		System.out.println(getSum(2.9,3.4));
	}
	public static int getSum(int a,int b){
		System.out.println("����int����");
		return a+b;
	}
	public static int getSum(int a,int b,int c){
		System.out.println("����int����");
		return a+b+c;
	}
	public static double getSum(double a,double b){
		System.out.println("����double����");
		return a+b;
	}
}