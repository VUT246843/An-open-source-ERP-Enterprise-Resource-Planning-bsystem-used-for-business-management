 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void setBinding(DBDAttributeBinding binding) {
    @Nullable
                                break;
            }

    @Nullable
//        // Value type may refer to leaf attribute (e.g. String) while value is an array
        return getBinding().getName();
    }
            } catch (DBException e) {
        }
            return DBUtils.findValueHandler(dataSource, valueType);
                    }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        this.cellLocation = cellLocation;
}
    }
//        if (value instanceof DBDCollection && valueType.getDataKind() != DBPDataKind.ARRAY) {

            // Update controls
            rowIndexes);
                        componentType = DBUtils.getLocalDataType(getBinding().getDataSource(), stringType);

                cellLocation.getAttribute(), cellLocation.getRow(), cellLocation.getRowIndexes(), value, updatePresentation);
    }
        if (updated && updatePresentation) {

                } else {
                            valueKind = DBPDataKind.ARRAY;
            DBSTypedObject valueType = getValueType();

            metaAttribute.getName());
                            }
import org.jkiss.dbeaver.ui.data.registry.ValueManagerRegistry;
            return controller.getModel().getCellValue(cellLocation);
                    if (dataType == null) {
    @Override

                    if (attributes != null && attributes.size() > index) {
import org.jkiss.dbeaver.Log;
        return valueType;
    public DBDValueHandler getValueHandler() {

    }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    @NotNull
    @Override
import org.jkiss.dbeaver.model.data.DBDRowIdentifier;

        UIUtils.asyncExec(() -> controller.setStatus(message, messageType));
 * You may obtain a copy of the License at
        DBSTypedObject valueType = getValueType();
            if (controller instanceof ResultSetViewer rsv) {
                    } else {
    }
                DBSDataType componentType = dataType.getComponentType(new VoidProgressMonitor());

        if (metaAttribute == null) {
            curRow,
        return cellLocation.getRowIndexes();
            metaAttribute = getBinding().getAttribute();
                if (dataType == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                        componentType = dataType.getComponentType(monitor);
import org.eclipse.ui.IWorkbenchPartSite;
import org.jkiss.dbeaver.ui.UIUtils;
    @NotNull
            return DefaultValueManager.INSTANCE;
        DBSAttributeBase valueType = getBinding().getPresentationAttribute();
    }
    public Object getValue() {
        this.editType = editType;
    }
        this.cellLocation = new ResultSetCellLocation(
                    DBSDataType componentType;
package org.jkiss.dbeaver.ui.controls.resultset;
                        DBPDataKind valueKind = DBPDataKind.STRING;
    }
    @Override
    }


import org.jkiss.dbeaver.model.DBPDataKind;
    @NotNull

                cellLocation.getAttribute(),

            context == null ? null : context.getDataSource().getContainer().getName(),

        DBDValueHandler valueHandler = getValueHandler();
        this.editType = editType;

                cellLocation.getRowIndexes(),
    @Override
    }
        @NotNull ResultSetCellLocation cellLocation,
import java.util.Collection;
        if (valueType == null) {
        return inlinePlaceholder;
        return null;
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;

/*
        return Arrays.asList(controller.getModel().getAttributes());

 *
        final DBCExecutionContext executionContext = getExecutionContext();
/**
            }

            executionContext == null ? null : executionContext.getDataSource(),
    }
import org.jkiss.dbeaver.DBException;
                }
        return this;
 */
            }
                        String stringType = DBUtils.getDefaultDataTypeName(getBinding().getDataSource(), valueKind);
            this.cellLocation.getRow(),
 * limitations under the License.
    }

    public void refreshEditor() {
 * DBeaver - Universal Database Manager
        try {
        boolean updated;

 * Copyright (C) 2010-2025 DBeaver Corp and others
                } else if (valueType.getDataKind() == DBPDataKind.STRUCT && dataType instanceof DBSEntity) {
import org.jkiss.code.Nullable;
                log.debug(e);
import org.eclipse.swt.widgets.Composite;
                    dataType = DBUtils.resolveDataType(monitor, getBinding().getDataSource(), getBinding().getFullTypeName());
    @Override
import org.jkiss.dbeaver.ui.data.IValueManager;
            }
            binding,
        if (cellLocation.getRowIndexes() != null) {
    }
        }
            updated = controller.updateCellValue(

    public String getColumnId() {
                    }*/
    @Nullable
        @NotNull IResultSetController controller,
                    }
                    final var attributes = ((DBSEntity) dataType).getAttributes(monitor);
 * Unless required by applicable law or agreed to in writing, software
            // Try to get type from value itself
        return valueHandler;
        DBSDataType dataType = DBUtils.getDataType(valueType);
    }

    public void updateValue(@Nullable Object value, boolean updatePresentation) {
    protected ResultSetCellLocation cellLocation;
        updateValue(value, true);
        } catch (Exception e) {
 * ResultSetValueController
    @Override
import org.jkiss.dbeaver.ui.data.managers.DefaultValueManager;
        }
        this.cellLocation = new ResultSetCellLocation(
    public void setCurRow(ResultSetRow curRow, int[] rowIndexes) {
    @Override
    @Override
                        }

                                valueHandler = DBUtils.findValueHandler(getBinding().getDataSource(), valueType);
            if (valueType != null && valueType.getDataKind() == DBPDataKind.ARRAY) {
            valueType,
        return editType;
    public IValueManager getValueManager() {
            if (value != null) {
    }
                        } else if (value instanceof Map<?, ?>) {
        return DBUtils.getSimpleQualifiedName(
        }
    public Object getAttributeValue(DBDAttributeBinding attribute) {
    @Override
import org.jkiss.dbeaver.ui.data.IDataController;
    @Override
        if (cellLocation.getRowIndexes() != null) {
                rsv.fireResultSetChange();
            });

                }
                        } else if (value instanceof Collection<?>) {
    }
                    // Array item value handler. Data type not recognized. Use String
            return dataKind != DBPDataKind.ARRAY && dataKind != DBPDataKind.STRUCT;
    private static final Log log = Log.getLog(ResultSetValueController.class);
            // in string format. This is read-only
                DBRProgressMonitor monitor = new VoidProgressMonitor();
    protected Composite inlinePlaceholder;
    public ResultSetValueController(
import org.jkiss.dbeaver.ui.data.IAttributeController;
                            valueKind = DBPDataKind.NUMERIC;
            DBPDataKind dataKind = getValueType().getDataKind();
        this.controller = controller;
                    if (getBinding().getDataSource() instanceof DBPDataTypeProvider dtp) {
    }
import org.jkiss.dbeaver.model.data.DBDValueHandler;
            return;
        Class<?> valueObjectType = valueHandler.getValueObjectType(valueType);
    }
        Object value = getValue();
        }
