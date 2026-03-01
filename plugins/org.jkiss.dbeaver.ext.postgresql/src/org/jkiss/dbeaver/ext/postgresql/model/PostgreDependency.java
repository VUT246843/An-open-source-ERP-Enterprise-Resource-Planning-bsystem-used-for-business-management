        return database;
import org.jkiss.dbeaver.model.meta.Property;

        return name + " (" + depType + ")";
package org.jkiss.dbeaver.ext.postgresql.model;
            return "Attribute";
                    return DBUtils.findObject(((PostgreTable)tableBase).getForeignKeys(monitor), name);
        if (objectType.startsWith("i")) {
import org.jkiss.code.NotNull;
                    "    CASE WHEN cl.relname IS NOT NULL AND att.attname IS NOT NULL THEN cl.relname || '.' || att.attname\n" +
                    "LEFT JOIN pg_attribute attr ON attr.attrelid=ad.adrelid and attr.attnum=ad.adnum\n" +
                            objName,
            throw new DBCException("Error reading dependencies", e);
    @Override
        if (schema == null) {
                    "LEFT JOIN pg_namespace nsc ON cl.relnamespace=nsc.oid\n" +
 *
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        if (targetObject == null) {
 * limitations under the License.
            }
import org.jkiss.dbeaver.model.struct.DBSObject;

        return DBIcon.TREE_REFERENCE;
 * DBeaver - Universal Database Manager

    public String getObjectType() {
            return DBIcon.TREE_TRIGGER;
                    "    COALESCE(coc.relname, clrw.relname, tgr.relname) AS ownertable,\n" +
 *
import java.util.ArrayList;
        this.depType = depType;
    @Override
        return schemaName;
    }
    @Override
                    "        WHEN ns.oid IS NOT NULL THEN 'n'::text\n" +
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    }
            return "Index";
    }
            if (tableBase instanceof PostgreTable) {
    private String depType;
     * SQL query originally copy-pasted from pgAdmin sources with some modifications.
                    "LEFT JOIN pg_attrdef ad ON ad.oid=dep." + queryObjId + "\n" +
        } else if (objectType.startsWith("r")) {
                        String objDesc = JDBCUtils.safeGetString(dbResult, "adefval");
            return null;
            if (objectType.endsWith("f")) {
        } else if (objectType.startsWith("T")) {
    private String objectType;
                }
    public PostgreDatabase getDatabase() {
            } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    "        WHEN rw.oid IS NOT NULL THEN 'R'::text\n" +
        } else if (objectType.startsWith("S")) {
        }
                    "    CASE WHEN cl.relkind IS NOT NULL THEN cl.relkind::text || COALESCE(dep.objsubid::text, '')::text\n" +
                return DBIcon.TREE_CONSTRAINT;
    @NotNull
            }
    @Property(viewable = true, order = 4)
                            JDBCUtils.safeGetString(dbResult, "deptype"),
        }
                    "        ELSE ''\n" +
        return name;
                return tableBase.getAttribute(monitor, name);
                    "LEFT JOIN pg_namespace nsp ON pr.pronamespace=nsp.oid\n" +
        } else if (objectType.startsWith("A")) {
                    "    COALESCE(nsc.nspname, nso.nspname, nsp.nspname, nst.nspname, nsrw.nspname, tgrn.nspname) AS nspname\n" +
        return dependencies;
        } else if (objectType.startsWith("A")) {
    private String schemaName;
            return DBIcon.TREE_INDEX;
                    "LEFT JOIN pg_proc pr ON dep." + queryObjId + "=pr.oid\n" +
        }
    }
                    "LEFT JOIN pg_class coc ON co.conrelid=coc.oid\n" +
