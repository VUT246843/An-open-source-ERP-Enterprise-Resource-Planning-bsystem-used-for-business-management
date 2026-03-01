            UIConnectionMessages.dialog_edit_driver_edit_maven_artifact_id_label,
            UIUtils.createInfoLabel(container, "Predefined Maven artifacts are read-only", GridData.FILL_HORIZONTAL, 2);


 * Unless required by applicable law or agreed to in writing, software

        errorLabel = new CLabel(container, SWT.NONE);
    }
        @Override
                @Override
                    artifactText.getText(),
                    groupText.getText(), artifactText.getText(), classifierText.getText(), fallbackVersionText.getText(), preferredVersionText.getText()));
        GridData gd = new GridData(GridData.FILL_BOTH);
                || (state.peekLast() == State.DEPENDENCY_ARTIFACT_ID && "artifactId".equals(name))
        }
        if (fallbackVersionText.getText().isEmpty()) {
            }
        ModifyListener ml = e -> updateButtons();
            artifactText.setEditable(false);
        try {

        fallbackVersionText.add(MavenArtifactReference.VERSION_PATTERN_RELEASE);
import org.jkiss.utils.xml.SAXListener;

        item.setText(UIConnectionMessages.dialog_edit_driver_edit_maven_manual);

    }
                }

                state.offer(State.DEPENDENCY_CLASSIFIER);

import org.jkiss.dbeaver.DBException;
    }
            UIConnectionMessages.dialog_edit_driver_edit_maven_classifier_label,
import org.jkiss.code.Nullable;
    @NotNull
    }
        }
                state.offer(State.DEPENDENCY_VERSION);
        }
import org.eclipse.swt.events.ModifyListener;

            fallbackVersionText.setEnabled(false);
        groupText.addModifyListener(ml);
        fallbackVersionText.addModifyListener(ml);
                    "",
                    null,
import java.io.IOException;
            Button ignoreDependenciesCheckbox = UIUtils.createCheckbox(settingsGroup,
        super(shell, UIConnectionMessages.dialog_edit_driver_edit_maven_title, DBIcon.TREE_USER);
                version = null;
                    groupText.getText(),
                    CommonUtils.nullIfEmpty(classifierText.getText()),
                lib.setReference(new MavenArtifactReference(groupId, artifactId, classifier, MavenArtifactReference.VERSION_PATTERN_RELEASE, version));
                );
        errorLabel.setVisible(false);
                }
            }
        enableButton(IDialogConstants.OK_ID,
        container.setLayout(new GridLayout(1, true));
    @Override
                originalArtifact != null && originalArtifact.isLoadOptionalDependencies(),
    }
            fallbackVersionText.setText(CommonUtils.notEmpty(originalArtifact.getReference().getFallbackVersion()));

import java.util.ArrayDeque;
            Button loadOptionalDependenciesCheckbox = UIUtils.createCheckbox(settingsGroup,
            tabFolder.addSelectionListener(new SelectionAdapter() {
import org.jkiss.code.NotNull;
                1,
                log.debug("Error parsing dependency declaration", e);
                } catch (DBException ex) {
                lib.setIgnoreDependencies(ignoreDependencies);
                setStatus(true, e.getMessage());
    private Text artifactText;
        public void saxText(@NotNull SAXReader reader, @NotNull String data) {

        if (isReadOnly) {
            }
                DriverLibraryMavenArtifact lib = new DriverLibraryMavenArtifact(EditMavenArtifactDialog.this.driver,
        container.setLayoutData(new GridData(GridData.FILL_BOTH));
                2);
    }
        classifierText = UIUtils.createLabelText(container,

                lib.setLoadOptionalDependencies(loadOptionalDependencies);

            } else {
    }
            for (DriverLibraryMavenArtifact artifact : artifacts) {
                artifactId = null;
    }



                }
                    loadOptionalDependencies = loadOptionalDependenciesCheckbox.getSelection();
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
        private String groupId;

                );
                classifier = null;

                    break;
        DEPENDENCY_DECLARATION,
            originalArtifact != null ? (originalArtifact.getPreferredVersion()) : "");
            });
        }
    private void setStatus(boolean error, String message) {
import org.eclipse.swt.events.SelectionEvent;
    private static final Pattern REGEX_FOR_GRADLE = Pattern.compile("([\\w_.-]+):([\\w_.-]+)(?::([\\w_.-]+))(?::([\\w_.-]+))?", Pattern.MULTILINE);

                    EditMavenArtifactDialog.this.driver,
        fieldText.setLayoutData(gd);
 *
                originalArtifact != null && originalArtifact.isIgnoreDependencies(),
            artifacts.clear();
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
import org.eclipse.swt.layout.GridData;
        public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String name, @NotNull Attributes attributes) {
import org.jkiss.utils.xml.SAXReader;
                    groupId = data;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    protected void okPressed() {
        item.setData(TabType.DEPENDENCY_DECLARATION);
            });
                    ignoreDependencies = ignoreDependenciesCheckbox.getSelection();

