import org.jkiss.utils.CommonUtils;
/*
            boolean castParams = isShowCastParams();
    @Override
        return true;

import org.jkiss.dbeaver.model.DBPDataSource;
 * you may not use this file except in compliance with the License.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Collection;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;

            sqlDialect.generateStoredProcedureCall(sql, proc, CommonUtils.safeCollection(parameters), castParams);
 * DBeaver - Universal Database Manager
    @Override
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    public boolean supportCastParams() {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
 * You may obtain a copy of the License at
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
 */
        DBPDataSource dataSource = proc.getDataSource();

        {
 *
package org.jkiss.dbeaver.model.sql.generator;
    protected void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBSProcedure proc) throws DBException {
 *
    }
public class SQLGeneratorProcedureCall extends SQLGeneratorProcedure {

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.SQLDialect;
    
    
        Collection<? extends DBSProcedureParameter> parameters = proc.getParameters(monitor);
            SQLDialect sqlDialect = dataSource.getSQLDialect();
