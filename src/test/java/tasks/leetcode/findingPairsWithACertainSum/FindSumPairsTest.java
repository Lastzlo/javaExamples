package tasks.leetcode.findingPairsWithACertainSum;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FindSumPairsTest {

    private static int[] nums1 = new int[100];
    private static int[] nums2 = new int[1000];

    @BeforeAll
    static void setup() {
        //заполнить массивы данными
        for (int i = 0; i < 100; i++) {
            nums1[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < 1000; i++) {
            nums2[i] = (int) (Math.random() * 10);
        }


//        nums1 = new int[]{1, 1, 2, 2, 2, 3};
//        nums2 = new int[]{1, 4, 5, 2, 5, 4};

    }



    @Test
    public void executionSpeedTest() {
        FindSumPairs program = new FindSumPairs(nums1, nums2);

        //start timer
        long startTime = System.currentTimeMillis();

        //выполнить задачу
        int count = program.count(7);

        //end
        long endTime = System.currentTimeMillis();

        //вывести результат
        System.out.println("count = " + count);

        //вывести время выполнения задачи
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");

    }
}