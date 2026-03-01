 */
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
            c.removeOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED);
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public FilterResetAllPinsAction(ResultSetViewer resultSetViewer) {
 *

    @Override
 *
public class FilterResetAllPinsAction extends AbstractResultSetViewerAction {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDAttributeConstraintBase;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

        if (constraints == null) {
            return;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import java.util.List;



        if (refresh) {
        execute(true);
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        for (DBDAttributeConstraint c : constraints) {
package org.jkiss.dbeaver.ui.controls.resultset.actions;
    }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    }
 * See the License for the specific language governing permissions and
    }
        List<DBDAttributeConstraint> constraints = getResultSetViewer().getDataFilter().getConstraints();
    public void run() {
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
        }
 * DBeaver - Universal Database Manager
    void execute(boolean refresh) {
/*
            getResultSetViewer().redrawData(true, true);
 *
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        super(resultSetViewer, ResultSetMessages.controls_resultset_viewer_action_reset_all_pins);

