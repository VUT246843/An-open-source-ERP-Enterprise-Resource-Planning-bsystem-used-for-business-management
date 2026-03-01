
 * See the License for the specific language governing permissions and
        Assert.assertEquals(999000000, ts.getNanos());
        Assert.assertTrue(result.contains(".000"));


        String dateStr = "1970-01-01 03:46:40.XYZ";
    public void testParseMillisecondsToNanoseconds() throws ParseException {
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        ts.setNanos(123);


        Assert.assertNull(result);
        ts.setNanos(123000000);
    }
        Date result = format.parse(dateStr);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void testParseTimestampWithZeroNanos() throws ParseException {
import java.util.Date;
        Timestamp ts = new Timestamp(1000000L);

        Timestamp ts = new Timestamp(1000000L);
        Assert.assertTrue(result instanceof Timestamp);
    public void testFormatWithPrefixAndPostfix() {
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss[.fff]");


    }
 *


    @Test

    }
        Assert.assertTrue(result.contains(".123"));

        String dateStr = "1970-01-01 03:46:40.123";


    public void testParseWithSSS() throws ParseException {
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss[.fff]");
    }

    @Test
        Assert.assertTrue(result.contains(".123"));
    }

import java.sql.Timestamp;
        Assert.assertEquals(123000000, ts.getNanos());
        Assert.assertEquals(1000000, ts.getNanos());
    }


        String result = format.format(date);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fff");
    public void testFormatRegularDateWithNanosPattern() {
        original.setNanos(789000000);
        ts.setNanos(123456789);
    }
        Assert.assertNull(result);
    }

        Date result = format.parse(dateStr);

        String result = format.format(ts);
        Date result = format.parse(dateStr);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fffffffff");
    }
        Date parsed = format.parse(formatted);
 *     http://www.apache.org/licenses/LICENSE-2.0
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fff");
        Timestamp ts = new Timestamp(1000000L);

    public void testRoundTripMilliseconds() throws ParseException {
    public void testFormatMillisecondsWithQuotedText() {
        Timestamp ts = (Timestamp) result;
    }
    public void testFormatRegularDateWithOptionalNanosZeroMillis() {

        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fffffffff");
 *

        Timestamp ts = (Timestamp) result;
        Date result = format.parse(dateStr);
        Timestamp ts = new Timestamp(1000000L);
        Assert.assertTrue(result.contains(".999"));
    @Test
    }
 * you may not use this file except in compliance with the License.
        Date result = format.parse(dateStr);
        Assert.assertTrue(result.contains(".123"));

    public void testParseTimestampWithShortNanos() throws ParseException {
        Date date = new Date(1000000L);

        String formattedDate = format.format(ts);
    @Test
        Assert.assertTrue(result.contains(".567"));
 * DBeaver - Universal Database Manager
    }

    }
    @Test
        String dateStr = "1970-01-01 03:46:40.001";

        ts.setNanos(567000000);
        Assert.assertEquals(123000000, ts.getNanos());
        String dateStr = "1970-01-01 03:46:40.500";
        String result = format.format(ts);
