package basic;

public class jem {
	
	static void implicit() {
		byte x = 120;
		int y = x;
		System.out.println(y);
	}
	static void explicit() {
		int i = 260;
		byte by = (byte)i;
		System.out.println(by);
	}
	static void arithmetic(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	static void increment(int d) {
		System.out.println(d++);
	}
	static void relational(int u, int v) {	
		System.out.println(u>v);
	}
	static void logical(int ai,int bi,int ci,int di) {
		System.out.println(ai<bi && ci>di);
	}
	
	public static void main(String[] args) {
		implicit();
		explicit();
		arithmetic(20,10,30);
		increment(10);
		relational(25,50);
		logical(10,20,5,15);
				
	}

}
