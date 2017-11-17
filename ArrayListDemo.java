/*
	ArrayList集合的使用
	也是引用数据类型
	步骤，
		导包
		创建（加数据类型）
		ArrayList<String> array = new ArrayList<String>();
		使用 变量名.方法
	只存储引用类型：8个基本类型对应8个引用类型
	ArrayList三个基本方法演示
	ArrayList补充方法
		1.boolean add（int index,  Object obj）
		功能：在集合中指定index位置，添加新元素obj
		2.Object set（int index, Object obj）
		功能：用指定元素obj替代集合中指定index位置的元素
		3.Object remve（int index）
		功能：从集合中删除指定index处的元素，返回该元素
		4.void clear（）
		功能：清空集合中所有元素
*/
import java.util.ArrayList;
public class ArrayListDemo{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(13);//boolean add（Object obj）将指定元素obj追加到集合的末尾
		list.add(19);
		list.add(22);
		list.add(29);
		//int size（）返回集合中的元素个数
		for(int i = 0;i<list.size();i++){
			int n = list.get(i);//Object get（int index）返回集合中指定位置上的元素
			System.out.println(n);
		}
	 }
 }