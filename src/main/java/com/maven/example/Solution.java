package com.maven.example;

import java.util.List;
import java.util.Map;

/**
 * Here let's build a simple database functionality with Map in Java.
 *
 * Here is how the database works; all records are represented as maps, with string keys and integer values. The records
 * are contained in an array, in no particular order.
 *
 * The target of this task is to write implementation of the method "minByKey" in Solution interface. This function scans
 * the array of records and returns the record that has the minimum value for a specified key. Records that do not
 * contains the specified ke are considered to have value 0 for the key. Note that keys may map to negative values!
 *
 * Implementation Notes:
 * 1. You should handle an empty array of records in an idiomatic way in your language of choice.
 * 2. If several records share the same minimum value for the chosen key, you may return any of them.
 *
 * Example:
 * assert min_by_key("a", [{"a": 1, "b": 2}, {"a": 2}]) == {"a": 1, "b": 2}
 * assert min_by_key("a", [{"a": 2}, {"a": 1, "b": 2}]) == {"a": 1, "b": 2}
 * assert min_by_key("b", [{"a": 1, "b": 2}, {"a": 2}]) == {"a": 2}
 * assert min_by_key("a", [{}]) == {}
 * assert min_by_key("b", [{"a": -1}, {"b": -1}]) == {"b": -1}
 */
public interface Solution {
  Map<String, Integer> minByKey(String key, List<Map<String, Integer>> records);
}
