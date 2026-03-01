    protected abstract String getPropertyPageID();
    protected boolean supportsGlobalOptions() {
        }

    }
import org.eclipse.swt.events.SelectionEvent;
        if (containerNode == null && data instanceof IAdaptable) {
            changeSettingsTargetLink = createLink(

/*
                getPropertyPageID(),
        {


        if (isDataSourcePreferencePage()) {
        if (!isProjectPreferencePage() || useDataSourceSettings()) {
        dataSourceContainer = element instanceof DBPDataSourceContainer ? (DBPDataSourceContainer) element : null;
    @Override
                widgetSelected(e);



            changeSettingsTargetLink.setLayoutData(new GridData(SWT.END, SWT.CENTER, true, false));
    protected void enablePreferenceContent(boolean enable) {
        return super.createDescriptionLabel(parent);
    private ControlEnableState blockEnableState;
    }
    protected void enableDataSourceSpecificSettings(boolean useProjectSpecificSettings) {

            if (blockEnableState != null) {
    public DBPDataSourceContainer getOriginalDataSourceContainer() {
    /*
        return configurationBlockControl;
                    public void widgetSelected(SelectionEvent e) {
     * @see org.eclipse.jface.preference.IPreferencePage#createContents(Composite)
}
    @Nullable

    private void updateLinkVisibility() {
                UINavigatorMessages.pref_page_target_link_show_datasource_settings);
                            getPropertyPageID(),
            prefDialog.open();
public abstract class TargetPrefPage extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
    }
 *
        }
    }
//        horizontalLine.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false, 2, 1));
                blockEnableState = null;
     */
                    @Override

    }


                DBPDataSourceContainer dataSource = dialog.getDataSource();

            }

                containerNode = (DBNDataSource) DBWorkbench.getPlatform().getNavigatorModel().findNode(dsContainer);
        }
            final DBPDataSourceContainer dsContainer = element.getAdapter(DBPDataSourceContainer.class);
    protected Label createDescriptionLabel(Composite parent) {
    public IAdaptable getElement() {
                composite.setFont(parent.getFont());
        PreferenceDialog prefDialog = null;
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
    private Control configurationBlockControl;
import org.eclipse.ui.IWorkbenchPreferencePage;
                        boolean enabled = dataSourceSettingsButton.getSelection();
                changeSettingsTargetLink = createLink(composite, UINavigatorMessages.pref_page_target_link_show_global_settings);
                UIUtils.setDefaultTextControlWidthHint(dataSourceSettingsButton);
    }
    }

    public void applyData(Object data) {
            // Select datasource

                IDatabaseEditorInput dbInput = element.getAdapter(IDatabaseEditorInput.class);
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.navigator.DBNNode;

        }
    private void doLinkActivated(Link link) {
    protected DBPPreferenceStore getTargetPreferenceStore() {
        updateLinkVisibility();
            }
        return isDataSourcePreferencePage() && dataSourceSettingsButton != null && dataSourceSettingsButton.getSelection();
        return element;
                    if (dbNode instanceof DBNDataSource) {
 */
import org.eclipse.swt.layout.GridData;

        link.setFont(composite.getFont());
                            null,//new String[]{getPropertyPageID()},
                    UINavigatorMessages.pref_page_target_button_use_datasource_settings,
            getDataSourceContainer().getPreferenceStore() :

            enableDataSourceSpecificSettings(useProjectSettings);
                getShell(),
 *     http://www.apache.org/licenses/LICENSE-2.0
            // Show global settings

            }
        }
                    }
    }
            if (supportsGlobalOptions()) {

                }
            dataSourceContainer = containerNode.getDataSourceContainer();
    @Override
 */
package org.jkiss.dbeaver.ui.preferences;
                composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
                null);
    public void setElement(IAdaptable element) {
        containerNode = element.getAdapter(DBNDataSource.class);
                parent,
    protected abstract void savePreferences(@NotNull DBPPreferenceStore store);
            }

