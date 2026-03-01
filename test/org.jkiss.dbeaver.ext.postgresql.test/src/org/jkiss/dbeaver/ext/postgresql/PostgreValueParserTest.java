        tester.accept("{one,two, four with spaces ,f{i,v}e}",
            "Junk after closing right brace",
        Assert.assertEquals("{{{1.1,22.22},{3.3,44.44}},{1.1,22.22},{3.3,44.44}}}",
            new String[]{},
            new JDBCCollection(session.getProgressMonitor(), arrayStringItemType, PostgreArrayValueHandler.INSTANCE, Arrays.stream(values).map(make2d).toArray());
        tester.accept("{one,two,\" four with spaces \",\"f{i,v}e\"}", make2d.apply(new String[]{"one", "two", " four with spaces ", "f{i,v}e"}));
    }
        Assert.assertArrayEquals(new Object[]{ innerCollection3, innerCollection3 },

        Mockito.when(arrayBooleanItemType.getDataKind()).thenReturn(DBPDataKind.ARRAY);
        Mockito.when(arrayDoubleItemType.getComponentType(session.getProgressMonitor())).thenReturn(doubleItemType);
        Assert.assertArrayEquals(

        Mockito.when(doubleItemType.getTypeID()).thenReturn(Types.DOUBLE);
    }
//        Mockito.when(dataFormatterProfile.createFormatter(DBDDataFormatter.TYPE_NAME_NUMBER, doubleItemType)).thenReturn(numberDataFormatter);
    public void convertArrayToStringShouldNotEscapeQuotesForNativeFormat() {

        Boolean[] booleans = {true, false};
        Assert.assertEquals(1, PostgreValueParser.convertStringToValue(session, intItemType, "1"));
 */
        Mockito.when(arrayIntItemType.getDataKind()).thenReturn(DBPDataKind.ARRAY);

        Assert.assertEquals(intNullList, PostgreValueParser.parseArrayString("{1,22,333,NULL}", ","));
        Mockito.when(arrayBooleanItemType.getArrayDelimiter()).thenReturn(",");
        //todo: add support alternatives to "true/false"
    }
 * DBeaver - Universal Database Manager
    @Mock

        int3List.add(int2List);
        Mockito.when(booleanItemType.getTypeID()).thenReturn(Types.BOOLEAN);
import org.jkiss.junit.DBeaverUnitTest;
        List<String> intNullList = new ArrayList<>(intList);
//        Mockito.when(intItemType.getFullTypeName()).thenReturn("test_intItemType");

import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;

                (Object[]) PostgreValueParser.convertStringToValue(session, arrayIntItemType, "{1,22}"));


        Assert.assertEquals("{{1.1,22.22},3.3,44.44}},{1.1,22.22},{3.3,",
                new JDBCNumberValueHandler(doubleItemType, dbdFormatSettings),
        Assert.assertEquals("{{{1.1,22.22},3.3,44.44}},{1.1,22.22},{3.3,44.44}",
        Assert.assertArrayEquals(booleans, (Object[]) PostgreValueParser.convertStringToValue(session, arrayBooleanItemType, "{TRUE,FALSE}"));
import org.mockito.Mock;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Test
        Mockito.when(arrayIntItemType.getArrayDelimiter()).thenReturn(",");
        final BiConsumer<String, DBDCollection> tester = (expected, collection) ->
                new Double[]{1.1, 22.22});
    @Mock
        Assert.assertEquals(true, PostgreValueParser.convertStringToValue(session, booleanItemType, "true"));
    @Mock
//        Mockito.when(arrayIntItemType.getFullTypeName()).thenReturn("test_arrayIntItemType");
                Arrays.stream(values).map(make2d).toArray()
//        Assert.assertArrayEquals(booleans, (Object[]) PostgreValueParser.convertStringToValue(session, arrayBooleanItemType,"{'on,'off'}", true));
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCNumberValueHandler;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDialect;

                new Object[]{innerCollection1, innerCollection2});
import java.util.function.BiConsumer;
//        Mockito.when(structItemType.getDataKind()).thenReturn(DBPDataKind.STRUCT);
                PostgreValueParser.convertStringToValue(session, arrayDoubleItemType, "{{{1.1,22.22},3.3,44.44}},{1.1,22.22},{3.3,44.44}"));
            IllegalArgumentException.class,
        Mockito.when(arrayBooleanItemType.getComponentType(session.getProgressMonitor())).thenReturn(booleanItemType);

 *     http://www.apache.org/licenses/LICENSE-2.0
            new String[]{"ab", "cd", null, "NULL", " spa ce "},
        Assert.assertEquals("(\"(1,2,3)\",\"(4,5,6)\")", PostgreValueParser.generateObjectString(new Object[]{"(1,2,3)","(4,5,6)"}));
    private final PostgreDialect sqlDialect = new PostgreDialect();
    public void testParsePrimitiveArray() {
    public void setUp() throws Exception {
import org.jkiss.dbeaver.model.exec.DBCSession;
        Assert.assertNotEquals(doublesList, PostgreValueParser.parseArrayString("{1.123,2.1421324124421}", "."));
        Assert.assertEquals(doublesList, PostgreValueParser.parseArrayString("{1.123,2.1421324124421}", ","));



        Assert.assertNotEquals("ABC", PostgreValueParser.convertStringToValue(session, stringItemType, "A"));
        Assert.assertArrayEquals(new String[]{"A a", "", "B", ""}, PostgreValueParser.parseSingleObject("\"A a\",\"\",B,\"\""));

                PostgreArrayValueHandler.INSTANCE,
        Assert.assertArrayEquals(new String[]{"A", "B"},
        Mockito.when(intItemType.getDataKind()).thenReturn(DBPDataKind.ANY);
    private PostgreDataType arrayDoubleItemType;
        List<String> doublesList = new ArrayList<>();
import org.junit.Assert;

            PostgreValueParser.convertStringToValue(session, arrayDoubleItemType, "{{{1.1,22.22},{3.3,44.44}},{1.1,22.22},{3.3,44.44}}}"));
        Assert.assertThrows(
        stringList.add("B");
import org.junit.Before;

        final Function<String[], DBDCollection> make2d = values ->
        Assert.assertNotEquals(new Integer[]{33333, 22},


        //Bad input data tests
//        Mockito.when(arrayStructItemType.getComponentType(session.getProgressMonitor())).thenReturn(structItemType);

    @Test
    @Mock
 * Copyright (C) 2010-2025 DBeaver Corp and others
        tester.accept("NULL", make2d.apply(null));
        Assert.assertEquals("(\"A\",\"B\")", PostgreValueParser.generateObjectString(new String[]{"A", "B"}));
        Mockito.when(arrayStringItemType.getDataKind()).thenReturn(DBPDataKind.ARRAY);
 * See the License for the specific language governing permissions and
        Assert.assertThrows(

    @Mock
//        Mockito.when(doubleItemType.getFullTypeName()).thenReturn("test_doubleItemType");
            PostgreValueParser.parsePrimitiveArray("{}", Function.identity(), String[]::new));
        int2List.add(intList);
        List<List<List<String>>> int3List = new ArrayList<>();
    public void generateObjectString() {
    private PostgreDataType arrayIntItemType;
        Assert.assertEquals(intList, PostgreValueParser.parseArrayString("{1,22,333}", ","));
    private PostgreDataType arrayStringItemType;

import java.sql.Types;
        JDBCCollection innerCollection2 = new JDBCCollection(session.getProgressMonitor(), doubleItemType,
        Assert.assertArrayEquals(new Integer[]{1, 22},
//        Assert.assertEquals(int2List, PostgreValueParser.parseArrayString("ARRAY[[1,22,333],[1,22,333]]", ","));
        tester.accept("{{a,b,c},{d,e,f}}", make3d.apply(new String[][] {{"a", "b", "c"}, {"d", "e", "f"}}));
            );
    public void convertStringToValue() throws DBCException {
            new String[]{null, "NULL"},
        Assert.assertArrayEquals(new String[]{"A", " B"}, PostgreValueParser.parseSingleObject("A, B"));

        Mockito.when(arrayDoubleItemType.getArrayDelimiter()).thenReturn(",");
    @Mock
    @Mock
                PostgreValueParser.convertStringToValue(session, arrayDoubleItemType, "{{1.1,22.22},3.3,44.44}},{1.1,22.22},{3.3,"));
import org.junit.Test;


                PostgreValueParser.convertStringToValue(session, arrayDoubleItemType, "{{1.1,22.22},,44.44}},{1.1,22.22},{3.3,}"));
        tester.accept("{}", make2d.apply(new String[] {}));
        Mockito.when(arrayDoubleItemType.getDataKind()).thenReturn(DBPDataKind.ARRAY);
        Assert.assertArrayEquals(
    private NumberDataFormatter numberDataFormatter = new NumberDataFormatter();
        intList.add("333");
        Mockito.when(stringItemType.getArrayDelimiter()).thenReturn(",");
        doublesList.add("2.1421324124421");
import java.util.function.Function;

        Assert.assertEquals("(\"1\",\"2\",\"3\")", PostgreValueParser.generateObjectString(new Integer[]{1, 2, 3}));
    @Test
            () -> PostgreValueParser.parsePrimitiveArray("1}", Function.identity(), String[]::new));
                (Object[]) PostgreValueParser.convertStringToValue(session, arrayStringItemType, "{\"A\",\"B\"}"));
    }

    private PostgreDataType intItemType;

    private PostgreDataType booleanItemType;
                arrayStringItemType,
        Assert.assertArrayEquals(new Object[]{innerCollection1, innerCollection2},
//        Assert.assertEquals(doublesList, PostgreValueParser.parseArrayString("ARRAY[1.123,2.1421324124421]", ","));
        int2List.add(intList);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    private PostgreDataType structItemType;
            new Integer[]{1, null, 3},
            () -> PostgreValueParser.parsePrimitiveArray("{1},", Function.identity(), String[]::new));
//        Mockito.when(structItemType.getFullTypeName()).thenReturn("test_structItemType");
 * you may not use this file except in compliance with the License.
        List<List<String>> int2List = new ArrayList<>();
        Assert.assertEquals("A", PostgreValueParser.convertStringToValue(session, stringItemType, "A"));
        Assert.assertArrayEquals(new String[]{"A", null, "B", null}, PostgreValueParser.parseSingleObject("A,,B,"));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//        Mockito.when(structItemType.getTypeID()).thenReturn(Types.STRUCT);

    private PostgreDataType stringItemType;
        //todo: unquote numbers

    @Test
                PostgreValueParser.generateObjectString(new Object[]{new Double[]{1.1, 2.22, 3.333}, new Integer[]{1, 2, 3}}));
        Mockito.when(arrayDoubleItemType.getFullTypeName()).thenReturn("test_arrayDoubleItemType");
//        Mockito.when(arrayStructItemType.getFullTypeName()).thenReturn("test_arrayStructItemType");
    private PostgreDataType doubleItemType;
            IllegalArgumentException.class,
            IllegalArgumentException.class,
//        Assert.assertArrayEquals(booleans, (Object[]) PostgreValueParser.convertStringToValue(session, arrayBooleanItemType, "{'t','f'}", true));

    }
 * limitations under the License.
            Assert.assertEquals(expected, PostgreArrayValueHandler.INSTANCE.getValueDisplayString(collection.getComponentType(), collection, DBDDisplayFormat.UI));
    @Mock
        Mockito.when(session.getProgressMonitor()).thenReturn(new VoidProgressMonitor());
    @Test
        Assert.assertEquals(int3List, PostgreValueParser.parseArrayString("{{{1,22,333},{1,22,333}},{{1,22,333},{1,22,333}}}", ","));
        Assert.assertEquals(1.111, PostgreValueParser.convertStringToValue(session, doubleItemType, "1.111"));
        Assert.assertThrows(
            IllegalArgumentException.class,
//        Mockito.when(stringItemType.getDataSource()).thenReturn(dataSource);

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

            IllegalArgumentException.class,
    public void parseArrayString() throws DBCException {
        Assert.assertArrayEquals(new String[]{"colA", " ColB"}, PostgreValueParser.parseSingleObject("colA, ColB"));
        final Function<String[], DBDCollection> make2d = values ->
        tester.accept("{{a,b,c},{d,e,f}}", make3d.apply(new String[][]{{"a", "b", "c"}, {"d", "e", "f"}}));
            new JDBCCollection(session.getProgressMonitor(), stringItemType, PostgreArrayValueHandler.INSTANCE, values);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
        Assert.assertEquals(stringList, PostgreValueParser.parseArrayString("{\"A\",\"B\"}", ","));
            PostgreValueParser.parsePrimitiveArray("{NULL,\"NULL\"}", Function.identity(), String[]::new));
import java.util.*;
        Assert.assertNotEquals(123, PostgreValueParser.convertStringToValue(session, intItemType, "1"));
import org.jkiss.dbeaver.model.exec.DBCException;

        Assert.assertThrows(
        Mockito.when(booleanItemType.getDataKind()).thenReturn(DBPDataKind.BOOLEAN);

    @Mock
        Assert.assertArrayEquals(
                (Object[]) PostgreValueParser.convertStringToValue(session, arrayDoubleItemType, "{1.1,22.22}"));
        Assert.assertEquals("(\"{{1.1,2.22,3.333},{1.1,2.22,3.333}}\",\"qwerty\")",

//        Mockito.when(arrayStringItemType.getFullTypeName()).thenReturn("test_arrayStringItemType");
import org.jkiss.dbeaver.ext.postgresql.model.data.PostgreArrayValueHandler;
                expected,
        tester.accept("{{\"\"},{\"{}\"},{\"\\\"\"}}", make3d.apply(new String[][]{{""}, {"{}"}, {"\""}}));
    @Mock
    }
                new JDBCNumberValueHandler(doubleItemType, dbdFormatSettings),

    @Mock
 *
        final BiConsumer<String, DBDCollection> tester = (expected, collection) ->
        //Infinity, -Infinity, NaN //todo
    @Test
            () -> PostgreValueParser.parsePrimitiveArray("{1,}", Function.identity(), String[]::new));
//        Mockito.when(dataSource.getSQLDialect()).thenReturn(sqlDialect);
//        Mockito.when(booleanItemType.getFullTypeName()).thenReturn("test_booleanItemType");
//        Assert.assertArrayEquals(booleans, (Object[]) PostgreValueParser.convertStringToValue(session, arrayBooleanItemType, "{'true','false'}", true));

//        Mockito.when(arrayStructItemType.getDataKind()).thenReturn(DBPDataKind.ARRAY);
        Assert.assertEquals("(\"{1.1,2.22,3.333}\",\"{1,2,3}\")",
import org.jkiss.dbeaver.model.data.DBDCollection;
        Assert.assertNotEquals(stringList, PostgreValueParser.parseArrayString("{\"A\",\"B\"}", "."));
            new JDBCCollection(session.getProgressMonitor(), stringItemType, PostgreArrayValueHandler.INSTANCE, values);
import org.jkiss.dbeaver.registry.formatter.DataFormatterProfile;
        Mockito.when(stringItemType.getTypeID()).thenReturn(Types.VARCHAR);
 *

        Assert.assertEquals("(\"(1,2,3)\")", PostgreValueParser.generateObjectString(new Object[]{"(1,2,3)"}));
    @Mock
 * distributed under the License is distributed on an "AS IS" BASIS,

            Assert.assertEquals(

        Mockito.when(intItemType.getTypeID()).thenReturn(Types.INTEGER);
        final Function<String[][], DBDCollection> make3d = values ->
        Assert.assertEquals(int2List, PostgreValueParser.parseArrayString("{{1,22,333},{1,22,333}}", ","));
                session.getProgressMonitor(),
        List<String> stringList = new ArrayList<>();
            PostgreValueParser.parsePrimitiveArray("{1,NULL,3}", Integer::valueOf, Integer[]::new));

            "Unexpected \"}\" character",
        Assert.assertArrayEquals(
//        Assert.assertArrayEquals(booleans, (Object[]) PostgreValueParser.convertStringToValue(session, arrayBooleanItemType,"{'1','0'}", true));
//        Mockito.when(dbdFormatSettings.getDataFormatterProfile()).thenReturn(dataFormatterProfile);
    private PostgreDataSource dataSource;
        final Function<String[][], DBDCollection> make3d = values ->
    private void setupGeneralWhenMocks() throws Exception {
}
    private DataFormatterProfile dataFormatterProfile = new DataFormatterProfile("test_profile", new TestPreferenceStore());

    @Test
    private DBCSession session;


        setupGeneralWhenMocks();

        Assert.assertThrows(
        Mockito.when(stringItemType.getDataKind()).thenReturn(DBPDataKind.STRING);
        tester.accept("{NULL,NULL}", make2d.apply(new String[] {null, "NULL"}));
                new Double[]{3.3, 44.44});
            PostgreValueParser.parsePrimitiveArray("{ ab , cd ,NULL,\"NULL\",\" spa ce \"}", Function.identity(), String[]::new));
import org.jkiss.dbeaver.model.DBPDataKind;
        tester.accept("{\"quote\"}", make2d.apply(new String[] {"\"quote\""}));
        Mockito.when(arrayStringItemType.getArrayDelimiter()).thenReturn(",");

        tester.accept("NULL", make2d.apply(null));
import org.jkiss.dbeaver.model.impl.data.formatters.NumberDataFormatter;
                new JDBCNumberValueHandler(doubleItemType, dbdFormatSettings),
        Assert.assertEquals("(\"1.1\",\"2.22\",\"3.333\")", PostgreValueParser.generateObjectString(new Double[]{1.1, 2.22, 3.333}));

        Assert.assertArrayEquals(new Double[]{1.1, 22.22},
    }
    private PostgreDataType arrayStructItemType;
            );
        Assert.assertArrayEquals(new String[]{}, PostgreValueParser.parseSingleObject(""));
        Mockito.when(arrayIntItemType.getComponentType(session.getProgressMonitor())).thenReturn(intItemType);
        //Assert.assertEquals(intList, PostgreValueParser.parseArrayString("ARRAY[1,22,333]", ","));// todo: add array format support
    @Mock
        tester.accept("{}", make2d.apply(new String[]{}));
package org.jkiss.dbeaver.ext.postgresql;
            "Unexpected end of input",
                PostgreValueParser.generateObjectString(new Object[]{new Double[][]{{1.1, 2.22, 3.333},{1.1, 2.22, 3.333}},"qwerty"}));
        intList.add("1");
        List<String> intList = new ArrayList<>();
//        Mockito.when(stringItemType.getFullTypeName()).thenReturn("test_stringItemType");
        int3List.add(int2List);
 *
            "Unexpected \",\" character",
        stringList.add("A");
        doublesList.add("1.123");
                (Object[]) PostgreValueParser.convertStringToValue(session, arrayIntItemType, "{1,22}"));
        Assert.assertEquals(int2List, PostgreValueParser.parseArrayString("[1:2]={{1,22,333},{1,22,333}}", ",")); // "[1:2]=" do nothing
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
            new JDBCCollection(
            make2d.apply(new String[] {"one", "two", " four with spaces ", "f{i,v}e"})
//        Mockito.when(arrayBooleanItemType.getFullTypeName()).thenReturn("test_arrayBooleanItemType");
public class PostgreValueParserTest extends DBeaverUnitTest {
/*
    }
                PostgreArrayValueHandler.INSTANCE.getValueDisplayString(collection.getComponentType(), collection, DBDDisplayFormat.NATIVE)
 * Unless required by applicable law or agreed to in writing, software
        JDBCCollection innerCollection1 = new JDBCCollection(session.getProgressMonitor(), doubleItemType,
        Mockito.when(doubleItemType.getDataKind()).thenReturn(DBPDataKind.NUMERIC);
        );

import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCollection;
    public void parseSingleObject() throws DBCException {
        Assert.assertNotEquals(stringList, PostgreValueParser.parseArrayString("{\"A\",\"B\",\"C\"}", ","));
        numberDataFormatter.init(doubleItemType, Locale.ENGLISH, new HashMap<>());
//        Assert.assertArrayEquals(booleans, (Object[]) PostgreValueParser.convertStringToValue(session, arrayBooleanItemType,"{'y','n'}", true));
        tester.accept("{{},{{}},{\"}}", make3d.apply(new String[][] {{""}, {"{}"}, {"\""}}));
        JDBCCollection innerCollection3 = new JDBCCollection(session.getProgressMonitor(), doubleItemType,
        intNullList.add(null);
            () -> PostgreValueParser.parsePrimitiveArray("{1,", Function.identity(), String[]::new));

    }
    @Before
//        Assert.assertArrayEquals(booleans, (Object[]) PostgreValueParser.convertStringToValue(session, arrayBooleanItemType,"{'yes,'no'}", true));
            "Array value must start with \"{\"",
    public void convertArrayToStringShouldEscapeQuotesCases() {
        Mockito.when(arrayStringItemType.getComponentType(session.getProgressMonitor())).thenReturn(stringItemType);
        tester.accept("{NULL,\"NULL\"}", make2d.apply(new String[]{null, "NULL"}));

                (Object[]) PostgreValueParser.convertStringToValue(session, arrayDoubleItemType, "{{{1.1,22.22},{3.3,44.44}},{{1.1,22.22},{3.3,44.44}}}"));
    private PostgreDataType arrayBooleanItemType;
 * You may obtain a copy of the License at
        intList.add("22");
import org.mockito.Mockito;
        Assert.assertNotEquals(false, PostgreValueParser.convertStringToValue(session, booleanItemType, "true"));

            () -> PostgreValueParser.parsePrimitiveArray("{,}", Function.identity(), String[]::new));
        Assert.assertEquals("{{1.1,22.22},,44.44}},{1.1,22.22},{3.3,}",
    DBDFormatSettings dbdFormatSettings;
                (Object[]) PostgreValueParser.convertStringToValue(session, arrayDoubleItemType, "{{1.1,22.22},{3.3,44.44}}"));

    @Mock
