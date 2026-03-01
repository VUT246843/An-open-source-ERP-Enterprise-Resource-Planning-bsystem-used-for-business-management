        return dialog.open();
    }
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
        if (executionContext == null || SQLEditorUtils.isOpenSeparateConnection(dataSourceContainer)) {
            context,
import org.eclipse.swt.widgets.Composite;

            .setPrimaryImage(isWarning ? DBIcon.STATUS_WARNING : DBIcon.STATUS_QUESTION)
import org.eclipse.jface.text.IDocument;

        }
                    ((SQLEditorBase) editor).reloadSyntaxRules();
            .setReplies(Reply.YES, Reply.NO)
                } else {
        DBPDataSourceContainer container = contextProvider.getExecutionContext().getDataSource().getContainer();
        try {
        TextViewer textViewer = editor.getTextViewer();
import java.util.Map;
            navigatorContext = new SQLNavigatorContext(dataSourceContainer);
import java.util.LinkedHashMap;

        GenerateSQLParametrizedDialog dialog = new GenerateSQLParametrizedDialog(
                ));
            title,
            public boolean isFoldingEnabled() {
            default:
import org.eclipse.ui.PartInitException;
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
 */
                        false,
                    null
            image,
        return SQLEditorHandlerOpenEditor.openSQLConsole(
            SQLEditorHandlerOpenEditor.openNewEditor(new SQLNavigatorContext(forObject), null);
 *     http://www.apache.org/licenses/LICENSE-2.0
/*

        Composite editorPH = (Composite)parent;
import org.jkiss.dbeaver.ui.editors.sql.dialogs.GenerateSQLParametrizedDialog;

            name,
                return false;
                if (((SQLEditorBase) editor).getEditorInput() instanceof StringEditorInput && document != null) {

 * See the License for the specific language governing permissions and
        ViewSQLDialog dialog = new ViewSQLDialog(
                return true;
            @Override
import org.jkiss.dbeaver.model.DBIcon;
                Button showQueryButton = UIUtils.createPushButton(
                        queryText,
            navigatorContext.setSelectedObject(selectedObject);
        dialog.setReadOnly(false);
                return false;
            return false;

                getAction(ITextEditorActionConstants.CONTEXT_PREFERENCES).setEnabled(false);
        }
        if (panelObject instanceof TextViewer) {
                }
    @Override
                super.createPartControl(parent);
import org.jkiss.dbeaver.model.struct.DBSObject;
        textViewer.setData("editor", editor);
                    UIMessages.dialog_confirm_action_show_query,
import org.jkiss.utils.CommonUtils;
            @Nullable
        } catch (PartInitException e) {
            @Override
        };
                    if (prop.getDataType() == Boolean.class) {
            }

    public Object openNewScript(DBSObject forObject) {
            Object editor = ((TextViewer) panelObject).getData("editor");
        ViewSQLDialog dialog = new ViewSQLDialog(
                null);
                        contextProvider.getExecutionContext(),
            .showMessageBox()
                return contextProvider.getExecutionContext();
import org.jkiss.dbeaver.model.runtime.DBRCreator;
                IDocument document = ((SQLEditorBase) editor).getDocument();
    }

        }
            return true;

 * limitations under the License.
        try {
            SQLEditorHandlerOpenEditor.openRecentScript(
    @Override
        UIUtils.syncExec(() -> reply[0] = MessageBoxBuilder.builder(UIUtils.getActiveWorkbenchShell())
    @Override
import org.eclipse.swt.layout.GridLayout;
                        null,
            navigatorContext,
            }
        }
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
            .setDefaultReply(Reply.NO)
        if (selectedObject != null) {
import org.jkiss.dbeaver.DBException;
    @Override
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
            title,
                    buttonBar,
            return true;
            title,
            UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart().getSite(),
                new SQLNavigatorContext(forObject),
    }
            .setMessage(message)

            if (editor instanceof SQLEditorBase) {

            DBWorkbench.getPlatformUI().showError("Open new SQL editor", "Can't open new SQL editor", e);
    public Object openRecentScript(DBSObject forObject) {
            }
    public String openSQLEditor(@Nullable DBPContextProvider contextProvider, String title, @Nullable DBPImage image, String text) {
        editorPH.addDisposeListener(e -> editor.dispose());
        } catch (CoreException e) {
    public int openGeneratedScriptViewer(
        };
import org.jkiss.dbeaver.utils.GeneralUtils;

        return dialog.open();

            public void createPartControl(Composite parent) {
import org.jkiss.dbeaver.ui.editors.SubEditorSite;
            case ALWAYS:
        dialog.setShowSaveButton(showSaveButton);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                showQueryButton.addSelectionListener(SelectionListener.widgetSelectedAdapter(e ->
import org.jkiss.dbeaver.ui.dialogs.MessageBoxBuilder;
            }
        );
    private static final Log log = Log.getLog(UIServiceSQLImpl.class);
import org.jkiss.dbeaver.ui.dialogs.Reply;
        } catch (CoreException e) {
            @Override
        {
                buttonBar.setLayout(new GridLayout(3, false));
        if (panelObject instanceof TextViewer) {
        @NotNull String queryText,
    public boolean useIsolatedConnections(DBPContextProvider contextProvider) {
    ) {
        );
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");
            text
 *
    }
        boolean isWarning
    {
    }
    public void setSQLPanelText(Object panelObject, String sqlText) {
            text
                return new String[] { scriptGenerator.createObject(params) };
        SeparateConnectionBehavior behavior = SeparateConnectionBehavior.parse(
    @Override

            .setCustomButton(buttonBar -> {
                    ((SQLEditorBase) editor).setInput(
            editor.init(new SubEditorSite(partSite), new StringEditorInput(panelName, sqlText, true, GeneralUtils.getDefaultFileEncoding()));
        return null;
    }
            image,
        @NotNull String title,
        editor.reloadSyntaxRules();
        switch (behavior) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getSQLPanelText(Object panelObject) {
        TextEditorUtils.enableHostEditorKeyBindingsSupport(partSite, textViewer.getTextWidget());
        SQLNavigatorContext navigatorContext;
                        false
            }
        final SQLEditorBase editor = new SQLEditorBase() {
                        new StringEditorInput("SQL", sqlText, true, GeneralUtils.getDefaultFileEncoding()));
        }
        }
    }
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.widgets.Button;
            case NEVER:

                return ((SQLEditorBase) editor).getDocument().get();
            @Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.DBPContextProvider;
import org.jkiss.dbeaver.model.DBPImage;
            UIUtils.getActiveWorkbenchWindow(),
                }

            () -> context,
            container.getPreferenceStore().getString(SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION)
        return textViewer;
                return !container.isForceUseSingleConnection() && !container.getDriver().isEmbedded();
import org.jkiss.dbeaver.runtime.DBWorkbench;
}
/**
import org.eclipse.jface.dialogs.IDialogConstants;
        @Nullable DBPImage image,
                super.createControls(parent);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                    document.set(sqlText);

 * you may not use this file except in compliance with the License.
                    openSQLViewer(
        return null;
 * Unless required by applicable law or agreed to in writing, software
                        UIUtils.createCheckbox(parent, prop.getDisplayName(), CommonUtils.notEmpty(prop.getDescription()), false, 1);
package org.jkiss.dbeaver.ui.editors.sql;
        boolean showSaveButton)
 *
    @Override
                        UIMessages.dialog_confirm_action_query,
            title,
 * SQLEditorControl
 * distributed under the License is distributed on an "AS IS" BASIS,
                    )
    }
                UIUtils.getActiveWorkbenchWindow(),
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenEditor;
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
            .setTitle(title)
        }
        editor.createPartControl(editorPH);
import org.jkiss.dbeaver.ui.internal.UIMessages;

            case DEFAULT:
        );
            UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart().getSite(),
            return dialog.getText();
            }
    public int openSQLViewer(DBCExecutionContext context, String title, DBPImage image, String text, boolean showSaveButton, boolean showOpenEditorButton) {
                for (DBPPropertyDescriptor prop : properties) {
        if (dialog.open() == IDialogConstants.OK_ID) {
import org.jkiss.dbeaver.Log;
import org.eclipse.core.runtime.CoreException;
        final Reply[] reply = {null};
        @NotNull DBRCreator<String, Map<String, Object>> scriptGenerator,
        );
        );
            protected void createControls(Composite parent) {
import org.eclipse.swt.events.SelectionListener;
        return 0;
/*
            DBWorkbench.getPlatformUI().showError("Open SQL editor", "Can't open SQL editor", e);
import org.jkiss.code.NotNull;
            image,
        return reply[0] == Reply.YES;
            navigatorContext = new SQLNavigatorContext(executionContext);
        } else {
        dialog.setShowOpenEditorButton(showOpenEditorButton);
            protected String[] generateSQLScript() {
            UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart().getSite(),
            if (editor instanceof SQLEditorBase) {
            @Override
    }
            public DBCExecutionContext getExecutionContext() {
*/
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
        }
 */

            contextProvider,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            })
            }
                Map<String, Object> params = new LinkedHashMap<>();
            text
                    }
            Object editor = ((TextViewer) panelObject).getData("editor");
        @NotNull DBPContextProvider contextProvider,
    }
        String title,
    public boolean confirmQueryExecution(
    @Override
            context,
    @Override
 *
        @Nullable DBCExecutionContext context,
import org.jkiss.code.Nullable;
public class UIServiceSQLImpl implements UIServiceSQL {
    @Override
            return false;
        dialog.setShowSaveButton(showSaveButton);
        @NotNull DBPPropertyDescriptor[] properties,
    }

        editor.setHasVerticalRuler(showVerticalBar);
            throw new DBException("Error initializing SQL panel", e);
import org.jkiss.dbeaver.ui.editors.sql.dialogs.ViewSQLDialog;
            sqlText);
    @Override
    public Object openSQLConsole(@NotNull DBPDataSourceContainer dataSourceContainer, DBCExecutionContext executionContext, DBSObject selectedObject, String name, String sqlText) {
import org.eclipse.ui.IWorkbenchPartSite;
        ViewSQLDialog dialog = new ViewSQLDialog(
            image)
    @Override

        }
        IWorkbenchPartSite partSite = (IWorkbenchPartSite) site;
                );

        try {
            UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart().getSite(),
        @NotNull String message,
    public Object createSQLPanel(Object site, Object parent, DBPContextProvider contextProvider, String panelName, boolean showVerticalBar, String sqlText) throws DBException {
