    public DBPImage getObjectImage() {
    }
                        foreignOptions = PostgreUtils.safeGetStringArray(result, "ftoptions");
        return true;
 *
    {
    private String[] foreignOptions;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return foreignOptions;
public class PostgreTableForeign extends PostgreTable implements DBPForeignObject, DBPImageProvider
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Property(viewable = false, order = 200)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        readForeignInfo(monitor);
    public String[] getForeignOptions(DBRProgressMonitor monitor) throws DBException {
 */
    private long foreignServerId;
 * you may not use this file except in compliance with the License.
    @Property(viewable = false, length = PropertyLength.MULTILINE, order = 201)
            return;
 * distributed under the License is distributed on an "AS IS" BASIS,
{
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
            } catch (SQLException e) {
        readForeignInfo(monitor);
    }

    }
 * PostgreTableForeign
    @Override
    public PostgreTableForeign(PostgreSchema catalog)

    }

/*
import org.jkiss.dbeaver.model.meta.Property;
        }
    public PostgreTableForeign(
    }
    public PostgreForeignServer getForeignServer(DBRProgressMonitor monitor) throws DBException {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read foreign table info")) {
import org.jkiss.dbeaver.model.meta.PropertyLength;
        super(catalog);

        ResultSet dbResult)
import org.jkiss.dbeaver.model.*;

    public void setForeignOptions(String[] foreignOptions) {
    public String getTableTypeName() {

 *     http://www.apache.org/licenses/LICENSE-2.0
                        foreignServerId = JDBCUtils.safeGetLong(result, "ftserver");
    public String getForeignServerName() {
        this.foreignServerName = foreignServerName;

                    }
    }
        return foreignServerName;
        PostgreSchema catalog,
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
    private String foreignServerName;

 *
        return DBIcon.TREE_TABLE_LINK;
                    if (result.next()) {
    {
    private void readForeignInfo(DBRProgressMonitor monitor) throws DBException {
                stat.setLong(1, getObjectId());
    public boolean isForeignObject() {
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
    public void setForeignServerName(String foreignServerName) {
                }

        }
import org.jkiss.dbeaver.DBException;
/**
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
import org.jkiss.dbeaver.model.exec.DBCException;
                throw new DBCException(e, session.getExecutionContext());
 * limitations under the License.
    @Override
 */
import java.sql.SQLException;
    }
 *

    }
}

    @Nullable
    }
        super(catalog, dbResult);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
        return PostgreUtils.getObjectById(monitor, getDatabase().foreignServerCache, getDatabase(), foreignServerId);
 * You may obtain a copy of the License at

        this.foreignOptions = foreignOptions;
            }
package org.jkiss.dbeaver.ext.postgresql.model;
        return "FOREIGN TABLE";
        if (foreignServerId > 0) {
            try (JDBCPreparedStatement stat = session.prepareStatement("SELECT * FROM pg_catalog.pg_foreign_table WHERE ftrelid=?")) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import java.sql.ResultSet;
import org.jkiss.code.Nullable;
    }
                try (JDBCResultSet result = stat.executeQuery()) {
