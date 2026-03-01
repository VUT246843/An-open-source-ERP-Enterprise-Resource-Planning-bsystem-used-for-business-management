 * Script progress listener
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCException;
 *

 *
}
/*
 */
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
    void processObjectResults(@NotNull T object, @Nullable DBCStatement statement, @Nullable DBCResultSet resultSet) throws DBCException;
 * See the License for the specific language governing permissions and
    void endObjectProcessing(@NotNull T object, Exception error);

 *
    void endScriptProcessing();
 */
    void beginScriptProcessing(Job job, Collection<T> objects);
 * Licensed under the Apache License, Version 2.0 (the "License");

import java.util.Collection;
package org.jkiss.dbeaver.ui.editors.sql.dialogs;
    void beginObjectProcessing(@NotNull T object, int objectNumber);
import org.jkiss.code.Nullable;
import org.eclipse.core.runtime.jobs.Job;

import org.jkiss.dbeaver.model.exec.DBCStatement;

 * Copyright (C) 2010-2024 DBeaver Corp and others

/**


 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCResultSet;

public interface SQLScriptProgressListener<T extends DBSObject> {
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
