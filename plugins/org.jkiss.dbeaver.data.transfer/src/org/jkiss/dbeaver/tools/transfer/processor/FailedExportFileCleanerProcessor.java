public class FailedExportFileCleanerProcessor implements IDataTransferEventProcessor<StreamTransferConsumer> {
        }
import java.nio.file.Path;
        @NotNull DBRProgressMonitor monitor,


 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
            // We don't want to remove existing file
    @Override
import org.jkiss.dbeaver.model.task.DBTTask;
 * DBeaver - Universal Database Manager
}
 *
        @Nullable DBTTask task,
    public static final String ID = "failedExportFileCleaner";
import java.util.Map;
import java.nio.file.Files;
        @NotNull Event event,
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferConsumer;
        // do nothing
                Files.deleteIfExists(outputFile);
    ) {
        @NotNull DBRProgressMonitor monitor,
        @Nullable DBTTask task,
/*


        if (consumer.getSettings().isUseSingleFile()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (Path outputFile : consumer.getOutputFiles()) {

        @NotNull Throwable error,
        @NotNull Map<String, Object> settings
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
 *
        @NotNull StreamTransferConsumer consumer,
        @NotNull StreamTransferConsumer consumer,
    @Override
import org.jkiss.dbeaver.tools.transfer.IDataTransferEventProcessor;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return;
    private static final Log log = Log.getLog(FailedExportFileCleanerProcessor.class);
    ) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.tools.transfer.processor;
        @NotNull Map<String, Object> settings
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.Log;
import org.jkiss.code.Nullable;
    public void processError(
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software

 * You may obtain a copy of the License at
            } catch (IOException e) {
    }
    public void processEvent(
import java.io.IOException;
        }
                log.warn("Unable to delete failed export file '" + outputFile.toAbsolutePath() + "'", e);
            try {
    }
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
