
 * distributed under the License is distributed on an "AS IS" BASIS,
        String withClause = serverExtension.createWithClause(table, null);
        assertEquals("", withClause);
        String withClause = serverExtension.createWithClause(table, null);
 * You may obtain a copy of the License at
    @Mock
 * See the License for the specific language governing permissions and

    @Test
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        when(table.isHasOids()).thenReturn(hasOids);
    }
    @Test
        serverExtension = new PostgreServerPostgreSQL(dataSource);
    private PostgreServerPostgreSQL serverExtension;


 * DBeaver - Universal Database Manager
    @Before
        setupGeneralWhenMocks(true);
        setupGeneralWhenMocks(false);
    private PostgreDataSource dataSource;
}
    }
import org.mockito.Mock;
 * Unless required by applicable law or agreed to in writing, software

 *
 * you may not use this file except in compliance with the License.

    @Mock
import static org.mockito.Mockito.when;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.postgresql.model;
import org.jkiss.junit.DBeaverUnitTest;

        String withClause = serverExtension.createWithClause(table, null);
        when(dataSource.getServerType()).thenReturn(serverExtension);
    @Test
    public void setUp() {
        assertEquals("\nWITH (\n\tOIDS=TRUE\n)", withClause);

        setupGeneralWhenMocks(false);
import org.junit.Test;
    private void setupGeneralWhenMocks(boolean hasOids) {
        when(table.getDataSource()).thenReturn(dataSource);
 * limitations under the License.
public class PostgreServerExtensionBaseTest extends DBeaverUnitTest {
    }
/*
 */
 *
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
    public void createWithClause_whenTableDoesNotSupportsOids_shouldNotDisplayWithClause() {

    public void createWithClause_whenOidsAreSupported_shouldDisplayWithClauseWithOidsAsTrue() {
    }
import org.junit.Before;
    }

    private PostgreTableRegular table;
import static org.junit.Assert.assertEquals;
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerPostgreSQL;
        assertEquals("", withClause);

    public void createWithClause_whenTableSupportsOidsButDoesNotHaveOids_shouldNotDisplayWithClause() {


