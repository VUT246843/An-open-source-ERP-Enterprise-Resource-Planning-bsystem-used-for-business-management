     */
import org.jkiss.code.NotNull;
     */

}

    // Called once after page activation
     */
    void loadSettings();
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager

        return false;

 * Unless required by applicable law or agreed to in writing, software
    boolean isComplete();
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
//        Control control = getControl();
//        if (control != null) {
package org.jkiss.dbeaver.ui;
import org.eclipse.jface.dialogs.IDialogPage;

 * IDataSourceConnectionEditor

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    default void activateEditor() {
     * @return true if all mandatory fields were completed
 *
public interface IDataSourceConnectionEditor extends IDialogPage {

 * distributed under the License is distributed on an "AS IS" BASIS,
     * @return true if all parameters are provided by some external source.
     * Load settings from active datasource info UI
    void setSite(@NotNull IDataSourceConnectionEditorSite site);
     */
    /**
     */
    void saveSettings(DBPDataSourceContainer dataSource);
    /**
 */
//            control.setFocus();
    default boolean isExternalConfigurationProvided() {
     * Sets editor site
     * Save all properties info passed datasource
/*
    /**
/**
//        }
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and

     *     In this case all mandatory connection parameters become optional (as they could be populated externally).
    /**
    /**
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 *
    }
