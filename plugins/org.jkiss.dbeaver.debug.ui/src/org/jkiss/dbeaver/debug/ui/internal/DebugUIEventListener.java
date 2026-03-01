 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.UIUtils;
    private static final Log log = Log.getLog(DebugUIEventListener.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
                    break;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void handleDebugEvents(DebugEvent[] events) {
 * You may obtain a copy of the License at

        }
import org.eclipse.core.runtime.CoreException;
    private void hideView(IWorkbenchPage activePage, String viewId) {
    private void showDebugViews(boolean show) {
 *
                } else {
public class DebugUIEventListener implements IDebugEventSetListener {
            try {
 * See the License for the specific language governing permissions and
 */
        if (view != null) {


                if (show) {
                    activePage.showView(IDebugUIConstants.ID_VARIABLE_VIEW);
        IWorkbenchPage activePage = window.getActivePage();

            }
 * you may not use this file except in compliance with the License.

                    hideView(activePage, IDebugUIConstants.ID_BREAKPOINT_VIEW);
        }
    }
import org.eclipse.debug.core.IDebugEventSetListener;
        IViewPart view = activePage.findView(viewId);
 * DBeaver - Universal Database Manager
import org.eclipse.debug.ui.IDebugUIConstants;
            } catch (CoreException e) {
    }

    @Override
import org.jkiss.dbeaver.Log;
                    break;
                    activePage.showView(IDebugUIConstants.ID_BREAKPOINT_VIEW);
                    hideView(activePage, IDebugUIConstants.ID_VARIABLE_VIEW);
        for (DebugEvent event : events) {
                    showDebugViews(true);
import org.eclipse.ui.IWorkbenchWindow;
 * limitations under the License.
            }
            switch (event.getKind()) {
                }
                case DebugEvent.TERMINATE:
/*

import org.eclipse.debug.core.DebugEvent;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.eclipse.ui.IViewPart;
    }
                    showDebugViews(false);
            activePage.hideView(view);
        IWorkbenchWindow window = UIUtils.getActiveWorkbenchWindow();
                case DebugEvent.SUSPEND:
        UIUtils.asyncExec(() -> {
package org.jkiss.dbeaver.debug.ui.internal;
                log.log(e.getStatus());
        });
import org.eclipse.ui.IWorkbenchPage;
