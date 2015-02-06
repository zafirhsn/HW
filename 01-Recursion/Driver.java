public class Driver {
    public int fib(int n) {
	if (n == 1) {
	    return 1;
	}
	if (n == 2) {
	    return 1;
	}
	else {
	    return (fib(n-1) + fib(n-2));
	}
    }

    public int lens(String s) {
	if (s.equals("")) {
	    return 0;
	}
	else {
	    return 1 + lens(s.substring(1));
	}
    }

    public static void main(String[] args) {
	Driver d = new Driver();
	System.out.println(d.fib(4));
	System.out.println(d.lens("Hello"));
    }
}
