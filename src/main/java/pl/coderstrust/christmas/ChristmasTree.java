package pl.coderstrust.christmas;

public class ChristmasTree {

    public static void main(String[] args) {
        xmasTree(5
        );

    }

    public static void xmasTree(int height) {
        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < height - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j <= height + 1; ++j) {
            if (j >= height - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}

