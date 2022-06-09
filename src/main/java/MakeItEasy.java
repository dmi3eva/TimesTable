import java.util.Scanner;

public class MakeItEasy {
    public static void printBorder(int firstSize, int cellSize, int amount) {
        String view = "-".repeat(cellSize) + "+";
        System.out.print("-".repeat(firstSize) + "+");
        for (int i = 1; i < amount - 1; i++) {
            System.out.print(view);
        }
        System.out.print("-".repeat(cellSize));
        System.out.println();
    }

    public static void printCell(int cellSize, String value) {
        int valueSize = value.length();
        int indent = cellSize - valueSize;
        String view = " ".repeat(indent) + value;
        System.out.print(view);
    }

    public static void printLastCell(int cellSize, String value) {
        int valueSize = value.length();
        int indent = cellSize - valueSize;
        String view = " ".repeat(indent) + value;
        System.out.print(view);
    }

    public static void printInnerRow(int firstSize, int cellSize, int amount, int rowNumber) {
        printCell(firstSize, Integer.toString(rowNumber));
        System.out.print('|');
        for (int j = 1; j < amount - 1; j++) {
            printCell(cellSize, Integer.toString(rowNumber * j));
            System.out.print('|');
        }
        int last_value = (amount - 1) * rowNumber;
        printLastCell(cellSize, Integer.toString(last_value));
        System.out.println();
    }

    public static void printFirstRow(int firstSize, int cellSize, int n){
        printCell(firstSize, " ");
        System.out.print("|");
        for (int j = 1; j < n - 1; j++) {
            printCell(cellSize, Integer.toString(j));
            System.out.print("|");
        }
        printLastCell(cellSize, Integer.toString(n - 1));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
        int n, m;
        n = readScanner.nextInt();
        m = n;
        int cellSize = Integer.toString(n * m).length();
        int firstSize = Integer.toString(n).length();
        printFirstRow(firstSize, cellSize, n);
        for (int i = 1; i < m; i++){
            printBorder(firstSize, cellSize, n);
            printInnerRow(firstSize, cellSize, m, i);
        }
        printBorder(firstSize, cellSize, n);
    }
}
