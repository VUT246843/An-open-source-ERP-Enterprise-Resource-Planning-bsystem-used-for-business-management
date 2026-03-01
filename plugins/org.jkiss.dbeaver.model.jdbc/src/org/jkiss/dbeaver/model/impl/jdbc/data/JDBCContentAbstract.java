
    {
    }
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * Unless required by applicable law or agreed to in writing, software
    protected JDBCContentAbstract(DBCExecutionContext executionContext)
 */

    }
        throws DBCException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return DBValueFormatting.getDefaultBinaryFileEncoding(executionContext.getDataSource());

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.impl.jdbc.data;
 *
    protected String getDefaultEncoding() {
        super(copyFrom);
 * @author Serge Rider
 * You may obtain a copy of the License at
 * limitations under the License.
    public abstract void bindParameter(JDBCSession session, JDBCPreparedStatement preparedStatement, DBSTypedObject columnType, int paramIndex)
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.

public abstract class JDBCContentAbstract extends AbstractContent implements DBDValueCloneable {
    }
/**
    protected JDBCContentAbstract(JDBCContentAbstract copyFrom) {

        super(executionContext);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * JDBCContentAbstract
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

 */
import org.jkiss.dbeaver.model.impl.data.AbstractContent;
import org.jkiss.dbeaver.model.exec.DBCException;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.data.DBDValueCloneable;
}import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
/*
import org.jkiss.dbeaver.model.DBValueFormatting;
 *
