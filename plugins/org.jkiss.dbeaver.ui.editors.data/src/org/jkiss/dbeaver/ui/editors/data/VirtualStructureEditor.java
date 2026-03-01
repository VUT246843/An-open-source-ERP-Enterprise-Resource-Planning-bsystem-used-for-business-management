                @Override
                                vEntity.persistConfiguration();
        fkTable.setHeaderVisible(true);
        try {
            editDictionaryPage.createControl(tabFolder);
                                    "Virtual Unique Key Creation Failed",
        constraint.setName(editPage.getConstraintName());
    }

    @Override
                    createUniqueKeyItem(ukTable, uk);
        if (entity != null) {
                    btnRemove.setEnabled(ukTable.getSelectionIndex() >= 0);
    private void createDictionaryPage(CTabFolder tabFolder) {
    }
        }
        UIUtils.packColumns(fkTable, true);
        UIUtils.createTableColumn(ukTable, SWT.LEFT, DataEditorsMessages.virtual_structure_editor_table_column_key_name);
import org.jkiss.dbeaver.ui.css.CSSUtils;
import org.eclipse.swt.layout.GridLayout;
            });
        }
            });
import org.eclipse.swt.custom.CTabItem;

 *
            });
        }
 * limitations under the License.
        ConComposite group = new ConComposite(parent);
