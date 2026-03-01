 * distributed under the License is distributed on an "AS IS" BASIS,
        String typeCastClause = postgreDialect.getTypeCastClause(mockAttributeBinding, "?", true);
            @Override
        Mockito.when(mockTypedObject.getPrecision()).thenReturn(null);
        PostgreTableColumn column1 = PostgreTestUtils.addColumn(testTableRegular, "column1", "xml", 1);
        Mockito.when(mockAttributeBinding.getName()).thenReturn(column.getName());

        String typeCastClause = postgreDialect.getTypeCastClause(mockAttributeBinding, "?", true);

        String typeCastClause = postgreDialect.getCastedAttributeName(mockAttributeBinding, mockAttributeBinding.getName());
        Mockito.when(mockAttributeBinding.getFullyQualifiedName(DBPEvaluationContext.DML, DBPAttributeReferencePurpose.UNSPECIFIED))
        testDataSource = new PostgreDataSource(mockDataSourceContainer, "PG Test", "postgres") {


        Mockito.when(mockTypedObject.getPrecision()).thenReturn(28);
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("number");
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("number");
    public void generateTypeCastClauseForXMLColumnForUpdateTableCaseInTableWithoutKeys() throws DBException {
    @Test
public class PostgreDialectFunctionsTest extends DBeaverUnitTest {

        testTableRegular.setPartition(false);
        Mockito.when(mockAttributeBinding.getDataType()).thenReturn(column1.getDataType());
        String typeCastClause = postgreDialect.getTypeCastClause(mockAttributeBinding, "?", false);
    @Test
        Mockito.when(mockAttributeBinding.getName()).thenReturn(column.getName());
    }
    }
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
        String actualDataType = postgreDialect.convertExternalDataType(postgreDialect, mockTypedObject, testDataSource);
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("nvarchar");
        Mockito.when(mockAttributeBinding.getDataType()).thenReturn(column1.getDataType());
        Mockito.when(mockAttributeBinding.getDataSource()).thenReturn(testDataSource);
        };
 */
    @Test
        String expectedTypeCast = "?::text"; // We are forced to add text casting to the JSON type if this json column is used in the WHERE condition and there are no keys in the table. Otherwise PostgreSQL returns an error that json can be cast to json.
