    private String name;
            this.optionalKey = JDBCUtils.safeGetBoolean(dbResult, "amoptionalkey");
    public Collection<PostgreOperatorFamily> getOperatorFamilies(DBRProgressMonitor monitor) throws DBException {
        {
    public int getSupportRoutines() {
        return predLocks;
        this.name = JDBCUtils.safeGetString(dbResult, "amname");
    private String type;
    }
    public PostgreOperatorClass getOperatorClass(DBRProgressMonitor monitor, long oid) throws DBException {

            this.clusterable = JDBCUtils.safeGetBoolean(dbResult, "amclusterable");
/**

            this.storage = JDBCUtils.safeGetBoolean(dbResult, "amstorage");
 *
    }
    private boolean canOrder;
        }
 * See the License for the specific language governing permissions and
import java.sql.SQLException;
    }
        return canOrder;

    }
 * You may obtain a copy of the License at
/*
            this.predLocks = JDBCUtils.safeGetBoolean(dbResult, "ampredlocks");
    static class OperatorClassCache extends JDBCObjectCache<PostgreAccessMethod, PostgreOperatorClass> {
        this.loadInfo(dbResult);
        {
        return oid;
        return clusterable;
            this.searchNulls = JDBCUtils.safeGetBoolean(dbResult, "amsearchnulls");
        }
    public static final String CAT_FLAGS = "Flags";
        protected PostgreOperatorClass fetchObject(@NotNull JDBCSession session, @NotNull PostgreAccessMethod owner, @NotNull JDBCResultSet dbResult)
    private boolean canOrderByOp;
    }

        return handler;
    private boolean clusterable;
        protected PostgreOperatorFamily fetchObject(@NotNull JDBCSession session, @NotNull PostgreAccessMethod owner, @NotNull JDBCResultSet dbResult)
    public long getObjectId() {
    }
                throws SQLException
        @Override


            return new PostgreOperatorFamily(owner, dbResult);
        return operatorStrategies;
    @Property(category = CAT_ROUTINES, order = 100)
    public boolean isCanUnique() {

    public boolean isCanOrder() {
    @Association
        return type;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
    public PostgreOperatorFamily getOperatorFamily(DBRProgressMonitor monitor, long oid) throws DBException {
        return canOrderByOp;
                throws SQLException
                throws SQLException, DBException
            return session.prepareStatement(


import org.jkiss.dbeaver.DBException;
            // New simpler version of pg_am

        return storage;
 *
 *
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
            return session.prepareStatement(
    private boolean canUnique;
            this.handler = JDBCUtils.safeGetString(dbResult, "amhandler");

        }
    public String getType() {
    @Property(category = CAT_FLAGS, order = 210)
import java.sql.ResultSet;
    private boolean predLocks;
    {
    }
public class PostgreAccessMethod extends PostgreInformation {
        return searchNulls;
        return PostgreUtils.getObjectById(monitor, operatorFamilyCache, this, oid);
    @Property(viewable = true, order = 4)
    @Override
    public String getHandler() {
    public String getName()
    @Property(category = CAT_FLAGS, order = 207)
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.canUnique = JDBCUtils.safeGetBoolean(dbResult, "amcanunique");
    @Property(category = CAT_FLAGS, order = 205)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    @Property(category = CAT_FLAGS, order = 200)
    

        return operatorFamilyCache.getAllObjects(monitor, this);
    public boolean isCanBackward() {

    }
    private String handler;
    @Property(category = CAT_FLAGS, order = 206)
    public Collection<PostgreOperatorClass> getOperatorClasses(DBRProgressMonitor monitor) throws DBException {
    private long oid;
            this.canOrder = JDBCUtils.safeGetBoolean(dbResult, "amcanorder");
    private boolean storage;
        return PostgreUtils.getObjectById(monitor, operatorClassCache, this, oid);
    public boolean isClusterable() {
    }
    private boolean canBackward;
    @Property(viewable = true, order = 2)
    private boolean canMultiCol;

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreAccessMethod owner)

        @NotNull


                throws SQLException, DBException
    {

    public boolean isSearchArray() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return supportRoutines;
    @Association
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreAccessMethod owner)
    @Property(category = CAT_FLAGS, order = 202)

        if (getDataSource().isServerVersionAtLeast(9, 6)) {
        return canUnique;
            );
        super(database);
                            "\nORDER BY oc.oid"
            this.canOrderByOp = JDBCUtils.safeGetBoolean(dbResult, "amcanorderbyop");
            this.searchArray = JDBCUtils.safeGetBoolean(dbResult, "amsearcharray");
    }
            this.canBackward = JDBCUtils.safeGetBoolean(dbResult, "amcanbackward");
    }
        }
    @Property(viewable = true, order = 1)
            this.operatorStrategies = JDBCUtils.safeGetInt(dbResult, "amstrategies");

        return canMultiCol;
 * PostgreAccessMethod
    public boolean isPredLocks() {
    }
        } else {
    @Property(category = CAT_FLAGS, order = 208)
    @Property(category = CAT_FLAGS, order = 204)
    }
package org.jkiss.dbeaver.ext.postgresql.model;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        @Override

            );
    }
        throws SQLException

        {
    @NotNull
                    "SELECT oc.oid,oc.* FROM pg_catalog.pg_opclass oc " +
    }

    @Property(category = CAT_FLAGS, order = 203)
import org.jkiss.code.NotNull;
    public boolean isCanOrderByOp() {



        @NotNull
    }
    public PostgreAccessMethod(PostgreDatabase database, ResultSet dbResult)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        {
        return searchArray;
    }
        @Override
import org.jkiss.dbeaver.model.meta.Property;
    public boolean isStorage() {
 * DBeaver - Universal Database Manager

    }
 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software
    private boolean searchArray;
    public int getOperatorStrategies() {
        return canBackward;
    private boolean optionalKey;


    private final OperatorFamilyCache operatorFamilyCache = new OperatorFamilyCache();
    static class OperatorFamilyCache extends JDBCObjectCache<PostgreAccessMethod, PostgreOperatorFamily> {
    }
                    "SELECT of.oid,of.* FROM pg_catalog.pg_opfamily of " +
    @Property(viewable = true, order = 3)
    public boolean isOptionalKey() {
    private int operatorStrategies;
    private int supportRoutines;
    @Property(category = CAT_ROUTINES, order = 101)
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
    private final OperatorClassCache operatorClassCache = new OperatorClassCache();

    public boolean isSearchNulls() {
            this.supportRoutines = JDBCUtils.safeGetInt(dbResult, "amsupport");
import org.jkiss.dbeaver.model.meta.Association;
    {
 */
    }
        throws SQLException



        }
    private void loadInfo(ResultSet dbResult)
    private boolean searchNulls;
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    }
        return optionalKey;
            this.type = JDBCUtils.safeGetString(dbResult, "amtype");
        return name;
        @Override
import java.util.Collection;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            "\nORDER BY of.oid"
}
        return operatorClassCache.getAllObjects(monitor, this);
    }

            return new PostgreOperatorClass(owner, dbResult);
 * you may not use this file except in compliance with the License.
 */
            this.canMultiCol = JDBCUtils.safeGetBoolean(dbResult, "amcanmulticol");
    @Property(category = CAT_FLAGS, order = 201)
    public boolean isCanMultiCol() {
    public static final String CAT_ROUTINES = "Routines";
    @Property(category = CAT_FLAGS, order = 209)
