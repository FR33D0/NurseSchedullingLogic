package scheduler.test;

import Generators.Scheduler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkHoursTest {

    @Test
    public void test(){
        Scheduler scheduler = new Scheduler();
        assertEquals(true, scheduler.workHoursCons(1, 4));
    }
}