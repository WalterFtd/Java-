/*
	ArrayList���ϵ�ʹ��
	Ҳ��������������
	���裬
		����
		���������������ͣ�
		ArrayList<String> array = new ArrayList<String>();
		ʹ�� ������.����
	ֻ�洢�������ͣ�8���������Ͷ�Ӧ8����������
	ArrayList��������������ʾ
	ArrayList���䷽��
		1.boolean add��int index,  Object obj��
		���ܣ��ڼ�����ָ��indexλ�ã������Ԫ��obj
		2.Object set��int index, Object obj��
		���ܣ���ָ��Ԫ��obj���������ָ��indexλ�õ�Ԫ��
		3.Object remve��int index��
		���ܣ��Ӽ�����ɾ��ָ��index����Ԫ�أ����ظ�Ԫ��
		4.void clear����
		���ܣ���ռ���������Ԫ��
*/
import java.util.ArrayList;
public class ArrayListDemo{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(13);//boolean add��Object obj����ָ��Ԫ��obj׷�ӵ����ϵ�ĩβ
		list.add(19);
		list.add(22);
		list.add(29);
		//int size�������ؼ����е�Ԫ�ظ���
		for(int i = 0;i<list.size();i++){
			int n = list.get(i);//Object get��int index�����ؼ�����ָ��λ���ϵ�Ԫ��
			System.out.println(n);
		}
	 }
 }