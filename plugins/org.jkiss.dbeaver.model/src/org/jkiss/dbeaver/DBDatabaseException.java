        StringBuilder msg = new StringBuilder(ModelMessages.common_error_sql);

            return dataSource;
    public DBDatabaseException(Throwable cause, DBPDataSource dataSource) {
        Throwable cause = getCause();

 * See the License for the specific language governing permissions and
 */
    public DBDatabaseException(String message, Throwable cause, DBPDataSource dataSource) {

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @Nullable
            return dbe.getDataSource();
    public DBDatabaseException(String message) {
            msg.append(" [").append(ex.getErrorCode()).append("]"); //$NON-NLS-1$ //$NON-NLS-2$
 *
    }
import java.sql.SQLException;
        }
        super(message, cause);


package org.jkiss.dbeaver;
        this.hasMessage = message != null;
    public boolean hasMessage() {
        super(message, cause);

        super(cause instanceof SQLException ? makeMessage((SQLException) cause) : cause.getMessage(), cause);

    }
        super(message);
 *

    public DBDatabaseException(String message, Throwable cause) {
 * limitations under the License.
        this.dataSource = null;
        if (dataSource != null) {
        }
        if (!CommonUtils.isEmpty(ex.getSQLState())) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return hasMessage;
 *

    }
import org.jkiss.utils.CommonUtils;
    public DBPDataSource getDataSource() {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.messages.ModelMessages;
        this.dataSource = dataSource;
/**
    }
        if (!CommonUtils.isEmpty(ex.getMessage())) {
        this.hasMessage = true;

    }
    private final DBPDataSource dataSource;
    private static String makeMessage(SQLException ex) {
 * you may not use this file except in compliance with the License.
        if (cause instanceof DBDatabaseException dbe) {
 */

        return null;
    }

public class DBDatabaseException extends DBException {
 * You may obtain a copy of the License at
    private final boolean hasMessage;

import org.jkiss.dbeaver.model.DBPDataSource;
 * Unless required by applicable law or agreed to in writing, software
        this.dataSource = null;
        this.hasMessage = message != null;
        if (ex.getErrorCode() > 0) {
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            msg.append(": ").append(SQLUtils.stripTransformations(ex.getMessage())); //$NON-NLS-1$
        return msg.toString();
        }
}
            msg.append(" [").append(ex.getSQLState()).append("]"); //$NON-NLS-1$ //$NON-NLS-2$
/*
 * DBDatabaseException
        this.hasMessage = false;
import org.jkiss.code.Nullable;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

        this.dataSource = dataSource;
