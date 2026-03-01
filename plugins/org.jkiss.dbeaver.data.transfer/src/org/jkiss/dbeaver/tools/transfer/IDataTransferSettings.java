
 *


 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    }
public interface IDataTransferSettings {
 * Transfer settings
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0


 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    /**
}
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and
    String getSettingsSummary();
 *
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    void saveSettings(Map<String, Object> settings);

package org.jkiss.dbeaver.tools.transfer;
 * distributed under the License is distributed on an "AS IS" BASIS,
    void loadSettings(DBRRunnableContext runnableContext, DataTransferSettings dataTransferSettings, Map<String, Object> settings);
import java.util.Map;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
     * Returns non-persistent parameters for data transfer execution which is shared between consumers of the task
/*
        return null;
     */
 * limitations under the License.
    default Object prepareRuntimeParameters() {
/**
 * you may not use this file except in compliance with the License.
 *
