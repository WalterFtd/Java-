/*
	���������һ�㶼���������У�Ԫ�أ�С���������
	
	��������ķ�ʽ
		ѡ�����������е�ÿ��Ԫ�ض��ڽ��бȽ�
		ð����������������Ԫ�ؽ��бȽ�
		���򣺱Ƚϴ�С��λ�ý���
*/
public class ArrayMethodTest4{
	public static void main(String[] args){
		
		int[] arr = {45,67,785,660,-2};
		//����ð������
		bubbleSort(arr);
		//���
		printArray(arr);
		
		
	}
	/*
		���巽����ʵ�������ð������
		����ֵ��û��
		����������
	*/
	public static void bubbleSort(int[] arr){
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
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




