/*
  实现商品的库存管理
  功能：
   1.展示用户选择功能清单
   2.根据选择的功能编号，进行不同的操作
    A.展示所用库存
    B.修改所有库存
	
  分析：
   1.展示用户清单:输出语句，用户输入，选择功能序号
   2.根据选择，调用不同的方法
   Switch语句
	case 1 2 3
	
	A.展示库存：将存储商品的数组，遍历
	B.修改库存：修改所有库存数量
*/
import java.util.Scanner;
public class Shopp{
	public static void main(String[] args){
		//使用数组，保存商品的信息
		//商品:品名，尺寸，价格，库存数，5个数组
		String[] brand = {"MacBookAir","Thinkpad450"};
		double[] size = {13.3,15.5};
		double[] price = {8450.5,6789.75};
		int[] count = {0,0};
		while(true){
			int choose = chooseFunction();
			switch(choose){
				case 1:
					//调用查看库存的清单方法
					printStore(brand,size,price,count);
				break;
				
				case 2:
					//调用修改库存的方法
					update(brand,count);
				break;
				
				case 3:
					return;
				
				default:
					System.out.println("没有这个功能");
				break;
			}
		}
	}
	
	//修改库存 参数：库存的数组，品名数组
	public static void update(String[] brand,int[] count){
		//遍历修改库存数
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<brand.length;i++){
			System.out.println("请输入"+brand[i]+"的库存数");
			int newCount = sc.nextInt();
			count[i] =newCount;
		}
	}
	
	//展示所有数组清单
	public static void printStore(String[] brand,double[] size,double[] price,int[] count){
		System.out.println("----------商场库存清单----------");
		System.out.println("品牌型号     尺寸    价格    库存数");
		//定义变量计算总库存数和总价格
		int totalCount = 0;
		double totalMoney = 0;
		for(int i=0;i<brand.length;i++){
			System.out.println(brand[i]+"   "+size[i]+"    "+price[i]+"   "+count[i]);
			totalCount += count[i];
			totalMoney += count[i]*price[i];
		}
		System.out.println("总库存数: "+totalCount);
		System.out.println("商品库存总金额: "+totalMoney);

	}
	
	//定义方法，实现用户选择功能，功能返回(int)
	public static int chooseFunction(){
		System.out.println("-------------库存管理------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");
		//接收键盘输入
		Scanner sc = new Scanner(System.in);
		int choosenumber = sc.nextInt();
		return choosenumber;
	}
}