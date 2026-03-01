
 */
 * Unless required by applicable law or agreed to in writing, software
                } else {
                    return SQLGeneratorContributor.hasContributions(structuredSelection);
/*
 * you may not use this file except in compliance with the License.
                }
import org.eclipse.ui.IWorkbenchPart;
    }
 * limitations under the License.
        super();
            case PROP_CAN_GENERATE:
        if (!(receiver instanceof IWorkbenchPart)) {

    @Override

import org.jkiss.dbeaver.ui.controls.resultset.IResultSetSelection;
    }
 *
        }
 *
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.jface.viewers.IStructuredSelection;
                if (structuredSelection instanceof IResultSetSelection) {

 * Copyright (C) 2010-2024 DBeaver Corp and others

 */
            return false;
public class SQLGeneratorPropertyTester extends PropertyTester
    }
        }
    public static void firePropertyChange(String propName)
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static final String NAMESPACE = "org.jkiss.dbeaver.ui.editors.sql.util";
 * DBeaver - Universal Database Manager
        if (structuredSelection == null || structuredSelection.isEmpty()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        switch (property) {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;

    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
 * SQLGeneratorPropertyTester
        IStructuredSelection structuredSelection = NavigatorUtils.getSelectionFromPart((IWorkbenchPart)receiver);
                    // Results
{
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String PROP_CAN_GENERATE = "canGenerate";
 * See the License for the specific language governing permissions and
                    return ((IResultSetSelection) structuredSelection).getController().getModel().isSingleSource();
}package org.jkiss.dbeaver.ui.editors.sql.generator;
    public SQLGeneratorPropertyTester() {
        return false;
            return false;
    {
 *
import org.jkiss.dbeaver.ui.ActionUtils;
