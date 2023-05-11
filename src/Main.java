import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        ListOfUsers listOfUsers = new ListOfUsers();
listOfUsers.execute("INSERT ‘lastName’ = ‘Федоров’ , ‘id’=3, ‘age’=40, ‘active’=true"
);

    }
}