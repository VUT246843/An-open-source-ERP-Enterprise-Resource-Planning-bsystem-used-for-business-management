package org.jkiss.dbeaver.ui.dialogs.connection;
        public DriverInfo(@NotNull DBPDriver driver, @NotNull String matchedUrl, boolean genuineUrl) {
        }
                final var entry = (Map.Entry<DBPDataSourceProviderDescriptor, List<DriverInfo>>) element;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.core.runtime.IStatus;
            .collect(Collectors.toList());
                @NotNull
import java.util.*;
        @SuppressWarnings("unchecked")
                        url = urlText.getText();
    }
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {

                }
        private final boolean genuineUrl;

                        updateCompletion();
        }
import org.eclipse.swt.widgets.Composite;
                updateCompletion();
            }
            for (DBPDriver driver : provider.getEnabledDrivers()) {
        super(shell, CoreMessages.dialog_connection_from_url_title, null);
    }
        return DatabaseURL.extractConfigurationFromUrl(driver.matchedUrl, url);
                drivers.sort(Comparator
            return element instanceof Map.Entry;
    }
        return result.entrySet().stream()
        final Map<DBPDataSourceProviderDescriptor, List<DriverInfo>> result = new LinkedHashMap<>();
            final Text urlText = UIUtils.createLabelText(composite, CoreMessages.dialog_connection_from_url_url, null);
                    driver = (DriverInfo) element;
            final Composite composite = UIUtils.createComposite(parentComposite, 1);
            };
        public Image getImage(Object element) {
 *

    private CLabel errorLabel;

                return entry.getValue().toArray();
        updateCompletion();
            urlText.setMessage("jdbc:postgresql://localhost:5432/dbeaver");
import org.jkiss.dbeaver.ui.DBeaverIcons;
            errorLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            this.matchedUrl = matchedUrl;

import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
                final var entry = (Map.Entry<DBPDataSourceProviderDescriptor, List<DriverInfo>>) element;
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
    }
                    .reversed());

    private TreeViewer driverViewer;
                        }
                        if (!drivers.isEmpty()) {
    private List<Map.Entry<DBPDataSourceProviderDescriptor, List<DriverInfo>>> getSuitableDrivers(@NotNull String url) {
            return null;
        public String getText(Object element) {
        @Override


import org.jkiss.dbeaver.model.connection.DBPDriver;
            }

import org.jkiss.dbeaver.core.CoreMessages;
import java.util.stream.Collectors;
            this.genuineUrl = genuineUrl;

                }
            final List<DriverInfo> drivers = new ArrayList<>();

                final DriverInfo info = (DriverInfo) element;

        @SuppressWarnings("unchecked")
    private static final int INPUT_DELAY_BEFORE_REFRESH = 300;
            UIUtils.createControlLabel(composite, CoreMessages.dialog_connection_from_url_drivers);
    @NotNull
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
                result.put(provider, drivers);
import org.eclipse.swt.layout.GridData;
            this.driver = driver;
    @Nullable
import org.eclipse.swt.SWT;
    }
