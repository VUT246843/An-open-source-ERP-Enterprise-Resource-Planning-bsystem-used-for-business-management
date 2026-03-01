    @Association
    private static final String C_PE = "SELECT * FROM SYSCAT.PERIODS WHERE TABSCHEMA = ? AND TABNAME = ? ORDER BY PERIODNAME WITH UR";
    private DB2TablePartitionMode partitionMode;
import java.util.Collection;

    public class ColumnMaskCache extends JDBCObjectLookupCache<DB2Table, DB2ColumnMask> {
import java.sql.SQLException;

    public DB2ColumnMask getColumnMask(@NotNull DBRProgressMonitor monitor, @NotNull String maskName) throws DBException {

    // -----------------

        super(schema, name, false);
            @Nullable DB2ColumnMask object,

        // TODO DF: beurk: Consequences of "Integrated cache" that can not be created in class def= NPE with managers
        return getContainer().getTableCache();

    {
    {
    }
    private DB2TableLockSize lockSize;
        return getContainer().getTableCache().refreshObject(monitor, getContainer(), this);
        return DB2Tablespace.resolveTablespaceReference(monitor, getDataSource(), tablespace);
}
                log.debug("Skip column mask without column name in table " + db2Table.getName());

        return overFLow;
            if (CommonUtils.isEmpty(colName)) {
                        }
import java.util.List;
    public Long getfPages()

    public String getVolatileMode()
        return PRESENTED_PSEUDO_ATTRS;
        return columnMaskCache.getObject(monitor, this, maskName);
    {
    @NotNull
                        DB2Table ownerTable = DB2Utils.findTableBySchemaNameAndName(
 * distributed under the License is distributed on an "AS IS" BASIS,

    {
    }
    private Object longTablespace;
    @Property(viewable = true, editable = false, order = 3, category = DBConstants.CAT_STATISTICS)
import org.jkiss.dbeaver.ext.db2.editors.DB2SourceObject;
import java.sql.ResultSet;
        } catch (SQLException e) {
    }
    private DB2TableOrganizationMode organizationMode;
    @Override
        } else {
    @Association
    }
        if (partitionCache == null) {
import org.jkiss.dbeaver.DBException;

import java.util.ArrayList;
    {

 */
    @NotNull

        // RID_BIT is not supported.
    @Property(viewable = false, editable = false, order = 109)
            return null;
    @Property(specific = true, order = 107)

        if (getDataSource().isAtLeastV9_5() && !getDataSource().isBigSQL()) {
        this.type = DB2TableType.T;
    {
    // -----------------

        this.organizationMode = CommonUtils.valueOf(DB2TableOrganizationMode.class, JDBCUtils.safeGetString(dbResult, "TABLEORG"));
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.UNIQUE_KEY, DB2TableUniqueKey.class)
    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)
        return getContainer().getTableCache().getChild(monitor, getContainer(), this, attributeName);

    private DB2TableTemporalType temporalType;
    @NotNull
    }
    {
        boolean includeViews = CommonUtils.getOption(options, OPTION_SCRIPT_INCLUDE_VIEWS);
        return accessMode;
    @Association
                        String ownerTableName = JDBCUtils.safeGetString(dbResult, "TABNAME");
    @Override
    @Association
                    "WITH UR")) {
 * See the License for the specific language governing permissions and
        this.lastRegenTime = JDBCUtils.safeGetTimestamp(dbResult, "LAST_REGEN_TIME");
    public DB2TableAccessMode getAccessMode()
    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)
    public Collection<DB2TablePeriod> getPeriods(DBRProgressMonitor monitor) throws DBException
        return getContainer().getCheckCache().getObject(monitor, getContainer(), this, ukName);
    private DB2TableCompressionMode compression;
        if (getDataSource().isAtLeastV10_1()) {
    private Object tablespace;
    {
    private Timestamp invalidateTime;
            true,
    }
    public DB2TableCompressionMode getCompression()

            }
    private Long nPages;
    }
    @Override
    {
    public Collection<DB2ColumnMask> getColumnMasks(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
    {

        this.fPages = JDBCUtils.safeGetLongNullable(dbResult, "FPAGES");
    {
            JDBCPreparedStatement statement = session.prepareStatement(sql);
    private DB2TableAccessMode accessMode;
    }
    private Long fPages;
    @Association
                            continue;
            return new ArrayList<>(referenceCache);
            return null;
    }
        }
        return DB2Utils.generateDDLforTable(monitor, LINE_SEPARATOR, getDataSource(), this, includeViews);
import org.jkiss.dbeaver.model.exec.DBCException;
    }
    private static final String LINE_SEPARATOR = GeneralUtils.getDefaultLineSeparator();
        }

        return super.getName();
        ) throws SQLException {
    {
                "SELECT R.* FROM SYSCAT.REFERENCES R\n" +

                    "WHERE R.REFTABSCHEMA = ? AND R.REFTABNAME = ?\n" +
    }
    public void setTablespace(DB2Tablespace tablespace)
            null,
    private String constChecked;
    {
        if (periodCache == null) {
        return constChecked;
        this.volatileMode = JDBCUtils.safeGetString(dbResult, "VOLATILE");
    @Property(viewable = false, editable = false, specific = true, order = 105)
    public DB2Tablespace getIndexTablespace(DBRProgressMonitor monitor) throws DBException
    // -----------------


    {
    }
    public void setIndexTablespace(DB2Tablespace indexTablespace)
            String sql = "SELECT * FROM SYSCAT.CONTROLS\n" +
        return statsTime;

        return columnMaskCache.getAllObjects(monitor, this);
    private DB2TableType type;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
import org.jkiss.code.NotNull;
    public Collection<DB2TablePartition> getPartitions(DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    private DBSObjectCache<DB2Table, DB2TablePartition> partitionCache;
    {
        this.constChecked = JDBCUtils.safeGetString(dbResult, "CONST_CHECKED");
    @Association
    private Boolean mdcClustered;
    public Timestamp getAlterTime()
    private DB2TableDropRule dropRule;
import org.jkiss.dbeaver.model.struct.*;
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException

import org.jkiss.dbeaver.model.DBConstants;
    {
    private Long overFLow;
                    List<DB2TableForeignKey> result = new ArrayList<>();
                    "ORDER BY R.REFKEYNAME\n" +

    @Override
                statement.setString(3, object != null ? object.getName() : objectName);
            return partitionCache.getAllObjects(monitor, this);
        this.partitionMode = CommonUtils.valueOf(DB2TablePartitionMode.class, JDBCUtils.safeGetString(dbResult, "PARTITION_MODE"));
    public DB2Tablespace getTablespace(DBRProgressMonitor monitor) throws DBException
        getContainer().getConstraintCache().clearObjectCache(this);
        return List.of(
    }
        return mdcClustered;
 * you may not use this file except in compliance with the License.
    }

            DBSEntityConstraintInfo.of(DBSEntityConstraintType.PRIMARY_KEY, DB2TableUniqueKey.class),
        return dropRule;

    {
        this.status = DB2TableStatus.N;
    public DB2TableStatus getStatus()
        return getContainer().getAssociationCache().getObject(monitor, getContainer(), this, ukName);
        @Override

            @NotNull JDBCSession session,
    {
    }
    @Property(viewable = false, editable = false, order = 120, category = DB2Constants.CAT_TEMPORAL)
    }
    @Property(viewable = false, editable = false, specific = true, order = 111)
            if (CommonUtils.isEmpty(maskName)) {
    {
    }

            "DATASLICEID",
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            this.alterTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_ALTER_TIME);
                }
    private static final DBDPseudoAttribute[] PRESENTED_PSEUDO_ATTRS = new DBDPseudoAttribute[] {
        )
    // Associations

                log.debug("Skip column mask without name in table " + db2Table.getName());
            DB2Messages.pseudo_column_datasliceid_description,
    @Override
    @Property(viewable = false, editable = false, specific = true, order = 106)

        return temporalType;
    public Timestamp getStatsTime()
        @Override
    @Property(viewable = false, editable = false, specific = true, order = 110)
 * 
    {
    }
        return dataCapture;
    }


    {
        //   SQLSTATE=56038, DRIVER=4.31.10
 *
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
    }
                    }
        }
    // Constructors
    @Property(viewable = true, editable = false, order = 5)
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
            }
            @NotNull DB2Table db2Table,
                (object != null || objectName != null ? " AND CONTROLNAME = ?" : "");
    // -----------------
    public Long getnPages()
    }
    }
    {
    // Business Contract
    @Association
        this.dataCapture = JDBCUtils.safeGetString(dbResult, "DATACAPTURE");
 * Copyright (C) 2010-2025 DBeaver Corp and others

    private Object indexTablespace;
        this.dropRule = CommonUtils.valueOf(DB2TableDropRule.class, JDBCUtils.safeGetString(dbResult, "DROPRULE"));
    public Collection<DB2TableUniqueKey> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException

    }
    }


            return new DB2ColumnMask(db2Table, attribute, maskName, resultSet);
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
        return organizationMode;

        return invalidateTime;
    public DB2TableDropRule getDropRule()
        }
 * limitations under the License.
