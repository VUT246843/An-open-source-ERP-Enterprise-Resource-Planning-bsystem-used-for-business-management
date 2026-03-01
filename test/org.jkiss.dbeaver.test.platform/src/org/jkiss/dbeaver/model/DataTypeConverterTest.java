        Mockito.when(mockTypedObject.getMaxLength()).thenReturn(-1L);
        String actualDataType = dialect.convertExternalDataType(dialect, mockTypedObject, mockDataSource);
        String actualDataType = dialect.convertExternalDataType(dialect, mockTypedObject, mockDataSource);
    @Mock
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("varchar");
        Assert.assertEquals("CLOB", actualDataType);
    @Before
    }
    private JDBCSQLDialect dialect;
    }
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.junit.Assert;

        Mockito.when(mockTypedObject.getMaxLength()).thenReturn(-1L);
import org.mockito.Mockito;
package org.jkiss.dbeaver.model;
        Mockito.lenient().when(mockDataSource.getSQLDialect()).thenReturn(dialect);
 * DBeaver - Universal Database Manager

    @Test
        Mockito.when(mockTypedObject.getTypeName()).thenReturn("varchar");

        Assert.assertEquals("text", actualDataType);
        Mockito.when(mockDataType.getName()).thenReturn("CLOB");
    JDBCDataSource mockDataSource;
        Mockito.when(mockDataSource.getLocalDataType("text")).thenReturn(mockDataType);
 * you may not use this file except in compliance with the License.
    public void setUp() throws Exception {
    public void convertVarcharDataTypeWithoutModifiersToCLOB() {


        Mockito.when(mockTypedObject.getTypeName()).thenReturn("varchar");
    }
    @Mock
        Mockito.when(mockDataSource.getLocalDataType("clob")).thenReturn(mockDataType);
        String actualDataType = dialect.convertExternalDataType(dialect, mockTypedObject, mockDataSource);
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.junit.Test;
    public void convertVarcharDataTypeWithoutModifiersToNothing() {

    @Test
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
    @Mock
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
 *
        Mockito.when(mockDataType.getName()).thenReturn("text");
 * See the License for the specific language governing permissions and
import org.junit.Before;

}
import org.jkiss.junit.DBeaverUnitTest;
import org.mockito.Mock;
 *
    public void convertVarcharDataTypeWithoutModifiersToTEXT() {
/*
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSDataType;
 * Licensed under the Apache License, Version 2.0 (the "License");

        Mockito.when(mockTypedObject.getMaxLength()).thenReturn(-1L);
    @Test
        Assert.assertNull(actualDataType);
 * You may obtain a copy of the License at
public class DataTypeConverterTest extends DBeaverUnitTest {
 */
        dialect = new JDBCSQLDialect("testName", "testID");
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    DBSTypedObject mockTypedObject;
    DBSDataType mockDataType;
 *     http://www.apache.org/licenses/LICENSE-2.0
