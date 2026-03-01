            public void update(ViewerCell cell) {
                            items.add(attr.getName());

                                    attrMapping.setTargetName(name);
                                if (name.equalsIgnoreCase(attr.getName())) {
import org.jkiss.dbeaver.model.struct.DBSDataType;

            @Override
            mapping.getTargetName(),
            protected boolean canEdit(Object element) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                cell.setText(mapping.getTargetName());

    ColumnsMappingDialog(DatabaseConsumerSettings settings, DatabaseMappingContainer mapping) {
            public String getText(Object element) {
                    mappingViewer.getTable(),
            @Override
                    items.add(DatabaseMappingAttribute.TARGET_NAME_SKIP);
 *
 * See the License for the specific language governing permissions and
                    mappingViewer.refresh();
            protected void setValue(Object element, Object value) {
                    if ((container.getMappingType() == DatabaseMappingType.existing || container.getMappingType() == DatabaseMappingType.recreate) &&
                    }
                            container.getTarget() instanceof DBSEntity parentEntity) {
            DTUIMessages.columns_mapping_dialog_composite_label_text_target_entity,
            protected CellEditor getCellEditor(Object element) {
                        items.toArray(new String[0]),
                    if (element instanceof DatabaseMappingAttribute) {
    private final DatabaseConsumerSettings settings;
                    if (DatabaseMappingAttribute.TARGET_NAME_SKIP.equals(name)) {
            protected CellEditor getCellEditor(Object element) {
            @Override
                        Collection<String> dataTypes = dataSource.getSQLDialect().getDataTypes(dataSource);
                try {
                        try {

            @Override
    @Override
import org.eclipse.swt.widgets.Text;
            public void update(ViewerCell cell) {
 *
            }
        UIUtils.createLabelText(composite, DTUIMessages.columns_mapping_dialog_composite_label_text_source_container,
                types.put(targetType.toUpperCase(Locale.ROOT), targetType);
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        });
            SWT.LEFT,
import org.jkiss.dbeaver.ui.controls.CustomComboBoxCellEditor;
            }
                    cell.setImage(DBeaverIcons.getImage(mapping.getIcon()));
        gd.horizontalSpan = 2;
                } catch (DBException e) {
                DatabaseMappingAttribute attrMapping = (DatabaseMappingAttribute) element;
            @Override
        });
        ((GridData) sourceEntity.getLayoutData()).heightHint = UIUtils.getFontHeight(sourceEntity) * 3;
                DatabaseMappingAttribute attrMapping = (DatabaseMappingAttribute) element;
                            DBWorkbench.getPlatformUI().showError("Bad mapping", "Invalid column mapping", e1);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    cell.setBackground(UIUtils.getSharedTextColors().getColor(SharedTextColors.COLOR_WARNING));
                            return;
            @Override
        mappingViewer.setInput(attributeMappings);

                cell.setFont(BaseThemeSettings.instance.treeAndTableFontBold);
        columnController.addColumn(DTUIMessages.columns_mapping_dialog_column_target_type_text, null, SWT.LEFT, true, false, false, null, new ColumnLabelProvider() {
                    for (DBSDataType type : dataTypeProvider.getLocalDataTypes()) {
                        for (DBSEntityAttribute attr : CommonUtils.safeCollection(parentEntity.getAttributes(new VoidProgressMonitor()))) {
                        attribute.setMappingType(DatabaseMappingType.skip);
            @Override
                DatabaseMappingAttribute attrMapping = (DatabaseMappingAttribute) element;
import org.eclipse.jface.dialogs.DialogPage;

                    cell.setBackground(null);
            }
                } else {
                            for (DBSEntityAttribute attr : CommonUtils.safeCollection(parentEntity.getAttributes(new VoidProgressMonitor()))) {
        columnController.addColumn(DTUIMessages.columns_mapping_dialog_column_source_text, null, SWT.LEFT, true, false, new ColumnLabelProvider() {
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingContainer;
        mappingViewer.getTable().setLinesVisible(true);
            }
            protected Object getValue(Object element) {
            sourceDataSource == null ? "" : sourceDataSource.getContainer().getName(), SWT.BORDER | SWT.READ_ONLY);
                    java.util.List<String> items = new ArrayList<>();
            @Override
                return attrMapping.getMappingType() == DatabaseMappingType.create;
            public void keyReleased(KeyEvent e) {

        gd.widthHint = 600;
                };
import org.eclipse.swt.SWT;
                DBPDataTypeProvider dataTypeProvider = DBUtils.getParentOfType(DBPDataTypeProvider.class, container);
                    case skip -> DTUIMessages.columns_mapping_dialog_cell_text_skip;
import org.jkiss.dbeaver.ui.SharedTextColors;
        }, new EditingSupport(mappingViewer) {
                                }
            new CellLabelProvider() {
                        attrMapping.setTargetName(name);

                @Override
                    DatabaseMappingAttribute mapping = (DatabaseMappingAttribute) element;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        mappingViewer.setContentProvider(new ListContentProvider());

import org.eclipse.swt.events.KeyEvent;
                } finally {
import org.jkiss.dbeaver.model.DBPDataTypeProvider;
    private TableViewer mappingViewer;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                    }
                public void update(ViewerCell cell) {
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;

            }
import org.jkiss.dbeaver.ui.UIUtils;
        UIUtils.createLabelText(
                } else if (e.character == SWT.SPACE) {
 * limitations under the License.
                    for (TableItem item : mappingViewer.getTable().getSelection()) {
import org.jkiss.dbeaver.tools.transfer.database.DatabaseConsumerSettings;
                DatabaseMappingAttribute mapping = (DatabaseMappingAttribute) cell.getElement();
                                    return;
            SWT.BORDER | SWT.READ_ONLY
                }
                    default -> "?";
                    DatabaseMappingContainer container = mapping.getParent();
        });

 * You may obtain a copy of the License at
                DatabaseMappingAttribute mapping = (DatabaseMappingAttribute) element;
                        SWT.DROP_DOWN);
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            @Override
            });
                    case create -> DTUIMessages.columns_mapping_dialog_cell_text_new;

            composite,
import org.jkiss.dbeaver.ui.DBeaverIcons;
            false,

            protected Object getValue(Object element) {
                }
                    mappingViewer.refresh();

                if (dataTypeProvider != null) {
            @Override
                DBPDataSource dataSource = settings.getTargetDataSource(attrMapping);
                cell.setText(((DatabaseMappingAttribute) cell.getElement()).getSourceType());
                        } catch (DBException e1) {
/*
                try {
                    DatabaseMappingAttribute attrMapping = (DatabaseMappingAttribute) element;
import org.jkiss.dbeaver.DBException;
        columnController.addColumn(DTUIMessages.columns_mapping_dialog_column_type_text_mapping, null, SWT.LEFT, true, false, new ColumnLabelProvider() {
        this.settings = settings;
    public void createControl(Composite parent) {
                    }
                    }


                        DatabaseMappingAttribute attribute = (DatabaseMappingAttribute) item.getData();
                cell.setText(DBUtils.getObjectFullName(mapping.getSource(), DBPEvaluationContext.UI));
                    if (dataSource != null) {
        });
                    for (TableItem item : mappingViewer.getTable().getSelection()) {
                    case existing -> DTUIMessages.columns_mapping_dialog_cell_text_existing;
                        mappingViewer,
                if (mapping.getIcon() != null) {

        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
                    }
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingType;
                } catch (DBException e) {
                    }
import org.eclipse.swt.layout.GridLayout;
        });
                            for (String dataType : dataTypes) {

}
                attrMapping.setTargetType(CommonUtils.toString(value));
import java.util.*;
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
            }
import org.jkiss.dbeaver.model.struct.DBSEntity;
        gd.heightHint = 300;
import org.jkiss.dbeaver.model.DBUtils;
        columnController.addColumn(DTUIMessages.columns_mapping_dialog_column_target_text, null, SWT.LEFT, true, false, false, null, new ColumnLabelProvider() {
                        }

            (targetDataSource == null ? "?" : targetDataSource.getContainer().getName()),
import org.eclipse.swt.widgets.Composite;
                if (container != null) {
                    DBWorkbench.getPlatformUI().showError("Bad value", "Wrong target column", e);

            }
                        }
        columnController.addColumn(DTUIMessages.columns_mapping_dialog_column_source_type_text, null, SWT.LEFT, true, false, new ColumnLabelProvider() {
            }
        }, new EditingSupport(mappingViewer) {
        columnController.createColumns();
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
                return switch (mapping.getMappingType()) {
        Text sourceEntity = UIUtils.createLabelText(composite, DTUIMessages.columns_mapping_dialog_composite_label_text_source_entity, DBUtils.getObjectFullName(mapping.getSource(), DBPEvaluationContext.UI), SWT.BORDER | SWT.READ_ONLY | SWT.MULTI | SWT.V_SCROLL);
            public void update(ViewerCell cell) {
        this.mapping = mapping;
                        container.getTarget() instanceof DBSEntity parentEntity) {
        columnController.addColumn(
            }
                        if (!CommonUtils.isEmpty(dataTypes)) {
        );
                        types.put(type.getName().toUpperCase(Locale.ROOT), type.getName());
 * Unless required by applicable law or agreed to in writing, software
                if (e.character == SWT.DEL) {


            DTUIMessages.database_consumer_page_mapping_column_transformer_text,
                            cell.setText(transformer.getName());
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingAttribute;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    } else {
                        DatabaseMappingAttribute attribute = (DatabaseMappingAttribute) item.getData();
            true,
                }
                }
            @Override
                        }
            DTUIMessages.columns_mapping_dialog_composite_label_text_target_container,
        ((GridData) targetEntity.getLayoutData()).heightHint = UIUtils.getFontHeight(sourceEntity) * 3;
                    SWT.BORDER);
        Composite composite = new Composite(parent, SWT.NONE);
                        attrMapping.setMappingType(DatabaseMappingType.skip);
                    return new CustomComboBoxCellEditor(
        mappingViewer.getTable().setLayoutData(gd);
                return new CustomComboBoxCellEditor(
                        }
                        attribute.setMappingType(DatabaseMappingType.existing);
                }
            SWT.BORDER | SWT.READ_ONLY
            @Override
                                    attrMapping.setTarget(attr);
        );

import org.eclipse.swt.events.KeyAdapter;
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
                            attribute.updateMappingType(new VoidProgressMonitor(), false, false);
                DBSObjectContainer container = settings.getContainer();
                    mappingViewer,
    private final DatabaseMappingContainer mapping;
                DatabaseMappingAttribute attrMapping = (DatabaseMappingAttribute) cell.getElement();
            protected boolean canEdit(Object element) {
                if (mapping.getMappingType() == DatabaseMappingType.unspecified) {
 */
    private final Collection<DatabaseMappingAttribute> attributeMappings;
        attributeMappings = mapping.getAttributeMappings();
        mappingViewer.getTable().setHeaderVisible(true);
                cell.setText(attrMapping.getTargetType(dataSource, true));

            @Override
                DatabaseMappingAttribute mapping = (DatabaseMappingAttribute) cell.getElement();
                String targetType = attrMapping.getTargetType(settings.getTargetDataSource(attrMapping), true);
                            }

import org.eclipse.jface.viewers.*;
                    Object element = cell.getElement();
                    String name = CommonUtils.toString(value);
import org.jkiss.dbeaver.ui.BaseThemeSettings;
                    mappingViewer.refresh();
import org.eclipse.swt.layout.GridData;
                return attrMapping.getTargetType(settings.getTargetDataSource(attrMapping), true);
                }
                }
import org.jkiss.dbeaver.model.DBPDataSource;

            }

                Map<String, String> types = new TreeMap<>();
class ColumnsMappingDialog extends DialogPage {
        GridData gd = new GridData(GridData.FILL_BOTH);
    }
        });
        DBPDataSource targetDataSource = settings.getTargetDataSource(mapping);
                    DBPDataSource dataSource = container.getDataSource();
        mappingViewer.getTable().addKeyListener(new KeyAdapter() {
            composite,
        Text targetEntity = UIUtils.createLabelText(
 */
        composite.setLayout(new GridLayout(2, false));
import org.jkiss.utils.CommonUtils;
        setControl(composite);
package org.jkiss.dbeaver.tools.transfer.ui.pages.database;
            }
                        DataTransferAttributeTransformerDescriptor transformer = ((DatabaseMappingAttribute) element).getTransformer();
                    }
                DatabaseMappingAttribute attrMapping = (DatabaseMappingAttribute) element;
                    cell.setText("");
                                    attrMapping.setMappingType(DatabaseMappingType.existing);
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
                    types.values().toArray(new String[0]),
                    DBWorkbench.getPlatformUI().showError("Bad value", "Wrong target", e);
            @Override
        mappingViewer = new TableViewer(composite, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
                        mappingViewer.getTable(),
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferAttributeTransformerDescriptor;
            }
                    return null;
                                types.put(dataType.toUpperCase(Locale.ROOT), dataType);

                cell.setFont(BaseThemeSettings.instance.treeAndTableFontBold);
                        }
                }
                mappingViewer.refresh(element);
            protected void setValue(Object element, Object value) {
 * ColumnsMappingDialog
                return ((DatabaseMappingAttribute) element).getTargetName();
            }
 *
            DTUIMessages.database_consumer_page_mapping_column_transformer_tip,
                return true;
                        attrMapping.setMappingType(DatabaseMappingType.create);
        ((GridData) targetEntity.getLayoutData()).widthHint = 600;
        ((GridData) sourceEntity.getLayoutData()).widthHint = 600;
                        // Also add data types with aliases
                        if (transformer != null) {
import org.eclipse.swt.widgets.TableItem;
        final ViewerColumnController<?, ?> columnController = new ViewerColumnController<>(getClass().getName(), mappingViewer);
            public void update(ViewerCell cell) {
        DBPDataSource sourceDataSource = mapping.getSource().getDataSource();
                        DatabaseMappingContainer container = attrMapping.getParent();
/**
                        if ((container.getMappingType() == DatabaseMappingType.existing || container.getMappingType() == DatabaseMappingType.recreate) &&
                            }

