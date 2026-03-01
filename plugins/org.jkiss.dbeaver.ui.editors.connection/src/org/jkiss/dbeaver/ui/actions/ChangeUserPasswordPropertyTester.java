            }
 * limitations under the License.
                return false;
 *
public class ChangeUserPasswordPropertyTester extends PropertyTester {
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.model.DBPDataSource;
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (property.equals("canChangePassword")) {
import org.jkiss.dbeaver.model.app.DBPProject;
            DBPDataSourceContainer dataSourceContainer = dsNode.getDataSourceContainer();
            DBPDataSource dataSource = dataSourceContainer.getDataSource();
/*
            return false;
    @Override
        }
                return ((IAdaptable) dataSource).getAdapter(DBAUserPasswordManager.class) != null && CommonUtils.isNotEmpty(userName);
import org.eclipse.core.expressions.PropertyTester;
            }
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
 */
 * DBeaver - Universal Database Manager
            String userName = dataSourceContainer.getConnectionConfiguration().getUserName();
        if (!(element instanceof DBNDataSource)) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            DBPProject project = dsNode.getOwnerProject();

            if (project == null || !project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT)) {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.IAdaptable;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean test(Object element, String property, Object[] objects, Object o1) {
 * You may obtain a copy of the License at
            if (dataSource instanceof IAdaptable) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
import org.jkiss.dbeaver.model.rm.RMConstants;

 * See the License for the specific language governing permissions and

 *
import org.jkiss.dbeaver.model.navigator.DBNLocalFolder;

 *     http://www.apache.org/licenses/LICENSE-2.0
}
        return false;
package org.jkiss.dbeaver.ui.actions;
            DBNDataSource dsNode = (DBNDataSource) element;
        }
