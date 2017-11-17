/*
	自定义数据类型：是引用类型，自己定义的一种引用数据类型用来描述一个事物。

*/
public class TestPhone{
	
	public static void main(String[] args){
		
		Phone p = new Phone();
		
		p.brand = "苹果";
		p.color = "土豪金";
		p.size = 5.0;
		System.out.println(p.brand+"  "+p.color+"  "+p.size);
	}
}