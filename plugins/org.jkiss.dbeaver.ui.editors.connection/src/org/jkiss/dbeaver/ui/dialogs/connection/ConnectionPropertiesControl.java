    }
    }
    }
    }
                createNewProperty(getCategoryNode(USER_PROPERTIES_CATEGORY), USER_PROPERTIES_CATEGORY);
                    null,
 * DBeaver - Universal Database Manager
            @Override

            getAllProperties(driver, true),
import org.jkiss.code.Nullable;
        customProperties = null;
        ToolBar toolBar = new ToolBar(parent, SWT.HORIZONTAL);
        removeItem.setImage(DBeaverIcons.getImage(UIIcon.ROW_DELETE));
        removeItem.setEnabled(false);
        String propName = CommonUtils.toString(property.getId()).toLowerCase(Locale.ENGLISH);
        }
        String propName = EnterNameDialog.chooseName(getControl().getShell(), UIConnectionMessages.controls_connection_properties_dialog_new_property_title);
        loadCustomProperties(driver, connectionProps);
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
        }
        setExpandSingleRoot(false);
    protected void contributeContextMenu(IMenuManager manager, final Object node, final String category, final DBPPropertyDescriptor property)
import org.eclipse.swt.widgets.ToolItem;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            if (property != null) {
    private static Comparator<DBPPropertyDescriptor> PROPERTIES_COMPARATOR = Comparator.comparing(DBPPropertyDescriptor::getDisplayName);
    }
        super(parent, style);
        });
        if (propName != null) {
    }
            }

/*
/**
                if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
import org.eclipse.swt.events.SelectionEvent;

import org.jkiss.dbeaver.Log;
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);

                    removeProperty(((IStructuredSelection) selection).getFirstElement());
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
    }
import org.eclipse.jface.action.Action;
                    propName,
import org.eclipse.jface.viewers.IStructuredSelection;
        }
                    String.class,
            }
                }
import org.jkiss.dbeaver.model.connection.DBPDriverSubstitutionDescriptor;
            return false;
    private List<DBPPropertyDescriptor> getAllProperties(DBPDriver driver, boolean includeCustom) {
        @NotNull DBPDriver driver,
import org.jkiss.utils.CommonUtils;
                driver.getDataSourceProvider().getConnectionProperties(monitor, driver, connectionInfo);
            driverProvidedProperties = new ArrayList<>();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull DBPConnectionConfiguration connectionInfo,
        try {
                    propName,
 * You may obtain a copy of the License at
                    null,
import org.jkiss.code.NotNull;
import java.util.*;

            manager.add(new Action(UIConnectionMessages.controls_connection_properties_action_add_property) {
    {
import org.jkiss.dbeaver.model.connection.DBPDriver;
            addProperty(node, new PropertyDescriptor(category, propName, propName, null, null, false, null, null, true), true);
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
                hasDelete = true;
    }
        @NotNull DBRProgressMonitor monitor,
        addSelectionChangedListener(event -> {

            removeItem.setEnabled(hasDelete);
        addItem.setImage(DBeaverIcons.getImage(UIIcon.ROW_ADD));
        setNewPropertiesAllowed(true);
    {
        driverProvidedProperties = null;
    private void loadCustomProperties(DBPDriver driver, Map<?, ?> properties)
        return new PropertySourceCustom(

 *
    }
            final DBPPropertyDescriptor[] connectionsProps =

    @Override
            }
import org.eclipse.swt.SWT;

        if (includeCustom && customProperties != null) {
        return propName.contains("password") || propName.contains("token");
 * Licensed under the Apache License, Version 2.0 (the "License");
                manager.add(new Action(UIConnectionMessages.controls_connection_properties_action_remove_property) {
        addItem.addSelectionListener(new SelectionAdapter() {
            propNames.add(CommonUtils.toString(prop.getId()));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            // for now, we do not support reading driver properties from substitution drivers
    private List<DBPPropertyDescriptor> customProperties;
        // Collect all driver (and all other) properties
 */
                    true));
