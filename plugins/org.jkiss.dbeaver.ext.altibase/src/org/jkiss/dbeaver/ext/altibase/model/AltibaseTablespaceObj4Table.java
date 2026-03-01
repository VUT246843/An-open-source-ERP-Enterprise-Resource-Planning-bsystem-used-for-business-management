 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
} * You may obtain a copy of the License at
        super(parent, resultSet);
package org.jkiss.dbeaver.ext.altibase.model;
import org.jkiss.dbeaver.model.meta.Property;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
    }
 * limitations under the License.
 *
    AltibaseTablespaceObj4Table(AltibaseTablespace parent, JDBCResultSet resultSet) {
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 */
/*

 * DBeaver - Universal Database Manager

 * you may not use this file except in compliance with the License.
    public GenericTable getObject(DBRProgressMonitor monitor) throws DBException {

        return getTargetTable(monitor, schemaName, objName);
    @Property(viewable = true, linkPossible = true, order = 3)
public class AltibaseTablespaceObj4Table extends AltibaseTablespaceObjAbs {
    }
