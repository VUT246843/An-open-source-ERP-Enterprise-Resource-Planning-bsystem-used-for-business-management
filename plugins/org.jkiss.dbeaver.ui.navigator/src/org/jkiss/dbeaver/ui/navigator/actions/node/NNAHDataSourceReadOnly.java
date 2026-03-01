/*

 * you may not use this file except in compliance with the License.

            return ((DBNDataSource) node).getDataSourceContainer().isConnectionReadOnly();

    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
/**

 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
                serviceConnections.openConnectionEditor(dataSourceContainer, "ConnectionPageGeneral");
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Read-only action handler

        if (node instanceof DBNDataSource) {
public class NNAHDataSourceReadOnly extends NavigatorNodeActionHandlerAbstract {
package org.jkiss.dbeaver.ui.navigator.actions.node;
    public String getNodeActionToolTip(INavigatorModelView view, DBNNode node) {
    @Override
        return "Connection is read-only.\nYou cannot change data or database structure.";
 *

import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
import org.jkiss.dbeaver.runtime.ui.UIServiceConnections;
        return UIIcon.BUTTON_READ_ONLY;
        if (node instanceof DBNDatabaseNode) {
    @Override

 */
    public DBPImage getNodeActionIcon(INavigatorModelView view, DBNNode node) {
            if (serviceConnections != null) {
        return false;
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.eclipse.swt.widgets.Event;
 */
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorNodeActionHandlerAbstract;
import org.jkiss.dbeaver.ui.UIIcon;
    }
 *
            DBPDataSourceContainer dataSourceContainer = ((DBNDatabaseNode) node).getDataSourceContainer();
    }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    @Override
 * Unless required by applicable law or agreed to in writing, software
    @Override
        }
import org.jkiss.dbeaver.model.DBPImage;
    public void handleNodeAction(INavigatorModelView view, DBNNode node, Event event, boolean defaultAction) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isEnabledFor(INavigatorModelView view, DBNNode node) {
}
            }
            UIServiceConnections serviceConnections = DBWorkbench.getService(UIServiceConnections.class);
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
