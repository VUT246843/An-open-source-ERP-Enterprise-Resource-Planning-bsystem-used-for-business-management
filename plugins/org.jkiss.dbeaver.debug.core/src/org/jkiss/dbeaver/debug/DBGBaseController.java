        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (!dataSourceContainer.isConnected()) {
                dataSourceContainer.connect(monitor, true, true);
    public DBGSession openSession(DBRProgressMonitor monitor) throws DBGException {


package org.jkiss.dbeaver.debug;
            throws DBGException;
            throw new DBGException(ModelMessages.error_not_connected_to_database);
        Object[] listeners = eventHandlers.getListeners();
    @Override
 *
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.messages.ModelMessages;
            try {

    public void dispose() {
import org.jkiss.dbeaver.debug.jdbc.DBGJDBCSession;
import org.eclipse.core.runtime.ListenerList;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Licensed under the Apache License, Version 2.0 (the "License");
        for (Object listener : listeners) {
    }

 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)


            } catch (DBException e) {
    private final Map<String, Object> configuration;
            eventHandler.handleDebugEvent(event);
        this.configuration = new HashMap<>(configuration);

    }
    @Override
 */
 * DBeaver - Universal Database Manager
    @Override
import org.jkiss.dbeaver.DBException;
    @Override
        return new HashMap<>(configuration);
    private static final Log log = Log.getLog(DBGBaseController.class);

 *
    public DBPDataSourceContainer getDataSourceContainer() {
import java.util.Map;
        for (DBGEventHandler eventHandler : eventHandlers) {
        eventHandlers.add(eventHandler);

/*
}
    public void fireEvent(DBGEvent event) {
    @Override
 * Unless required by applicable law or agreed to in writing, software
        return createSession(monitor, configuration);
 * limitations under the License.
import java.util.HashMap;
 *

    protected DBGBaseController(DBPDataSourceContainer dataSourceContainer, Map<String, Object> configuration) {
        return dataSourceContainer;
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)


                throw new DBGException(e, dataSourceContainer.getDataSource());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
public abstract class DBGBaseController implements DBGController {
    }
    public void unregisterEventHandler(DBGEventHandler eventHandler) {
    private ListenerList<DBGEventHandler> eventHandlers = new ListenerList<>();
        this.dataSourceContainer = dataSourceContainer;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public abstract DBGJDBCSession createSession(DBRProgressMonitor monitor, Map<String, Object> configuration)
    public void registerEventHandler(DBGEventHandler eventHandler) {
    private final DBPDataSourceContainer dataSourceContainer;
    public Map<String, Object> getDebugConfiguration() {

        }
            }
    }
    @Override

        if (!dataSourceContainer.isConnected()) {

    }
import org.jkiss.dbeaver.Log;
            unregisterEventHandler((DBGEventHandler) listener);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        eventHandlers.remove(eventHandler);
    }
    }
