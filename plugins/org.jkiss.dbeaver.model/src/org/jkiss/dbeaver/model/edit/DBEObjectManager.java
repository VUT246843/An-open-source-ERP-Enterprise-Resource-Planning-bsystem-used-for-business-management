 * Unless required by applicable law or agreed to in writing, software
 *
     * Object type (class)
    String OPTION_UI_SOURCE = "uiSource";

import org.jkiss.dbeaver.DBException;
 */
 * DBeaver - Universal Database Manager
    String OPTION_CLOSE_EXISTING_CONNECTIONS = "closeExistingConnections";
public interface DBEObjectManager<OBJECT_TYPE extends DBPObject> {
    /**
    String OPTION_ACTIVE_EDITOR = "activeEditor";
        DBEPersistAction action)

 *     http://www.apache.org/licenses/LICENSE-2.0
 *

    /**
        DBCSession session,
package org.jkiss.dbeaver.model.edit;
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.

 *
import org.jkiss.dbeaver.model.exec.DBCSession;
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBEObjectManager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 */
/**
     * Usually it is a navigator node (DBNNode).
    void executePersistAction(
     */
    String OPTION_OBJECT_TYPE = "objectType";
    String OPTION_CONTAINER = "container";
 * You may obtain a copy of the License at
        DBECommand<OBJECT_TYPE> command,
 * Copyright (C) 2010-2024 DBeaver Corp and others

} * distributed under the License is distributed on an "AS IS" BASIS,
        throws DBException;
import org.jkiss.dbeaver.model.DBPObject;
 * limitations under the License.
    String OPTION_DELETE_CASCADE = "deleteCascade";

     * New object container.
