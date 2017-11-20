/*
	利用嵌套for循环，实现99乘法表示
	实现步骤：
	  1.定义外循环控制行数
	  2.内循环控制个数，个数，每次都在递增
	  3.循环中输出，乘法表的格式 1*3=3
*/
public class LoopTest4{
	public static void main(String[] args){
		//定义外循环，循环9次
		for(int i = 1;i <= 9;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}




