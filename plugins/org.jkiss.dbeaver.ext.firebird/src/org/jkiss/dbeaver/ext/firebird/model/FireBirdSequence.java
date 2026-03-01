    public Number getLastValue() {

 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        return super.getLastValue();

            }
    @Property(viewable = true, updatable = true, length = PropertyLength.MULTILINE, order = 10)
    public boolean isSystem() {
 */
                } catch (SQLException e) {
        return super.getLastValue();
 * limitations under the License.
    @Nullable
    }
    public Number getLastValue(DBRProgressMonitor monitor) throws DBCException {
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override

 *
                    ResultSet.CONCUR_READ_ONLY,

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                }
                        if (seqResults.next()) {
public class FireBirdSequence extends GenericSequence implements DBPSystemObject {
    }
import org.jkiss.dbeaver.model.exec.DBCException;
package org.jkiss.dbeaver.ext.firebird.model;
 * DBeaver - Universal Database Manager
                    }
        this.isSystem = isSystem;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
import org.jkiss.dbeaver.model.DBUtils;
                try (JDBCPreparedStatement dbSeqStat = session.prepareStatement("SELECT GEN_ID(\"" + getName() + "\", 0) from RDB$DATABASE",
    @Property(viewable = true, order = 2)
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read sequence last value")) {
    public FireBirdSequence(GenericStructContainer container, String name, String description, Number lastValue, Number minValue, Number maxValue, Number incrementBy, boolean isSystem) {
 *
        super(container, name, description, lastValue, minValue, maxValue, incrementBy);
 * Unless required by applicable law or agreed to in writing, software
    public void setDescription(String description) {
    }
}
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
                    // Extra ResultSet types - to avoid early SQLException: The result set is closed
import org.jkiss.dbeaver.model.meta.PropertyLength;
    @Override
 * You may obtain a copy of the License at
                            setLastValue(JDBCUtils.safeGetLong(seqResults, 1));
    @Override


        this.description = description;
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (super.getLastValue() == null) {
    private String description;
 * FireBirdDataSource
/*
                    try (JDBCResultSet seqResults = dbSeqStat.executeQuery()) {
import org.jkiss.dbeaver.model.meta.Property;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * you may not use this file except in compliance with the License.
import java.sql.ResultSet;
                    ResultSet.HOLD_CURSORS_OVER_COMMIT)) {
    }

import org.jkiss.dbeaver.model.DBPSystemObject;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
                    throw new DBCException("Error reading sequence last value", e);
        }
    }
import org.jkiss.code.Nullable;
    private boolean isSystem;
        this.description = description;
    public String getDescription() {
import java.sql.SQLException;
        return isSystem;
/**
                    ResultSet.TYPE_FORWARD_ONLY,
 *
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        }
        return description;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
