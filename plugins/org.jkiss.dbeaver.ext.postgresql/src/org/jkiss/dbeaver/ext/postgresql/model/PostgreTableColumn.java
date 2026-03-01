    }
        final List<PostgreTableConstraintBase<?>> cCache = getTable().getSchema().getConstraintCache().getCachedObjects(getTable());

    private static final Log log = Log.getLog(PostgreTableColumn.class);
                        }
    public int getAttributeGeometrySRID(DBRProgressMonitor monitor) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Nullable
public class PostgreTableColumn extends PostgreAttribute<PostgreTableBase>

    }
    public boolean isInReferenceKey() {
/**
        return PostgreGeometryTypeHandler.getGeometryType(getTypeMod());
                            if (cCol.getAttribute() == this) {
        }
    @Override
                    }
 * See the License for the specific language governing permissions and
        return getTable().getSchema();
 * PostgreTableColumn
        super(monitor, table, source);
    @Override

    }
        return false;
            for (PostgreTableConstraintBase<?> key : cCache) {
    protected boolean supportsDependencies() {
    public void setObjectDefinitionText(String sourceText) throws DBException {
    public PostgreTableColumn(PostgreTableBase table) {
    @NotNull
                            }
                }
import java.util.List;
    @Override
import org.jkiss.dbeaver.model.gis.GisAttribute;
            }
import org.jkiss.dbeaver.ext.postgresql.model.data.type.PostgreGeometryTypeHandler;
                    List<PostgreTableConstraintColumn> cColumns = ((PostgreTableConstraint) key).getColumns();
 * You may obtain a copy of the License at
        return PostgreGeometryTypeHandler.getGeometrySRID(getTypeMod());


                if (key instanceof PostgreTableConstraint && key.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY) {

        return getTable().getOwner(monitor);
        return DBStructUtils.generateObjectDDL(monitor, this, options, false);
 */

    public String generateChangeOwnerQuery(@NotNull String owner, @NotNull Map<String, Object> options) {
    public boolean isInUniqueKey() {

 *
    @Override
                                return true;
    public String getAttributeGeometryType(DBRProgressMonitor monitor) {
    public PostgreSchema getSchema() {

        return PostgreUtils.extractPermissionsFromACL(monitor, this, getAcl(), false);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        return this;
import org.jkiss.dbeaver.model.struct.DBStructUtils;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
        return null;
    }

    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
    }
 */
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
 *
import org.jkiss.code.Nullable;
    @Override
    @Override


        return true;
    @Override
        super(table);
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                        for (PostgreTableConstraintColumn cCol : cColumns) {
    }
    }
import java.util.Map;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        super(monitor, table, dbResult);
 *
import java.util.Collection;

        return false;

        if (!CommonUtils.isEmpty(cCache)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCColumnKeyType;
/*
    @Override
    }

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;

 * you may not use this file except in compliance with the License.
    protected JDBCColumnKeyType getKeyType() {
    }
    public PostgreTableColumn(DBRProgressMonitor monitor, PostgreTableBase table, JDBCResultSet dbResult) throws DBException {
    @Override
    @NotNull
    implements PostgrePrivilegeOwner, PostgreScriptObject, GisAttribute, JDBCColumnKeyType {

    }

}
import org.jkiss.code.NotNull;
    @Nullable
import org.jkiss.dbeaver.Log;
                    if (!CommonUtils.isEmpty(cColumns)) {
package org.jkiss.dbeaver.ext.postgresql.model;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public PostgreTableColumn(DBRProgressMonitor monitor, PostgreTableBase table, PostgreTableColumn source) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    public Collection<PostgrePrivilege> getPrivileges(@NotNull DBRProgressMonitor monitor, boolean includeNestedObjects) throws DBException {
    @Override
    }
    }