import org.jkiss.dbeaver.DBException;
}
        Mockito.when(mockAttributeBinding.getDataType()).thenReturn(column1.getDataType());
            }
 * you may not use this file except in compliance with the License.
    public void generateTypeCastClauseForNumericColumnForUpdateTableCaseInTableWithoutKeys() throws DBException {

        String actualDataType = postgreDialect.convertExternalDataType(postgreDialect, column1, testDataSource);
        postgreDialect = new PostgreDialect();
        Assert.assertEquals(expectedTypeCast, typeCastClause);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        Assert.assertEquals("xml", actualDataType);

    public void generateTypeCastClauseForJSONColumnForUpdateTableCaseInTableWithoutKeys() throws DBException {

        String actualDataType = postgreDialect.convertExternalDataType(postgreDialect, mockTypedObject, testDataSource);
    @Test
 * Unless required by applicable law or agreed to in writing, software
    public void generateCorrectDataTypeNameFromVACRHAR2DataType() {
import java.sql.Types;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        String typeCastClause = postgreDialect.getTypeCastClause(mockAttributeBinding, "?", true);
        String expectedTypeCast = "?::json";
        String typeCastClause = postgreDialect.getTypeCastClause(mockAttributeBinding, "?", false);

    }
    @Test
    @Test
        String expectedTypeCast = "column1::text"; // We use this method only for column names in condition. JSON column name must be casted to text as in getTypeCastClause will be casted column data
        };

    @Mock
    private PostgreSchema testSchema;
        testTableRegular = new PostgreTableRegular(testSchema) {
    @Test
        Mockito.when(mockTypedObject.getMaxLength()).thenReturn(33L);

        String expectedTypeCast = "column1::text"; // We use this method only for column names in condition. JSON column name must be casted to text as in getTypeCastClause will be casted column data

        PostgreTableColumn column = PostgreTestUtils.addColumn(testTableRegular, "column1", "json", 1);
    }
 *

    private PostgreSchema PGCatalogTestSchema;
        Assert.assertEquals("numeric", actualDataType);
    @Test
    public void generateTypeCastClauseForJSONColumnForInsertTableCaseInTableWithoutKeys() throws DBException {
            }
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("varchar2");

 * You may obtain a copy of the License at

        PostgreTableColumn column1 = PostgreTestUtils.addColumn(testTableRegular, "column1", "json", 1);
    @Test
            .thenReturn(column.getName());
        Assert.assertEquals(expectedTypeCast, typeCastClause);

        Mockito.when(mockTypedObject.getTypeName()).thenReturn("number");

    public void generateCorrectDataTypeNameNUMBERWithPrecisionOnly() {
    public void generateCorrectDataTypeNameWithModifiersFromNUMBERWithoutModifiers() {
    @Test
        Assert.assertEquals("varchar(33)", actualDataType);
 *

        String actualDataType = postgreDialect.convertExternalDataType(postgreDialect, mockTypedObject, testDataSource);
        testTableRegular.setName("testTable");
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public void generateCorrectDataTypeNameFromSYSXMLTypeDataType() {
    @Test
    @Test

        Mockito.when(mockTypedObject.getPrecision()).thenReturn(15);
            public boolean isServerVersionAtLeast(int major, int minor) {
import org.jkiss.dbeaver.ext.postgresql.PostgreTestUtils;
    public void generateCastedAttributeNameForJSONColumnForUpdateTableCaseInTableWithoutKeys() throws DBException {

import org.jkiss.dbeaver.model.DBPEvaluationContext;
        PostgreTableColumn column = PostgreTestUtils.addColumn(testTableRegular, "column1", "xml", 1);

//        Mockito.when(mockTypedObject.getScale()).thenReturn(null);

    @Test
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    DBPDataSourceContainer mockDataSourceContainer;
        Assert.assertEquals("xml", actualDataType);
        Assert.assertEquals("xml", actualDataType);
import org.jkiss.dbeaver.model.DBPAttributeReferencePurpose;
        String actualDataType = postgreDialect.convertExternalDataType(postgreDialect, mockTypedObject, testDataSource);



        Mockito.when(mockAttributeBinding.getDataType()).thenReturn(column.getDataType());
        Mockito.when(mockDataSourceContainer.getDriver()).thenReturn(DBWorkbench.getPlatform().getDataSourceProviderRegistry().findDriver("postgresql"));
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("xmltype");
            }
            @Override
        Mockito.when(mockTypedObject.getMaxLength()).thenReturn(67L);
        Assert.assertEquals(expectedTypeCast, typeCastClause);

    }
    private PostgreTableRegular testTableRegular;
    }
        Mockito.when(mockTypedObject.getScale()).thenReturn(5);
package org.jkiss.dbeaver.ext.postgresql.model;

    @Test
import org.junit.Assert;
        String expectedTypeCast = "?"; // XML type does not have any casting in other cases
        Assert.assertEquals(expectedTypeCast, typeCastClause);
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("sys.xmltype");
            public boolean isTablespaceSpecified() {
import org.junit.Before;
            .thenReturn(column.getName());


        Assert.assertEquals("numeric(28)", actualDataType);
    }
 * See the License for the specific language governing permissions and

    public void setUp() throws Exception {
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("nchar");
        PGCatalogTestSchema = new PostgreSchema(testDatabase, PostgreConstants.CATALOG_SCHEMA_NAME, testUser); // Test PG_catalog schema for the right define default data types fully qualified names
    DBDAttributeBinding mockAttributeBinding;
import org.jkiss.junit.DBeaverUnitTest;
        String actualDataType = postgreDialect.convertExternalDataType(postgreDialect, mockTypedObject, testDataSource);

/*
        PostgreTableColumn column1 = PostgreTestUtils.addColumn(testTableRegular, "column1", "xml", 1);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        PostgreDatabase testDatabase = testDataSource.createDatabaseImpl(monitor, "testdb", testUser, null, null, null);
 * DBeaver - Universal Database Manager
    }
        PostgreTestUtils.addColumn(testTableRegular, "column1", "json", 1);

        Mockito.when(mockAttributeBinding.getDataType()).thenReturn(column1.getDataType());
        String actualDataType = postgreDialect.convertExternalDataType(postgreDialect, mockTypedObject, testDataSource);
    @Mock
    @Test
                return super.getLocalDataType(typeName);
    private PostgreDataSource testDataSource;
    @Test
    }
        PostgreRole testUser = new PostgreRole(null, "tester", "test", true);
    DBSTypedObject mockTypedObject;
    @Before

        Assert.assertEquals(expectedTypeCast, typeCastClause);
    }
    }
        PostgreDataType jsonDataType = new PostgreDataType(PGCatalogTestSchema, Types.OTHER, "json");
    }
            @Nullable
        PostgreTableColumn column1 = PostgreTestUtils.addColumn(testTableRegular, "column1", "xml", 1);
    @Mock
            public PostgreDataType getLocalDataType(String typeName) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.mockito.Mock;

 * limitations under the License.
    private PostgreDialect postgreDialect;

        PostgreTableColumn column1 = PostgreTestUtils.addColumn(testTableRegular, "column1", "int4", 2);
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        String typeCastClause = postgreDialect.getCastedAttributeName(mockAttributeBinding, mockAttributeBinding.getName());
        Mockito.when(mockAttributeBinding.getDataType()).thenReturn(jsonDataType);

import org.mockito.Mockito;
        Assert.assertEquals("numeric(15,5)", actualDataType);
    public void generateCastedAttributeNameForXMLColumnForUpdateTableCaseInTableWithoutKeys() throws DBException {
    public void generateCorrectDataTypeNameFromXMLTypeDataType() {

import org.junit.Test;
        Mockito.when(mockTypedObject.getScale()).thenReturn(null);
    public void generateCorrectDataTypeNameFromNUMBERWithPrecisionAndScale() {
    DBRProgressMonitor monitor;
        String actualDataType = postgreDialect.convertExternalDataType(postgreDialect, mockTypedObject, testDataSource);
        Assert.assertEquals(expectedTypeCast, typeCastClause);
        Assert.assertEquals("varchar(67)", actualDataType);
        String actualDataType = postgreDialect.convertExternalDataType(postgreDialect, mockTypedObject, testDataSource);

        testSchema = new PostgreSchema(testDatabase, "testSchema", testUser);
        Mockito.when(mockAttributeBinding.getDataSource()).thenReturn(testDataSource);
    public void generateCorrectDataTypeNameFromXMLDataType() throws DBException {
                return false;
        Mockito.when(mockAttributeBinding.getFullyQualifiedName(DBPEvaluationContext.DML, DBPAttributeReferencePurpose.UNSPECIFIED))
        String expectedTypeCast = "?::text"; // We are forced to add text casting to the XML type if this xml column is used in the WHERE condition and there are no keys in the table. Otherwise PostgreSQL returns an error that xml can be cast to xml.
    }
        Assert.assertEquals("varchar(42)", actualDataType);
import org.jkiss.code.Nullable;
    public void generateTypeCastClauseForXMLColumnForInsertTableCaseInTableWithoutKeys() throws DBException {
        Mockito.when(mockAttributeBinding.getDataType()).thenReturn(column.getDataType());
                return major <= 10;
    public void generateCorrectDataTypeNameFromNVACRHARDataType() {
        String expectedTypeCast = "?"; // We are not expecting casting in this clause
        Assert.assertEquals(expectedTypeCast, typeCastClause);
            @Override
 *
        Mockito.when(mockTypedObject.getMaxLength()).thenReturn(42L);

import org.jkiss.dbeaver.runtime.DBWorkbench;
    public void generateCorrectDataTypeNameFromNCRHARDataType() {

    @Mock
    }
