 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
/**
 */
            false);
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.DBPDataSource;

 *
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        super("Comment",
    public SQLDatabasePersistActionComment(DBPDataSource dataSource, String comment) {
package org.jkiss.dbeaver.model.impl.edit;
 * See the License for the specific language governing permissions and
}
public class SQLDatabasePersistActionComment extends SQLDatabasePersistAction {
 * You may obtain a copy of the License at
 * Comment action
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;

/*
 *
            ActionType.COMMENT,
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
            SQLUtils.getDialectFromDataSource(dataSource).getSingleLineComments()[0] + " " + comment,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * limitations under the License.
