}
            if (value != null) {
        } catch (Throwable t) {
     * @see #from(SQLWarning)
     * @return the {@code sqlwarn} vector from the SQLCA.

     *         connection, otherwise {@code null}.
     *
    static @Nullable DB2Sqlca from(@NotNull Connection connection) throws SQLException {
    private static final Log LOG = Log.getLog(DB2Sqlca.class);
        }
     * Retrieves the SQLCA from a {@link SQLWarning}
 * Unless required by applicable law or agreed to in writing, software
     */
     */
            LOG.error("Unable to invoke getSqlWarn()", t);
 *     http://www.apache.org/licenses/LICENSE-2.0
        return null;
            return null;
import java.sql.SQLWarning;
            if (t instanceof SQLException) {
 * See the License for the specific language governing permissions and
        try {
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     *
     *
    /**
            Object value = BeanUtils.invokeObjectMethod(warning, "getSqlca");
    /**
     * reference to an instance of {@link com.ibm.db2.jcc.DB2Sqlca}.
     * Retrieves the {@code sqlwarn} vector from the SQLCA.
import java.sql.Connection;
 */
 *
     *            {@link Connection} to load an instance of {@link DB2Sqlca}
 * prevents the need to link directly against the DB2 JDBC Drivers.
     * Constructor.
 * limitations under the License.

     *         connection, otherwise {@code null}.
     * @param delegate
import org.jkiss.utils.BeanUtils;
     *            from.
 * {@link DB2Sqlca} is a proxy for {@link com.ibm.db2.jcc.DB2Sqlca} that
    private DB2Sqlca(Object delegate) {
     * @param warning
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
                return new DB2Sqlca(value);
            return (char[]) BeanUtils.invokeObjectMethod(delegate, "getSqlWarn");

     *            An instance of {@link com.ibm.db2.jcc.DB2Sqlca} acquired
 */
        }
import org.jkiss.dbeaver.Log;

 * You may obtain a copy of the License at
    }
     * @return An instance of {@link DB2Sqlca} if one can be produced from the
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * Constructs a new instance of {@link DB2Sqlca} from an {@link Object}
 * <quote>The SQLCA (SQL communications area) is a collection of variables that

 * DBeaver - Universal Database Manager
import java.sql.SQLException;
    }
     */
        this.delegate = delegate;
 * @see com.ibm.db2.jcc.DB2Sqlca
            }
/**
    public @Nullable char[] getSqlWarn() {
    /**
     */
        } catch (Throwable t) {
     * @see <a href="https://www.ibm.com/docs/en/db2/11.5?topic=tables-sqlca-sql-communications-area">SQLCA (SQL communications area)</a>
     * @return An instance of {@link DB2Sqlca} if one can be produced from the


 * @see <a href="https://www.ibm.com/docs/en/db2/11.5?topic=tables-sqlca-sql-communications-area">SQLCA (SQL communications area)</a>
    static @Nullable DB2Sqlca from(@Nullable SQLWarning warning) throws SQLException {
     * @param connection
    private final Object delegate;
 * are updated at the end of the execution of every SQL statement.</quote>
     *            through the DB2 JDBC Driver.
     *
import org.jkiss.code.Nullable;
     *
            return null;

            }
 *
package org.jkiss.dbeaver.ext.db2;

 *
     * Retrieves the SQLCA from a {@link Connection}
 *
        if (warning == null) {
 * 
    }
public class DB2Sqlca {
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
                throw (SQLException) t;
 * you may not use this file except in compliance with the License.

                LOG.error("Unable to reflectively access DB2 SQLCA", t);
        return DB2Sqlca.from(connection.getWarnings());
     *            {@link Warning} to load an instance of {@link DB2Sqlca} from.
        try {
import org.jkiss.code.NotNull;
            } else {
        }
