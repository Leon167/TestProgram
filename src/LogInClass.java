import java.util.HashMap;


public class LogInClass {

    private static HashMap<String, String> namePwDatabase;

    public static void setupDB()
    {
        namePwDatabase = new HashMap<String, String>();
        namePwDatabase.put("email1", "pw1");
        namePwDatabase.put("email2", "pw2");
        namePwDatabase.put("email3", "pw3");
    }

    public static String login(String email, String password){
        if(namePwDatabase.containsKey(email))
        {
            if(namePwDatabase.get(email).equals(password))
                return "You have successfully logged in!";
            return "Wrong password!";
        }
        return "Login failed. Please try again!";
    }

}
