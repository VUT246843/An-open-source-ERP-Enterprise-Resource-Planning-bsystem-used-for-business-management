    default void setRuntimeParameters(@Nullable Object runtimeParameters) { }
        public int totalConsumers;

     * @param monitor monitor
     * @param error   an error caught during transfer, or {@code null} if transfer was successful

 */
import java.util.Date;
     * Set non-persistent parameters for data transfer execution which is shared between consumers of the task
    }
    /**
        }
    Object getTargetObjectContainer();
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
     *
        public TransferParameters() {
 */

    void initTransfer(
     * @param task    a task the transfer was started from
     */

        @Nullable PROCESSOR processor,
            this(isBinary, isHTML, null);

     * Finishes this transfer
    default void finishTransfer(@NotNull DBRProgressMonitor monitor, @Nullable Exception exception, boolean last) {
    void startTransfer(DBRProgressMonitor monitor) throws DBException;
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.tools.transfer;
    default void finishTransfer(@NotNull DBRProgressMonitor monitor, @Nullable Throwable error, @Nullable DBTTask task, boolean last) {

     * @param last called in the very end of all transfers

    void finishTransfer(DBRProgressMonitor monitor, boolean last);

{
        @Nullable SETTINGS settings,
public interface IDataTransferConsumer<SETTINGS extends IDataTransferSettings, PROCESSOR extends IDataTransferProcessor>
import org.jkiss.dbeaver.model.task.DBTTask;
/*

    /**
        public TransferParameters(boolean isBinary, boolean isHTML, OutputStream exportToStream) {
        }
        public OutputStream exportToStream;
     * Finishes this transfer
    @Nullable
        public TransferParameters(boolean isBinary, boolean isHTML) {
     *
 * limitations under the License.
        public Date startTimestamp;
     * @param last      called in the very end of all transfers
        }
     * @param monitor   monitor
        finishTransfer(monitor, exception, null, last);
    // Target object. May be null or target database object (table)
            this.exportToStream = exportToStream;
     * @param exception an exception caught during transfer, or {@code null} if transfer was successful
    }
import java.io.OutputStream;
 *
        @NotNull TransferParameters parameters,
import org.jkiss.dbeaver.DBException;
     */
 * you may not use this file except in compliance with the License.
    /**
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
        public boolean isHTML;
 * DBeaver - Universal Database Manager
            this.isHTML = isHTML;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
     * @param monitor monitor

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
            this.isBinary = isBinary;
        finishTransfer(monitor, last);
    @Nullable
        @Nullable Map<String, Object> processorProperties,
     * @param last    called in the very end of all transfers
     * Finishes this transfer
    // If not null then this consumer is a fake one which must be replaced by explicit target consumers on configuration stage

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/**
     */
}
 *
     */
    class TransferParameters {
        public boolean isBinary;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Data consumer

        @Nullable DBPProject project);
        @NotNull DBSObject sourceObject,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public int orderNumber;
    Object getTargetObject();
    }

    extends IDataTransferNode<SETTINGS>, DBDDataReceiver
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.app.DBPProject;
import java.util.Map;
 *
import org.jkiss.code.NotNull;
