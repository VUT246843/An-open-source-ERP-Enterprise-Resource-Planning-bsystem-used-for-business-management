        scheduleUpdateJob();
 * Unless required by applicable law or agreed to in writing, software
                selectedDebugPanel.createPanel(panelPlaceholder, this);
                    if (panel.isValid()) {
    @Override

    private Composite panelPlaceholder;
        } else {
        return DBeaverIcons.getImage(DBIcon.TREE_DATABASE);
    public String getName() {
        }
            }
import org.eclipse.swt.events.SelectionEvent;
        if (connectionCombo != null) {

        setDirty(true);
            UIUtils.createInfoLabel(panelPlaceholder, "Select a debug type to see debug configuration");
import org.eclipse.swt.widgets.Button;

        }
    }
            }
                selectedDebugPanel = debugPanel.createPanel();
                }
            if (dataSource != null) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    private DebugConfigurationPanelDescriptor selectedDebugType;
            }

                driverText.setText("");
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
            } catch (CoreException e) {
        super.setWarningMessage(message);
                loadConnectionDebugTypes();
        panelPlaceholder = UIUtils.createPlaceholder(composite, 1, 5);

            if (CommonUtils.isEmpty(panels)) {
 */
            DebugUtils.putContextInConfiguration(configuration, attrs);
        if (selectedDebugPanel != null) {
import java.util.HashMap;
        setControl(comp);
import org.jkiss.dbeaver.debug.ui.internal.DebugUIMessages;
    @Override

    @Override
                        typeSelector.setEnabled(false);
    static protected final Log log = Log.getLog(DatabaseDebugConfigurationTab.class);
                }
        PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), getHelpContextId());

    @Override
            selectedDebugPanel = null;
import java.util.List;
    }
            3,
 *
        if (selectedDebugType == debugPanel) {
        updateLaunchConfigurationDialog();

        return connectionCombo.getSelectedItem() != null && selectedDebugType != null;

    private Text driverText;
                    ((Button) c).setSelection(true);
        if (debugPanel != null) {
            composite,
            GridData.FILL_HORIZONTAL
                        selectedDebugPanel.loadConfiguration(dataSource, currentConfiguration.getAttributes());
                            }
                DBWorkbench.getPlatformUI().showError("Panel create error", "Can't create debugger config panel " + debugPanel.getId(), e);
                        setWarningMessage("Error loading panel configuration: " + e.getMessage());
    }
 *
        driverText = UIUtils.createLabelText(group, DebugUIMessages.DatabaseTab_driver_label_text, "", SWT.READ_ONLY);
        );
        return connectionCombo.getSelectedItem();
            setWarningMessage("Error loading debug configuration: " + e.getMessage());
    }
    protected void createPanelListGroup(Composite composite) {
        );
        } else {
                        typeSelector.setToolTipText(panel.getDescription());
import org.eclipse.swt.layout.GridLayout;
            @Override
        };
    @Override
                UIUtils.createInfoLabel(typesGroup, "Driver '" + dataSource.getDriver().getFullName() + "' doesn't support debugging");
import org.jkiss.dbeaver.runtime.RunnableContextDelegate;
            GridData.FILL_HORIZONTAL
import org.jkiss.dbeaver.ui.DBeaverIcons;
            if (dataSource != null) {
        }
    private ILaunchConfiguration currentConfiguration;

        try {
        for (DBPDataSourceContainer ds : DataSourceRegistry.getAllDataSources()) {
            loadConnectionDebugTypes();
    }
                setDirty(true);
        connectionCombo.addItem(null);
                        });
    }
    public void initializeFrom(ILaunchConfiguration configuration) {
        }


        this.currentConfiguration = configuration;
