package tasks.leetcode.findingPairsWithACertainSum;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FindSumPairs2Test {

    private static int[] nums1 = new int[1000];
    private static int[] nums2 = new int[1000000];

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
        System.out.println("type2");
        FindSumPairs2 program = new FindSumPairs2(nums1, nums2);

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

        System.out.println("type1");
        FindSumPairs program1 = new FindSumPairs(nums1, nums2);

        //start timer
        startTime = System.currentTimeMillis();

        //выполнить задачу
        count = program1.count(7);

        //end
        endTime = System.currentTimeMillis();

        //вывести результат
        System.out.println("count = " + count);

        //вывести время выполнения задачи
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");

    }
}