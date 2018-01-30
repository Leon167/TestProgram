import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTest {

    @BeforeAll
    public static void setUp()
    {
        LogInClass.setupDB();
    }

    @Test
    public void testLogin(){
        String log1 = LogInClass.login("email1", "pw1");
        assertEquals(log1, "You have successfully logged in!");

        String log2 = LogInClass.login("email2", "sadfsadf");
        assertEquals(log2, "Wrong password!");

        String log3 = LogInClass.login("email66", "pw1");
        assertEquals(log3, "Login failed. Please try again!");
    }

}
