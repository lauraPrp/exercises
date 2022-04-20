package exercises;

import java.util.List;


public class ListFilteringKata {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream().filter(x -> x instanceof Integer).toList();

    }
}

