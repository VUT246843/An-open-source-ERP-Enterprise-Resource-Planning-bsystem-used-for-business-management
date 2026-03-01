import org.jkiss.code.Nullable;
    }

                return abc.getActionBars();
 * Action bar utils

 * you may not use this file except in compliance with the License.
/*
}
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
        IWorkbenchPart activePart = page.getActivePart();
import org.jkiss.code.NotNull;
 * limitations under the License.
        }

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.ui.part.EditorActionBarContributor;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return null;
        }
public class ActionBars {
        IActionBars actionBars = extractActionBars(site);
 *
        if (activePart instanceof IEditorPart activeEditorPart) {
        IWorkbenchPage page = site.getPage();
 */
        if (activePart instanceof IViewPart activeViewPart) {
        if (site instanceof IEditorSite editorSite) {
            return viewSite.getActionBars();
        if (site instanceof IViewSite viewSite) {
        }
            IEditorActionBarContributor contributor = activeEditorPart.getEditorSite().getActionBarContributor();
    @Nullable

            if (contributor instanceof EditorActionBarContributor abc) {
package org.jkiss.dbeaver.ui;
            return editorSite.getActionBars();
 *
            IViewSite activeViewSite = activeViewPart.getViewSite();
    public static IActionBars extractActionBars(@NotNull IWorkbenchSite site) {
        }
 * See the License for the specific language governing permissions and
            }
 * Unless required by applicable law or agreed to in writing, software
/**
    }
    public static IStatusLineManager extractStatusLineManager(@NotNull IWorkbenchSite site) {
    @Nullable
 *
            return activeViewSite.getActionBars();
 */
        return actionBars.getStatusLineManager();

        if (actionBars == null) {
import org.eclipse.ui.*;

 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
