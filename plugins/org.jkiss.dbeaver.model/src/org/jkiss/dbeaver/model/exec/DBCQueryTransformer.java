 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.sql.SQLQuery;
 * You may obtain a copy of the License at
/*
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Query transformer
 *
        throws DBCException;
 */
 * Unless required by applicable law or agreed to in writing, software
    void transformStatement(DBCStatement statement, int parameterIndex)
 *
/**
 */
 *     http://www.apache.org/licenses/LICENSE-2.0

}
 * DBeaver - Universal Database Manager

    void setParameters(Object ... parameters);
    String transformQueryString(SQLQuery query)

package org.jkiss.dbeaver.model.exec;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.
public interface DBCQueryTransformer {


        throws DBCException;
