package tasks.leetcode.findWinAtOnTicTac;

public class FindWinnerOnTicTacToeGame {

    public String tictactoe(int[][] moves) {
        int length = moves.length;
        if (length < 5) return "Pending";
        int[][] playerMoves = getPlayerMoves(moves);
        boolean isWin = isItWin(playerMoves);
        if (isWin) return printChampionName(length);
        return (length == 9) ? "Draw" : "Pending";
    }

    int[][] getPlayerMoves(int[][] allMoves) {
        int startPoint = (allMoves.length % 2 == 0) ? 1 : 0;

        int arrayLength;

        if(allMoves.length % 2 == 0) {
            arrayLength = allMoves.length / 2;
        } else {
            arrayLength = allMoves.length / 2 + 1;
        }

        int[][] playerMoves = new int[arrayLength][2];

        for(int i = 0; startPoint < allMoves.length; startPoint = startPoint + 2, i++) {
            playerMoves[i] = allMoves[startPoint];
        }

        return playerMoves;
    }

    boolean find3OnHorizon(int[][] moves) {
        int numHorLine = moves[moves.length - 1][0];

        int needToFind = 3;

        for (int[] move : moves) {
            if (move[0] == numHorLine) needToFind--;
        }
        return (needToFind == 0);
    }

    boolean find3OnVertical(int[][] moves) {
        int numVerLine = moves[moves.length - 1][1];

        int needToFind = 3;

        for (int[] move : moves) {
            if (move[1] == numVerLine) needToFind--;
        }
        return (needToFind == 0);
    }

    boolean find3OnDiagonal(int[][] moves) {
        if(findRightDiagonal(moves)) return true;
        return findLeftDiagonal(moves);

    }

    boolean findRightDiagonal(int[][] moves) {
        int needToFind = 3;

        for (int[] move : moves) {
            if (move[0] == 0 && move[1] == 2) {
                needToFind--;
                continue;
            }

            if (move[0] == 1 && move[1] == 1) {
                needToFind--;
                continue;
            }

            if (move[0] == 2 && move[1] == 0) {
                needToFind--;
            }

        }

        return (needToFind == 0);
    }

    boolean findLeftDiagonal(int[][] moves) {
        int needToFind = 3;

        for (int[] move : moves) {
            if (move[0] == 0 && move[1] == 0) {
                needToFind--;
                continue;
            }

            if (move[0] == 1 && move[1] == 1) {
                needToFind--;
                continue;
            }

            if (move[0] == 2 && move[1] == 2) {
                needToFind--;
            }

        }

        return (needToFind == 0);
    }

    boolean isItWin(int[][] moves) {
        if (find3OnHorizon(moves)) return true;
        if (find3OnVertical(moves)) return true;
        return find3OnDiagonal(moves);
    }

    String printChampionName(int length) {
        if (length % 2 == 0) {
            return "B";
        } else {
            return "A";
        }
    }

}
