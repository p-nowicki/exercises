package pl.coderstrust.hanoi;

public class HanoiTowers {

    public void howToDoHanoi(int nDiscs, char a, char b, char c) {
        if (nDiscs == 1) {
            System.out.println("Move Disc 1 from " + a + " to " + c);
        } else {
            howToDoHanoi(nDiscs - 1, a, c, b);
            System.out.println("Move Disc " + nDiscs + " from " + a + " to " + c);
            howToDoHanoi(nDiscs - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        HanoiTowers hanoiTowers = new HanoiTowers();
        int numberOfDiscs = 3;

        hanoiTowers.howToDoHanoi(numberOfDiscs, 'A', 'B', 'C');

    }
}