 * limitations under the License.

 * You may obtain a copy of the License at
 */
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
public interface IDataTransferProducer<SETTINGS extends IDataTransferSettings> extends IDataTransferNode<SETTINGS> {
    }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.task.DBTTask;
    /**
    void transferData(
 * Data transfer
import org.jkiss.dbeaver.model.exec.DBCStatistics;
package org.jkiss.dbeaver.tools.transfer;

        @NotNull SETTINGS settings,
     * @param task      task (optional)
    @NotNull
 * DBeaver - Universal Database Manager
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        throws DBException;
 *


     * @param processor transfer processor (optional)
    default DBCStatistics getStatistics() {
        @Nullable DBTTask task)
     * @param consumer  transfer consumer
     * @param settings  settings
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
 * you may not use this file except in compliance with the License.
/**
 */
        return new DBCStatistics();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull DBRProgressMonitor monitor,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        @NotNull IDataTransferConsumer consumer,
import org.jkiss.code.Nullable;
     * Transfer data to consumer
 *
}
import org.jkiss.code.NotNull;
     * @param monitor   progress monitor
        @Nullable IDataTransferProcessor processor,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
