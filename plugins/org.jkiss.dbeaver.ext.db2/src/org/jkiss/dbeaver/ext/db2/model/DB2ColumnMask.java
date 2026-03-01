    }
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    private String ruleText;
    private String description;

    }
    @NotNull
    @Property(viewable = true, order = 2)
        return valid ? DBSObjectState.NORMAL : DBSObjectState.INVALID;
    @Property(viewable = true, order = 3)
        return valid;

    }

    }
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.Date;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

    @Nullable
}
    public String getDescription() {
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 7)
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
        return description;
    DB2ColumnMask(@NotNull DB2Table db2Table, @NotNull DB2TableColumn column, @NotNull String name, @NotNull JDBCResultSet resultSet) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getRuleText() {
 * You may obtain a copy of the License at

    }
    public DBSObjectState getObjectState() {
    }
    public Date getCreationTime() {
    private DB2TableColumn tableColumn;
package org.jkiss.dbeaver.ext.db2.model;

import org.jkiss.dbeaver.model.meta.Property;

    public boolean isValid() {
 * limitations under the License.
    }
    @Override
    private boolean valid;
        return ruleText;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
    @Override

        this.description = JDBCUtils.safeGetString(resultSet,DB2Constants.SYSCOLUMN_REMARKS);
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        return creationTime;
 *
import org.jkiss.dbeaver.model.meta.PropertyLength;
        return enable;
    @Override
import org.jkiss.dbeaver.model.struct.DBSObjectState;
        super(db2Table, name, true);
    private Date creationTime;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

        this.creationTime = JDBCUtils.safeGetTimestamp(resultSet, DB2Constants.SYSCOLUMN_CREATE_TIME);

 *
        this.enable = JDBCUtils.safeGetBoolean(resultSet, "ENABLE", DB2YesNo.Y.name());
    @Property(viewable = true, order = 4)
        return tableColumn;
import org.jkiss.dbeaver.model.DBPStatefulObject;
        this.alteringTime = JDBCUtils.safeGetTimestamp(resultSet, DB2Constants.SYSCOLUMN_ALTER_TIME);
        // do nothing
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.tableColumn = column;
    public boolean isEnable() {
    }

        this.ruleText = JDBCUtils.safeGetString(resultSet, "RULETEXT");
    public Date getAlteringTime() {
 *
    @Property(viewable = true, order = 5)
/*
    }
        this.valid = JDBCUtils.safeGetBoolean(resultSet, DB2Constants.SYSCOLUMN_VALID, DB2YesNo.Y.name());
public class DB2ColumnMask extends DB2Object<DB2Table> implements DBPStatefulObject {
 */
 * you may not use this file except in compliance with the License.
    private Date alteringTime;

    @Property(viewable = true, order = 6)
    }
    private boolean enable;
        return alteringTime;
import org.jkiss.code.NotNull;
    public DB2TableColumn getTableColumn() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * See the License for the specific language governing permissions and
