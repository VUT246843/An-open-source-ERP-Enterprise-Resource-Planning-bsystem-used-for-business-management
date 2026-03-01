 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCSession;
 * DBeaver - Universal Database Manager
}
    public AltibaseToolPackageCompileSettings createToolSettings() {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    public boolean needsRefreshOnFinish() {
    public void generateObjectQueries(DBCSession session, AltibaseToolPackageCompileSettings settings, 
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCException;
 *
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return new AltibaseToolPackageCompileSettings();


        queries.add(new SQLDatabasePersistAction(sql));

        String sql = String.format("ALTER PACKAGE %s COMPILE PACKAGE", object.getFullyQualifiedName(DBPEvaluationContext.DDL));
public class AltibaseToolPackageCompile extends SQLToolExecuteHandler<AltibasePackage, AltibaseToolPackageCompileSettings> {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPEvaluationContext;
package org.jkiss.dbeaver.ext.altibase.tasks;
 */
    @Override
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;

import java.util.List;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
/*


import org.jkiss.dbeaver.ext.altibase.model.AltibasePackage;
    }
 * Unless required by applicable law or agreed to in writing, software
 *
        return true;
    }
    }
            List<DBEPersistAction> queries, AltibasePackage object) throws DBCException {
 *     http://www.apache.org/licenses/LICENSE-2.0
