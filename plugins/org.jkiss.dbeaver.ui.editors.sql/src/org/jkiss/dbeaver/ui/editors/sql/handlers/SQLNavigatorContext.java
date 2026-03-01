        if (dataSourceContainer != null) {

                this.dataSourceContainer = (DBPDataSourceContainer) selectedObject;
    }
        DBPDataSourceContainer ds = getDataSourceContainer();
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
    public SQLNavigatorContext(SQLScriptContext scriptContext, boolean reuseExecutionContext) {
/*
        return this.reuseExecutionContext;

    public SQLNavigatorContext(DBCExecutionContext executionContext) {
        return scriptContext;
            if (selectedObject instanceof DBPDataSourceContainer) {
        this.selectedObject = null;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
    SQLNavigatorContext(ExecutionEvent event) {
    public DBPDataSourceContainer getDataSourceContainer() {

    @Override
        return (RCPProject) (ds != null ? ds.getProject() : NavigatorUtils.getSelectedProject());
    }
        }
            }
 * You may obtain a copy of the License at
        this.reuseExecutionContext = reuseExecutionContext;
    }
package org.jkiss.dbeaver.ui.editors.sql.handlers;
    private DBPDataSourceContainer dataSourceContainer;

            } else {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setDataSourceContainer(DBPDataSourceContainer dataSourceContainer) {
        this.selectedObject = null;
        this.selectedObject = null;
        } else if (scriptContext != null) {

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return null;
    private DBSObject selectedObject;
        this.dataSourceContainer = selectedObject == null ? null :
        this.selectedObject = AbstractDataSourceHandler.getActiveObject(event);
public class SQLNavigatorContext implements DatabaseEditorContext {
    public SQLNavigatorContext(DBPDataSourceContainer dataSourceContainer, DBCExecutionContext executionContext) {
}
 * you may not use this file except in compliance with the License.
            }

 *
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;

        if (selectedObject != null) {

    public DBCExecutionContext getExecutionContext() {
                this.dataSourceContainer = selectedObject.getDataSource().getContainer();
import org.jkiss.dbeaver.model.rcp.RCPProject;

    private DBCExecutionContext executionContext;
        } else {
    @Nullable
                this.dataSourceContainer = AbstractDataSourceHandler.getActiveDataSourceContainer(event, false);
    public SQLNavigatorContext(DBSObject selectedObject) {
    public void setSelectedObject(DBSObject selectedObject) {




            if (this.executionContext != null) {
 * limitations under the License.
    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        this.executionContext = executionContext;
            } else {
        }
            this.executionContext = AbstractDataSourceHandler.getActiveExecutionContext(event, false);
            return dataSourceContainer;
 * DBeaver - Universal Database Manager

            (selectedObject instanceof DBPDataSourceContainer ?
    private boolean reuseExecutionContext = false;
    private SQLScriptContext scriptContext;
                (DBPDataSourceContainer) selectedObject :
            return executionContext;

        this.selectedObject = selectedObject;
        this.executionContext = executionContext;
        this.dataSourceContainer = null;

    public SQLNavigatorContext() {
            this.executionContext = null;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.ExecutionEvent;
        this.dataSourceContainer = dataSourceContainer;
import org.jkiss.code.Nullable;
        this.selectedObject = selectedObject;

        this.executionContext = null;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
    public RCPProject getProject() {
        }
    @Nullable
            return scriptContext.getExecutionContext().getDataSource().getContainer();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        return null;
    }
                selectedObject.getDataSource().getContainer());
        this.executionContext = null;
    }
 *
 * Unless required by applicable law or agreed to in writing, software
    @Override
            return scriptContext.getExecutionContext();
    }
    public DBSObject getSelectedObject() {

 */

    }
        this.scriptContext = scriptContext;
    }
                this.dataSourceContainer = executionContext.getDataSource().getContainer();
        this.dataSourceContainer = dataSourceContainer;
import org.jkiss.dbeaver.ui.editors.DatabaseEditorContext;
        } else if (scriptContext != null) {
        if (executionContext != null) {
        return selectedObject;
    public boolean isReuseExecutionContext() {
    public SQLScriptContext getScriptContext() {
        this.selectedObject = null;
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
        this.dataSourceContainer = executionContext == null ? null : executionContext.getDataSource().getContainer();
 * See the License for the specific language governing permissions and
