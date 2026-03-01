        item.setImage(2, DBeaverIcons.getImage(refEntity.getDataSource().getContainer().getDriver().getIcon()));

        tabFolder.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> selectedPage = e.item.getData(DATA_PAGE)));
import org.eclipse.swt.events.SelectionEvent;
        Composite panel = new Composite(tabFolder, 1);
}
    {
                        fk.getAssociatedEntity(monitor);
                if (!CommonUtils.isEmpty(transformSettings.getIncludedTransformers())) {
        createForeignKeysPage(tabFolder);
import org.jkiss.code.NotNull;
        } catch (InterruptedException e) {
                } else if (!CommonUtils.isEmpty(transformSettings.getCustomTransformer())) {
import org.eclipse.swt.layout.GridLayout;
        attrsItem.setText(ResultSetMessages.controls_resultset_virtual_columns_page_text);
        fkTable.setHeaderVisible(true);
    private void createForeignKeysPage(CTabFolder tabFolder) {
 * Unless required by applicable law or agreed to in writing, software
        CTabItem ukItem = new CTabItem(tabFolder, SWT.NONE);
                        NLS.bind(
        this.viewer = viewer;
import org.jkiss.dbeaver.model.DBUtils;
        String transformStr = "";

        }
        }
        item.setImage(0, DBeaverIcons.getImage(DBIcon.TREE_FOREIGN_KEY));
import org.jkiss.dbeaver.Log;
    public void updateMessage() {
        ukItem.setData(DATA_PAGE, editUniqueKeyPage);
        }
        }
            editDictionaryPage = new EditDictionaryPage(entity);
/*
        }
    }
        ukItem.setText("Virtual Unique Key");
                        log.debug(e);
            uniqueConstraint)
                    }
        if (editUniqueKeyPage != null) {
            ResultSetMessages.controls_resultset_virtual_foreignkey_page_columns);
            log.debug("No reference constraint for FK " + fk.getName());

                selectedPage = item.getData(DATA_PAGE);


        for (CTabItem item : tabFolder.getItems()) {
        return UIUtils.getDialogSettings(DIALOG_ID);
                            coStrings.add(CommonUtils.toString(value));

            public void widgetSelected(SelectionEvent e) {
 */
    public InitPage getInitPage() {
    private boolean structChanged = false;
                }
    private DBVEntityConstraint uniqueConstraint;
    public EditVirtualEntityDialog(@NotNull ResultSetViewer viewer, @Nullable DBSEntity entity, @NotNull DBVEntity vEntity) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            DBVTransformSettings transformSettings = vAttr.getTransformSettings();

    private void createColumnsPage(CTabFolder tabFolder) {
    }
                            virtualFK.getName()))) {
        editUniqueKeyPage = new EditConstraintPage(
            Collection<DBSEntityAttribute> uniqueAttrs = editUniqueKeyPage.getSelectedAttributes();
                        return;
    }
                    structChanged = true;
    {

                        structChanged = true;

    private EditVirtualColumnsPage columnsPage;
            }

        if (referencedConstraint == null) {
    //private static final String DIALOG_ID = "DBeaver.EditVirtualEntityDialog";//$NON-NLS-1$
import org.jkiss.dbeaver.model.virtual.*;
            }
        }

                tabFolder.setSelection(item);
            @Override
            }
            btnAdd.addSelectionListener(new SelectionAdapter() {
    public void updateButtons() {
            btnRemove.setEnabled(false);
import java.util.ArrayList;
    }
                    fkTable.remove(fkTable.getSelectionIndices());
                    DBVEntityForeignKey virtualFK = (DBVEntityForeignKey) fkTable.getSelection()[0].getData();

        createColumnsPage(tabFolder);
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
        attrsItem.setImage(DBeaverIcons.getImage(DBIcon.TREE_COLUMN));
        vEntity.persistConfiguration();
            uniqueConstraint.setUseAllColumns(editUniqueKeyPage.isUseAllColumns());
        if (vAttr != null) {
                    transformStr = String.join(",", transformSettings.getIncludedTransformers());
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSEntity;
    public enum InitPage {
                        DBWorkbench.getPlatform().getValueHandlerRegistry().getTransformer(transformSettings.getCustomTransformer());
                break;

		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
            protected boolean isColumnsRequired() {
            ResultSetMessages.controls_resultset_virtual_foreignkey_page_ref_datasource);
                @Override
    private Object selectedPage;
import org.eclipse.swt.widgets.Table;
    private InitPage initPage = InitPage.ATTRIBUTES;
            }
import org.eclipse.swt.events.SelectionListener;
            dictItem.setData(DATA_PAGE, editDictionaryPage);
                            ResultSetMessages.controls_resultset_virtual_foreignkey_page_remove_confirmation_question,
    @Override
import org.eclipse.swt.layout.GridData;
*/
    private void createDictionaryPage(CTabFolder tabFolder) {


        attrsItem.setData(DATA_PAGE, columnsPage);
public class EditVirtualEntityDialog extends BaseTitleDialog implements IDialogPageContainer {
        item.setText(2, refEntity.getDataSource().getContainer().getName());
        uniqueConstraint = vEntity.getBestIdentifier();
        }
                        createForeignKeyItem(fkTable, virtualFK);
                        }
        String colorSettings = "";
    protected IDialogSettings getDialogBoundsSettings()
import org.eclipse.swt.custom.CTabItem;
 * You may obtain a copy of the License at
        }
import org.jkiss.dbeaver.ui.editors.object.struct.EditDictionaryPage;
        CTabItem attrsItem = new CTabItem(tabFolder, SWT.NONE);
        UIUtils.createInfoLabel(composite, ResultSetMessages.controls_resultset_virtual_keys_info_label);
        attrItem.setText(2, colorSettings);
import java.util.stream.Collectors;
        fkTable.addSelectionListener(new SelectionAdapter() {

                    }
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
            "Define unique identifier",

        ukItem.setData(InitPage.UNIQUE_KEY);
/*
    private EditConstraintPage editUniqueKeyPage;
        }
        ukItem.setImage(DBeaverIcons.getImage(DBIcon.TREE_UNIQUE_KEY));
                ResultSetMessages.controls_resultset_virtual_foreignkey_page_remove,
            java.util.List<DBVColorOverride> coList = vEntity.getColorOverrides(attr.getName());


import org.eclipse.swt.events.SelectionAdapter;
            log.error(e.getTargetException());
                        fk.getRealReferenceConstraint(monitor);
                    vEntity.removeForeignKey(virtualFK);
                    if (td != null) {
        fkItem.setControl(panel);
        attrsItem.setData(InitPage.ATTRIBUTES);
            return;
 * distributed under the License is distributed on an "AS IS" BASIS,
        CTabFolder tabFolder = new CTabFolder(composite, SWT.TOP | SWT.FLAT);
        UNIQUE_KEY,
        fkTable.setLayoutData(new GridData(GridData.FILL_BOTH));
        if (okButton != null) {
    public static final int ID_REMOVE_FOREIGN_KEY = 2001;
        UIUtils.createTableColumn(fkTable, SWT.LEFT,
                @Override
            editDictionaryPage.saveDictionarySettings();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.entity = entity;
        editUniqueKeyPage.setContainer(this);
    }
        super(viewer.getControl().getShell(), null);
package org.jkiss.dbeaver.ui.controls.resultset.virtual;
import org.jkiss.dbeaver.ui.UIUtils;
            dictItem.setText(ResultSetMessages.controls_resultset_virtual_dictionary_page_text);
        }
            Button btnAdd = createButton(buttonsPanel, ID_CREATE_FOREIGN_KEY,
import org.eclipse.swt.widgets.Button;
            if (!coList.isEmpty()) {
        }
            uniqueConstraint.setName(editUniqueKeyPage.getConstraintName());
    }
        editUniqueKeyPage.createControl(tabFolder);
    private final DBVEntity vEntity;
            .collect(Collectors.joining(","));
            try {

    @Override
        UIUtils.executeOnResize(fkTable, () -> UIUtils.packColumns(fkTable, true));
                java.util.List<String> coStrings = new ArrayList<>();
        Table fkTable = new Table(panel, SWT.FULL_SELECTION | SWT.BORDER);
import java.util.Collection;
    private void createForeignKeyItem(Table fkTable, DBVEntityForeignKey fk) {
                        ResultSetMessages.controls_resultset_virtual_foreignkey_page_remove_confirmation_title,
import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;

    }
                public void widgetSelected(SelectionEvent e) {
        createDictionaryPage(tabFolder);
                log.error(e);

            editDictionaryPage.setContainer(this);
            Composite buttonsPanel = UIUtils.createComposite(panel, 2);
        String ownAttrNames = fk.getAttributes().stream().map(DBVEntityForeignKeyColumn::getAttributeName)

    public void setInitPage(InitPage initPage) {
        panel.setLayout(new GridLayout(1, false));

                    }

import org.jkiss.code.Nullable;

        attrsItem.setControl(pageContents);
import org.jkiss.dbeaver.model.DBIcon;
                    if (virtualFK != null) {
            dictItem.setImage(DBeaverIcons.getImage(DBIcon.TREE_PACKAGE));
            return;
            dictItem.setData(InitPage.DICTIONARY);
import org.jkiss.utils.CommonUtils;
                    if (!UIUtils.confirmAction(getShell(),
 *
 *
            }
            setErrorMessage(editUniqueKeyPage.getErrorMessage());
 * Licensed under the Apache License, Version 2.0 (the "License");
        fkItem.setText(ResultSetMessages.controls_resultset_virtual_foreignkey_page_text);
        Composite pageContents = columnsPage.createPageContents(tabFolder);
    protected Composite createDialogArea(Composite parent) {
            if (errorMessage != null) {


            CTabItem dictItem = new CTabItem(tabFolder, SWT.NONE);
            editDictionaryPage.createControl(tabFolder);

            }
    }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.data.DBDAttributeTransformerDescriptor;
        return initPage;
 *
            // ignore
    public static final int ID_REMOVE_UNIQUE_KEY = 1001;

 *     http://www.apache.org/licenses/LICENSE-2.0
        DBSEntity refEntity = referencedConstraint.getParentObject();
        item.setText(1, "(" + ownAttrNames + ") -> (" + refAttrNames + ")");
 * See the License for the specific language governing permissions and
        attrItem.setText(1, transformStr);
import org.eclipse.swt.widgets.Composite;
            UIUtils.runInProgressService(monitor -> {
    }
    private EditDictionaryPage editDictionaryPage;
                boolean hasSelection = fkTable.getSelectionIndex() >= 0;
        DBSEntityConstraint referencedConstraint = fk.getReferencedConstraint();
            } catch (DBException e) {
                return;
        if (editUniqueKeyPage != null) {
    protected void okPressed()
            createForeignKeyItem(fkTable, fk);
            buttonsPanel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        UIUtils.createTableColumn(fkTable, SWT.LEFT,
        fkItem.setImage(DBeaverIcons.getImage(DBIcon.TREE_FOREIGN_KEY));
                buttonsPanel,
        if (editDictionaryPage != null) {
            viewer.refreshData(null);
        super.okPressed();
            if (item.getData() == initPage) {
            String errorMessage = editDictionaryPage.getErrorMessage();

            dictItem.setControl(editDictionaryPage.getControl());
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
        DBUtils.fireObjectUpdate(vEntity, uniqueConstraint);
                }
    private final ResultSetViewer viewer;

                ID_REMOVE_FOREIGN_KEY,
    public static final int ID_CREATE_FOREIGN_KEY = 2000;
            setErrorMessage(errorMessage);
    }
            });
            });
            btnRemove.addSelectionListener(new SelectionAdapter() {
        
        if (uniqueConstraint == null) {
import org.eclipse.swt.custom.CTabFolder;

        if (entity != null) {
                for (DBVEntityForeignKey fk : vEntity.getForeignKeys()) {
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
                }

        UIUtils.createTableColumn(fkTable, SWT.LEFT,
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
            Button btnRemove = createButton(
            return;
    @Override
        DBVEntityAttribute vAttr = vEntity.getVirtualAttribute(attr, false);
        }
import org.eclipse.osgi.util.NLS;
    public static final int ID_CREATE_UNIQUE_KEY = 1000;
                    try {
                return initPage == InitPage.UNIQUE_KEY && super.isColumnsRequired();
                }
    }
        if (editDictionaryPage != null) {
        //item.setImage(0, DBeaverIcons.getImage(DBIcon.TREE_FOREIGN_KEY));
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

                false);

    }
        fkItem.setData(InitPage.FOREIGN_KEYS);
        DICTIONARY,
        {
        }
        ukItem.setControl(editUniqueKeyPage.getControl());
    private static final Log log = Log.getLog(EditVirtualEntityDialog.class);
        {

        DBDAttributeBinding attr = (DBDAttributeBinding) attrItem.getData();

                    }
                    }
    
    {
 * DBeaver - Universal Database Manager
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.runtime.DBWorkbench;

                        transformStr = td.getName();
        Composite composite = super.createDialogArea(parent);
import org.eclipse.jface.dialogs.IDialogConstants;
            });
    }
                    } catch (DBException e) {
        }
import org.jkiss.dbeaver.ui.dialogs.IDialogPageContainer;
 * you may not use this file except in compliance with the License.
        if (referencedConstraint != null) {
                getButton(ID_REMOVE_FOREIGN_KEY).setEnabled(hasSelection);
            item.setText(0, DBUtils.getObjectFullName(refEntity, DBPEvaluationContext.UI));
    @Override
        FOREIGN_KEYS,
                for (DBVColorOverride co : coList) {
        setTitle(ResultSetMessages.controls_resultset_edit_logical_structure);
        });
        columnsPage = new EditVirtualColumnsPage(viewer, vEntity);
        {
                    DBVEntityForeignKey virtualFK = EditForeignKeyPage.createVirtualForeignKey(vEntity);
        } catch (InvocationTargetException e) {
    private static final String DATA_PAGE = "dialogPage";
import java.util.Collections;
            .collect(Collectors.joining(","));
        this.vEntity = vEntity;
        CTabItem fkItem = new CTabItem(tabFolder, SWT.NONE);
    @Override
        };
                    DBDAttributeTransformerDescriptor td =
                        for (Object value : co.getAttributeValues()) {
        this.initPage = initPage;
        return parent;

        String refAttrNames = fk.getAttributes().stream().map(DBVEntityForeignKeyColumn::getRefAttributeName)
    private void updateColumnItem(TableItem attrItem) {
    protected void createButtonsForButtonBar(Composite parent)
                viewer.reloadIdentifierAttributes();
            ResultSetMessages.controls_resultset_virtual_foreignkey_page_ref_table);
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            uniqueConstraint.setAttributes(uniqueConstraint.isUseAllColumns() ? Collections.emptyList() : uniqueAttrs);

        TableItem item = new TableItem(fkTable, SWT.NONE);

                colorSettings = String.join(",", coStrings);
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
    }
    @Override
            okButton.setEnabled(CommonUtils.isEmpty(getErrorMessage()));
import org.jkiss.dbeaver.ui.DBeaverIcons;
            @Override
        if (structChanged || columnsPage.isStructChanged()) {
        for (DBVEntityForeignKey fk : vEntity.getForeignKeys()) {

        try {
    }
        Button okButton = getButton(IDialogConstants.OK_ID);
        createUniqueKeysPage(tabFolder);
import java.lang.reflect.InvocationTargetException;
        ATTRIBUTES,
        parent.getShell().setText(ResultSetMessages.controls_resultset_edit_logical_structure);
                ResultSetMessages.controls_resultset_virtual_foreignkey_page_add, false);
                public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.ui.dialogs.BaseTitleDialog;
    private void createUniqueKeysPage(CTabFolder tabFolder) {

            }
                    if (co.getAttributeValues() != null) {
    private final DBSEntity entity;
        item.setData(fk);
        }

            if (transformSettings != null) {
import org.eclipse.swt.widgets.TableItem;
                }
        tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
