public class P26 {
    public static int ex1(int n) {
        if (n == 1) { // תנאי עצירה
            return 1;
        }
        return n + ex1(n - 1);
    }
    public static int ex2(int n) {
        if (n == 1) { // תנאי עצירה
            return 1;
        }
        return n * ex2(n - 1);
    }

    public static int ex3(int n) {
        if (n <= 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return ex3(n - 1);
        }
        return n * ex3(n - 2);
    }

    public static int ex4(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + ex4(n / 10);
    }

    public static int ex5(int n, int x) {
        if (n < x) {
            return 0;
        }
        return 1 + ex5(n - x, x);
    }

    public static int ex6(int n, int d) {
        if (n < d) {
            return n;
        }
        return ex6(n - d, d);
    }

    public static boolean ex7(int x, int y) {
        if (x == y) {
            return true;
        }
        if (x < y) {
            return false;
        }
        return ex7(x - y, y);
    }

    //q8- d has to be 2 at first:
    public static boolean ex8(int n, int d) {

        if (n <= 1) {
            return false;
        }
        if (n % d == 0) {
            return false;
        }
        if (d == 1) {
            return true;
        }
        return ex8(n, d - 1);
    }


    public static boolean ex9(int n) {
        if (n < 10) {
            return true;
        }
        
        int CurrentDig = n % 10;
        int nextLast = (n / 10) % 10;
        if ((CurrentDig % 2) != (nextLast % 2)) {
            return false;
        }
        return ex9(n / 10);
    }

}
