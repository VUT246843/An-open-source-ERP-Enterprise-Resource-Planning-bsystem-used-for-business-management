
 * You may obtain a copy of the License at

    }
{

/**
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

import org.jkiss.dbeaver.model.sql.SQLQueryResult;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void onDisconnect(DBPDataSourceContainer container) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
import org.jkiss.dbeaver.model.sql.SQLQuery;
import org.jkiss.code.Nullable;
    public void beforeQueryPlanExplain() {

    @Override
 * SQLEditorListenerDefault
 *
    @Override
    @Override
    @Override
 * limitations under the License.
    }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetModel;

    @Override
package org.jkiss.dbeaver.ui.editors.sql;
 *

    @Override
    public void onDataReceived(@NotNull DBPPreferenceStore contextPrefStore, @NotNull ResultSetModel resultSet, @Nullable String name) {
 * See the License for the specific language governing permissions and
    }

    
public class SQLEditorListenerDefault implements SQLEditorListener
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener.PreferenceChangeEvent;



    public void onQueryChange(SQLQuery oldQuery, SQLQuery newQuery) {
import org.jkiss.code.NotNull;

 * distributed under the License is distributed on an "AS IS" BASIS,
    public void onDataSourceChanged(PreferenceChangeEvent event) {
    @Override

    }
    }
}
    public void onQueryResult(@NotNull DBPPreferenceStore contextPrefStore, @NotNull SQLQueryResult result) {
    public void onConnect(DBPDataSourceContainer container) {
 *
 * you may not use this file except in compliance with the License.
/*
    public void afterQueryExecute(boolean script, boolean newTabs) {


        
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void beforeQueryExecute(boolean script, boolean newTabs) {

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 */
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
 */
    @Override