import java.util.Collection;
            }
                    Collection<PostgreTableConstraint> constraints = tableBase.getConstraints(monitor);
        } else if (objectType.startsWith("R")) {
    public String getName() {
import org.jkiss.utils.CommonUtils;
                        String objName = JDBCUtils.safeGetString(dbResult, "refname");
            tableBase = schema.getTableCache().getObject(monitor, schema, tableName);
    public PostgreObject getTargetObject(DBRProgressMonitor monitor) throws DBException {
            if (tableBase != null) {
                    "LEFT JOIN pg_attribute att ON dep." + queryObjId + "=att.attrelid AND dep.objsubid=att.attnum\n" +
 * You may obtain a copy of the License at
                    "LEFT JOIN pg_trigger tg ON dep." + queryObjId + "=tg.oid\n" +
                        PostgreDependency dependency = new PostgreDependency(

                    "LEFT JOIN pg_namespace nsrw ON clrw.relnamespace=nsrw.oid\n" +
                    "LEFT JOIN pg_class clrw ON clrw.oid=rw.ev_class\n" +
        }
        return tableName;
    }
 *
                    "LEFT JOIN pg_namespace tgrn ON tgr.relnamespace=tgrn.oid\n" +
    private final long objectId;
    }
     */
            return null;

                    while (dbResult.next()) {
                    "        WHEN pr.oid IS NOT NULL THEN 'p'::text\n" +
        return targetObject;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private static final Log log = Log.getLog(PostgreDependency.class);
            {
            }
                    "LEFT JOIN pg_namespace nso ON co.connamespace=nso.oid\n" +
            return "Sequence";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } else {
        if (objectType.startsWith("i")) {
import org.jkiss.dbeaver.model.*;
            String condObjId = dependents ? "refobjid" : "objid";
    public String getTableName() {
            if (tableBase instanceof PostgreTable) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
                    "    END AS refname,\n" +
                            tableName,
    @Property(viewable = true, order = 1)

            return null;
            return tableBase;


    @Property(viewable = true, order = 3)

                            objDesc,
    private PostgreObject targetObject;
        PostgreSchema schema = database.getSchema(monitor, schemaName);
        this.description = description;
            String queryObjId = dependents ? "objid" : "refobjid";

    @Property(viewable = true, order = 2)
        this.name = name;
    @NotNull

                return "Constraint";
            targetObject = findTargetObject(monitor);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            } else if (objectType.endsWith("p")) {
                    "FROM pg_depend dep\n" +
    /**
    @Override
        List<PostgreDependency> dependencies = new ArrayList<>();
    @NotNull
    public long getObjectId() {
            } else {
            return DBIcon.TREE_COLUMN;
                            object.getDatabase(),
import org.jkiss.dbeaver.DBException;
    }
                    "LEFT JOIN pg_namespace nst ON ty.typnamespace=nst.oid\n" +
                dbStat.setLong(1, object.getObjectId());
public class PostgreDependency implements PostgreObject, DBPOverloadedObject, DBPImageProvider {
            return "Table";
        this.schemaName = schemaName;

        PostgreTableBase tableBase = null;
                    "    END AS type,\n" +
            return DBIcon.TREE_FUNCTION;
    }
import java.util.List;
                            objName = JDBCUtils.safeGetString(dbResult, "attname");
        return null;
                        String tableName = JDBCUtils.safeGetString(dbResult, "ownertable");
        }
        if (!CommonUtils.isEmpty(tableName)) {
                if (tableBase instanceof PostgreTable) {
            }
                return schema.getSequence(monitor, name);
                return "Foreign Key";

                "SELECT DISTINCT dep.deptype, dep.classid, dep." + queryObjId + ", cl.relkind, attr.attname,pg_get_expr(ad.adbin, ad.adrelid) adefval,\n" +
        } else if (objectType.startsWith("T")) {
    public String getSchemaName() {
                    "        WHEN co.oid IS NOT NULL THEN 'C'::text || contype::text\n" +
    public PostgreDataSource getDataSource() {
                if (tableBase != null) {
                            schemaName);
        } else if (objectType.startsWith("S")) {
                    "LEFT JOIN pg_language la ON dep." + queryObjId + "=la.oid\n" +
                return DBIcon.TREE_FOREIGN_KEY;
            }
            return DBIcon.TREE_SEQUENCE;
        }
                return "Primary Key";
        } else if (objectType.startsWith("S")) {
    private String tableName;
                }
    }
                return tableBase.getSchema().getSequence(monitor, name);
            return null;
        } else if (objectType.startsWith("r")) {
    private String description;
        } else if (objectType.startsWith("A")) {
 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = false)
        return true;
        this.tableName = tableName;
    }
                }
                            JDBCUtils.safeGetLong(dbResult, queryObjId),
        this.objectType = objectType;
        return objectType;
    private PostgreObject findTargetObject(DBRProgressMonitor monitor) throws DBException {
    @Property(viewable = true, order = 5)

}    @Override
/**
                        if (CommonUtils.isEmpty(objName)) {
        if (objectType.startsWith("i")) {
import org.jkiss.dbeaver.model.exec.DBCException;
                    "LEFT JOIN pg_class cl ON dep." + queryObjId + "=cl.oid\n" +
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else if (objectType.startsWith("C")) {
            return "Trigger";
        } else if (objectType.startsWith("C")) {
    @NotNull
    @Override
        return objectId;
        } else if (objectType.startsWith("r")) {
        } else if (objectType.startsWith("T")) {
        }

                    "        WHEN tg.oid IS NOT NULL THEN 'T'::text\n" +
    public DBPImage getObjectImage() {
                    "LEFT JOIN pg_type ty ON dep." + queryObjId + "=ty.oid\n" +

    }
    public static List<PostgreDependency> readDependencies(DBRProgressMonitor monitor, PostgreObject object, boolean dependents) throws DBCException {
import org.jkiss.dbeaver.Log;
        } else if (objectType.startsWith("R")) {
            if (tableBase != null) {
    @Override
    }
                    "    ELSE COALESCE(cl.relname, co.conname, pr.proname, tg.tgname, ty.typname, la.lanname, rw.rulename, ns.nspname)\n" +
    private String name;
    public String getDescription() {
            } else {
                            JDBCUtils.safeGetString(dbResult, "type"),
        return database;
    public DBSObject getParentObject() {
                    return constraints == null ? null : DBUtils.findObject(constraints, name);
            }
            }
        if (CommonUtils.isEmpty(schemaName)) {
        }
        return database.getDataSource();
    @Override
 * you may not use this file except in compliance with the License.

            } else if (objectType.endsWith("p")) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
*/
                return DBIcon.TREE_UNIQUE_KEY;
                        String schemaName = JDBCUtils.safeGetString(dbResult, "nspname");
    @Override
            return "Rule";
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    "        WHEN la.oid IS NOT NULL THEN 'l'::text\n" +
        this.database = database;
                return ((PostgreTable)tableBase).getTrigger(monitor, name);

            return null;
    public PostgreDependency(PostgreDatabase database, long objectId, String depType, String name, String description, String objectType, String tableName, String schemaName) {
        } else if (objectType.startsWith("C")) {
                        }
        this.objectId = objectId;
                        dependencies.add(dependency);

                    "LEFT JOIN pg_class tgr ON tg.tgrelid=tgr.oid\n" +
                    "        WHEN ty.oid IS NOT NULL THEN 'y'::text\n" +
            return null;
                return DBUtils.findObject(((PostgreTable)tableBase).getIndexes(monitor), name);
                    "LEFT JOIN pg_rewrite rw ON dep." + queryObjId + "=rw.oid\n" +
                    "WHERE dep." + condObjId + "=?\n" +

    }
    private final PostgreDatabase database;
            if (objectType.endsWith("f")) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, object, "Load object dependencies")) {
        } catch (Exception e) {
            return schema.getProcedure(monitor, name);
            return DBIcon.TREE_TABLE;
        return description;
    }
        } else if (objectType.startsWith("R")) {
                    "        WHEN ad.oid IS NOT NULL THEN 'A'::text\n" +
    public String getOverloadedName() {
* Dependency
    }
                    "ORDER BY type"))

     * Reads list of dependent objects.
                    "LEFT JOIN pg_constraint co ON dep." + queryObjId + "=co.oid\n" +
/*
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
            if (objectType.endsWith("f")) {
    public boolean isPersisted() {
                    "LEFT JOIN pg_namespace ns ON dep." + queryObjId + "=ns.oid\n" +


    }
