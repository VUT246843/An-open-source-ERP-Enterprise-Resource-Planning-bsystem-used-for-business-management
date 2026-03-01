    @Test
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
    }
                        "FORMAT 'TEXT' ( delimiter ',' null '' escape '\"' quote '\"' header )\n" +
        Mockito.when(mockResults.getString("urilocation")).thenReturn("SOME_EXTERNAL_LOCATION");
    @Mock
        Mockito.when(mockResults.getString("urilocation")).thenReturn("http://example.com/test.txt");
    public void generateDDL_whenTableHasACustomFormatType_returnsDDLStringWithACustomFormat()
            throws DBException, SQLException {
        Mockito.when(mockResults.getString("urilocation")).thenReturn(exampleUriLocation);
                        "\t'http://example.com/test.txt'\n" +
    }
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
 * limitations under the License.
import java.util.Collections;
    }
    public void generateDDL_whenExternalTableHasNoFormatOptionsSet_returnsDDLStringWithOmittedFormatOptions()
    @Test
        Mockito.when(mockResults.getString("rejectlimittype")).thenReturn(exampleRejectLimitType);

    @Test
            throws DBException {
    @Test
                        "LOCATION (\n" +
                        "\t'gpfdist://filehost:8081/*.gz'\n" +
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
        int expectedUriLocation = 50_000;

        Mockito.when(mockResults.getString("fmtopts"))
                        "EXECUTE 'execute something' ON ALL\n" +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        Mockito.when(mockPostgreTableColumn.getTypeName()).thenReturn(columnType);
    @Mock
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", -1);

        Mockito.when(mockResults.getString("command")).thenReturn("execute something");
                table.getUriLocations());
                        "FORMAT 'TEXT'\n" +
        Mockito.when(mockDataSource.isServerVersionAtLeast(9,4)).thenReturn(true);
        Assert.assertEquals("TEXT", table.getFormatType());


        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
        Mockito.when(mockResults.getBoolean("writable")).thenReturn(true);
    public void onCreation_whenNoInitialDbResultIsProvided_thenDefaultFormatIsText() {
        String expectedUriLocation = "ALL_SEGMENTS";
        addMockColumnsToTableCache(tableColumns, table);
        String expectedDDL =
import org.jkiss.junit.DBeaverUnitTest;

        Mockito.when(mockResults.getBoolean("is_temp_table")).thenReturn(true);
        Mockito.when(mockPostgreTableColumn.getName()).thenReturn(columnName);
        Assert.assertEquals("UTF8", table.getEncoding());
    PostgreSchema mockSchema;

                        "ENCODING 'UTF8'";
        String expectedDDL =
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
                        "ENCODING 'UTF8'";

        Assert.assertEquals(expectedDDLWithMultiColumns, table.generateDDL(monitor));
    public void onCreation_readsFormatOptionsFromDbResult() throws SQLException {

                        "ENCODING 'UTF8'";
        Assert.assertFalse(table.isLoggingErrors());
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
        String expectedDDL =
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
            throws DBException, SQLException {
        addMockColumnsToTableCache(tableColumns, table);
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
    }
        Assert.assertEquals(GreenplumExternalTable.RejectLimitType.r, table.getRejectLimitType());
    private final String exampleFormatType = "c";
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
import org.jkiss.dbeaver.DBException;
            throws DBException {
}    public void onCreation_readsMultipleUriLocationsFromDbResult() throws SQLException {
    }
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +

    @Mock
    private void addMockColumnsToTableCache(List<PostgreTableColumn> tableColumns, GreenplumExternalTable table)
    }
    @Test
    public void generateDDL_whenAWebTableHasExecuteClause_returnsDDLWithTheExecuteClauseAndDefaultExecLocation() throws SQLException, DBException {

        String expectedDDL =
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
    }
                        "\t'gpfdist://filehost:8081/*.txt',\n" +
        String expectedUriLocation = "delimiter ',' null '' escape '\"' quote '\"' header";
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +

        Mockito.when(mockResults.getString("urilocation"))
    private final int exampleRejectLimit = 100_000;
        Mockito.when(mockResults.getString("fmttype")).thenReturn(exampleFormatType);
                        ") ON ALL\n" +


        return mockPostgreTableColumn;
import java.sql.SQLException;
        String expectedDDL =

        Mockito.when(mockResults.getString("fmttype")).thenReturn("t");

    }
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
    @Test
    public void generateDDL_whenTableHasNoColumns_returnsDDLStringForATableWithNoColumns()
        Mockito.when(mockResults.getString("rejectlimittype")).thenReturn(exampleRejectLimitType);
                        "LOCATION (\n" +
    public void onCreation_readsTemporaryTableFlagFromDBResult() throws SQLException {
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema);
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));

    }
    @Test
        Mockito.when(mockDataSource.isServerVersionAtLeast(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(false);
    private final String exampleEncoding = "UTF8";
    @Test
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        Mockito.when(mockDataSource.getServerType()).thenReturn(mockServerGreenplum);
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4,\n\tcolumn2 int2\n)\n" +
                        "ENCODING 'UTF8'";
            throws DBException, SQLException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;



    public void onCreation_readsExecLocationFromDbResult() throws SQLException {
                        ") ON MASTER\n" +
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
                        "ENCODING 'UTF8'\n" +
import org.junit.Assert;
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
        Mockito.when(mockResults.getString("rejectlimittype")).thenReturn("r");
        String expectedDDL =
        List<PostgreTableColumn> tableColumns = Arrays.asList(mockPostgreTableColumn, mockPostgreTableColumn2);
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));

                        "ENCODING 'UTF8'\n" +
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);

    @Mock
                        ") ON ALL\n" +
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
    public void generateDDL_whenTableHasASegmentRejectLimit_returnsDDLStringWithSegmentRejectLimit()
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema);


                        "FORMAT 'TEXT'\n" +
        addMockColumnsToTableCache(tableColumns, table);

    public void onCreation_readsLoggingErrorsFlagFromDBResult() throws SQLException {
        Mockito.when(mockResults.getBoolean("is_logging_errors")).thenReturn(true);


    @Test
        Assert.assertTrue(table.isTemporaryTable());
        String expectedDDL =
        Mockito.when(mockSchema.getDatabase()).thenReturn(mockDatabase);
                        "\t'gpfdist://filehost:8081/*.txt'\n" +

 *
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
    private final String exampleRejectLimitType = "r";
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDialect;
                .thenReturn("delimiter ',' null '' escape '\"' quote '\"' header");
    @Test
        Mockito.when(mockDataSource.getSQLDialect()).thenReturn(new PostgreDialect());
                        ") ON ALL\n" +
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
    PostgreDatabase mockDatabase;
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
        String expectedDDL =
        Mockito.when(mockResults.getString("execlocation")).thenReturn(exampleExecLocation);

        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
            throws DBException, SQLException {
    }
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +

                        "ENCODING 'UTF8'";
    DBRProgressMonitor monitor;

                        "FORMAT 'CSV' ( DELIMITER ',' )";
        Assert.assertEquals(expectedUriLocation, table.getEncoding());
    public void onCreation_setsDefaultLoggingErrorsToFalse_ifGreenplumServerVersionIs6andAbove() throws SQLException {
                        "LOCATION (\n" +

    @Mock
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema);
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +
        addMockColumnsToTableCache(tableColumns, table);
        Mockito.when(mockResults.getString("command")).thenReturn("execute something");

                        "ENCODING 'UTF8'";
import org.mockito.ArgumentMatchers;



        Mockito.when(mockResults.getString("relname")).thenReturn(exampleTableName);
            throws DBException, SQLException {
 * Unless required by applicable law or agreed to in writing, software
                .thenReturn("SOME_EXTERNAL_LOCATION,ANOTHER_EXTERNAL_LOCATION");

        table.setFormatType("CUSTOM");

        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
    }
    @Test
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        String expectedDDL =
    @Test

    public void generateDDL_whenTableIsAExternalTemporaryTable_returnsDDLStringForAExternalTemporaryTable()
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        Assert.assertEquals("delimiter ',' null '' escape '\"' quote '\"' header", table.getFormatOptions());
    }


        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
        table.setPersisted(false);
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
    private PostgreServerGreenplum mockServerGreenplum;
                        "LOG ERRORS SEGMENT REJECT LIMIT 100000 ROWS";

        table.setName("sampleTable");
    @Mock

        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        Mockito.when(mockPostgreTableColumn.getOrdinalPosition()).thenReturn(ordinalPosition);
        Mockito.when(mockResults.getBoolean("is_temp_table")).thenReturn(true);
                        "ENCODING 'UTF8'";
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
                        ") ON ALL\n" +
                "CREATE EXTERNAL WEB TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
        String expectedDDL =
    public void setup() throws SQLException {
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
            throws DBException, SQLException {
                        "ENCODING 'UTF8'\n" +
    @Test

                "CREATE EXTERNAL TEMPORARY TABLE sampleTable (\n\tcolumn1 int4\n)\n" +
        addMockColumnsToTableCache(tableColumns, table);
    }
        Assert.assertTrue(table.isWritable());
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
                        "ENCODING 'UTF8'";
 */
        String expectedDDL =

                        "LOCATION (\n" +
        Mockito.when(mockResults.getString("urilocation")).thenReturn("");
        Mockito.when(mockResults.getString("fmttype")).thenReturn("t");
        Mockito.when(mockResults.getString("fmtopts")).thenReturn("");
                        "ENCODING 'UTF8'";

    }
        List<PostgreTableColumn> tableColumns = Arrays.asList(mockPostgreTableColumn, mockPostgreTableColumn2);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Assert.assertEquals("ALTER EXTERNAL TABLE \"sampleSchema\".\"sampleTable\" OWNER TO someOwner",
    @Test
    public void generateChangeOwnerQuery_whenProvidedAValidOwner_thenShouldGenerateQuerySuccessfully() {
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +


        Mockito.when(mockResults.getBoolean("is_logging_errors")).thenReturn(true);
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        PostgreTableColumn mockPostgreTableColumn = Mockito.mock(PostgreTableColumn.class);
    private final String exampleExecLocation = "ALL_SEGMENTS";
    }

        addMockColumnsToTableCache(tableColumns, table);
    public void generateDDL_whenAWebTableHasExecuteClauseAndExecLocationIsMasterOnly_returnsDDLWithTheExecuteClauseAndMasterOnlyExecLocation() throws SQLException, DBException {
    }
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
    public void onCreation_readsFormatTypeFromDbResult() throws SQLException {
        Mockito.when(mockSchema.getSchema()).thenReturn(mockSchema);
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        Assert.assertEquals("SOME_EXTERNAL_LOCATION,ANOTHER_EXTERNAL_LOCATION",
    }
                        ") ON ALL\n" +
    @Test
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
    @Test
        table.setUriLocations(exampleUriLocation);
        Mockito.when(mockResults.getString("fmttype")).thenReturn("t");
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableColumn;
        Mockito.when(mockResults.getString("fmtopts")).thenReturn(null);
    }
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
                        "\t'http://example.com/test.txt'\n" +
                        ") ON ALL\n" +
    @Mock
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +
            throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
        Mockito.when(mockResults.getString("urilocation")).thenReturn("http://example.com/test.txt");

        Mockito.when(mockResults.getString("encoding")).thenReturn(null);
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);

    public void generateDDL_whenTableIsNotYetPersisted_returnsDDLStringForColumnsToBeCreated()

        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
    public void onCreation_readsASingleUriLocationFromDbResult() throws SQLException {
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
    private final String exampleUriLocation = "gpfdist://filehost:8081/*.txt";
    private PostgreTableColumn mockDbColumn(String columnName, String columnType, int ordinalPosition) {

    @Test

        String expectedDDL =

    }
        Mockito.when(mockResults.getString("encoding")).thenReturn(exampleEncoding);
        Mockito.when(mockResults.getBoolean("writable")).thenReturn(true);
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
    }
    @Test
    public void onCreation_readsRejectLimitTypeFromDBResult() throws SQLException {
 *     http://www.apache.org/licenses/LICENSE-2.0
        Mockito.when(mockResults.getString("fmttype")).thenReturn("b");

        Assert.assertEquals("CUSTOM", table.getFormatType());
    @Test
    public void generateDDL_whenTableHasASingleColumn_returnsDDLStringForASingleColumn()
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
    @Test

        Assert.assertEquals(expectedUriLocation, table.getExecLocation());
        Mockito.when(mockSchema.getName()).thenReturn(exampleSchemaName);
                table.generateChangeOwnerQuery("someOwner", new HashMap<>()));
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
 * See the License for the specific language governing permissions and

    }

        Assert.assertTrue(table.isLoggingErrors());
                        "LOCATION (\n" +
                        "LOCATION (\n" +
 *
                        "LOCATION (\n" +

    }
    @Test
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
            throws DBException {
        PostgreTableColumn mockPostgreTableColumn2 = mockDbColumn("column2", "int2", 2);
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        addMockColumnsToTableCache(tableColumns, table);

        Mockito.when(mockResults.getString("encoding")).thenReturn("UTF8");
 * You may obtain a copy of the License at
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
    @Test
        // Greenplum 6 runs on Postgre 9.4.x
        addMockColumnsToTableCache(tableColumns, table);

    @Test
                        "\t'gpfdist://filehost:8081/*.txt'\n" +



        Mockito.when(mockResults.getString("urilocation"))
        Mockito.when(mockResults.getString("execlocation")).thenReturn("MASTER_ONLY");
        String expectedDDL =
                        ") ON ALL\n" +

                        "ENCODING 'UTF8'";
    public void onCreation_readsEncodingFromDBResult() throws SQLException {
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
    public void generateDDL_whenExternalTableIsLoggingErrorsWithSegmentRejectLimit_returnsDDLStringWithLoggingErrorsClauseWithSegmentRejectLimit()
                        "LOCATION (\n" +

    GreenplumDataSource mockDataSource;
        String expectedDDL =
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
    @Test
    @Test

        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
        addMockColumnsToTableCache(tableColumns, table);
import java.util.List;
                        "SEGMENT REJECT LIMIT 100000 ROWS";
                        "LOG ERRORS";
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
                        "LOCATION (\n" +
    public void generateDDL_whenTableIsAExternalWebTemporaryTable_returnsDDLStringForAExternalWebTemporaryTable()
            throws DBException, SQLException {
        Assert.assertEquals(expectedUriLocation, table.getFormatOptions());
    }
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
        addMockColumnsToTableCache(tableColumns, table);
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
                        "ENCODING 'UTF8'";

import org.mockito.Mock;
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class GreenplumExternalTableTest extends DBeaverUnitTest {
    private final String exampleFormatOptions = "DELIMITER ','";
    private final String exampleDatabaseName = "sampleDatabase";
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4,\n\tcolumn2 int2\n)\n" +
                        ") ON ALL\n" +
    }
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);


        Mockito.when(mockResults.getString("urilocation")).thenReturn("");
    @Test
