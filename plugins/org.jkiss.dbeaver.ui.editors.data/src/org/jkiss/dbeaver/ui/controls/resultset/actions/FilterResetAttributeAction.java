 */
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        super(resultSetViewer, NLS.bind(ResultSetMessages.controls_resultset_viewer_action_filter_remove, attribute.getName()), UIIcon.REVERT);
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
import org.eclipse.osgi.util.NLS;
}
    public void run() {
    private final DBDAttributeBinding attribute;
 *
        DBDDataFilter dataFilter = new DBDDataFilter(getResultSetViewer().getModel().getDataFilter());
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (constraint != null) {

        this.attribute = attribute;
public class FilterResetAttributeAction extends AbstractResultSetViewerAction {
 * you may not use this file except in compliance with the License.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
            constraint.setCriteria(null);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.data.DBDDataFilter;
    public FilterResetAttributeAction(ResultSetViewer resultSetViewer, DBDAttributeBinding attribute) {
 * limitations under the License.
    }
package org.jkiss.dbeaver.ui.controls.resultset.actions;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;

 * distributed under the License is distributed on an "AS IS" BASIS,
            getResultSetViewer().setDataFilter(dataFilter, true);

        }
 * Unless required by applicable law or agreed to in writing, software
        DBDAttributeConstraint constraint = dataFilter.getConstraint(attribute);
