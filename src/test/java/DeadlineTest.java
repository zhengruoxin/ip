import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import duke.task.Deadline;

public class DeadlineTest {

    @Test
    public void testStringConversion() {
        assertEquals("[D][ ] lab report (by: Jan 21 2021)",
                new Deadline("lab report", "2021-01-21").toString());
    }
}
