
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        viewer.resetNewOutput();
        filterToolbar.getControl().getParent().layout(true, true);
        final DBCServerOutputReader reader = DBUtils.getAdapter(DBCServerOutputReader.class, dataSource);
                severities.add(severity);
                if (!(reader instanceof DBCServerOutputReaderExt readerExt)) {
}
    private final ToolBarManager filterToolbar;
    private void filterOutput() {
        final DBPDataSource dataSource = executionContext != null ? executionContext.getDataSource() : null;
 * Copyright (C) 2010-2024 DBeaver Corp and others

            final DBCOutputSeverity[] supportedSeverities = readerExt.getSupportedSeverities(executionContext);
        private final DBCOutputSeverity severity;
            }
                    manager.add(new ToggleSeverityAction(severity));
 * distributed under the License is distributed on an "AS IS" BASIS,
            return;
            public void clearOutput() {
                continue;
import org.jkiss.dbeaver.model.exec.output.DBCOutputSeverity;
        if (this.executionContext != executionContext) {
        viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
        public void run() {
    }
/**
import org.eclipse.swt.SWT;
            writer.println(message);
import org.jkiss.dbeaver.model.exec.output.DBCServerOutputReader;
        public boolean isChecked() {
                }
    public void setExecutionContext(@Nullable DBCExecutionContext executionContext) {
 * You may obtain a copy of the License at


    }
 *
import org.eclipse.jface.layout.GridLayoutFactory;
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        public OutputRecord(@Nullable DBCOutputSeverity severity, @NotNull String line) {
import org.jkiss.code.Nullable;
        final Composite filterComposite = UIUtils.createPlaceholder(this, 2);
 * limitations under the License.

    }
        viewer.getOutputWriter().flush();
    }
            filterMenu.setRemoveAllWhenShown(true);
    private DBCExecutionContext executionContext;
            filterOutput();
import org.eclipse.swt.widgets.Text;

        if (message == null) {
    }
package org.jkiss.dbeaver.ui.editors.sql;

                continue;
        filterText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));


import org.jkiss.code.NotNull;
    private final Set<DBCOutputSeverity> severities = new HashSet<>();

 * SQL editor output viewer
import java.util.*;

    }

 *
    private final Deque<OutputRecord> records = new ArrayDeque<>(INITIAL_OUTPUT_RECORD_CAPACITY);

    public void resetNewOutput() {

        }
    @Override

import org.jkiss.dbeaver.model.DBUtils;
        @Override
        }
    private final Text filterText;



        };
    }
import org.jkiss.dbeaver.ui.MenuCreator;
        filterText.setMessage(SQLEditorMessages.sql_editor_panel_output_filter_message);


        super(parent, style);
import org.eclipse.swt.widgets.Composite;
    public SQLEditorOutputConsoleViewer getViewer() {
        filterComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            }
        writer.flush();
        filterText = new Text(filterComposite, SWT.SINGLE | SWT.SEARCH | SWT.ICON_CANCEL);

    }
    private class ToggleSeverityAction extends Action {
            }

    private static final int INITIAL_OUTPUT_RECORD_CAPACITY = 1000;
import org.jkiss.dbeaver.model.DBPDataSource;
 * See the License for the specific language governing permissions and
            setMenuCreator(new MenuCreator(control -> filterMenu));
                }
        private final DBCOutputSeverity severity;
    public void flush() {
                severities.remove(severity);
        return viewer;

            severities.addAll(List.of(supportedSeverities));
import java.io.PrintWriter;
        @Override
                    return;


import org.jkiss.dbeaver.ui.UIUtils;
            this.line = line;
import org.jkiss.dbeaver.model.exec.output.DBCServerOutputReaderExt;
        }

        filterText.addModifyListener(e -> filterOutput());
            this.executionContext = executionContext;
            }
        } else {
        filterToolbar.add(new ConfigureSeverityAction());
    private static class OutputRecord {
        updateControls();
 * DBeaver - Universal Database Manager
            UIUtils.setControlVisible(filterToolbar.getControl(), supportedSeverities.length > 0);
    }
import org.eclipse.jface.action.Action;
                writer.print("[" + severity.getName() + "] ");
            if (severity != null && severity.isForced()) {
/*
            filterMenu.addMenuListener(manager -> {
public class SQLEditorOutputViewer extends Composite implements DBCOutputWriter {
        }
        final String filter = filterText.getText().trim();

            if (!filter.isEmpty() && !record.line.contains(filter)) {
    }
        }

        records.offer(new OutputRecord(severity, message));
            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.FILTER));

    }
        }
                records.clear();
            if (record.severity != null && !record.severity.isForced() && !severities.contains(record.severity)) {
        setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).create());
        viewer.getConsole().clearConsole();
            setToolTipText(SQLEditorMessages.sql_editor_panel_output_filter_hint);

            final MenuManager filterMenu = new MenuManager();
            super(severity.getName(), AS_CHECK_BOX);

                super.clearOutput();
        viewer.refreshStyles();
    @Override
        }

        if (reader instanceof DBCServerOutputReaderExt readerExt) {
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
        public ConfigureSeverityAction() {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        viewer.clearOutput();

 */
import org.eclipse.jface.action.MenuManager;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override
    public void refreshStyles() {
 * Unless required by applicable law or agreed to in writing, software
        filterToolbar = new ToolBarManager();
 *     http://www.apache.org/licenses/LICENSE-2.0


            this.severity = severity;
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
    public SQLEditorOutputViewer(@NotNull IWorkbenchPartSite site, @NotNull Composite parent, int style) {
        setLayoutData(new GridData(GridData.FILL_BOTH));
 *
    private class ConfigureSeverityAction extends Action {
        TextEditorUtils.enableHostEditorKeyBindingsSupport(site, filterText);
            this.severity = severity;
        final PrintWriter writer = viewer.getOutputWriter();
            updateControls();
                final DBCServerOutputReader reader = DBUtils.getAdapter(DBCServerOutputReader.class, executionContext.getDataSource());
    }
            }
import org.jkiss.dbeaver.ui.DBeaverIcons;


            return severities.contains(severity);
            writer.println(record.line);

        public ToggleSeverityAction(@NotNull DBCOutputSeverity severity) {
        }
        clearOutput();

import org.eclipse.ui.IWorkbenchPartSite;
        }
        for (OutputRecord record : records) {
            UIUtils.setControlVisible(filterToolbar.getControl(), false);


        return viewer.isHasNewOutput();
            super(null, AS_DROP_DOWN_MENU);
        filterToolbar.createControl(filterComposite);
 * you may not use this file except in compliance with the License.
        viewer = new SQLEditorOutputConsoleViewer(site, this, SWT.NONE) {
    @NotNull
import org.eclipse.jface.action.ToolBarManager;
        if (severity == null || severity.isForced() || severities.contains(severity)) {
        severities.clear();
            });
    private final SQLEditorOutputConsoleViewer viewer;
    private void updateControls() {
            } else {
            if (severities.contains(severity)) {
    }
import org.jkiss.dbeaver.ui.UIIcon;
    public boolean isHasNewOutput() {
        }
    public void println(@Nullable DBCOutputSeverity severity, @Nullable String message) {
            PrintWriter writer = viewer.getOutputWriter();

import org.eclipse.swt.layout.GridData;
    public void clearOutput() {
        private final String line;
                for (DBCOutputSeverity severity : readerExt.getSupportedSeverities(executionContext)) {
    }
