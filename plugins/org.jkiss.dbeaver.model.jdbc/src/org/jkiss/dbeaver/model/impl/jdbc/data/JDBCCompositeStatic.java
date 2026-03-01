                    int ordinalPosition = attr.getOrdinalPosition();
                    DBSEntityAttribute attr = attributes[i];
                    }
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.struct.DBSEntity;

import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
                    log.warn("Number of entity attributes (" + entityAttributes.size() + ") differs from real values (" + valueCount + ")");
        } catch (DBException e) {
    public String getStringRepresentation() {
            throw new DBCException(e, session.getExecutionContext());
 *
            } else {
    public JDBCCompositeStatic(@NotNull JDBCComposite struct, @NotNull DBRProgressMonitor monitor) throws DBCException {
    }
 * DBeaver - Universal Database Manager
                values = new Object[attributes.length];

            throw new DBCException("Can't obtain attributes meta information", e);
        this.type = type;
package org.jkiss.dbeaver.model.impl.jdbc.data;
 * Attributes described by static data type.
        try {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    if (ordinalPosition < 0 || attrValues != null && ordinalPosition >= valueCount) {

    }
 */
    private static final Log log = Log.getLog(JDBCCompositeStatic.class);
 */
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.
        return Arrays.toString(values);
                    DBDValueHandler valueHandler = DBUtils.findValueHandler(session, attr);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } catch (SQLException e) {
                if (attrValues != null && entityAttributes.size() != valueCount) {
 *

}
            }
                attributes = entityAttributes.toArray(new DBSEntityAttribute[entityAttributes.size()]);
        super(contents);
                        continue;
        }
    public JDBCCompositeStatic(DBCSession session, @NotNull DBSDataType type, @Nullable Struct contents) throws DBCException {
import java.util.Arrays;
import org.jkiss.dbeaver.model.exec.DBCSession;
import java.sql.SQLException;

                attributes = EMPTY_ATTRIBUTE;

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBUtils;
            if (type instanceof DBSEntity) {
                int valueCount = attrValues == null ? 0 : attrValues.length;
    @Override
import java.util.Collection;
                for (int i = 0; i < attributes.length; i++) {
import org.jkiss.dbeaver.model.data.DBDValueHandler;
    }
import org.jkiss.code.NotNull;
import java.sql.Struct;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        log.warn("Attribute '" + attr.getName() + "' ordinal position (" + ordinalPosition + ") is out of range (" + valueCount + ")");
                DBSEntity entity = (DBSEntity) type;
                }
 * distributed under the License is distributed on an "AS IS" BASIS,

                    Object value = attrValues != null ? attrValues[ordinalPosition] : null;
                    values[ordinalPosition] = value;
/**
        return new JDBCCompositeStatic(this, monitor);
import org.jkiss.dbeaver.DBException;
                    value = valueHandler.getValueFromObject(session, attr, value, false, modified);
        // Extract structure data

            Object[] attrValues = contents == null ? null : contents.getAttributes();
import org.jkiss.dbeaver.model.exec.DBCException;
public class JDBCCompositeStatic extends JDBCComposite {
/*
                values = EMPTY_VALUES;
    }
import org.jkiss.code.Nullable;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.struct.DBSDataType;
    public JDBCCompositeStatic cloneValue(DBRProgressMonitor monitor) throws DBCException {
                Collection<? extends DBSEntityAttribute> entityAttributes = CommonUtils.safeCollection(entity.getAttributes(session.getProgressMonitor()));
 * Static struct holder.

        super(monitor, struct);
 *
