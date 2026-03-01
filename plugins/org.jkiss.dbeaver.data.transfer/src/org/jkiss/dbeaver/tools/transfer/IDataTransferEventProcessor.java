        @NotNull Map<String, Object> settings
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.task.DBTTask;
        @Nullable DBTTask task,
        FINISH
 *
 * limitations under the License.
        // do nothing by default

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    void processEvent(
    enum Event {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    }
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull T consumer,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
/*
package org.jkiss.dbeaver.tools.transfer;
 * Unless required by applicable law or agreed to in writing, software
 *
        @NotNull DBRProgressMonitor monitor,
        @NotNull Map<String, Object> settings
public interface IDataTransferEventProcessor<T extends IDataTransferConsumer<?, ?>> {
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
    }

 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;

        @NotNull T consumer,

    ) throws DBException {
        START,
import java.util.Map;

        @NotNull Event event,
        @NotNull Throwable error,
 */
        @Nullable DBTTask task,
        @NotNull DBRProgressMonitor monitor,
    ) throws DBException;
    default void processError(
