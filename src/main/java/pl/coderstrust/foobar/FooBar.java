package pl.coderstrust.foobar;

public class FooBar {
    public static void main(String[] args) {
        fooBarLoop();
    }

    public static void fooBarLoop() {
        for (int i = 0; i <= 52178645; ++i) {
            System.out.println(fooBarImplementation(i));
        }
    }

    public static String fooBarImplementation(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return i + " FooBar";
        }
        else if (i % 3 == 0) {
            return i + " Foo";
        }
        else if (i % 5 == 0) {
            return i + " Bar";
        }
        else {
            return "" + i;
        }
    }
}
