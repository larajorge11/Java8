package chapter4;

import org.junit.Test;

public class Exercises {

    @Test
    public void test1() {
        System.out.println(howMany(true, new boolean[2])) ;
    }

    private int howMany(boolean a, boolean ... b) {
        return b.length;
    }
}
