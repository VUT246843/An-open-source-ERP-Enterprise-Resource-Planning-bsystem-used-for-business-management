        this.iotType = JDBCUtils.safeGetString(dbResult, "IOT_TYPE");
        @Property(category = DBConstants.CAT_STATISTICS, order = 42)
public class OracleTable extends OracleTablePhysical implements DBPScriptObject, DBDPseudoAttributeContainer,
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    @NotNull
    @LazyProperty(cacheValidator = AdditionalInfoValidator.class)
    public boolean supportsChangingReferentialIntegrity(@NotNull DBRProgressMonitor monitor) throws DBException {
                for (DBPNamedObject fk: foreignKeys) {

    };
    public DBDPseudoAttribute[] getPseudoAttributes() throws DBException {
        }
        private int avgRowLen;
    {
    @Override
        private int pctIncrease;
 * DBeaver - Universal Database Manager
        public int getChainCount() { return chainCount; }
    public OracleDataType getTableType()
        return refs;

        @Property(category = DBConstants.CAT_STATISTICS, order = 36)
    private void loadAdditionalInfo(DBRProgressMonitor monitor) throws DBException
            return ENABLE_REFERENTIAL_INTEGRITY_STATEMENT;
                        log.warn("Cannot find table '" + getFullyQualifiedName(DBPEvaluationContext.UI) + "' metadata");
    
 * you may not use this file except in compliance with the License.
import java.util.*;
            if (this.hasRowIdPseudoAttribute()) {
import org.jkiss.dbeaver.DBException;
        return getDDL(monitor, OracleDDLFormat.getCurrentFormat(getDataSource()), options);
                    }
        private int freelists;
            return null;
    @Property(viewable = false, order = 6)
    public Collection<OracleTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor)
    @Property(viewable = false, order = 12)
                    }
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
    @Property(viewable = false, order = 5)
        return DISABLE_REFERENTIAL_INTEGRITY_STATEMENT;
    public boolean isNested()

        super.appendSelectSource(monitor, query, tableAlias, rowIdAttribute);
    @Override
    }
        @Property(category = DBConstants.CAT_STATISTICS, order = 39)
        return nested;
        }
        } else {
import org.jkiss.dbeaver.model.meta.Property;
    }
import org.jkiss.code.Nullable;
        public int getPctIncrease() { return pctIncrease; }
        template = template.replace(TABLE_NAME_PLACEHOLDER, getFullyQualifiedName(DBPEvaluationContext.DDL));
                    }
                "SELECT a.*, h.STATS_UPDATE_TIME FROM " +
                }


                    String sql = template.replace(FOREIGN_KEY_NAME_PLACEHOLDER,  fk.getName());
    @Nullable
            }
        DBPScriptObject.OPTION_DDL_SKIP_FOREIGN_KEYS,
    }
                }
            return null;
