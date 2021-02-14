public class recursion {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }

    public static int calculate(int param) {
        if (param > 1) {
            return param * calculate(param - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // int result = sum(3);
        // System.out.println(result);
        int result2 = calculate(4);
        System.out.println(result2);
    }

}
