package tasks.leetcode.findWinAtOnTicTac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindWinnerOnTicTacToeGameTest {

    @Test
    void ArrayTest() {

        int[][] moves = new int[5][2];

        moves = new int[][]{{0,0},{2,0},{1,1},{2,1},{2,2}};

        for (int i = 0; i < moves.length; i++) {
            System.out.println("Arrays.toString(moves[i]) = " + Arrays.toString(moves[i]));
        }

        //Assertions.assertTrue(moves[]);


        System.out.println("Arrays.toString(moves) = " + Arrays.toString(moves));


    }

    @Test
    void testCase1 () {
        int[][] moves = new int[][]{{0, 0},{2, 0},{1, 1},{2, 1}, {2, 2}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        String result = ticTacFindWinnerOnTicTacToeGame.tictactoe(moves);

        Assertions.assertEquals("A", result);
    }

    @Test
    void testCase2 () {
        //      O
        //  X   X
        //  X       O

        int[][] moves = new int[][]{{1, 0},{2, 2},{2, 0},{0, 1}, {1, 1}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        String result = ticTacFindWinnerOnTicTacToeGame.tictactoe(moves);

        Assertions.assertEquals("Pending", result);
    }

    @Test
    void tictactoe_whenLessThen5_thenPending() {
        // X
        //      O   O
        //          X

        int[][] moves = new int[][]{{0, 0},{1, 1},{2, 2},{1, 2}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        String result = ticTacFindWinnerOnTicTacToeGame.tictactoe(moves);

        Assertions.assertEquals("Pending", result);
    }

    @Test
    void tictactoe_thenDraw() {
        //  X   0   X
        //  X   0   X
        //  0   X   0

        int[][] moves = new int[][]{
                {0, 0}, {0, 1}, {0, 2},
                {1, 1}, {1, 0}, {2, 0},
                {1, 2}, {2, 2}, {2, 1}
        };

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        String result = ticTacFindWinnerOnTicTacToeGame.tictactoe(moves);

        Assertions.assertEquals("Draw", result);
    }

    @Test
    void getPlayerMoves_thenEquals() {
        // X    X   O
        //      O   O
        //          X
        int[][] moves = new int[][]{{0, 0},{1, 1},{2, 2},{1, 2}, {0, 1}, {0, 2}};
        int[][] exp = new int[][]{{1, 1},{1, 2}, {0, 2}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        int[][] actualPlayerMoves = ticTacFindWinnerOnTicTacToeGame.getPlayerMoves(moves);


        Assertions.assertArrayEquals(exp, actualPlayerMoves);

    }

    @Test
    void getPlayerMoves_thenEquals2() {
        // X    X   O
        //      O   O
        //          X
        int[][] moves = new int[][]{{0, 0},{1, 1},{2, 2},{1, 2}, {0, 1}};
        int[][] exp = new int[][]{{0, 0},{2, 2},{0, 1}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        int[][] actualPlayerMoves = ticTacFindWinnerOnTicTacToeGame.getPlayerMoves(moves);

        Assertions.assertArrayEquals(exp, actualPlayerMoves);
    }

    @Test
    void find3OnHorizon_thenTrue() {
        //
        // X    X   X
        //

        int[][] moves = new int[][]{{1, 1},{1, 0},{1, 2}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertTrue(ticTacFindWinnerOnTicTacToeGame.find3OnHorizon(moves));
    }

    @Test
    void find3OnHorizon_thenFalse() {
        //          X
        // X    X
        //

        int[][] moves = new int[][]{{1, 1},{1, 0},{0, 2}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertFalse(ticTacFindWinnerOnTicTacToeGame.find3OnHorizon(moves));
    }

    @Test
    void find3OnVertical_thenTrue() {
        // X
        // X
        // X

        int[][] moves = new int[][]{{0, 0},{1, 0},{2, 0}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertTrue(ticTacFindWinnerOnTicTacToeGame.find3OnVertical(moves));
    }

    @Test
    void find3OnVertical_thenFalse() {
        // X    X
        // X
        //

        int[][] moves = new int[][]{{0, 0},{1, 0},{0, 1}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertFalse(ticTacFindWinnerOnTicTacToeGame.find3OnVertical(moves));
    }

    @Test
    void findRightDiagonal_thenTrue() {
        //          x
        //      X
        //  X   X

        int[][] moves = new int[][]{{1, 1},{2, 0},{2, 1}, {0, 2}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertTrue(ticTacFindWinnerOnTicTacToeGame.findRightDiagonal(moves));

    }

    @Test
    void findRightDiagonal_thenFalse() {
        //          x
        //      X
        //      X

        int[][] moves = new int[][]{{1, 1},{2, 1}, {0, 2}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertFalse(ticTacFindWinnerOnTicTacToeGame.findRightDiagonal(moves));
    }

    @Test
    void findLeftDiagonal_thenTrue() {
        //  X
        //      X
        //      X    X

        int[][] moves = new int[][]{{1, 1},{2, 2},{2, 1}, {0, 0}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertTrue(ticTacFindWinnerOnTicTacToeGame.findLeftDiagonal(moves));

    }

    @Test
    void findLeftDiagonal_thenFalse() {
        //  X
        //      X
        //      X

        int[][] moves = new int[][]{{1, 1},{2, 1}, {0, 0}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertFalse(ticTacFindWinnerOnTicTacToeGame.findLeftDiagonal(moves));

    }


    @Test
    void find3OnDiagonal_thenTrue() {
        // X
        //      X
        //          X

        int[][] moves = new int[][]{{0, 0},{1, 1},{2, 2}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertTrue(ticTacFindWinnerOnTicTacToeGame.find3OnDiagonal(moves));
    }

    @Test
    void isItWin() {
        // X
        //      X
        //          X

        int[][] moves = new int[][]{{0, 0},{1, 1},{2, 2}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        assertTrue(ticTacFindWinnerOnTicTacToeGame.isItWin(moves));
    }


    @Test
    void printChampionName() {
        // X    0
        //      X   0
        //          X

        int[][] moves = new int[][]{{0, 0},{1, 1},{2, 2},{1, 2}, {0, 1}};

        FindWinnerOnTicTacToeGame ticTacFindWinnerOnTicTacToeGame = new FindWinnerOnTicTacToeGame();
        String actualChampionName = ticTacFindWinnerOnTicTacToeGame.printChampionName(moves.length);
        assertEquals("A", actualChampionName);
    }

}