/*
    }
    );
        public int getAvgRowLen() { return avgRowLen; }
        if (this.hasRowIdPseudoAttribute()) {
    @Property(viewable = false, order = 7)
    public String getIotName()
        final Collection<OracleTableForeignKey> allForeignKeys =
        return temporary;

        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
        }
                    OracleUtils.getAdminAllViewPrefix(monitor, getDataSource(), "TABLES") +
        return iotName;
    public void setTableSize(Long tableSize) {
        super(schema, dbResult);
                        query.append(",").append(rowIdAttribute.translateExpression(tableAlias));

    {
                dbStat.setString(2, getName());


        }
                        additionalInfo.pctFree = JDBCUtils.safeGetInt(dbResult, "PCT_FREE");

import org.jkiss.dbeaver.model.meta.PropertyGroup;
    @Override
        @Property(category = DBConstants.CAT_STATISTICS, order = 32)

        DBDPseudoAttributeType.OTHER,
        return this.allPseudoAttributes;
        private int minExtents;
        private int avgSpaceFreelistBlocks;
    public OracleTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
        public int getPctUsed() { return pctUsed; }
    }
    }
        }
 * You may obtain a copy of the License at
    }
                if (hasDBA) {
        super(schema, name);
                typeOwner,
        public int getNextExtent() { return nextExtent; }
                throw new DBCException(e, session.getExecutionContext());

        public int getAvgSpaceFreelistBlocks() { return avgSpaceFreelistBlocks; }
                        additionalInfo.numFreelistBlocks = JDBCUtils.safeGetInt(dbResult, "NUM_FREELIST_BLOCKS");
    private transient volatile Long tableSize;
        private int maxExtents;
    {
    private boolean secondary;
    @Override
    }

            if (!additionalInfo.loaded && monitor != null) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return new DBDPseudoAttribute[] {
        @Property(category = DBConstants.CAT_STATISTICS, order = 46)
    @Association
 * Licensed under the Apache License, Version 2.0 (the "License");
                        additionalInfo.avgSpace = JDBCUtils.safeGetInt(dbResult, "AVG_SPACE");
        OracleSchema schema,
            }
import org.jkiss.utils.ByteNumberFormat;
        }
    @Override
                attrs.add(OracleConstants.PSEUDO_ATTR_ROWID);
import org.jkiss.dbeaver.model.*;
    }
    @Override
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeType;
        public int getFreelists() { return freelists; }
        @Property(category = DBConstants.CAT_STATISTICS, order = 44)
            && getDataSource().getContainer().getPreferenceStore().getBoolean(OracleConstants.PREF_SUPPORT_ROWID);
    @Nullable
                        additionalInfo.iniTrans = JDBCUtils.safeGetInt(dbResult, "INI_TRANS");
    }
    }
        return tableType;
            additionalInfo.loaded = true;
        return tableSize == null ? 0 : tableSize;
        DBRProgressMonitor monitor,
        return false;
    public Collection<OracleTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor)
        for (OracleTableColumn col : CommonUtils.safeCollection(getAttributes(monitor))) {
    private boolean hasRowIdPseudoAttribute() {
import org.jkiss.code.NotNull;
 *
    public long getStatObjectSize() {
            this.allPseudoAttributes = attrs.toArray(DBDPseudoAttribute.EMPTY_ARRAY);
        DBPScriptObject.OPTION_DDL_ONLY_FOREIGN_KEYS
    private static final String[] supportedOptions = new String[]{
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
                        fetchTableSize(dbResult);
    public boolean hasStatistics() {
        private int freelistGroups;
        if (this.allPseudoAttributes == null) {
    private OracleTableColumn getXMLColumn(DBRProgressMonitor monitor) throws DBException {
            catch (SQLException e) {
            };
        private int pctUsed;
                        additionalInfo.pctIncrease = JDBCUtils.safeGetInt(dbResult, "PCT_INCREASE");
    protected String getTableTypeName()
 * Copyright (C) 2010-2026 DBeaver Corp and others

                    "WHERE S.SEGMENT_TYPE='TABLE' AND s.SEGMENT_NAME = ?" + (hasDBA ? " AND s.OWNER = ?" : "")))
    }
        Collection<OracleTableForeignKey> foreignKeys = getAssociations(monitor);
    {
    @Override
 *
        private Date lastStatisticsUpdate;
            }
        } catch (Exception e) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @Property(viewable = false, order = 10)
        public int getIniTrans() { return iniTrans; }
        return "TABLE";
        this.secondary = JDBCUtils.safeGetBoolean(dbResult, "SECONDARY", OracleConstants.RESULT_YES_VALUE);
    private boolean nested;
 * limitations under the License.
    public boolean isView()
                        additionalInfo.avgRowLen = JDBCUtils.safeGetInt(dbResult, "AVG_ROW_LEN");
    private static final CharSequence TABLE_NAME_PLACEHOLDER = "%table_name%";
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
        null,
    private String iotName;

            if (col != null) return col;
    @Override
                    if (dbResult.next()) {

            }
                    " AND a.OWNER=? AND a.TABLE_NAME=?")) {

        return iotType;
        @Property(category = DBConstants.CAT_STATISTICS, order = 33)
            {
    private static final DBDPseudoAttribute ROWSCN_PSEUDO_ATTRIBUTE = new DBDPseudoAttribute(
        if (!CommonUtils.isEmpty(typeOwner)) {

                        additionalInfo.initialExtent = JDBCUtils.safeGetInt(dbResult, "INITIAL_EXTENT");
    }
    }
                    dbStat.setString(2, getSchema().getName());
        + FOREIGN_KEY_NAME_PLACEHOLDER + " DISABLE";


import java.sql.SQLException;
        String typeOwner = JDBCUtils.safeGetString(dbResult, "TABLE_TYPE_OWNER");
        }
        public int getMinExtents() { return minExtents; }
        private int initialExtent;
    }
        }
        "ORA_ROWSCN",

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        OracleMessages.pseudo_column_ora_rowscn_description,
        if (CommonUtils.isEmpty(iotType)) {

    @Property(viewable = false, order = 11)
        } else {
    @Override

                tableSize = 0L;
    private DBDPseudoAttribute[] allPseudoAttributes = null;
            }
        }
                "SELECT SUM(bytes) TABLE_SIZE\n" +
        public int getMaxExtents() { return maxExtents; }
import org.jkiss.utils.CommonUtils;
    public AdditionalInfo getAdditionalInfo(DBRProgressMonitor monitor) throws DBException

        return tableSize != null;
}

            OracleTableColumn col = getXMLColumn(monitor);
    @Override
    private static final Log log = Log.getLog(OracleTable.class);
        public int getMaxTrans() { return maxTrans; }
                        additionalInfo.lastStatisticsUpdate = JDBCUtils.safeGetTimestamp(dbResult, "STATS_UPDATE_TIME");
    {
    }
                dbStat.setString(1, getContainer().getName());

        null,

            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        DBDPseudoAttribute.PropagationPolicy.TABLE_LOCAL
        }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
                    query.append("XMLType(").append(tableAlias).append(".").append(xmlColumn.getName()).append(".getClobval()) as ").append(xmlColumn.getName());
        private int chainCount;
        // Fake XML attribute handle
            loadSize(monitor);



                throw new DBException("Unable to change referential integrity", e);

    }
    @Override
        additionalInfo.loaded = false;
        public int getFreelistGroups() { return freelistGroups; }
 *
        }
            boolean hasDBA = getDataSource().isViewAvailable(monitor, OracleConstants.SCHEMA_SYS, "DBA_SEGMENTS");
                    additionalInfo.loaded = true;
        } else {
                }
    public String getIotType()
        tableSize = dbResult.getLong("TABLE_SIZE");
            }
        if (tableSize != null) {
            }
        List<OracleTableForeignKey> refs = new ArrayList<>();
        @Property(category = DBConstants.CAT_STATISTICS, order = 37)
            tableSize = null;
        @Property(category = DBConstants.CAT_STATISTICS, order = 38)

            // IOT tables have index id instead of ROWID

    }
        public Date getLastStatisticsUpdate() {
    protected void appendSelectSource(DBRProgressMonitor monitor, StringBuilder query, String tableAlias, DBDPseudoAttribute rowIdAttribute) throws DBCException {
            try {
        return tableSize;
            template = ENABLE_REFERENTIAL_INTEGRITY_STATEMENT;
    {
        return ArrayUtils.contains(supportedOptions, option);
    private OracleDataType tableType;
        @Property(category = DBConstants.CAT_STATISTICS, order = 45)
            attrs.add(ROWSCN_PSEUDO_ATTRIBUTE);
        tableSize = null;
        @Property(category = DBConstants.CAT_STATISTICS, order = 48)


        synchronized (additionalInfo) {
        this.nested = JDBCUtils.safeGetBoolean(dbResult, "NESTED", OracleConstants.RESULT_YES_VALUE);
        return !CommonUtils.isEmpty(getAssociations(monitor));
            // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/Pseudocolumns.html

                return col;
            return additionalInfo;
    {
                JDBCUtils.safeGetString(dbResult, "TABLE_TYPE"));
                    if (rowIdAttribute != null) {
        if (enable) {
        public int getInitialExtent() { return initialExtent; }
            return;
                    if (dbResult.next()) {
    {
    
    private static final CharSequence FOREIGN_KEY_NAME_PLACEHOLDER = "%foreign_key_name%";
        private int pctFree;
    }
                        additionalInfo.avgSpaceFreelistBlocks = JDBCUtils.safeGetInt(dbResult, "AVG_SPACE_FREELIST_BLOCKS");
    {
    private final AdditionalInfo additionalInfo = new AdditionalInfo();
    public boolean isSecondary()
        public int getNumFreelistBlocks() { return numFreelistBlocks; }
import java.sql.ResultSet;
                        additionalInfo.maxExtents = JDBCUtils.safeGetInt(dbResult, "MAX_EXTENTS");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            return DBIcon.TREE_TABLE_INDEX;

    @Override
            tableType = OracleDataType.resolveDataType(
    {
                schema.getDataSource(),
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    private String iotType;
                    "FROM " + OracleUtils.getSysSchemaPrefix(getDataSource()) + (hasDBA ? "DBA_SEGMENTS" : "USER_SEGMENTS") + " s\n" +
        true,
                }
    {
/**
    @Nullable
    }
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;

*/
        // This is dummy implementation
        if (monitor.isForceCacheUsage()) {
        @Property(category = DBConstants.CAT_STATISTICS, order = 41)
        for (OracleTableForeignKey constraint : allForeignKeys) {
    @Override

    {
                }
        return CommonUtils.isEmpty(this.iotType)
        getContainer().foreignKeyCache.clearObjectCache(this);
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                OracleConstants.PSEUDO_ATTR_ROWID
    void fetchTableSize(JDBCResultSet dbResult) throws SQLException {
            }
            return DBIcon.TREE_TABLE;
    ///////////////////////////////////
    @Override
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeContainer;
    {
                refs.add(constraint);
            getTableSize(monitor);
    public class AdditionalInfo extends TableAdditionalInfo {
        @Property(category = DBConstants.CAT_STATISTICS, order = 43)
                        additionalInfo.maxTrans = JDBCUtils.safeGetInt(dbResult, "MAX_TRANS");
                        additionalInfo.minExtents = JDBCUtils.safeGetInt(dbResult, "MIN_EXTENTS");
        public int getAvgSpace() { return avgSpace; }
    }
        }
    public boolean isTemporary()
            List<DBDPseudoAttribute> attrs = new ArrayList<>(2);
        private int iniTrans;
            try (JDBCStatement statement = session.createStatement()) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        this.tableSize = tableSize;
        if (!CommonUtils.isEmpty(iotName)) {
                log.warn(e);

    public TableAdditionalInfo getAdditionalInfo()
        @Property(category = DBConstants.CAT_STATISTICS, order = 35)
        if (tableSize == null) {
    }
                    return;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                loadAdditionalInfo(monitor);
    @Override
import org.jkiss.dbeaver.ext.oracle.internal.OracleMessages;
    public DBPImage getObjectImage() {
                dbStat.setString(1, getName());
    @Override
    public void enableReferentialIntegrity(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
        public int getEmptyBlocks() { return emptyBlocks; }
        // Get references from this schema only
            }
        if (CommonUtils.isEmpty(foreignKeys)) {
        @Property(category = DBConstants.CAT_STATISTICS, order = 29)
        @Property(category = DBConstants.CAT_STATISTICS, order = 40)

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    {
    }
    public String getChangeReferentialIntegrityStatement(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
        private int blocks;
    }
        }
import org.jkiss.dbeaver.model.exec.DBCException;
        } finally {
    }
            template = DISABLE_REFERENTIAL_INTEGRITY_STATEMENT;
        return super.refreshObject(monitor);
            if (col.getDataType() == tableType) {
        public int getBlocks() { return blocks; }
                        additionalInfo.blocks = JDBCUtils.safeGetInt(dbResult, "BLOCKS");
        throws DBException

        @Property(category = DBConstants.CAT_STATISTICS, order = 47)
import org.jkiss.utils.ArrayUtils;
        return additionalInfo;
                    } else {
        ResultSet dbResult)
        if (enable) {
        private int avgSpace;
            return;
        private int emptyBlocks;
        return getContainer().foreignKeyCache.getObjects(monitor, getContainer(), this);
    }
        throws DBException
            //this.setName(iotName);


        }
    public OracleTable(
    private void loadSize(DBRProgressMonitor monitor) throws DBCException {
    private static final String DISABLE_REFERENTIAL_INTEGRITY_STATEMENT = "ALTER TABLE " + TABLE_NAME_PLACEHOLDER + " MODIFY CONSTRAINT "

    }
            return refs;

    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Changing referential integrity")) {
    public Long getTableSize(DBRProgressMonitor monitor) throws DBCException {
        }
        + FOREIGN_KEY_NAME_PLACEHOLDER + " ENABLE";
        }

 * Unless required by applicable law or agreed to in writing, software

        String template;

    }
        public int getPctFree() { return pctFree; }
            getContainer().foreignKeyCache.getObjects(monitor, getContainer(), null);
        this.temporary = JDBCUtils.safeGetBoolean(dbResult, OracleConstants.COLUMN_TEMPORARY, OracleConstants.RESULT_YES_VALUE);
        }
                        additionalInfo.emptyBlocks = JDBCUtils.safeGetInt(dbResult, "EMPTY_BLOCKS");
            } catch (DBException e) {
    {
 */
        }
    public OracleTable(OracleSchema schema, String name)
                OracleTableColumn xmlColumn = getXMLColumn(monitor);
                        additionalInfo.freelists = JDBCUtils.safeGetInt(dbResult, "FREELISTS");
            log.debug("Error reading table statistics", e);
    }
        this.iotName = JDBCUtils.safeGetString(dbResult, "IOT_NAME");
        private int numFreelistBlocks;
    }
        @Property(category = DBConstants.CAT_STATISTICS, order = 31)
        }
        if (!supportsChangingReferentialIntegrity(monitor)) {
    }
    private boolean temporary;
                    statement.executeUpdate(sql);
                monitor,
        private int nextExtent;
    {
 * OracleTable
        if (tableType != null && tableType.getName().equals(OracleConstants.TYPE_NAME_XML) && OracleConstants.XML_COLUMN_NAME.equals(attributeName)) {
    @Property(viewable = false, category = DBConstants.CAT_STATISTICS, formatter = ByteNumberFormat.class)

    @PropertyGroup()
            } catch (SQLException e) {
 */
        }
                        additionalInfo.nextExtent = JDBCUtils.safeGetInt(dbResult, "NEXT_EXTENT");
        return null;
            if (constraint.getReferencedTable() == this) {
        DBPObjectStatistics, DBPImageProvider, DBPReferentialIntegrityController, DBPScriptObjectExt2 {
    // Statistics
        if (!isPersisted()) {
        if (tableType != null && tableType.getName().equals(OracleConstants.TYPE_NAME_XML)) {
    @Override
    private static final String ENABLE_REFERENTIAL_INTEGRITY_STATEMENT = "ALTER TABLE " + TABLE_NAME_PLACEHOLDER + " MODIFY CONSTRAINT "
 * See the License for the specific language governing permissions and
        return super.getAttribute(monitor, attributeName);
    public DBDPseudoAttribute[] getAllPseudoAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
        private int maxTrans;
package org.jkiss.dbeaver.ext.oracle.model;


                    " a, ALL_TAB_STATS_HISTORY h WHERE h.OWNER(+) = a.OWNER AND h.TABLE_NAME(+) = a.TABLE_NAME" +
        @Property(category = DBConstants.CAT_STATISTICS, order = 34)
                        additionalInfo.pctUsed = JDBCUtils.safeGetInt(dbResult, "PCT_USED");
                        additionalInfo.freelistGroups = JDBCUtils.safeGetInt(dbResult, "FREELIST_GROUPS");
            if (tableSize == null) {
import org.jkiss.dbeaver.model.meta.LazyProperty;

    }
        }
            return lastStatisticsUpdate;
                if (xmlColumn != null) {
/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.Log;

        }
        return secondary;
import org.jkiss.dbeaver.model.meta.Association;
                        additionalInfo.chainCount = JDBCUtils.safeGetInt(dbResult, "CHAIN_CNT");
