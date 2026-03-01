    public static INavigatorModelView getActiveNavigator(IWorkbenchPart activePart) {
 * limitations under the License.
                return true;
import org.eclipse.jface.viewers.Viewer;
                return (INavigatorModelView)activeFolder;
            return ((INavigatorModelView) activePart);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.controls.folders.ITabbedFolderContainer;

/*
 * NavigatorPropertyTester
package org.jkiss.dbeaver.ui.navigator;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
        return activePart.getAdapter(INavigatorModelView.class);
    }
 *
public class NavigatorPropertyTester extends PropertyTester
        INavigatorModelView nmv = getActiveNavigator((IWorkbenchPart)receiver);
 */
                return viewer != null && viewer.getControl() != null &&
    private boolean checkNavigatorProperty(INavigatorModelView rsv, String property, Object expectedValue)
        }
            if (activeFolder instanceof INavigatorModelView) {
    public static final String PROP_ACTIVE = "active";
            case PROP_FOCUSED:
import org.eclipse.core.expressions.PropertyTester;
            return null;
        }
 *
                Viewer viewer = rsv.getNavigatorViewer();
            return getActiveNavigator(((MultiPageAbstractEditor) activePart).getActiveEditor());

    public static final String NAMESPACE = "org.jkiss.dbeaver.core.navigator";
{
 */
    @Override
        return nmv != null && checkNavigatorProperty(nmv, property, expectedValue);
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return false;
                        !viewer.getControl().isDisposed() && viewer.getControl().isFocusControl();

    {
        } else if (activePart instanceof MultiPageAbstractEditor) {
} *
            } else if (activeFolder instanceof IWorkbenchPart) {
import org.jkiss.dbeaver.ui.editors.MultiPageAbstractEditor;
        } else if (activePart instanceof INavigatorModelView) {
        if (activePart == null) {
        //IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
        } else if (activePart instanceof ITabbedFolderContainer) {
            Object activeFolder = ((ITabbedFolderContainer) activePart).getActiveFolder();
import org.eclipse.ui.IWorkbenchPart;
    public static final String PROP_FOCUSED = "focused";
        switch (property) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            case PROP_ACTIVE:
/**
 * You may obtain a copy of the License at
            }

    }
                return getActiveNavigator((IWorkbenchPart) activeFolder);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {

