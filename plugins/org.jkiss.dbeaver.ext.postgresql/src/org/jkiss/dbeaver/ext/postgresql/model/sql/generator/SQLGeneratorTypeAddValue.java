 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
/*
 *
}
import org.jkiss.dbeaver.model.struct.DBSEntity;
 * Unless required by applicable law or agreed to in writing, software

    }
        sql.append("ALTER TYPE ").append(entityName).append(" ADD VALUE ''");
    protected void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, Object object) throws DBException {
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        sql.append(";").append(getLineSeparator());
import org.jkiss.dbeaver.DBException;
 *
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.postgresql.model.sql.generator;
public class SQLGeneratorTypeAddValue extends SQLGenerator<Object> {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.sql.generator.SQLGenerator;
 */
    @Override
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Licensed under the Apache License, Version 2.0 (the "License");

        String entityName = getEntityName((DBSEntity) object);
