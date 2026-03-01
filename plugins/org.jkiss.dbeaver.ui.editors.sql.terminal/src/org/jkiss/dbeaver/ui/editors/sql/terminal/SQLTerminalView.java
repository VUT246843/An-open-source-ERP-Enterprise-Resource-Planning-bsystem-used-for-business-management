
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetModel;
import org.jkiss.dbeaver.ui.controls.resultset.plaintext.PlainTextFormatter;
import org.jkiss.utils.CommonUtils;
        super(site, tabsContainer, new MessageConsole("sql-data-log-output", DBeaverIcons.getImageDescriptor(UIIcon.SQL_CONSOLE)));
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    public SQLTerminalView(@NotNull IWorkbenchPartSite site, @NotNull CTabFolder tabsContainer, int styles) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.DBeaverIcons;
                formatter.printQueryName(grid, result.getStatement().getText());
        this.getOutputWriter().append("\n");
            }            
import org.jkiss.dbeaver.ui.UIIcon;
 * DBeaver - Universal Database Manager
        boolean hasUpdateCount = result.getExecuteResults().stream().anyMatch(r -> r.getUpdateCount() != null);
package org.jkiss.dbeaver.ui.editors.sql.terminal;
import org.jkiss.code.Nullable;
            formatter.printQueryName(grid, name);
                grid.append("\n");
            if (error != null) {
        }
 * Unless required by applicable law or agreed to in writing, software
 *

 * limitations under the License.
    public void printQueryData(@NotNull DBPPreferenceStore prefs, @NotNull ResultSetModel model, @Nullable String name) {
            }
            StringBuilder grid = new StringBuilder();
        this.getOutputWriter().append(grid.toString()).append("\n\n");
        this.getOutputWriter().flush();
            
 * you may not use this file except in compliance with the License.
 */
        if (prefs.getBoolean(SQLTerminalPreferencesConstants.SHOW_QUERY_TEXT)) {
        PlainTextFormatter formatter = new PlainTextFormatter(prefs);
            this.getOutputWriter().append(grid.toString());
        StringBuilder grid = new StringBuilder();
            PlainTextFormatter formatter = new PlainTextFormatter(prefs);
public class SQLTerminalView extends SQLEditorOutputConsoleViewer {
    }
            
                grid.append(updateCount).append(" row(s) modified.\n\n");
    public void printQueryResult(@NotNull DBPPreferenceStore prefs, @NotNull SQLQueryResult result) {

 * See the License for the specific language governing permissions and
/*
 *

            this.getOutputWriter().flush();
            if (hasUpdateCount) {
import org.jkiss.code.NotNull;
import org.eclipse.ui.console.MessageConsole;
        

import org.eclipse.ui.IWorkbenchPartSite;
import org.jkiss.dbeaver.model.sql.SQLQueryResult;
    }
            this.scrollToEnd();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.custom.CTabFolder;
        
import org.jkiss.dbeaver.utils.GeneralUtils;

}
        int totalRows = formatter.printGrid(grid, model);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            grid.append("\n");
    }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorOutputConsoleViewer;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (hasUpdateCount || error != null) {
            }
        }
            if (prefs.getBoolean(SQLTerminalPreferencesConstants.SHOW_QUERY_TEXT)) {
        Throwable error = result.getError();
                grid.append(GeneralUtils.getFirstMessage(error)).append("\n\n");
        this.scrollToEnd();
        this.getOutputWriter().append(String.valueOf(totalRows)).append(" row(s) fetched.\n\n");
 *
 * You may obtain a copy of the License at
                long updateCount = result.getExecuteResults().stream().mapToLong(r -> CommonUtils.notNull(r.getUpdateCount(), 0L)).sum();