import org.jkiss.dbeaver.model.DBIconComposite;
import org.eclipse.jface.dialogs.IDialogConstants;

                    drivers.add(new DriverInfo(driver, DatabaseURL.GENERIC_URL_TEMPLATE, false));
                    refreshJob.cancel();
                    : DBeaverIcons.getImage(new DBIconComposite(icon, false, null, null, null, DBIcon.OVER_LAMP));
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            }
    @NotNull
    public NewConnectionFromUrlDialog(@NotNull Shell shell) {
                        driverViewer.setInput(drivers);
                }

            setCompleted(false, CoreMessages.dialog_connection_from_url_error_no_drivers_found);
    public DBPConnectionConfiguration extractConnectionConfiguration() {
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
                @Override
            });
                if (DatabaseURL.getPattern(driver.getSampleURL()).matcher(url).find()) {
        setCompleted(true, "");
            if (element instanceof DriverInfo) {
        @Override
            final AbstractJob refreshJob = new AbstractJob("Refresh suitable drivers timeout") {
    private static class DriverInfo {
            });
            errorLabel.setImage(DBeaverIcons.getImage(DBIcon.SMALL_ERROR));
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    scores.put(provider, scores.computeIfAbsent(provider, x -> 0) + 1);

                    continue;
                    return Status.OK_STATUS;
            return;
            driverViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
    }
/*
    protected Composite createDialogArea(Composite parent) {

                    .comparingInt((DriverInfo info) -> info.driver.getPromotedScore())
        final Map<DBPDataSourceProviderDescriptor, Integer> scores = new HashMap<>();
                            driverViewer.setSelection(new StructuredSelection(drivers.get(0).getValue().get(0)));
import org.eclipse.swt.widgets.Text;
        private final DBPDriver driver;

    }
            refreshJob.setSystem(true);
    public String getUrl() {
import org.jkiss.code.Nullable;


        if (driverViewer.getTree().getItemCount() == 0) {
        }
public class NewConnectionFromUrlDialog extends BaseDialog {

import org.jkiss.dbeaver.ui.UIUtils;
            if (!drivers.isEmpty()) {
                refreshJob.schedule(INPUT_DELAY_BEFORE_REFRESH);

                }

        }
    @Override
    private void updateCompletion() {
                }
import org.eclipse.swt.widgets.Shell;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    scores.put(provider, scores.computeIfAbsent(provider, x -> 0) + 1);

        }
        return parentComposite;
import org.jkiss.dbeaver.model.DBIcon;
    public DBPDriver getDriver() {
    @Override
            if (element instanceof Map.Entry) {
                    continue;

            ((GridData) composite.getLayoutData()).widthHint = 500;
    }
import org.eclipse.jface.viewers.LabelProvider;


                return entry.getKey().getName();

            setCompleted(false, CoreMessages.dialog_connection_from_url_error_no_driver_selected);
import org.eclipse.jface.viewers.TreeViewer;
        }
        @Override
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    private static class DriverContentProvider extends TreeContentProvider {
        {
                        final var drivers = getSuitableDrivers(urlText.getText());
        if (!(driverViewer.getStructuredSelection().getFirstElement() instanceof DriverInfo)) {
 *
    private String url;
                        driverViewer.getTree().setRedraw(false);
        public Object[] getChildren(Object element) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            refreshJob.setUser(false);
                final var entry = (Map.Entry<DBPDataSourceProviderDescriptor, List<DriverInfo>>) element;
        for (DBPDataSourceProviderDescriptor provider : DataSourceProviderRegistry.getInstance().getDataSourceProviders()) {
    @NotNull
            return null;
    }
        return url;
        final Composite parentComposite = super.createDialogArea(parent);
        @SuppressWarnings("unchecked")
 * you may not use this file except in compliance with the License.
            errorLabel = new CLabel(composite, SWT.NONE);
                final DBPImage icon = info.driver.getIcon();


        @Override
                return ((DriverInfo) element).driver.getName();
            if (element instanceof Map.Entry) {
                    });
        }
            urlText.addDisposeListener(event -> {
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
import org.eclipse.swt.custom.CLabel;
                if (!refreshJob.isCanceled()) {
            }
}
                    ? DBeaverIcons.getImage(icon)
            driverViewer.addSelectionChangedListener(event -> {
                if (element instanceof DriverInfo) {
    private DriverInfo driver;

    }

        private final String matchedUrl;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
 * limitations under the License.
                if (!refreshJob.isCanceled()) {
 */

            driverViewer.setLabelProvider(new DriverLabelProvider());
            driverViewer.setContentProvider(new DriverContentProvider());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.regex.Matcher;
        return driver.driver;
                }
                    .thenComparing((DriverInfo info) -> info.driver.getFullName())
                if (CommonUtils.isEmpty(driver.getSampleURL()) || CommonUtils.isEmptyTrimmed(url)) {
                }
            errorLabel.setVisible(false);
    private static class DriverLabelProvider extends LabelProvider {
                    UIUtils.asyncExec(() -> {
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;

            }
                final Object element = event.getStructuredSelection().getFirstElement();
                if (matcher.find() && driver.getId().contains(matcher.group("driver"))) {
            }
            });
                        driverViewer.getTree().setRedraw(true);
import org.jkiss.dbeaver.model.DatabaseURL;
 *
                return DBeaverIcons.getImage(entry.getKey().getIcon());
 * Unless required by applicable law or agreed to in writing, software
        errorLabel.setVisible(!valid && CommonUtils.isNotEmpty(message));
                final Matcher matcher = DatabaseURL.getPattern(DatabaseURL.GENERIC_URL_TEMPLATE).matcher(url);
        }
            return;

    protected void createButtonsForButtonBar(@NotNull Composite parent) {

    }
import org.eclipse.core.runtime.Status;
import org.jkiss.code.NotNull;
                    drivers.add(new DriverInfo(driver, driver.getSampleURL(), true));
            if (element instanceof DriverInfo) {
import org.eclipse.swt.graphics.Image;
                        driverViewer.expandAll();
            driverViewer = new TreeViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.PROCEED_LABEL, true);
            return null;
        errorLabel.setText(message);
    }
        setShellStyle(SWT.TITLE | SWT.CLOSE | SWT.RESIZE | SWT.BORDER);
 * Licensed under the Apache License, Version 2.0 (the "License");
        getButton(IDialogConstants.OK_ID).setEnabled(valid);
            if (element instanceof Map.Entry) {
            }
                    refreshJob.cancel();
            urlText.addModifyListener(event -> {
            composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        public boolean hasChildren(Object element) {
            .sorted(Comparator.comparing(x -> scores.get(x.getKey()), Comparator.reverseOrder()))
                return info.genuineUrl


        }
    private void setCompleted(boolean valid, @NotNull String message) {
