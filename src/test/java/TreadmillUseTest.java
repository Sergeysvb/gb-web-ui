import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.against.treadmill.TreadmillUse;
import ru.against.treadmill.athlete.Athlete;
import ru.against.treadmill.athlete.Cat;
import ru.against.treadmill.athlete.Person;
import ru.against.treadmill.athlete.Robot;
import ru.against.treadmill.obstacle.Treadmill;

public class TreadmillUseTest {

    @Test
    void positiveRunCatOnTreadmill() {
        TreadmillUse treadmillService = new TreadmillUse();
        Treadmill treadmill = new Treadmill(10);
        Athlete athlete = new Cat("Rocky",15.5,1.5);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeRunCatOnTreadmill() {
        TreadmillUse treadmillService = new TreadmillUse();
        Treadmill treadmill = new Treadmill(10);
        Athlete athlete = new Cat("Riki",9,2.5);
        boolean actual = treadmillService.runOnTreadmill(athlete,treadmill);
        Assertions.assertFalse(actual);
    }
    @Test
    void positiveRunPersonOnTreadmill() {
        TreadmillUse treadmillService = new TreadmillUse();
        Treadmill treadmill = new Treadmill(15);
        Athlete athlete = new Person("Misha",16,2);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeRunPersonOnTreadmill() {
        TreadmillUse treadmillService = new TreadmillUse();
        Treadmill treadmill = new Treadmill(15);
        Athlete athlete = new Person("Petya",14,2);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertFalse(actual);
    }
    @Test
    void positiveRunRobotOnTreadmill() {
        TreadmillUse treadmillService = new TreadmillUse();
        Treadmill treadmill = new Treadmill(15);
        Athlete athlete = new Robot("Wally",20,4);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeRunRobotOnTreadmill() {
        TreadmillUse treadmillService = new TreadmillUse();
        Treadmill treadmill = new Treadmill(15);
        Athlete athlete = new Robot("Tommy",5,4);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertFalse(actual);
    }
}
