 * distributed under the License is distributed on an "AS IS" BASIS,


 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.debug.ui;
 * you may not use this file except in compliance with the License.
 *
 *
 * Panel container
 * You may obtain a copy of the License at
    void updateDialogState();
/**
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    DBRRunnableContext getRunnableContext();
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others

public interface DBGConfigurationPanelContainer {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
/*
 *

 */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

    DBPDataSourceContainer getDataSource();
 *     http://www.apache.org/licenses/LICENSE-2.0

}
    void setWarningMessage(String message);
