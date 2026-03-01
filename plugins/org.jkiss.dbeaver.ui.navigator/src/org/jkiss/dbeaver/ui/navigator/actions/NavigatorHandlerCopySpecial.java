import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
import org.jkiss.dbeaver.model.fs.DBFUtils;

        DBPQualifiedObject adapted = RuntimeUtils.getObjectAdapter(object, DBPQualifiedObject.class);
        } else if (object instanceof DBNNode nwr) {
public class NavigatorHandlerCopySpecial extends NavigatorHandlerCopyAbstract {
            }
}
                return resource.getFullPath().toString();
 * See the License for the specific language governing permissions and
                UINavigatorMessages.actions_navigator_copy_fqn_titles);
        return (selection.size() > 1 ?
        } else if (object instanceof DBNPathBase pathBase) {
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPQualifiedObject;
    protected String getSelectionTitle(IStructuredSelection selection)
            return object == null ? null : object.toString();

    }
 */
 *
        if (object instanceof DBPNamedObject no) {
 * limitations under the License.
    protected CopyMode getCopyMode() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.resources.IResource;
package org.jkiss.dbeaver.ui.navigator.actions;
            return no.getName();
    {
            IResource resource = nwr.getAdapter(IResource.class);
    protected String getObjectDisplayString(Object object)
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.ui.CopyMode;
        if (adapted != null) {
import org.eclipse.jface.viewers.IStructuredSelection;
 *
import org.jkiss.dbeaver.model.DBPNamedObject;
 * DBeaver - Universal Database Manager

    @Override
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
    @Override
        return CopyMode.ADVANCED;

            if (resource != null) {

            return DBFUtils.convertPathToString(pathBase.getPath());
    {
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                UINavigatorMessages.actions_navigator_copy_fqn_title :
            return adapted.getFullyQualifiedName(DBPEvaluationContext.UI);
    @Override
/*
import org.jkiss.dbeaver.utils.RuntimeUtils;
        }
