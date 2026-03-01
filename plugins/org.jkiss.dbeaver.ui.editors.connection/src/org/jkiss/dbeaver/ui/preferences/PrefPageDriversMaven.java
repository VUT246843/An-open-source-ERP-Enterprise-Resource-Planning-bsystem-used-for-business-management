            });
                        } else {
        } else {
            repo.setEnabled(!disabledRepositories.contains(repo));
            UIUtils.createTableColumn(mavenRepoTable, SWT.LEFT, "URL");

 * limitations under the License.
                    mavenRepoTable.getSelection()[0].setText(0, idText.getText());
            item.setText(new String[]{repoCopy.getId(), repoCopy.getUrl()});
            Composite buttonsPH = UIUtils.createComposite(mavenGroup, 1);

                @Override
            scopeText.setEnabled(false);
                    if (index > 0) {
import org.eclipse.ui.IWorkbench;
import org.eclipse.swt.events.SelectionAdapter;
            return false;

                    String urlString = EnterNameDialog.chooseName(getShell(), UIConnectionMessages.pref_page_drivers_maven_label_enter_maven_repository_url, "http://");
                    if (index < mavenRepoTable.getItemCount() - 1) {
            GridData gd = new GridData(GridData.FILL_BOTH);
            userNameText.setEnabled(false);
            urlText.setText(repo.getUrl());
            mavenRepoTable.addSelectionListener(new SelectionAdapter() {
        try {
import java.util.ArrayList;
    private Text nameText;
    private void updateSelection() {
                }
                customRepos.add(repo);
            idText = UIUtils.createLabelText(fields, "ID", "", SWT.BORDER | SWT.READ_ONLY);

            isSnapshotRepository.setSelection(repo.isSnapshot());
        final String id1 = item1.getText(0);
    {
            return (MavenRepository) selection[0].getData();
            TableItem item = items[i];
            Composite authGroup = UIUtils.createTitledComposite(composite, UIConnectionMessages.pref_page_drivers_maven_group_authentication, 4, GridData.FILL_HORIZONTAL);
import org.eclipse.swt.widgets.*;
    {
                        mavenRepoTable.setSelection(index - 1);

                }
                            final TableItem item = new TableItem(mavenRepoTable, SWT.NONE);
    public void setElement(IAdaptable element)
            scopeText.addModifyListener(e -> {
import java.net.URL;
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
 * PrefPageDriversMaven
            Composite fields = UIUtils.createPlaceholder(propsGroup, 2);
        }
                }
                }
            });
                        }
 * See the License for the specific language governing permissions and
            });
            urlText.addModifyListener(e -> {
    private Table mavenRepoTable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
                    getSelectedRepository().setName(nameText.getText());
        }
            });
                        updateSelection();
            urlText.setEnabled(true);
            Composite mavenGroup = UIUtils.createTitledComposite(composite, UIConnectionMessages.pref_page_drivers_maven_group_repositories, 2, GridData.FILL_BOTH, 300);
                {
 * DBeaver - Universal Database Manager
                }
            urlText.setEditable(isEditable);
                    final int index = mavenRepoTable.indexOf(item);
            mavenRepoTable.setHeaderVisible(true);
            userNameText.setText(CommonUtils.notEmpty(repo.getAuthInfo().getUserName()));
            isSnapshotRepository.addSelectionListener(new SelectionAdapter() {

    public boolean performOk()
                if (getSelectedRepository() != null) {
        final String url1 = item1.getText(1);
                @Override
                    for (TableItem item : mavenRepoTable.getSelection()) {
            removeButton.setEnabled(false);
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.drivers.maven"; //$NON-NLS-1$
        moveDownButton.setEnabled(mavenRepoTable.getSelectionIndex() < mavenRepoTable.getItemCount() - 1);
                item.setForeground(disabledColor);
                    getSelectedRepository().setUrl(urlText.getText());
            repo.setOrder(i);
        item1.setText(1, item2.getText(1));
    private final Set<MavenRepository> disabledRepositories = new HashSet<>();


                }
import org.jkiss.dbeaver.ui.UIUtils;
import java.util.HashSet;
        final MavenRegistry registry = MavenRegistry.getInstance();
                        switchItems(item, nextItem);
        enabledColor = parent.getForeground();
        {

                            item.setData(repository);
            userPasswordText.setText(CommonUtils.notEmpty(repo.getAuthInfo().getUserPassword()));
            nameText.setEnabled(false);
            });
                public void widgetSelected(SelectionEvent e) {
        TableItem[] items = mavenRepoTable.getItems();
            scopeText.setText(CommonUtils.makeString(repo.getScopes(), ','));
            moveUpButton = UIUtils.createDialogButton(buttonsPH, UIConnectionMessages.pref_page_drivers_maven_button_up, new SelectionAdapter() {
        {
    @Override
                }
    @Override
            nameText.addModifyListener(e -> {
                }
                public void widgetSelected(SelectionEvent e) {
            final boolean isEditable = repo.getType() == MavenRepository.RepositoryType.CUSTOM;
            urlText = UIUtils.createLabelText(fields, "URL", "", SWT.BORDER);
        Composite composite = UIUtils.createComposite(parent, 1);
            removeButton = UIUtils.createDialogButton(buttonsPH, UIConnectionMessages.pref_page_drivers_maven_button_remove, new SelectionAdapter() {
                    getSelectedRepository().getAuthInfo().setUserPassword(userPasswordText.getText());
            idText.setEditable(isEditable);
                        } catch (MalformedURLException e1) {
                }
                @Override
                }
                public void widgetSelected(SelectionEvent e) {
                    mavenRepoTable.notifyListeners(SWT.Selection, new Event());
        item1.setData(item2.getData());
    }
        for (int i = 0; i < items.length; i++) {
                    }
                            disabledRepositories.add(repo);
import org.eclipse.swt.graphics.Color;

        }
            if (repo.getType() == MavenRepository.RepositoryType.CUSTOM) {
                @Override
                        final TableItem prevItem = mavenRepoTable.getItem(index - 1);
                if (getSelectedRepository() != null) {
                            item.setText(new String[]{url.getHost(), urlString});
    }
                    }
/*

            isSnapshotRepository.setEnabled(false);
    }
import org.eclipse.ui.IWorkbenchPreferencePage;
        }
            });
 *
import org.jkiss.dbeaver.registry.maven.MavenRegistry;
            MavenRepository repo = (MavenRepository) item.getData();
            buttonsPH.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
    {
    }
            nameText.setEnabled(true);
                }
            TableItem item = new TableItem(mavenRepoTable, SWT.NONE);
import org.eclipse.core.runtime.IAdaptable;
            if (!repo.isEnabled()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.registry.maven.MavenRepository;
            scopeText = UIUtils.createLabelText(fields, UIConnectionMessages.pref_page_drivers_maven_label_scope, "", SWT.BORDER);
            });
            removeButton.setEnabled(isEditable);
                public void widgetSelected(SelectionEvent e) {
                if (getSelectedRepository() != null) {
    @Override
            scopeText.setEditable(isEditable);
            scopeText.setEnabled(true);
 */
    private Button moveDownButton;
            }
                public void widgetSelected(SelectionEvent e) {
            idText.addModifyListener(e -> {
                        getSelectedRepository().setIsSnapshot(isSnapshotRepository.getSelection());
    private Button removeButton;
                UIConnectionMessages.pref_page_drivers_maven_group_properties, 1, GridData.FILL_HORIZONTAL);
        registry.setCustomRepositories(customRepos);
/**
                }
                        if (!disabledRepositories.remove(repo)) {


            });
            UIUtils.createDialogButton(buttonsPH, UIConnectionMessages.pref_page_drivers_maven_button_add, new SelectionAdapter() {
                    }
            disableButton.setEnabled(false);
            disableButton.setEnabled(true);

    @Override
        item1.setText(0, item2.getText(0));
                            item.setForeground(enabledColor);
 *
    private Text userPasswordText;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        if (repo != null) {
                        }

    private void switchItems(TableItem item1, TableItem item2) {
                    getSelectedRepository().setId(idText.getText());

    }
        }
                    getSelectedRepository().setScopes(CommonUtils.splitString(scopeText.getText(), ','));
 */

    public void init(IWorkbench workbench)
                disableButton.setText(UIConnectionMessages.pref_page_drivers_maven_label_enable);
        }
    public IAdaptable getElement()

        performDefaults();
        for (MavenRepository repo : MavenRegistry.getInstance().getRepositories()) {
            isSnapshotRepository.setEnabled(isEditable);
                UIConnectionMessages.pref_page_drivers_maven_checkbox_snapshot, false);
    private Text idText;
        {
                    mavenRepoTable.notifyListeners(SWT.Selection, new Event());
import org.jkiss.code.NotNull;
            if (disabledRepositories.contains(repo)) {
                    mavenRepoTable.getSelection()[0].setText(1, urlText.getText());
            nameText.setText(repo.getName());
            nameText = UIUtils.createLabelText(fields, UIConnectionMessages.pref_page_drivers_maven_label_name, "", SWT.BORDER);


            fields.setLayoutData(new GridData(GridData.FILL_BOTH));
                    final TableItem item = mavenRepoTable.getSelection()[0];
import org.eclipse.swt.events.SelectionEvent;
                        MavenRepository repo = (MavenRepository) item.getData();
            idText.setEnabled(false);
        TableItem[] selection = mavenRepoTable.getSelection();
            userPasswordText = UIUtils.createLabelText(authGroup, UIConnectionMessages.pref_page_drivers_maven_label_password, "", SWT.BORDER | SWT.PASSWORD);
            userNameText = UIUtils.createLabelText(authGroup, UIConnectionMessages.pref_page_drivers_maven_label_user, "", SWT.BORDER);
        java.util.List<MavenRepository> customRepos = new ArrayList<>();
            userNameText.setEnabled(true);
            userPasswordText.setEnabled(false);
            UIUtils.createTableColumn(mavenRepoTable, SWT.LEFT, "Id");
        item2.setData(repo1);
    @NotNull
        }
                            item.setForeground(disabledColor);

    }
    }
            }
        return null;
        return super.performOk();
            nameText.setEditable(isEditable);
                if (getSelectedRepository() != null) {
        disabledColor = parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_DARK_SHADOW);
                @Override
        } catch (Exception e) {
    {
    protected void performDefaults()
            removeButton.setEnabled(false);
package org.jkiss.dbeaver.ui.preferences;

                        switchItems(item, prevItem);
            idText.setText(repo.getId());
            registry.saveConfiguration();
    private Button disableButton;
            mavenRepoTable.setLayoutData(gd);
            idText.setEnabled(true);
    private Text scopeText;
                    mavenRepoTable.remove(mavenRepoTable.getSelectionIndices());
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;

            userPasswordText.addModifyListener(e -> {
                    final TableItem item = mavenRepoTable.getSelection()[0];
            userPasswordText.setEnabled(true);
                        final TableItem nextItem = mavenRepoTable.getItem(index + 1);
                    getSelectedRepository().getAuthInfo().setUserName(userNameText.getText());
        final MavenRepository repo = getSelectedRepository();
            disableButton = UIUtils.createDialogButton(buttonsPH, UIConnectionMessages.pref_page_drivers_maven_label_disable, new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e)
            item.setData(repoCopy);
        return null;
            });

                }
                if (getSelectedRepository() != null) {
            userNameText.addModifyListener(e -> {
    @Override
            mavenRepoTable = new Table(mavenGroup, SWT.BORDER | SWT.FULL_SELECTION);
            removeButton.setEnabled(false);
    protected Control createPreferenceContent(@NotNull Composite parent) {
import java.net.MalformedURLException;
                        mavenRepoTable.setSelection(index + 1);
        if (selection.length == 1) {
}        UIUtils.packColumns(mavenRepoTable, true);
                        try {
                            DBWorkbench.getPlatformUI().showError(UIConnectionMessages.pref_page_drivers_maven_label_bad_url, UIConnectionMessages.pref_page_drivers_maven_label_bad_url_tip, e1);
                disableButton.setText(UIConnectionMessages.pref_page_drivers_maven_label_disable);
            MavenRepository repoCopy = repo.getType() == MavenRepository.RepositoryType.CUSTOM ? new MavenRepository(repo) : repo;
public class PrefPageDriversMaven extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
            } else {
                    if (getSelectedRepository() != null) {


    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            Composite propsGroup = UIUtils.createTitledComposite(composite,
import org.eclipse.ui.IWorkbenchPropertyPage;
        updateSelection();
    private Button isSnapshotRepository;
                            MavenRepository repository = new MavenRepository(url.getHost(), url.getHost(), url.toString(), MavenRepository.RepositoryType.CUSTOM);
                            URL url = new URL(urlString);
 * Licensed under the Apache License, Version 2.0 (the "License");
                disabledRepositories.add(repo);
                if (getSelectedRepository() != null) {
    private Text userNameText;
            });
    private Text urlText;


    private Button moveUpButton;
                    updateSelection();
 * You may obtain a copy of the License at

            });
        moveUpButton.setEnabled(mavenRepoTable.getSelectionIndex() > 0);
                public void widgetSelected(SelectionEvent e) {
        return composite;

            urlText.setEnabled(false);
                    if (urlString != null) {
            DBWorkbench.getPlatformUI().showError("Unable to save Maven repositories", e.getMessage(), e);
    {
 *
import java.util.Set;
                    final int index = mavenRepoTable.indexOf(item);
            });
    @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
    private MavenRepository getSelectedRepository() {
                @Override
        super.performDefaults();
                    }
        final Object repo1 = item1.getData();
            isSnapshotRepository = UIUtils.createCheckbox(propsGroup,
            });
                @Override
    }

        item2.setText(1, url1);
        item2.setText(0, id1);

        }
    private Color enabledColor, disabledColor;
                    }
            moveDownButton = UIUtils.createDialogButton(buttonsPH, UIConnectionMessages.pref_page_drivers_maven_button_down, new SelectionAdapter() {
                        updateSelection();
