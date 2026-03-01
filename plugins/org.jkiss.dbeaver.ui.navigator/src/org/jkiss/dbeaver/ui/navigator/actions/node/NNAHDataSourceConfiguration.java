    @Override
        return false;

        return false;
import org.jkiss.dbeaver.model.navigator.DBNNode;

 * Configuration action handler


    public void handleNodeAction(INavigatorModelView view, DBNNode node, Event event, boolean defaultAction) {
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
    }
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBPImage getNodeActionIcon(INavigatorModelView view, DBNNode node) {
    public String getNodeActionToolTip(INavigatorModelView view, DBNNode node) {
 */
 * You may obtain a copy of the License at

 *
 * See the License for the specific language governing permissions and
    @Override
package org.jkiss.dbeaver.ui.navigator.actions.node;
    public boolean isSticky(INavigatorModelView view, DBNNode node) {
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
import org.eclipse.swt.widgets.Event;
        return DBIcon.OVER_LAMP;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    @Override
public class NNAHDataSourceConfiguration extends NavigatorNodeActionHandlerAbstract {


/**

 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBIcon;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorNodeActionHandlerAbstract;
        return node.getName() + " configuration";
    @Override
import org.jkiss.dbeaver.model.DBPImage;
 * you may not use this file except in compliance with the License.
    }
    public boolean isEnabledFor(INavigatorModelView view, DBNNode node) {

    }
    }
    @Override
