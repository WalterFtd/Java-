/*
  ʵ����Ʒ�Ŀ�����
  ���ܣ�
   1.չʾ�û�ѡ�����嵥
   2.����ѡ��Ĺ��ܱ�ţ����в�ͬ�Ĳ���
    A.չʾ���ÿ��
    B.�޸����п��
	
  ������
   1.չʾ�û��嵥:�����䣬�û����룬ѡ�������
   2.����ѡ�񣬵��ò�ͬ�ķ���
   Switch���
	case 1 2 3
	
	A.չʾ��棺���洢��Ʒ�����飬����
	B.�޸Ŀ�棺�޸����п������
*/
import java.util.Scanner;
public class Shopp{
	public static void main(String[] args){
		//ʹ�����飬������Ʒ����Ϣ
		//��Ʒ:Ʒ�����ߴ磬�۸񣬿������5������
		String[] brand = {"MacBookAir","Thinkpad450"};
		double[] size = {13.3,15.5};
		double[] price = {8450.5,6789.75};
		int[] count = {0,0};
		while(true){
			int choose = chooseFunction();
			switch(choose){
				case 1:
					//���ò鿴�����嵥����
					printStore(brand,size,price,count);
				break;
				
				case 2:
					//�����޸Ŀ��ķ���
					update(brand,count);
				break;
				
				case 3:
					return;
				
				default:
					System.out.println("û���������");
				break;
			}
		}
	}
	
	//�޸Ŀ�� �������������飬Ʒ������
	public static void update(String[] brand,int[] count){
		//�����޸Ŀ����
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<brand.length;i++){
			System.out.println("������"+brand[i]+"�Ŀ����");
			int newCount = sc.nextInt();
			count[i] =newCount;
		}
	}
	
	//չʾ���������嵥
	public static void printStore(String[] brand,double[] size,double[] price,int[] count){
		System.out.println("----------�̳�����嵥----------");
		System.out.println("Ʒ���ͺ�     �ߴ�    �۸�    �����");
		//������������ܿ�������ܼ۸�
		int totalCount = 0;
		double totalMoney = 0;
		for(int i=0;i<brand.length;i++){
			System.out.println(brand[i]+"   "+size[i]+"    "+price[i]+"   "+count[i]);
			totalCount += count[i];
			totalMoney += count[i]*price[i];
		}
		System.out.println("�ܿ����: "+totalCount);
		System.out.println("��Ʒ����ܽ��: "+totalMoney);

	}
	
	//���巽����ʵ���û�ѡ���ܣ����ܷ���(int)
	public static int chooseFunction(){
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		//���ռ�������
		Scanner sc = new Scanner(System.in);
		int choosenumber = sc.nextInt();
		return choosenumber;
	}
}