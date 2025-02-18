package Assignment;

public class Welcome {

	public static void main(String[] args) {
		int m = -19;
		int n = 0;
		int o = -1;
		boolean res;
		res = --m == -20 && n++ == 0 || o-- == -2;
		System.out.println(res);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

}