public class ResultSetValueController implements IAttributeController, IRowController {

        return controller.getModel().getCellValue(attribute, cellLocation.getRow());
    public DBDAttributeBinding getBinding() {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        }
    public boolean isReadOnly() {
    private static DBSDataType getComponentType(DBSTypedObject valueType) {
        if (READ_ARRAY_LEAF_ALWAYS) {
 */

        @NotNull EditType editType,
                // Seems to be an array item
            UIUtils.asyncExec(() -> {
    public void setEditType(EditType editType) {
        return controller;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        Object value = getValue();
    }
    public IRowController getRowController() {
    public EditType getEditType() {

    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;

    }
                    }
    public DBSTypedObject getValueType() {
 * See the License for the specific language governing permissions and
        controller.updatePanelsContent(true);
//            return new StructValueManager();
    protected final IResultSetController controller;
                DBSDataType dataType = DBUtils.getDataType(valueType);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.inlinePlaceholder = inlinePlaceholder;
import org.jkiss.dbeaver.model.data.DBDComplexValue;
            UIUtils.syncExec(() -> controller.updatePanelsContent(false));
    public Composite getEditPlaceholder() {
            metaAttribute instanceof DBCAttributeMetaData ? ((DBCAttributeMetaData) metaAttribute).getEntityName() : "",
//        } else if (value instanceof DBDComposite && valueType.getDataKind() != DBPDataKind.STRUCT) {
        }
    public DBCExecutionContext getExecutionContext() {
        return cellLocation.getAttribute();


import java.util.Map;
    public DBDRowIdentifier getRowIdentifier() {
                        valueHandler = DBUtils.findValueHandler(getBinding().getDataSource(), valueType);
            try {

    public ResultSetRow getCurRow() {
                    return componentType;
            try {
                            if (dt.getDataKind() == DBPDataKind.STRING) {
                        valueType = attributes.get(index);
                DBSDataType componentType = getComponentType(valueType);
                        valueType = componentType;

        return controller.getExecutionContext();
            boolean readLeafValue = valueType.getDataKind() != DBPDataKind.ARRAY;
        return ValueManagerRegistry.findValueManager(
    @Override
    }
        if (value instanceof DBDComplexValue) {
    public IWorkbenchPartSite getValueSite() {
    protected EditType editType;
                cellLocation.getRow(),
            }
        return controller.getAttributeReadOnlyStatus(getBinding(), true, false) != null;
                valueObjectType = value.getClass();
 *
                    final int index = cellLocation.getRowIndexes()[0];
import org.jkiss.dbeaver.model.DBPMessageType;
            return getBinding().getName();
    }
        DBSAttributeBase metaAttribute = getBinding().getMetaAttribute();
                DBWorkbench.getPlatformUI().showError("Value update", "Error updating value: " + e.getMessage(), e);
    public void setCellLocation(ResultSetCellLocation cellLocation) {
    @Override
                if (valueType.getDataKind() == DBPDataKind.ARRAY) {

            } catch (DBException e) {
                        // Data type is unknown. Component type is unknown. Guess from actual value
        this.cellLocation = cellLocation;
    }
    }
    }
//            return new ArrayValueManager();
                if (componentType != null) {

    @Override
import org.jkiss.dbeaver.model.DBPDataSource;
                        valueHandler = DBUtils.findValueHandler(getBinding().getDataSource(), valueType);
        }
    @Override
        }
        return cellLocation.getRow();
        DBDValueHandler valueHandler = getBinding().getValueHandler();
    private static final boolean READ_ARRAY_LEAF_ALWAYS = false;
    @NotNull
    public List<DBDAttributeBinding> getRowAttributes() {
        if (metaAttribute == null) {
    @Nullable
    public IDataController getDataController() {
    }
                DBWorkbench.getPlatformUI().showError("Data type resolve", "Error resolving component data type", e);

import org.jkiss.dbeaver.model.struct.DBSEntity;
                    /*
    @Override
                }
 * you may not use this file except in compliance with the License.
    public void updateSelectionValue(Object value) {
                    return componentType;
import java.util.List;
    @Nullable
                if (componentType != null) {
                readLeafValue);
        if (valueObjectType == Object.class) {


    @Override
        if (dataType != null) {
                                valueType = dt;
                        for (DBSDataType dt : dtp.getLocalDataTypes()) {

    }
        }
            this.cellLocation.getRowIndexes());
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
//        }
    @Override
    }

import org.jkiss.dbeaver.model.struct.DBSDataType;
                }
            DBSTypedObject valueType = getValueType();
    @Override
//        // Workaround for dynamic metadata
    public void showMessage(String message, DBPMessageType messageType) {
import org.jkiss.code.NotNull;
 *
            // Complex values with non complex data kind are usually for arrays preview
            return controller.getModel().getCellValue(
    public String getValueName() {
import org.jkiss.dbeaver.ui.data.IRowController;
        DBCExecutionContext context = getExecutionContext();
                        if (value instanceof Number) {
import java.util.Arrays;
            DBPDataSource dataSource = getDataController().getDataContainer().getDataSource();
        }
    @Override

        } else {
import org.jkiss.dbeaver.model.DBUtils;
                    if (componentType != null) {
        return controller.getSite();
    @NotNull
    public int[] getRowIndexes() {
                            valueKind = DBPDataKind.STRUCT;
                        }
        return getBinding().getRowIdentifier();
        if (cellLocation.getRowIndexes() != null) {
            cellLocation.getAttribute(),
 *     http://www.apache.org/licenses/LICENSE-2.0
            valueObjectType);

    }
        @Nullable Composite inlinePlaceholder) {
