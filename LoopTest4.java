/*
	����Ƕ��forѭ����ʵ��99�˷���ʾ
	ʵ�ֲ��裺
	  1.������ѭ����������
	  2.��ѭ�����Ƹ�����������ÿ�ζ��ڵ���
	  3.ѭ����������˷���ĸ�ʽ 1*3=3
*/
public class LoopTest4{
	public static void main(String[] args){
		//������ѭ����ѭ��9��
		for(int i = 1;i <= 9;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}




