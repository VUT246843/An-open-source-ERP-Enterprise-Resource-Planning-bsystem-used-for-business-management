    public DBGBreakpointDescriptor describeBreakpoint(Map<String, Object> attributes) {
                throw (DBGException)e;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
                try {

        PostgreDebugSession pgSession = null;
    public PostgreDebugSession createSession(DBRProgressMonitor monitor, Map<String, Object> configuration)
        } catch (DBException e) {
 *
            return pgSession;
            if (e instanceof DBGException) {
        return PostgreDebugBreakpointDescriptor.fromMap(attributes);

    public PostgreDebugController(DBPDataSourceContainer dataSourceContainer, Map<String, Object> configuration) {
 */


            log.debug("Debug session created");
public class PostgreDebugController extends DBGBaseController {
 * DBeaver - Universal Database Manager
 *
            if (pgSession != null) {
            pgSession = new PostgreDebugSession(monitor,this);

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                    pgSession.closeSession(monitor);
import java.util.Map;
            }
    }
            }
 * See the License for the specific language governing permissions and

 * you may not use this file except in compliance with the License.
        super(dataSourceContainer, configuration);
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
            log.debug("Attaching debug session");
 * Unless required by applicable law or agreed to in writing, software

                } catch (Exception e1) {
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.jkiss.dbeaver.debug.DBGBreakpointDescriptor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    log.error(e1);
import org.jkiss.dbeaver.DBException;
            log.debug(String.format("Error attaching debug session %s", e.getMessage()));
            pgSession.attach(monitor, configuration);
import org.jkiss.dbeaver.debug.DBGException;
    @Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
/*
        try {
            throw new DBGException("Error attaching debug session", e);

            throws DBGException
 * limitations under the License.

}

                }
package org.jkiss.dbeaver.ext.postgresql.debug.internal.impl;
            log.debug("Creating debug session");
import org.jkiss.dbeaver.debug.DBGBaseController;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private static final Log log = Log.getLog(PostgreDebugController.class);