import org.eclipse.swt.widgets.*;
    private class SAXMavenListener extends SAXListener.BaseListener {
            !CommonUtils.isEmpty(groupText.getText()) &&
        fieldText.addModifyListener(event -> parseArtifactText());

                default:
            isReadOnly = true;
        }
import org.eclipse.swt.custom.CTabFolder;
            preferredVersionText.setEditable(false);
import org.jkiss.dbeaver.ui.DBeaverIcons;
                lib.setPreferredVersion(version);
    private void updateButtons() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            errorLabel.setImage(DBeaverIcons.getImage(error ? DBIcon.SMALL_ERROR : DBIcon.SMALL_INFO));
    private boolean isReadOnly = false;
            } else if (state.peekLast() == State.DEPENDENCY && "artifactId".equals(name)) {
                lib.setPreferredVersion(version);
                    break;
            if (!fieldText.getText().isEmpty()) {
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
            originalArtifact != null ? CommonUtils.notEmpty(originalArtifact.getReference().getArtifactId()) : "");
        container.setLayout(new GridLayout(2, false));
                lib.setReference(new MavenArtifactReference(
            groupText.setEditable(false);
        CTabItem selection = tabFolder.getSelection();
        if (!message.isEmpty()) {
                    DBPDriverLibrary.FileType.jar,
                !CommonUtils.isEmpty(fallbackVersionText.getText())
            switch (state.peekLast()) {
                GridData.FILL_HORIZONTAL
            String name = matcher.group(2);
        private final Deque<State> state;
            if (state.peekLast() == State.DEPENDENCY && "dependency".equals(name)) {
import org.eclipse.osgi.util.NLS;
                    preferredVersionText.getText().isEmpty() ? null : preferredVersionText.getText()

        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        this.originalArtifact = library;
                artifact.setIgnoreDependencies(ignoreDependencies);

        }
                setStatus(false, UIConnectionMessages.dialog_edit_driven_edit_maven_field_text_message);
 * See the License for the specific language governing permissions and
                    if (selection != null && selection.getData() == TabType.DEPENDENCY_DECLARATION){

            loadOptionalDependenciesCheckbox.addSelectionListener(new SelectionAdapter() {
            originalArtifact != null ? CommonUtils.notEmpty(originalArtifact.getReference().getClassifier()) : "");

        gd.heightHint = UIUtils.getFontHeight(container.getFont()) * 12;
    }
                return;
        if (originalArtifact != null) {
                    preferredVersionText.getText()));
                state.offer(State.DEPENDENCIES);

    public List<DriverLibraryMavenArtifact> getArtifacts() {
        final List<DriverLibraryMavenArtifact> artifacts = new ArrayList<>();
    private Text fieldText;
        @Override
                    CommonUtils.notEmpty(group),
                case DEPENDENCY_GROUP_ID:
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
        final Matcher matcher = REGEX_FOR_GRADLE.matcher(fieldText.getText());
import org.jkiss.utils.CommonUtils;
    }
    private boolean loadOptionalDependencies;
 *
        }
    private List<DriverLibraryMavenArtifact> parseMaven() throws XMLException {
                public void widgetSelected(SelectionEvent e) {
        return artifacts;
    private List<DriverLibraryMavenArtifact> parseGradle() throws DBException {
        CTabItem item = new CTabItem(folder, SWT.NONE);
        }
                state.offer(State.DEPENDENCY);
                    version = data;
            if (originalArtifact == null) {
import java.util.ArrayList;
        DEPENDENCY_ARTIFACT_ID,
                composite,
        groupText = UIUtils.createLabelText(container,
import org.xml.sax.Attributes;
                @Override
        DEPENDENCIES,
    @NotNull
    private CTabFolder tabFolder;
                createDependencyDeclarationTab(tabFolder);
import org.jkiss.dbeaver.ui.UIUtils;
    private enum State {
        fallbackVersionText.add(MavenArtifactReference.VERSION_PATTERN_LATEST);

                public void widgetSelected(SelectionEvent e) {
                originalArtifact.setPreferredVersion(preferredVersionText.getText().isEmpty() ? null : preferredVersionText.getText());


                case DEPENDENCY_ARTIFACT_ID:
                DriverLibraryMavenArtifact lib = new DriverLibraryMavenArtifact(
import java.util.Deque;
            UIConnectionMessages.dialog_edit_driver_edit_maven_fallback_version_label,SWT.DROP_DOWN | SWT.BORDER);
 * You may obtain a copy of the License at
                ));
import org.jkiss.dbeaver.model.DBIcon;
            this.state = new ArrayDeque<>();
    private Text classifierText;
import org.eclipse.jface.dialogs.IDialogConstants;
        }
        super.okPressed();
import org.jkiss.dbeaver.registry.maven.MavenArtifactReference;
        return artifacts;
                    CommonUtils.nullIfEmpty(fallbackVersionText.getText()),
        }

        {
    protected void createButtonsForButtonBar(@NotNull Composite parent) {

        private String artifactId;
            tabFolder = new CTabFolder(composite, SWT.TOP | SWT.FLAT);

        preferredVersionText.addModifyListener(ml);
    private final DriverLibraryMavenArtifact originalArtifact;
                artifact.setLoadOptionalDependencies(loadOptionalDependencies);
                    setStatus(false, NLS.bind(UIConnectionMessages.dialog_edit_driver_edit_maven_artifacts_count, artifacts.size()));
                    DBPDriverLibrary.FileType.jar,
    private enum TabType {

                    classifier = data;
import java.io.StringReader;
        } else {
        }
        DEPENDENCY,
            Composite settingsGroup = UIUtils.createTitledComposite(

import java.util.List;
    private CLabel errorLabel;

 * limitations under the License.
            }

            super.okPressed();
            throw new XMLException("Error parsing XML", e);
    private final List<DriverLibraryMavenArtifact> artifacts = new ArrayList<>();
/*
                    version
            }
                @Override
            GridData gd = new GridData(GridData.FILL_BOTH);
        } catch (Exception e) {
            String version = matcher.group(3);
import java.util.regex.Pattern;
                || (state.peekLast() == State.DEPENDENCY_CLASSIFIER && "classifier".equals(name))
                    }
            this.artifacts = artifacts;

    private void createDeclareArtifactManuallyTab(@NotNull CTabFolder folder) {
                artifacts.add(lib);
            reader.parse(new SAXMavenListener(artifacts));
        DEPENDENCY_CLASSIFIER,
                    CTabItem selection = tabFolder.getSelection();
                groupId = null;
public class EditMavenArtifactDialog extends BaseDialog {
import org.jkiss.dbeaver.registry.driver.DriverLibraryMavenArtifact;
            else {
                    break;
import org.eclipse.swt.SWT;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
                    break;
                state.removeLast();
        //UIUtils.asyncExec(() -> setStatus(false, UIConnectionMessages.dialog_edit_driven_edit_maven_field_text_message));
        @Override
            fallbackVersionText.select(0);
import org.eclipse.swt.custom.CTabItem;
            // Artifact reference is read-only. We use it to find libraries
            if (state.isEmpty() && "dependencies".equals(name)) {
    protected Composite createDialogArea(Composite parent) {
            errorLabel.setText(message);
                || (state.peekLast() == State.DEPENDENCY_GROUP_ID && "groupId".equals(name))
        container.setLayoutData(gd);

        if (originalArtifact != null && !originalArtifact.isCustom()) {
        DECLARE_ARTIFACT_MANUALLY
            }
            String group = matcher.group(1);
        errorLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        } catch (IOException e) {
            ignoreDependenciesCheckbox.addSelectionListener(new SelectionAdapter() {
        private String classifier;
    }
                originalArtifact.setIgnoreDependencies(ignoreDependencies);
                case DEPENDENCY_VERSION:
        private String version;
            }
        }
                lib.setReference(new MavenArtifactReference(
        super.createButtonsForButtonBar(parent);
                    setStatus(true, e.getMessage());
                lib.setPreferredVersion(preferredVersionText.getText().isEmpty() ? null : preferredVersionText.getText());
            UIConnectionMessages.dialog_edit_driver_edit_maven_version_label,
            }
        item.setControl(container);
                    artifactId = data;
        item.setControl(container);

            } else if (state.peekLast() == State.DEPENDENCY && "version".equals(name)) {
        item.setText(UIConnectionMessages.dialog_edit_driver_edit_maven_raw);
                throw new DBException("Wrong Gradle configuration: " + matcher.group());
        return artifacts;
            if (REGEX_FOR_GRADLE.matcher(fieldText.getText()).find()) {
    private Text groupText;
        errorLabel.setVisible(!message.isEmpty());
        CTabItem item = new CTabItem(folder, SWT.NONE);
 * you may not use this file except in compliance with the License.
                setStatus(false, NLS.bind(UIConnectionMessages.dialog_edit_driver_edit_maven_artifacts_count, artifacts.size()));
                DriverLibraryMavenArtifact lib = new DriverLibraryMavenArtifact(EditMavenArtifactDialog.this.driver, DBPDriverLibrary.FileType.jar, "", version);
        fallbackVersionText = UIUtils.createLabelCombo(container,
        {
    @Override
 *
                case DEPENDENCY_CLASSIFIER:
import java.util.regex.Matcher;
                UIConnectionMessages.dialog_edit_driver_edit_maven_load_optional_dependencies_tip,
                || (state.peekLast() == State.DEPENDENCY_VERSION && "version".equals(name))) {
            if (originalArtifact != null) {

        );
            if (CommonUtils.isNotEmpty(group) && CommonUtils.isNotEmpty(name)) {
                UIConnectionMessages.dialog_edit_driver_edit_maven_settings,
        fieldText = new Text(container, SWT.V_SCROLL | SWT.MULTI | SWT.BORDER);
            return;
import org.eclipse.swt.events.SelectionAdapter;
        this.driver = driver;
                    artifacts.clear();
            SAXReader reader = new SAXReader(new StringReader(fieldText.getText()));
            } else if (state.peekLast() == State.DEPENDENCY && "classifier".equals(name)) {
        try {
        private final List<DriverLibraryMavenArtifact> artifacts;
            } else {
 */

            originalArtifact != null ? CommonUtils.notEmpty(originalArtifact.getReference().getGroupId()) : "");
        Composite composite = super.createDialogArea(parent);

            UIConnectionMessages.dialog_edit_driver_edit_maven_group_id_label,
    public EditMavenArtifactDialog(@NotNull Shell shell, @NotNull DriverDescriptor driver, @Nullable DriverLibraryMavenArtifact library) {
        return composite;
        final List<DriverLibraryMavenArtifact> artifacts = new ArrayList<>();
import org.eclipse.swt.custom.CLabel;
        artifactText.addModifyListener(ml);
                artifacts.add(lib);
package org.jkiss.dbeaver.ui.dialogs.driver;
            gd.widthHint = UIUtils.getFontHeight(composite.getFont()) * 40;
    private Combo fallbackVersionText;
        public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String name) {
        Composite container = new Composite(folder, SWT.NONE);
                }

        artifactText = UIUtils.createLabelText(container,
    private boolean ignoreDependencies;
 * DBeaver - Universal Database Manager
                state.offer(State.DEPENDENCY_GROUP_ID);

        public SAXMavenListener(@NotNull List<DriverLibraryMavenArtifact> artifacts) {
        DEPENDENCY_GROUP_ID,

            if (state.isEmpty()) {
    private void createDependencyDeclarationTab(@NotNull CTabFolder folder) {
        }
            });

                public void widgetSelected(SelectionEvent e) {
            }
            } else {
    private static final Log log = Log.getLog(EditMavenArtifactDialog.class);
        item.setData(TabType.DECLARE_ARTIFACT_MANUALLY);
                !CommonUtils.isEmpty(artifactText.getText()) &&

import org.eclipse.swt.layout.GridLayout;
                UIConnectionMessages.dialog_edit_driver_edit_maven_load_optional_dependencies_tip,
    @Override
                try {

                        UIUtils.asyncExec(EditMavenArtifactDialog.this::parseArtifactText);
                artifacts.add(lib);
            );
            } else if (state.peekLast() == State.DEPENDENCY && "groupId".equals(name)) {
            createDeclareArtifactManuallyTab(tabFolder);
        while (matcher.find()) {
    private final DriverDescriptor driver;
            } else if ((state.peekLast() == State.DEPENDENCIES && "dependencies".equals(name))

                    "",
                2);
            tabFolder.setLayoutData(gd);

 *     http://www.apache.org/licenses/LICENSE-2.0
                    break;
                state.offer(State.DEPENDENCY_ARTIFACT_ID);
                    MavenArtifactReference.VERSION_PATTERN_RELEASE
            classifierText.setEditable(false);
                    null,
                    log.debug("Error parsing dependency declaration", e);
        Composite container = new Composite(folder, SWT.NONE);
        }
            }
import org.jkiss.dbeaver.Log;
            }
                originalArtifact.setLoadOptionalDependencies(loadOptionalDependencies);
        if (selection != null && selection.getData() == TabType.DECLARE_ARTIFACT_MANUALLY) {
                state.removeLast();
import org.jkiss.utils.xml.XMLException;
    }
            } else if ((state.isEmpty() || state.element() == State.DEPENDENCIES) && "dependency".equals(name)) {
                    CommonUtils.notEmpty(name),
        updateButtons();
        DEPENDENCY_VERSION
                    artifacts.addAll(parseGradle());
    }
            // To change artifact info delete it and create a new one
                UIConnectionMessages.dialog_edit_driver_edit_maven_ignore_transient_dependencies,
                UIConnectionMessages.dialog_edit_driver_edit_maven_load_optional_dependencies,
    }
                originalArtifact.setReference(new MavenArtifactReference(
        preferredVersionText = UIUtils.createLabelText(container,
    private Text preferredVersionText;
    private void parseArtifactText() {
                artifacts.addAll(parseMaven());
        enableButton(IDialogConstants.OK_ID, !error);
}
