            propViewer.loadProperties(infoItem);
        @Property(viewable = true, order = 1, category = "general")
 *
        private final DBDRowIdentifier rowIdentifier;
        public List<KeyColumnValue> getColumns()
 * Column info panel.
 * Unless required by applicable law or agreed to in writing, software
            this.value = value;

    protected void createPanel(IAttributeController valueController)
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
            propViewer = new PropertyTreeViewer(this, SWT.H_SCROLL | SWT.V_SCROLL);
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at

        private final IRowController rowController;
    }
        {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        {
    }
            return columns;
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
        getParent().layout();
 * See the License for the specific language governing permissions and
}

    }
        {
            for (DBDAttributeBinding binding : rowIdentifier.getAttributes()) {
        }
        }
        }
        super(parent, style);

/**
        {
        infoItem.collectProperties();
            return attribute.getName();
import org.jkiss.dbeaver.model.data.DBDRowIdentifier;
        public String toString()
            return rowIdentifier.getUniqueKey().getName();
        public String getName()
        }
        {
import org.jkiss.dbeaver.model.DBConstants;
import org.eclipse.swt.layout.FillLayout;
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull
import org.jkiss.code.NotNull;
import java.util.List;

import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
            this.createPanel((IAttributeController) valueController);
        public String getType()
        public CellKeyInfo(@NotNull IRowController rowController, @NotNull DBDRowIdentifier rowIdentifier) {
            List<DBDAttributeBinding> rowAttributes = rowController.getRowAttributes();
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static class CellKeyInfo implements DBPObject {
        }
    public void layoutProperties() {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.data.IValueController;
import org.jkiss.dbeaver.model.DBUtils;
        }
import org.jkiss.dbeaver.ui.data.IAttributeController;
        if (valueController instanceof IAttributeController) {
            infoItem.addProperty(
import org.jkiss.dbeaver.model.DBPNamedObject;
 * limitations under the License.
                columns.add(new KeyColumnValue(binding, rowController.getAttributeValue(binding)));
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class ColumnInfoPanel extends Composite {
        public String toString()
    }
            this.rowController = rowController;
 * you may not use this file except in compliance with the License.
            this.rowIdentifier = rowIdentifier;
            );
        {
            List<KeyColumnValue> columns = new ArrayList<>();
                DataEditorsMessages.controls_column_info_panel_property_key,
    }
        public KeyColumnValue(DBDAttributeBinding attribute, @Nullable Object value)
    public static class KeyColumnValue implements DBPNamedObject {
        }
        @Override
        if (rowIdentifier != null) {
        @NotNull
    private PropertyTreeViewer propViewer;

        PropertyCollector infoItem = new PropertyCollector(valueController.getBinding().getMetaAttribute(), false);
        }
 *
        valueController.getValueManager().contributeProperties(infoItem, valueController);
import java.util.ArrayList;
                "Key",
import org.eclipse.swt.SWT;
        }

            return DBUtils.isNullValue(value) ? DBConstants.NULL_VALUE_LABEL : value.toString(); //$NON-NLS-1$
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        @Property(viewable = true, order = 3, category = "columns")
            }

        this.setLayout(new FillLayout());

import org.eclipse.swt.widgets.Composite;
        @Override
        {
            return rowIdentifier.getKeyType();
        private Object value;
            this.attribute = attribute;
                null,
    public ColumnInfoPanel(Composite parent, int style, IValueController valueController) {
        {


        propViewer.repackColumns();

        }

            return "";//valueController.getRowIdentifier().getEntityIdentifier()
import org.jkiss.dbeaver.model.DBPObject;
 */

import org.jkiss.dbeaver.ui.data.IRowController;
        public String getName()
/*
package org.jkiss.dbeaver.ui.controls;
        private DBDAttributeBinding attribute;
        @Override
 *
    {
                new CellKeyInfo(valueController.getRowController(), rowIdentifier)
        DBDRowIdentifier rowIdentifier = valueController.getRowIdentifier();
import org.jkiss.dbeaver.model.meta.Property;


        @Property(viewable = true, order = 2, category = "general")
        @NotNull
