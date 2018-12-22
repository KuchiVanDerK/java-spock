public class Sum {


    private int a;
    private int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSum() {
        return Sum.sum(a, b);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

}
