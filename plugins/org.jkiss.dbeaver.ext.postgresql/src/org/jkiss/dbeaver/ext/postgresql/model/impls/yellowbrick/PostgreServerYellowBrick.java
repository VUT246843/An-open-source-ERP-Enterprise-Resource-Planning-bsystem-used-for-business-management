    public boolean supportsFunctionDefRead() {
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerExtensionBase;
    public String getServerTypeName() {

 * limitations under the License.
        }
    }
        if (!CommonUtils.isEmpty(tableDDL)) {


 *
 * PostgreServerYellowBrick
    @Override
        return null;
    }
 *
    public String readTableDDL(DBRProgressMonitor monitor, PostgreTableBase table) throws DBException {
 * You may obtain a copy of the License at

 * Unless required by applicable law or agreed to in writing, software
        return false;
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
        return "YellowBrick";
        StringBuilder ddl = new StringBuilder();
    @Override
import org.jkiss.dbeaver.DBException;
    public PostgreServerYellowBrick(PostgreDataSource dataSource) {
import org.jkiss.code.NotNull;
 */
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
    }
}

            return ddl.toString();
        String className = object.getClass().getName();

        return false;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
        // Extract main portion from server
            ddl.append(tableDDL);
 *
package org.jkiss.dbeaver.ext.postgresql.model.impls.yellowbrick;

        super(dataSource);
        String tableDDL = YellowBrickUtils.extractTableDDL(monitor, table);
    public boolean supportsTransactions() {
 */
    }
    @Override
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isPGObject(@NotNull Object object) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        return YB_VECTOR_CLASS.equals(className);
    }
 * DBeaver - Universal Database Manager
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
    public boolean supportsExplainPlanXML() {
    public static final String YB_VECTOR_CLASS = "io.yellowbrick.shaded.org.postgresql.util.PGobject";


public class PostgreServerYellowBrick extends PostgreServerExtensionBase {
        return false;
/*

/**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
