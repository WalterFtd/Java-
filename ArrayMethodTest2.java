/*
	���������
	  �����е�Ԫ�أ�����λ���ϵĽ���
	  ���� ������ �������
	  ������������Զ����������������λ�ý�����ʵ�����������
	  ʹ�õ��������ָ��˼�룬���Ǳ�����˼�룬������ʱ�任����
	  ��ת reverse
	  ʵ�ֲ��裺
		1.���巽����ʵ�����������
		2.��������
			ʵ���������Զ������λ��
			ʹ����ʱ�ĵ���������
*/
public class ArrayMethodTest2{
	public static void main(String[] args){
		
		int[] arr = {45,67,785,660,-2};
		reverse(arr);
		printArray(arr);
		
	}
	/*
		���巽����ʵ�����������
		����ֵ��û�з���ֵ
		������������ǲ���
	*/
	public static void reverse(int[] arr){
		//����ѭ����ʵ��������������������У���Զ�˻�λ
		//for�ĵ�һ��������������������������++ --
		for(int min = 0,max = arr.length-1 ; min<max ; min++,max--){
			//�������е�Ԫ�أ�����λ�ý���
			//min������max������Ԫ�ؽ���
			//�������������min����
			int temp = arr[min];
			//max�����ϵ�Ԫ�أ���ֵ��min����
			arr[min] = arr[max];
			//��ʱ��������������ݣ���ֵ��max������
			arr[max] = temp;	
		}
	}
	/*
		���巽����ʵ�ֹ���
		����ֵ��void
		��������������
	*/
	public static void printArray(int[] arr){
		//���һ��������ţ���Ҫ���д�ӡ
		System.out.print("[");
		//������б���
		for(int i = 0;i < arr.length;i++){
			//�жϱ�������Ԫ�أ��ǲ�����������һ��Ԫ��
			//����жϣ�ѭ������������length-1
			if(i == arr.length-1){
				//�������Ԫ�غ�]
				System.out.println(arr[i]+"]");
			}else{
			System.out.print(arr[i]+",");
			}
		}
	}
}




