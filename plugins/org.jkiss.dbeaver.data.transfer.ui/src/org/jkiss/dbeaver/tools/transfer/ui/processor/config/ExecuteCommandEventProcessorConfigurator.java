    @Override
    public void createControl(@NotNull Composite parent, @NotNull StreamConsumerSettings settings, @NotNull Runnable propertyChangeListener) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.

        final Composite group = new Composite(parent, SWT.NONE);
            workingDirectory = workingDirectoryText.getText();
        workingDirectoryText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * DBeaver - Universal Database Manager

        }
        return !configuration.isOutputClipboard();
import org.jkiss.dbeaver.ui.controls.TextWithOpenFolder;

        commandText.addModifyListener(e -> {
            propertyChangeListener.run();
    private String workingDirectory;
    public boolean isApplicable(@NotNull StreamConsumerSettings configuration) {
    public void saveSettings(@NotNull Map<String, Object> settings) {
            propertyChangeListener.run();
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings;
            settings.put(ExecuteCommandEventProcessor.PROP_WORKING_DIRECTORY, workingDirectory);
        if (!CommonUtils.isEmptyTrimmed(workingDirectory)) {
    @Override
        });
        return !CommonUtils.isEmptyTrimmed(command);
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.tools.transfer.ui.processor.config;
    }
 *
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
        workingDirectoryText.getTextControl().addModifyListener(e -> {

import java.util.Map;
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
        workingDirectoryText.setText(workingDirectory);
    @Override
        group.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
    }
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.tools.transfer.ui.IDataTransferEventProcessorConfigurator;
    }
import org.jkiss.dbeaver.tools.transfer.processor.ExecuteCommandEventProcessor;
 * See the License for the specific language governing permissions and
        settings.put(ExecuteCommandEventProcessor.PROP_COMMAND, command);
    public boolean isComplete() {
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.eclipse.swt.widgets.Composite;

}
        workingDirectory = CommonUtils.toString(settings.get(ExecuteCommandEventProcessor.PROP_WORKING_DIRECTORY));
 *
import org.eclipse.swt.layout.GridData;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    }
 * you may not use this file except in compliance with the License.
        command = CommonUtils.toString(settings.get(ExecuteCommandEventProcessor.PROP_COMMAND));
        UIUtils.createControlLabel(group, DTUIMessages.data_transfer_event_processor_execute_command_working_directory);
    private String command;
    public void loadSettings(@NotNull Map<String, Object> settings) {
        final TextWithOpenFolder workingDirectoryText = new TextWithOpenFolder(group, DTUIMessages.data_transfer_event_processor_execute_command_working_directory_title);


import org.eclipse.jface.layout.GridLayoutFactory;

 * Licensed under the Apache License, Version 2.0 (the "License");

    public void resetSettings(@NotNull Map<String, Object> settings) {
public class ExecuteCommandEventProcessorConfigurator implements IDataTransferEventProcessorConfigurator<StreamConsumerSettings> {
            command = commandText.getText();
 */
import org.eclipse.swt.widgets.Text;

 *
        group.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(300, SWT.DEFAULT).create());
    }
        });

        final Text commandText = UIUtils.createLabelText(group, DTUIMessages.data_transfer_event_processor_execute_command_command, command);
