/*
	����������
	��һС�����۶�Ϊ 11��12
	�ڶ�С�����۶�Ϊ 21��22��23
	����С�����۶�Ϊ 31��32��33��34
*/
public class ArrayDemo3{
	public static void main(String[] args){
		int[][] arr = {{11,12},{21,22,23},{31,32,33,34}};
		int sum = 0;
		int groupSum = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				//һά�������
				groupSum +=arr[i][j];
			}
			System.out.println("��"+(i+1)+"С�����۶�Ϊ:"+groupSum);	
			//ÿ��һά������ܺ����
			sum += groupSum;
			//ÿ��Ψһ�����������
			groupSum = 0;
		}
		System.out.println("�����۶�Ϊ��"+sum);
		
		
	}
}