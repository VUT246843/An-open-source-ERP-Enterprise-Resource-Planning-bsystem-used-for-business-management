        if (terminalViewEnabledPartProperty.setPropertyValue(editor, CommonUtils.toString(enabled))) {
        BUNDLE_NAME, TERMINAL_VIEW_ENABLED_PROPERTY
            SQLTerminalFeatures.SQL_TERMINAL_OPEN.use(Map.of("show", enabled));
                }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.editors.sql.addins.SQLEditorAddIn;
            wasEnabled, !wasEnabled
    }
     */
                Object item = e.getSource();
    }
                    }
    /**
        return viewContext;
     * Changes the state of SQL Terminal.
    @Nullable
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
    }
                    if (cTab.getData() instanceof SQLTerminalView) {
            public PrintWriter runWithResult() {
            SQLTerminalPreferencesConstants.SHOW_TERMINAL_VIEW_BY_DEFAULT,
 *
        boolean enabled = CommonUtils.toBoolean(info.value);
            tabItem.setToolTipText("");
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.editor.removeListener(editorListener);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public void onDataReceived(@NotNull DBPPreferenceStore contextPrefStore, @NotNull ResultSetModel resultSet, String name) {
import org.jkiss.utils.CommonUtils;
        );

            UIUtils.disposeControlOnItemDispose(tabItem);
            tabItem.setControl(view.getControl());
 *
package org.jkiss.dbeaver.ui.editors.sql.terminal;
    public boolean isTerminalViewEnabled() {
                obtainViewContext().view.printQueryResult(contextPrefStore, result);
            view = new SQLTerminalView(editor.getSite(), tabsContainer, SWT.NONE);
    public void cleanup(@NotNull SQLEditor editor) {

                }
public class SQLTerminalEditorAddIn implements SQLEditorAddIn {
                    return null;
    private TerminalViewContext viewContext;
                @Override
    private SQLEditor editor;
                if (item instanceof CTabItem) {
     * SQL Terminal state is stored in the editor properties in the runtime
import org.eclipse.swt.widgets.Widget;
            obtainViewContext();
            if (editor.hasMaximizedControl()) {

 * Unless required by applicable law or agreed to in writing, software
                        }

                public void close(CTabFolderEvent event) {
    }
            editor.getResultTabsContainer().setSelection(tabItem);
    }
 * See the License for the specific language governing permissions and
/*
    private void resetViewContext() {
    
 */
                obtainViewContext().view.printQueryData(contextPrefStore, resultSet, name);
    @Override
            }
            }
    
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorListener;
            tabItem.addDisposeListener(e -> {
    private static final QualifiedName FILE_TERMINAL_VIEW_ENABLED_PROP_NAME = new QualifiedName(
        
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * Checks whether the console view is enabled for the current editor.
            setConsoleViewEnabled(true);

        this.editor = editor;
    private void setConsoleViewEnabled(boolean enabled) {
    }
        public final CTabItem tabItem;
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            view.dispose();
            tabItem.dispose();
        public void onQueryResult(@NotNull DBPPreferenceStore contextPrefStore, @NotNull SQLQueryResult result) {
                            setConsoleViewEnabled(false);
    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Override
                    // Hide results
        }        
        return UIUtils.syncExec(new RunnableWithResult<>() {
        public final SQLTerminalView view;
     * The state is stored in the editor properties.
                if (editor.getActivePreferenceStore().getBoolean(SQLTerminalPreferencesConstants.SHOW_SERVER_OUTPUT) && isTerminalViewEnabled()) {
                    return obtainViewContext().view.getOutputWriter();
        if (info.isInitial) {
        
    private static final String BUNDLE_NAME = "org.jkiss.dbeaver.ui.editors.sql.terminal";
    
            tabItem.setText(SQLTerminalMessages.sql_terminal_item_text);
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetModel;
import org.jkiss.dbeaver.ui.editors.sql.terminal.internal.SQLTerminalMessages;
        
            tabItem = new CTabItem(tabsContainer, SWT.CLOSE);
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.ui.UIUtils;
                if (tabsContainer.getItemCount() == 0 && !editor.hasMaximizedControl()) {
        } else {

                        setConsoleViewEnabled(false);
            viewContext = new TerminalViewContext();
            setConsoleViewEnabled(false);
    );
            tabsContainer.addCTabFolder2Listener(new CTabFolder2Adapter() {
                }
            editor.setResultSetAutoFocusEnabled(!enabled);
import org.jkiss.dbeaver.ui.editors.EditorPartContextualProperty;
                    if (item instanceof CTabItem) {
import org.eclipse.core.runtime.QualifiedName;

        this.viewContext = null;
 *
        this.editor.addListener(editorListener);
        public TerminalViewContext() {
    }
     */
            CTabFolder tabsContainer = editor.getResultTabsContainer();
    
    @Override
                resetViewContext();
            tabItem.setImage(DBeaverIcons.getImage(UIIcon.SQL_CONSOLE));
            });
        TERMINAL_VIEW_ENABLED_PROPERTY, FILE_TERMINAL_VIEW_ENABLED_PROP_NAME, 
    public PrintWriter getServerOutputConsumer() {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        viewContext = null;
                } else {
        } 
    

        }

    public void init(@NotNull SQLEditor editor) {
            if (isTerminalViewEnabled() && CommonUtils.isNotEmpty(name)) {
import org.eclipse.swt.custom.CTabFolder2Adapter;

        public void dispose() {
            editor.setResultSetAutoFocusEnabled(!enabled);
            tabItem.setData(view);
}
                        if (cTab.getData() instanceof SQLTerminalView) {
    };
    public void toggleTerminalView() {
    private final SQLEditorListener editorListener = new SQLEditorListenerDefault() {
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorListenerDefault;
import org.jkiss.dbeaver.Log;
        PartCustomPropertyValueInfo info = terminalViewEnabledPartProperty.getPropertyValue(editor);
        }
        return enabled;
        if (wasEnabled) {
    private class TerminalViewContext {
                    editor.toggleResultPanel(false, true);
        if (viewContext == null && isTerminalViewEnabled()) {
    private static final EditorPartContextualProperty terminalViewEnabledPartProperty = EditorPartContextualProperty.setup(
        }
import org.eclipse.swt.custom.CTabItem;
    private static final String TERMINAL_VIEW_ENABLED_PROPERTY = "org.jkiss.dbeaver.ui.editors.sql.show.consoleView.isEnabled";
    private static final Log log = Log.getLog(SQLTerminalViewSwitchHandler.class);
import org.jkiss.dbeaver.model.sql.SQLQueryResult;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
import org.eclipse.swt.custom.CTabFolder;
        SQLTerminalPreferencesConstants.SHOW_TERMINAL_VIEW_BY_DEFAULT, CommonUtils.toString(false));
 * limitations under the License.
            });
    
import java.io.PrintWriter;
        });
    
                }
import org.eclipse.swt.custom.CTabFolderEvent;
                        CTabItem cTab = (CTabItem) item;
                editor.toggleResultPanel(true, false);
            if (isTerminalViewEnabled()) {
            }
import java.util.Map;
        boolean wasEnabled = isTerminalViewEnabled();
 * you may not use this file except in compliance with the License.
            if (viewContext != null) {
                    }
import org.jkiss.dbeaver.ui.editors.EditorPartContextualProperty.PartCustomPropertyValueInfo;
        }
        }
        }
        @Override
                    Widget item = event.item;
import org.jkiss.dbeaver.model.runtime.RunnableWithResult;
        
        editor.getActivePreferenceStore().firePropertyChangeEvent(
     * and saved in the script file to keep the state between launches.

                    CTabItem cTab = (CTabItem) item;
 * DBeaver - Universal Database Manager
            }
                viewContext.dispose();

        @Override
    private TerminalViewContext obtainViewContext() {
