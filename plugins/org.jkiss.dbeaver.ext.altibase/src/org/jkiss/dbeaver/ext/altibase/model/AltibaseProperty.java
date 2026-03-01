        final String max;
        // configurable without restarting the server
    public AltibaseDataSource getDataSource() {
                if (!CommonUtils.isEmpty(tmp)) {
            description = "";
    @Property(viewable = true, order = 1)
                    CommonUtils.isEmpty(max) ? "" : max
    @Override
 *
    }
    public AltibaseProperty(AltibaseDataSource dataSource, JDBCResultSet dbResult) {
import org.jkiss.utils.CommonUtils;
    }
        final String min;

 * See the License for the specific language governing permissions and
 * limitations under the License.

        return dynamic;
            description = String.format("%s  [%s, %s]",
    }
        return description;
    @NotNull
package org.jkiss.dbeaver.ext.altibase.model;
    public String getDescription() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.struct.DBSObject;

                    if (!CommonUtils.isEmpty(description)) {
 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 3)
 * Licensed under the Apache License, Version 2.0 (the "License");

                tmp = JDBCUtils.safeGetString(dbResult, "VALUE" + (i + 1));
 */
        min  = JDBCUtils.safeGetString(dbResult, "MIN");

                    JDBCUtils.safeGetString(dbResult, "VALUE1"),
    public DBSObject getParentObject() {
    @Nullable
    private final String name;
            }

 * You may obtain a copy of the License at
        // string
 * you may not use this file except in compliance with the License.
}
public class AltibaseProperty implements DBSObject {

        dynamic = (attr & AltibaseConstants.IDP_ATTR_RD_READONLY) == AltibaseConstants.IDP_ATTR_RD_WRITABLE;

 *
    }
                    );
    @NotNull
 *
        max  = JDBCUtils.safeGetString(dbResult, "MAX");
    }
        valueCount  = JDBCUtils.safeGetInt(dbResult, "STOREDCOUNT");

                    CommonUtils.isEmpty(min) ? "" : min,
import org.jkiss.dbeaver.Log;
    @Override
        return name;
    private final AltibaseDataSource dataSource;
            // Concatenate values: VALUE1, VALUE2, ...

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        final int valueCount;
        if (CommonUtils.isNotEmpty(min) || CommonUtils.isNotEmpty(max)) {
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
    public boolean isPersisted() {
    private long attr;
                }

        return getDataSource();
                // Though valueCount is 1, the value could be null.
import org.jkiss.dbeaver.model.meta.Property;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
        name = JDBCUtils.safeGetString(dbResult, "NAME");
    private boolean dynamic;
                    }
        return true;
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
        String tmp;
        } else {

        return dataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,

            for (int i = 0; i < valueCount; i++) {
    public String getName() {
                        description += ", ";
        attr = JDBCUtils.safeGetLong(dbResult, "ATTR");
    @Property(viewable = true, order = 2)
    private static final Log log = Log.getLog(AltibaseProperty.class);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    description += tmp;
        // number: current value [min, max]
    @Override
/*
        }
    private String description;
    }
        this.dataSource = dataSource;
    public boolean getDynamic() {
    @Override
