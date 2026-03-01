 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Result set for execution statistics.
import org.jkiss.dbeaver.model.exec.DBCStatement;
import org.jkiss.dbeaver.model.exec.DBCSession;
    }

 * See the License for the specific language governing permissions and
 * This class exists to let viewers to determine that some results are not real results but statistics
 *
 *
public class StatResultSet extends LocalResultSet
/*
 * You may obtain a copy of the License at
 */
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.impl.local;

        super(session, statement);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
/**

    public StatResultSet(DBCSession session, DBCStatement statement) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
}
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
{
