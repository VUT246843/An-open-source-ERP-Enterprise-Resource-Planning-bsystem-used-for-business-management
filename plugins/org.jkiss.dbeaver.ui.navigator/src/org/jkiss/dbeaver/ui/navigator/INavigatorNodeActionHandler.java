
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface INavigatorNodeActionHandler {
 * Licensed under the Apache License, Version 2.0 (the "License");
    String getNodeActionToolTip(INavigatorModelView view, DBNNode node);


    boolean isEnabledFor(INavigatorModelView view, DBNNode node);
 * Node action handler
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Event;
 * See the License for the specific language governing permissions and

 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
 * limitations under the License.
}
import org.jkiss.dbeaver.model.DBPImage;
 * You may obtain a copy of the License at
/**
/*
 */
    boolean isSticky(INavigatorModelView view, DBNNode node);
package org.jkiss.dbeaver.ui.navigator;
import org.jkiss.dbeaver.model.navigator.DBNNode;
 *

 *
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
    void handleNodeAction(INavigatorModelView view, DBNNode node, Event event, boolean defaultAction);

    DBPImage getNodeActionIcon(INavigatorModelView view, DBNNode node);
