        Assert.assertEquals(true, CommonUtils.getOption(options, "C", "default"));
        Assert.assertFalse(CommonUtils.toBoolean("false"));
        final ArrayList<Character> theList = new ArrayList<>();
    @Test
    public void testGetOption() {
        Assert.assertEquals(false, CommonUtils.isJavaIdentifier(""));
    }

        Assert.assertTrue(CommonUtils.isEmpty(emptyValue));

  @Test
        Assert.assertEquals("", CommonUtils.notEmpty(null));
        Assert.assertEquals("_", CommonUtils.escapeFileName("|"));
        List<String> tokens = new ArrayList<>();
  @PrepareForTest({ CommonUtils.class, System.class })
    @Test

        Assert.assertEquals("default", CommonUtils.getOption(options, "D", "default"));
        Assert.assertEquals("abc", CommonUtils.truncateString("abc", 3));
    @Test
        Assert.assertEquals("\\r", CommonUtils.escapeJavaString("\r"));
        Assert.assertEquals("_", CommonUtils.escapeFileName("?"));
        Assert.assertEquals(defaultValue, CommonUtils.notNull(null, defaultValue));
        Assert.assertEquals("\\n", CommonUtils.escapeJavaString("\n"));

    public void testEscapeFileName() {
    public void testJoinStringsArray() {
    public void testIsNotEmpty() {
 * DBeaver - Universal Database Manager
        final String[] nullArray = null;
    public final ExpectedException thrown = ExpectedException.none();
    public void testGetRootCause() {
        Assert.assertEquals("'string'", CommonUtils.escapeBourneShellString("string"));
    }
        final ArrayList<Integer> theList = new ArrayList<>();
        Assert.assertArrayEquals(new String[]{"abc", "def"}, CommonUtils.split("abc:def", ":"));

        Assert.assertEquals("abc", CommonUtils.truncateString("abcdef", 3));
    public void testFilterCollection() {

    @Test
    public void testgetSingleLineString() {
    @Test
        Assert.assertTrue(CommonUtils.getBoolean(true, false));
    enum enumClassEmpty {
        Assert.assertTrue(CommonUtils.toBoolean("true"));
        Assert.assertEquals(Double.NaN, CommonUtils.toDouble("a"), 0);
        Assert.assertEquals("_", CommonUtils.escapeFileName("/"));
 * limitations under the License.
        final Map<Character, List<String>> groups = CommonUtils.group(values, x -> x.charAt(0));
    public void testIsEmptyTrimmed() {
        Assert.assertEquals(enumClass.A_B, CommonUtils.valueOf(enumClass.class, null, enumClass.A_B, false));
    public void testToCamelCase() {
    @Test
        final CharSequence emptyValue = "";
    @Test
    public void testGetItem() {
        Assert.assertEquals("a", CommonUtils.toString(new String("a"), ""));
    public void testSplit() {
        Assert.assertEquals("unit'''test", CommonUtils.unescapeBourneShellString("'unit'\\'''\\'''\\''test'"));
    }

        tokens.add("abc");
        Assert.assertEquals("_", CommonUtils.escapeFileName("\""));
        collection.add(1);
    public void testEscapeStringForBourneShell() {
        Assert.assertTrue(CommonUtils.isEmpty(nullValue));
        final ArrayList<Object> collection = new ArrayList<>();
    public void testToDouble() {
 * You may obtain a copy of the License at
    public void testIsJavaIdentifier() {
    public void testMakeDirectoryName() {
        theList.add(0);
        Assert.assertEquals(enumClass.A_B, CommonUtils.valueOf(enumClass.class, "A B", enumClass.A_B, true));
    @Test
    @Test
import org.junit.Rule;
        Assert.assertEquals("Abcd", CommonUtils.toCamelCase("abcd"));
    public void testToLongDef() {
        Assert.assertEquals(false, CommonUtils.isJavaIdentifier("a-b"));
        Assert.assertEquals(CommonUtils.replaceLast("", "bar", "foo"), "");
        Assert.assertNull(CommonUtils.nullIfEmpty(null));
        Assert.assertNull(CommonUtils.toCamelCase(null));
    public void testToStringDef() {
        Assert.assertFalse(CommonUtils.isInt(null));


        Assert.assertEquals(1, CommonUtils.toLong(null, 1L));
    }
    }


    }
        Assert.assertTrue(CommonUtils.equalOrEmptyStrings("", ""));
        Assert.assertEquals(1, CommonUtils.toLong("a", 1L));
    }
    }
    }
        Assert.assertEquals("'string with '\\''two '\\''single quote symbols'", CommonUtils.escapeBourneShellString("string with 'two 'single quote symbols"));
        Assert.assertEquals("", CommonUtils.makeString(null, ':'));
    @Test
        Assert.assertTrue(CommonUtils.isBitSet(1, 1));
        Assert.assertEquals("1", CommonUtils.toString(new Integer(1)));
        Assert.assertEquals("1", CommonUtils.toString(new Integer(1), ""));
    @Test
        Assert.assertEquals("", CommonUtils.escapeIdentifier(""));
        Assert.assertEquals("", CommonUtils.joinStrings(":", nullArray));
        final String value = "abc";

    public void testToBoolean() {
        Assert.assertFalse(CommonUtils.isEmpty(value));

        Assert.assertEquals("string with 'three 'single 'quote symbols", CommonUtils.unescapeBourneShellString("'string with '\\''three '\\''single '\\''quote symbols'"));
        Assert.assertEquals(theList, CommonUtils.copyList(theList));
        Assert.assertEquals(emptyString, CommonUtils.normalizeResourcePath(emptyString));
    @Test
        Assert.assertEquals(2, CommonUtils.toLong("2", 1L));

    public void testNotNull() {
        Assert.assertEquals("abc:def", CommonUtils.joinStrings(":", col));
        var normalizedPath = "place";
        Assert.assertTrue(CommonUtils.isInt("2"));
    @Test
        Assert.assertEquals(theList, CommonUtils.safeCollection(null));
        Assert.assertEquals(normalizedTwoLevelPath, CommonUtils.normalizeResourcePath(pathWithBackslashSuffix));
    public void testValueOf() {
        Assert.assertEquals("a", CommonUtils.getItem(collectionList, 0));
    @Test
        Assert.assertEquals(0.1, CommonUtils.toDouble(0.1), 0);
    @Test
    Assert.assertEquals("\n", CommonUtils.getLineSeparator());
        Assert.assertEquals(0.1, CommonUtils.toDouble("a", 0.1), 0);
        Assert.assertEquals("''\\'''", CommonUtils.escapeBourneShellString("'"));

        final CharSequence nullValue = null;
        Assert.assertEquals("string with 'two 'single quote symbols", CommonUtils.unescapeBourneShellString("'string with '\\''two '\\''single quote symbols'"));
        Assert.assertEquals("", CommonUtils.toString(null, ""));
        Assert.assertNull(CommonUtils.escapeIdentifier(null));
        options.put("A", false);
    @Test
        Assert.assertEquals(0.0, CommonUtils.toDouble(null), 0);
    @Test
        Assert.assertTrue(CommonUtils.isInt(1));
    @Test

    public void testIsLong() {
        Assert.assertEquals(96354, CommonUtils.hashCode("abc"));
    }
        Assert.assertEquals("\\\"", CommonUtils.escapeJavaString("\""));
        List<String> result = new ArrayList<>();
    public void testEscapeDisplayString() {
    }
import java.lang.reflect.InvocationTargetException;
        final ArrayList<String> nullCol = null;
        Assert.assertFalse(CommonUtils.isEmpty(value));
    }

    }
    public void testFixedLengthString() {
        result.add("def");
    @Test
        var pathWithWrongBackslash = "some\\place";
        Assert.assertEquals(enumClass.A_B, CommonUtils.valueOf(enumClass.class, "", enumClass.A_B));
        value.put(0, 'a');
        Assert.assertEquals("1100100", CommonUtils.toBinaryString(100L, 6));
    Assert.assertEquals("\r\n", CommonUtils.getLineSeparator());
        Assert.assertTrue(CommonUtils.isLong(1L));
        final Object value = 0;
    @Test
        Assert.assertEquals(enumClass.A_B, CommonUtils.fromOrdinal(enumClass.class, 0));
        Assert.assertEquals("a", CommonUtils.escapeJavaString("a"));
    }
        Assert.assertEquals("\\t", CommonUtils.escapeJavaString("\t"));
    @Test

        Assert.assertFalse(CommonUtils.getBoolean(value, true));
        var mixedCasesPath = "//some\\place";
        var emptyString = "";
    }
        Assert.assertFalse(CommonUtils.isLong("a"));
    }
    @Test
    @Test
        Assert.assertEquals(Arrays.asList("ccc"), groups.get('c'));
        Assert.assertEquals("abc", CommonUtils.nullIfEmpty("abc"));
        Assert.assertArrayEquals(new String[]{}, CommonUtils.split("", ":"));
        Assert.assertEquals("000102", CommonUtils.toHexString(new byte[]{0, 1, 2}));
    }
        Assert.assertEquals(0.2, CommonUtils.toDouble(0.2, 0.1), 0);
    public void testRemoveTrailingSlash() {
    @Test
    @Rule
    public void testEqualOrEmptyStrings() {
    @Test
    public void testGetBooleanString() {
        Assert.assertEquals("_", CommonUtils.escapeIdentifier("||"));


    @Test
        Assert.assertFalse(CommonUtils.isNotEmpty(emptyValue));
        col.add("abc");
        final HashSet<String> collectionSet = new LinkedHashSet<>();
    }
        tokens.add("def");
    public void testGroup() {
    @Test
    public void testTrim() {
        Assert.assertFalse(CommonUtils.isNotEmpty(nullValue));
    @Test
    public void testGetBooleanObjectDefault() {
    @Test


        Assert.assertEquals(null, CommonUtils.truncateString(null, 3));
    }
        Assert.assertEquals(normalizedTwoLevelPath, CommonUtils.normalizeResourcePath(pathWithMultipleBackslashSuffix));
    public void testSafeCollection() {
    public void testToInt() {
    }

    }
    public void testIsEmptyMap() {
        Assert.assertNull(CommonUtils.splitWithDelimiter(null, ":"));
        Assert.assertTrue(CommonUtils.isNotEmpty(value));
    public void testTruncteString() {
    @Test
    }
        Assert.assertEquals("a", CommonUtils.removeTrailingSlash("a\\"));
    @Test
    }
        Assert.assertEquals("unit''test", CommonUtils.unescapeBourneShellString("'unit'\\'''\\''test'"));
    public void testToStringObject() {
}
        Assert.assertTrue(CommonUtils.isEmpty(emptyValue));
    @Test
        final ArrayList<String> collectionList = new ArrayList<>();
        Assert.assertFalse(CommonUtils.isTrue(null));
    @Test
    @Test
    @Test
    }
        options.put("C", true);
    @Test
        Assert.assertEquals("", CommonUtils.joinStrings(":", nullCol));
    public void testIsEmptyString() {
    }

    }
        Assert.assertEquals("a/", CommonUtils.makeDirectoryName("a"));
        Assert.assertEquals("def", CommonUtils.getRootCause(new Throwable("abc", new Throwable("def"))).getMessage());

    @Test
        final ArrayList<Character> value = new ArrayList<>();
package org.jkiss.utils;
        Assert.assertEquals("Abc", CommonUtils.capitalizeWord("abc"));
    }
        Assert.assertEquals("_", CommonUtils.escapeFileName("\\"));

        Assert.assertFalse(CommonUtils.equalOrEmptyStrings("abc", null));
    public void testNullIfEmpty() {
        final ArrayList<Character> emptyValue = new ArrayList<>();
        Assert.assertNull(CommonUtils.valueOf(enumClass.class, null));
        Assert.assertTrue(CommonUtils.isEmpty(nullValue));
    @Test
        Assert.assertEquals("Ab|Cd", CommonUtils.toCamelCase("ab|cd"));

    public void testEscapeJavaString() throws Exception {
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)))).thenReturn("\r\n");

    }
        Assert.assertEquals("_", CommonUtils.escapeFileName("\u0013"));
        Assert.assertEquals("'unit'\\'''\\'''\\''test'", CommonUtils.escapeBourneShellString("unit'''test"));
    @Test
        Assert.assertTrue(CommonUtils.isEmptyTrimmed(" "));
    @Test
        col.add("def");
        Assert.assertNull(CommonUtils.getRootCause(new InvocationTargetException(null)).getMessage());

    public void testToLong() {


        Assert.assertFalse(CommonUtils.getBoolean("false"));
    }
        Assert.assertTrue(CommonUtils.isEmptyTrimmed(""));

    public void testToHexString() {
        var normalizedTwoLevelPath = "some/place";
        final String emptyValue = "";
        Assert.assertFalse(CommonUtils.getBoolean("false", true));
        Assert.assertArrayEquals(new String[]{"abc", ":def"}, CommonUtils.splitWithDelimiter("abc:def", ":"));

        Assert.assertEquals(Arrays.asList("bbb", "bab"), groups.get('b'));
        collectionSet.add("b");
    @Test
        final Object nullValue = null;
    @Test
    @Test
    @Test
    @Test
        Assert.assertTrue(CommonUtils.getBoolean(nullValue, true));
        Assert.assertEquals("'string with '\\''three '\\''single '\\''quote symbols'", CommonUtils.escapeBourneShellString("string with 'three 'single 'quote symbols"));
/*
        Assert.assertFalse(CommonUtils.equalOrEmptyStrings(null, "def"));
        Assert.assertEquals("a", CommonUtils.removeTrailingSlash("a/"));
        Assert.assertEquals(normalizedTwoLevelPath, CommonUtils.normalizeResourcePath(pathWithWrongBackslash));

        Assert.assertEquals("a/", CommonUtils.makeDirectoryName("a/"));

        Assert.assertEquals("string with 'one single quote symbol", CommonUtils.unescapeBourneShellString("'string with '\\''one single quote symbol'"));
    }
public class CommonUtilsTest {
    @Test


        Assert.assertFalse(CommonUtils.getOption(options, "D", false));
/*
    @Test
    @Test
        Assert.assertEquals("1", CommonUtils.niceFormatFloat(1));
    @Test
        Assert.assertEquals("1.1", CommonUtils.niceFormatDouble(1.1));
        Assert.assertTrue(CommonUtils.startsWithIgnoreCase("abc", "a"));
        Assert.assertTrue(CommonUtils.startsWithIgnoreCase("Abc", "aB"));
        thrown.expect(IllegalArgumentException.class);
    public void testSplitWithDelimiter() {
        final String nullValue = null;

        Assert.assertTrue(CommonUtils.isEmptyTrimmed(null));
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)))).thenReturn(null);
        Assert.assertEquals(theList, CommonUtils.copyList(null));
        Assert.assertEquals("'''unit'''test'''", CommonUtils.unescapeBourneShellString("''\\'''\\'''\\''unit'\\'''\\'''\\''test'\\'''\\'''\\'''"));
        Assert.assertEquals("a", CommonUtils.toString(new String("a")));
    }
        Assert.assertEquals(CommonUtils.replaceLast("foo", "bar", "foo"), "foo");
        Assert.assertFalse(CommonUtils.isTrue(false));
    }
    }
    @Test
    public void testNiceFormatFloat() {
        final String emptyValue = "";


        Assert.assertEquals(1, CommonUtils.toLong(1L));
 *
        Assert.assertEquals(2, CommonUtils.toInt("2", 1));
    }
        Assert.assertEquals(value, CommonUtils.notNull(value, defaultValue));
import org.junit.Test;
        Assert.assertEquals(normalizedTwoLevelPath, CommonUtils.normalizeResourcePath(normalizedTwoLevelPath));
    }
    }
        Assert.assertEquals(1, CommonUtils.toInt("a", 1));
        collection.add("a");
        Assert.assertEquals("abc", CommonUtils.fixedLengthString("abc", 3));
        Assert.assertEquals("", CommonUtils.unescapeBourneShellString("''"));
        final List<String> values = Arrays.asList("aaa", "abb", "bbb", "bab", "ccc");
        Assert.assertTrue(CommonUtils.isEmpty(emptyValue));
    public void testSplitString() {


    @Test

    @Test
        Assert.assertFalse(CommonUtils.isEmpty(value));
        Assert.assertEquals("_", CommonUtils.escapeFileName(":"));

  }
        final ArrayList<Character> theList = new ArrayList<>();
    }
        Assert.assertTrue(CommonUtils.getOption(options, "C", false));
        Assert.assertEquals("abc", CommonUtils.getRootCause(new Throwable("abc")).getMessage());
        Assert.assertEquals("abc", CommonUtils.makeString(tokens, ':'));
    }
        Assert.assertTrue(CommonUtils.equalOrEmptyStrings("abc", "abc"));
        Assert.assertEquals("", CommonUtils.escapeJavaString(""));
    }
        var pathWithBackslashSuffix = "/some/place";
        final ArrayList<Character> nullValue = null;
    }
    @Test
    public void testStartsWithIgnoreCase() {

    public void testNotEmpty() {
        Assert.assertFalse(CommonUtils.startsWithIgnoreCase("abc", ""));
        Assert.assertEquals(CommonUtils.toCamelCase(""), "");
        Assert.assertTrue(CommonUtils.getBoolean("true"));
        Assert.assertEquals(theList, CommonUtils.safeCollection(theList));
        Assert.assertFalse(CommonUtils.isEmptyTrimmed(":"));
    }
        Assert.assertEquals("_", CommonUtils.escapeFileName("<"));
        Assert.assertEquals("a_", CommonUtils.escapeIdentifier("a|"));
        Assert.assertEquals(enumClass.A_B, CommonUtils.valueOf(enumClass.class, " ", enumClass.A_B, false));
        Assert.assertTrue(CommonUtils.isLong("2"));
    public void testGetBooleanStringDefault() {
        Assert.assertEquals("", CommonUtils.toHexString(new byte[]{}));

        Assert.assertFalse(CommonUtils.isInt("a"));
        Assert.assertTrue(CommonUtils.getBoolean("", true));
    }
        Assert.assertEquals(0.1, CommonUtils.toDouble(null, 0.1), 0);
    @Test
        Assert.assertEquals("\\n\\r\\t:", CommonUtils.escapeDisplayString("\n\r\t:"));
import java.util.*;
    @Test
    @Test

    public void testReplaceLast() {
    public void testCapitalizeWord() {
 *
        Assert.assertEquals(true, CommonUtils.isJavaIdentifier("aa"));
        Assert.assertEquals(0.1, CommonUtils.toDouble("0.1"), 0);


        Assert.assertEquals(0.2, CommonUtils.toDouble("0.2", 0.1), 0);

        Assert.assertEquals("01010", CommonUtils.toBinaryString(10L, 5));
    public void testCompactWhiteSpaces() {
        Assert.assertEquals("_", CommonUtils.escapeFileName(">"));
    public void testCopyList() {
    }
    @Test
    public void testIsBitSet() {
        Assert.assertEquals(2, CommonUtils.toLong(2L, 1L));
    public void testSafeList() {
        Assert.assertEquals("b", CommonUtils.getItem(collectionSet, 1));
    public void testHashCode() {
    public void testIsTrue() {
        Assert.assertEquals(false, CommonUtils.isJavaIdentifier("|"));
        Assert.assertEquals("", CommonUtils.toString(null));
    @Test
        Assert.assertFalse(CommonUtils.startsWithIgnoreCase("", "a"));
        collectionSet.add("a");
    @Test
        Assert.assertEquals("_", CommonUtils.escapeFileName("*"));
        final CharSequence value = "abc";

        Assert.assertFalse(CommonUtils.isBitSet(1, 2));


        Assert.assertEquals("", CommonUtils.toHexString(null));
    }
        Assert.assertEquals("1", CommonUtils.niceFormatDouble(1.0));
        var pathWithMultipleBackslashSuffix = "//some/place";
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

    PowerMockito.mockStatic(System.class);
    public void testMakeString() {
        Assert.assertEquals(CommonUtils.replaceLast("foobarbarbar", "foo", "bar"), "barbarbarbar");
        value.add('a');
        Assert.assertEquals("", CommonUtils.toHexString(null, 0, 0));

        Assert.assertEquals("", CommonUtils.capitalizeWord(""));
        Assert.assertEquals("1.1", CommonUtils.niceFormatFloat(1.1f));
  public void testGetLineSeparator() {
        Assert.assertFalse(CommonUtils.toBoolean(null));



    @Test
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Test
        Assert.assertEquals(normalizedPath, CommonUtils.normalizeResourcePath(normalizedPath));
        Assert.assertEquals(Arrays.asList("aaa", "abb"), groups.get('a'));
    }
        Assert.assertEquals(0, CommonUtils.hashCode(null));
        Assert.assertNull(CommonUtils.trim(null));
    }
        Assert.assertEquals("abc:def", CommonUtils.joinStrings(":", new String[]{"abc", "def"}));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Assert.assertNotNull(CommonUtils.splitString("", ':'));
    }
 * you may not use this file except in compliance with the License.

    }

    }
    }
        final HashMap<Integer, Character> nullValue = null;
    public void testUnescapeStringForBourneShell() {
    }
    }
    @Test
 */
    }
    }
import org.junit.rules.ExpectedException;
    public void testIsEmptyCharSequence() {
        Assert.assertEquals("\t\r\n", CommonUtils.unescapeDisplayString("\\t\\r\\n"));
        Assert.assertEquals(new String[]{"a"}, CommonUtils.filterCollection(collection, String.class).toArray());

    }
        Assert.assertEquals("abc", CommonUtils.notEmpty("abc"));
        Assert.assertFalse(CommonUtils.getOption(null, "A"));

    public void testUnescapeDisplayString() {
    @Test
        Assert.assertFalse(CommonUtils.getBoolean("null"));
        final Object value = "value";
        final String nullValue = null;
    public void testToDoubleDef() {
        options.put("B", false);
        Assert.assertEquals(CommonUtils.replaceLast("foobarfoobar", "foo", "bar"), "foobarbarbar");

        Assert.assertEquals("abc def", CommonUtils.compactWhiteSpaces("abc  def"));
        final HashMap<Integer, Character> value = new HashMap<>();

        Assert.assertEquals("a", CommonUtils.escapeFileName("a"));
    public void testEscapeIdentifier() {
    @Test
    }
        final HashMap<String, Boolean> options = new HashMap<>();
        Assert.assertEquals("''", CommonUtils.escapeBourneShellString(""));
        Assert.assertTrue(CommonUtils.isEmpty(nullValue));
        Assert.assertFalse(CommonUtils.isLong(null));
        Assert.assertEquals("", CommonUtils.escapeFileName(null));

        Assert.assertTrue(CommonUtils.isEmpty(emptyValue));
        //Assert.assertNotEquals(enumClass.A_B, CommonUtils.fromOrdinal(enumClass.class, 3));
    }
    }

        Assert.assertEquals("abcdef", CommonUtils.trim("abcdef "));
        final String value = "abc";
        Assert.assertEquals(normalizedTwoLevelPath, CommonUtils.normalizeResourcePath(mixedCasesPath));
        Assert.assertEquals("'", CommonUtils.unescapeBourneShellString("''\\'''"));
    public void testToBinaryString() {
        Assert.assertEquals("'string with '\\''one single quote symbol'", CommonUtils.escapeBourneShellString("string with 'one single quote symbol"));
        Assert.assertFalse(CommonUtils.isEmpty(value));
        result.add("abc");
    }

 *
    @Test
        final ArrayList<String> col = new ArrayList<String>();
        Assert.assertEquals("abc:def", CommonUtils.makeString(tokens, ':'));
    }
        Assert.assertEquals(1, CommonUtils.toInt(1));
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void testIsInt() {
        Assert.assertTrue(CommonUtils.isTrue(true));
        Assert.assertEquals(theList, CommonUtils.safeList(null));



        Assert.assertNull(CommonUtils.nullIfEmpty(""));
        Assert.assertEquals("Abc", CommonUtils.capitalizeWord("Abc"));
    public void testToIntDef() {
        Assert.assertEquals("a", CommonUtils.removeTrailingSlash("a"));
        collectionList.add("a");
        Assert.assertEquals("'unit'\\'''\\''test'", CommonUtils.escapeBourneShellString("unit''test"));
    }
    public void testNormalizeResourcePath() {

        Assert.assertEquals("_", CommonUtils.escapeIdentifier("|"));
import org.junit.Assert;
        final Object defaultValue = "defaultValue";
    }

        Assert.assertEquals(enumClass.A_B, CommonUtils.valueOf(enumClass.class, "A_B", enumClass.A_B));


*/
    public void testJoinStringsCollection() {

 * Licensed under the Apache License, Version 2.0 (the "License");


        Assert.assertEquals(2, CommonUtils.toInt(2, 1));
    }
        Assert.assertArrayEquals(result.toArray(), CommonUtils.splitString("abc:def", ':').toArray());
    }

    @Test
        Assert.assertFalse(CommonUtils.equalOrEmptyStrings("abc", "def"));

    public void testIsEmptyCollection() {
        Assert.assertEquals(1, CommonUtils.toInt(null, 1));

        CommonUtils.fromOrdinal(enumClassEmpty.class, 3);
        final HashMap<Integer, Character> emptyValue = new HashMap<>();

        Assert.assertEquals("a¶bc d ", CommonUtils.getSingleLineString("a\nb\rc\td\0"));
        Assert.assertEquals(theList, CommonUtils.safeList(theList));
        A_B,

    }
        Assert.assertEquals("string", CommonUtils.unescapeBourneShellString("'string'"));
    @Test
    enum enumClass {
    }
        Assert.assertTrue(CommonUtils.isEmpty(nullValue));

 * See the License for the specific language governing permissions and
    }

    public void testFromOrdinal() {
    }
    public void testNiceFormatDouble() {
