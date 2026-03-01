    }
            log.warn("Error loading custom entities", e);
            .map(DBNDatabaseNode::getValueObject)
    }
            });
                } else if (CommonUtils.isNotEmpty(dataSource.getCurrentCatalog())) {
 * distributed under the License is distributed on an "AS IS" BASIS,

                if (CommonUtils.isNotEmpty(dataSource.getCurrentSchema())) {
        setLayout(GridLayoutFactory.fillDefaults().margins(0, 0).numColumns(5).create());
        @NotNull Shell shell,
            }
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        return AITextUtils.loadCustomEntities(monitor, executionContext.getDataSource(), checkedObjectIds);
        return executionContext;
import org.eclipse.swt.widgets.*;

    }
            // Find nodes of already selected objects

            scopeCombo.add(scope.getTitle());
        scopeText.setEditable(false);
            return null;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            context.run(true, true, monitor -> {

        scopeConfigItem = UIUtils.createToolItem(
    private final ToolItem scopeConfigItem;
            return null;
                if (CommonUtils.isNotEmpty(dataSource.getCurrentCatalog())) {
 *
        @NotNull DBCExecutionContext executionContext,
        );

        @NotNull AICompletionSettings settings
        scopeCombo = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
    @NotNull

            }
    private final ToolBar toolBar;
    public AIDatabaseScope getScope() {
                for (DBSObject entity : AITextUtils.loadCustomEntities(monitor, dataSource, ids)) {
        AIUtils.updateScopeSettingsIfNeeded(settings, dataSource.getDataSourceContainer(), executionContext);
        @NotNull Set<String> ids
import org.jkiss.dbeaver.model.DBPDataSource;
}
import org.jkiss.utils.ArrayUtils;
    public List<DBSObject> getCustomEntities(@NotNull DBRProgressMonitor monitor) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.ai.utils.AIUtils;
                }
                }

            );

        }

        if (selected == null) {
            toolBar,
    }
import org.jkiss.dbeaver.model.navigator.DBNNode;
    @NotNull
        scopeConfigItem.setEnabled(scope == AIDatabaseScope.CUSTOM);
        this.executionContext = executionContext;
import org.eclipse.swt.SWT;
            .map(DBUtils::getObjectFullId)
import org.eclipse.jface.dialogs.IDialogConstants;
    }
    }
                    yield dataSource.getCurrentSchema();

            .map(DBSObject.class::cast)
    public Set<String> getCheckedObjectIds() {

            }
        final String text = switch (scope) {
import java.util.*;
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.ui.UIUtils;
        DBNModel navigator = Objects.requireNonNull(dataSource.getContainer().getProject().getNavigatorModel());
import org.jkiss.dbeaver.model.ai.AICompletionSettings;
        });
        List<DBNDatabaseNode> nodes = new ArrayList<>();
public class ScopeSelectorControl extends Composite {

                    if (node != null) {
        }
        scopeText = new Text(this, SWT.READ_ONLY | SWT.BORDER);
    public Combo getScopeCombo() {
        layout(true, true);
            }
        }
package org.jkiss.dbeaver.ui.ai.controls;

    @NotNull