import org.eclipse.swt.widgets.Text;
    }
                if (dataSource != null && currentConfiguration != null) {
    private void setDebugType(DBPDataSourceContainer dataSource, DebugConfigurationPanelDescriptor debugPanel) {
            DBPDataSourceContainer dataSource = null;

                selectedDebugType = debugPanel;
        }

    public void setWarningMessage(String message) {
    }
import org.jkiss.dbeaver.debug.core.DebugUtils;


                                    setDebugType(connectionCombo.getSelectedItem(), (DebugConfigurationPanelDescriptor) typeSelector.getData());
import org.jkiss.utils.CommonUtils;
        configuration.setAttribute(DBGConstants.ATTR_DEBUG_TYPE, selectedDebugType == null ? null : selectedDebugType.getId());
        setDebugType(dataSource, null);


import org.eclipse.swt.layout.GridData;
                        typeSelector.addSelectionListener(new SelectionAdapter() {
        } else {
        }
                    setWarningMessage("Debug type '" + typeId + "' cannot be resolved");
import org.eclipse.debug.core.ILaunchConfiguration;
    }
            composite,
                if (savedPanel == null) {
    private void loadConnectionDebugTypes() {
        configuration.setAttribute(DBGConstants.ATTR_DATASOURCE_ID, dataSource == null ? null : dataSource.getId());
                            @Override
public class DatabaseDebugConfigurationTab extends AbstractLaunchConfigurationTab implements DBGConfigurationPanelContainer {
            }
                    } catch (CoreException e) {
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
            }
                driverText.setText(dataSource.getDriver().getFullName());

                    typeSelector.setText(panel.getName());

                            public void widgetSelected(SelectionEvent e) {
            selectedDebugPanel.saveConfiguration(dataSource, attrs);
                }

import org.jkiss.dbeaver.debug.DBGConstants;
    public boolean canSave() {
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
                for (DebugConfigurationPanelDescriptor panel : panels) {

        loadConnectionDebugTypes();

            connectionCombo.addItem(ds);
    public void updateDialogState() {
        }
        if (selectedDebugType == null) {
            } catch (DBException e) {
                selectedDebugType = null;
            Map<String, Object> attrs = new HashMap<>();
        Composite comp = new Composite(parent, SWT.NONE);
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.eclipse.ui.PlatformUI;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
            DBPDataSourceContainer dataSource = connectionCombo.getSelectedItem();
            connectionCombo.select(dataSource);
            return;

                updateLaunchConfigurationDialog();
    }
    }
            } else {
                                    typesGroup.getParent().layout(true, true);
import org.jkiss.dbeaver.debug.ui.internal.DebugConfigurationPanelDescriptor;
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
            UIUtils.createInfoLabel(typesGroup, "Select a connection to see available debug types");
        typesGroup.getParent().layout(true, true);
            selectedDebugType = null;
            DebugUIMessages.DatabaseTab_debug_type_group_text,
                                }
}
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private Composite typesGroup;
                    try {
            }
import org.jkiss.dbeaver.DBException;
                                    setDirty(true);
    }
        comp.setLayout(new GridLayout(1, true));
                    if (!CommonUtils.isEmpty(panel.getDescription())) {
        DBPDataSourceContainer dataSource = connectionCombo.getSelectedItem();
    private DBGConfigurationPanel selectedDebugPanel;
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
                String driverName = dataSource == null ? "" : dataSource.getDriver().getFullName();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Control;
            c.dispose();
import org.jkiss.dbeaver.model.DBIcon;
            try {

        for (Control c : panelPlaceholder.getChildren()) {
            DebugUIMessages.DatabaseTab_connection_group_text,
/*
                }
import org.eclipse.swt.events.SelectionAdapter;
 *
        }
import org.jkiss.dbeaver.Log;
    }
import org.eclipse.core.runtime.CoreException;
            }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.controls.SelectDataSourceCombo;
import org.eclipse.swt.widgets.Composite;
    protected void createComponents(Composite comp) {
        } catch (CoreException e) {
    @Override
                    } else {
import org.eclipse.swt.graphics.Image;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return DBeaverIcons.getImage(dataSource.getDriver().getIcon());
            4,
                savedPanel = DebugConfigurationPanelRegistry.getInstance().getPanel(typeId);
 * You may obtain a copy of the License at
                    break;

    @Override
        comp.setFont(parent.getFont());
        connectionCombo = new SelectDataSourceCombo(group) {
            }
        return DebugUIMessages.DatabaseTab_name;
    public boolean isValid(ILaunchConfiguration launchConfig) {
    }

                    }
            String typeId = configuration.getAttribute(DBGConstants.ATTR_DEBUG_TYPE, (String) null);
    }
package org.jkiss.dbeaver.debug.ui;
        return new RunnableContextDelegate(getLaunchConfigurationDialog());
                if (c instanceof Button && c.getData() == debugPanel) {
        createComponents(comp);
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.ui.UIUtils;
        for (Control c : typesGroup.getChildren()) {
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
    }
            if (typeId != null) {
            for (Control c : typesGroup.getChildren()) {
                    }

                    }
    public DBRRunnableContext getRunnableContext() {
                log.debug(e);
    @Override
            List<DebugConfigurationPanelDescriptor> panels = DebugConfigurationPanelRegistry.getInstance().getPanels(dataSource);

    private SelectDataSourceCombo connectionCombo;

import org.jkiss.dbeaver.runtime.DBWorkbench;
                    Button typeSelector = new Button(typesGroup, SWT.RADIO);
        }
        createPanelListGroup(comp);
    @Override
    }
        return connectionCombo.getSelectedItem() != null && selectedDebugType != null && selectedDebugPanel.isValid();
import org.jkiss.dbeaver.registry.DataSourceRegistry;
            setDebugType(dataSource, savedPanel);
        DBPDataSourceContainer dataSource = connectionCombo.getSelectedItem();
    public void createControl(Composite parent) {
    public DBPDataSourceContainer getDataSource() {
import org.jkiss.dbeaver.debug.ui.internal.DebugConfigurationPanelRegistry;
            protected void onDataSourceChange(DBPDataSourceContainer dataSource) {
                    typeSelector.setData(panel);
                selectedDebugPanel = null;
        Composite group = UIUtils.createTitledComposite(
            try {
    public Image getImage() {
    @Override
        typesGroup = UIUtils.createTitledComposite(
                                if (typeSelector.getSelection()) {
    protected void createConnectionSettingsGroup(Composite composite) {
            DebugConfigurationPanelDescriptor savedPanel = null;
        UIUtils.createControlLabel(group, DebugUIMessages.DatabaseTab_datasource_label_text);
            } else {
 * limitations under the License.

            c.dispose();

                dataSource = DebugUtils.getDataSourceContainer(configuration);
                driverText.setText(driverName);
        if (dataSource == null) {
    @Override
        createConnectionSettingsGroup(comp);
