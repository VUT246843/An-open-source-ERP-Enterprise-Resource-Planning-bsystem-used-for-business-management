import org.jkiss.dbeaver.tools.transfer.ui.IDataTransferEventProcessorConfigurator;
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
/*
    @Override


    }
 * you may not use this file except in compliance with the License.
    }
}


import java.util.Map;
    public boolean isComplete() {
    }
    public boolean hasControl() {
    }
    }
 * You may obtain a copy of the License at
    @Override
    public boolean isApplicable(@NotNull StreamConsumerSettings settings) {
package org.jkiss.dbeaver.tools.transfer.ui.processor.config;
    @Override
 * See the License for the specific language governing permissions and
public class FailedExportFileCleanerProcessorConfigurator implements IDataTransferEventProcessorConfigurator<StreamConsumerSettings> {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return !settings.isOutputClipboard() && !settings.isUseSingleFile();
 *

        return false;

    @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    public void resetSettings(@NotNull Map<String, Object> stringObjectMap) {
    public void loadSettings(@NotNull Map<String, Object> stringObjectMap) {
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

        return true;
    public void saveSettings(@NotNull Map<String, Object> stringObjectMap) {

    @Override
import org.jkiss.code.NotNull;
    public void createControl(@NotNull Composite parent, StreamConsumerSettings object, @NotNull Runnable propertyChangeListener) {
 */
 * DBeaver - Universal Database Manager
import org.eclipse.swt.widgets.Composite;

    @Override
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