/*
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String result = format.format(ts);
    }


        Timestamp ts = new Timestamp(1000000L);
        Date date = new Date(1000000L);
        Assert.assertNotNull(result);
 * Copyright (C) 2010-2026 DBeaver Corp and others

        Date result = format.parse(dateStr);
    @Test
        Timestamp ts = new Timestamp(1000000L);
    public void testParseInvalidNanoCharacter() throws ParseException {

        Assert.assertEquals(500000000, ts.getNanos());
        Assert.assertTrue(result instanceof Timestamp);
        Assert.assertEquals(original.getNanos(), result.getNanos());
public class ExtendedDateFormatTest {

    public void testParsePartialNanos() throws ParseException {

        Timestamp ts = new Timestamp(1000000L);
    public void testFormatRegularDateWithMilliseconds() {

        String formatted = format.format(original);
    @Test
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss[.fff]");
    @Test
    public void testParseWithoutNanos() throws ParseException {
        ts.setNanos(123456789);
        String result = format.format(ts);
        String result = format.format(ts);
        Timestamp ts = new Timestamp(1000000L);
    @Test


        Assert.assertTrue(result instanceof Timestamp);
        String result = format.format(ts);
    public void testParseWithSixDigitNanos() throws ParseException {

        Date date = new Date(1000500L);
    }
    }

        String dateStr = "1970-01-01 03:46:40.12";
        Date parsed = format.parse(formatted);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fff", Locale.US);
        Timestamp ts = (Timestamp) result;
    }
    public void testParseTimestampWithMilliseconds() throws ParseException {
        Assert.assertEquals(789000000, result.getNanos());
    public void testConstructorWithLocale() {
        Timestamp ts = new Timestamp(1000000L);
    public void testFormatTimestampWithMilliseconds() {
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.ff");
    public void testFormatTimestampWithOptionalNanos() {
        String dateStr = "1970-01-01 03:46:40.123456";
        Assert.assertTrue(result.contains(".890000000"));
    }
        String dateStr = "1970-01-01 03:46:40.250";
        Timestamp ts = new Timestamp(1000000L);
    }
    public void testFormatRegularDateWithNanos() {
    public void testFormatTruncatesNanos() {
        Assert.assertFalse(result.contains("."));

    @Test
        Assert.assertFalse(result instanceof Timestamp);
        Date result = format.parse(dateStr);
    }
        Assert.assertFalse(result.contains("."));
        Assert.assertTrue(result instanceof Timestamp);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.ffffff");
    }
    @Test
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        ts.setNanos(999000000);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        Assert.assertEquals(123456000, ts.getNanos());
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss");
 * limitations under the License.

        String result = format.format(ts);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss[.fff]");
    public void testFormatWithNonOptionalNanosAndZeroValue() {

        Assert.assertTrue(result instanceof Timestamp);
        String dateStr = "1970-01-01 03:46:40.999";
    }
        String result = format.format(ts);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    public void testParseInvalidMilliseconds() throws ParseException {
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss[.fff000]");

        Assert.assertNotNull(result);
    }

    @Test
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd 'T' HH:mm:ss.fff");
        Assert.assertFalse(result.contains("456"));
    @Test
    public void testFormatTimestampWithZeroMilliseconds() {
        Timestamp ts = new Timestamp(1000123L);

    }

        Assert.assertTrue(result.contains(".456"));
import java.util.Locale;

        Date result = format.parse(dateStr);

    @Test
        Timestamp ts = (Timestamp) result;

    }
        Timestamp resultTs = (Timestamp) result;
    }


        ts.setNanos(456000000);
    @Test
        Assert.assertTrue(result.contains(".500"));

        Assert.assertTrue(result.contains(".123"));
        String result = format.format(date);
        ts.setNanos(123456789);
        Assert.assertEquals(250000000, ts.getNanos());
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        Assert.assertTrue(formattedDate.contains("T"));
    public void testParseMillisecondsWithLeadingZero() throws ParseException {
        Assert.assertEquals(120000000, ts.getNanos());


        Timestamp ts = new Timestamp(1000000L);
    @Test
    @Test

        Assert.assertTrue(result.contains(".123"));
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    }
    @Test
        Assert.assertTrue(parsed instanceof Timestamp);
    @Test
        Timestamp ts = new Timestamp(1000000L);
        Assert.assertTrue(result instanceof Timestamp);
        Timestamp ts = new Timestamp(1000000L);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        ts.setNanos(123456789);
    @Test
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        Date result = format.parse(dateStr);
    }
        Assert.assertTrue(result.contains(".000000123"));
        Timestamp ts = new Timestamp(1000000L);
        String dateStr = "1970-01-01 03:46:40";
    @Test
    public void testRoundTripFormatAndParse() throws ParseException {
        String result = format.format(ts);
        Assert.assertTrue(result.contains(".500"));
    public void testParseMillisecondsWithQuotedText() throws ParseException {
        Timestamp ts = (Timestamp) result;

        ts.setNanos(987654321);
    public void testParseTimestampWithNanoseconds() throws ParseException {
        Date date = new Date(1234567890L);
    public void testFormatWithLeadingZeros() {
import java.text.ParseException;
        Assert.assertTrue(result instanceof Timestamp);
import org.junit.Assert;
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        ts.setNanos(0);
    @Test

    @Test
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.ffffff");
        Timestamp ts = new Timestamp(1000000L);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss[.SSS]");
        Assert.assertEquals(123456789, ts.getNanos());

    @Test
        String dateStr = "1970-01-01 03:46:40.000";
    @Test


    }
        Assert.assertTrue(result.contains(".890"));

    @Test
    @Test

        Timestamp original = new Timestamp(1234567890L);
        Timestamp ts = (Timestamp) result;
    @Test
        Date result = format.parse(dateStr);
        Date result = format.parse(dateStr);
        Assert.assertEquals(123000000, resultTs.getNanos());
        ts.setNanos(0);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fff");

    public void testFormatWithSixDigitNanos() {
        String result = format.format(date);
        ts.setNanos(500000000);
        String result = format.format(ts);
        Timestamp original = new Timestamp(1234567890L);
        Timestamp ts = new Timestamp(1000000L);


        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd 'T' HH:mm:ss.fff");
    }
        ts.setNanos(123456789);
    @Test
        Timestamp result = (Timestamp) parsed;
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    }

    public void testFormatMillisecondsWithTruncation() {

        Assert.assertTrue(result.matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}"));


        ts.setNanos(123456789);
}

        Assert.assertFalse(result.contains("."));

    }
        ts.setNanos(123456789);
    }
    @Test
        Timestamp ts = (Timestamp) result;
        Assert.assertTrue(result.contains("T"));
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fff");
        String result = format.format(ts);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    @Test
 */
    public void testFormatMillisecondsOptionalWithZero() {
        String formatted = format.format(original);
        Timestamp ts = new Timestamp(1000000L);
    }
        Assert.assertNotNull(result);
        Timestamp ts = new Timestamp(1000000L);
    @Test
    @Test
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fffffffff");
        String result = format.format(ts);
    public void testFormatMillisecondsWithLocale() {
        String result = format.format(ts);
        Assert.assertTrue(result.contains(".123000"));
        String dateStr = "1970-01-01 03:46:40.123456789";
        Timestamp ts = (Timestamp) result;
        Date result = format.parse(dateStr);

package org.jkiss.utils.time;
        String result = format.format(ts);

        String dateStr = "1970-01-01 T 03:46:40.123";
        Timestamp result = (Timestamp) parsed;
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fffffffff");
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss[.SSS]");

        Assert.assertTrue(result.contains(".123456"));
        Assert.assertNotNull(formattedDate);
    }
