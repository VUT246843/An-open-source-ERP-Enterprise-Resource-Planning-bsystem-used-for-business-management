        UIUtils.asyncExec(() -> UIUtils.packColumns(confirmTable, true));
                        return ConfirmationDialog.PROMPT.equals(((ConfirmationWithStatus) element).status);
import org.eclipse.swt.widgets.Control;
            true,

                    return ConfirmationDialog.PROMPT.equals(((ConfirmationWithStatus) item).status);
                    return false;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                            changedConfirmations.put((confirmation).confirmation, ConfirmationDialog.ALWAYS);
                    return new CustomCheckboxCellEditor(tableViewer.getTable());
import org.jkiss.dbeaver.ui.DefaultViewerToolTipSupport;
                    if (element instanceof ConfirmationWithStatus) {
                    return !ConfirmationDialog.NEVER.equals(((ConfirmationWithStatus) item).status);
            CoreMessages.pref_page_confirmations_table_column_confirm_tip,
                    }
            composite,

                            changedConfirmations.put((confirmation).confirmation, ConfirmationDialog.PROMPT);
                return false;
                        }
    @Override
                protected Object getValue(Object element) {
                        } else if (!enabled) {
            // because we do not want to add the user's ability to ignore these confirmations
 */

        columnsController.addBooleanColumn(
            CoreMessages.pref_page_confirmations_table_column_confirmation,


    }
        ViewerColumnController<Object, Object> columnsController = new ViewerColumnController<>(
                if (item instanceof ConfirmationWithStatus) {


                    }
                }
    @Override
                @Override
    private TableViewer tableViewer;
import org.jkiss.dbeaver.ui.controls.CustomCheckboxCellEditor;
            .collect(Collectors.toList());
        }
