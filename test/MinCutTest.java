import org.junit.Test;

import static org.junit.Assert.*;

public class MinCutTest {

    @Test
    public void testSearch() {

        String testFile = "C:\\JavaProject\\CourseraHW\\kargerMinCut.txt";




        MinCut test = new MinCut(testFile, 1);
        int result = test.search();
        for (int i = 2; i < 1000; i++){
            test = new MinCut(testFile, i);
            int result1 = test.search();

            if (result > result1) {
                result = result1;
            }
        }

        System.out.println(result);
//        assertEquals(2, result);
//        result = new MinCut("C:\\JavaProject\\CourseraHW\\testMinCut2.txt").search();
//        assertEquals(1, result);
//        result = new MinCut("C:\\JavaProject\\CourseraHW\\testMinCut3.txt").search();
//        assertEquals(3, result);

    }




}