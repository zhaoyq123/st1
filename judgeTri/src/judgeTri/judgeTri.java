package judgeTri;

public class judgeTri {
	
		public String judgeTri(int a,int b,int c){
		
			if(a+b <= c || a+c <= b || b+c <= a)
				return "����������";
			
			else{
				if(a == b || b == c || a == c){
					
					if(a == b && b == c)
						return"�ȱ�������";
					
					else
						return"����������";
					}
				
				else if((a*a == b*b+c*c) ||(b*b == a*a+c*c) || (c*c == a*a+b*b))
					return"ֱ��������";
			
				else
					return"��ͨ������";
				}
			}
}
