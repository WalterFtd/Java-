/*
	���巽����ʵ������ı���
	�����У�������[11,33,565,66,78,89]
	int[] arr{3,4,45,7};
	��������ַ�����[] ,
	ʵ�ֲ��裺
	1.���巽��ʵ������ı���
	2.�ȴ�ӡ[ ������
	3.��������
		��������Ԫ�غͶ���
		�ж��Ƿ����������������һ��Ԫ�أ�
		��������һ��Ԫ�أ����] ������
*/
public class ArrayMethodTest{
	public static void main(String[] args){
		int[] arr = {11,33,565,66,78,89};
		printArray(arr);
		int[] arr2 = {45,67,785,660};
		printArray(arr2);
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




