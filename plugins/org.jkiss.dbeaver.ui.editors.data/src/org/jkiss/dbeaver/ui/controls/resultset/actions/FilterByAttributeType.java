    CLIPBOARD(ResultSetMessages.controls_resultset_viewer_action_filter_clipboard, UIIcon.FILTER_CLIPBOARD) {
                if (rows == null || rows.length == 0) {
    public abstract Object getValue(@NotNull ResultSetViewer viewer, @NotNull DBDAttributeBinding attribute, @NotNull DBCLogicalOperator operator, boolean useDefault);
 *     http://www.apache.org/licenses/LICENSE-2.0
            return cellValue;
import org.jkiss.code.NotNull;
                        return "%" + value + "%";
                return value;
                    return null;
 * Unless required by applicable law or agreed to in writing, software
                    Collection<ResultSetRow> selectedRows = viewer.getSelection().getSelectedRows();
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
                } else {
        }
            if (attribute == null || row == null) {
                        rows = new ResultSetRow[] { focusRow };
    },
            return null;
        this.title = title;
                    rows = selectedRows.toArray(new ResultSetRow[0]);
import java.util.Collection;
    VALUE(ResultSetMessages.controls_resultset_viewer_action_filter_value, UIIcon.FILTER_VALUE) {
                    return null;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        public Object getValue(@NotNull ResultSetViewer viewer, @NotNull DBDAttributeBinding attribute, @NotNull DBCLogicalOperator operator, boolean useDefault)

    final String title;


    },
import org.jkiss.dbeaver.ui.controls.resultset.valuefilter.FilterValueEditDialog;
    @Nullable
 */

            if (operator.isWildcardOperator() && cellValue != null) {

                return null;
        {
                } else {
    },
import org.jkiss.dbeaver.ui.UIIcon;
                }
                }
                ResultSetRow[] rows = null;
        @Override
            Object cellValue = viewer.getModel().getCellValue(attribute, row);
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetUtils;
package org.jkiss.dbeaver.ui.controls.resultset.actions;
            }
 * limitations under the License.
}
                }
        @Override
                    }
        {
public enum FilterByAttributeType {
 *
 *
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
                if (operator.isWildcardOperator() && value instanceof String && ((String) value).indexOf('%') < 0) {
    final ImageDescriptor icon;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.icon = DBeaverIcons.getImageDescriptor(icon);
        @Override
            if (useDefault) {
                    return "%" + value + "%";
import org.eclipse.jface.dialogs.IDialogConstants;
                    if (focusRow != null) {
                if (operator.getArgumentCount() < 0) {
            try {
            }
                }
/*

        return title;

 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
            }
                    if (operator.isWildcardOperator() && value instanceof String && ((String) value).indexOf('%') < 0) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                return null;
        }
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
            } else {
        public Object getValue(@NotNull ResultSetViewer viewer, @NotNull DBDAttributeBinding attribute, @NotNull DBCLogicalOperator operator, boolean useDefault)
            } catch (Exception e) {
    INPUT(ResultSetMessages.controls_resultset_viewer_action_filter_input, UIIcon.FILTER_INPUT) {
                log.debug("Error copying from clipboard", e);
                return ResultSetViewer.CUSTOM_FILTER_VALUE_STRING;
        public Object getValue(@NotNull ResultSetViewer viewer, @NotNull DBDAttributeBinding attribute, @NotNull DBCLogicalOperator operator, boolean useDefault)
                Object value = ResultSetUtils.getAttributeValueFromClipboard(attribute);
            }
    };
    public String getTitle() {
import org.jkiss.dbeaver.Log;
                    ResultSetRow focusRow = viewer.getCurrentRow();
        {
                    }
    FilterByAttributeType(String title, DBPImage icon) {
            final ResultSetRow row = viewer.getCurrentRow();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
                cellValue = "%" + cellValue + "%";
 * You may obtain a copy of the License at
 *
    }
import org.jkiss.code.Nullable;
                FilterValueEditDialog dialog = new FilterValueEditDialog(viewer, attribute, rows, operator);
                    Object value = dialog.getValue();
                    return value;
        }
        }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
    NONE("None", UIIcon.FILTER_VALUE) {
import org.eclipse.jface.resource.ImageDescriptor;
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.ui.DBeaverIcons;
                if (dialog.open() == IDialogConstants.OK_ID) {
    }

        @Override
        public Object getValue(@NotNull ResultSetViewer viewer, @NotNull DBDAttributeBinding attribute, @NotNull DBCLogicalOperator operator, boolean useDefault)
    private static final Log log = Log.getLog(ResultSetViewer.class);
        {