import org.jkiss.dbeaver.runtime.DBWorkbench;

    public void dispose() {
        this.entity = getDatabaseObject();

        item.setText(1, ownAttrNames);
                @Override
                    }
            refEntity = refConstraint == null ? null : refConstraint.getParentObject();
                    if (!UIUtils.confirmAction(parent.getShell(),
        new AbstractJob(DataEditorsMessages.virtual_structure_editor_abstract_job_load_entity) {
                    if (editPage.edit()) {
        constraint.setAttributes(editPage.getSelectedAttributes());
import org.jkiss.dbeaver.Log;
        //item.setImage(0, DBeaverIcons.getImage(DBIcon.TREE_FOREIGN_KEY));
                public void widgetSelected(SelectionEvent e) {

            activated = true;
/*
            buttonsPanel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    private EditVirtualColumnsPage columnsPage;
            item.setImage(2, DBeaverIcons.getImage(refEntity.getDataSource().getContainer().getDriver().getIcon()));
    }
            }).setEnabled(false);
        UIUtils.packColumns(refTable, true);
                    registry.removeDataSourceListener(this);
            GridData.FILL_HORIZONTAL,
                        }
        ConComposite composite = new ConComposite(parent, SWT.NONE);
                    DBVEntityConstraint virtualUK = (DBVEntityConstraint) ukItem.getData();
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
                        return;
import org.eclipse.swt.layout.GridData;
        return RefreshResult.REFRESHED;
import java.util.stream.Collectors;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

            dictItem.setText(DataEditorsMessages.virtual_structure_editor_dictionary_page_text);
import org.jkiss.dbeaver.DBException;
        item.setData(uk);

                for (DBVColorOverride co : coList) {
        } catch (Exception e) {
            DBSEntityConstraint refConstraint = fk.getReferencedConstraint();

        if (!activated) {
            UIUtils.asyncExec(() -> refreshPart(event, true));
import org.jkiss.dbeaver.model.virtual.*;
        ConComposite group = new ConComposite(parent);
            return;
                }
        createForeignKeysPage(keysComposite);


    }
    }
        ConComposite keysComposite = new ConComposite(composite);
                registry.addDataSourceListener(this);
    private static final Log log = Log.getLog(VirtualStructureEditor.class);
                            if (!vEntity.addConstraint(newConstraint)) {
    }
                }
                        ukItem.setText(0, DBUtils.getObjectFullName(virtualUK, DBPEvaluationContext.UI));
import org.jkiss.dbeaver.ui.ConComposite;
            log.error("Error loading virtual foreign keys", e);
    private void changeConstraint(DBVEntityConstraint constraint, EditConstraintPage editPage) {
        }
            Composite buttonsPanel = UIUtils.createComposite(group, 3);
import org.jkiss.dbeaver.model.*;
import org.eclipse.swt.events.SelectionAdapter;
    public void activatePart() {
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.data.DBDAttributeTransformerDescriptor;
        this.parent = parent;

import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
        gl.marginHeight = 1;
        UIUtils.createControlLabel(group, DataEditorsMessages.virtual_structure_editor_columns_group_unique_keys);
                        log.debug(e);
        }
        DBDAttributeBinding attr = (DBDAttributeBinding) attrItem.getData();
            });
        createUniqueKeysPage(keysComposite);
            if (dbObject != null) {
            if (registry != null) {
                for (DBVEntityForeignKey fk : vEntity.getForeignKeys()) {
        group.setGridLayout(1);
        ukTable.setLayoutData(new GridData(GridData.FILL_BOTH));
                }
            CSSUtils.markConnectionTypeColor(buttonsPanel);
            UIUtils.createDialogButton(buttonsPanel, DataEditorsMessages.virtual_structure_editor_dialog_button_add, new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                public void widgetSelected(SelectionEvent e) {
    }
                }
        item.setText(0, DBUtils.getObjectFullName(uk, DBPEvaluationContext.UI));
                    EditConstraintPage editPage = new EditConstraintPage(DataEditorsMessages.virtual_structure_editor_constraint_page_edit_key, virtualUK);
                        vEntity.persistConfiguration();
        ukTable = new Table(group, SWT.FULL_SELECTION | SWT.BORDER);
//        Composite attrsComposite = UIUtils.createComposite(composite, 1);
    @Override

                        fk.getAssociatedEntity(monitor);
        group.setGridLayout(1);

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            item.setText(2, refEntity.getDataSource().getContainer().getName());
import org.jkiss.dbeaver.ui.editors.AbstractDatabaseObjectEditor;
 */
            SelectionAdapter ukEditListener = new SelectionAdapter() {
                UIUtils.asyncExec(() -> refreshVisuals());
            dictItem.setControl(editDictionaryPage.getControl());
        UIUtils.packColumns(ukTable, true);
                @Override
                        fk.getRealReferenceConstraint(monitor);
    private DBSEntity entity;
    private void refreshVisuals() {
        attrItem.setText(2, colorSettings);
                        DBWorkbench.getPlatform().getValueHandlerRegistry().getTransformer(transformSettings.getCustomTransformer());
                @Override
                        transformStr = td.getName();
    private String getConstraintAttrNames(DBVEntityConstraint uk) {
    @Override
        item.setData(fk);
 * VirtualStructureEditor


 * You may obtain a copy of the License at
    @Override
                            // Show error if a constraint with the same name already exists
        ukTable.setHeaderVisible(true);
    public RefreshResult refreshPart(Object source, boolean force) {
import org.eclipse.osgi.util.NLS;
        if (vAttr != null) {

            buttonsPanel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            for (DBVEntityConstraint uk : vEntity.getConstraints()) {
    }
    public void createPartControl(Composite parent) {
        if (ref) {
                        vEntity.persistConfiguration();
//        attrsComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            editDictionaryPage = new EditDictionaryPage(entity);
                var registry = DBUtils.getObjectRegistry(dbObject);
                if (uk.isUseAllColumns() || !CommonUtils.isEmpty(uk.getAttributes())) {
        }
        constraint.setUseAllColumns(editPage.isUseAllColumns());
                }
                public void widgetSelected(SelectionEvent e) {
            .collect(Collectors.joining(","));
        createReferencesPage(keysComposite);
                public void widgetDefaultSelected(SelectionEvent e) {

                createForeignKeyItem(fkTable, fk, false);
        UIUtils.createControlLabel(group, DataEditorsMessages.virtual_structure_editor_control_group_references);
        {
            1

import org.jkiss.dbeaver.ui.DBeaverIcons;
                    vEntity.persistConfiguration();
                java.util.List<String> coStrings = new ArrayList<>();
            dictItem.setData(EditVirtualEntityDialog.InitPage.DICTIONARY);
public class VirtualStructureEditor extends AbstractDatabaseObjectEditor<DBSEntity> implements DBPEventListener {
            Button btnEdit = UIUtils.createDialogButton(buttonsPanel, DataEditorsMessages.virtual_structure_editor_dialog_button_edit, ukEditListener);

        GridLayout gl = (GridLayout) keysComposite.getLayout();
        item.setText(0, refEntity == null ? "?" : DBUtils.getObjectFullName(refEntity, DBPEvaluationContext.UI));
    }
                    }

    private DBVEntity vEntity;
        group.setGridLayout(1);
        UIUtils.createControlLabel(group, DataEditorsMessages.virtual_structure_editor_control_group_label_foreign_key);
    @Override
        }
                                    "Duplicate constraint '" + newConstraint.getName()
        uniqueConstraint = vEntity.getBestIdentifier();
                    if (!UIUtils.confirmAction(parent.getShell(),
        UIUtils.createTableColumn(refTable, SWT.LEFT, DataEditorsMessages.virtual_structure_editor_table_column_columns);
                    transformStr = String.join(",", transformSettings.getIncludedTransformers());
                                createUniqueKeyItem(ukTable, newConstraint);
                return Status.OK_STATUS;
        }
        {
            };
                    }
        if (dbObject != null) {
        fkTable.removeAll();
        } catch (Exception e) {
            log.error("Error loading virtual foreign keys", e);
 */
        group.setLayoutData(new GridData(GridData.FILL_BOTH));

                } else if (!CommonUtils.isEmpty(transformSettings.getCustomTransformer())) {
        String ownAttrNames = getConstraintAttrNames(uk);
        );

        refTable.removeAll();
        DBSEntity dbObject = getDatabaseObject();
                }

    private void createForeignKeysPage(Composite parent) {

                    @Override
        DBSEntity refEntity;
import org.jkiss.utils.CommonUtils;
            .collect(Collectors.joining(","));
            }
            }
        try {
            }
        String ownAttrNames = fk.getAttributes().stream().map(DBVEntityForeignKeyColumn::getAttributeName)


    private Composite parent;
 * See the License for the specific language governing permissions and
        UIUtils.createTableColumn(ukTable, SWT.LEFT, DataEditorsMessages.virtual_structure_editor_table_column_columns);

import java.util.ArrayList;
    private void createUniqueKeysPage(Composite parent) {
        UIUtils.createTableColumn(fkTable, SWT.LEFT, DataEditorsMessages.virtual_structure_editor_table_column_datasource);
 * distributed under the License is distributed on an "AS IS" BASIS,
            createEditorUI();

    }
import org.eclipse.core.runtime.IStatus;
                public void widgetSelected(SelectionEvent e) {
            var registry = DBUtils.getObjectRegistry(dbObject);
import org.jkiss.dbeaver.ui.editors.object.struct.EditDictionaryPage;
            });
        columnsPage.refreshAttributes();
        ukTable.removeAll();
                @Override
                }
        if (event.getObject() == vEntity) {
                                DBWorkbench.getPlatformUI().showError(
        UIUtils.createTableColumn(fkTable, SWT.LEFT, DataEditorsMessages.virtual_structure_editor_table_column_target_table);
    private void createUniqueKeyItem(Table ukTable, DBVEntityConstraint uk) {
                    btnRemove.setEnabled(fkTable.getSelectionIndex() >= 0);
        String colorSettings = "";
            fkTable.addSelectionListener(new SelectionAdapter() {
            composite,
    private DBVEntityConstraint uniqueConstraint;
                }
        composite.setGridLayout(1);
import org.eclipse.swt.SWT;

    }
        }
                    fkTable.remove(fkTable.getSelectionIndices());
    private void createColumnsPage(Composite parent) {
        String transformStr = "";
                        changeConstraint(virtualUK, editPage);
            btnEdit.setEnabled(false);
                                );

                        for (Object value : co.getAttributeValues()) {
    private void updateColumnItem(TableItem attrItem) {
        }
            }


                    		DataEditorsMessages.virtual_structure_editor_confirm_action_delete_fk,
                public void widgetSelected(SelectionEvent e) {
                }
            for (DBVEntityForeignKey fk : vEntity.getForeignKeys()) {
            if (!coList.isEmpty()) {
import org.jkiss.dbeaver.ui.controls.resultset.virtual.EditVirtualColumnsPage;

            .collect(Collectors.joining(","));
        gl.makeColumnsEqualWidth = true;


    private Table refTable;
            DBVTransformSettings transformSettings = vAttr.getTransformSettings();
import org.eclipse.swt.widgets.*;
        UIUtils.createTableColumn(refTable, SWT.LEFT, DataEditorsMessages.virtual_structure_editor_table_column_source_datasource);
                if (!CommonUtils.isEmpty(transformSettings.getIncludedTransformers())) {
    }
            UIUtils.createDialogButton(buttonsPanel, DataEditorsMessages.virtual_structure_editor_dialog_button_refresh, new SelectionAdapter() {

            for (DBVEntityForeignKey fk : DBVUtils.getVirtualReferences(entity)) {
        item.setImage(0, DBeaverIcons.getImage(DBIcon.TREE_FOREIGN_KEY));
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
                }
            CSSUtils.markConnectionTypeColor(buttonsPanel);
                    ukTable.remove(ukTable.getSelectionIndices());
                            coStrings.add(CommonUtils.toString(value));
        CSSUtils.markConnectionTypeColor(infoLabel);

            ukTable.addSelectionListener(new SelectionAdapter() {
        columnsPage = new EditVirtualColumnsPage(null, vEntity);
                    }
        ConComposite group = new ConComposite(parent);
            java.util.List<DBVColorOverride> coList = vEntity.getColorOverrides(attr.getName());
            CSSUtils.markConnectionTypeColor(buttonsPanel);
                    DBDAttributeTransformerDescriptor td =
        group.setGridLayout(1);
        keysComposite.setGridLayout(2);
        {
                        EditConstraintPage editPage = new EditConstraintPage(DataEditorsMessages.virtual_structure_editor_constraint_page_edit_key, newConstraint);
                public void widgetSelected(SelectionEvent e) {
                colorSettings = String.join(",", coStrings);
        if (activated) {


            btnRemove.setEnabled(false);
        item.setText(1, "(" + ownAttrNames + ") -> (" + refAttrNames + ")");
import org.jkiss.code.NotNull;
                        if (editPage.edit()) {
                        createForeignKeyItem(fkTable, virtualFK, true);
import org.jkiss.dbeaver.ui.UIUtils;
        super.dispose();
        }
            }
                    }
        DBVEntityAttribute vAttr = vEntity.getVirtualAttribute(attr, false);
                        DBVEntityConstraint newConstraint = new DBVEntityConstraint(vEntity, DBSEntityConstraintType.VIRTUAL_KEY, vEntity.getName() + "_uk");
        String refAttrNames = fk.getAttributes().stream().map(DBVEntityForeignKeyColumn::getRefAttributeName)
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
                    DBVEntityForeignKey virtualFK = EditForeignKeyPage.createVirtualForeignKey(vEntity);
            DBSEntity dbObject = getDatabaseObject();
    }
        }.schedule();
                        NLS.bind(DataEditorsMessages.virtual_structure_editor_confirm_action_question_delete_foreign, virtualFK.getName()))) {
    private boolean activated;
 * DBeaver - Universal Database Manager
}
                @Override
            }
                        ukItem.setText(1, getConstraintAttrNames(virtualUK));
            btnRemove.setEnabled(false);
                @Override
        UIUtils.createTableColumn(refTable, SWT.LEFT, DataEditorsMessages.virtual_structure_editor_table_column_source_table);
                    btnEdit.setEnabled(ukTable.getSelectionIndex() >= 0);
                        return;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
                    if (td != null) {

                }
import org.eclipse.swt.custom.CTabFolder;
                            changeConstraint(newConstraint, editPage);
            Button btnRemove = UIUtils.createDialogButton(buttonsPanel, DataEditorsMessages.virtual_structure_editor_dialog_button_remove, new SelectionAdapter() {
        return uk.isUseAllColumns() ? "*" : uk.getAttributes().stream().map(DBVEntityConstraintColumn::getAttributeName)
        TableItem item = new TableItem(fkTable, SWT.NONE);
        refTable.setLayoutData(new GridData(GridData.FILL_BOTH));
        parent.layout(true, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            Composite buttonsPanel = UIUtils.createComposite(group, 2);
                    }
        item.setImage(0, DBeaverIcons.getImage(DBIcon.TREE_UNIQUE_KEY));
        UIUtils.createControlLabel(group, DataEditorsMessages.virtual_structure_editor_columns_group_virtual);
    }
                    TableItem ukItem = ukTable.getSelection()[0];

        {
        if (refEntity != null) {
        keysComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
        columnsPage.createControl(group);
            refEntity = fk.getEntity();

            Button btnRemove = UIUtils.createDialogButton(buttonsPanel, DataEditorsMessages.virtual_structure_editor_dialog_button_remove, new SelectionAdapter() {
                createForeignKeyItem(refTable, fk, true);
        }
    }
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
/**
                    ukEditListener.widgetSelected(e);
    }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            if (transformSettings != null) {
                    }

                    if (co.getAttributeValues() != null) {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    @Override
            buttonsPanel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        }
                }
        if (uniqueConstraint == null) {

    public void setFocus() {
                if (registry != null) {

        TableItem item = new TableItem(ukTable, SWT.NONE);
        }

            DataEditorsMessages.virtual_structure_editor_info_label_entity_structure,


            Composite buttonsPanel = UIUtils.createComposite(group, 2);
            log.error("Error loading virtual unique keys", e);
    private void createReferencesPage(Composite parent) {
                            }
    private void createEditorUI() {
            refreshPart(this, true);
        } catch (Exception e) {
        this.vEntity = DBVUtils.getVirtualEntity(entity, true);
import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;
package org.jkiss.dbeaver.ui.editors.data;
    private Table ukTable;
                    try {
    }
            }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                @Override
        }

 * you may not use this file except in compliance with the License.
        try {
import org.eclipse.core.runtime.Status;
            });
                    ((Button)e.widget).setEnabled(false);
 *
                    DBVEntityConstraint virtualUK = (DBVEntityConstraint) ukTable.getSelection()[0].getData();
            @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
        gl.marginWidth = 5;
                            } else {
        fkTable.setLayoutData(new GridData(GridData.FILL_BOTH));

        refTable.setHeaderVisible(true);
                    vEntity.persistConfiguration();
import org.eclipse.swt.events.SelectionEvent;
                    		DataEditorsMessages.virtual_structure_editor_confirm_action_delete_key,
            }
    private EditDictionaryPage editDictionaryPage;
                    if (virtualFK != null) {
    public void handleDataSourceEvent(@NotNull DBPEvent event) {
            Button btnAdd = UIUtils.createDialogButton(buttonsPanel, DataEditorsMessages.virtual_structure_editor_dialog_button_add, new SelectionAdapter() {
                    }
            @Override


            CTabItem dictItem = new CTabItem(tabFolder, SWT.NONE);
        Control infoLabel = UIUtils.createInfoLabel(
                    vEntity.removeForeignKey(virtualFK);
                                        + "' in entity '" + vEntity.getName()
        fkTable = new Table(group, SWT.FULL_SELECTION | SWT.BORDER);
        UIUtils.createTableColumn(fkTable, SWT.LEFT, DataEditorsMessages.virtual_structure_editor_table_column_columns);
import org.jkiss.dbeaver.ui.controls.resultset.virtual.EditVirtualEntityDialog;
                public void widgetSelected(SelectionEvent e) {
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
        } else {
        createColumnsPage(keysComposite);
        this.parent.setFocus();
        ConComposite group = new ConComposite(parent);
                        NLS.bind(DataEditorsMessages.virtual_structure_editor_confirm_action_question_delete, virtualUK.getName()))) {
                    } catch (DBException e) {
        attrItem.setText(1, transformStr);
                        }

        refTable = new Table(group, SWT.FULL_SELECTION | SWT.BORDER);
    private Table fkTable;
import org.jkiss.dbeaver.model.struct.DBSEntity;
    private void createForeignKeyItem(Table fkTable, DBVEntityForeignKey fk, boolean ref) {
                    vEntity.removeConstraint(virtualUK);
    }
                    DBVEntityForeignKey virtualFK = (DBVEntityForeignKey) fkTable.getSelection()[0].getData();
 *
