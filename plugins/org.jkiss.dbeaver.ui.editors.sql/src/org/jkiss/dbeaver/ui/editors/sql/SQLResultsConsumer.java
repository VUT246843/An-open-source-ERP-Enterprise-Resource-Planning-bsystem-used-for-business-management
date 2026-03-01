 * DBeaver - Universal Database Manager
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
 *
 *
package org.jkiss.dbeaver.ui.editors.sql;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
}
     * @param resultSetNumber result set number
{
public interface SQLResultsConsumer

     */
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBDDataReceiver getDataReceiver(SQLQuery statement, int resultSetNumber);
     * Gets (or opens new) data receiver.
import org.jkiss.dbeaver.model.sql.SQLQuery;
 */
    @Nullable
     * @param statement executing statement or null

 * @author Serge Rider
     * @return
 * Unless required by applicable law or agreed to in writing, software
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * See the License for the specific language governing permissions and
 *
 * SQLResultsConsumer
 * You may obtain a copy of the License at
