public class ShortOperatorsDemo {
    public static void main(String[] args) {
        int x;
        x = 5;
        int y;
        y = x++;

        System.out.println(x);
        System.out.println(y);
        System.out.println();

        x = 9;
        y = ++x;

        System.out.println(x);
        System.out.println(y);
        System.out.println();

        x = 10;
        y = 20;
        y /= x;

        System.out.println(x);
        System.out.println(y);
        System.out.println();

        x = 11;
        y = 20;
        y %= x;

        System.out.println(x);
        System.out.println(y);

    }
}