import org.eclipse.ui.IWorkbench;
    public DBPDataSourceContainer getDataSourceContainer() {
    }
    }


    }
                    DBNNode dsNode = DBNUtils.getNodeByObject(dataSource);
    public void init(IWorkbench workbench) {
        }

        if (dataSourceSettingsButton != null) {
        });
                } else if (element instanceof DBPContextProvider) {
                        enableDataSourceSpecificSettings(enabled);
            public void widgetDefaultSelected(SelectionEvent e) {
        if (!supportsGlobalOptions()) {
                dataSourceSettingsButton.addSelectionListener(new SelectionAdapter() {
 * You may obtain a copy of the License at
/**
        } else if (supportsDataSourceSpecificOptions()) {
 * Unless required by applicable law or agreed to in writing, software
        enablePreferenceContent(useProjectSpecificSettings);
                }
    protected void performApply() {
        return dataSourceContainer;
                dataSourceSettingsButton = new Button(composite, SWT.CHECK);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.*;
    private Link createLink(Composite composite, String text) {
import org.eclipse.jface.dialogs.ControlEnableState;
                    if (context != null) {

    protected abstract boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dsContainer);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                    containerNode = (DBNDataSource) DBWorkbench.getPlatform().getNavigatorModel().findNode((DBPDataSourceContainer) element);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

                    dataSourceContainer.getName()
 * DBeaver - Universal Database Manager
            }
        if (changeSettingsTargetLink == null || changeSettingsTargetLink.isDisposed()) {
            }
            prefDialog = PreferencesUtil.createPreferenceDialogOn(
    }
        } else {
    protected boolean useDataSourceSettings() {
            savePreferences(store);
            loadPreferences(store);
                            null);
        return dataSourceContainer != null;
        if (enable) {
        if (prefDialog != null) {
            return;
            updateStatus(new StatusInfo());



                dataSourceSettingsButton.setFont(parent.getFont());
            return;
import org.eclipse.ui.IWorkbenchPropertyPage;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
            DBWorkbench.getPlatform().getPreferenceStore();
            PrefUtils.savePreferenceStore(store);

    protected void createPreferenceHeader(Composite composite) {

    }
            // Just delete datasource specific settings
                    }
        }
        }
            public void widgetSelected(SelectionEvent e) {
    protected abstract boolean supportsDataSourceSpecificOptions();
import org.jkiss.dbeaver.ui.UIUtils;
        doStatusChanged();
        if (isDataSourcePreferencePage()) {
*/
        return isDataSourcePreferencePage() ?
            }
                    if (dsNode instanceof DBNDataSource) {
    protected abstract void loadPreferences(@NotNull DBPPreferenceStore store);

import org.jkiss.dbeaver.model.DBPContextProvider;
    }
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public final boolean performOk() {
        } else {
    private Button dataSourceSettingsButton;

    }
import org.eclipse.jface.dialogs.IDialogConstants;
            DBPPreferenceStore store = getTargetPreferenceStore();

 *
                } else if (element instanceof DBPDataSourceContainer) {
//        Label horizontalLine = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
    @Nullable

        if (this.element == null) {
                ));
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
        performOk();
                doLinkActivated((Link) e.widget);
                null,//new String[]{getPropertyPageID()},
        if (isDataSourcePreferencePage()) {
            @Override
 *
                if (dataSource != null) {

    @NotNull
            if (dialog.open() != IDialogConstants.CANCEL_ID) {
        } else if (supportsDataSourceSpecificOptions()) {
                blockEnableState.restore();
import org.jkiss.dbeaver.model.navigator.DBNUtils;
                });

        }
            clearPreferences(store);
                    DBNNode dbNode = dbInput.getNavigatorNode();
                blockEnableState.restore();
    @Override
        createPreferenceHeader(parent);
        Link link = UIUtils.createLink(composite, "<A>" + text + "</A>", new SelectionListener() {
    }
    protected abstract void clearPreferences(@NotNull DBPPreferenceStore store);
    private Link changeSettingsTargetLink;

                Composite composite = UIUtils.createPlaceholder(parent, 2);
                            getShell(),
        }
        }
        }
import org.jkiss.code.Nullable;
                        containerNode = (DBNDataSource) dbNode;
            @Override
            return true;
                            dsNode,
        //PrefUtils.savePreferenceStore(store);
    protected void doStatusChanged() {

import org.jkiss.code.NotNull;
        return link;
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        if (isDataSourcePreferencePage() && !useDataSourceSettings()) {
        DBPPreferenceStore store = getTargetPreferenceStore();
            updateStatus(fBlockStatus);
            if (dsContainer != null) {
import org.eclipse.jface.preference.PreferenceDialog;
                    }
        }
    private DBNDataSource containerNode;
                        containerNode = (DBNDataSource) DBWorkbench.getPlatform().getNavigatorModel().findNode(context.getDataSource().getContainer());
            if (blockEnableState != null) {
    protected TargetPrefPage() {
    @Override
import org.eclipse.swt.events.SelectionAdapter;
    public final boolean isDataSourcePreferencePage() {
        if (containerNode == null) {
            } else {

    }
                if (dbInput != null) {
        } else {
        UIUtils.createLabelSeparator(parent, SWT.HORIZONTAL);
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
    }
    private IAdaptable element;
        }
                dataSourceSettingsButton.setText(NLS.bind(
import org.jkiss.dbeaver.ui.navigator.dialogs.SelectDataSourceDialog;
        if (isDataSourcePreferencePage()) {
        }
    }
            setElement((IAdaptable) data);

    @Override
        return super.performOk();
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.jkiss.dbeaver.utils.PrefUtils;
import org.eclipse.core.runtime.IAdaptable;
import org.jkiss.dbeaver.Log;

            SelectDataSourceDialog dialog = new SelectDataSourceDialog(getShell(), null, null);
    }
            blockEnableState = ControlEnableState.disable(configurationBlockControl);
                changeSettingsTargetLink.setLayoutData(new GridData(SWT.END, SWT.CENTER, false, false));
/*
        configurationBlockControl = super.createContents(parent);
    @Override
    protected static final Log log = Log.getLog(TargetPrefPage.class);
    private DBPDataSourceContainer dataSourceContainer;
        return true;
            changeSettingsTargetLink.setEnabled(true);
import org.eclipse.swt.SWT;
 * See the License for the specific language governing permissions and
    protected Control createContents(Composite parent) {
                    DBCExecutionContext context = ((DBPContextProvider) element).getExecutionContext();
        return dataSourceContainer.getProject().getDataSourceRegistry().getDataSource(dataSourceContainer.getId());
        this.element = element;
                    }
    }
            dataSourceSettingsButton.setSelection(useProjectSpecificSettings);

        }

 * TargetPrefPage
 * distributed under the License is distributed on an "AS IS" BASIS,
            //changeSettingsTargetLink.setEnabled(!useDataSourceSettings());
            boolean useProjectSettings = hasDataSourceSpecificOptions(getDataSourceContainer());
                        prefDialog = PreferencesUtil.createPropertyDialogOn(

        if (dataSourceContainer == null && containerNode != null) {
