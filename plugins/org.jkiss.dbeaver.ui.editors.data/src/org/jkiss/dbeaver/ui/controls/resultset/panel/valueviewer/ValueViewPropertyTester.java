import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
        return rsv != null && checkResultSetProperty(rsv, property, expectedValue);
/**
    private boolean checkResultSetProperty(ResultSetViewer rsv, String property, Object expectedValue)
        return false;
                case PROP_ACTIVE:
import org.eclipse.core.expressions.PropertyTester;
    @Override
 * you may not use this file except in compliance with the License.
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
 *
    public static final String NAMESPACE = "org.jkiss.dbeaver.core.resultset.panel.valueView";

}    }
        IResultSetPanel visiblePanel = rsv.getVisiblePanel();

 * You may obtain a copy of the License at

 * ValueViewPropertyTester
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.controls.resultset.handler.ResultSetHandlerMain;
        }
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.controls.resultset.panel.valueviewer;
 */

 * Unless required by applicable law or agreed to in writing, software
                    return true;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPanel;
 *
 * limitations under the License.
            switch (property) {
 *
    {
{
/*
public class ValueViewPropertyTester extends PropertyTester

    }
    public static final String PROP_ACTIVE = "active";
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (visiblePanel instanceof ValueViewerPanel) {
import org.eclipse.ui.IWorkbenchPart;
 */
        ResultSetViewer rsv = (ResultSetViewer) ResultSetHandlerMain.getActiveResultSet((IWorkbenchPart) receiver);
 * DBeaver - Universal Database Manager

 *     http://www.apache.org/licenses/LICENSE-2.0
