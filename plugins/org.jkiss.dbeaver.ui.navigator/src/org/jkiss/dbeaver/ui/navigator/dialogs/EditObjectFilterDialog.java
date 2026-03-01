                sfNames.add(sf.getName());
                    close();
            globalLink.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        } else {
            namesCombo.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e) {
        super.cancelPressed();
            });
 * DBeaver - Universal Database Manager
/*
        super(shell, IHelpContextIds.CTX_EDIT_OBJECT_FILTERS);
        {
    private DBSObjectFilter filter;
            DBSObjectFilter savedFilter = dsRegistry.getSavedFilter(filterName);
            });
        if (!CommonUtils.isEmpty(filter.getName())) {

 * limitations under the License.
            }
        filter.setName(namesCombo.getText());
        blockControl = UIUtils.createPlaceholder(composite, 1);
                StringEditorTableUtils.replaceAllStringValues(includeTable, savedFilter.getInclude(), null);
        if (filter.isEnabled()) {
    }
    @Override
            );
        filter.setExclude(StringEditorTableUtils.collectStringValues(excludeTable));
    }
                UINavigatorMessages.dialog_filter_save_label,
    }

                blockEnableState = null;
                }

            List<String> sfNames = new ArrayList<>();


        }

 * Object filter edit dialog
            if (savedFilter != null) {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        enableFiltersContent();
                }
        getShell().setText(NLS.bind(UINavigatorMessages.dialog_filter_title, objectTitle));
        if (CommonUtils.isEmpty(filterName)) {
            for (DBSObjectFilter sf : dsRegistry.getSavedFilters()) {
public class EditObjectFilterDialog extends HelpEnabledDialog {
        this.objectTitle = objectTitle;

        if (CommonUtils.equalObjects(filterName, filter.getName())) {
 * Unless required by applicable law or agreed to in writing, software
        super.okPressed();
            Collections.sort(sfNames);
        return filter;
                enableFiltersContent();
        Composite topPanel = UIUtils.createPlaceholder(composite, globalFilter ? 1 : 2);
import org.eclipse.swt.events.SelectionEvent;
            namesCombo.add(NULL_FILTER_NAME);

import org.jkiss.dbeaver.ui.dialogs.HelpEnabledDialog;
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBSObjectFilter getFilter() {
    }
            });
    }
            Link globalLink = UIUtils.createLink(topPanel, UINavigatorMessages.dialog_filter_global_link, new SelectionAdapter() {
import org.eclipse.swt.layout.GridData;

            dsRegistry.updateSavedFilter(filter);
    private void changeSavedFilter() {

                blockEnableState.restore();
        }
            });

                GridData.FILL_HORIZONTAL

    }
 */
        saveConfigurations();
