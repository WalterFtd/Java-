/*
	���������һ�㶼���������У�Ԫ�أ�С���������
	
	��������ķ�ʽ
		ѡ�����������е�ÿ��Ԫ�ض��ڽ��бȽ�
		ð����������������Ԫ�ؽ��бȽ�
		���򣺱Ƚϴ�С��λ�ý���
*/
public class ArrayMethodTest3{
	public static void main(String[] args){
		
		int[] arr = {45,67,785,660,-2};
		selectSort(arr);
		printArray(arr);
		
	}
	/*
		���巽����ʵ�������ѡ������
		����ֵ��û��
		����������
		ʵ�ֲ��裺
			1.Ƕ��ѭ��ʵ������
			  ��ѭ�������Ƶ���һ���Ƚ��˼���
			  ��ѭ�������Ƶ���ÿ�αȽ��˶��ٸ�Ԫ��
			2.�ж�Ԫ�صĴ�Сֵ
			  Сֵ���洢��С������
	*/
	public static void selectSort(int[] arr){
		for(int i = 0;i < arr.length;i++){
			//��ѭ������ÿ�ζ��ڼ��٣��޸ı����Ķ���
			for(int j = i+1;j < arr.length;j++){
				//�����Ԫ�ؽ����ж�
				if(arr[i] > arr[j]){
					//����Ļ�λ
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
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




