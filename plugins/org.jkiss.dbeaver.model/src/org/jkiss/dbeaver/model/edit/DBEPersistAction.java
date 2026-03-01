 *
import org.jkiss.dbeaver.DBException;

 * Licensed under the Apache License, Version 2.0 (the "License");


 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    void afterExecute(DBCSession session, Throwable error)


/**
 * DBeaver - Universal Database Manager
    boolean isComplex();
 */
        INITIALIZER,
 * See the License for the specific language governing permissions and
    String getScript();
 *     http://www.apache.org/licenses/LICENSE-2.0

 *

        OPTIONAL,
    ActionType getType();
 */
package org.jkiss.dbeaver.model.edit;
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    String getTitle();

        COMMENT
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        throws DBException;
 * Database persist action
/*
    void beforeExecute(DBCSession session)

    enum ActionType {
        throws DBException;
        FINALIZER,
import org.jkiss.dbeaver.model.exec.DBCSession;

}
public interface DBEPersistAction {
    }
        NORMAL,
