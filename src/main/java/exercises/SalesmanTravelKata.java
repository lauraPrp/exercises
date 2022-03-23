package exercises;

import java.util.stream.Collectors;


public class SalesmanTravelKata {
    public static String travel(String r, String zipcode) {
        if(zipcode.trim().length() < 8){
            return zipcode + ":/";
        }
        java.util.List<String> list = java.util.Arrays.stream(r.split(","))
                .filter(s -> s.contains(zipcode))
                .map(s -> s.replace(zipcode, ""))
                .toList();
        String codes = list.stream()
                .map(s -> s.split(" ")[0])
                .collect(Collectors.joining(","));
        String addresses = list.stream()
                .map(s -> s.replace(s.split(" ")[0], "").trim())
                .collect(Collectors.joining(","));
        return String.format("%s:%s/%s", zipcode, addresses, codes);
    }
}

