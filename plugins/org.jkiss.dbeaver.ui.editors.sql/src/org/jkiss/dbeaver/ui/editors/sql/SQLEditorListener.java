import org.jkiss.dbeaver.model.sql.SQLQueryResult;
    void onDataReceived(@NotNull DBPPreferenceStore contextPrefStore, @NotNull ResultSetModel resultSet, @Nullable String name);
 */
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");

 */
    void onDisconnect(DBPDataSourceContainer container);
 * distributed under the License is distributed on an "AS IS" BASIS,

    void onQueryResult(@NotNull DBPPreferenceStore contextPrefStore, @NotNull SQLQueryResult result);
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * @author Serge Rider
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener.PreferenceChangeEvent;
 * You may obtain a copy of the License at

 * limitations under the License.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.SQLQuery;
 *
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    void onConnect(DBPDataSourceContainer container);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.editors.sql;
/**
import org.jkiss.code.NotNull;
 *

 * SQLEditorListener
    void beforeQueryPlanExplain();
    void onQueryChange(SQLQuery oldQuery, SQLQuery newQuery);
public interface SQLEditorListener

    void beforeQueryExecute(boolean script, boolean newTabs);
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetModel;

    
}
    void afterQueryExecute(boolean script, boolean newTabs);
{
    void onDataSourceChanged(PreferenceChangeEvent event);
