    public void saveSettings(@NotNull Map<String, Object> settings) {
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.tools.transfer.ui.IDataTransferEventProcessorConfigurator;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Composite;
 *
    public void resetSettings(@NotNull Map<String, Object> settings) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        // not implemented

 *     http://www.apache.org/licenses/LICENSE-2.0
    public void loadSettings(@NotNull Map<String, Object> settings) {
    public boolean isApplicable(@NotNull StreamConsumerSettings configuration) {

        return true;

public class ShowInExplorerEventProcessorConfigurator implements IDataTransferEventProcessorConfigurator<StreamConsumerSettings> {

 * you may not use this file except in compliance with the License.
    @Override
    }
 * DBeaver - Universal Database Manager

package org.jkiss.dbeaver.tools.transfer.ui.processor.config;
/*
        // not implemented
    }
 * Unless required by applicable law or agreed to in writing, software

        // Empty objects are not serialized, see JSONUtils#serializeProperties.
import java.util.Map;
        return false;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        // so we have to put some dummy value in it. It doesn't get serialized
}
 * See the License for the specific language governing permissions and
    }
        // somehow, so we end up with an empty object :^)
 */
        // not implemented
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @Override
    }
    public boolean isComplete() {
        return !configuration.isOutputClipboard();

 * limitations under the License.
        // We don't want to change this behavior just for this exceptional case,
 *
    }

    }
    public void createControl(@NotNull Composite parent, @NotNull StreamConsumerSettings settings, @NotNull Runnable propertyChangeListener) {
    @Override
 *

    @Override
    @Override
    public boolean hasControl() {
    @Override
        settings.put("_", "");
