import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        // LIST: есть порядок и индекс, повторы разрешены
        List<String> fruits = new ArrayList<>();
        fruits.add("Алма");
        fruits.add("Алмұрт");
        fruits.add("Алма");                  // повтор допустим
        System.out.println(fruits);          // [Алма, Алмұрт, Алма]
        System.out.println(fruits.get(1));   // Алмұрт
        fruits.remove("Алмұрт");
        System.out.println(fruits.size());   // 2
 
        // SET: повторов нет
        Set<String> cities = new HashSet<>();
        cities.add("Алматы");
        cities.add("Астана");
        cities.add("Алматы");                // не добавится
        System.out.println(cities.size());   // 2
        System.out.println(cities.contains("Астана")); // true
 
        // MAP: пары ключ → значение
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Айдана", 90);
        grades.put("Мақсат", 85);
        grades.put("Айдана", 95);            // значение по ключу заменится
        System.out.println(grades.get("Айдана")); // 95
 
        for (Map.Entry<String, Integer> e : grades.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
 
