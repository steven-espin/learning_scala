package playground;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaPlayground {
    public static void main(String[] args) {
        System.out.print("hello");

        Map<String, Object> map = new HashMap<>();
        map.put("MDN", "12345");
        map.put("kpi1", "5");
        map.put("kpi2", "5");
        System.out.println("MDN: " + map.get("MDN"));

        List<String> list = new LinkedList<>();
        list.add("Column 1");
        list.add("Column 2");
        list.stream().forEach(s -> System.out.println(s));

        // combining both concepts
        List<Map<String, Object>> listOfMap = new LinkedList<>();
        listOfMap.add(new HashMap<>());
        listOfMap.add(new HashMap<>());
        listOfMap.get(0).put("mtn", "God");
        listOfMap.get(0).put("vOice", "boy");
        listOfMap.stream().filter(p -> p.isEmpty()).forEach(s -> s.put("list2", "boo"));

        listOfMap.forEach(s -> System.out.println(s.keySet()));

        listOfMap.get(0).keySet().stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

        System.out.println("here: ");
        listOfMap.stream().forEach(p -> System.out.print(p + ": "));

    }
}
