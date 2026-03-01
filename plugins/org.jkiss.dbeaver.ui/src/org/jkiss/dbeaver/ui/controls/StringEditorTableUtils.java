
        for (TableItem item : table.getItems()) {

            parent,
    public static <T> Table createCustomEditableList(
import org.eclipse.swt.widgets.TableItem;
        @Nullable List<String> values,
        @Nullable IContentProposalProvider proposalProvider
public class StringEditorTableUtils {
        tableItem.setData(StringEditorTableFactory.CUSTOM_EDITABLE_LIST_VALUE_KEY, value);
        @NotNull Composite parent,

        @NotNull

                if (icon != null) {
    @NotNull
        @NotNull Composite parent,
        @NotNull String name,
                values.add(value);

    ) {
            values,
                setCustomValue(tableItem, value);
        Composite group = UIUtils.createTitledComposite(parent, name, 2, GridData.FILL_BOTH);
        return values;
        if (!CommonUtils.isEmpty(values)) {
    }
            valuesManager,
    /**
 * You may obtain a copy of the License at
 * limitations under the License.
            }
package org.jkiss.dbeaver.ui.controls;
import org.eclipse.swt.layout.GridData;
    @NotNull
}
        return (T) tableItem.getData(StringEditorTableFactory.CUSTOM_EDITABLE_LIST_VALUE_KEY);
        @NotNull String name,

import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.SWT;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Table;
        return stringEditorTableFactory.createTable();
    public static void replaceAllStringValues(@NotNull Table valueTable, @Nullable List<String> values, @Nullable DBPImage icon) {
            withReordering
    }
import org.eclipse.swt.widgets.Composite;

            }
            proposalProvider,
    private static <T> T getCustomValue(@NotNull TableItem tableItem) {
            values,
        @NotNull
    }
    public static List<String> collectStringValues(@NotNull Table table) {
import org.jkiss.code.Nullable;
     * Manager of the custom values handled by StringEditorTable
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPImage;
    }
    public static Table createEditableList(
    }
        @Nullable List<T> values,
        @Nullable

            false
        for (TableItem item : table.getItems()) {
            if (value != null) {
            values.add(value);

            for (String value : values) {
            proposalProvider,
            group,
        var stringEditorTableFactory = new StringEditorTableFactory<>(
import org.jkiss.dbeaver.ui.DBeaverIcons;
        @Nullable IContentProposalProvider proposalProvider,
 * DBeaver - Universal Database Manager
     */
import org.jkiss.code.NotNull;
import org.jkiss.utils.CommonUtils;

 *
    }
    @NotNull
        @NotNull TableValuesManager<T> valuesManager,
        }

import java.util.ArrayList;
            if (value.isEmpty()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                TableItem tableItem = new TableItem(valueTable, SWT.LEFT);
/*
    public static <T> List<T> collectCustomValues(@NotNull Table table) {
    }
    @NotNull
        String getString(@Nullable T value);

        valueTable.removeAll();
            new StringEditorTableFactory.StringValuesManager(icon),
        return createCustomEditableList(
 *
        @Nullable
        }

    public interface TableValuesManager<T> {
        );

 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
    @NotNull
        Boolean isEditable(@Nullable T value);
 *     http://www.apache.org/licenses/LICENSE-2.0
            T value = getCustomValue(item);
                continue;
        List<String> values = new ArrayList<>();

        );
 * Table with editable string rows
        DBPImage getIcon(@Nullable T value);
        return values;
 * you may not use this file except in compliance with the License.
        }
                tableItem.setText(value);

/**
 * Unless required by applicable law or agreed to in writing, software
        @Nullable DBPImage icon,
                    tableItem.setImage(DBeaverIcons.getImage(icon));
import java.util.List;
        List<T> values = new ArrayList<>(table.getItemCount());
        boolean withReordering
 */
                }
    }
            String value = item.getText().trim();
        T prepareNewValue(@Nullable T originalValue, @Nullable String string);
    private static <T> void setCustomValue(@NotNull TableItem tableItem, @NotNull T value) {
    ) {
            }

            name,
 * distributed under the License is distributed on an "AS IS" BASIS,
