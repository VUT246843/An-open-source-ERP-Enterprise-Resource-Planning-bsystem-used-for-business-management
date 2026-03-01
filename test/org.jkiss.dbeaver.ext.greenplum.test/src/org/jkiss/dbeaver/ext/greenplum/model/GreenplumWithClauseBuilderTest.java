    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
package org.jkiss.dbeaver.ext.greenplum.model;
}

        when(table.isHasOids() && dataSource.getServerType().supportsHasOidsColumn()).thenReturn(hasOids);
    @Mock
 * DBeaver - Universal Database Manager
    public void generateWithClause_whenTableWithOidsWithoutOptions_shouldDisplayWithClauseWithOids() {
        setupGeneralWhenMocks(false, false);
    private void setupGeneralWhenMocks(boolean supportOids, boolean hasOids) {
    @Test
 *
        when(tableBase.getRelOptions()).thenReturn(null);
 * limitations under the License.

 * Licensed under the Apache License, Version 2.0 (the "License");

/*
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2025 DBeaver Corp and others


    }
    @Mock
        String withClause = generateWithClause(table, tableBase);
    }

    private PostgreTableBase tableBase;

import org.mockito.Mock;
 *
        when(serverExtension.supportsOids()).thenReturn(supportOids);
        when(dataSource.getServerType()).thenReturn(serverExtension);

import static org.jkiss.dbeaver.ext.greenplum.model.GreenplumWithClauseBuilder.generateWithClause;
    @Test
import static org.mockito.Mockito.when;
        String withClause = generateWithClause(table, tableBase);
    public void generateWithClause_whenTableWithoutOidsAndWithoutOptions_shouldNotDisplayWithClause() {
    }
    @Test
 * distributed under the License is distributed on an "AS IS" BASIS,




    @Mock
        setupGeneralWhenMocks(true, true);
    public void generateWithClause_whenTableWithoutOidsAndWithOptions_shouldDisplayWithClauseWithRelOptions() {
public class GreenplumWithClauseBuilderTest extends DBeaverUnitTest {
        assertEquals("\nWITH (\n\tOIDS=TRUE,\n\tappendonly=true\n)", withClause);
import static org.junit.Assert.assertEquals;

        assertEquals("\nWITH (\n\tappendonly=true\n)", withClause);

        assertEquals("", withClause);
        setupGeneralWhenMocks(false, false);
    private GreenplumTable table;
    private GreenplumDataSource dataSource;


        when(tableBase.getRelOptions()).thenReturn(null);
 *     http://www.apache.org/licenses/LICENSE-2.0

        setupGeneralWhenMocks(true, true);
 * you may not use this file except in compliance with the License.
        String withClause = generateWithClause(table, tableBase);
        when(table.getDataSource()).thenReturn(dataSource);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        when(tableBase.getRelOptions()).thenReturn(new String[]{"appendonly=true", "orientation=column"});
        setupGeneralWhenMocks(true, true);
        when(tableBase.getRelOptions()).thenReturn(new String[]{"appendonly=true"});
 * See the License for the specific language governing permissions and


        assertEquals("\nWITH (\n\tOIDS=TRUE,\n\tappendonly=true,\n\torientation=column\n)", withClause);
    }
    @Test

 */

    @Mock
    }

        String withClause = generateWithClause(table, tableBase);
        when(tableBase.getRelOptions()).thenReturn(new String[]{"appendonly=true"});
    public void generateWithClause_whenTableWithOidsWithMultipleOptions_shouldDisplayWithClauseWithOidsAndAllTheOptions() {
        String withClause = generateWithClause(table, tableBase);
 * Unless required by applicable law or agreed to in writing, software
    private PostgreServerExtension serverExtension;

    @Test

 *

import org.jkiss.dbeaver.ext.postgresql.model.PostgreServerExtension;
import org.jkiss.junit.DBeaverUnitTest;
        assertEquals("\nWITH (\n\tOIDS=TRUE\n)", withClause);
import org.junit.Test;
    public void generateWithClause_whenTableWithOidsAndOptions_shouldDisplayWithClauseWithOidsAndOptions() {
