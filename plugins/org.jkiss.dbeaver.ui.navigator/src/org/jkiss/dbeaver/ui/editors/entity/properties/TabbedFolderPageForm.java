        saveButton.setEnabled(isDirty);
                if (placeholder.getChildren().length == 0) {
/*
            if (widthHint > 0) {
                layout |= layoutPropertyColumn(column, widthHint);
        if (curPropertySource != null && curPropertySource.getEditableValue() instanceof DBSObject) {
    public RefreshResult refreshPart(Object source, boolean force) {
            return;
        return RefreshResult.IGNORED;
                layout.minNumColumns = 1;
            // Create edit forms

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
*/
                if (linkData instanceof DBSObject dbsObject) {
    @Override
import org.jkiss.dbeaver.model.impl.edit.DBECommandAdapter;
    private static int getPropertyCategory(@NotNull DBPPropertyDescriptor property, @NotNull DBPPropertySource source) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                if (ownerControl.isDisposed()) {
    @Override
        layoutPropertyColumns(propertiesGroup);
        if (ownerEditor != null) {
    }
import org.jkiss.dbeaver.ui.LoadingJob;
                "Load '" + DBValueFormatting.getDefaultValueDisplayString(
                    });
        CSSUtils.markConnectionTypeColor(propertiesGroupHost);

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
        }
                        UIUtils.asyncExec(afterRefresh);
    private static boolean layoutPropertyColumn(@NotNull Collection<Composite> rows, int widthHint) {
            GridData gd;
    }
            return;
            composite.layout(true, true);
                    .layoutData(new ColumnLayoutData())

import org.eclipse.jface.widgets.CompositeFactory;
 * See the License for the specific language governing permissions and
                public Map<DBPPropertyDescriptor, Object> evaluate(@NotNull DBRProgressMonitor monitor) {
        IWorkbenchPartSite site = part.getSite();
        if (databaseObject == null) {
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
        boolean firstInit = !formEditor.hasEditors();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.css.CSSUtils;
    public void setFocus() {
import java.util.stream.Collectors;
    private Button revertButton;
        lastPersistedState = objectPersisted;
                var placeholder = CompositeFactory.newComposite(SWT.NONE)
                formEditor.loadEditorValues(editorValues);
        } else if (!(property instanceof ObjectPropertyDescriptor opd) || !opd.isSpecific()) {
    private transient boolean lastPersistedState;
                @Override

import org.jkiss.dbeaver.model.edit.prop.DBECommandProperty;
    private Button scriptButton;
 * You may obtain a copy of the License at
            @Override
import org.eclipse.jface.action.IContributionManager;
 * DBeaver - Universal Database Manager
                public void onCommandChange(DBECommand<?> command) {
        if (layout) {
            int widthHint = computePropertyColumnWidth(column);

import org.jkiss.dbeaver.model.DBValueFormatting;
        boolean isDirty = commandContext != null && commandContext.isDirty();

            Control key = row.getChildren()[0];


import org.jkiss.dbeaver.Log;
        service.addJobChangeListener(new JobChangeAdapter() {

        };
                            break;
    private Button saveButton;
                }
                // Prepare property lists
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
        DBECommandContext commandContext = input.getCommandContext();
    private final IWorkbenchPart part;
    private final CustomFormEditor formEditor;

    }
            } else {
                        updateEditButtonsState();

            public void done(IJobChangeEvent event) {
            curPropertySource = null;
 *
                gd = data;
            List<DBPPropertyDescriptor> sortedProps = new ArrayList<>(allProps);
        }
                .comparingInt((DBPPropertyDescriptor prop) -> getPropertyCategory(prop, curPropertySource)));
                propertiesGroup.addControlListener(ControlListener.controlResizedAdapter(e -> layoutProperties()));
    private void refreshProperties(@Nullable Runnable afterRefresh) {
            return 100;
            }
import org.jkiss.dbeaver.model.edit.DBECommand;
            Control key = row.getChildren()[0];
                gd.widthHint = widthHint;
import org.eclipse.ui.part.MultiPageEditorSite;
        if (databaseObject == null) {
            }

                            // Simple value compare on update is not enough because value can be transformed (e.g. uppercased)
                propertiesGroup.setLayout(layout);

        propertiesGroup.setFocus();
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;

    private static int computePropertyColumnWidth(@NotNull List<Composite> rows) {
            }
/*
import org.eclipse.ui.part.MultiPageEditorPart;
                    if (afterRefresh != null) {

            refreshProperties(afterRefresh);
                        }
public class TabbedFolderPageForm extends TabbedFolderPage implements IRefreshablePart, ICustomActionsProvider {
        for (Composite row : rows) {

 *
        UIUtils.installAndUpdateMainFont(propertiesGroup);
        for (Composite row : rows) {
                            formEditor.updateOtherPropertyValues(propId);
        }
import org.jkiss.code.Nullable;
        DBSObject databaseObject = input.getDatabaseObject();
import org.eclipse.ui.forms.widgets.ColumnLayoutData;
        boolean objectPersisted = databaseObject.isPersisted();
        propertiesGroup.layout(true, true);
    private void refreshProperties(){
            sortedProps.sort(Comparator
            public void run() {
import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderPage;
            }
        }
                databaseObject.getDataSource()) {
                }
        } else if (property.isEditable(source.getEditableValue())) {
        return layout;
                    return propValues;
            return RefreshResult.REFRESHED;

                layout = true;

    private final IDatabaseEditorInput input;
    TabbedFolderPageForm(IWorkbenchPart part, ObjectEditorPageControl ownerControl, IDatabaseEditorInput input) {

        }

        if (force) {
    public void aboutToBeShown() {
    @Override
            }
                layout.horizontalSpacing = 10;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.stream.Stream;
        EntityEditor ownerEditor = getOwnerEditor();
        revertButton.setEnabled(isDirty);
    }
            widthHint = Math.max(widthHint, key.computeSize(bounds.width, bounds.height).x);
        }
 */
        super.dispose();
            }
import org.eclipse.swt.widgets.Button;
        contributionManager.add(new Action(isAttached() ? "Detach properties to top panel" : "Move properties to tab", DBeaverIcons.getImageDescriptor(UIIcon.ASTERISK)) {
        Collection<List<Composite>> columns = Stream.of(composite.getChildren())
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.SWT;
                    log.warn("Exception after refreshing in TabbedFolderPageForm", e);
            protected void openObjectLink(Object linkData) {
import org.jkiss.dbeaver.ui.controls.ObjectEditorPageControl;
                }
                    UIUtils.asyncExec(() -> {
            .collect(Collectors.groupingBy(child -> child.getLocation().x))
            },
    private Composite propertiesGroup;


                }
                }
            })
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.eclipse.swt.custom.ScrolledComposite;

    }
            if (key.getLayoutData() instanceof GridData data) {
        }
import org.jkiss.dbeaver.ui.ICustomActionsProvider;
        }
                    Map<DBPPropertyDescriptor, Object> propValues = new HashMap<>();
            new DatabaseLoadService<>(
    }
        boolean layout = false;

        }
            if (firstInit) {
import org.eclipse.ui.forms.widgets.ColumnLayout;
        });
