 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void alterSession(@NotNull DBCSession session, @NotNull String sessionId, @NotNull Map<String, Object> options)
package org.jkiss.dbeaver.model.admin.sessions;
 * Licensed under the Apache License, Version 2.0 (the "License");
        throws DBException;
}
     */
    /**
import org.jkiss.code.NotNull;

 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
     * @return map containing session termination options, with option keys and their corresponding values
 * See the License for the specific language governing permissions and
        throws DBException;
 * limitations under the License.

import java.util.Map;
    @NotNull
 * DBeaver - Universal Database Manager
 * Session manager
     * Returns the options for terminating sessions.
import org.jkiss.dbeaver.model.exec.DBCSession;
import java.util.Collection;
 *
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBAServerSessionManager<SESSION_TYPE extends DBAServerSession> {
 * you may not use this file except in compliance with the License.
    Collection<SESSION_TYPE> getSessions(@NotNull DBCSession session, @NotNull Map<String, Object> options)
 *
import org.jkiss.dbeaver.DBException;


    DBPDataSource getDataSource();
    @NotNull
 */

/*

 */
 * You may obtain a copy of the License at


/**
    Map<String, Object> getTerminateOptions();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPDataSource;
