package triangle;

public class tri {
	public int triangle(int a,int b,int c){
		if(a<0||b<0||c<0||a+b<=c||a+c<=b||b+c<=a){
			return -1;
		}else if(a==b&&b==c){
			return 2;
		}else if(a==b||b==c||a==c){
			return 1;
		}else{
			return 0;
		}
	}
}
