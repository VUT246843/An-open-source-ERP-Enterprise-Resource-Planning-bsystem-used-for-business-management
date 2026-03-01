                            monitor,

        }
                return;
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        // Do nothing
                );
                getSite().getRunnableContext().run(true, true, monitor -> {
            if (prevConnectionInfo == activeDataSource.getConnectionConfiguration()) {
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        if (layoutData == null) {
            hostPage.saveSettings(tempDataSource);

        }
import org.eclipse.swt.widgets.Composite;
                        }
                }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                            driverSubstitution);
 * limitations under the License.
            prevConnectionInfo = activeDataSource.getConnectionConfiguration();
                // ignore
            }
                String propName = CommonUtils.toString(entry.getKey());


                .createDataSource(
    @Override
        Composite linksComposite = UIUtils.createComposite(ph, 3);
import org.eclipse.swt.events.SelectionEvent;
            DBPDriverSubstitutionDescriptor driverSubstitution = activeDataSource.getDriverSubstitution();
            layoutData = new GridData(GridData.FILL_BOTH);
        }
import org.eclipse.swt.SWT;
 * See the License for the specific language governing permissions and
 */
        setTitle(UIConnectionMessages.dialog_setting_connection_driver_properties_title);
public class DriverPropertiesDialogPage extends ConnectionPageAbstract
            final DBPConnectionConfiguration tmpConnectionInfo = new DBPConnectionConfiguration();
            gd.grabExcessHorizontalSpace = true;
    }
                });
 *
        Object layoutData = propsControl.getTree().getLayoutData();

import org.eclipse.swt.events.SelectionAdapter;


        }
                        String url = site.getDriver().getPropertiesWebURL();
{
        propsControl = new ConnectionPropertiesControl(ph, SWT.NONE);
                            tmpConnectionInfo,
                        monitor.done();
        propsControl.createPropertiesToolBar(linksComposite);
            tmpConnectionInfo.getProperties().putAll(activeDataSource.getConnectionConfiguration().getProperties());
            } catch (InterruptedException e) {
        }
                    } finally {
            infoLabel.setLayoutData(gd);
            final DBPDataSourceContainer activeDataSource = site.getActiveDataSource();
                    tmpConnectionInfo
    {
    {
            final DataSourceDescriptor tempDataSource = site.getDataSourceRegistry()
            ph.setLayoutData(new GridData(GridData.FILL_BOTH));
        if (propertySource != null) {
    private ConnectionPageAbstract hostPage;
        }
import org.eclipse.swt.widgets.Link;
                netConfigLink.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.layout.GridLayout;
            }

        setControl(ph);
        if (layoutData instanceof GridData) {
import org.jkiss.dbeaver.ui.UIUtils;
        if (parent.getLayout() instanceof GridLayout) {
                    properties.put(propName, CommonUtils.toString(entry.getValue()));
            try {
                        if (CommonUtils.isEmpty(url)) {
        }
 * You may obtain a copy of the License at
            }
import org.eclipse.swt.widgets.Control;
                            getSite().getDriver(),
                    }

            if (propertySource != null) {

            infoLabel.setToolTipText(UIConnectionMessages.dialog_setting_connection_driver_properties_advanced_tip);
            Control infoLabel = UIUtils.createInfoLabel(linksComposite, UIConnectionMessages.dialog_setting_connection_driver_properties_advanced);
            ((GridData) layoutData).heightHint = 200;

    public boolean isComplete()
 */
package org.jkiss.dbeaver.ui.dialogs.connection;
import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
    public DriverPropertiesDialogPage(ConnectionPageAbstract hostPage)
    }
                    public void widgetSelected(SelectionEvent e) {
    public void setVisible(boolean visible) {
import java.lang.reflect.InvocationTargetException;
        }
    private DBPConnectionConfiguration prevConnectionInfo = null;
    @Override
    }
 * DriverPropertiesDialogPage
import org.jkiss.utils.CommonUtils;
                        UIUtils.openWebBrowser(url);
    {
    private ConnectionPropertiesControl propsControl;
        {
import org.eclipse.swt.layout.GridData;
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (!propName.isEmpty()) {
        setDescription(UIConnectionMessages.dialog_setting_connection_driver_properties_description);
 *
    private PropertySourceCustom propertySource;
 * you may not use this file except in compliance with the License.

                            url = site.getDriver().getWebURL();
                    monitor.beginTask("Loading driver properties", 1);

    @Override
        this.hostPage = hostPage;
/**
            }

    public void saveSettings(DBPDataSourceContainer dataSource) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
                    try {
import org.jkiss.dbeaver.model.connection.DBPDriverSubstitutionDescriptor;
 * Unless required by applicable law or agreed to in writing, software
            Link netConfigLink = new Link(linksComposite, SWT.NONE);
                    }
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            properties.clear();
        // Set props model
        if (propsControl != null) {
            final Map<String, String> properties = dataSource.getConnectionConfiguration().getProperties();
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        linksComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    activeDataSource.getId(),
            tempDataSource.dispose();

            for (Map.Entry<String, Object> entry : propertySource.getPropertyValues().entrySet()) {
        Composite ph = UIUtils.createPlaceholder(parent, 1);
            netConfigLink.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
                    @Override
 * DBeaver - Universal Database Manager
/*
    public void createControl(Composite parent)
        if (visible && propsControl != null) {
                    activeDataSource.getDriver(),
    {
                setErrorMessage(e.getTargetException().getMessage());
                });

    public void loadSettings()
            propsControl.saveEditorValues();
            if (!CommonUtils.isEmpty(site.getDriver().getWebURL())) {
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;

        return true;
                netConfigLink.setText("<a>" + UIConnectionMessages.dialog_setting_connection_driver_properties_docs_web_reference + "</a>");
                propsControl.loadProperties(propertySource);


        super.setVisible(visible);
    @Override
        {
 *
            } catch (InvocationTargetException e) {
                        propertySource = propsControl.makeProperties(
    }