import org.jkiss.dbeaver.model.DBUtils;
            public void widgetSelected(SelectionEvent e) {
        currentScope = scope;

                } else {
        return dataSource;
        showScopeSettings(currentScope);
    public ScopeSelectorControl(
        return scopeCombo;
        List<? extends DBNNode> selected = dialog.getSelectedNodes();
                    yield dataSource.getCurrentCatalog();
            @Override
                return;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.lang.reflect.InvocationTargetException;
    public void setInput(@NotNull DBSLogicalDataSource dataSource, @NotNull DBCExecutionContext executionContext) {
            if (ids == null) {
 *
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    private void showScopeSettings(@NotNull AIDatabaseScope scope) {
    @NotNull

    public void changeScope(@NotNull AIDatabaseScope scope) {
        return selected.stream()
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.Log;
                    DBNDatabaseNode node = navigator.getNodeByObject(monitor, entity, true);
    }
        if (scope == AIDatabaseScope.CUSTOM) {
            SelectionListener.widgetSelectedAdapter(e -> changeScope(AIDatabaseScope.CUSTOM))
        }

import org.eclipse.jface.layout.GridLayoutFactory;
import java.util.stream.Collectors;
            UIIcon.RS_DETAILS,

        requestLayout();
    }
            .map(DBNDatabaseNode.class::cast)
 * You may obtain a copy of the License at
                    yield dataSource.getCurrentCatalog();
        return scopeText;

 * you may not use this file except in compliance with the License.
                changeScope(CommonUtils.fromOrdinal(AIDatabaseScope.class, scopeCombo.getSelectionIndex()));

        showScopeSettings(currentScope);
            case CURRENT_DATABASE -> {
            List<String> ids = chooseCustomEntities(
        }
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

        @NotNull DBSLogicalDataSource dataSource,
                    yield dataSource.getDataSourceContainer().getName();
import org.jkiss.dbeaver.model.navigator.DBNModel;
        super(parent, SWT.NONE);
        };
    public DBCExecutionContext getExecutionContext() {
 * Unless required by applicable law or agreed to in writing, software
        showScopeSettings(scope);

            case CURRENT_DATASOURCE -> dataSource.getDataSourceContainer().getName();
    }
        try {
            case CURRENT_SCHEMA -> {
    @Nullable
import org.jkiss.dbeaver.model.ai.AIDatabaseScope;
        this.dataSource = dataSource;
            }
    private final Text scopeText;
                checkedObjectIds
 * Copyright (C) 2010-2025 DBeaver Corp and others
        checkedObjectIds.clear();
                    }
    }
                getShell(),
import org.jkiss.code.Nullable;
        @NotNull DBRRunnableContext context,
                }
        scopeText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            default -> checkedObjectIds.size() + " object(s)";


    }
    }
    private DBSLogicalDataSource dataSource;
                scopeCombo.select(scopeCombo.getItemCount() - 1);



import org.jkiss.dbeaver.model.logical.DBSLogicalDataSource;
        ScopeSelectorDialog dialog = new ScopeSelectorDialog(shell, context, dataSource.getContainer(), executionContext, nodes);
    public ToolBar getToolBar() {
    ) {
        this.dataSource = dataSource;
            "Customize",


    public Text getScopeText() {
        scopeCombo.addSelectionListener(new SelectionAdapter() {
                        nodes.add(node);

            checkedObjectIds.addAll(ids);
                UIUtils.getDefaultRunnableContext(),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!ArrayUtils.isEmpty(settings.getCustomObjectIds())) {
    private DBCExecutionContext executionContext;
 * DBeaver - Universal Database Manager
    private final Combo scopeCombo;
        this.executionContext = executionContext;
    private final Set<String> checkedObjectIds;
 * limitations under the License.
    @NotNull

        this.currentScope = settings.getScope();


                executionContext,
import org.jkiss.code.NotNull;
        scopeText.setText(CommonUtils.toString(text, "N/A"));
            checkedObjectIds.addAll(Arrays.asList(settings.getCustomObjectIds()));
        }

        @NotNull Composite parent,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
        DBPDataSource dataSource = executionContext.getDataSource();
import org.jkiss.dbeaver.model.struct.DBSObject;
 */
        toolBar = new ToolBar(this, SWT.FLAT);
        for (AIDatabaseScope scope : AIDatabaseScope.values()) {
            .collect(Collectors.toList());
    ) {

import org.jkiss.dbeaver.model.ai.AITextUtils;
    public static List<String> chooseCustomEntities(
        if (dialog.open() != IDialogConstants.OK_ID) {
                    yield dataSource.getDataSourceContainer().getName();
        return currentScope;
    public DBSLogicalDataSource getDataSource() {
    private static final Log log = Log.getLog(ScopeSelectorControl.class);

        this.checkedObjectIds = new LinkedHashSet<>();

        return toolBar;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
    @NotNull
        return checkedObjectIds;
    private AIDatabaseScope currentScope;
        toolBar.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
                } else {

/*
import java.util.List;
            if (currentScope == scope) {
import org.eclipse.swt.layout.GridData;
    @NotNull
    @NotNull

        @NotNull DBCExecutionContext executionContext,
    }
        } catch (InvocationTargetException | InterruptedException e) {
