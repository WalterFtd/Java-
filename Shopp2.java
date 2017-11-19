/*
实现库存管理案例
	1.存储商品信息
	存储商品类型变量
	将商品类型的变量，存储到集合中
	
	2.查看库存清单
	将集合进行遍历，获取集合中存储的Good类型变量
	输出每一个Goods类型的属性
	计算求和：总价格，总金额
	
	3.修改商品的库存
	集合遍历，获取集合中存储的Goods类型变量
	变量调用Goods类的属性Count，值进行修改（键盘输入）
	
	
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Shopp2{
	public static void main(String[] args){
		//创建ArrayList集合，存储Goods类型
		ArrayList<Goods> array = new ArrayList<Goods>();
		//调用添加商品信息的方法
		addGoods(array);
		//进入到死循环中
		while(true){
			int number = chooseFounction();
			switch(number){
				case 1:
					printStore(array);
				break;
				case 2:
					update(array);
				break;
				case 3:
				return;
				default:
				System.out.println("无此功能");
			}
		}
	}
	/*
		方法定义，修改库存
		键盘输入，改变Goods值
	*/
	public static void update(ArrayList<Goods> array){
		Scanner sc = new Scanner(System.in);
		//遍历集合
		for(int i =0;i<array.size();i++){
			//get获得集合的元素
			Goods g = array.get(i);
			System.out.println("请输入"+g.brand+"的数量：");
			g.count = sc.nextInt();	
		}
	}
	/*
		定义方法，实现菜单选择，用户根据功能选择菜单
	*/
	public static int chooseFounction(){
		System.out.println("-------------库存管理------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	/*
		定义方法，查看库存清单，遍历集合
	*/
	public static void printStore(ArrayList<Goods> array){
		//输出表头
		System.out.println("----------商场库存清单----------");
		System.out.println("品牌型号     尺寸    价格    库存数");
		int totalCount = 0;
		double totalMoney = 0;
		for(int i = 0;i < array.size();i++){
			//get(索引)获取出集合中的元素
			//存储的是Goods类型，获取的也是Goods类型
			//所以使用Goods类型的变量，接受get方法结束
			Goods g = array.get(i);
			System.out.println(g.brand+"  "+g.size+"  "+g.price+"  "+g.count);
			totalCount += g.count;
			totalMoney += g.price*g.count;
		}
		System.out.println("总库存数: "+totalCount);
		System.out.println("商品库存总金额: "+totalMoney);
	}
	/*
		定义方法，将商品的信息存储到集合中
		集合是所有方法的共享数据，参数传递
	*/
	public static void addGoods(ArrayList<Goods> array){
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		g1.brand = "Thankpad";
		g1.size = 15.6;
		g1.price = 1000.0;
		g1.count = 2;
		
		g2.brand = "macbook";
		g2.size = 13.6;
		g2.price = 2000.0;
		g2.count = 3;
		
		array.add(g1);
		array.add(g2);
	}
}