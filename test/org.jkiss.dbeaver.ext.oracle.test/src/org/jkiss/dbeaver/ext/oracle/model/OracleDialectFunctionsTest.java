 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
//        Mockito.when(mockTypedObject.getScale()).thenReturn(null);
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("numeric");
    @Test
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
        String actualDataType = dialect.convertExternalDataType(dialect, mockTypedObject, dataSource);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Before
        dataSource = new OracleDataSource(mockDataSourceContainer);

        Assert.assertEquals("NUMBER(22,11)", actualDataType);
        Mockito.when(mockTypedObject.getScale()).thenReturn(11);
    public void setUp() throws Exception {
 * you may not use this file except in compliance with the License.
    @Test
 *
    }
        Mockito.when(mockTypedObject.getPrecision()).thenReturn(null);
    @Mock
 *
    DBPDataSourceContainer mockDataSourceContainer;
        dataSource.getDataTypeCache().cacheObject(new OracleDataType(dataSource, "NUMBER", true));
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.junit.Before;

    @Mock

    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private DBPConnectionConfiguration mockConnectionConfiguration;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Licensed under the Apache License, Version 2.0 (the "License");
        Mockito.when(mockTypedObject.getPrecision()).thenReturn(33);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Mockito.when(mockTypedObject.getScale()).thenReturn(null);
    private OracleDataSource dataSource;
import org.junit.Test;


        String actualDataType = dialect.convertExternalDataType(dialect, mockTypedObject, dataSource);
        dataSource.getDataTypeCache().cacheObject(new OracleDataType(dataSource, "JSON", true));
        Mockito.when(mockDataSourceContainer.getConnectionConfiguration()).thenReturn(mockConnectionConfiguration);
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    @Mock
import org.mockito.Mockito;
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("json");
    }
}
        Assert.assertEquals("JSON", actualDataType);
import org.jkiss.junit.DBeaverUnitTest;
    public void generateCorrectDataFromNUMERICDataTypeWithPrecisionAndScale() {
        Assert.assertEquals("NUMBER", actualDataType);
import org.mockito.Mock;
    public void generateCorrectDataTypeNameFromNUMERICDataTypeWithModifiers() {
    public void generateCorrectDataFromNUMERICDataTypeWithPrecision() {
    public void generateCorrectDataTypeNameWithModifiersFromJSONDataType() {
 * DBeaver - Universal Database Manager
 *
package org.jkiss.dbeaver.ext.oracle.model;
    @Test

        Assert.assertEquals("NUMBER(33)", actualDataType);
        Mockito.when(mockDataSourceContainer.getDriver()).thenReturn(DBWorkbench.getPlatform().getDataSourceProviderRegistry().findDriver("oracle"));
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
        dialect = new OracleSQLDialect();
    }
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("numeric");
public class OracleDialectFunctionsTest extends DBeaverUnitTest {
/*

    }
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("numeric");
 */
        String actualDataType = dialect.convertExternalDataType(dialect, mockTypedObject, dataSource);
        String actualDataType = dialect.convertExternalDataType(dialect, mockTypedObject, dataSource);
    private OracleSQLDialect dialect;
import org.junit.Assert;
        Mockito.when(mockTypedObject.getPrecision()).thenReturn(22);
    DBSTypedObject mockTypedObject;
    @Test
