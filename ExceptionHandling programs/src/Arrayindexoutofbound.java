public class Arrayindexoutofbound {
	public static void main(String[] args) {  
		int a[]=new int[4];
		a[1]=10;
		a[2]=20;
	a[7]=60;
		System.out.println(a[1]);
	}
}