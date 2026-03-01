
        this.baseObjectType = baseObjectType;
    public boolean isPersisted() {
    private String baseObjectType, baseObjectSchema, baseObjectName;
        @Override public String getDescription() { return null; }
    class DummyObject implements DBSObject {
 *
    public DBSObject getBaseObject(DBRProgressMonitor monitor) throws DBException {
        return object;
    @Override
    public DBSObject getParentObject() {
                }

                    " WHERE DEPENDENT_SCHEMA_NAME = ? AND DEPENDENT_OBJECT_NAME = ?" +
 * limitations under the License.
            case "FUNCTION":

    }
    @Property(viewable = true, order = 21)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

    public static List<HANADependency> readDependencies(DBRProgressMonitor monitor, DBSObject object) throws DBException {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @Override
        @Override public boolean isPersisted() { return false; }
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
    @Override
        this.baseObjectName = baseObjectName;
    
                        HANADependency dependency = new HANADependency(object, baseObjectType, baseObjectSchema, baseObjectName);
                dbStat.setString(2, object.getName());
        @NotNull
            }
    }
        if(schema == null) 
    }
        
        return dependentObject.getDataSource();
 *
import java.util.ArrayList;

    public DBPDataSource getDataSource() {
    @Override
        // TODO: dummy object should be shown as plain text without non-working hyperlink
        DBSObject schema = ((GenericDataSource)dependentObject.getDataSource()).getSchema(baseObjectSchema);
    private DBSObject dependentObject;
        DBSObject object = null;
                dbStat.setString(1, object.getParentObject().getName());
                    }
                        dependencies.add(dependency);
    public String getBaseObjectType() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            case "PROCEDURE":



 *
                object = schema.getTable(monitor, baseObjectName);
    public String getName() {
        }
 * Unless required by applicable law or agreed to in writing, software
            throw new DBDatabaseException(e, object.getDataSource());
        return dependentObject.getParentObject();
    @Property(viewable = true, order = 20)
    }
import org.jkiss.dbeaver.model.DBUtils;

    public DBSObject getBaseObjectSchema(DBRProgressMonitor monitor) throws DBException {
            case "SYNONYM":
                return dependencies;
 * DBeaver - Universal Database Manager
import java.sql.SQLException;
        return schema;
import org.jkiss.dbeaver.DBDatabaseException;
                object = DBUtils.findObject(schema.getSynonyms(monitor), baseObjectName);
                    while (dbResult.next()) {
    }
        return null;
        GenericSchema schema = ((GenericDataSource)dependentObject.getDataSource()).getSchema(baseObjectSchema);
                        String baseObjectType   = dbResult.getString(1);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others

        DummyObject(String name) { this.name = name; }
            schema = new DummyObject(baseObjectSchema);
                    "SELECT BASE_OBJECT_TYPE, BASE_SCHEMA_NAME, BASE_OBJECT_NAME" +
        try (JDBCSession session = DBUtils.openMetaSession(monitor, object.getDataSource(), "Read dependencies")) {
    
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public HANADependency(DBSObject dependentObject, String baseObjectType, String baseObjectSchema, String baseObjectName) {
 * you may not use this file except in compliance with the License.
    @Override
                object = schema.getProcedure(monitor, baseObjectName);
 */
        } catch (SQLException e) {

        private String name;
import org.jkiss.dbeaver.model.DBPDataSource;
        this.baseObjectSchema = baseObjectSchema;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.hana.model;
                    " ORDER BY BASE_SCHEMA_NAME, BASE_OBJECT_NAME")) {
import org.jkiss.dbeaver.model.struct.DBSObject;
        @Override public String getName() { return name; }
    @Property(viewable = true, order = 22)
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                break;

                    " FROM SYS.OBJECT_DEPENDENCIES" +
        if(object == null)
    
        @Override public DBPDataSource getDataSource() { return null; }
        
        this.dependentObject = dependentObject;
            object = new DummyObject(baseObjectName);
        return baseObjectType;
    }
    }
    }
            switch(baseObjectType) {


                break;
                break;
                        String baseObjectSchema = dbResult.getString(2);
        return true;
 * distributed under the License is distributed on an "AS IS" BASIS,
    
        return DBUtils.getFullyQualifiedName(dependentObject.getDataSource(), baseObjectSchema, baseObjectName);
        }
    };
    @NotNull
import java.util.List;
        List<HANADependency> dependencies = new ArrayList<>();
import org.jkiss.dbeaver.model.meta.Property;
    }
/*
            case "VIEW":
    }
        if(schema != null) {
                object = schema.getChild(monitor, baseObjectName);
        @Override public DBSObject getParentObject() { return null; }
    
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
            case "TABLE":
 * See the License for the specific language governing permissions and
public class HANADependency implements DBSObject {
    public String getDescription() {
            default:
}
                        String baseObjectName   = dbResult.getString(3);
