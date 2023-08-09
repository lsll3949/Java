package step03;

public class ex11 {
		public static int view1() { //1
			return 10;
		}
		public static char view2() { //2
			return 'A';
		}
		public static float view3() { //3
			return 50.3f;
		}
		public static double view4() { //4
			return 100.45;
		}
		public static String view5() { //5
			return "korea";
		}
		public static boolean view6() { //6
			return true;
		}
	
	public static void main(String[] args) {
		int a = view1();
		System.out.println(a);
		
		char b = view2();
		System.out.println(b);
		
		float c = view3();
		System.out.println(c);
		
		double d = view4();
		System.out.println(d);
		
		String e = view5();
		System.out.println(e);
		
		boolean f = view6();
		System.out.println(f);
		
		
	}

}
