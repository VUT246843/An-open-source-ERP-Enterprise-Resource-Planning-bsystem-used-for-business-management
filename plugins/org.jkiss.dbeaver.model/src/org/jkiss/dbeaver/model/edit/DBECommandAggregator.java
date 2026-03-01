/**
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
/*
 *
 * You may obtain a copy of the License at
 * Command aggregator.
 */
 * you may not use this file except in compliance with the License.
    void resetAggregatedCommands();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Usually it is the first command (create new object)
 *
 * See the License for the specific language governing permissions and


public interface DBECommandAggregator<OBJECT_TYPE extends DBPObject> extends DBECommand<OBJECT_TYPE> {
 * DBeaver - Universal Database Manager

package org.jkiss.dbeaver.model.edit;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
}

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Only single such command allowed in command context.
    boolean aggregateCommand(DBECommand<?> command);

 */
