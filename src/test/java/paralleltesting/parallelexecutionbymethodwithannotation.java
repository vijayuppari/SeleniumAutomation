package paralleltesting;

import org.testng.annotations.Test;

public class parallelexecutionbymethodwithannotation {
    @Test(threadPoolSize = 4, invocationCount = 4, timeOut = 1000)
    public void parallemethodexecution(){
        System.out.println("Thread name is " + Thread.currentThread().getId());
    }
}