import org.junit.Test;




        String result = format.format(date);
    }
    }
    public void testFormatWithQuotedText() {
        ts.setNanos(0);
        String result = format.format(ts);
        Assert.assertTrue(result.contains(".000"));

        String result = format.format(ts);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        String result = format.format(date);
        ts.setNanos(123456789);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fffffffff");
    @Test
        Assert.assertTrue(result instanceof Timestamp);
 * Unless required by applicable law or agreed to in writing, software
        Date result = format.parse(formattedDate);

    @Test
    public void testFormatMillisecondsWithOptionalPattern() {
    }
    }
    @Test
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Timestamp ts = new Timestamp(1000000L);

    public void testFormatWithSSS() {
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fff");
    public void testFormatTimestampWithNanoseconds() {

    public void testParseWithQuotedText() throws ParseException {
    public void testFormatRegularDateWithOptionalNanos() {
        Assert.assertTrue(result.contains(".000"));
        original.setNanos(123456789);
    @Test
        Date date = new Date(1234567890L);
        Timestamp ts = (Timestamp) result;
    public void testFormatTimestampWithOptionalNanosZero() {
        ts.setNanos(123456789);

        Assert.assertNotNull(result);
    @Test
        Assert.assertTrue(result.contains("123456789"));
        String result = format.format(ts);

 * You may obtain a copy of the License at
        String result = format.format(ts);

    public void testFormatTimestampWithShortNanos() {
        Assert.assertTrue(result.contains(".98"));
        Assert.assertTrue(result.contains(".123"));
        Assert.assertTrue(parsed instanceof Timestamp);
        Assert.assertTrue(result instanceof Timestamp);

        String dateStr = "1970-01-01 03:46:40.ABC";
    @Test
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fffffffff");
        ts.setNanos(0);
        ExtendedDateFormat format = new ExtendedDateFormat("yyyy-MM-dd HH:mm:ss.fff");
    @Test
        String result = format.format(ts);
        Assert.assertTrue(result instanceof Timestamp);
 * Licensed under the Apache License, Version 2.0 (the "License");
        Date result = format.parse(dateStr);
