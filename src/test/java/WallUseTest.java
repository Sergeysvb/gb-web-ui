import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.against.treadmill.WallUse;
import ru.against.treadmill.athlete.Athlete;
import ru.against.treadmill.athlete.Cat;
import ru.against.treadmill.athlete.Person;
import ru.against.treadmill.athlete.Robot;
import ru.against.treadmill.obstacle.Wall;

public class WallUseTest {


    @Test
    void positiveJumpCatOnWall() {
        WallUse wallService = new WallUse();
        Wall wall = new Wall(1);
        Athlete athlete = new Cat("Rocky",15.5,1.5);
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeJumpCatOnWall() {
        WallUse wallService = new WallUse();
        Wall wall = new Wall(10);
        Athlete athlete = new Cat("Riki",9,2.5);
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertFalse(actual);
    }
    @Test
    void positiveJumpPersonOnWall() {
        WallUse wallService = new WallUse();
        Wall wall = new Wall(1);
        Athlete athlete = new Person("Misha",16,2);
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeJumpPersonOnWall() {
        WallUse wallService = new WallUse();
        Wall wall = new Wall(10);
        Athlete athlete = new Person("Petya",14,2);
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertFalse(actual);
    }
    @Test
    void positiveJumpRobotOnWall() {
        WallUse wallService = new WallUse();
        Wall wall = new Wall(1);
        Athlete athlete = new Robot("Wally",20,4);
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeJumpRobotOnWall() {
        WallUse wallService = new WallUse();
        Wall wall = new Wall(10);
        Athlete athlete = new Robot("Tommy",5,4);
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertFalse(actual);
    }
}