/*
  定名计数器
  把功能独立出来
  1.名字存入数组
*/
import java.util.Random;
public class CallName{
	public static void main(String[] args){
		String[] names = new String[6];
		//调用添加名字方法
		addStudent(names);
		//调用遍历数组方法
		printStudentName(names);
		
		System.out.println("=============");
		
		//调用随机数学生名字方法
		String name = randomStudentName(names);
		System.out.println(name);
		
	}
	//添加名字
	public static void addStudent(String[] names){
		names[0]= "张1";
		names[1]= "张2";
		names[2]= "张3";
		names[3]= "张4";
		names[4]= "张5";
		names[5]= "张6";	
	}
	//遍历数组
	public static void printStudentName(String[] names){
		for(int i = 0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}
	//定义随机数做索引
	public static String randomStudentName(String[] names){
		Random ran = new Random();
		int index = ran.nextInt(names.length);
		return names[index];
	}
}