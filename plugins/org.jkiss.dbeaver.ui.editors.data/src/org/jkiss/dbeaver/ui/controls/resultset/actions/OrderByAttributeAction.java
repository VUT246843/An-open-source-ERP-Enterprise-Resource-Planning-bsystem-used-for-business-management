    private final IResultSetController.ColumnOrder order;
 * You may obtain a copy of the License at

        boolean forceAsc = order == IResultSetController.ColumnOrder.ASC;
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class OrderByAttributeAction extends AbstractResultSetViewerAction {
/*

import org.jkiss.dbeaver.model.data.DBDDataFilter;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.DBeaverIcons;
        this.attribute = attribute;
            setImageDescriptor(DBeaverIcons.getImageDescriptor(order != IResultSetController.ColumnOrder.ASC ?
        }
    }
    public OrderByAttributeAction(ResultSetViewer resultSetViewer, DBDAttributeBinding attribute, IResultSetController.ColumnOrder order) {
                "Disable order by " + attribute.getName() :
        DBDAttributeConstraint constraint = dataFilter.getConstraint(attribute);
    @Override
import org.jkiss.dbeaver.ui.UIIcon;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isChecked() {
 * DBeaver - Universal Database Manager
    @Override

 * limitations under the License.
    private final DBDAttributeBinding attribute;
        super(
            order == IResultSetController.ColumnOrder.NONE ?
        if (order == IResultSetController.ColumnOrder.NONE) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (constraint == null || constraint.getOrderPosition() <= 0) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                UIIcon.SORT_INCREASE : UIIcon.SORT_DECREASE));
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
        DBDDataFilter dataFilter = getResultSetViewer().getModel().getDataFilter();

package org.jkiss.dbeaver.ui.controls.resultset.actions;

 * Unless required by applicable law or agreed to in writing, software
            return false;
 * you may not use this file except in compliance with the License.
 *
 *
    }
            resultSetViewer,
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
        return constraint.isOrderDescending() != forceAsc;
        this.order = order;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 */
    public void run() {
        }
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
            return false;
                "Order by " + attribute.getName() + " " + order.name(), AS_CHECK_BOX);
        if (order != IResultSetController.ColumnOrder.NONE) {
        }
        getResultSetViewer().toggleSortOrder(attribute, order);
}
