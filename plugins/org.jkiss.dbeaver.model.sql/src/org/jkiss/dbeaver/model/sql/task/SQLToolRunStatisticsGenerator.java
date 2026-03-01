
 * SQLToolRunStatisticsGenerator
 * Unless required by applicable law or agreed to in writing, software
 *
 *
package org.jkiss.dbeaver.model.sql.task;
    OBJECT_TYPE extends DBSObject,
public interface SQLToolRunStatisticsGenerator<
        @NotNull DBCSession session,
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.DBException;
    List<? extends SQLToolStatistics<OBJECT_TYPE>> getExecuteStatistics(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
import org.jkiss.code.NotNull;

 */
        @NotNull OBJECT_TYPE object,
 *
    PERSIST_ACTION extends DBEPersistAction> {
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
 * you may not use this file except in compliance with the License.
    SETTINGS extends SQLToolExecuteSettings<OBJECT_TYPE>,
        @NotNull SETTINGS settings,
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
import java.util.List;
        @NotNull DBCStatement dbStat
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCStatement;
        @NotNull PERSIST_ACTION action,
    ) throws DBException;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCSession;
}
 * DBeaver - Universal Database Manager

 * See the License for the specific language governing permissions and

/**
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