public class ConnectionPropertiesControl extends PropertyTreeViewer {
            loadDriverProperties(monitor, driver, connectionInfo);
        for (DBPPropertyDescriptor prop : allProperties) {
    private void createNewProperty(Object node, String category) {
        // Ask user for new property name
        ToolItem addItem = new ToolItem(toolBar, SWT.NONE);

            if (connectionsProps != null) {
            getAllProperties(driver, true),
            // Check property name (must be unique
        Map<String, Object> connectionProps = new HashMap<>();

import org.eclipse.swt.widgets.Composite;
 */

        removeItem.setToolTipText("Remove user property");
                    }
        connectionProps.putAll(connectionInfo.getProperties());
        } catch (DBException e) {
    public ConnectionPropertiesControl(Composite parent, int style)
            properties);
    private void loadDriverProperties(DBRProgressMonitor monitor, DBPDriver driver, DBPConnectionConfiguration connectionInfo)
        removeItem.addSelectionListener(new SelectionAdapter() {
        toolBar.setLayoutData(gd);
        }

 *
import org.eclipse.swt.widgets.ToolBar;
            }
        customProperties = new ArrayList<>();
            public void widgetSelected(SelectionEvent e) {

import org.jkiss.dbeaver.ui.DBeaverIcons;

        ToolItem removeItem = new ToolItem(toolBar, SWT.NONE);
            @Override
                        removeProperty(node);
import org.eclipse.jface.viewers.ISelection;
            propertyDescriptors.addAll(driverProvidedProperties);
    ) {

        Set<String> propNames = new TreeSet<>();
    {
    public PropertySourceCustom makeProperties(DBPDriver driver, Map<String, ?> properties)
 * limitations under the License.
}
        driverProvidedProperties = null;
                });
        if (driverSubstitution == null) {

        if (driverProvidedProperties != null) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        if (dataType != null && !(String.class.isAssignableFrom(dataType))) {
            addItem.setEnabled(getCategoryNode(USER_PROPERTIES_CATEGORY) != null);
        }
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
        Class<?> dataType = property.getDataType();
import org.jkiss.dbeaver.ui.UIIcon;
    private static final Log log = Log.getLog(ConnectionPropertiesControl.class);
                @Override
            propertyDescriptors.addAll(customProperties);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            boolean hasDelete = false;
        List<DBPPropertyDescriptor> propertyDescriptors = new ArrayList<>();
                Collections.addAll(driverProvidedProperties, connectionsProps);
            final String propName = propId.toString();
        // Find prop values which are not from driver
            public void widgetSelected(SelectionEvent e) {

        return propertyDescriptors;
                    null,
    {
        propertyDescriptors.sort(PROPERTIES_COMPARATOR);
            log.warn("Can't load driver properties", e); //$NON-NLS-1$
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
    {
                    public void run() {
        });
                ISelection selection = getSelection();
        connectionProps.putAll(driver.getConnectionProperties());
            });
            connectionProps);
        boolean isCustom = USER_PROPERTIES_CATEGORY.equals(category);
    private List<DBPPropertyDescriptor> driverProvidedProperties;

                    false,
        for (Object propId : properties.keySet()) {
                    @Override
                customProperties.add(new PropertyDescriptor(
    PropertySourceCustom makeProperties(
                }
            if (USER_PROPERTIES_CATEGORY.equals(getSelectedCategory())) {
        addItem.setToolTipText("Add user property");

        }
            if (!propNames.contains(propName)) {
    protected String[] getCustomCategories()
 * distributed under the License is distributed on an "AS IS" BASIS,
        loadCustomProperties(driver, properties);
    @Override
    }
import org.eclipse.swt.layout.GridData;
    @Override
        customProperties = null;
            }

package org.jkiss.dbeaver.ui.dialogs.connection;
        if (isCustom) {
    void createPropertiesToolBar(Composite parent) {
                    USER_PROPERTIES_CATEGORY,
 * you may not use this file except in compliance with the License.
    }
        @Nullable DBPDriverSubstitutionDescriptor driverSubstitution
        }
        //setNamesEditable(true);
        }
        customProperties.sort(PROPERTIES_COMPARATOR);

import org.eclipse.swt.events.SelectionAdapter;


 *
 * See the License for the specific language governing permissions and
 * Connection properties control
        return new String[] { USER_PROPERTIES_CATEGORY };
                public void run() {

    private static final String USER_PROPERTIES_CATEGORY = UIConnectionMessages.controls_connection_properties_category_user_properties;
        return new PropertySourceCustom(
            }
    {
        List<DBPPropertyDescriptor> allProperties = getAllProperties(driver, false);

        });
import org.eclipse.jface.action.IMenuManager;
                    createNewProperty(node, category);
    protected boolean isHidePropertyValue(DBPPropertyDescriptor property) {
        }
