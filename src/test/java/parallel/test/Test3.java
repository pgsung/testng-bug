package parallel.test;

import org.testng.annotations.Test;

public class Test3 {
    @Test
    public void runTests() {
        System.out.println(Thread.currentThread().getId());
    }
}
