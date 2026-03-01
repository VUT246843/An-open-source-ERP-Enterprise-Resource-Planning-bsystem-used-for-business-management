                    } else {
 *
            if (partSite.getPart() instanceof IResultSetContainer) {
 * See the License for the specific language governing permissions and

public class ResultSetHandlerToggleMode extends ResultSetHandlerMain implements IElementUpdater {
                        element.setText("Switch to grid mode");
 *
}        if (element.getServiceLocator() instanceof IWorkbenchPartSite) {
                if (rsv != null) {
import org.eclipse.ui.menus.UIElement;
package org.jkiss.dbeaver.ui.controls.resultset.handler;
 * You may obtain a copy of the License at
 * limitations under the License.
                        element.setText("Switch to record mode");
            IWorkbenchPartSite partSite = (IWorkbenchPartSite) element.getServiceLocator();
 */
                    }
/*
                    if (!rsv.isRecordMode()) {
    public void updateElement(UIElement element, Map parameters)
        }
    {
 * DBeaver - Universal Database Manager
 * ResultSetHandlerMain
                        element.setChecked(true);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
 */
 * Unless required by applicable law or agreed to in writing, software
                        element.setChecked(false);
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.IWorkbenchPartSite;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.eclipse.ui.commands.IElementUpdater;
 *     http://www.apache.org/licenses/LICENSE-2.0

/**
    @Override
                IResultSetController rsv = ((IResultSetContainer) partSite.getPart()).getResultSetController();
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetContainer;
 * you may not use this file except in compliance with the License.

 *
import java.util.Map;
