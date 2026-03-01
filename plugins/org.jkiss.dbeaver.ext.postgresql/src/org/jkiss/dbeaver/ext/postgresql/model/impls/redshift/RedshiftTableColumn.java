 *
    private String columnEncoding;

 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(table);
import org.jkiss.dbeaver.model.gis.GisConstants;
            }

 *
        return super.getFullTypeName();
 * Licensed under the Apache License, Version 2.0 (the "License");
        return GisConstants.SRID_SIMPLE;
    @Property(viewable = false, order = 23)
    @Property(viewable = true, order = 21)
    }
                return PostgreConstants.TYPE_CHAR + handler.getTypeModifiersString(dataType, getTypeMod());
    @Override

        return columnEncoding;
    public int getAttributeGeometrySRID(DBRProgressMonitor monitor) {
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    }
/*
    }
 */
    public String getColumnEncoding() {
        PostgreDataType dataType = getDataType();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public RedshiftTableColumn(RedshiftTable table) {
package org.jkiss.dbeaver.ext.postgresql.model.impls.redshift;
 * You may obtain a copy of the License at
    }
            // You can create bpchar column in Redshift but only without type modifiers.
import org.jkiss.dbeaver.DBException;
        columnEncoding = JDBCUtils.safeGetString(dbResult, "encoding");

import org.jkiss.dbeaver.model.meta.Property;
        super(monitor, table, dbResult);
    }
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
 * See the License for the specific language governing permissions and
            return PostgreConstants.TYPE_CHAR;
            final PostgreTypeHandler handler = PostgreTypeHandlerProvider.getTypeHandler(dataType);
 *
            if (handler != null) {
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        distKey = JDBCUtils.safeGetBoolean(dbResult, "attisdistkey");
import org.jkiss.code.NotNull;
    @Override

    @Property(viewable = false, order = 22)
        if (dataType != null && dataType.getObjectId() == PostgreOid.BPCHAR) {
        }
    }
    @NotNull
        return distKey;
    }
    public boolean isDistKey() {

    public String getAttributeGeometryType(DBRProgressMonitor monitor) {
public class RedshiftTableColumn extends PostgreTableColumn {
        return sortKey;
    private boolean distKey;
            // Redshift stores char columns with bpchar id in pg_type table for some reason.
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    @Property(viewable = true, editable = true, updatable = true, order = 20, listProvider = DataTypeListProvider.class)
import org.jkiss.dbeaver.ext.postgresql.model.data.type.PostgreTypeHandlerProvider;

 * RedshiftTableColumn base
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getFullTypeName() {
        sortKey = JDBCUtils.safeGetInt(dbResult, "attsortkeyord");
    public RedshiftTableColumn(DBRProgressMonitor monitor, RedshiftTable table, JDBCResultSet dbResult) throws DBException {
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.postgresql.model.data.type.PostgreTypeHandler;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreOid;

        return getTypeName();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
/**
    public int getSortKey() {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableColumn;

    }
    private int sortKey;
