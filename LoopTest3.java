/*
	����ѭ���������ĸ������дСд��52��
	���a-z  A-Z
	���ñ����ʵ�֣���ĸ�����ֵĶ�Ӧ��ϵ
	A-Z   65-90
	a-z   97-122
	
	ʵ�ֲ��裺
	1.�������������Сдa,��дA
	2.ѭ��26�Σ�����++
*/
public class LoopTest3{
	public static void main(String[] args){
		//�������������2����ĸ
		char daxie = 'A';
		char xiaoxie = 'a';
		for(int i = 0;i<26;i++){
			System.out.println(daxie+"  "+xiaoxie);
			daxie++;
			xiaoxie++;
		}
		
	}
}




