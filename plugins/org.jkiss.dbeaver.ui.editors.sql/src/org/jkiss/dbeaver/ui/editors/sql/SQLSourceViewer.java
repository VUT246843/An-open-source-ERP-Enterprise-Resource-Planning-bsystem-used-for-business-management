        if (showFullDDL == null) {
import org.jkiss.dbeaver.DBException;
        IEditorInput editorInput = getEditorInput();
                    }, true));
                        public void run() {
            DBPScriptObjectExt2 sourceObject = (DBPScriptObjectExt2) genObject;
            T sourceObject = getSourceObject();
            }
                            }
    protected Boolean getShowColumnComments() {
            SQLEditorHandlerOpenEditor.openSQLConsole(
    protected boolean getShowPermissions() {
                for (String name : attributeNames) {
    protected Boolean showFullDDL;
                            showPartitionsDDL = isChecked();

        return showPermissions;
            showFullDDL = getPreferenceStore().getBoolean(DBPScriptObject.OPTION_INCLUDE_NESTED_OBJECTS);
        T genObject = getSourceObject();
import org.jkiss.dbeaver.ui.UIIcon;
                            {
        }
            }
                options.put(DBPScriptObject.OPTION_INCLUDE_COMMENTS, getShowColumnComments());
import org.eclipse.jface.action.Action;
            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_INCLUDE_PARTITIONS)) {
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
                toolBarManager.add(ActionUtils.makeActionContribution(
                        {
            IDocument document = getDocument();
            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_DDL_SKIP_FOREIGN_KEYS) &&
        } else {
    }
import java.util.Map;
                                refreshPart(SQLSourceViewer.this, true);
package org.jkiss.dbeaver.ui.editors.sql;
import org.eclipse.jface.viewers.ISelection;
                            @Override
            ISelection selection = getSelectionProvider().getSelection();
            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_DDL_SKIP_FOREIGN_KEYS) &&
                        new Action(SQLEditorMessages.source_viewer_show_comments_text, Action.AS_CHECK_BOX) {
            return sql.toString().trim();
                                showPermissions = isChecked();
        @Override


            if (!attributeNames.isEmpty()) {
                                refreshPart(SQLSourceViewer.this, true);
            }
 */
import java.util.List;
 * Unless required by applicable law or agreed to in writing, software
/*
                        new Action(SQLEditorMessages.source_viewer_show_ddl_text, Action.AS_CHECK_BOX) {
                    Object attribute = ((IDatabaseEditorInput)editorInput).getAttribute(name);
            );
        if (sourceObject != null && !sourceObject.isPersisted() && this.isReadOnly()) {
                            }
    private final IAction OPEN_CONSOLE_ACTION = new Action(SQLEditorMessages.source_viewer_open_in_sql_console, DBeaverIcons.getImageDescriptor(UIIcon.SQL_CONSOLE)) {
                            separateFKStmts = isChecked();
        super.contributeEditorCommands(toolBarManager);
            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_INCLUDE_NESTED_OBJECTS)) {

 * DBeaver - Universal Database Manager
                        }
        if (editorInput instanceof IDatabaseEditorInput) {
    protected void contributeEditorCommands(IContributionManager toolBarManager) {
    {

                options.put(DBPScriptObject.OPTION_INCLUDE_NESTED_OBJECTS, getShowFullDDL());
                        }
            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_INCLUDE_PERMISSIONS)) {
 * you may not use this file except in compliance with the License.
                        @Override
        return showColumnComments;
 * Licensed under the Apache License, Version 2.0 (the "License");
                                setToolTipText(SQLEditorMessages.source_viewer_show_permissions_tip);

}
    @Override

                return;
    @Override


                options.put(DBPScriptObject.OPTION_INCLUDE_PARTITIONS, getShowPartitionsDDL());
                toolBarManager.add(ActionUtils.makeActionContribution(
                            }
import org.eclipse.jface.action.IAction;
/**
                                setChecked(getShowFullDDL());
                            setChecked(getSeparateFKStmts());
        if (showPartitionsDDL == null) {
                        new Action(SQLEditorMessages.source_viewer_show_permissions_text, Action.AS_CHECK_BOX) {
    }
            showColumnComments = getPreferenceStore().getBoolean(DBPScriptObject.OPTION_INCLUDE_COMMENTS);
                        }, true));
import org.jkiss.dbeaver.model.struct.DBStructUtils;
                            @Override
        return showPartitionsDDL;
                    new Action(SQLEditorMessages.source_viewer_separate_fk_text, Action.AS_CHECK_BOX) {
                new SQLNavigatorContext(dataSource),
                            setToolTipText(SQLEditorMessages.source_viewer_separate_fk_tip);
            return null;
import org.jkiss.dbeaver.model.*;
                            setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TREE_PARTITION));

                            setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TREE_FOREIGN_KEY));
            DBPScriptObjectExt2 sourceObject = (DBPScriptObjectExt2) genObject;
                                setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TYPE_TEXT));
                                setChecked(getShowColumnComments());
 * limitations under the License.
    protected boolean isReadOnly()
                consoleName,
                            refreshPart(SQLSourceViewer.this, true);
    }
            showPermissions = getPreferenceStore().getBoolean(DBPScriptObject.OPTION_INCLUDE_PERMISSIONS);
                sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_DDL_ONLY_FOREIGN_KEYS)) {
                            {
            String consoleName = getSourceViewerType();
                            setChecked(getShowPartitionsDDL());
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
    protected String getSourceViewerType() {
                }
import org.jkiss.dbeaver.ui.ActionUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                            getPreferenceStore().setValue(DBPScriptObject.OPTION_DDL_SEPARATE_FOREIGN_KEYS_STATEMENTS, separateFKStmts);
        }
                consoleName += " of <" + DBUtils.getObjectFullName(sourceObject, DBPEvaluationContext.UI) + ">";
        if (showPermissions == null) {

 * See the License for the specific language governing permissions and
import org.eclipse.jface.text.TextSelection;
            if (document == null) {
            }
                            }
                toolBarManager.add(ActionUtils.makeActionContribution(
        if (genObject instanceof DBPScriptObjectExt2) {
                                setToolTipText(SQLEditorMessages.source_viewer_show_ddl_tip);
 * Display Source text (Read Only)
import org.jkiss.dbeaver.model.struct.DBSEntity;
            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_INCLUDE_NESTED_OBJECTS)) {
            DBStructUtils.generateTableListDDL(monitor, sql, List.of((DBSEntity)sourceObject), getSourceOptions(), false);
                        }
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
            }
                if (((TextSelection) selection).getLength() > 0) {
                    options.put(name, attribute);
            }
        public void run() 
        }
            }
            StringBuilder sql = new StringBuilder(100);
import org.eclipse.ui.IEditorInput;
    }
                        }
        return separateFKStmts;
                            {
        toolBarManager.add(new Separator());
                            public void run() {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenEditor;
    }
import org.eclipse.jface.action.Separator;
    }

            if (sourceObject != null) {
                                setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TREE_TABLE_EXTERNAL));
    protected boolean getSeparateFKStmts() {
    }
    private Boolean showPartitionsDDL;
                                setChecked(getShowPermissions());
        return showFullDDL;
        return true;

                            public void run() {

        if (separateFKStmts == null) {
        Map<String, Object> options = new HashMap<>();
        }
                sqlText
    }
        {
                        public void run() {

    @Override
            }
    }

            showPartitionsDDL = getPreferenceStore().getBoolean(DBPScriptObject.OPTION_INCLUDE_PARTITIONS);
    };
        if (sourceObject == null) {
        }
    }

        return options;
                                setToolTipText(SQLEditorMessages.source_viewer_show_comments_tip);
                options.put(DBPScriptObject.OPTION_DDL_SEPARATE_FOREIGN_KEYS_STATEMENTS, getSeparateFKStmts());
    protected Boolean separateFKStmts;
        }
            }
            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_INCLUDE_COMMENTS)) {
                                refreshPart(SQLSourceViewer.this, true);
    public void activatePart() {
            if (selection instanceof TextSelection) {
    protected void setSourceText(DBRProgressMonitor monitor, String sourceText)
import org.jkiss.dbeaver.ui.UIUtils;
                        }, true));
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected Boolean getShowFullDDL() {
                        @Override

        toolBarManager.add(OPEN_CONSOLE_ACTION);
    @Override
                            setToolTipText(SQLEditorMessages.source_viewer_show_partitions_ddl_tip);
                            public void run() {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
    protected Boolean showPermissions;
import java.util.HashMap;
        }
import java.util.Collection;
            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_INCLUDE_PERMISSIONS)) {
public class SQLSourceViewer<T extends DBPScriptObject & DBSObject> extends SQLEditorNested<T> {
 */
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return "DDL";

    }
    }
        super.activatePart();
    protected Boolean showColumnComments;
        T sourceObject = getSourceObject();
                                getPreferenceStore().setValue(DBPScriptObject.OPTION_INCLUDE_COMMENTS, showColumnComments);
    @Override
                    }, true));
    protected Map<String, Object> getSourceOptions() {
                                showFullDDL = isChecked();
                        {
        if (genObject instanceof DBPScriptObjectExt2) {
            }
                            getPreferenceStore().setValue(DBPScriptObject.OPTION_INCLUDE_PARTITIONS, showPartitionsDDL);
                UIUtils.getActiveWorkbenchWindow(),
                            refreshPart(SQLSourceViewer.this, true);
                                setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TREE_PERMISSIONS));
            String sqlText = document.get();
            return sourceObject == null ? null : sourceObject.getObjectDefinitionText(monitor, getSourceOptions());
            separateFKStmts = getPreferenceStore().getBoolean(DBPScriptObject.OPTION_DDL_SEPARATE_FOREIGN_KEYS_STATEMENTS);
 * You may obtain a copy of the License at
            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_INCLUDE_COMMENTS)) {
            Collection<String> attributeNames = ((IDatabaseEditorInput)editorInput).getAttributeNames();

import org.eclipse.jface.action.IContributionManager;
import org.jkiss.dbeaver.ui.DBeaverIcons;
        }
            }
    {
                                getPreferenceStore().setValue(DBPScriptObject.OPTION_INCLUDE_NESTED_OBJECTS, showFullDDL);
                    sqlText = ((TextSelection) selection).getText();
        T genObject = getSourceObject();
    
            }
                        }, true));
                sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_DDL_ONLY_FOREIGN_KEYS)) {
                            }
        T sourceObject = getSourceObject();

                    new Action(SQLEditorMessages.source_viewer_show_partitions_ddl_text, Action.AS_CHECK_BOX) {
                options.put(DBPScriptObject.OPTION_INCLUDE_PERMISSIONS, getShowPermissions());
import org.eclipse.jface.text.IDocument;
            }
        } else if (!(sourceObject instanceof DBSEntity)) {
            options.put(DBPScriptObject.OPTION_DDL_SOURCE, true);
                            @Override
    protected Boolean getShowPartitionsDDL() {

        }
            final DBPDataSource dataSource = getDataSource();
                            }
 *
                }
    protected String getSourceText(DBRProgressMonitor monitor) throws DBException {
                toolBarManager.add(ActionUtils.makeActionContribution(
        }
        if (showColumnComments == null) {
                                getPreferenceStore().setValue(DBPScriptObject.OPTION_INCLUDE_PERMISSIONS, showPermissions);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                showColumnComments = isChecked();

            if (sourceObject.supportsObjectDefinitionOption(DBPScriptObject.OPTION_INCLUDE_PARTITIONS)) {
                toolBarManager.add(ActionUtils.makeActionContribution(

            refreshPart(this, true);
        }
