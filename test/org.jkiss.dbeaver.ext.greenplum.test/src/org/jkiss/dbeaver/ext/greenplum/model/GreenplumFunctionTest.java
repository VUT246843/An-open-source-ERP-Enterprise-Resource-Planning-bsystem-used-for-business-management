

package org.jkiss.dbeaver.ext.greenplum.model;
import org.jkiss.dbeaver.DBException;
    }
        // Greenplum 6 runs on Postgre 9.4.x
    }
        Mockito.when(mockResults.getString("proexeclocation")).thenReturn(executionLocationCode);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        Mockito.when(mockDataSource.isServerVersionAtLeast(Mockito.anyInt(), Mockito.anyInt())).thenReturn(false);
    }
        assertExecuteOnClauseExists("s", "EXECUTE ON ALL SEGMENTS");
    }
 * you may not use this file except in compliance with the License.
    GreenplumDataSource mockDataSource;
    @Mock
 * limitations under the License.
    @Before
    @Test
            GreenplumFunction function = new GreenplumFunction(mockMonitor, mockSchema, mockResults);

    DBRProgressMonitor mockMonitor;
        assertExecuteOnClauseExists("a", "EXECUTE ON ANY");

    JDBCExecutionContext mockContext;
    @Test

 *     http://www.apache.org/licenses/LICENSE-2.0
        testCase.run();
 * Unless required by applicable law or agreed to in writing, software

            Assert.assertEquals(GreenplumFunction.FunctionExecLocation.a, function.getExecutionLocation());
    PostgreSchema.ConstraintCache mockConstraintCache;
            throws SQLException {
            throws SQLException, DBException {
//        Mockito.when(mockSchema.getDatabase()).thenReturn(mockDatabase);
    }

//        Mockito.when(mockDataSource.getDefaultInstance()).thenReturn(mockDatabase);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.sql.SQLException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            Assert.assertNull(function.getExecutionLocation());
    @Test
        Mockito.when(mockDataSource.getSQLDialect()).thenReturn(new PostgreDialect());
    public void generateFunctionDeclaration_whenExecLocationIsSupportedAndSetToANY_thenShouldIncludeExecLocationClauseInDeclaration()
    private void withGreenplumVersionLessThan6(Runnable testCase) {
        withGreenplumVersion6AndAbove(() -> {
    public void onCreationWithDbResult_whenGreenplumVersionIsSixAndAbove_thenExecutionLocationIsLoaded()
                    .contains("EXECUTE ON"));
    public void generateFunctionDeclaration_whenExecLocationIsSupportedAndSetToMASTER_thenShouldIncludeExecLocationClauseInDeclaration()
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDialect;


    @Test
    @Test
        withGreenplumVersionLessThan6(() -> {
    }
    }
    }
//        Mockito.when(mockDatabase.getDefaultContext(Mockito.any(), Mockito.anyBoolean())).thenReturn(mockContext);

//        Mockito.when(mockDatabase.getName()).thenReturn(exampleDatabaseName);
        });
    @Test

    }

                    .endsWith(expectedClause));
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
            Assert.assertFalse(function.generateFunctionDeclaration(postgreLanguage, "someName", "funcBody")
    PostgreSchema.TableCache mockTableCache;
            GreenplumFunction function = new GreenplumFunction(mockSchema);
            Assert.assertTrue(function.generateFunctionDeclaration(postgreLanguage, "someName", "funcBody")
 * You may obtain a copy of the License at
    public void onCreationWithDbResult_whenGreenplumVersionIsBelowSix_thenExecutionLocationIsNull()

        // Greenplum 6 runs on Postgre 9.4.x

    JDBCResultSet mockResults;

            throws SQLException {
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        withGreenplumVersionLessThan6(() -> {
        Mockito.verify(mockResults, Mockito.times(0)).getString("proexeclocation");
    private void setGreenplumToVersion6() {
            Assert.assertNull(function.getExecutionLocation());
            throws SQLException, DBException {
    @Mock
import org.jkiss.dbeaver.ext.postgresql.model.PostgreLanguage;
            GreenplumFunction function = new GreenplumFunction(mockSchema);
    @Test

        withGreenplumVersion6AndAbove(() -> {
    }

        });
//        Mockito.when(mockSchema.getConstraintCache()).thenReturn(mockConstraintCache);

    @Mock
    public void generateFunctionDeclaration_whenExecLocationIsSupportedAndSetToALL_thenShouldIncludeExecLocationClauseInDeclaration()
    private final String exampleDatabaseName = "sampleDatabase";
}
 * See the License for the specific language governing permissions and
public class GreenplumFunctionTest extends DBeaverUnitTest {
            GreenplumFunction function = new GreenplumFunction(mockMonitor, mockSchema, mockResults);

    }
            throws SQLException, DBException {

 *
    private final String exampleTableName = "sampleTable";
//        Mockito.when(mockSchema.getTableCache()).thenReturn(mockTableCache);
 *



 *

    private final String exampleSchemaName = "sampleSchema";

import org.junit.Before;
import org.jkiss.junit.DBeaverUnitTest;
    private void setGreenplumToVersionLessThan6() {
import org.mockito.Mock;
import org.junit.Assert;
    public void onCreation_whenGreenplumVersionIsSixAndAbove_thenExecutionLocationDefaultsToANY() {
        });
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.junit.Test;
        Mockito.when(mockDataSource.isServerVersionAtLeast(9, 4)).thenReturn(false);

        });
        assertExecuteOnClauseExists("m", "EXECUTE ON MASTER");
import org.mockito.Mockito;

        Mockito.when(mockDataSource.isServerVersionAtLeast(9, 4)).thenReturn(true);
        Mockito.when(mockResults.getString("proexeclocation")).thenReturn("a");

    @Mock
    private PostgreLanguage postgreLanguage;

        Mockito.when(mockSchema.getName()).thenReturn(exampleSchemaName);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
        Mockito.when(mockDataSource.getServerType()).thenReturn(new PostgreServerGreenplum(mockDataSource));
        postgreLanguage = new PostgreLanguage(mockDatabase, mockResults);
    @Mock
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            Assert.assertEquals(GreenplumFunction.FunctionExecLocation.a, function.getExecutionLocation());
        });
 */
    public void setUp() throws Exception {
        testCase.run();
    private GreenplumTable table;
 * distributed under the License is distributed on an "AS IS" BASIS,
            GreenplumFunction function = new GreenplumFunction(mockMonitor, mockSchema, mockResults);

        setGreenplumToVersionLessThan6();
 * DBeaver - Universal Database Manager
    private void withGreenplumVersion6AndAbove(Runnable testCase) {
    @Mock
    public void onCreation_whenGreenplumVersionIsBelowSix_thenExecutionLocationIsNotSet() {
    PostgreDatabase mockDatabase;
    }
        Mockito.when(mockSchema.getDataSource()).thenReturn(mockDataSource);
        withGreenplumVersion6AndAbove(() -> {
    @Test
            throws SQLException, DBException {
    private void assertExecuteOnClauseExists(String executionLocationCode, String expectedClause) throws SQLException {
    @Mock
            GreenplumFunction function = new GreenplumFunction(mockMonitor, mockSchema, mockResults);
        withGreenplumVersionLessThan6(() -> {
/*
        });
        setGreenplumToVersion6();

    public void generateFunctionDeclaration_whenExecLocationIsNotSupported_thenShouldNotRetainAnyTypeOfExecutionLocationInDeclaration()
    PostgreSchema mockSchema;
        Mockito.when(mockResults.getString("proname")).thenReturn("sampleFunction");
    @Mock
