/*
	数组遍历求和
	第一小组销售额为 11，12
	第二小组销售额为 21，22，23
	第三小组销售额为 31，32，33，34
*/
public class ArrayDemo3{
	public static void main(String[] args){
		int[][] arr = {{11,12},{21,22,23},{31,32,33,34}};
		int sum = 0;
		int groupSum = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				//一维数组相加
				groupSum +=arr[i][j];
			}
			System.out.println("第"+(i+1)+"小组销售额为:"+groupSum);	
			//每个一维数组的总和相加
			sum += groupSum;
			//每个唯一数组求和清零
			groupSum = 0;
		}
		System.out.println("总销售额为："+sum);
		
		
	}
}