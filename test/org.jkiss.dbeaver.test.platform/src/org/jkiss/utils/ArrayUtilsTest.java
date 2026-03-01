        Assert.assertTrue(ArrayUtils.contains(new short[]{(short) 0}, (short) 0));

    }


    }
 * limitations under the License.
    }
    }
        Assert.assertFalse(ArrayUtils.contains(arr, 0L));
    public void testContainsRef() {
        Assert.assertFalse(ArrayUtils.contains(new char[]{'b'}, 'a'));
    }
        Assert.assertFalse(ArrayUtils.isEmpty(new short[]{(short) 0}));

import org.junit.Test;
        Assert.assertTrue(ArrayUtils.isEmpty(new Object[]{}));
        List<String> list = new ArrayList<>();


    }

 * Unless required by applicable law or agreed to in writing, software

    @Test
        short[] arr = null;
        Assert.assertFalse(ArrayUtils.containsRef(new String[]{}, "a"));
    }
    @Test
        Assert.assertArrayEquals(new Object[]{'a', 'b', 'c'}, ArrayUtils.add(Object.class, new Object[]{'a', 'b'}, 'c'));
 * DBeaver - Universal Database Manager
    public void testIsEmpty() {
 */
    public void testContainsInt() {
 *     http://www.apache.org/licenses/LICENSE-2.0

    public void testIsEmptyLong() {
        Assert.assertFalse(ArrayUtils.contains(new int[]{1}, 0));
    @Test
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

    }


import java.util.ArrayList;
    }
        List<Object> emptyList = new ArrayList<>();
        Assert.assertFalse(ArrayUtils.isEmpty(new int[]{0}));
        Assert.assertFalse(ArrayUtils.containsIgnoreCase(new String[]{"b"}, "A"));
    @Test
        short[] arr = null;
    public void testInsertArea() {
    @Test
    @Test
    @Test
        Assert.assertEquals(-1, ArrayUtils.indexOf(new byte[]{(byte) 'a', (byte) 'b', 'c'}, 1, (byte) 'a'));
        Assert.assertFalse(ArrayUtils.contains(arr, (short) 0));
    }
        Assert.assertFalse(ArrayUtils.contains(arr, 'a'));
    }
        int[] arr = null;
        String[] arr = null;
        Assert.assertArrayEquals(new Object[]{1L, 2L}, ArrayUtils.remove(Object.class, new Object[]{1L, 2L, 3L}, 3L));
        Assert.assertEquals(0, ArrayUtils.indexOf(new String[]{"a"}, "a"));
        Assert.assertTrue(ArrayUtils.isEmpty(new long[]{}));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Assert.assertArrayEquals(new Object[]{'a', 'c'}, ArrayUtils.deleteArea(Object.class, new Object[]{'a', 'b', 'c'}, 1, 1));
        Assert.assertArrayEquals(new Object[]{1L, 3L}, ArrayUtils.remove(Object.class, new Object[]{1L, 2L, 3L}, 2L));
    public void testContainsIgnoreCase() {
    @Test
        Assert.assertTrue(ArrayUtils.isEmpty(arr));
    public void testRemove() {
    public void testDeleteArea() {
    @Test
        Assert.assertFalse(ArrayUtils.contains(new short[]{}, (short) 0));
    public void testContainsObjectType() {
        Assert.assertFalse(ArrayUtils.contains(new long[]{1L}, 0L));
    @Test
    public void testContainsChar() {
    public void testContainsShort() {

        Assert.assertFalse(ArrayUtils.contains(new String[]{}, "a"));
        list.add("a");
        List<String> list = new ArrayList<>();
    @Test
    public void testIsEmptyShort() {
    public void testIndexOf() {
        long[] arr = null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        char[] arr = null;
        Assert.assertArrayEquals(new Object[]{1L, 2L, 3L}, ArrayUtils.remove(Object.class, new Object[]{1L, 2L, 3L}, 4L));
package org.jkiss.utils;
        Assert.assertFalse(ArrayUtils.contains(new String[]{"b"}, "a"));


        list.add("a");
        Assert.assertEquals(-1, ArrayUtils.indexOf(new String[]{"a"}, "b"));
 *
    public void testSafeArray() {
    @Test
    public void testIndexOfByte() {
    }
    }
        Assert.assertFalse(ArrayUtils.contains(new char[]{}, 'a'));

        Assert.assertTrue(ArrayUtils.contains(new long[]{0L}, 0L));
    }

        Assert.assertFalse(ArrayUtils.containsAny(new String[]{}, new String[]{"a"}));
    @Test
        Assert.assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.concatArrays(new String[]{"a"}, new String[]{"b"}));
        Assert.assertTrue(ArrayUtils.isEmpty(arr));
    @Test

 *
        Assert.assertArrayEquals(new Object[]{'a'}, ArrayUtils.deleteArea(Object.class, new Object[]{'a', 'b', 'c'}, 1, 2));
 * Licensed under the Apache License, Version 2.0 (the "License");
        Assert.assertEquals(list, ArrayUtils.safeArray(new String[]{"a"}));

        String[] arr = null;
        long[] arr = null;
        Assert.assertTrue(ArrayUtils.isEmpty(arr));
        Assert.assertTrue(ArrayUtils.isEmpty(new int[]{}));
        Assert.assertEquals(new String[]{"a"}, ArrayUtils.toArray(Object.class, list));
    @Test
        Assert.assertFalse(ArrayUtils.contains(new long[]{}, 0L));
    }
        Assert.assertTrue(ArrayUtils.containsIgnoreCase(new String[]{"a"}, "A"));
    @Test
    public void testToArray() {
        Assert.assertTrue(ArrayUtils.contains(new int[]{0}, 0));
    }
    }
    @Test

    }
        Assert.assertTrue(ArrayUtils.isEmpty(arr));
 *
        Assert.assertTrue(ArrayUtils.containsRef(new String[]{"a"}, "a"));
        Assert.assertFalse(ArrayUtils.containsIgnoreCase(new String[]{"a"}, null));
    public void testAdd() {

        Assert.assertFalse(ArrayUtils.contains(new short[]{(short) 1}, (short) 0));
        Object[] arr = null;
        Assert.assertTrue(ArrayUtils.containsIgnoreCase(new String[]{"a"}, "a"));

        Assert.assertFalse(ArrayUtils.isEmpty(new Object[]{0}));

import java.util.List;
        int[] arr = null;
        Assert.assertArrayEquals(new Object[]{'a', 'b', 'c'}, ArrayUtils.insertArea(Object.class, new Object[]{'a', 'c'}, 1, new Object[]{'b'}));
        Assert.assertEquals(1, ArrayUtils.indexOf(new byte[]{(byte) 'a', (byte) 'b', 'c'}, 1, (byte) 'b'));
        Assert.assertFalse(ArrayUtils.contains(arr, 0));
        Assert.assertFalse(ArrayUtils.containsIgnoreCase(new String[]{}, "A"));
    @Test
public class ArrayUtilsTest {
        Assert.assertTrue(ArrayUtils.contains(new char[]{'a'}, 'a'));
/*
    }
    public void testContainsLong() {
 * See the License for the specific language governing permissions and
    @Test
        Assert.assertFalse(ArrayUtils.contains(arr, "a"));
        Assert.assertTrue(ArrayUtils.contains(new String[]{"a"}, "a"));
        Assert.assertFalse(ArrayUtils.containsRef(new String[]{"b"}, "a"));
    }
        Assert.assertTrue(ArrayUtils.isEmpty(new short[]{}));
        Assert.assertEquals(emptyList, ArrayUtils.safeArray(null));

    public void testConcatArrays() {
    @Test

    public void testContains() {
        Assert.assertFalse(ArrayUtils.containsAny(new String[]{"b"}, new String[]{"a"}));
        Assert.assertFalse(ArrayUtils.contains(new int[]{}, 0));
        Assert.assertFalse(ArrayUtils.isEmpty(new long[]{0L}));
}
        Assert.assertTrue(ArrayUtils.containsAny(new String[]{"a"}, new String[]{"a"}));
    @Test
import org.junit.Assert;
    }

    public void testIsEmptyInt() {