/**
    private DB2TableStatus status;
            this.lockSize = CommonUtils.valueOf(DB2TableLockSize.class, lockSizeString);
import org.jkiss.dbeaver.ext.db2.DB2Messages;
    }
        return getContainer().getCheckCache().getObjects(monitor, getContainer(), this);
    {
import org.jkiss.utils.CommonUtils;
                        if (ownerTable == null) {
    }
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;
    @Override
            null,

                log.debug("Can't find column " + colName + " in table " + db2Table.getName());
            throw new DBCException("Error reading table references", e);
                            session.getProgressMonitor(), this.getDataSource(), ownerSchemaName, ownerTableName);
    @Override
    // -----------------
            this.temporalType = CommonUtils.valueOf(DB2TableTemporalType.class, JDBCUtils.safeGetString(dbResult, "TEMPORALTYPE"));

    @Override



    // Dependent of DB2 Version. OK because the folder is hidden in plugin.xml
    }
                return null;
        return getContainer().getConstraintCache().getObject(monitor, getContainer(), this, ukName);
        this.mdcClustered = JDBCUtils.safeGetBoolean(dbResult, "CLUSTERED", DB2YesNo.Y.name());
    private Long card;

    @Nullable
    public List<DB2TableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
    implements DBPRefreshableObject, DB2SourceObject, DBDPseudoAttributeContainer, DBSPartitionContainer, DBSEntityConstrainable {
    public DB2TableTemporalType getTemporalType()
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public Long getOverFLow()
    @Property(viewable = false, editable = false, order = 102, category = DB2Constants.CAT_DATETIME)
    // Properties
        this.nPages = JDBCUtils.safeGetLongNullable(dbResult, "NPAGES");
        new DBDPseudoAttribute(
    @Property(viewable = false, editable = false, specific = true, order = 104)
    private Timestamp alterTime;
    @Nullable
    public DB2TableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
    {
    {
    {
            @NotNull JDBCSession session,
            statement.setString(1, db2Table.getSchema().getName());
import org.jkiss.code.Nullable;
 *
    }
        return lastRegenTime;
        //   supported in the current environment: "RID functions".. SQLCODE=-5115, 
    {

    @Association
        this.indexTablespace = JDBCUtils.safeGetString(dbResult, "INDEX_TBSPACE");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
        super(monitor, schema, dbResult);


    // -----------------
        if (getDataSource().isAtLeastV9_5()) {

    @Property(viewable = false, editable = false, order = 112)
        @Nullable
        return nPages;

        // TODO DF: beurk: Consequences of "Integrated cache" that can not be created in class def= NPE with managers
        } else {
    public boolean isView()
        this.tablespace = tablespace;
    public DB2TablePartitionMode getPartitionMode()
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Long getCard()
    // -----------------
    public Collection<DB2TableCheckConstraint> getCheckConstraints(DBRProgressMonitor monitor) throws DBException
 * DB2 Table

import org.jkiss.dbeaver.model.data.DBDPseudoAttributeContainer;
    {
                return null;
            String colName = JDBCUtils.safeGetString(resultSet, "COLNAME");
                            log.error("Cannot find reference owner table " + ownerSchemaName + "." + ownerTableName);


                        DB2TableForeignKey fk = ownerTable.getAssociation(monitor, fkName);
    }
public class DB2Table extends DB2TableBase
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public DBSObjectState getObjectState()
            return new DBDPseudoAttribute[] { DB2Constants.PSEUDO_ATTR_RID_BIT };
    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

    @Override

    }
    private String dataCapture;

    }
        return getContainer().getConstraintCache().getObjects(monitor, getContainer(), this);
        getContainer().getReferenceCache().clearObjectCache(this);
    {
        return DB2Tablespace.resolveTablespaceReference(monitor, getDataSource(), indexTablespace);
    }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    {
    public DB2TableForeignKey getAssociation(DBRProgressMonitor monitor, String ukName) throws DBException
                dbStat.setString(1, this.getSchema().getName());
    public String getDataCapture()
        return lockSize;
    @Property(viewable = true, editable = true, order = 10, category = DB2Constants.CAT_TABLESPACE, listProvider = DB2TableTablespaceListProvider.class)

    @Property(viewable = false, editable = true, order = 11, category = DB2Constants.CAT_TABLESPACE, listProvider = DB2TableTablespaceListProvider.class)
    }
    public DB2Tablespace getLongTablespace(DBRProgressMonitor monitor) throws DBException
    @Override

        if (monitor == null) {
        }
        return false;
    public Timestamp getInvalidateTime()
        } else {
    public DB2TableCheckConstraint getCheckConstraint(DBRProgressMonitor monitor, String ukName) throws DBException
        super.refreshObject(monitor);
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;

            @NotNull JDBCResultSet resultSet


    @Property(viewable = false, editable = true, order = 12, category = DB2Constants.CAT_TABLESPACE, listProvider = DB2TableTablespaceListProvider.class)
        return DB2Tablespace.resolveTablespaceReference(monitor, getDataSource(), longTablespace);
    private String volatileMode;
    public DB2TableType getType()
    }
        );
        this.card = JDBCUtils.safeGetLongNullable(dbResult, "CARD");
        return fPages;
        return alterTime;

            if (attribute == null) {
    }
        return compression;
    }
        getContainer().getAssociationCache().clearObjectCache(this);
    public Collection<DB2TableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException
    {
        this.compression = CommonUtils.valueOf(DB2TableCompressionMode.class, JDBCUtils.safeGetString(dbResult, "COMPRESSION"));
import org.jkiss.dbeaver.ext.db2.editors.DB2TableTablespaceListProvider;
    @NotNull
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
import org.jkiss.dbeaver.ext.db2.DB2Utils;
    }
        return tableTriggerCache.getAllObjects(monitor, this);



    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
        this.longTablespace = longTablespace;
        return status;
        @NotNull
    public DB2TableLockSize getLockSize()
            DB2TableColumn attribute = db2Table.getAttribute(session.getProgressMonitor(), colName);
    public List<DB2Trigger> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException
        }
    private Boolean append;

    private DBSObjectCache<DB2Table, DB2TablePeriod> periodCache;
    private Timestamp lastRegenTime;
    public void setLongTablespace(DB2Tablespace longTablespace)

    public DB2TableOrganizationMode getOrganizationMode() {
    {
        String lockSizeString = JDBCUtils.safeGetString(dbResult, "LOCKSIZE");

 *
    public String getName()
 * DBeaver - Universal Database Manager
        return card;
    @Override
        ) throws SQLException, DBException {
        this.accessMode = CommonUtils.valueOf(DB2TableAccessMode.class, JDBCUtils.safeGetString(dbResult, "ACCESS_MODE"));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    }
    @Override
    }
    private volatile List<DB2TableForeignKey> referenceCache = null;
            return statement;
    {
    }
import org.jkiss.dbeaver.utils.GeneralUtils;

 */
            String maskName = JDBCUtils.safeGetString(resultSet, "CONTROLNAME");
        this.tablespace = JDBCUtils.safeGetString(dbResult, "TBSPACE");
    }
    }
