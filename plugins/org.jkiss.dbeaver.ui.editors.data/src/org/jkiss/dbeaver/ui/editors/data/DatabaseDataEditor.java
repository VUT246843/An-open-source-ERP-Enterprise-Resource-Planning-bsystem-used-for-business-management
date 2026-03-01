import org.jkiss.dbeaver.model.data.DBDDataFilter;
        ResultSetViewer viewer = getResultSetController();
        if (dataSource != null) {
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.TRANSACTIONS_SMART_COMMIT);
    @Override
    }
import org.jkiss.dbeaver.ui.ISmartTransactionManager;
import org.jkiss.utils.CommonUtils;
    protected boolean isSuspendDataQuery() {
            }
{

import org.jkiss.code.Nullable;
}
            DBPPreferenceStore preferenceStore = container.getPreferenceStore();
        return (DBDDataFilter) getEditorInput().getAttribute(ATTR_DATA_FILTER);
        if (dataSource == null) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            // First check data source settings
        }
        if (viewer != null) {
 * DatabaseDataEditor
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        return getDatabaseObject() != null && getDatabaseObject().isPersisted();
    protected String getDataQueryMessage() {

    @Override
        return CommonUtils.toBoolean(getEditorInput().getAttribute(ATTR_SUSPEND_QUERY));
    @Override
    public boolean isReadyToRun() {
import java.io.IOException;
    @Override
import org.jkiss.dbeaver.model.DBPDataSource;
        return "Query data from '" + getEditorInput().getDatabaseObject().getName() + "'...";
 */
import org.jkiss.code.NotNull;
    public boolean isSmartAutoCommit() {
package org.jkiss.dbeaver.ui.editors.data;
    public DBSDataContainer getDataContainer()
    }
 *
        }
import org.jkiss.dbeaver.ModelPreferences;

    @Override
public class DatabaseDataEditor extends AbstractDataEditor<DBSDataContainer> implements ISmartTransactionManager, IRevertableEditor
        }
    }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;

                return preferenceStore.getBoolean(ModelPreferences.TRANSACTIONS_SMART_COMMIT);
 * DBeaver - Universal Database Manager
            if (preferenceStore.contains(ModelPreferences.TRANSACTIONS_SMART_COMMIT)) {
        }



 * you may not use this file except in compliance with the License.
            DBPDataSourceContainer container = dataSource.getContainer();
                return container.getConnectionConfiguration().getConnectionType().isSmartCommit();
    private DBPPreferenceStore getActivePreferenceStore() {
        return (DBSDataContainer)getEditorInput().getDatabaseObject();
        DBPDataSource dataSource = getDatabaseObject().getDataSource();
    @Override
    }
        try {

        } catch (IOException e) {
            viewer.rejectChanges();
    public void setSmartAutoCommit(boolean smartAutoCommit) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Nullable
    protected DBDDataFilter getEditorDataFilter() {
        return dataSource.getContainer().getPreferenceStore();
    @Override


            getActivePreferenceStore().save();
            } else {
    public static final String ATTR_DATA_FILTER = "dataFilter";
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        getActivePreferenceStore().setValue(ModelPreferences.TRANSACTIONS_SMART_COMMIT, smartAutoCommit);
/**
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 */
 * You may obtain a copy of the License at
    public static final String ATTR_SUSPEND_QUERY = "suspendQuery";
            return DBWorkbench.getPlatform().getPreferenceStore();
 *
 *
/*
    {
    @NotNull
    public void doRevertToSaved() {
            DBWorkbench.getPlatformUI().showError("Smart commit", "Error saving smart auto-commit option", e);


 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.IRevertableEditor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.

        DBPDataSource dataSource = getDatabaseObject().getDataSource();
    }
    }
    }
