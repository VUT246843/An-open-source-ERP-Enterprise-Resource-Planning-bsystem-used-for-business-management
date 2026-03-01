
 * distributed under the License is distributed on an "AS IS" BASIS,
 * PostgreCharset
    {
import org.jkiss.dbeaver.model.meta.Property;
        return trusted;
 *
    @Property(order = 12)

    }


        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
/*
    @Property(order = 14)
    private boolean userDefined;
 * DBeaver - Universal Database Manager
import java.sql.ResultSet;
 * limitations under the License.
    public PostgreLanguage(PostgreDatabase database, ResultSet dbResult)
    }
 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
        return ownerId;
import java.sql.SQLException;
    public String getInlineHandlerId() {
    @Property(order = 11)
    private String handlerId;
    }
import org.jkiss.code.NotNull;
    public boolean isUserDefined() {
        return inlineHandlerId;
    public long getObjectId() {

/**
    public String getHandlerId() {
    private void loadInfo(ResultSet dbResult)
    }
    @Property(order = 10)
    }
        return userDefined;
    public String getName()
    private long oid;


 *
public class PostgreLanguage extends PostgreInformation {

        this.inlineHandlerId = JDBCUtils.safeGetString(dbResult, "laninline");

    private long ownerId;
    @Property(order = 13)
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
    private boolean trusted;
    @NotNull
        return handlerId;
    @Property(viewable = true, order = 3)
        this.validatorId = JDBCUtils.safeGetString(dbResult, "lanvalidator");
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isTrusted() {
        return validatorId;
    @Override
    {
 */
    private String name;
        super(database);
    public String getValidatorId() {
        return name;
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "lanowner");
    {
        this.userDefined = JDBCUtils.safeGetBoolean(dbResult, "lanispl");
        this.name = JDBCUtils.safeGetString(dbResult, "lanname");
package org.jkiss.dbeaver.ext.postgresql.model;
    private String validatorId;
        return oid;

    public long getOwnerId() {
 */
    }
 *
    private String inlineHandlerId;
    }
        this.handlerId = JDBCUtils.safeGetString(dbResult, "lanplcallfoid");
    }
    }
        throws SQLException

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, order = 1)
        this.loadInfo(dbResult);
    @Property(viewable = true, order = 2)

    @Override
 * you may not use this file except in compliance with the License.
        throws SQLException
        this.trusted = JDBCUtils.safeGetBoolean(dbResult, "lanpltrusted");
}
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
