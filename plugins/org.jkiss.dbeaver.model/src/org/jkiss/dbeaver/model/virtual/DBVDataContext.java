public class DBVDataContext extends DBVAbstractContext {
        }
            return switch (s) {
    public static final String VAR_ROW = "row";
    public class TableInfo extends DBVAbstractContext {
        } else if (s.equals(VAR_TABLE)) {
    public DBVDataContext(
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 * DBeaver - Universal Database Manager
            }
        }

        @Nullable String excludeName
 * limitations under the License.
    private final DBDAttributeBinding[] attributes;
                    return DBUtils.getAttributeValue(attr, attributes, row);
    private final Map<String, Object> nsList;

 * distributed under the License is distributed on an "AS IS" BASIS,
            for (DBDAttributeBinding attr : attributes) {
            if (s.equals(attr.getLabel())) {
 * Unless required by applicable law or agreed to in writing, software
                case "schema", "container" -> dataContainer.getParentObject();
            return new RowInfo();
            return ns;
 */
                default -> null;

    public static final String VAR_TABLE = "table";
        }

    }
import java.util.Map;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
    ) {
        Object ns = nsList.get(s);
 *
        if (ns != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Local table
        this.dataContainer = dataContainer;
        }
    public Object get(String s) {
        @Override
 * You may obtain a copy of the License at
            return null;
            }
        @Override
    }
        @NotNull DBDAttributeBinding[] allAttributes,
        } else if (s.equals(VAR_ROW)) {
    public class RowInfo extends DBVAbstractContext {
    }
        this.attributes = allAttributes;
        this.row = row;
            };
        this.nsList = DBVUtils.getExpressionNamespaces();
                case "name" -> dataContainer.getName();
        public Object get(String s) {
        @NotNull Object[] row,
/**
        @NotNull DBSObject dataContainer,
package org.jkiss.dbeaver.model.virtual;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final Object[] row;

        return null;
    }
            return null;
                }
            return new TableInfo();
 */

/*
import org.jkiss.dbeaver.model.DBUtils;
        if (s.equals(excludeName)) {
        public Object get(String s) {
        this.excludeName = excludeName;
        for (DBDAttributeBinding attr : attributes) {
import org.jkiss.dbeaver.model.struct.DBSObject;
                if (s.equals(attr.getLabel())) {
    @Override
import org.jkiss.code.NotNull;
                return DBUtils.getAttributeValue(attr, attributes, row);
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
 *
 * you may not use this file except in compliance with the License.
    private final String excludeName;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *


    private final DBSObject dataContainer;
