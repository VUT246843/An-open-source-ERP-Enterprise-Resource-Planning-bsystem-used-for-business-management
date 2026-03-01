
 * limitations under the License.
            if (IOUtils.isLocalURI(finalFile.toUri())) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.nio.file.Path;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                String finalPath = finalFile.toAbsolutePath().toString();
 * You may obtain a copy of the License at
                    monitor,
            }
    @Override
    }
                .resolve(filename);
 * you may not use this file except in compliance with the License.
    public static final String ID = "showInExplorer";
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
                DBWorkbench.getPlatformUI().showInSystemExplorer(finalPath);
            final String folder = consumer.getOutputFolder();

        }
import java.util.Map;
            final String filename = consumer.getOutputFileName();
 * Unless required by applicable law or agreed to in writing, software
 *
                    folder)
 *
package org.jkiss.dbeaver.tools.transfer.processor;
 *
 */
                    consumer.getProject(),

import org.jkiss.utils.IOUtils;
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferConsumer;
            Path finalFile = DBFUtils.resolvePathFromString(
import org.jkiss.dbeaver.model.task.DBTTask;
/*
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void processEvent(@NotNull DBRProgressMonitor monitor, @NotNull Event event, @NotNull StreamTransferConsumer consumer, @Nullable DBTTask task, @NotNull Map<String, Object> processorSettings) throws DBException {
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (!consumer.getSettings().isOutputClipboard()) {
import org.jkiss.dbeaver.model.fs.DBFUtils;
public class ShowInExplorerEventProcessor implements IDataTransferEventProcessor<StreamTransferConsumer> {

import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.tools.transfer.IDataTransferEventProcessor;
