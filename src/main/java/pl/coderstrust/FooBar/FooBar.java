package pl.coderstrust.FooBar;

public class FooBar {
    public static void main(String[] args) {

        fooBarLoop();
    }

    private static void fooBarLoop() {
        for (int i = 0; i <= 100; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FooBar");
            }
            else if (i % 3 == 0) {
                System.out.println(i + " Foo");
            }
            else if (i % 5 == 0) {
                System.out.println(i + " Bar");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
