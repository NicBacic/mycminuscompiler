public class MyTest {
    public static void main(final String[] args) {
        System.out.println("This is a simple example of decompilation using javap");
        System.out.println(a());
        b();
        System.out.println(c());
        System.out.println(assignToVector(10));
    }
	
    public static int a() {
        int z[] = new int[10];
	    z[0] = 300;
	    return z[0];
    }

    public static void b() {
	    int x;
	    int y;
	    x = 20;
	    y = 30;
	    System.out.println(x+y);
    }

    public static int c() {
        int x[] = new int[3];
  x[0] = 50;
  x[1] = x[0] + x[0];
  x[2] = x[1] + x[0];
  return x[2];
    }

    public static int assignToVector(int a) {
		int x[] = new int[3];
		x[0] = a;
		return x[0];
    }

    public static int retrieveIndex(int index) {
		int x[] = new int[10];
		x[index] = 2;
		return x[index];
    }

    public static int swap(int a, int b) {
        int x[] = new int[2];
        x[0] = a;
         x[1] = b;
        int c = x[0];
        x[0] = x[1];
        x[1] = c;
        System.out.println(x[1]);
        return x[0];
    }

    public static int init() {
		int x[] = new int[3];
		x[2] = 10;
		return argsVector(x);
    }

    public static int argsVector(int a[]) {
        System.out.println(a[2]);
        a[0] = 1;
		return a[0];
    }

    public static int testWhile() {
        int n;
        n = 0;
        while(n < 10) {
            n = n + 1;
        }
        return n;
    }

    public static int simpleIfTrue() {
        int n;
        n = 0;
        if(n < 10) {
            n = n + 1;
        }
        return n;
    }

    public static int simpleIfElse() {
        int n;
        n = 0;
        if(n < 10) {
            n = n + 1;
        } else {
            n = 100;
        }
        return n;
    }

    public static int inserir (int k, int x, int n, int v[]) {
        int j;
        j = n;
        while (j > k) {
            j = j - 1;
            v[j] = v[j-1];
        }
        v[k] = x;
        return n + 1;
    }

    public static int call(){
        int vec[] = new int[10];
        return inserir(2,3,10,vec);
    }
}
