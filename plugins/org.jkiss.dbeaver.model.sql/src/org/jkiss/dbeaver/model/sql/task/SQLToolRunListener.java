}
 */
 * Unless required by applicable law or agreed to in writing, software
 *
package org.jkiss.dbeaver.model.sql.task;
 *

 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0

 * SQLToolRunListener
import org.jkiss.dbeaver.model.exec.DBCSession;
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void handleActionStatistics(DBPObject object, DBEPersistAction action, DBCSession session, List<? extends SQLToolStatistics> statistics);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
 */
public interface SQLToolRunListener {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at


 *
import org.jkiss.dbeaver.model.DBPObject;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

/*
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.List;
