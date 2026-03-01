    }
 *

    protected void createContentsBeforeColumns(Composite panel)
    protected List<? extends DBSEntityAttribute> getAttributes(
    protected void handleColumnsChange() {
        if (!CommonUtils.isEmpty(dictionary.getDescriptionColumnNames())) {
import org.jkiss.dbeaver.model.virtual.DBVUtils;


            ObjectEditorMessages.dialog_struct_edit_dictionary_column_delimiter,

        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {

            }
        }
        StringBuilder custom = new StringBuilder();
            entity.getDataSource().getContainer().getPreferenceStore().getString(ModelPreferences.DICTIONARY_COLUMN_DIVIDER));
        return entity;
 * distributed under the License is distributed on an "AS IS" BASIS,
            return true;
import org.jkiss.dbeaver.model.struct.DBSEntity;
        entity.getDataSource().getContainer().persistConfiguration();
    @Override
        UIUtils.createControlLabel(group, ObjectEditorMessages.dialog_struct_edit_dictionary_custom_criteria);
            public void widgetSelected(SelectionEvent e) {
    }
    protected void createContentsAfterColumns(Composite panel)
import org.eclipse.swt.events.SelectionAdapter;


        });
            settingsPanel,
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.UIUtils;
        return false;
            columnDividerText.getText());
    private DBVEntity dictionary;
                        dictionary.setDescriptionColumnNames(DBVEntity.getDefaultDescriptionColumn(monitor, tablePK.iterator().next()));
        @NotNull DBRProgressMonitor monitor,
                    Collection<? extends DBSEntityAttribute> tablePK = DBUtils.getBestTableIdentifier(monitor, entity);
        criteriaText.setToolTipText(ObjectEditorMessages.dialog_struct_edit_dictionary_custom_criteria_tip);
import org.eclipse.ui.PlatformUI;
            if (custom.length() > 0) {
                throw new InvocationTargetException(e);
 */
    private Text columnDividerText;
        return dictionary;
    }
        this.dictionary = DBVUtils.getVirtualEntity(entity, true);
                if (dictionary.getDescriptionColumnNames() == null) {
    @Override
                }
        for (DBSEntityAttribute column : descColumns) {

            }
        criteriaText.setText(custom.toString());
/*
import org.jkiss.dbeaver.model.virtual.DBVEntity;
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBWorkbench.getPlatform().getPreferenceStore().setValue(
    }
            }
    }
    public DBVEntity getDictionary()
import java.lang.reflect.InvocationTargetException;
    @Override
    {
                // FIXME: Cannot use constant due to circular dependency.
    @Override
 *
        descColumns = getSelectedAttributes();
                descColumns = dictionary.getDescriptionColumns(monitor, entity);
        return CommonUtils.safeList(object.getAttributes(monitor));
    public void saveDictionarySettings() {
        }
    public void performFinish()

 * You may obtain a copy of the License at
import org.eclipse.swt.events.SelectionEvent;
}
 *
            criteriaText.setText(dictionary.getDescriptionColumnNames());
    ) throws DBException {
    @NotNull

import org.jkiss.dbeaver.ModelPreferences;
        if (!CommonUtils.isEmpty(criteriaText.getText())) {
        Link label = UIUtils.createLink(panel, ObjectEditorMessages.dialog_struct_edit_dictionary_tip, new SelectionAdapter() {
package org.jkiss.dbeaver.ui.editors.object.struct;
    protected boolean isColumnsRequired() {
 * @author Serge Rider
import org.eclipse.swt.widgets.Text;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        });
        settingsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * Unless required by applicable law or agreed to in writing, software
        GridData gd = new GridData(GridData.FILL_BOTH);
import org.eclipse.swt.widgets.Link;
        this.entity = entity;
        criteriaText.setLayoutData(gd);
        return descColumns.contains(attribute);
    {
            ModelPreferences.DICTIONARY_COLUMN_DIVIDER,
/**
        return super.isPageComplete();
        Composite group = UIUtils.createComposite(panel, 1);
    {
    private DBSEntity entity;
        columnDividerText = UIUtils.createLabelText(
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and

import org.eclipse.swt.widgets.Composite;
    public boolean isPageComplete() {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.layout.GridData;
    @Override
        @NotNull DBSEntity object
        Composite settingsPanel = UIUtils.createComposite(group, 2);
            } catch (DBException e) {
 */

        criteriaText = new Text(group, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP);

    }
    @Override

    @Override
import org.jkiss.dbeaver.model.DBUtils;
    private Collection<DBSEntityAttribute> descColumns;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                UIUtils.showPreferencesFor(null, null, /*PrefPageDataViewer.PAGE_ID*/ "org.jkiss.dbeaver.preferences.main.dataviewer");
    }

            @Override
            try {
    @Override


import org.eclipse.swt.SWT;
    public DBSObject getObject() {
import java.util.Collection;
        super("Edit description", entity);
        columnDividerText.setToolTipText(ObjectEditorMessages.dialog_struct_edit_dictionary_column_delimiter_tip);
        gd.heightHint = 50;
        saveDictionarySettings();
                custom.append(",");

import org.jkiss.dbeaver.DBException;
    }
    {
    @Override
    public boolean isColumnSelected(DBSEntityAttribute attribute)
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.code.NotNull;
    }
 * EditDictionaryPage
 * limitations under the License.
        final DBSEntity entity)
                    }
                    if (tablePK != null && !tablePK.isEmpty()) {
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
    }
            custom.append(DBUtils.getQuotedIdentifier(column));
 *
        UIUtils.runInUI(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), monitor -> {
    }
        }
    public EditDictionaryPage(
    {
public class EditDictionaryPage extends AttributesSelectorPage<DBSEntity, DBSEntityAttribute> {
        dictionary.setDescriptionColumnNames(criteriaText.getText());
import java.util.List;
    private Text criteriaText;
 * Copyright (C) 2010-2026 DBeaver Corp and others
