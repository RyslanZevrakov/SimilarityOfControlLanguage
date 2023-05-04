import java.util.*;

public class ListOfUsers {
    public ListOfUsers() {

    }

    public List<Map<String, Object>> execute(String request) throws Exception {
      switch (request){
          case "INSERT" -> insertValues();
          case "UPDATE" -> updateValues();
          case "DELETE" -> deleteValues();
          case "SELECT" -> selectValues();
      }

        return new ArrayList<>();

    }

    public void insertValues() {

    }

    public void updateValues() {

    }

    public void deleteValues() {

    }

    public void selectValues() {

    }
}