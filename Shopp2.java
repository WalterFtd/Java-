/*
ʵ�ֿ�������
	1.�洢��Ʒ��Ϣ
	�洢��Ʒ���ͱ���
	����Ʒ���͵ı������洢��������
	
	2.�鿴����嵥
	�����Ͻ��б�������ȡ�����д洢��Good���ͱ���
	���ÿһ��Goods���͵�����
	������ͣ��ܼ۸��ܽ��
	
	3.�޸���Ʒ�Ŀ��
	���ϱ�������ȡ�����д洢��Goods���ͱ���
	��������Goods�������Count��ֵ�����޸ģ��������룩
	
	
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Shopp2{
	public static void main(String[] args){
		//����ArrayList���ϣ��洢Goods����
		ArrayList<Goods> array = new ArrayList<Goods>();
		//���������Ʒ��Ϣ�ķ���
		addGoods(array);
		//���뵽��ѭ����
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
				System.out.println("�޴˹���");
			}
		}
	}
	/*
		�������壬�޸Ŀ��
		�������룬�ı�Goodsֵ
	*/
	public static void update(ArrayList<Goods> array){
		Scanner sc = new Scanner(System.in);
		//��������
		for(int i =0;i<array.size();i++){
			//get��ü��ϵ�Ԫ��
			Goods g = array.get(i);
			System.out.println("������"+g.brand+"��������");
			g.count = sc.nextInt();	
		}
	}
	/*
		���巽����ʵ�ֲ˵�ѡ���û����ݹ���ѡ��˵�
	*/
	public static int chooseFounction(){
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	/*
		���巽�����鿴����嵥����������
	*/
	public static void printStore(ArrayList<Goods> array){
		//�����ͷ
		System.out.println("----------�̳�����嵥----------");
		System.out.println("Ʒ���ͺ�     �ߴ�    �۸�    �����");
		int totalCount = 0;
		double totalMoney = 0;
		for(int i = 0;i < array.size();i++){
			//get(����)��ȡ�������е�Ԫ��
			//�洢����Goods���ͣ���ȡ��Ҳ��Goods����
			//����ʹ��Goods���͵ı���������get��������
			Goods g = array.get(i);
			System.out.println(g.brand+"  "+g.size+"  "+g.price+"  "+g.count);
			totalCount += g.count;
			totalMoney += g.price*g.count;
		}
		System.out.println("�ܿ����: "+totalCount);
		System.out.println("��Ʒ����ܽ��: "+totalMoney);
	}
	/*
		���巽��������Ʒ����Ϣ�洢��������
		���������з����Ĺ������ݣ���������
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