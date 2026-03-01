import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
            getResultSetViewer().setDataFilter(filter, true);
 * limitations under the License.
        if (operator.getArgumentCount() != 0 && value == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.attribute = attribute;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (constraint != null) {
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.operator = operator;
        if (operator.getArgumentCount() == 0) {
            return operator.getExpression();
import org.jkiss.dbeaver.ui.UITextUtils;
 * Unless required by applicable law or agreed to in writing, software
        Object value = type.getValue(getResultSetViewer(), attribute, operator, false);
        super(resultSetViewer, attribute.getName() + " " + translateFilterPattern(resultSetViewer, operator, type, attribute));

        Object value = type.getValue(viewer, attribute, operator, true);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
    }
        strValue = UITextUtils.getShortText(viewer.getControl(), strValue, 150);
    @NotNull
            return;
 *
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    }
 *
        } else {
        DBCExecutionContext executionContext = viewer.getExecutionContext();
 * you may not use this file except in compliance with the License.
                strValue = "'" + strValue + "'";

    public void run()
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
    private final FilterByAttributeType type;
        DBDAttributeConstraint constraint = filter.getConstraint(attribute);
            constraint.setValue(value);
    private final DBCLogicalOperator operator;
            }
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        String strValue = executionContext == null ? String.valueOf(value) : attribute.getValueHandler().getValueDisplayString(attribute, value, DBDDisplayFormat.UI);
            if (!ResultSetViewer.CUSTOM_FILTER_VALUE_STRING.equals(strValue)) {
import org.jkiss.code.NotNull;
 *
    public FilterByAttributeAction(ResultSetViewer resultSetViewer, DBCLogicalOperator operator, FilterByAttributeType type, DBDAttributeBinding attribute)
package org.jkiss.dbeaver.ui.controls.resultset.actions;

            constraint.setOperator(operator);
            return operator.getExpression() + " " + strValue;
        strValue = strValue.replaceAll("\\s+", " ").replace("@", "^").trim();
}
        DBDDataFilter filter = new DBDDataFilter(getResultSetViewer().getModel().getDataFilter());
 */
public class FilterByAttributeAction extends AbstractResultSetViewerAction {
    private final DBDAttributeBinding attribute;

    private static String translateFilterPattern(@NotNull ResultSetViewer viewer, @NotNull DBCLogicalOperator operator, @NotNull FilterByAttributeType type, @NotNull DBDAttributeBinding attribute) {
    }
import org.jkiss.dbeaver.model.data.DBDDataFilter;
/*

        this.type = type;
    {
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
        }
 * See the License for the specific language governing permissions and
