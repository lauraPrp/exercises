package org.laura.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class SalesmanTravelKata {
    public static String travel(String r, final String zipCode) {
        if (zipCode.isEmpty()) {
            return zipCode + ":/";
        }

        List<String> adList =   Arrays.stream(r.split(",")).
                filter(str->str.endsWith(zipCode)).
                map(str->str.replace(zipCode,""))
                .toList();

        String codes = adList.stream()
                .map(s -> s.split(" ")[0])
                .collect(Collectors.joining(","));
        String addresses = adList.stream()
                .map(s -> s.replace(s.split(" ")[0], "").trim())
                .collect(Collectors.joining(","));
        return String.format("%s:%s/%s", zipCode, addresses, codes);


    }
}