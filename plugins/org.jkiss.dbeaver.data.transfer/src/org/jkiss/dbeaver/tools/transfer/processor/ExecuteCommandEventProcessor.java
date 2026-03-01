 * you may not use this file except in compliance with the License.
        command.setWorkingDirectory(workingDirectory);
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        final String workingDirectory = CommonUtils.toString(processorSettings.get(PROP_WORKING_DIRECTORY));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String ID = "executeCommand";
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        final DBRShellCommand command = new DBRShellCommand(commandLine);
import java.nio.file.Path;
import org.jkiss.utils.CommonUtils;
    public static final String PROP_COMMAND = "command";
    @Override
            CommonUtils.toString(processorSettings.get(PROP_COMMAND)),
 * Unless required by applicable law or agreed to in writing, software
}
            folderPath.resolve(consumer.getOutputFileName()));
package org.jkiss.dbeaver.tools.transfer.processor;
/*
import java.util.Map;
 *
        final DBRProcessDescriptor processDescriptor = new DBRProcessDescriptor(command);

 */
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.runtime.DBRProcessDescriptor;

import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferConsumer;

 * You may obtain a copy of the License at
 *
 * limitations under the License.
    }
 *
import org.jkiss.dbeaver.model.runtime.DBRShellCommand;

 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String PROP_WORKING_DIRECTORY = "workingDirectory";
public class ExecuteCommandEventProcessor implements IDataTransferEventProcessor<StreamTransferConsumer> {

 * Licensed under the Apache License, Version 2.0 (the "License");
        final String commandLine = consumer.translatePattern(
import org.jkiss.dbeaver.tools.transfer.IDataTransferEventProcessor;
    public void processEvent(@NotNull DBRProgressMonitor monitor, @NotNull Event event, @NotNull StreamTransferConsumer consumer, @Nullable DBTTask task, @NotNull Map<String, Object> processorSettings) throws DBException {
        Path folderPath = DBFUtils.resolvePathFromString(
import org.jkiss.dbeaver.model.fs.DBFUtils;
        processDescriptor.execute();
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
            monitor, task == null ? null : task.getProject(), consumer.getOutputFolder());
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.task.DBTTask;
