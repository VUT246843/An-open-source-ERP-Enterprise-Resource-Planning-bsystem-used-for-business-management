 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        return false;

}
 *
 *
    }
package org.jkiss.dbeaver.ext.sqlite.model;
/*
 * Licensed under the Apache License, Version 2.0 (the "License");

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.generic.model.GenericView;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * limitations under the License.
    public SQLiteView(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
        super(container, tableName, tableType, dbResult);


 */
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPNamedObject2;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    }
public class SQLiteView extends GenericView implements DBPNamedObject2 {
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected boolean isTruncateSupported() {
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
