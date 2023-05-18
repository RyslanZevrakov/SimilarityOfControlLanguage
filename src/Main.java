import org.example.ListOfUsers;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        ListOfUsers listOfUsers = new ListOfUsers();
        listOfUsers.execute("INSERT LastName=Petrov, Id=1, Age=36, Count = 150");
        listOfUsers.execute("INSERT LastName=vas, Id=2, Age=, Count = 150");
        listOfUsers.execute("INSERT LastName=hors, Id=3, Age=6, Count = 150");
        listOfUsers.execute("DELETE LastName=Petrov");
    }
}