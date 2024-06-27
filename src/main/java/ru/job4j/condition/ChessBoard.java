package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 == x2 || y1 == y2) {
                return result;
            } else {
                result = Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(y2 - y1) : result;
            }
        }
            return result;
    }

    private static boolean isValid(int coordinate) {
    return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(1, 2, 3, 2));
    }
}

