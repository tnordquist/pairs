package dev.tnordquist;


import java.util.HashMap;
import java.util.Map;

/**
 * CodingBat: Given an array of non-empty strings, create and return a Map<String, String> as
 * follows: for each string add its first character as a key with its last character as the value.
 */
public class Pairs {

  public Map<String, String> pairs(String[] strings) {

    Map<String, String> map = new HashMap<>();

    for (int i = 0; i < strings.length; ++i) {

      if (!map.containsKey(strings[i].charAt(0)) &&
          (map.get(strings[i].charAt(strings[i].length() - 1)) == null)) {

        map.put(strings[i].substring(0, 1), strings[i].substring(strings[i].length() - 1));
      }

    }

    return map;

  }

}
