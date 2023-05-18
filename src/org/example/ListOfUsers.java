package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfUsers {
    List<Map<String, Object>> list = new ArrayList<>();

    public List<Map<String, Object>> execute(String request) {
        StringBuilder action = new StringBuilder();
        StringBuilder value = new StringBuilder();

        for (int i = 0; i < request.length(); i++) {
            if (i < 6) {
                action.append(request.charAt(i));
            } else {
                value.append(request.charAt(i));
            }
        }

        switch (action.toString()) {
            case "INSERT" -> insertValues(value.toString());
            case "UPDATE" -> updateValues(value.toString());
            case "DELETE" -> deleteValues(value.toString());
            case "SELECT" -> selectValues(value.toString());
            default -> System.out.println("Wrong Request");
        }
        System.out.println(list);
        return list;
    }

    private void insertValues(String value) {
        Map<String, Object> row = new HashMap<>();
        StringBuilder key = new StringBuilder();
        StringBuilder mapValue = new StringBuilder();
        value = value.replaceAll(" ", "");

        for (int i = 0; i != value.length(); i++) {
            if (value.charAt(i) == '=') {
                i++;
                while (value.charAt(i) != ',') {
                    mapValue.append(value.charAt(i));
                    i++;
                    if (i == value.length()) {
                        break;
                    }
                }
                i--;
            } else if (value.charAt(i) == ',') {
                row.put(key.toString(), mapValue.toString());
                key.delete(0, 100);
                mapValue.delete(0, 100);
            } else {
                key.append(value.charAt(i));
            }
        }
        row.put(key.toString(), mapValue.toString());
        list.add(row);
    }

    private void updateValues(String value) {

    }

    private void deleteValues(String value) {
        value = value.replaceAll(" ", "");
        StringBuilder key = new StringBuilder();
        StringBuilder mapValue = new StringBuilder();

        for (int i = 0; i != value.length(); i++) {
            if (value.charAt(i) == '=') {
                while (i != value.length() - 1) {
                    i++;
                    mapValue.append(value.charAt(i));
                }
            } else {
                key.append(value.charAt(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> row = list.get(i);
            if (row.containsKey(key.toString()) == true & row.containsValue(mapValue.toString()) == true) {
                list.remove(i);
            }
        }
    }

    private void selectValues(String value) {

    }
}