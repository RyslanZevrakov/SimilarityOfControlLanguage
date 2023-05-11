import java.util.*;

public class ListOfUsers {
    public ListOfUsers() {

    }

    public List<Map<String, Object>> execute(String request) throws Exception {
        StringBuilder action = new StringBuilder();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i != request.length();i++){
            if (i < 6){
                action.append(request.charAt(i));
            } else {
                value.append(request.charAt(i));
            }
        }
      switch (action.toString()){
          case "INSERT" -> insertValues(value.toString());
          case "UPDATE" -> updateValues();
          case "DELETE" -> deleteValues();
          case "SELECT" -> selectValues();
      }

        return new ArrayList<>();

    }

    public void insertValues(String value) {
        value = value.replaceAll(" ", "");
        System.out.println(value);
    }

    public void updateValues() {

    }

    public void deleteValues() {

    }

    public void selectValues() {

    }



}