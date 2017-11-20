/*
	利用循环，输出字母包含大写小写，52个
	输出a-z  A-Z
	利用编码表实现，字母和数字的对应关系
	A-Z   65-90
	a-z   97-122
	
	实现步骤：
	1.定义变量，保存小写a,大写A
	2.循环26次，变量++
*/
public class LoopTest3{
	public static void main(String[] args){
		//定义变量，保存2个字母
		char daxie = 'A';
		char xiaoxie = 'a';
		for(int i = 0;i<26;i++){
			System.out.println(daxie+"  "+xiaoxie);
			daxie++;
			xiaoxie++;
		}
		
	}
}




