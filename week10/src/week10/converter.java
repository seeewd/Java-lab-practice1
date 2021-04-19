package week10;

public class converter {
	public static void main(String[] args) {
		int a;
		a = 2017;
		
		String a2 = Integer.toBinaryString(a);
		String a3 = Integer.toOctalString(a);
		String a4 = Integer.toHexString(a);
		
		System.out.print(a);
		System.out.print("\rb " + a2);
		System.out.print("\rb " + a3);
		System.out.print("\rb " + a4);
	}
}
