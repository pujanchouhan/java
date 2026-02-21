public class main {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void main(String[] args) {
        main m = new main();
        m.add(5, 10);
        m.add(5, 10, 15);
    }
}
