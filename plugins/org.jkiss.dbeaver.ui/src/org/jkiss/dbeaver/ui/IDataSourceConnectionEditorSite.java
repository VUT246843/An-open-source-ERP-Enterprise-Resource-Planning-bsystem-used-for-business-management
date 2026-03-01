 * DBeaver - Universal Database Manager
/*
 */

    IWizard getWizard();
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0

 * IDataSourceConnectionEditorSite
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    RCPProject getProject();
 *
    void updateButtons();
    @NotNull
    boolean openSettingsPage(String pageId);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui;
     * Fires property change event in all connection pages
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;

    DBPDriver getDriver();
    DBPDataSourceContainer getActiveDataSource();
    DBRRunnableContext getRunnableContext();

    boolean openDriverEditor();
 * you may not use this file except in compliance with the License.
    boolean isNew();

import org.jkiss.code.NotNull;


/**
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.rcp.RCPProject;

import org.eclipse.jface.wizard.IWizard;

 * Unless required by applicable law or agreed to in writing, software
 */

import org.jkiss.dbeaver.model.connection.DBPDriver;
    DBPDataSourceRegistry getDataSourceRegistry();
 *
     */
 * limitations under the License.
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 *
 * See the License for the specific language governing permissions and
    void testConnection();
}

    /**
{
    void firePropertyChange(Object source, String property, Object oldValue, Object newValue);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface IDataSourceConnectionEditorSite

