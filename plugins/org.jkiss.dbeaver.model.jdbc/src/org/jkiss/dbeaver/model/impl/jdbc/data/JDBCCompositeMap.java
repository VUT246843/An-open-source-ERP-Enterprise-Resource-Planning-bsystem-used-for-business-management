        super(null);
public class JDBCCompositeMap extends JDBCComposite {
import org.jkiss.utils.CommonUtils;

 * See the License for the specific language governing permissions and
                attributes[index] = attr;
 * Unless required by applicable law or agreed to in writing, software

    public JDBCCompositeMap(@NotNull DBCSession session, DBSDataType dataType, @NotNull Map<?,?> contents) throws DBCException
 */
/**
    @Override
    public JDBCCompositeMap cloneValue(DBRProgressMonitor monitor) throws DBCException

                StructAttribute attr = new StructAttribute(CommonUtils.toString(entry.getKey()), this.type, index, value);
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
        this.map = contents;
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
    }


        // Extract structure data
 *
 * you may not use this file except in compliance with the License.
            throw new DBCException("Can't obtain attributes meta information", e);
}
                values[index] = value;

import java.util.Map;
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.code.NotNull;
        return new JDBCCompositeMap(monitor, this);
        } catch (DBException e) {
        this.map = struct.map;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    private DBSDataType dataType;

import org.jkiss.dbeaver.model.struct.DBSDataType;
package org.jkiss.dbeaver.model.impl.jdbc.data;
    public JDBCCompositeMap(@NotNull DBRProgressMonitor monitor, @NotNull JDBCCompositeMap struct) throws DBCException {
import org.jkiss.dbeaver.model.DBUtils;
    }

    private Map<?,?> map;
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.type = new StructType(session.getDataSource());
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
            for (Map.Entry<?,?> entry : contents.entrySet()) {
    }
                Object value = entry.getValue();
        super(monitor, struct);
        this.dataType = dataType;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
            values = contents.values().toArray();
            int index = 0;
            }
 */
                value = DBUtils.findValueHandler(session, attr).getValueFromObject(session, attr, value, false, modified);
        try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 *
        }
    {
/*
            attributes = new DBSEntityAttribute[contents.size()];
        this.dataType = struct.dataType;
                index++;
 * Dynamic struct. Self contained entity.
