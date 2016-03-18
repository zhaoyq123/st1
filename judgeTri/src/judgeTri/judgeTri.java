package judgeTri;

public class judgeTri {
	
		public String judgeTri(int a,int b,int c){
		
			if(a+b <= c || a+c <= b || b+c <= a)
				return "不是三角形";
			
			else{
				if(a == b || b == c || a == c){
					
					if(a == b && b == c)
						return"等边三角形";
					
					else
						return"等腰三角形";
					}
				
				else if((a*a == b*b+c*c) ||(b*b == a*a+c*c) || (c*c == a*a+b*b))
					return"直角三角形";
			
				else
					return"普通三角形";
				}
			}
}
