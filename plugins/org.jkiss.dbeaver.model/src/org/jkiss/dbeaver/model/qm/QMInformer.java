 * DBeaver - Universal Database Manager
 *
import java.util.List;
    public List<DBCStatement> getActiveQueries(DBPDataSource dataSource);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public List<DBCStatement> getTransactionScope(DBPDataSource dataSource);
}
package org.jkiss.dbeaver.model.qm;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Query Manager information reporter
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.DBPDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
/**

public interface QMInformer {

 * Unless required by applicable law or agreed to in writing, software

 *
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * you may not use this file except in compliance with the License.
 * limitations under the License.
 * You may obtain a copy of the License at
 */
import org.jkiss.dbeaver.model.exec.DBCStatement;

