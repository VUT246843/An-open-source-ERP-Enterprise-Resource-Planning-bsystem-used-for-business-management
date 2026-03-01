     * // Value: [29] (cursor marker was originally at index 29)
     * of integers representing the original positions of the cursor markers before removal.
     * the keys are the modified queries (without the cursor marker), and the values are arrays
}
package org.jkiss.util;
 *
     * Parses the given SQL queries and extracts cursor positions marked by a specific placeholder.
            result.put(modifiedQuery, indexes);
                .mapToInt(i -> i)
     *
 *
     * @param queries The SQL queries containing cursor markers.
import java.util.Map;

     * <pre>{@code
    public static Map<String, int[]> getCursorPositions(String... queries) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * String query = "SELECT * FROM users WHERE name = '<-|Tima'";
 * Unless required by applicable law or agreed to in writing, software
            String modifiedQuery = sb.toString();
 * limitations under the License.
public final class SQLEditorTestUtil {
        }
    }
 * DBeaver - Universal Database Manager
     * <p>Example usage:</p>
import java.util.List;
            }

 * You may obtain a copy of the License at
                .toArray();
     */
import java.util.ArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");
            while ((index = sb.indexOf(CURSOR, index)) != -1) {
 *
                adjustment += CURSOR.length();
    private SQLEditorTestUtil() {
            int index = 0;


 * See the License for the specific language governing permissions and
     * // Output:
        for (String query : queries) {

            int[] indexes = positions.stream()
        return result;

 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
 * you may not use this file except in compliance with the License.
                positions.add(index - adjustment);
            List<Integer> positions = new ArrayList<>();
     *
 */
     * The cursor placeholder is removed from the queries, and the method returns a map where
    public static final String CURSOR = "<-|";
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.HashMap;

     *
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * // Key: "SELECT * FROM users WHERE name = 'Tima'"
     * }</pre>
     *         and the value is an array of integers representing the positions
        var result = new HashMap<String, int[]>();
                sb.delete(index, index + CURSOR.length());
     * Map<String, int[]> result = getCursorPositions(query);
            int adjustment = 0;
/*
     *         of the removed markers in the original query.
            StringBuilder sb = new StringBuilder(query);
    }
     * @return A map where the key is the query with cursor markers removed,
