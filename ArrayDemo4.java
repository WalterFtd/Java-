/*
	随机点名器
	.存储姓名
	.预览所有人的名字
	.随机出一个人的名字
	
*/
import java.util.Random;
import java.util.Scanner;
public class ArrayDemo4{
	public static void main(String[] args){
		String[] names = {"张三","李四","王五","郑六","郭靖","花无缺","刘备","郭嘉","路人甲","村民"};
		
		for(int i = 0;i<names.length;i++){
			System.out.println(names[i]);	
		}
		System.out.println("===================");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要点名的人数：");
		int p = sc.nextInt();
		for(;p>0;p--){
			Random ran = new Random();
			int index = ran.nextInt(names.length);
			System.out.println(names[index]);		
		}
	}
}