import org.mockito.Mockito;
    public void generateDDL_whenTableHasNoEncodingSet_returnsDDLStringWithNoEncoding()
        Assert.assertEquals("TEXT", table.getFormatType());
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
        Assert.assertEquals(expectedDDLWithNoEncodingSet, table.generateDDL(monitor));



        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
        String expectedDDLWithNoEncodingSet =
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\n)\n" +
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
    public void generateDDL_whenTableIsAWebTable_returnsDDLStringForAWebTable()
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +

    }
        Mockito.when(mockResults.getString("fmtopts")).thenReturn("");
                        ") ON ALL\n" +

        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
    @Test
    }

    public void onCreation_whenNoInitialDbResultIsProvided_thenDefaultEncodingIsSetToUTF8() {
import org.junit.Before;
                        ") ON ALL\n" +



                        ") ON ALL\n" +
                        "LOCATION (\n" +
package org.jkiss.dbeaver.ext.greenplum.model;




    public void onCreation_readsRejectLimitFromDBResult() throws SQLException {
        addMockColumnsToTableCache(tableColumns, table);
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));


                "CREATE EXTERNAL WEB TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +

        PostgreTableColumn mockPostgreTableColumn2 = mockDbColumn("column2", "int2", -1);
                "CREATE EXTERNAL WEB TEMPORARY TABLE sampleTable (\n\tcolumn1 int4\n)\n" +
        addMockColumnsToTableCache(null, table);
        addMockColumnsToTableCache(tableColumns, table);
    }
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));

        Mockito.when(mockResults.getString("urilocation")).thenReturn("");
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
    private final String exampleTableName = "sampleTable";

    }
    }
    @Test
    public void generateDDL_whenTableHasMultipleUriLocations_returnsDDLStringForASingleColumn()
                        ") ON ALL\n" +

        String expectedDDL =


        Mockito.when(mockDatabase.getName()).thenReturn(exampleDatabaseName);
                        "ENCODING 'UTF8'";
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
 * DBeaver - Universal Database Manager
    public void generateDDL_whenExternalTableIsLoggingErrors_returnsDDLStringWithLoggingErrorsClause()

        addMockColumnsToTableCache(tableColumns, table);
    @Test
        Assert.assertTrue(table.getUriLocations().isEmpty());
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
        String expectedDDLWithMultiColumns =
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
    }

        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
    PostgreSchema.TableCache mockTableCache;
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);


        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        Mockito.when(mockResults.getString("fmtopts")).thenReturn(exampleFormatOptions);
                        "LOCATION (\n" +

                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +
    @Test
    }
        addMockColumnsToTableCache(tableColumns, table);
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
        Assert.assertEquals(expectedDDL, table.generateDDL(monitor));
        Assert.assertEquals("SOME_EXTERNAL_LOCATION", table.getUriLocations());
                        "LOCATION (\n" +
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +
/*
                "CREATE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +

        Mockito.when(mockResults.getString("execlocation")).thenReturn("MASTER_ONLY");
                        "EXECUTE 'execute something' ON MASTER\n" +
                .thenReturn("gpfdist://filehost:8081/*.txt,gpfdist://filehost:8081/*.gz");
import java.util.HashMap;
                        "ENCODING 'UTF8'";
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
    public void generateDDL_whenTableHasMultiColumns_returnsDDLStringForMultiColumns()
    public void setFormatType_whenProvidedAValidStringRepresentationOfFormatType_setsFormatTypeEnumSuccessfully() {

                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
        // Ordinal Position of -1 is applied to all non-persisted table columns
    }
                        "FORMAT 'CSV' ( DELIMITER ',' )\n" +
        Mockito.when(mockResults.getInt("rejectlimit")).thenReturn(exampleRejectLimit);


                        "LOCATION (\n" +

        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
        addMockColumnsToTableCache(tableColumns, table);


        Mockito.when(mockResults.getBoolean("is_logging_errors")).thenReturn(true);
    public void onCreation_whenNoInitialDbResultIsProvided_thenDefaultFormatOptionsAreBasedOnTextFormatType() {
                        ") ON ALL\n" +
                        "LOCATION (\n" +

        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
                        "FORMAT 'CSV'\n" +
    }
    @Test
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
                        ") ON ALL\n" +
                        ") ON ALL\n" +
            throws DBException, SQLException {
    }


        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);

        addMockColumnsToTableCache(tableColumns, table);
    public void generateDDL_whenTableIsAnExternalWritableTable_returnsDDLStringForAWritableTable()
        String expectedUriLocation = "UTF8";
    public void onCreation_readsWritableFlagFromDBResult() throws SQLException {
        Mockito.when(mockResults.getBoolean("is_temp_table")).thenReturn(true);
                        "LOCATION (\n" +
    @Before
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
    JDBCResultSet mockResults;
        addMockColumnsToTableCache(tableColumns, table);

 * distributed under the License is distributed on an "AS IS" BASIS,
        Mockito.when(mockSchema.getTableCache()).thenReturn(mockTableCache);

    }
    @Test
            throws DBException, SQLException {
            throws DBException, SQLException {
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
        Mockito.when(mockTableCache.getChildren(monitor, mockSchema, table)).thenReturn(tableColumns);
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema);

    @Test
                "CREATE EXTERNAL WEB TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
    @Test
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema);
                        "FORMAT 'CUSTOM' ( FORMATTER='formatter_export_s' )\n" +
                "CREATE WRITABLE EXTERNAL TABLE sampleDatabase.sampleSchema.sampleTable (\n\tcolumn1 int4\n)\n" +
                        "ENCODING 'UTF8'";

        Mockito.when(mockResults.getInt("rejectlimit")).thenReturn(50_000);
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
            throws DBException {
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
    @Test

        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
                        "LOCATION (\n" +
    public void generateDDL_whenExecLocationIsMasterOnly_returnsDDLStringWithAMasterOnlyExecLocation()
        Mockito.when(mockResults.getString("fmtopts")).thenReturn("FORMATTER 'formatter_export_s'");

    public void onCreation_readsNoLocationsFromDbResult() throws SQLException {
        Mockito.when(mockResults.getString("execlocation")).thenReturn("ALL_SEGMENTS");
        PostgreTableColumn mockPostgreTableColumn = mockDbColumn("column1", "int4", 1);
        Mockito.when(mockSchema.getDataSource()).thenReturn(mockDataSource);
import java.util.Arrays;

import org.junit.Test;

        Mockito.verify(mockResults, Mockito.times(0)).getBoolean("is_logging_errors");
    }
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
    @Test
            throws DBException, SQLException {
    }
        GreenplumExternalTable table = new GreenplumExternalTable(mockSchema, mockResults);
        String expectedDDL =
    private final String exampleSchemaName = "sampleSchema";
        Mockito.when(mockResults.getInt("rejectlimit")).thenReturn(exampleRejectLimit);
 *
                        "\t'gpfdist://filehost:8081/*.txt'\n" +
        List<PostgreTableColumn> tableColumns = Collections.singletonList(mockPostgreTableColumn);
    }


        Assert.assertEquals(expectedUriLocation, table.getRejectLimit());
            throws DBException, SQLException {
