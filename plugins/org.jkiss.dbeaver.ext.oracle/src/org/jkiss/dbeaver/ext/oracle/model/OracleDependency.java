            )) {

                    }

        this.objectName = objectName;
        this.objectType = OracleObjectType.getByType(objectType);
    }
        this.objectOwnerName = objectOwnerName;
    public DBPImage getObjectImage() {
    public OracleObjectType getObjectType() {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        return objectType;
                        ));
                            JDBCUtils.safeGetString(dbResult, dependents ? "NAME" : "REFERENCED_NAME"),
 * See the License for the specific language governing permissions and
                "SELECT " + OracleUtils.getSysCatalogHint(dataSource) + " *" +
    @Property(viewable = true, order = 3)
/*
    @Property(viewable = true, order = 1)
        return objectOwnerName + '.' + objectName + '(' + dependencyType + ')';
    }
                            JDBCUtils.safeGetString(dbResult, dependents ? "TYPE" : "REFERENCED_TYPE"),
    @Property(viewable = true, order = 5)
        return dependencies;
                            JDBCUtils.safeGetString(dbResult, dependents ? "OWNER" : "REFERENCED_OWNER"),
    private final String objectName;
        } catch (Exception e) {
    @Override
                dbStat.setString(1, object.getParentObject().getName());
    public static List<OracleDependency> readDependencies(@NotNull DBRProgressMonitor monitor, @NotNull DBSObject object, boolean dependents) throws DBException {

                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
    public String getName() {
                "\nORDER BY " + (dependents ? "NAME" : "REFERENCED_NAME")
    private final OracleObjectType objectType;
    }
            throw new DBCException("Error reading dependencies", e);
    @Override
    private final String objectOwnerName;
    public OracleSchema getObjectOwner(DBRProgressMonitor monitor) throws DBException {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.struct.DBSObject;
    @NotNull


                            JDBCUtils.safeGetString(dbResult, "DEPENDENCY_TYPE")

        return dependencyType;
public class OracleDependency extends OracleObject<DBSObject> implements DBPUniqueObject, DBPImageProvider {
    }
import org.jkiss.dbeaver.model.DBPUniqueObject;
    @Override
            OracleDataSource dataSource = (OracleDataSource) object.getDataSource();
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.dbeaver.model.DBPImage;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.dependencyType = OracleDependencyType.getByType(dependencyType);

        super(parent, null, parent.isPersisted());
        return getDataSource().getSchema(monitor, objectOwnerName);

            }
                    while (dbResult.next()) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, object, "Load object dependencies")) {
        return objectType.getImage();

import org.jkiss.code.NotNull;
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPImageProvider;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        return objectType.findObject(monitor, getObjectOwner(monitor), objectName);
import java.util.ArrayList;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.DBException;

                "\nWHERE " + (dependents ? "REFERENCED_OWNER=? AND REFERENCED_NAME=?" : "OWNER=? AND NAME=? AND REFERENCED_TYPE <> 'NON-EXISTENT'") +
}
    public OracleDependency(DBSObject parent, String objectOwnerName, String objectName, String objectType, String dependencyType) {
    @NotNull
import java.util.List;
        List<OracleDependency> dependencies = new ArrayList<>();

                "\nFROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), dataSource, "DEPENDENCIES") +
    @Property(viewable = true, order = 2)
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return objectName;
 *
                            object,
    private final OracleDependencyType dependencyType;
package org.jkiss.dbeaver.ext.oracle.model;
                }

    public String getUniqueName() {
    @NotNull
    @Property(viewable = true, order = 4)
                dbStat.setString(2, object.getName());
    public DBSObject getObject(DBRProgressMonitor monitor) throws DBException {
                        dependencies.add(new OracleDependency(
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.meta.Property;
    public OracleDependencyType getDependencyType() {

 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * limitations under the License.
    }
import org.jkiss.dbeaver.model.DBUtils;
