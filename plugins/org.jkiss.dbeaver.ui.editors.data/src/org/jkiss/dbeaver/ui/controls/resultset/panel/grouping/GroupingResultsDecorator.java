        contributionManager.add(new ClearGroupingAction(container));
import org.jkiss.dbeaver.ui.controls.lightgrid.LightGrid;
        // Register drop target to accept columns dropping
            public void dragLeave(DropTargetEvent event) {
            @SuppressWarnings("unchecked")

/**
                if (!(event.data instanceof List)) {
        /*if (dialect == null) {
        DBPDataSource dataSource = container.getResultSetController().getDataContainer().getDataSource();

import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action.DeleteColumnAction;
        }
        } else */{
            }
 * you may not use this file except in compliance with the License.
            @Override
                    return;

            private void dropColumns(DropTargetEvent event) {
        } else {

import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action.EditColumnsAction;
                    if (element instanceof DBDAttributeBinding binding) {
            @Override
            private void handleDragEvent(DropTargetEvent event) {
            } else {
                    event.detail = DND.DROP_NONE;
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            gridDropListeners = null;
    public void fillContributions(@NotNull IContributionManager contributionManager) {
    public GroupingResultsDecorator(GroupingResultsContainer container) {
    public String getEmptyDataDescription() {

import org.jkiss.utils.ArrayUtils;
    }
        }
            return ResultSetMessages.results_decorator_no_groupings;

                    container.addGroupingAttributes(curAttributes);
import org.jkiss.dbeaver.model.sql.SQLUtils;
                List<Object> dropElements = (List<Object>) event.data;
                }
                        } else {
            }
    public void registerDragAndDrop(@NotNull IResultSetPresentation presentation) {
                        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                            if (currAttrs != null && attrBindingIndex < currAttrs.length) {
                }
                            }

            gridDropListeners = ((DropTarget) oldDropTarget).getDropListeners();
                            SQLGroupingAttribute[] currAttrs = dataContainer.getGroupingAttributes();
        if (dataSource == null) {
                handleDragEvent(event);

                }
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPresentation;
            public void dragOperationChanged(DropTargetEvent event) {
            return ResultSetMessages.results_decorator_no_connected_to_db;
        final DropTargetListener[] gridDropListeners;
                    }
                    }
 * See the License for the specific language governing permissions and
                    try {
    public String getEmptyDataMessage() {
                List<SQLGroupingAttribute> movedBindings = new ArrayList<>();
                    }
                }
                    int overColumnIndex = ((Spreadsheet) presentationControl).getColumnIndex(event.x, event.y);
                handleDragEvent(event);
                        return;
import java.util.ArrayList;
        dropTarget.addDropListener(new DropTargetAdapter() {
    }
                        overColumnIndex = curAttributes.size() - 1;
 *
import org.eclipse.jface.action.IContributionManager;
                if (event.detail == DND.DROP_MOVE || event.detail == DND.DROP_COPY) {


                if (!newBindings.isEmpty()) {
                    }
                        int attrBindingIndex = ArrayUtils.indexOf(container.getResultSetController().getModel().getAttributes(), binding);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.UIUtils;
            @Override
            public void dragEnter(DropTargetEvent event) {

                    container.addGroupingAttributes(newBindings);
                        if (dialog.open() != IDialogConstants.OK_ID) {
        SQLDialect dialect = SQLUtils.getDialectFromDataSource(dataSource);
                if (movedBindings.isEmpty() && newBindings.isEmpty()) {
            }
                    }
                        curAttributes.add(overColumnIndex, attr);
                return true;
            if (container.getGroupAttributes().isEmpty()) {
 * You may obtain a copy of the License at
                    } catch (DBException e) {
                        }
    public long getDecoratorFeatures() {
                UIUtils.asyncExec(() -> {

            }
import org.jkiss.code.NotNull;
                        DBWorkbench.getPlatformUI().showError(ResultSetMessages.results_decorator_error_grouping_error, ResultSetMessages.results_decorator_error_cant_perform_grouping_query, e);
import org.jkiss.dbeaver.model.sql.SQLGroupingAttribute;
                        GroupingConfigDialog dialog = new GroupingConfigDialog(container.getResultSetController().getControl().getShell(), container);
    @Override
                List<SQLGroupingAttribute> newBindings = new ArrayList<>();
        if (container.getGroupAttributes().isEmpty()) {

                    if (overColumnIndex < 0) {


                        curAttributes.remove(attr);
                    }
    @Override
                handleDragEvent(event);
                    return;

                }
                    container.clearGroupingAttributes();
        return FEATURE_PRESENTATIONS | FEATURE_FILTERS | FEATURE_COMPACT_FILTERS;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        dropTarget.setTransfer(LightGrid.GridColumnTransfer.INSTANCE);
        DropTarget dropTarget = new DropTarget(presentationControl, DND.DROP_MOVE | DND.DROP_COPY);
                            return;
        });
 * Decorator for grouping panel
            }
 *
            @Override
import org.jkiss.dbeaver.model.DBPDataSource;

                    if (overColumnIndex >= curAttributes.size()) {
import org.jkiss.dbeaver.DBException;
    @Override

                if (!movedBindings.isEmpty()) {

        contributionManager.add(new DeleteColumnAction(container));
import java.util.List;
            return NLS.bind(ResultSetMessages.results_decorator_grouping_is_not_supported, dataSource.getContainer().getDriver().getFullName());
            }
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping;
import org.jkiss.dbeaver.model.sql.SQLDialect;
        }
import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action.ClearGroupingAction;
                        container.rebuildGrouping();
                    // Reorder columns
        Control presentationControl = presentation.getControl();
            }
public class GroupingResultsDecorator extends ResultSetDecoratorBase {
                    List<SQLGroupingAttribute> curAttributes = new ArrayList<>(container.getGroupAttributes());
 * Unless required by applicable law or agreed to in writing, software
                    if (event.detail == DND.DROP_NONE) {
                handleDragEvent(event);
 */
import org.jkiss.dbeaver.ui.controls.resultset.spreadsheet.Spreadsheet;
            }
                                movedBindings.add(currAttrs[attrBindingIndex]);
                return ResultSetMessages.results_decorator_grouping_attempt_failed;
                        if (attrBindingIndex >= 0 && binding.getDataContainer() instanceof GroupingDataContainer dataContainer) {
                // TODO: check type
import org.jkiss.dbeaver.runtime.DBWorkbench;
                            newBindings.add(SQLGroupingAttribute.makeBound(binding));
 * DBeaver - Universal Database Manager
            ((DropTarget) oldDropTarget).dispose();
import org.eclipse.jface.dialogs.IDialogConstants;
            @Override
                                // It is column move, not new binding
        Object oldDropTarget = presentationControl.getData(DND.DROP_TARGET_KEY);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
import org.eclipse.swt.dnd.*;
            @Override
                return ResultSetMessages.results_decorator_drag_and_drop_results_column;
        }

        } else {
        contributionManager.add(new EditColumnsAction(container));
    }
            return ResultSetMessages.results_decorator_grouping_failed;
                    }
            }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
        this.container = container;
                } else {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                if (!isDropSupported(event)) {
            public void dragOver(DropTargetEvent event) {
import org.eclipse.swt.widgets.Control;
                    if (!(presentation.getControl() instanceof Spreadsheet)) {
                        return;
                handleDragEvent(event);
    private final GroupingResultsContainer container;
                for (Object element : dropElements) {
            public void dropAccept(DropTargetEvent event) {
                            container.clearGrouping();
                    if (event.detail == DND.DROP_COPY) {
            public void drop(DropTargetEvent event) {
    }
        if (oldDropTarget instanceof DropTarget) {
                    for (SQLGroupingAttribute attr : movedBindings) {
                //ArrayUtils.contains(event.dataTypes, LightGrid.GridColumnTransfer.INSTANCE);
 */
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetDecoratorBase;
            private boolean isDropSupported(DropTargetEvent event) {
                    dropColumns(event);
                        event.detail = DND.DROP_MOVE;

                event.feedback = DND.FEEDBACK_SELECT | DND.FEEDBACK_SCROLL;
/*
                });
 *
                }
                            // Check for group function - can't move function columns
                handleDragEvent(event);
    @Override
                    }
    @Override
}
