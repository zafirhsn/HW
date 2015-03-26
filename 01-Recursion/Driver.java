public class Driver {
	public int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public int lens(String s) {
		if (s.equals("")) {
			return 0;
		}
		return 1 + lens(s.substring(1));
	}
	
	public int count(char c, String s) {
		if (s.equals("")) {
			return 0;
		}
		if (c ==(s.charAt(0))) {
			return 1 + count(c, s.substring(1));
		}
		return count(c, s.substring(1));
	}
	
	public int bunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		if (bunnies % 2 == 1) {
			return 2 + bunnyEars2(bunnies-1);
		}
		return 3 + bunnyEars2(bunnies-1);
	}
	
	public int strCount(String str, String sub) {
		if (str.length() < sub.length()) {
			return 0;
		}
		if (str.indexOf(sub) > 0) {
			return 1 + strCount(str.substring(str.indexOf(sub)) , sub);
		}
		return strCount(str.substring(1), sub);
	}
	
	public static void main(String[] args) {
		Driver test = new Driver();
		
		System.out.println(test.fib(4));
		System.out.println(test.fib(10));
		System.out.println();
		
		System.out.println(test.lens("Hello"));
		System.out.println(test.lens("Goodbye"));
		System.out.println();
		
		System.out.println(test.count('l',"Hello"));
		System.out.println(test.count('w',"wombo"));
		System.out.println();
		
		System.out.println(test.bunnyEars2(4));
		System.out.println(test.bunnyEars2(2));
		System.out.println();
		
		System.out.println(test.strCount("catcowcat", "cat"));
		System.out.println(test.strCount("catcowcat", "cow"));
		System.out.println(test.strCount("catcowcat", "dog"));	
		System.out.println();
	}
}