package org.jkiss.dbeaver.ext.db2.model;
    {
    }
        return getContainer().getAssociationCache().getObjects(monitor, getContainer(), this);

        return partitionMode;
        this.statsTime = JDBCUtils.safeGetTimestamp(dbResult, "STATS_TIME");
    }
        return append;

import org.jkiss.dbeaver.model.DBUtils;
    public Timestamp getLastRegenTime()
    {
    @Property(viewable = false, editable = false, order = 100)
                        String fkName = JDBCUtils.safeGetStringTrimmed(dbResult, "CONSTNAME");
    @Override
            }
    public Boolean getMdcClustered()
                    while (dbResult.nextRow()) {
                    referenceCache = result;
        this.invalidateTime = JDBCUtils.safeGetTimestamp(dbResult, "INVALIDATE_TIME");
        this.overFLow = JDBCUtils.safeGetLongNullable(dbResult, "OVERFLOW");
    public DB2TableUniqueKey getConstraint(DBRProgressMonitor monitor, String ukName) throws DBException

        this.indexTablespace = indexTablespace;
            }
import org.jkiss.dbeaver.model.struct.rdb.DBSPartitionContainer;
    {
    };
/*
import org.jkiss.dbeaver.model.meta.Association;
    }
                        String ownerSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TABSCHEMA");
                        result.add(fk);
        }
        this.partitionCache = new JDBCObjectSimpleCache<>(DB2TablePartition.class, C_PT, schema.getName(), getName());

    }
import org.jkiss.dbeaver.model.DBPRefreshableObject;
        this.longTablespace = JDBCUtils.safeGetString(dbResult, "LONG_TBSPACE");
    public JDBCStructCache<DB2Schema, DB2Table, DB2TableColumn> getCache()
            statement.setString(2, db2Table.getName());
    }
        this.status = CommonUtils.valueOf(DB2TableStatus.class, JDBCUtils.safeGetString(dbResult, "STATUS"));
import java.sql.Timestamp;

                return null;
    {
        return status.getState();
    {

    @Association
    public DBDPseudoAttribute[] getPseudoAttributes() throws DBException

        this.type = CommonUtils.valueOf(DB2TableType.class, JDBCUtils.safeGetString(dbResult, "TYPE"));
        this.append = JDBCUtils.safeGetBoolean(dbResult, "APPEND_MODE", DB2YesNo.Y.name());
    @Property(viewable = false, editable = false, order = 108)

    public List<DB2TableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
    private static final String C_PT = "SELECT * FROM SYSCAT.DATAPARTITIONS WHERE TABSCHEMA = ? AND TABNAME = ? ORDER BY SEQNO WITH UR";
        //   The command or statement was not executed because the following functionality is not
    private ColumnMaskCache columnMaskCache = new ColumnMaskCache();
    {
    @Override
        return referenceCache;
    @Property(viewable = false, editable = false, order = 101, category = DB2Constants.CAT_DATETIME)

        // In BigSQL, calling RID_BIT results in a results in an error message indicating that
    {
import org.jkiss.dbeaver.Log;
    {
 * Unless required by applicable law or agreed to in writing, software
        protected DB2ColumnMask fetchObject(


    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)
            return null;

    // -----------------
        }
    @Property(viewable = false, editable = false, order = 103, category = DB2Constants.CAT_DATETIME)
        try (JDBCSession session = DBUtils.openMetaSession(monitor, getDataSource(), "Find table references")) {
    }
            return null;
    @Property(viewable = true, editable = false, order = 4)

            DBDPseudoAttributeType.OTHER,

    public DBDPseudoAttribute[] getAllPseudoAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
                dbStat.setString(2, this.getName());

        }
    protected static final Log log = Log.getLog(DB2Table.class);
        return type;
import org.jkiss.dbeaver.ext.db2.model.dict.*;
        this.periodCache = new JDBCObjectSimpleCache<>(DB2TablePeriod.class, C_PE, schema.getName(), getName());
        return volatileMode;
    @Property(viewable = false, editable = false, specific = true, order = 101)
 * @author Denis Forveille


            @Nullable String objectName
            }
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

            DBDPseudoAttribute.PropagationPolicy.TABLE_NORMAL
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;
        this.referenceCache = null;
    private DB2TableTriggerCache tableTriggerCache = new DB2TableTriggerCache();
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
    public DB2Table(DB2Schema schema, String name)
    public String getConstChecked()
    }
        if (referenceCache != null) {
    {
    {
            if (object != null || objectName != null) {
    public DB2Table(DBRProgressMonitor monitor, DB2Schema schema, ResultSet dbResult) throws DBException
        return getContainer().getTableCache().getChildren(monitor, getContainer(), this);
    public Boolean getAppend()
    }
    {
        //
    public List<DBSEntityConstraintInfo> getSupportedConstraints() {
    private Timestamp statsTime;
        public JDBCStatement prepareLookupStatement(
import org.jkiss.dbeaver.ext.db2.model.cache.DB2TableTriggerCache;
        if (CommonUtils.isNotEmpty(lockSizeString)) {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
                "WHERE CONTROLTYPE = 'C' AND TABSCHEMA = ? AND TABNAME = ?" +
            return periodCache.getAllObjects(monitor, this);
            @NotNull DB2Table db2Table,
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeType;
    }
