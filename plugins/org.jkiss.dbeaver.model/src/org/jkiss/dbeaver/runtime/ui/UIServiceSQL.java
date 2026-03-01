 *     http://www.apache.org/licenses/LICENSE-2.0
    void setSQLPanelText(Object panelObject, String sqlText);

    int openGeneratedScriptViewer(
        boolean showOpenEditorButton);
        @Nullable DBPContextProvider contextProvider,
        @NotNull String message,
public interface UIServiceSQL {
    /**
    Object openNewScript(DBSObject forObject);

        @NotNull DBRCreator<String, Map<String, Object>> scriptGenerator,
        @NotNull String title,
 *
 *
    String getSQLPanelText(Object panelObject);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.DBRCreator;
/*
     * @param showSaveButton shows Save button
    String openSQLEditor(
    Object openSQLConsole(
    int openSQLViewer(
        @Nullable DBPImage image,
     *
 */

import org.jkiss.dbeaver.model.struct.DBSObject;
/**
        @NotNull DBPDataSourceContainer dataSourceContainer,

     */
        DBSObject selectedObject,
        String sqlText);
     * @param site IWorkbenchPArtSite
import org.jkiss.dbeaver.model.DBPImage;
    boolean confirmQueryExecution(
        boolean isWarning
        @Nullable DBCExecutionContext executionContext,
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        String name,

import java.util.Map;
        @Nullable DBCExecutionContext context,
 * you may not use this file except in compliance with the License.
        String text);

        boolean showSaveButton,
import org.jkiss.code.Nullable;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    Object createSQLPanel(Object site, Object parentControl, DBPContextProvider contextProvider, String panelName, boolean showVerticalBar, String sqlText)
     */
     * Shows SQL preview dialog
    Object openRecentScript(DBSObject forObject);
    );
    boolean useIsolatedConnections(DBPContextProvider contextProvider);
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

        @NotNull DBPPropertyDescriptor[] properties,
        @Nullable DBPImage image,
package org.jkiss.dbeaver.runtime.ui;
     * @param showVerticalBar
     * @return TextViewer
import org.jkiss.dbeaver.DBException;
     * @return IEditorPart
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
        String title,
        @NotNull String queryText,

 * SQL Service
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
        boolean showSaveButton);
 * limitations under the License.
     * @return IDialogConstants.*_ID
     */
 * DBeaver - Universal Database Manager
        String title,
import org.jkiss.code.NotNull;
        @NotNull DBPContextProvider contextProvider,
        @Nullable DBPImage image,

import org.jkiss.dbeaver.model.DBPContextProvider;
        throws DBException;
        String text,
     * @param showOpenEditorButton shows Open in editor button
     * @param parentControl   Composite
     *

        @Nullable DBCExecutionContext context,
}

 *
        String title,

