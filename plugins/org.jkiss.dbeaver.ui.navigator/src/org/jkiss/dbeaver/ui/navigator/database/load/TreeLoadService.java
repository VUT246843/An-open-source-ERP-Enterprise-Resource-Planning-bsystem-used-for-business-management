 *
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 * DBeaver - Universal Database Manager
 *
    }
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import java.lang.reflect.InvocationTargetException;
            DBNNode[] children = DBNUtils.getNodeChildrenFiltered(monitor, parentNode, true);
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    public Object[] evaluate(@NotNull DBRProgressMonitor monitor)
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {


 */
/*
        try {
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
/**
 *
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    {

            throw new InvocationTargetException(ex);
 * Unless required by applicable law or agreed to in writing, software

        throws InvocationTargetException, InterruptedException
        }
            return children == null ? new Object[0] : children;
        super(serviceName, (DBNDatabaseNode)(parentNode instanceof DBNDatabaseNode ? parentNode : null));
package org.jkiss.dbeaver.ui.navigator.database.load;
        return parentNode;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBNNode getParentNode() {
public class TreeLoadService extends DatabaseLoadService<Object[]> {
        } catch (Throwable ex) {
    private final DBNNode parentNode;

    public TreeLoadService(String serviceName, DBNNode parentNode)
        this.parentNode = parentNode;
import org.jkiss.dbeaver.model.navigator.DBNUtils;
 */

import org.jkiss.dbeaver.model.navigator.DBNNode;
 * TreeLoadService
