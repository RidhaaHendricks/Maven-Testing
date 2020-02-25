package za.ac.cput;

import static org.junit.Assert.fail;

/**
 * Hello world!
 *
 */
public class App 
{
    // TO TEST OBJECT EQUALITY
    public String compareWords(String str1, String str2){
        if (str1.equals(str2)){
            return "True";
        } else {
            return "False";
        }
    }

    // TO TEST OBJECT IDENTITY
    public String compareIden(String str1, String str2){
        if (str1 == str2){
            return "True";
        } else {
            return "False";
        }
    }

    // TO: DELIBERATELY FAILING A TEST
    public int largestVal(final int[] list) {
        int index, max = Integer.MAX_VALUE;
        for (index = 0; index < list.length - 1; index++) {
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }



}
