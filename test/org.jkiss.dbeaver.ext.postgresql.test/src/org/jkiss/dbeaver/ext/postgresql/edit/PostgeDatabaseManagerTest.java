}
    }
        assertTrue(actions.isEmpty());
        //then
        assertThrows(DBException.class,
 */
        var command = mock(SQLObjectEditor.ObjectCreateCommand.class);

    private DBPDataSourceContainer container;
    }
        assertFalse(actions.isEmpty());
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        //when
        assertTrue(actions.isEmpty());
 * limitations under the License.
    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        when(dataSource.getContainer()).thenReturn(container);

        when(command.getObject()).thenReturn(object);
        databaseManager.addObjectCreateActions(monitor, mock(DBCExecutionContext.class), actions, command, options);
import org.junit.Before;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
        //when
 * distributed under the License is distributed on an "AS IS" BASIS,

    private DBRProgressMonitor monitor;
import org.junit.Test;
    @Mock(answer = Answers.RETURNS_DEEP_STUBS)

    @Test
    public void whenShowAllDBsEnabledShouldCreateDB() throws Exception {
/*

    @Test

    private Map<String, Object> options;
        //instances
        configuration = new DBPConnectionConfiguration();
    public void setUp() {
    private DBPConnectionConfiguration configuration;
import org.mockito.Mock;
        options = new HashMap<>();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.junit.DBeaverUnitTest;
    private PostgreDatabase object;
        when(object.getDataSource()).thenReturn(dataSource);
    @Before
public class PostgeDatabaseManagerTest extends DBeaverUnitTest {
    @Test
 *

        assertThrows(DBException.class,
        var command = mock(SQLObjectEditor.ObjectCreateCommand.class);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private List<DBEPersistAction> actions;
    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private PostgreDataSource dataSource;
        configuration.setProviderProperty(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB, "false");
        when(container.getActualConnectionConfiguration()).thenReturn(configuration);

import org.jkiss.dbeaver.DBException;


import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import static org.junit.Assert.*;
import java.util.Map;

package org.jkiss.dbeaver.ext.postgresql.edit;
 * DBeaver - Universal Database Manager

        //then
        //given
        var command = mock(SQLObjectEditor.ObjectCreateCommand.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        actions = new ArrayList<>();
        //when
        configuration.setProviderProperty(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB, "true");

 * you may not use this file except in compliance with the License.
    @Mock
            () -> databaseManager.addObjectCreateActions(monitor, mock(DBCExecutionContext.class), actions, command, options));
import static org.mockito.Mockito.when;
            () -> databaseManager.addObjectCreateActions(monitor, mock(DBCExecutionContext.class), actions, command, options));

        //mocks
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;

import java.util.ArrayList;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        //test instance
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
import java.util.HashMap;
 * You may obtain a copy of the License at
    public void whenShowAllDBsNotSetShouldThrowInDBCreation() {
    public void whenShowAllDBsDisabledShouldThrowInDBCreation() {
        databaseManager = new PostgreDatabaseManager();
        when(command.getObject()).thenReturn(object);
import org.mockito.Answers;



import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 *
    }
        when(command.getObject()).thenReturn(object);
        //then
import static org.mockito.Mockito.mock;
 *
import java.util.List;
    }
    private PostgreDatabaseManager databaseManager;
 *     http://www.apache.org/licenses/LICENSE-2.0
