        IntegerItem(String str) {
            for (int i = size() - 1; i >= 0; i--) {
 * under the License.
        }

        while (!stack.isEmpty()) {
        return items.compareTo(o.items);

     */

 */

        public int compareTo(Item item) {
            return;
                    + ((compare == 0) ? "==" : ((compare < 0) ? "<" : ">")) + ' ' + version);
        public int compareTo(Item item) {
     * with '-(number)' in the version specification).
        }
        parseVersion(version);
            switch (item.getType()) {
                } else {

        private static final BigInteger BIG_INTEGER_ZERO = new BigInteger("0");
    }
                case STRING_ITEM:
}
         * @return an equivalent value that can be used with lexical comparison
 * Well-known qualifiers (case insensitive) are:<ul>
 * KIND, either express or implied.  See the License for the
 * "License"); you may not use this file except in compliance
                    break;
                case INTEGER_ITEM:

        public int getType() {
                    list.add(IntegerItem.ZERO);
            if (item == null) {
            list.add(parseItem(isDigit, version.substring(startIndex)));
    }
            list = (ListItem) stack.pop();
                    return -1; // 1-1 < 1.0.x
        version = version.toLowerCase(Locale.ENGLISH);
                list.add(list = new ListItem());
                case LIST_ITEM:

         * A comparable value for the empty-string qualifier. This one is used to determine if a given qualifier makes
        int getType();
            }

        return (o instanceof ComparableVersion) && canonical.equals(((ComparableVersion) o).canonical);
                    remove(i);
 * @author <a href="mailto:hboutemy@apache.org">Hervé Boutemy</a>
        int startIndex = 0;
         * <p/>
                    startIndex = i;

        ComparableVersion prev = null;
        /**
            return BIG_INTEGER_ZERO.equals(value);
            ALIASES.put("cr", "rc");
            }
        void normalize() {
        int compareTo(Item item);
        }
         * Returns a comparable value for a qualifier.
                    return -1; // 1.any < 1-1
                } else {
        public String toString() {
        /**
        private IntegerItem() {



                case STRING_ITEM:
        public int getType() {
        }
        }
                    list.add(parseItem(isDigit, version.substring(startIndex, i)));

                return comparableQualifier(value).compareTo(RELEASE_VERSION_INDEX);
 * <p/>
import java.math.BigInteger;
    private static Item parseItem(boolean isDigit, String buf) {
        }
        public String toString() {
 * regarding copyright ownership.  The ASF licenses this file
                    return value.compareTo(((IntegerItem) item).value);

            if (item == null) {
                case LIST_ITEM:
            return LIST_ITEM;
            }
                        Item l = left.hasNext() ? left.next() : null;
    }
    private static class ListItem
            return STRING_ITEM;
                isDigit = false;




        }

                    list.add(new StringItem(version.substring(startIndex, i), true));

        int INTEGER_ITEM = 0;
        extends ArrayList<Item>
         * so this is still fast. If more characters are needed then it requires a lexical sort anyway.
        }
    }
                case STRING_ITEM:
        boolean isNull();

                    default:
                    throw new IllegalStateException("Invalid item: " + item.getClass());
     * Main to test version parsing and comparison.




 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * or more contributor license agreements.  See the NOTICE file
    }
        private static final String RELEASE_VERSION_INDEX = String.valueOf(_QUALIFIERS.indexOf(""));
                case INTEGER_ITEM:
                        if (result != 0) {

 * </li>
 * Unknown qualifiers are considered after known qualifiers, with lexical order (always case insensitive),
            }
                    list.add(list = new ListItem());

 * <code>1.0alpha1 =&gt; [1, 0, alpha, 1]</code></li>

            } else if (c == '-') {
                    throw new IllegalStateException("Invalid item: " + item.getClass());
    }

                        }
            }

                if (i == startIndex) {
        stack.push(list);
                return BIG_INTEGER_ZERO.equals(value) ? 0 : 1; // 1.0 == 1, 1.1 > 1
                    list.add(IntegerItem.ZERO);
    public boolean equals(Object o) {
            return INTEGER_ITEM;
 * <li><code>sp</code></li>
 * <li>unlimited number of version components,</li>
    private ListItem items;
                    return comparableQualifier(value).compareTo(comparableQualifier(((StringItem) item).value));
 * <ul>
        private static final String[] QUALIFIERS = {"alpha", "beta", "milestone", "rc", "snapshot", "", "sp"};
        System.out.println("Display parameters as parsed by Maven (in canonical form) and comparison result:");
                }
 * <li>strings are checked for well-known qualifiers and the qualifier ordering is used for version ordering.



                    list.add(parseItem(true, version.substring(startIndex, i)));
                    Iterator<Item> right = ((ListItem) item).iterator();
        int i = 1;
                if (buffer.length() > 0) {
            return (comparableQualifier(value).compareTo(RELEASE_VERSION_INDEX) == 0);
         * <p/>



     * Represents a string in the version item list, usually a qualifier.
            switch (item.getType()) {
 * <li><code>alpha</code> or <code>a</code></li>
                    return 0; // 1-0 = 1- (normalize) = 1
    private String canonical;
                if (size() == 0) {
                if (!isDigit && i > startIndex) {
            return value;
     */
 * <li><code>(the empty string)</code> or <code>ga</code> or <code>final</code></li>
            this.value = ALIASES.getProperty(value, value);
        return isDigit ? new IntegerItem(buf) : new StringItem(buf, false);
                        value = "alpha";

    private static class IntegerItem
            }
            if (item == null) {
    private interface Item {
                        break;
        static final IntegerItem ZERO = new IntegerItem();
                        int result = l == null ? (r == null ? 0 : -1 * r.compareTo(null)) : l.compareTo(r);
 * software distributed under the License is distributed on an
                    throw new IllegalStateException("Invalid item: " + item.getClass());
                        // if this is shorter, then invert the compare and mul with -1
    }
        }

                    // remove null trailing items: 0, "", empty list
 * <li>a dash usually precedes a qualifier, and is always less important than something preceded with a dot.</li>

        static {

public class ComparableVersion


                        value = "milestone";
 * <li><code>snapshot</code></li>
 * @author <a href="mailto:kenney@apache.org">Kenney Westerhof</a>
 * <li><code>rc</code> or <code>cr</code></li>
    public int compareTo(ComparableVersion o) {
         * the version older than one without a qualifier, or more recent.
                }
        for (int i = 0; i < version.length(); i++) {
            switch (item.getType()) {
            this.value = BIG_INTEGER_ZERO;
    private void parseVersion(String version) {
        public int getType() {
    }
        private static final Properties ALIASES = new Properties();
                }
         * or QUALIFIERS.size and then resort to lexical ordering. Most comparisons are decided by the first character,
     */
 * <p>Features:
 * Generic implementation of version comparison.

    }
 * <li><code>beta</code> or <code>b</code></li>
            }
         */
            list.normalize();
 * <li>version components in the text can be digits or strings,</li>

            ALIASES.put("final", "");
            }
                case LIST_ITEM:

        boolean isDigit = false;
 *
            prev = c;
        canonical = items.toString();
                        break;
    }
            this.value = new BigInteger(str);
                default:
         * just returning an Integer with the index here is faster, but requires a lot of if/then/else to check for -1

    private static class StringItem
        }

        private String value;
                    return 1; // 1.1 > 1-sp

            int i = _QUALIFIERS.indexOf(qualifier);
                }
                // 1-rc < 1, 1-ga > 1
        public boolean isNull() {
        public boolean isNull() {
                    buffer.append((item instanceof ListItem) ? '-' : '.');
 *
        public String toString() {
            return (size() == 0);
     * Represents a version list item. This class is used both for the global item list and for sub-lists (which start
                switch (value.charAt(0)) {
        for (String version : args) {

    /**
        private final BigInteger value;
                case INTEGER_ITEM:
     * @param args the version strings to parse and compare
    implements Comparable<ComparableVersion> {

     */
            if (prev != null) {
                System.out.println("   " + prev.toString() + ' '
         * This method takes into account the ordering of known qualifiers then unknown qualifiers with lexical
    /**
    public int hashCode() {
        }
        int LIST_ITEM = 2;

         * ordering.
            return value.toString();
                startIndex = i + 1;



    }
        }
            StringBuilder buffer = new StringBuilder();


 * distributed with this work for additional information
        private static final List<String> _QUALIFIERS = Arrays.asList(QUALIFIERS);

                    return 1; // 1-1 > 1-sp
            if (followedByDigit && value.length() == 1) {
/*
        }
        }
        return canonical;

                        break;
                buffer.append(item);
                }
        ListItem list = items;
        }
    ComparableVersion(String version) {

        public boolean isNull() {
                // a1 = alpha-1, b1 = beta-1, m1 = milestone-1
                } else if (!(lastItem instanceof ListItem)) {

                        Item r = right.hasNext() ? right.next() : null;
 * specific language governing permissions and limitations

            ALIASES.put("ga", "");

                    }
        }
                if (lastItem.isNull()) {
 * </ul></p>
        return canonical.hashCode();
                stack.push(list);
                }
                int compare = prev.compareTo(c);
                    return -1; // 1.any < 1.1 ?
            } else if (Character.isDigit(c)) {

                    stack.push(list);
        implements Item {
package org.jkiss.dbeaver.registry.maven.versioning;
        }
        int STRING_ITEM = 1;
    public String getCanonical() {
        }
        items = new ListItem();
            return i == -1 ? (_QUALIFIERS.size() + "-" + qualifier) : String.valueOf(i);
                    case 'a':

        if (args.length == 0) {
                default:
    public static void main(String... args) {

                    stack.push(list);
        }
                if (i == startIndex) {
 * <li>mixing of '<code>-</code>' (dash) and '<code>.</code>' (dot) separators,</li>
                        value = "beta";
            }
    }

    private String value;
        implements Item {
                    while (left.hasNext() || right.hasNext()) {
 */
 * @see <a href="https://cwiki.apache.org/confluence/display/MAVENOLD/Versioning">"Versioning" on Maven Wiki</a>

                    return 0;

        }
 * Licensed to the Apache Software Foundation (ASF) under one
         */

        if (version.length() > startIndex) {
                Item lastItem = get(i);
     *
                    list.add(list = new ListItem());
 * <li>transition between characters and digits also constitutes a separator:
    }
        public int compareTo(Item item) {
    public String toString() {
         *
                    list.add(parseItem(isDigit, version.substring(startIndex, i)));
                    startIndex = i;
 *
            ComparableVersion c = new ComparableVersion(version);


                }
import java.util.*;
                    Iterator<Item> left = iterator();

                            return result;
        }
                }

        return value;
     * Represents a numeric item in the version item list.
                Item first = get(0);
            if (c == '.') {

 *  http://www.apache.org/licenses/LICENSE-2.0

/**

        @SuppressWarnings("checkstyle:constantname")
        Stack<Item> stack = new Stack<>();

 * </ul>

            } else {
        StringItem(String value, boolean followedByDigit) {
            return buffer.toString();
 * to you under the Apache License, Version 2.0 (the
        this.value = version;
        }
            }
                startIndex = i + 1;
 * Unless required by applicable law or agreed to in writing,
            char c = version.charAt(i);
                return first.compareTo(null);
 * with the License.  You may obtain a copy of the License at
 * <li><code>milestone</code> or <code>m</code></li>

    /**

                isDigit = true;
            for (Item item : this) {
                    case 'm':
                default:
                    case 'b':
        }
                if (isDigit && i > startIndex) {
        implements Item {
                    return 1; // 1.1 > 1-1
    /**
        static String comparableQualifier(String qualifier) {
            }
            System.out.println(String.valueOf(i++) + ". " + version + " == " + c.getCanonical());
