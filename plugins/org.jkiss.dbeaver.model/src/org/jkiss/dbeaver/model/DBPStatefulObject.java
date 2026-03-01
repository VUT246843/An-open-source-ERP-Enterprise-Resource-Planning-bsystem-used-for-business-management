

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws DBCException;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
 * limitations under the License.
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    void refreshObjectState(@NotNull DBRProgressMonitor monitor)
/**
 * Object with state.
    DBSObjectState getObjectState();
import org.jkiss.dbeaver.model.exec.DBCException;
 *
}

 *     http://www.apache.org/licenses/LICENSE-2.0


package org.jkiss.dbeaver.model;
 */
/*
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public interface DBPStatefulObject extends DBPObject {
import org.jkiss.dbeaver.model.struct.DBSObjectState;
 * DBeaver - Universal Database Manager
    @NotNull
