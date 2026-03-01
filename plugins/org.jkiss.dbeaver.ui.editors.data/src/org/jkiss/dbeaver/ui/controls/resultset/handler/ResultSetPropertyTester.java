
                    !actionsDisabled &&
 * limitations under the License.
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetEditor;
                        return rsv.getCurrentRow() != null;
                }

        } catch (Throwable e) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public static void firePropertyChange(String propName)
            case PROP_CAN_PASTE:
            case PROP_HAS_FILTERS:
                    } else {
    public static final String PROP_CAN_CUT = "canCut";
                            Object value = rsv.getModel().getCellValue(attr, row);
 *
                    return currentRow != null && currentRow.getVisualNumber() > 0;
import org.jkiss.dbeaver.ui.ActionUtils;
                return
 * DatabaseEditorPropertyTester
                    return rsv.isInsertable();

                return rsv.getModel().hasData();
    {
            case PROP_CAN_NAVIGATE_HISTORY:
            }
    @Override
        return false;
            }
            if (!DBWorkbench.getPlatform().isShuttingDown()) {

import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    public static final String PROP_HAS_MORE_DATA = "hasMoreData";
            case PROP_CAN_CUT: {
                } else if ("copy".equals(expectedValue) || "delete".equals(expectedValue)) {
    }
}                } else {
            case PROP_HAS_DATA:
                if ("edit".equals(expectedValue) || "inline".equals(expectedValue)) {
            return rsv != null && checkResultSetProperty(rsv, property, expectedValue);
            case PROP_CAN_MOVE: {
 * See the License for the specific language governing permissions and
    private static final String PROP_CHANGED = "changed";
    }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
            case PROP_CAN_TOGGLE:
        }
                    return currentRow != null && currentRow.getVisualNumber() < rsv.getModel().getRowCount() - 1;
            case PROP_CAN_SWITCH_PRESENTATION:
            case PROP_HAS_MORE_DATA:
                        return rsv.getHistoryPosition() > 0;
    public static final String PROP_HAS_FILTERS = "hasfilters";
    public static final String PROP_HAS_DATA = "hasData";
                    }
                log.debug(e);
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
                if (actionsDisabled || !rsv.supportsNavigation()) return false;
                }
    public static final String PROP_CAN_PASTE = "canPaste";
                    return false;
                return !actionsDisabled && rsv.supportsEdit();
                if (actionsDisabled || !rsv.supportsEdit()) {
 * Unless required by applicable law or agreed to in writing, software
                if (!actionsDisabled && rsv.getModel().hasData()) {
    public static final String NAMESPACE = "org.jkiss.dbeaver.core.resultset";
            return false;
                    !rsv.getAvailablePresentations().isEmpty();
{
 * you may not use this file except in compliance with the License.
                } else if ("forward".equals(expectedValue)) {
                break;
                    DBDAttributeBinding attr = rsv.getActivePresentation().getCurrentAttribute();
        boolean actionsDisabled = rsv.isActionsDisabled();
            }
                // FIXME: bug in Eclipse. To remove in future.
                    return false;
                    }
                    rsv.getDataContainer() != null &&
    {
                    return false;
                } else if ("add".equals(expectedValue)) {
                    return false;
                return rsv.isHasMoreData();
                return rsv.getModel().getDataFilter().hasFilters();
import org.jkiss.dbeaver.model.struct.DBSEntity;
                if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EDIT)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        switch (property) {
                return attr != null && rsv.getAttributeReadOnlyStatus(attr, true, true) == null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String PROP_CAN_COPY = "canCopy";
    public static final String PROP_CAN_SAVE_FILTERS = "canSaveFilters";
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
                    if (row != null) {
                return rsv.hasData() && rsv.isHasMoreData() &&
                    final ResultSetRow row = rsv.getCurrentRow();
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
                return !rsv.getModel().isUpdateInProgress();
 *
                    }
                if (!actionsDisabled && rsv.getModel().hasData()) {

 *
                ResultSetRow currentRow = rsv.getCurrentRow();
import org.jkiss.utils.CommonUtils;
            case PROP_CAN_PERSIST_DATA:

                    } else {
                }
                    return currentRow != null && rsv.isInsertable();
    public static final String PROP_EDITABLE = "editable";
/**
                    rsv.getDataContainer().isFeatureSupported(DBSDataContainer.FEATURE_DATA_COUNT);
    public static final String PROP_CAN_SWITCH_PRESENTATION = "canSwitchPresentation";
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
 */
/*
                return !actionsDisabled && rsv.isPresentationInFocus();
                    return false;
    private static final Log log = Log.getLog(ResultSetPropertyTester.class);
                    !rsv.isRefreshInProgress() &&
            case PROP_CAN_SAVE_FILTERS:
                        return rsv.getHistoryPosition() < rsv.getHistorySize() - 1;
    public static final String PROP_CAN_MOVE = "canMove";
    public static final String PROP_CAN_NAVIGATE_LINK = "canNavigateLink";
                return false;
                        if (attr != null) {

                    ResultSetRow currentRow = rsv.getCurrentRow();
    public static final String PROP_CAN_TOGGLE = "canToggle";
 * DBeaver - Universal Database Manager
                return !actionsDisabled && rsv.getModel().hasData();
    private boolean checkResultSetProperty(ResultSetViewer rsv, String property, Object expectedValue)
                        }
 * You may obtain a copy of the License at
import org.eclipse.core.expressions.PropertyTester;
                }
package org.jkiss.dbeaver.ui.controls.resultset.handler;
        }
                    if (expectedValue instanceof Number && ((Number)expectedValue).intValue() == 1 || "1".equals(expectedValue)) {
                        DBDAttributeBinding attr = rsv.getActivePresentation().getCurrentAttribute();
                    if ("inline".equals(expectedValue)) {
                return rsv.isDirty();
    public static final String PROP_SUPPORTS_COUNT = "supportsCount";
                            return !CommonUtils.isEmpty(attr.getReferrers()) && !DBUtils.isNullValue(value);
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static final String PROP_ACTIVE = "active";
            case PROP_ACTIVE:
public class ResultSetPropertyTester extends PropertyTester
    private static final String PROP_CAN_PERSIST_DATA = "canPersistData";
            case PROP_SUPPORTS_COUNT:
                if (actionsDisabled || !rsv.hasData() || !rsv.supportsEdit()) {
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
                DBDAttributeBinding attr = rsv.getActivePresentation().getCurrentAttribute();
                if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EDIT)) {
    public static final String PROP_CAN_NAVIGATE_HISTORY = "canNavigateHistory";
import org.jkiss.dbeaver.model.DBUtils;
                        return rsv.getAttributeReadOnlyStatus(attr, true, false) == null;
                return false;
            }
import org.eclipse.ui.IWorkbenchPart;
                        return false;
                    if (attr == null || !(rsv.getActivePresentation() instanceof IResultSetEditor)) {
            case PROP_EDITABLE: {
                }
            case PROP_CAN_COPY:
                return rsv.getDataContainer() instanceof DBSEntity;
                if ("back".equals(expectedValue)) {
                }
            case PROP_CHANGED:
    }
                }

            case PROP_CAN_NAVIGATE_LINK:
            ResultSetViewer rsv = (ResultSetViewer) ResultSetHandlerMain.getActiveResultSet((IWorkbenchPart)receiver);
                return true;
        try {
