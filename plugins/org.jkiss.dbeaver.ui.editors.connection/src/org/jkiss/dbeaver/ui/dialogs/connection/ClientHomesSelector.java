                displayClientVersion();
        homesCombo.removeSelectionListener(listeners.remove(listener));
import org.eclipse.jface.viewers.*;
        };
            public void widgetSelected(SelectionEvent e)
        this(parent, title, true);
                log.error(e);
                    for (DBPNativeClientLocation location : homes.values()) {
        homesCombo.addSelectionListener(new SelectionAdapter() {
            }
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 * ClientHomesSelector

    @Override
    private Combo homesCombo;
public class ClientHomesSelector implements ISelectionProvider {
        //label.setFont(UIUtils.makeBoldFont(label.getFont()));
//        gd = new GridData();
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {

    public ISelection getSelection() {
                    }
        SelectionAdapter selectionAdapter = new SelectionAdapter() {
    private final Map<ISelectionChangedListener, SelectionListener> listeners = new IdentityHashMap<>();
            } catch (DBException e) {
            }
                } else {
            {
                        currentHomeId = homeIds.get(0);
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
            @Override
    {
import org.jkiss.code.NotNull;
    }
    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
//        versionLabel.setLayoutData(gd);


                        }
 * you may not use this file except in compliance with the License.
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
                }
                    versionLabel.setText(clientHome.getProductVersion());
        this.homeIds.clear();
import org.jkiss.dbeaver.ui.UIUtils;
 */

import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
        String title,
                handleHomeChange();
    }

    //private Label versionLabel;
        Map<String, DBPNativeClientLocation> homes = new LinkedHashMap<>();
 */
    {
                    manageHomes();
import org.eclipse.swt.events.SelectionAdapter;
        String newHomeId = ClientHomesPanel.chooseClientHome(selectorPanel.getShell(), driver);

        if (clientHome != null) {
        }
                    homesCombo.add(UIConnectionMessages.controls_client_home_selector_browse);
    }
        gd.grabExcessHorizontalSpace = true;

            }
                DBPNativeClientLocationManager clientManager = driver.getNativeClientManager();
 *
        });
                });

    public Composite getPanel() {
                }
        int selectionIndex = homesCombo.getSelectionIndex();
        hlJob.addJobChangeListener(new JobChangeAdapter() {
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
                    displayClientVersion();
                    }
            @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
            try {
                listener.selectionChanged(new SelectionChangedEvent(ClientHomesSelector.this, getSelection()));
        //directoryDialog = new DirectoryDialog(selectorContainer.getShell(), SWT.OPEN);
                super.done(event);
import org.eclipse.swt.widgets.Combo;
            versionLabel.setText(""); //$NON-NLS-1$
/*
 * DBeaver - Universal Database Manager
    private List<String> homeIds = new ArrayList<>();
                    for (DBPNativeClientLocation location : clientManager.findLocalClientLocations()) {
                    currentHomeIndex = homesCombo.getSelectionIndex();
        if (newHomeId != null) {
 *
        String title)
                            homesCombo.select(homesCombo.getItemCount() - 1);
                }
import org.eclipse.swt.widgets.Composite;
            currentHomeId = newHomeId;
import org.eclipse.core.runtime.Status;
        homesCombo.setEnabled(false);
    private DBPDriver driver;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.swt.events.SelectionListener;
        gd.widthHint = UIUtils.getFontHeight(homesCombo) * 30;
        controlLabel.setToolTipText(UIConnectionMessages.controls_client_home_selector_tip);
    private String currentHomeId;
        }

        });
        this.homesCombo.removeAll();
                if (homesCombo.getSelectionIndex() == homesCombo.getItemCount() - 1) {

import org.jkiss.dbeaver.model.connection.DBPDriver;
    {
        this.driver = driver;
 * Licensed under the Apache License, Version 2.0 (the "License");
                        if (currentHomeId != null && location.getName().equals(currentHomeId)) {
        Composite parent,
        return CommonUtils.isEmpty(currentHomeId) ? null : currentHomeId;


                UIUtils.syncExec(() -> {
    {
    public ClientHomesSelector(

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.core.runtime.IStatus;
                        homes.putIfAbsent(location.getName(), location);
                        homesCombo.add(UIConnectionMessages.controls_client_home_selector_missing);
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
                    currentHomeId = homeIds.get(homesCombo.getSelectionIndex());
                    versionLabel.setText(clientHome.getProductName());
    }
    private void manageHomes()
                }

        Composite parent,
    {

//        gd.widthHint = 60;
        AbstractJob hlJob = new AbstractJob("Find local client homes") {
    protected void handleHomeChange()
    @Override
    }
            public void widgetSelected(SelectionEvent e) {
            public void done(IJobChangeEvent event) {

                // display client version
        String selection = selectionIndex < 0 ? null : homesCombo.getItem(selectionIndex);
                    if (homesCombo.getItemCount() == 0) {
 * limitations under the License.
            @Override
                for (DBPNativeClientLocation ncl : driver.getNativeClientLocations()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        DBPNativeClientLocation clientHome = currentHomeId == null ? null : driver.getNativeClientHome(currentHomeId);
    public ClientHomesSelector(

                if (clientHome.getProductVersion() != null) {
import java.util.*;
/**
    }
                    }
                } else {
                    }
    @Override

import org.jkiss.dbeaver.model.connection.DBPNativeClientLocationManager;
 * distributed under the License is distributed on an "AS IS" BASIS,
        hlJob.schedule();
}
        } else {
    }

//        versionLabel = new Label(this, SWT.CENTER);
    }
            }
*/
                        homesCombo.select(0);
    {
        boolean createComposite)
                        homeIds.add(null);
                    if (selectDefault && homesCombo.getSelectionIndex() == -1) {
        listeners.put(listener, selectionAdapter);
            @Override
                        homeIds.add(location.getName());
    public String getSelectedHome()
        return selection == null ? new StructuredSelection() : new StructuredSelection(selection);
            @Override
        Label controlLabel = UIUtils.createControlLabel(selectorPanel, title);


    public void populateHomes(DBPDriver driver, String currentHome, boolean selectDefault)
        homesCombo.setLayoutData(gd);
    private int currentHomeIndex;
                    homesCombo.select(currentHomeIndex);
    public void setSelection(ISelection selection) {
package org.jkiss.dbeaver.ui.dialogs.connection;
        selectorPanel = createComposite ? UIUtils.createComposite(parent, 2) : parent;
 * See the License for the specific language governing permissions and
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;

    private Composite selectorPanel;
                if (clientManager != null) {
import org.eclipse.swt.events.SelectionEvent;

                    homesCombo.setEnabled(true);
    }
        this.currentHomeId = currentHome;
    @Override
                return Status.OK_STATUS;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        populateHomes(driver, currentHomeId, true);
        homesCombo = new Combo(selectorPanel, SWT.READ_ONLY);
            }

        };
import org.jkiss.utils.CommonUtils;
 *
    private void displayClientVersion()
                        homesCombo.add(location.getDisplayName());
    }
                    homes.put(ncl.getName(), ncl);
        homesCombo.addSelectionListener(selectionAdapter);
import org.eclipse.swt.widgets.Label;
        return selectorPanel;
/*