import org.eclipse.swt.widgets.Control;
        for (List<Composite> column : columns) {
        DBSObject databaseObject = input.getDatabaseObject();
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ui.controls.CustomFormEditor;
        return null;
                    UIUtils.asyncExec(() -> {
                    return;
            CSSUtils.markConnectionTypeColor(x);
    @Override

            DatabaseEditorUtils.contributeStandardEditorActions(part.getSite(), contributionManager);
 *
        boolean objectStateChanged = objectPersisted != lastPersistedState;
import org.jkiss.code.NotNull;
        if (firstInit || objectStateChanged) {
            .map(Composite.class::cast)
        refreshProperties();



    private final ObjectEditorPageControl ownerControl;
        }
import org.eclipse.swt.widgets.Composite;
        boolean layout = false;
 * you may not use this file except in compliance with the License.
            return 1;

            MultiPageEditorPart mainEditor = mpe.getMultiPageEditor();
            }
                    }
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
        if (commandContext != null) {
    }
    private void updateEditButtonsState() {
            Rectangle bounds = key.getBounds();

                ColumnLayout layout = new ColumnLayout();



                    .layout(GridLayoutFactory.fillDefaults().numColumns(2).create())
            return 1000;
import org.jkiss.dbeaver.ui.UIUtils;

        List<DBPPropertyDescriptor> allProps = formEditor.filterProperties(curPropertySource.getProperties());
                    propertySource.getEditableValue(), DBDDisplayFormat.UI) + "' properties",
    private void layoutProperties() {
import java.util.*;
        }
        }
 * TabbedFolderPageProperties

            }
    }
        // Refresh props only on force refresh (manual)
        for (Control x : propertiesGroup.getChildren()) {
                        updateEditButtonsState();
                        refreshProperties();
                }
                    NavigatorHandlerObjectOpen.openEntityEditor(dbsObject);
import org.eclipse.ui.IWorkbenchPartSite;
        if (part != null) {
        refreshProperties(null);

import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;

    private boolean activated;
    private static void layoutPropertyColumns(@NotNull Composite composite) {
                        }
    }
}        this.ownerControl = ownerControl;
                @Override
