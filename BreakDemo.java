/*
	break编码,终止循环
*/
public class BreakDemo{
	public static void main(String[] args){
		int t = 1;
		while(true){
			if(t == 3){
				break;
			}else{
				System.out.println(t);
			}
			t++;
		}
		System.out.println("**************************");
		 a:for(int i = 0;i < 2;i++){
			 for(int j = 0;j < 5;j++){
				 System.out.println("j="+j);
				 break a; //结束内循环/结束循环
			 }
			 System.out.println("i="+i);
		 }		 
	}
	
}