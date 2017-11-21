/*
	����Ĳ��ҹ���
		��һ�������У��ҵ�һ��Ԫ�أ��Ƿ�����������У�
		������ڣ��ͷ�������
		
	��ͨ��ѯ��
		�ҵ�Ԫ���������г��ֵ����������û�����Ԫ�أ�������Ǹ���
*/
public class ArrayMethodTest5{
	public static void main(String[] args){
		
		int[] arr = {45,67,785,66,-2};
		//����ð������
		bubbleSort(arr);
		//���
		printArray(arr);
		//�۰����
		for(int i = 0;i<arr.length;i++){
			int index = binarySearch(arr,arr[i]);
			System.out.println(index);
		}
		//��ͨ����
		for(int i = 0;i<arr.length;i++){
			int index = search(arr,arr[i]);
			System.out.println(index);
		}
		
		
	}
	/*
		���巽����ʵ�֣��۰����
		����ֵ������
		���������飬�����ҵ�Ԫ��
		ʵ�ֲ��裺
		1.��Ҫ�ı�������
			����������ָ��
			
		2.����ѭ���۰�
			�����۰������  min<=max
		
		3.�ñ���Ԫ�أ����м�����Ԫ�ؽ��бȽ�
			Ԫ�� > �м�����  Сָ�� = �м�+1
			Ԫ�� < �м�����  ��ָ�� = �м�-1
			Ԫ�� == �м�����  �ҵ��ˣ������ˣ������м�����
			
		4.ѭ���������޷��۰�
			Ԫ�ػ�û�ҵ�������-1
	*/
	public static int binarySearch(int[] arr,int key){
		//��������ָ�����
		int min = 0;
		int max = arr.length-1;
		int mid = 0;
		//�۰���ң�����min<=max
		while(min <= max){
			//��ʽ�������м�����
			mid = (min+max)/2;
			//�ñ���Ԫ�أ����м�����Ԫ�ؽ��бȽ�
			if(key > arr[mid]){
				min = mid+1;
			}else if(key < arr[mid]){
				max = mid-1;
			}else{
				//�ҵ�Ԫ�أ�����Ԫ������
				return mid;
			}
		}
		return -1;
	}
	/*
		���巽����ʵ���������ͨ��ѯ
		����ֵ������
		���������飬���ҵ�Ԫ��
		
		ʵ�ֲ��裺
		1.��������
		2.���������У�ʹ��Ԫ�غ������е�Ԫ�ؽ��бȽ�
		�����ͬ������Ԫ���������е�����
		�����ͬ�����ظ���
	*/
	public static int search(int[] arr,int key){
		//��������
		for(int i = 0;i < arr.length;i++){
			//����Ԫ�أ������ҵ�Ԫ�رȽ�
			if(arr[i] == key){
				//��������
				return i;
			}	
		}
		return -1;
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




