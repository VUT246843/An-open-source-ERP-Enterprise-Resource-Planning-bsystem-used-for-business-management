        return original;
import java.sql.Savepoint;
    public JDBCSavepointImpl(@NotNull JDBCExecutionContext context, @NotNull Savepoint savepoint) {

            log.error(e);
            return 0;

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
        } catch (SQLException e) {
    }
}
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
        }
import java.sql.SQLException;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    public Savepoint getOriginal() {
        try {

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.impl.jdbc.exec;
    @Override
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
    public int getSavepointId() throws SQLException {
        try {
    private final Savepoint original;
    }
    @Override
 *

import org.jkiss.dbeaver.model.exec.DBCSavepoint;
 */
 * Savepoint
 * limitations under the License.
/*
            log.error(e);
    public String getName() {
            return original.getSavepointId();
    @Override
 * you may not use this file except in compliance with the License.
 *
public class JDBCSavepointImpl implements DBCSavepoint, Savepoint {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

        this.original = savepoint;
        return original.getSavepointName();
 * You may obtain a copy of the License at
    private final JDBCExecutionContext context;

    }
 * See the License for the specific language governing permissions and
        return original.getSavepointId();
            return null;
    }
        }
        } catch (SQLException e) {

    }

            return original.getSavepointName();
        this.context = context;
 * DBeaver - Universal Database Manager

    @NotNull
        return context;
 */

    public DBCExecutionContext getContext() {
    public String getSavepointName() throws SQLException {
    @Override
 * Unless required by applicable law or agreed to in writing, software
    private static final Log log = Log.getLog(JDBCSavepointImpl.class);
    @Override
import org.jkiss.dbeaver.Log;
    public int getId() {
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