import org.eclipse.jface.dialogs.ControlEnableState;
            StringEditorTableUtils.replaceAllStringValues(includeTable, null, null);
            public void widgetSelected(SelectionEvent e) {
    public EditObjectFilterDialog(Shell shell, DBPDataSourceRegistry dsRegistry, String objectTitle, DBSObjectFilter filter, boolean globalFilter) {
                    namesCombo.remove(namesCombo.getText());
import java.util.Collections;
            if (blockEnableState != null) {
                    setReturnCode(SHOW_GLOBAL_FILTERS_ID);
        }
import java.util.List;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        blockControlGd.heightHint = 350;

import org.jkiss.dbeaver.ui.UIUtils;
                @Override
                namesCombo.add(sfName);
                composite,
import org.eclipse.osgi.util.NLS;
                public void widgetSelected(SelectionEvent e) {
        excludeTable = StringEditorTableUtils.createEditableList(
 * See the License for the specific language governing permissions and
                @Override

import java.util.ArrayList;

            }

    }
                    dsRegistry.removeSavedFilter(namesCombo.getText());
            blockControl, UINavigatorMessages.dialog_filter_list_exclude,
import org.eclipse.swt.widgets.*;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.SWT;
        filter.setEnabled(enableButton.getSelection());
                public void widgetSelected(SelectionEvent e) {
    private Combo namesCombo;
import org.jkiss.dbeaver.ui.IHelpContextIds;
        );
    }
                    changeSavedFilter();
        this.globalFilter = globalFilter;
        includeTable = StringEditorTableUtils.createEditableList(
            @Override
import org.jkiss.dbeaver.ui.internal.UIMessages;
            saveButton.addSelectionListener(new SelectionAdapter() {
        }
import org.jkiss.dbeaver.ui.controls.StringEditorTableUtils;
    private final DBPDataSourceRegistry dsRegistry;

            Composite sfGroup = UIUtils.createTitledComposite(
 *
        UIUtils.createInfoLabel(blockControl, UINavigatorMessages.dialog_filter_objects_scope_hint_text);
            }
            Button removeButton = UIUtils.createPushButton(sfGroup, UINavigatorMessages.dialog_filter_remove_button, null);
        } else if (blockEnableState == null) {
            removeButton.addSelectionListener(new SelectionAdapter() {
    private String objectTitle;
        }
        );
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
    public static final int SHOW_GLOBAL_FILTERS_ID = 1000;

                }
    protected void okPressed() {
 *
            blockControl, UINavigatorMessages.dialog_filter_list_include,

    private Table excludeTable;
        });
            namesCombo.setText(CommonUtils.notEmpty(filter.getName()));
                    saveConfigurations();
import org.eclipse.swt.events.SelectionAdapter;
        this.dsRegistry = dsRegistry;
        enableButton.addSelectionListener(new SelectionAdapter() {

        filter.setName(filterName);
        enableButton = UIUtils.createCheckbox(topPanel, UIMessages.button_enable, false);
}
                    namesCombo.add(namesCombo.getText());
            blockEnableState = ControlEnableState.disable(blockControl);
        GridData blockControlGd = new GridData(GridData.FILL_BOTH);
    private static final String NULL_FILTER_NAME = "";
            StringEditorTableUtils.replaceAllStringValues(excludeTable, null, null);
        enableButton.setSelection(filter.isEnabled());
    private void enableFiltersContent() {
                StringEditorTableUtils.replaceAllStringValues(excludeTable, savedFilter.getExclude(), null);
        String filterName = namesCombo.getText();
    @Override
import org.jkiss.utils.CommonUtils;
    private Table includeTable;
    protected Composite createDialogArea(Composite parent) {
            for (String sfName : sfNames) {
        enableButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

                4,
        topPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    namesCombo.setText(NULL_FILTER_NAME);
            // Find saved filter
    protected void cancelPressed() {
        Composite composite = super.createDialogArea(parent);
        //getShell().setImage(DBIcon.EVENT.getImage());
    private Button enableButton;
 *
                }
                public void widgetSelected(SelectionEvent e) {
        if (!globalFilter) {
            return;
            filter.getExclude(), null, null
    private boolean globalFilter;
        }
            // Reset filter
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            namesCombo = UIUtils.createLabelCombo(sfGroup, UINavigatorMessages.dialog_filter_name_label, SWT.DROP_DOWN);
            }
    private ControlEnableState blockEnableState;

            Button saveButton = UIUtils.createPushButton(sfGroup, UINavigatorMessages.dialog_filter_save_button, null);
            filter.getInclude(), null, null
        blockControl.setLayoutData(blockControlGd);
        this.filter = new DBSObjectFilter(filter);
 * You may obtain a copy of the License at
            namesCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    private void saveConfigurations() {
        filter.setInclude(StringEditorTableUtils.collectStringValues(includeTable));
        return composite;
                @Override
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
                filter.setEnabled(enableButton.getSelection());
package org.jkiss.dbeaver.ui.navigator.dialogs;

    private Composite blockControl;
 */
 * you may not use this file except in compliance with the License.
        UIUtils.createInfoLabel(blockControl, UINavigatorMessages.dialog_filter_hint_text);
                @Override
    @Override
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