/**
                }
        this.formEditor = new CustomFormEditor(input.getDatabaseObject(), input.getCommandContext(), input.getPropertySource()) {
            ownerControl.createDefaultLoadVisualizer(editorValues -> {

        );
            if (!firstInit) {
        }
    }
            updateEditButtonsState();
    public RefreshResult refreshPart(boolean force, @Nullable Runnable afterRefresh) {
    }
        DBECommandContext commandContext = input.getCommandContext();
                            // We need to exclude current prop from update
        if (!activated) {

                UIUtils.disposeChildControls(propertiesGroup);
            .values();
        if (curPropertySource == null) {
                        if (monitor.isCanceled()) {
                } catch (Exception e) {
    private void showAlterScript() {
    }
            commandContext.addCommandListener(new DBECommandAdapter() {
                        Object value = propertySource.getPropertyValue(monitor, prop.getId());
        curPropertySource = input.getPropertySource();
    }
        propertiesGroup.addDisposeListener(e -> dispose());
import org.eclipse.jface.layout.GridLayoutFactory;
                    });
            ownerEditor.showChanges(false);
    }
        if (saveButton == null || saveButton.isDisposed()) {
    }
import org.jkiss.dbeaver.ui.IRefreshablePart;
                try {

 *     http://www.apache.org/licenses/LICENSE-2.0
                public void onReset() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        UIUtils.configureScrolledComposite(propertiesGroupHost, propertiesGroup);
                    UIUtils.asyncExec(() -> updateEditButtonsState());
        ScrolledComposite propertiesGroupHost = UIUtils.createScrolledComposite(parent, SWT.V_SCROLL);
                    placeholder.dispose();
                detachPropertiesPanel();
                layout.maxNumColumns = 3;
            // Disposed
    public void fillCustomActions(IContributionManager contributionManager) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
import org.jkiss.dbeaver.model.DBConstants;
            for (DBPPropertyDescriptor prop : sortedProps) {
        curPropertySource = input.getPropertySource();
    private DBPPropertySource curPropertySource;
                public void onSave() {
                formEditor.clearEditors();
                }
                    }
        DBPPropertySource propertySource = TabbedFolderPageForm.this.curPropertySource;
            }
        }
    @Override
        }
    @Override
    public void createControl(Composite parent) {
            activated = true;
    public void dispose() {
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
                if (blockEnableState != null) {
        refreshPropertyValues(allProps, firstInit, afterRefresh);

            @Override
import org.eclipse.ui.IWorkbenchPart;
                @Override
        scriptButton.setEnabled(isDirty);
            return;
        }

        this.input = input;
                formEditor.createPropertyEditor(placeholder, prop);
            });
            if (mainEditor instanceof EntityEditor ee) {

        });
                            // and it will differ from the value in edit control
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
    }
package org.jkiss.dbeaver.ui.editors.entity.properties;
    private EntityEditor getOwnerEditor() {
                // Dispose old editor
                            Object propId = cp.getHandler().getId();
        this.part = part;

 * limitations under the License.
        propertiesGroup = new Composite(propertiesGroupHost, SWT.NONE);
        disableControls = false;

import org.eclipse.jface.dialogs.ControlEnableState;
        return refreshPart(force, null);
        }
        } else {
                return ee;
    }
                    blockEnableState.restore();
                gd = new GridData();
        }

                }
        if (site instanceof MultiPageEditorSite mpe) {

                    .create(propertiesGroup);

    private void refreshPropertyValues(List<DBPPropertyDescriptor> allProps, boolean disableControls, Runnable afterRefresh) {
    }
        if (property.getId().equals(DBConstants.PROP_ID_NAME) || property.getId().equals(DBConstants.PROP_ID_DESCRIPTION)) {
        LoadingJob<Map<DBPPropertyDescriptor, Object>> service = LoadingJob.createService(
            return;
            }
        return widthHint;
            return 10;
                    for (DBPPropertyDescriptor prop : allProps) {
        int widthHint = 0;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        ownerControl.runService(service);
                        if (command instanceof DBECommandProperty<?> cp) {
import org.eclipse.swt.graphics.Rectangle;
 */
                        propValues.put(prop, value);
        ControlEnableState blockEnableState = disableControls ? ControlEnableState.disable(propertiesGroup) : null;
            layoutProperties();
            @Override
                key.setLayoutData(gd);
            if (gd.widthHint != widthHint) {
    private static final Log log = Log.getLog(TabbedFolderPageForm.class);
                @Override
