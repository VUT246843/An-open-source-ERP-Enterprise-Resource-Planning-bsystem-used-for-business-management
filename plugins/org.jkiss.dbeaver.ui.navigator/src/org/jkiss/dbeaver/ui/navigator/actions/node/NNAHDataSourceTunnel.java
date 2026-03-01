                    tip.append(": ").append(hostName);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public DBPImage getNodeActionIcon(INavigatorModelView view, DBNNode node) {
    public boolean isEnabledFor(INavigatorModelView view, DBNNode node) {
                if (nhc.isEnabled() && nhc.getType() == DBWHandlerType.TUNNEL) {
            DBPDataSourceContainer dataSourceContainer = ((DBNDatabaseNode) node).getDataSourceContainer();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    @Override
        return tip.toString();
                String hostName = handler.getStringProperty(DBWHandlerConfiguration.PROP_HOST);
        for (DBWHandlerConfiguration handler : DBWUtils.getActualNetworkHandlers(((DBNDataSource) node).getDataSourceContainer())) {
        }
            }
            for (DBWHandlerConfiguration nhc : DBWUtils.getActualNetworkHandlers(dataSourceContainer)) {
        }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.widgets.Event;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *
/*
                serviceConnections.openConnectionEditor(dataSourceContainer, "ConnectionPageNetworkHandler." + nhId);
 * Tunnel action handler
        return false;
    public void handleNodeAction(INavigatorModelView view, DBNNode node, Event event, boolean defaultAction) {
                    nhId = nhc.getId();
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
    }

import org.jkiss.utils.CommonUtils;
        StringBuilder tip = new StringBuilder("Network handlers enabled:");
 */
 * You may obtain a copy of the License at
            UIServiceConnections serviceConnections = DBWorkbench.getService(UIServiceConnections.class);
                tip.append("\n  -").append(handler.getTitle());

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

    }
 *
                }
import org.jkiss.dbeaver.ui.UIIcon;
            return dbnDataSource.hasNetworkHandlers();
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    }
/**
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    break;
import org.jkiss.dbeaver.model.DBPImage;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.net.DBWUtils;
    public String getNodeActionToolTip(INavigatorModelView view, DBNNode node) {
            if (serviceConnections != null) {



 * See the License for the specific language governing permissions and
            }
        if (node instanceof DBNDatabaseNode) {
            }
        return UIIcon.BUTTON_TUNNEL;
                if (!CommonUtils.isEmpty(hostName)) {
package org.jkiss.dbeaver.ui.navigator.actions.node;
                }
        }
    }

            if (handler.isEnabled()) {
public class NNAHDataSourceTunnel extends NavigatorNodeActionHandlerAbstract {
import org.jkiss.dbeaver.runtime.ui.UIServiceConnections;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
    @Override
 * limitations under the License.
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
import org.jkiss.dbeaver.model.navigator.DBNNode;
 */
            String nhId = null;
        if (node instanceof DBNDataSource dbnDataSource) {
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorNodeActionHandlerAbstract;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.net.DBWHandlerType;
