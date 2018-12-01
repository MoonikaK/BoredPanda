public class BoredPanda {
    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            i++;
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            i++;
            printStars(sideSize);
        }
        //System.out.println();

    }

    public static void main(String[] args) {
        printStars(4);
        printSquare(4);
    }
}
