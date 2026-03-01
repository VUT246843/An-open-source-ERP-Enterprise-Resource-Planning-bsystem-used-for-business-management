 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 *
}


        return HANADependency.readDependencies(monitor, this);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(container, tableName, tableType, dbResult);
package org.jkiss.dbeaver.ext.hana.model;
    @Association
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    public HANAView(GenericStructContainer container, String tableName, String tableType, JDBCResultSet dbResult) {
/*

import org.jkiss.dbeaver.DBException;
    public List<HANADependency> getDependencies(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
public class HANAView extends GenericView {
import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * DBeaver - Universal Database Manager

 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericView;
import org.jkiss.dbeaver.model.meta.Association;
    }

