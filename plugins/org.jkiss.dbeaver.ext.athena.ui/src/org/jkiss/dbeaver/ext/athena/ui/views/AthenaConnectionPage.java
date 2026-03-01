        };
                                DBWorkbench.getPlatformUI().showMessageBox("Cloud support required", "Project file system node not found", true);
    public void createControl(Composite composite) {
                                        }
            DBWorkbench.getPlatformUI().showError("Error opening file system", "Error while opening S3 file system", e);
                                if (selectedObjects.size() == 1) {
            UIUtils.setDefaultTextControlWidthHint(s3LocationText);
                if (CommonUtils.isEmpty(databaseName)) {
                }
import org.eclipse.jface.resource.ImageDescriptor;
                                @Override
    }
import java.net.URISyntaxException;
            for (AWSRegion region : AWSRegion.values()) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            Composite s3Group = UIUtils.createComposite(addrGroup, 1);
                                    if (s3Node instanceof DBNPathBase) {

                settingsGroup,
    public void saveSettings(DBPDataSourceContainer dataSource) {
            );
    }
            s3LocationText.setToolTipText(AthenaMessages.label_s3_output_location);
            UIUtils.createControlLabel(addrGroup, AthenaMessages.label_s3_location); //$NON-NLS-2$ //$NON-NLS-1$ //$NON-NLS-1$ //$NON-NLS-1$
        createDriverPanel(settingsGroup);
            UIUtils.setDefaultTextControlWidthHint(awsRegionCombo);

                            };
    private DBNNode findFileSystemNode(DBNFileSystems fsRootNode, String s3Path) {

                CommonUtils.getBoolean(connectionInfo.getProviderProperty(AthenaConstants.PROP_SHOW_CATALOGS))
    private String[] getAvailableVariables() {
                                        Files.isDirectory(((DBNPathBase) node).getPath());
                    });
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                                }
        }
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return new IDialogPage[]{
 * Licensed under the Apache License, Version 2.0 (the "License");
            super.isComplete();
                awsRegionCombo.setText(AWSRegion.us_west_1.getId());
        if (showCatalogsCheck != null) {
        {
    @Override
                awsRegionCombo.setText(connectionInfo.getServerName());
    }
                                            } catch (URISyntaxException ex) {
            awsRegionCombo.addModifyListener(textListener);

                                        }
        // Load values from new connection info

            return null;
    public boolean isComplete() {
                AthenaMessages.label_connection,

import java.util.Arrays;
                ((GridLayout) s3Group.getLayout()).numColumns++;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.nio.file.Files;
            connectionInfo.setProviderProperty(AthenaConstants.DRIVER_PROP_S3_OUTPUT_LOCATION, s3LocationText.getText().trim());
                            if (fsRootNode == null) {
            awsRegionCombo = UIUtils.createLabelCombo(addrGroup, AthenaMessages.label_region, SWT.DROP_DOWN);
/*
                                        if (newS3Path.startsWith("s3:/")) {
public class AthenaConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
import org.jkiss.dbeaver.ui.navigator.dialogs.ObjectBrowserDialogBase;
    @Override

                            }
import org.jkiss.dbeaver.ext.athena.model.AWSRegion;
 * Unless required by applicable law or agreed to in writing, software
                                        String newS3Path = ((DBNPathBase) s3Node).getPath().toString();

import org.jkiss.dbeaver.ui.UIIcon;
            }
        setControl(settingsGroup);
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystems;
                    new SelectionAdapter() {
            return DBWorkbench.getPlatformUI().runWithProgress(monitor ->

        if (s3LocationText != null) {
            connectionInfo.setDatabaseName(s3LocationText.getText().trim());
import org.jkiss.dbeaver.registry.fs.FileSystemProviderRegistry;
import org.eclipse.swt.events.SelectionEvent;

                                s3LocationText.getShell(), "S3 browser",
                                }
                "Show catalogs",
    }
    public void loadSettings() {
    private Combo awsRegionCombo;
            driverPropsPage
        return Arrays.stream(DBPConnectionConfiguration.INTERNAL_CONNECT_VARIABLES).map(x -> x[0]).toArray(String[]::new);
                    UIConnectionMessages.controls_client_home_selector_browse,
        }
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
    @Override

        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
            connectionInfo.setProviderProperty(AthenaConstants.PROP_SHOW_CATALOGS, String.valueOf(showCatalogsCheck.getSelection()));

                                            try {
                            if (!CommonUtils.isEmpty(oldS3Path) && oldS3Path.startsWith("s3:/")) {
        super.saveSettings(dataSource);
                UIUtils.createPushButton(
                                    }
                                List<DBNNode> selectedObjects = dialog.getSelectedObjects();
 * You may obtain a copy of the License at
                        }
 * you may not use this file except in compliance with the License.
                                                URI patchedURI = new URI(uri.getScheme(), null, null, 0, uri.getPath(), uri.getQuery(), null);
                                return;
            s3LocationText = new Text(s3Group, SWT.BORDER);
        }
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
        settingsGroup.setLayout(new GridLayout(1, false));
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            showCatalogsCheck.setSelection(
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.ext.athena.model.AthenaConstants;
                            DBNFileSystems fsRootNode = projectNode.getExtraNode(DBNFileSystems.class);
        if (showCatalogsCheck != null) {
import org.eclipse.swt.widgets.Combo;
                databaseName = connectionInfo.getProviderProperty(AthenaConstants.DRIVER_PROP_S3_OUTPUT_LOCATION);
            UIUtils.addVariablesToControl(s3LocationText, getAvailableVariables(), "S3 location pattern");
                        @Override
                            }
import org.eclipse.swt.SWT;
            s3Group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 */

/**
    }
    private Button showCatalogsCheck;
        }
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystem;
                                    return new ViewerFilter() {
 * Copyright (C) 2010-2026 DBeaver Corp and others
                2,
    @NotNull

        if (s3LocationText != null) {
        super.loadSettings();
                                protected boolean matchesResultNode(DBNNode node) {
                    DBeaverIcons.getImage(UIIcon.OPEN),
                "To show multiple data catalogs with Athena (for example, when using an external Hive metastore or federated queries)", false, 2);
import org.jkiss.utils.CommonUtils;
    private Text s3LocationText;
 * AthenaConnectionPage
 * limitations under the License.

                                    };

import java.util.List;
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ext.athena.ui.views;
 */
    @Override
            s3LocationText != null && !CommonUtils.isEmpty(s3LocationText.getText()) &&
            s3LocationText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.model.navigator.DBNProject;
        createAuthPanel(settingsGroup, 1);
        ModifyListener textListener = e -> site.updateButtons();
    public void dispose() {
import org.jkiss.dbeaver.ext.athena.ui.AthenaActivator;
                    databaseName = "s3://aws-athena-query-results-"; //$NON-NLS-1$
                                selectedNode = findFileSystemNode(fsRootNode, oldS3Path);

 *
import org.eclipse.swt.widgets.Text;
import org.jkiss.dbeaver.ext.athena.ui.internal.AthenaMessages;
import java.net.URI;
                                            }
import org.eclipse.swt.layout.GridData;
            }
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
                            ) {
        try {
                                @Override
            if (!CommonUtils.isEmpty(connectionInfo.getServerName())) {
import org.eclipse.jface.viewers.ViewerFilter;
                                }
                                    DBNNode s3Node = selectedObjects.get(0);
        Composite settingsGroup = new Composite(composite, SWT.NONE);

                                                DBWorkbench.getPlatformUI().showError("Bad URI", "Bad URI '" + newS3Path + "'", ex);
        return awsRegionCombo != null && !CommonUtils.isEmpty(awsRegionCombo.getText()) &&
                fsRootNode.findNodeByPath(monitor, s3Path, true));

    public AthenaConnectionPage() {
import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;

    }
        settingsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                                    return node instanceof DBNPathBase &&
            }
 *
                        public void widgetSelected(SelectionEvent e) {
            s3LocationText.addModifyListener(textListener);
                            ObjectBrowserDialogBase dialog = new ObjectBrowserDialogBase(

                            String oldS3Path = s3LocationText.getText();
                                                s3LocationText.setText(patchedURI.toString());
    }


        }
                                        public boolean select(Viewer viewer, Object parentElement, Object element) {
            if (CommonUtils.isEmpty(databaseName)) {
                                CommonUtils.singletonOrEmpty(selectedNode),

                                            return
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
import org.eclipse.swt.layout.GridLayout;
            if (FileSystemProviderRegistry.getInstance().getProvider("aws-s3") != null) {
            String databaseName = connectionInfo.getDatabaseName();
                    s3Group,
        }

 * DBeaver - Universal Database Manager
import org.eclipse.swt.events.ModifyListener;

                                protected ViewerFilter createViewerFilter() {
                                fsRootNode,
                                true
        }
            if (awsRegionCombo.getText().isEmpty()) {
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (awsRegionCombo != null) {
        } catch (Exception e) {
            }
                                                URI uri = new URI(newS3Path);
                            }
        super.dispose();
        setImageDescriptor(logoImage);
                                        @Override
                            DBNNode selectedNode = null;
                                                element instanceof TreeNodeSpecial ||
            connectionInfo.setServerName(awsRegionCombo.getText().trim());
                GridData.FILL_HORIZONTAL
import org.eclipse.swt.widgets.Button;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                                                    element instanceof DBNFileSystem ||
        driverPropsPage = new DriverPropertiesDialogPage(this);
                awsRegionCombo.add(region.getId());
                            if (dialog.open() == IDialogConstants.OK_ID) {
    private static final ImageDescriptor logoImage = AthenaActivator.getImageDescriptor("icons/aws_athena_logo.png"); //$NON-NLS-1$
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
            showCatalogsCheck = UIUtils.createCheckbox(addrGroup,
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.ui.IDialogPageProvider;
 *
}
    @Override
import org.eclipse.jface.dialogs.IDialogPage;


import org.eclipse.swt.events.SelectionAdapter;
    private final DriverPropertiesDialogPage driverPropsPage;
import org.jkiss.dbeaver.ui.UIUtils;
                            DBNProject projectNode = DBWorkbench.getPlatform().getNavigatorModel().getRoot().getProjectNode(getSite().getProject());
            Composite addrGroup = UIUtils.createTitledComposite(
 * See the License for the specific language governing permissions and
            awsRegionCombo.removeAll();
            s3LocationText.setText(databaseName);
    }
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.viewers.Viewer;
            }
    @Override
            );
                                                    (element instanceof DBNNode && matchesResultNode((DBNNode) element));
        if (awsRegionCombo != null) {