public class PrefPageConfirmations extends AbstractPrefPage implements IWorkbenchPreferencePage {
                            return;
            true,
        confirmTable.setHeaderVisible(true);
    public void init(IWorkbench workbench)
                        ConfirmationWithStatus confirmation = (ConfirmationWithStatus) element;
                    return ((ConfirmationWithStatus) element).confirmation.getDescription();
                @Override
            String id = entry.getKey().getId();
                }
                        } else if (!enabled && !ConfirmationDialog.NEVER.equals(confirmation.status)) {
    private Map<ConfirmationDescriptor, String> changedConfirmations = new HashMap<>();
                    return ((ConfirmationWithStatus) element).confirmation.getTitle();
                            confirmation.status = ConfirmationDialog.NEVER;
    protected Control createPreferenceContent(@NotNull Composite parent) {
        });
                            confirmation.status = ConfirmationDialog.ALWAYS;

                    if (element instanceof ConfirmationWithStatus) {
        tableViewer.refresh();
            true,
                    if (element instanceof ConfirmationWithStatus) {
            true,

 */
import org.jkiss.dbeaver.registry.confirmation.ConfirmationDescriptor;

        columnsController.addColumn(
            .sorted(Comparator.comparing(ConfirmationDescriptor::getGroup))
import org.jkiss.dbeaver.utils.PrefUtils;
import org.eclipse.jface.viewers.EditingSupport;
                    // PROMPT and ALWAYS are true by default
                if (element instanceof ConfirmationWithStatus) {

            SWT.CENTER,
                }
                            // Something went wrong. We do not want to change confirm value if the "show dialog" is enabled.
            }, new EditingSupport(tableViewer) {
                        return !ConfirmationDialog.NEVER.equals(((ConfirmationWithStatus) element).status);
import org.jkiss.dbeaver.registry.confirmation.ConfirmationRegistry;
    private class ConfirmationWithStatus {
            true,
                        if (enabled && !ConfirmationDialog.PROMPT.equals(confirmation.status)) {
            }
                confirmation.status = ConfirmationDialog.PROMPT;
                            confirmation.status = ConfirmationDialog.ALWAYS;
        confirmTable = tableViewer.getTable();
                @Override
    protected void performDefaults() {
            if (!ConfirmationDialog.PROMPT.equals(confirmation.status)) {
            "PrefPageConfirmationsEditor", //$NON-NLS-1$
                    return false;
            SWT.BORDER | SWT.UNDERLINE_SINGLE | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
import org.jkiss.dbeaver.ui.controls.ListContentProvider;

 *     http://www.apache.org/licenses/LICENSE-2.0

                    }
            .filter(item -> CommonUtils.isNotEmpty(item.getToggleMessage()))
                @Override
        // All elements are true by default
            this.confirmations.add(new ConfirmationWithStatus(confirmation, getCurrentConfirmValue(confirmation.getId())));
                protected void setValue(Object element, Object value) {
                    return new CustomCheckboxCellEditor(tableViewer.getTable());
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }

import org.jkiss.dbeaver.core.CoreMessages;
                }
        return composite;
            SWT.LEFT,
    {
        }
            store.setValue(ConfirmationConstants.CONFIRM_PREF_KEY_PREFIX + id, entry.getValue());
        columnsController.addBooleanColumn(

        ConfirmationWithStatus(ConfirmationDescriptor confirmation, String status) {
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.confirmations"; //$NON-NLS-1$
 * You may obtain a copy of the License at
            SWT.CENTER,
            item -> {
}            }
import org.eclipse.swt.layout.GridData;

            }
            this.confirmation = confirmation;
        tableViewer.setContentProvider(new ListContentProvider());
        Collection<ConfirmationDescriptor> descriptors = ConfirmationRegistry.getInstance().getConfirmations().stream()
                }

                        if (enabled && !ConfirmationDialog.ALWAYS.equals(confirmation.status)) {
            return ConfirmationDialog.PROMPT;
import org.eclipse.jface.viewers.TableViewer;
                if (element instanceof ConfirmationWithStatus) {
import org.eclipse.ui.IWorkbench;
            @Override
            tableViewer);

                        if (ConfirmationDialog.PROMPT.equals(confirmation.status)) {
                        boolean enabled = CommonUtils.getBoolean(value, true);

        Composite composite = UIUtils.createPlaceholder(parent, 1);
        for (Map.Entry<ConfirmationDescriptor, String> entry : changedConfirmations.entrySet()) {
            CoreMessages.pref_page_confirmations_table_column_confirm,
    }
                protected void setValue(Object element, Object value) {
        private String status;
    }
                        }
            }


                }
 * See the License for the specific language governing permissions and
                if (item instanceof ConfirmationWithStatus) {
                            confirmation.status = ConfirmationDialog.PROMPT;
            @Override
            SWT.RIGHT,
                return super.getText(element);
            true,
                    if (element instanceof ConfirmationWithStatus) {

                protected Object getValue(Object element) {
        });
        // Better to ask in other cases
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            changedConfirmations.put((confirmation).confirmation, ConfirmationDialog.NEVER);
                @Override


                protected CellEditor getCellEditor(Object element) {
import org.eclipse.jface.viewers.ColumnLabelProvider;
                        boolean enabled = CommonUtils.getBoolean(value, true);
        columnsController.createColumns(false);
            // We do not want to see confirmation without a toggle message in the preferences
            CoreMessages.pref_page_confirmations_table_column_confirmation_tip,
    }
        }, new EditingSupport(tableViewer) {
                return super.getText(element);
import org.eclipse.jface.viewers.CellEditor;
    @Override
                    if (element instanceof ConfirmationWithStatus) {
    @NotNull
            CoreMessages.pref_page_confirmations_table_column_group,
 * DBeaver - Universal Database Manager
                if (element instanceof ConfirmationWithStatus) {
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
    @Override
                    }
            CoreMessages.pref_page_confirmations_table_column_value,
                    return true;
            true,
import java.util.stream.Collectors;


                        }
            return false;
            });
        for (ConfirmationWithStatus confirmation : confirmations) {
import java.util.*;
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
            CoreMessages.pref_page_confirmations_table_column_group,
        }
                        ConfirmationWithStatus confirmation = (ConfirmationWithStatus) element;
                @Override
import org.eclipse.swt.widgets.Table;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        columnsController.addColumn(
                }
/**
            new ColumnLabelProvider() {
                }
import org.eclipse.swt.SWT;
                    return ((ConfirmationWithStatus) element).confirmation.getGroup();

    private Table confirmTable;
import org.jkiss.code.NotNull;
                    return false;
                }
package org.jkiss.dbeaver.ui.preferences;
 *

        if (ConfirmationDialog.NEVER.equals(value) || ConfirmationDialog.ALWAYS.equals(value)) {
 *
            public String getToolTipText(Object element) {

                    }
        for (ConfirmationDescriptor confirmation : descriptors) {

    public boolean performOk() {
                protected boolean canEdit(Object element) {
        return super.performOk();
            true,
            public String getText(Object element) {
                }
        tableViewer.refresh();
 * limitations under the License.
                }
        UIUtils.asyncExec(() -> UIUtils.packColumns(confirmTable, true));
            CoreMessages.pref_page_confirmations_table_column_value_tip,
        confirmTable.setLayoutData(new GridData(GridData.FILL_BOTH));

    private String getCurrentConfirmValue(String id) {
            return value;
import org.eclipse.ui.IWorkbenchPreferencePage;
            item -> {
    private List<ConfirmationWithStatus> confirmations = new ArrayList<>();
                protected CellEditor getCellEditor(Object element) {
/*
            @Override
                            // Then set to default - ALWAYS - value.
import org.jkiss.dbeaver.ui.UIUtils;
        private ConfirmationDescriptor confirmation;
 *
                protected boolean canEdit(Object element) {

                            changedConfirmations.put((confirmation).confirmation, ConfirmationDialog.ALWAYS);
        String value = store.getString(ConfirmationConstants.CONFIRM_PREF_KEY_PREFIX + id);
        tableViewer.setInput(this.confirmations);

            new ColumnLabelProvider() {
                }
        new DefaultViewerToolTipSupport(tableViewer);

                }
 * PrefPageConfirmations
        tableViewer = new TableViewer(
            public String getText(Object element) {
        confirmTable.setLinesVisible(true);

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;

        PrefUtils.savePreferenceStore(store);
                return null;
import org.jkiss.dbeaver.registry.confirmation.ConfirmationConstants;
                changedConfirmations.put(confirmation.confirmation, ConfirmationDialog.PROMPT);
 * Licensed under the Apache License, Version 2.0 (the "License");
                        // Can't change this value if dialog showing is enabled to avoid mess.
    }
                @Override

        super.performDefaults();
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
 * Unless required by applicable law or agreed to in writing, software

                @Override
                        return !ConfirmationDialog.PROMPT.equals(((ConfirmationWithStatus) element).status);

            });
            this.status = status;

import org.eclipse.swt.widgets.Composite;
        if (CommonUtils.isEmpty(value)) {
        return ConfirmationDialog.PROMPT;
