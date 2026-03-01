            throws SQLException, DBException
        protected OracleSchedulerProgram fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult)
            JDBCPreparedStatement dbStat;
        }
                            + "        FROM   (SELECT \r\n"

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return new OracleQueue(owner, resultSet);

        return tableTriggerCache.getAllObjects(monitor, this);
                
    final public IndexCache indexCache = new IndexCache();
    public OracleProcedureStandalone getProcedure(DBRProgressMonitor monitor, String uniqueName) throws DBException {
                    "WHERE t.OWNER =?\n" +
        sequenceCache.clearCache();
     */
            );
    private boolean synonymsAsChildren = false;


    static class SchedulerJobCache extends JDBCObjectCache<OracleSchema, OracleSchedulerJob> {
        protected TableTriggerCache() {
                        " O.*,\n" +
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner) throws SQLException

                if (monitor.isCanceled()) {
    final public DBLinkCache dbLinkCache = new DBLinkCache();
            return pos;
           
    }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;

                if (objectName != null) {
        JDBCResultSet dbResult)
            return dbStmt;
                dbStat.setString(1, owner.getName());
            indexCache.getObjects(monitor, this, null);
    @Override
 * limitations under the License.
                        sql.append(" AND c.TABLE_NAME=?");
    }
            throws DBException
                final OracleTableColumn tableColumn = getTableColumn(session, parent, dbResult, JDBCUtils.safeGetStringTrimmed(dbResult, "COLUMN_NAME"));
        }
        }
        }

            for (OracleSequence sequence : sequences) {
                        (object instanceof OracleMaterializedView ? " AND O.OBJECT_TYPE='MATERIALIZED VIEW'" : ""));
                         "    AND c.OWNER = ?\r\n" + 
        this.name = name;
                        "    AND c.TABLE_NAME = ?");   
 */
                } else {
        throws DBException
        DBPConnectionConfiguration cfg = this.getDataSource().getContainer().getConnectionConfiguration();
        }
                sql.append("SELECT\r\n" + 
        @Override
                }
                    dbStat = session.prepareStatement(sql.toString());
            if ("TABLE".equals(tableType)) {
            super(tableCache, OracleTableBase.class, OracleConstants.COL_TABLE_NAME, OracleConstants.COL_CONSTRAINT_NAME);
            sql.append("SELECT ").append(OracleUtils.getSysCatalogHint(owner.getDataSource())).append(" " +
        tableCache.getAllObjects(monitor, this);
                log.debug("Column '" + columnName + "' not found in table '" + parent.getName() + "' for index '" + object.getName() + "'");
    final public ForeignKeyCache foreignKeyCache = new ForeignKeyCache();
        if (sequencesAsChildren) {
        protected OracleTableForeignKey fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull OracleTable parent, @NotNull
                return dbStat;
    }
        @Nullable

        @Override
    {
    @Nullable
                if (monitor.isCanceled()) {
                "ORDER BY TRIGGER_NAME");
                 dbStat.setString(1, OracleSchema.this.getName());
                 // 2-table name
                dbStmt.setString(2, table.getName());
                }
            }

        // Show DDL for all schema objects
            throws SQLException
            final String tableType = JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_OBJECT_TYPE);
                return getAlternativeTableStatement(session, owner, object, objectName, tablesSource, tableTypeColumns);
                return new OracleMaterializedView(owner, dbResult);
     */
        protected OracleSynonym fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
        throws DBException
            return new OracleSequence(owner, resultSet);
                    result[idx] =  new OracleTableForeignKeyColumn(
        children.addAll(packageCache.getAllObjects(monitor, this));
        this.hasStatistics = false;

        monitor.subTask("Cache tables");
            this.column = data[0];
            }
                    if (forTable != null) {
    @Association
        @Override
     * Sequence cache implementation
            List<OracleTableBase> tablesOrViews = getTableCache().getAllObjects(monitor, this);
                 // 3-owner
                 sql.append("SELECT \r\n"
        if (!monitor.isCanceled()) {
    /**


                OracleTableColumn column = getTableColumn(session, parent, dbResult, JDBCUtils.safeGetStringTrimmed(dbResult, "COLUMN_NAME"));
        }
        @Override
                return result;
    {
            monitor.done();
        }
                    "ORDER BY OBJECT_NAME");
                        "    c.TABLE_NAME,\r\n" + 
                        "AND rc.OWNER=c.r_OWNER AND rc.CONSTRAINT_NAME=c.R_CONSTRAINT_NAME");
        protected OracleJavaClass fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult)
        }

            String columnName = JDBCUtils.safeGetStringTrimmed(dbResult, "COLUMN_NAME");
    @Association

    public boolean isSystem()
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
/*
    }
        }

            }
            final JDBCPreparedStatement dbStmt = session.prepareStatement(
                
        }
            monitor.beginTask("Load triggers", triggers.size());
            JDBCPreparedStatement dbStat = session.prepareStatement(
    @Override
            {
            return dbStat;
                
                
    final public RecycleBin recycleBin = new RecycleBin();
                         + "    c.STATUS,\r\n"
        @Nullable
            dbStat.setString(1, ownerName);
    {
                            JDBCUtils.safeGetInt(dbResult, "POSITION")) };
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
    private boolean sequencesAsChildren = false;
    }
        if (!monitor.isCanceled()) {
                        "      FROM ALL_CONS_COLUMNS col\r\n" + 
        protected OracleTableForeignKeyColumn[] fetchObjectRow(
                        "    c.CONSTRAINT_NAME,\r\n" + 

                            + "                )  WHERE cn = c.CONSTRAINT_NAME GROUP BY cn CONNECT BY prev = PRIOR curr AND cn = PRIOR cn START WITH curr = 1      \r\n"
    public OracleSynonym getSynonym(DBRProgressMonitor monitor, String name)
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner, @Nullable OracleProcedureStandalone object, @Nullable String objectName) throws SQLException {
    static class SynonymCache extends JDBCObjectLookupCache<OracleSchema, OracleSynonym> {

            this.column = column;

            } else if (owner.getDataSource().isAtLeastV10() && forTable != null && !useSimpleConnection) {
            if (forParent == null) {
        protected OracleTableColumn fetchChild(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull OracleTableBase table, @NotNull JDBCResultSet dbResult)
                monitor.worked(1);
        if (!monitor.isCanceled()) {
            );
        }
        protected OracleSequence fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
    {
                if (column == null) {
        this.name = name;

        }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                " ORDER BY OBJECT_NAME");
            if (synonymName == null) {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner)
            
        protected JDBCStatement prepareObjectsStatement(
            final boolean isPublic = owner.isPublic();
        this.id = JDBCUtils.safeGetLong(dbResult, "USER_ID");
        {
                if (object instanceof OracleTable) {
        protected OracleSchemaTrigger fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema oracleSchema, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
                OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), schema.getDataSource(), "TRIGGERS") + " t, " +
        }
        @Override

        @Override
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            int paramNum = 1;
    private static final Log log = Log.getLog(OracleSchema.class);
        return null;
                monitor.worked(1);
            return new OracleTableForeignKey(session.getProgressMonitor(), parent, dbResult);
    @NotNull
                 dbStat.setString(2, forTable.getName());

                    final OracleTableColumn column = getTableColumn(session, parent, dbResult,positions.get(idx).getColumn());
     * Sequence cache implementation
                "SELECT SEGMENT_NAME,SUM(bytes) TABLE_SIZE\n" +
            if (object == null) {
                }


        @Nullable
                            column,
    static class SpecialPosition {
        
    final public PackageCache packageCache = new PackageCache();
    public OracleTable getTable(DBRProgressMonitor monitor, String name)
        StringBuilder sql = new StringBuilder();
            @NotNull OracleTableBase table,

        tableTriggerCache.clearCache();
    }
        packageCache.clearCache();
            if (!isPublic) {
            if (!isPublic()) {
                    "FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "OBJECTS") + " o\n" +
                         "    " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "CONSTRAINTS") + " c\r\n" + 

        }
        }
    @Association
    public Collection<OracleSchedulerJob> getSchedulerJobs(DBRProgressMonitor monitor)
        throws DBException
            if (tableColumn == null) {
        cacheStructure(monitor, DBSObjectContainer.STRUCT_ALL);
    }
 */
        public int getPos() {
        @Override
            dbStat.setString(1, owner.getName());
    /**
                        continue;
            if (synonymName != null) sql.append(" AND S.SYNONYM_NAME = ? ");
        throws DBException
            dbStat = session.prepareStatement(sql.toString());
            final OracleTableBase refTable = OracleTableBase.findTable(

                 dbStat.setString(4, forTable.getName());
            dbStat.setString(paramNum++, owner.getName());

            dbStat.setString(1, owner.getName());
            if (forTable == null) {
    @NotNull
    }
    }
            }
            return null;
        @Override
        @Override
            throws SQLException
    {
        triggerCache.clearCache();
                         + "    ) COLUMN_NAMES_NUMS\r\nFROM " + constraintsView + " c\r\n"
            } else if (object instanceof OracleMaterializedView) {
    @Association
                }
                    dbStat.setString(1, getName());
    public OracleDataType getDataType(DBRProgressMonitor monitor, String name)
                monitor.worked(1);
    class TableTriggerCache extends JDBCCompositeCache<OracleSchema, OracleTableBase, OracleTableTrigger, OracleTriggerColumn> {
                sql.append("i.TABLE_OWNER=? AND i.TABLE_NAME=?");
        {
            throws SQLException, DBException
            log.warn("Empty schema name fetched");
                

    }
                // 3-owner
        }
                    "FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "QUEUES") + " WHERE OWNER=? ORDER BY NAME");

            for (OracleDataType dataType : dataTypes) {
                dbStat.setString(4, forTable.getName());
            return dbStat;
            JDBCPreparedStatement dbStat;
            @NotNull OracleTableConstraint object,
        }
        return javaCache.getAllObjects(monitor, this);
        this.user = user;

            @NotNull JDBCResultSet dbResult
            .filter(proc -> proc.getProcedureType() == DBSProcedureType.PROCEDURE)
    }
                // 2-table name
            setListOrderComparator(DBUtils.nameComparator());
    {
            throws SQLException, DBException
            return dbStat;
        @NotNull
                }
    }
    {
    class ForeignKeyCache extends JDBCCompositeCache<OracleSchema, OracleTable, OracleTableForeignKey, OracleTableForeignKeyColumn> {
    {
                " AND t.BASE_OBJECT_TYPE=" + (table instanceof OracleView ? "'VIEW'" : "'TABLE'") + " AND t.TABLE_OWNER=c.TABLE_OWNER(+) AND t.TABLE_NAME=c.TABLE_NAME(+)" +
                }

                    " OBJECT_NAME, STATUS, CREATED, LAST_DDL_TIME, TEMPORARY FROM " +
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                for(int idx = 0;idx < positions.size();idx++) {

        @Override
            if (synonymName != null) dbStat.setString(paramNum++, synonymName);
            boolean hasDBA = getDataSource().isViewAvailable(monitor, OracleConstants.SCHEMA_SYS, "DBA_SEGMENTS");
                " AND t.OWNER=c.TRIGGER_OWNER(+) AND t.TRIGGER_NAME=c.TRIGGER_NAME(+)" +
    {
        protected void loadObjects(@NotNull DBRProgressMonitor monitor, @NotNull OracleSchema schema, @Nullable OracleTable forParent)
        @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            dbStat.setString(1, schema.getName());
        {
                    "WHERE o.OWNER =?\n" +

                
     * @return user reference or null
            String tableQuery = "SELECT t.OWNER, t.TABLE_NAME AS OBJECT_NAME, 'TABLE' AS OBJECT_TYPE, 'VALID' AS STATUS," + tableTypeColumns + ", t.TABLESPACE_NAME,\n" +
        }
        return getDataSource().getUser(monitor, name);
        throws DBException
        }
            return dbStat;
        sql.append("-- DROP USER ").append(DBUtils.getQuotedIdentifier(this)).append(";\n\n");

        return synonymCache.getAllObjects(monitor, this);
                "SELECT " + OracleUtils.getSysCatalogHint(owner.getDataSource()) + " * FROM " +

        return getProcedures(monitor)

                if (object != null || objectName != null)
        super(dataSource, true);
                    dbStat.setString(2, forTable.getName());
            super(tableCache, OracleTableBase.class, "TABLE_NAME", "INDEX_NAME");
        @Override
        }
            JDBCPreparedStatement dbStat = session.prepareStatement(
                         + "      WHERE col.OWNER =? AND col.TABLE_NAME = ? AND col.CONSTRAINT_NAME = c.CONSTRAINT_NAME GROUP BY CONSTRAINT_NAME \r\n"
            @NotNull OracleSchema schema,
        sequencesAsChildren = CommonUtils.getBoolean(cfg.getProviderProperty(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES));

            dbStmt.setString(1, schema.getName());
        {
            StringBuilder sql = new StringBuilder(500);
                            object,
        }
        @Nullable

    {
            @NotNull JDBCSession session,

                return sequence;
                         + "    rc.TABLE_NAME AS R_TABLE_NAME,\r\n"

    @Association

                }
                        "FROM " + constraintsView + " c, " + consColumnsView + " col, " + constraintsView + " rc\n" +
        }
            }
        @Override
                "\nWHERE t.TABLE_OWNER=?" + (table == null ? "" : " AND t.TABLE_NAME=?") +
                    dbStat = session.prepareStatement(sql.toString());
                        "AND c.OWNER=col.OWNER AND c.CONSTRAINT_NAME=col.CONSTRAINT_NAME\n" +
        @Override

            return new OracleTableConstraint(parent, dbResult);
import java.sql.SQLException;
        TableCache()
    }
        indexCache.clearCache();
        protected OracleProcedureStandalone fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult)
        }
public class OracleSchema extends OracleGlobalObject implements
            @NotNull JDBCSession session,

    }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner)
            dbStat.setString(1, owner.getName());
 *     http://www.apache.org/licenses/LICENSE-2.0
        List<DBSObject> children = new ArrayList<>(tableCache.getAllObjects(monitor, this));
                if (monitor.isCanceled()) {
        }
    }
        }
           
        {
                    sql.append("\r\nORDER BY c.CONSTRAINT_NAME,col.POSITION");
        return jobCache.getAllObjects(monitor, this);
                        "col.COLUMN_NAME,col.POSITION\n" +
            return dbStat;
    class ConstraintCache extends JDBCCompositeCache<OracleSchema, OracleTableBase, OracleTableConstraint, OracleTableConstraintColumn> {
            OracleSynonym synonym = synonymCache.getObject(monitor, this, childName);
        return synonymCache.getObject(monitor, this, name);
        {
                    sql.append(" AND o.OBJECT_NAME=?");
        @NotNull
                        "    " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "CONSTRAINTS") + " c\r\n" + 
                "SELECT * FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "DB_LINKS") + " WHERE OWNER=? " +
                "SELECT " + OracleUtils.getSysCatalogHint(owner.getDataSource()) + " * FROM " +
                dbStat.setString(1, owner.getName());
                        "    (\r\n" + 
    }
                        "    c.SEARCH_CONDITION,\r\n" + 
    }
                    "t.PARTITIONED, t.IOT_TYPE, t.IOT_NAME, t.TEMPORARY, t.SECONDARY, t.NESTED, t.NUM_ROWS\n" +
                if (hasDBA) {
                    
    {
                 
            @NotNull String indexName,
            return new OracleProcedureStandalone(owner, dbResult);
            return new OracleDataType(owner, resultSet);
        return tableCache.getTypedObjects(monitor, this, OracleView.class);
        @Override
    // Children are used in auto-completion which must be fast
import java.util.stream.Collectors;
import org.jkiss.dbeaver.model.struct.DBSEntity;
                dbStat.setString(2, ownerName);
                         + "      SELECT LISTAGG(COLUMN_NAME || ':' || POSITION,',') WITHIN GROUP (ORDER BY \"POSITION\") \r\n"
            return new OraclePackage(owner, dbResult);
    public String toString()

        }
                    if (column == null) {
    final public DataTypeCache dataTypeCache = new DataTypeCache();
        throws DBException
        }
            constraint.setAttributeReferences(rows);
                // 1- owner
    public Collection<OracleDataType> getDataTypes(DBRProgressMonitor monitor)
import org.jkiss.dbeaver.DBException;
/*
    @Association
            if (owner.getDataSource().isAtLeastV11() && forTable != null && !useSimpleConnection) {
                    // 3-owner

            throws SQLException, DBException
            @NotNull OracleSchema schema,


        {

            String viewQuery = "SELECT o.OWNER, o.OBJECT_NAME, 'VIEW' AS OBJECT_TYPE, o.STATUS, NULL, NULL, NULL, 'NO', NULL, NULL, o.TEMPORARY, o.SECONDARY, 'NO', 0\n" +
        throws DBException
            if (!useAlternativeQuery) {
                    JDBCUtils.safeGetInt(dbResult, "POSITION")) };
        @NotNull
    {
        {
                    "FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "OBJECTS") + " o\n" +
                         "    AND c.TABLE_NAME = ?");   
                sql.append("SELECT * FROM (");
        String data[] = value.split(",");
        }
            String unionAll = "UNION ALL ";
            for (OracleTableBase table : tableCache.getCachedObjects()) {
        @NotNull
        {
        ) throws DBException {
                    
    {
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
            return dbStat;
import java.util.*;
            sql
            .collect(Collectors.toList());
        }
    }
    public OracleUser getUser()
                         + "LEFT JOIN " + constraintsView + " rc\r\n"
    /**
                            + "        SELECT LTRIM(MAX(SYS_CONNECT_BY_PATH(cname || ':' || p,','))    KEEP (DENSE_RANK LAST ORDER BY curr),',') \r\n"
/**
        if (value == null) {
                         "                       col.CONSTRAINT_NAME cn,col.POSITION p,col.COLUMN_NAME cname,\r\n" + 
                sql.append("c.TABLE_NAME,");


        @Override
        hasStatistics = false;
                        String tableName = dbResult.getString(1);

            String tableTypeColumns = hasAllAllTables ? "t.TABLE_TYPE_OWNER,t.TABLE_TYPE" : "NULL as TABLE_TYPE_OWNER, NULL as TABLE_TYPE";
            throws SQLException
}
    }
        if (synonymsAsChildren) {
    {


        }
                         "                ) WHERE cn = c.CONSTRAINT_NAME  GROUP BY cn CONNECT BY prev = PRIOR curr AND cn = PRIOR cn START WITH curr = 1      \r\n" + 

        return queueCache.getAllObjects(monitor, this);
    public Collection<OracleView> getViews(DBRProgressMonitor monitor)
        {
            return new OracleSchemaTrigger(oracleSchema, resultSet);
                            + "                WHERE  col.OWNER =? AND col.TABLE_NAME = ? \r\n"
        @Override

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner) throws SQLException {
            @NotNull OracleTableBase table,
        @Override
        if (!monitor.isCanceled()) {
        @Override
            return dbStat;

        @Override
        proceduresCache.clearCache();
                dbStat.setString(1, OracleSchema.this.getName());
        {
                    "AND OWNER=? " +
                
            sql.append("\nORDER BY i.TABLE_NAME,i.INDEX_NAME,ic.COLUMN_POSITION");
                .append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "SYNONYMS"))
    public Collection<OracleJob> getJobs(@NotNull DBRProgressMonitor monitor) throws DBException {
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull OracleTableTrigger trigger, @NotNull List<OracleTriggerColumn> columns) {
            super(tableCache, OracleTableBase.class, "TABLE_NAME", "TRIGGER_NAME");
                dbStat.setString(2, object.getName());
        sql.append("CREATE USER ").append(DBUtils.getQuotedIdentifier(this)).append("\n-- IDENTIFIED BY <password>\n").append(";\n");

        recycleBin.clearCache();
        @Override
        protected OracleRecycledObject fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult)
                if (monitor.isCanceled()) {
        protected boolean isEmptyObjectRowsAllowed() {
                if (monitor.isCanceled()) {
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull OracleTableConstraint constraint, @NotNull List<OracleTableConstraintColumn> rows)
            @NotNull OracleTableBase parent,
    public Collection<OracleSynonym> getSynonyms(DBRProgressMonitor monitor)
                sql.append(" AND c.TABLE_NAME=?");
                
            }
    @Association
                        "col.COLUMN_NAME,col.POSITION\r\n" +
                dbStat.setString(3, OracleSchema.this.getName());
        @Override
        return this;
                    sql.append(" AND t.TABLE_NAME=?");
        {
                         + "    c.R_OWNER,\r\n"
    public OracleTable createTableImpl(@NotNull DBRProgressMonitor monitor, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult) {
    private List<SpecialPosition> parsePositions(String value) {


            children.addAll(synonymCache.getAllObjects(monitor, this));
    }
        throws DBException
                monitor.worked(1);
    public Collection<? extends OracleTable> getTables(DBRProgressMonitor monitor)
                         "        ) COLUMN_NAMES_NUMS\r\n" + 
        
                    OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "SEQUENCES") +

                         "    (\r\n" + 
            if (JDBCUtils.safeGetString(dbResult, "COLUMN_NAMES_NUMS") != null) {
        List<SpecialPosition> result = new ArrayList<>(1);
    @Association
            } else {
            }
    {
        } finally {


                         "WHERE\r\n" + 
                 dbStat = session.prepareStatement(sql.toString());
        super(dataSource, id > 0);
            @NotNull JDBCSession session,
                    "ON i.owner = ic.index_owner AND i.index_name = ic.index_name\n" +
        
     * Procedures cache implementation
    }
                    dbStat.setString(1, OracleSchema.this.getName());

            Object object = synonym.getObject(monitor);
            }
        {
        }
            if (sequence != null) {
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
import org.jkiss.dbeaver.model.struct.DBSObject;

            } else {
        @Override
        throws DBException
            return dbStat;
                    (object == null && objectName == null ? "" : "AND OBJECT_NAME=? ") +
                    }
        @Override
            result.add(new SpecialPosition(s));
    }

    public Collection<OracleProcedureStandalone> getFunctionsOnly(DBRProgressMonitor monitor) throws DBException {
                sql.append("\nORDER BY c.CONSTRAINT_NAME,col.POSITION");
        }
        }
                "SELECT " + OracleUtils.getSysCatalogHint(owner.getDataSource()) +
        }
                OracleTableConstraintColumn[] result = new OracleTableConstraintColumn[positions.size()];
        return tableCache.getTypedObjects(monitor, this, OracleMaterializedView.class);
        monitor.beginTask("Cache schema", 1);
                        ", " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), tablesSource) +

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner, @Nullable OracleTableBase forTable)
            return dbStat;
                dbStat.setString(1, OracleSchema.this.getName());
            log.debug("Column '" + columnName + "' not found in table '" + parent.getName() + "'");
                    dbStat.setString(3, OracleSchema.this.getName());
                .append("WHERE S.OWNER = ?\n");
        @Override
            dbStat.setString(1, owner.getName());
            } else {
            dbStat.setString(1, owner.getName());
            JDBCPreparedStatement dbStat = session.prepareStatement(
    private long id;
            throws SQLException
    }
            
            for (OracleTableBase tableBase : tablesOrViews) {
    public Collection<OracleQueue> getQueues(DBRProgressMonitor monitor)
    public boolean isPublic()
        ForeignKeyCache()
        return dbLinkCache.getAllObjects(monitor, this);

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner) throws SQLException
        @NotNull
            if (synonymName != null) sql.append(" AND S.SYNONYM_NAME = ?");
        {
    }
        
        schedulerJobCache.clearCache();

        @Override
        {
            } else if (object != null) {
            if (JDBCUtils.safeGetString(dbResult, "COLUMN_NAMES_NUMS") != null) {
        @Override
                return null;
                
    final public ProceduresCache proceduresCache = new ProceduresCache();
        }
            String synonymName = object != null ? object.getName() : objectName;
    final public JobCache jobCache = new JobCache();
    {
            .filter(proc -> proc.getProcedureType() == DBSProcedureType.FUNCTION)
        return name;
                
            }
        } catch (SQLException e) {
    DBSProcedureContainer,
        if (type == null) {
        return sequenceCache.getAllObjects(monitor, this);
    }
                         + "ON rc.OWNER = c.r_OWNER AND rc.CONSTRAINT_NAME = c.R_CONSTRAINT_NAME AND rc.CONSTRAINT_TYPE='P'\r\n"
        monitor.done();
                        " c, " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "CONS_COLUMNS") + " col\n" +
    static class QueueCache extends JDBCObjectCache<OracleSchema, OracleQueue> {
            } else {

            return new OracleTableIndex(owner, parent, indexName, dbResult);
                colsView = "TAB_COLS";
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema schema) throws SQLException
        @SuppressWarnings("unchecked")
                return new OracleView(owner, dbResult);
            @NotNull JDBCSession session,
    final public SynonymCache synonymCache = new SynonymCache();
                    .append("SELECT ").append(OracleUtils.getSysCatalogHint(owner.getDataSource())).append("\n" +
                dbStat = session.prepareStatement(sql.toString());
                    continue;
                         "                       ROW_NUMBER() OVER (PARTITION BY col.CONSTRAINT_NAME ORDER BY col.POSITION) -1 AS prev\r\n" + 
        if (table != null) {
            foreignKey.setAttributeReferences((List)rows);
    }
            } else {
    }
            boolean useSimpleConnection = CommonUtils.toBoolean(session.getDataSource().getContainer().getConnectionConfiguration().getProviderProperty(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS));
    @Association
                         "    c.CONSTRAINT_NAME,\r\n" + 
    }



    public Collection<OracleSequence> getSequences(DBRProgressMonitor monitor)
        private JDBCStatement getAlternativeTableStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner, @Nullable OracleTableBase object, @Nullable String objectName, String tablesSource, String tableTypeColumns) throws SQLException {
    final public SchedulerJobCache schedulerJobCache = new SchedulerJobCache();
        @Override
                return  new OracleTableForeignKeyColumn[] { new OracleTableForeignKeyColumn(
        return tableCache.getTypedObjects(monitor, this, OracleTable.class);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
    }
        return createTime;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner) throws SQLException


                            + "    c.DELETE_RULE,\r\n" + "    (\r\n"
        }


 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isStatisticsCollected() {
            return new OracleJavaClass(owner, dbResult);
    }
            if (object != null || objectName != null) dbStat.setString(2, object != null ? object.getName() : objectName);


        {
        }
        return children;
            @NotNull JDBCSession session,

                    break;


        }
                    result[idx] =  new OracleTableConstraintColumn(
                
        {
            if (synonym != null) {
        }
        return user;
                 // 3-owner
            throws SQLException
                isAscending,
        OracleDataType type = isPublic() ? getTypeBySynonym(monitor, name) : dataTypeCache.getObject(monitor, this, name);
        
        public SpecialPosition(@NotNull String value) {

    DBPSystemObject,
                        (object instanceof OracleTable ? " AND O.OBJECT_TYPE='TABLE'" : "") +
                "SELECT" + OracleUtils.getSysCatalogHint(schema.getDataSource()) + " t.*, c.*, c.COLUMN_NAME AS TRIGGER_COLUMN_NAME" +

        {
                            object,
import org.jkiss.dbeaver.model.*;
        }
                " WHERE OBJECT_TYPE='PACKAGE' AND OWNER=? " +
                        "WHERE\r\n" + 
    }
                }

                    log.debug("Column '" + columnName + "' not found in table '" + refTable.getFullyQualifiedName(DBPEvaluationContext.DDL) + "' for trigger '" + trigger.getName() + "'");
                monitor.subTask(sequence.getName());
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner, @Nullable OracleSynonym object, @Nullable String objectName) throws SQLException
 * DBeaver - Universal Database Manager
                
     * OracleTable or its children classes can be created by this method.
        @Override
                         "                FROM   "+ OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "CONS_COLUMNS") +" col \r\n" + 
                    "SELECT * FROM " + OracleUtils.getSysSchemaPrefix(owner.getDataSource()) + "USER_RECYCLEBIN" :
        protected OracleTableConstraintColumn[] fetchObjectRow(

        protected OracleJob fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
            super(OracleConstants.COLUMN_OBJECT_NAME);

    public OracleSchema(OracleDataSource dataSource, long id, String name) {
        @Override

    public Date getCreateTime() {
                    "FROM ").append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), colsView)).append(" c\n" +
        protected OracleSchedulerJob fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult)
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
                    tableColumn,
    }
            monitor.beginTask("Read tables DDL", tablesOrViews.size());
        String indexName, @NotNull
            OracleSequence sequence = sequenceCache.getObject(monitor, this, childName);
                    sql.append(" AND c.TABLE_NAME=?");
            } else {
    {
            String tableOper = "=";
            monitor.done();
                monitor.subTask("Load table '" + tableBase.getName() + "' DDL");
                "SELECT * FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "JAVA_CLASSES") + " WHERE OWNER=? ");
    {
                dbStat = session.prepareStatement("SELECT " + OracleUtils.getSysCatalogHint(owner.getDataSource()) +
        
        this.id = id;
 * See the License for the specific language governing permissions and
        {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner)
    }

            String[] data = value.split(":");
        {
            String ownerName = owner.getName();
            .stream()
                    return null;
        @Override
                OracleTableForeignKeyColumn[] result = new OracleTableForeignKeyColumn[positions.size()];

 *

        }
            monitor.done();
    static class SequenceCache extends JDBCObjectCache<OracleSchema, OracleSequence> {
                
        throws DBException
        }
                         "    c.CONSTRAINT_TYPE <> 'R'\r\n" + 
    }
        return schedulerJobCache.getAllObjects(monitor, this);
        @NotNull
        @Nullable
    }
                List<SpecialPosition>  positions = parsePositions(JDBCUtils.safeGetString(dbResult, "COLUMN_NAMES_NUMS"));
                            positions.get(idx).getPos());
        @Override
                        "      SELECT LISTAGG(COLUMN_NAME || ':' || POSITION,',') WITHIN GROUP (ORDER BY \"POSITION\") \r\n" + 
    }
package org.jkiss.dbeaver.ext.oracle.model;
    @Override
*/
                 // 4-table name
    }
{
                "SELECT *\n" +

            boolean useAlternativeQuery = CommonUtils.toBoolean(getDataSource().getContainer().getConnectionConfiguration().getProviderProperty(OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY));
        return schedulerProgramCache.getAllObjects(monitor, this);
            if (object == null) {
            monitor.beginTask("Load data types", dataTypes.size());
            }
    {
        OracleTableColumn tableColumn = columnName == null ? null : parent.getAttribute(session.getProgressMonitor(), columnName);
            for (OracleProcedureStandalone procedure : procedures) {
            return dbStat;
        @Override
                .append("AND O.OWNER=S.TABLE_OWNER AND O.OBJECT_NAME=S.TABLE_NAME AND O.SUBOBJECT_NAME IS NULL\n)\n");
                ordinalPosition,
            @NotNull JDBCResultSet resultSet

            JDBCPreparedStatement dbStat = session.prepareStatement(
                sql.append(viewQuery);
        return hasStatistics;
    private OracleDataType getTypeBySynonym(DBRProgressMonitor monitor, String name) throws DBException {
            @NotNull JDBCSession session,

                         + "    c.R_CONSTRAINT_NAME,\r\n"
    }
        protected void cacheChildren(OracleTableBase parent, List<OracleTableColumn> oracleTableColumns) {
    }
 * you may not use this file except in compliance with the License.
    public Collection<OracleProcedureStandalone> getProcedures(DBRProgressMonitor monitor)
            monitor.subTask("Cache table constraints");
                }
            this.name = "? " + super.hashCode();
        @Override
        }

            dbStat.setString(paramNum++, owner.getName());
            throws DBException
                    "AND o.OBJECT_TYPE = 'VIEW'\n";
        }

        ) throws SQLException, DBException {
        }
        {
                    dbStat.setString(1, OracleSchema.this.getName());
            //resultset has field COLUMN_NAMES_NUMS - special query was used
            dbStat.setString(1, owner.getName());
    public Collection<OracleSchemaTrigger> getTriggers(DBRProgressMonitor monitor)

                        " t WHERE t.OWNER(+) = O.OWNER AND t.TABLE_NAME(+) = o.OBJECT_NAME\n" +


                throws SQLException
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
            monitor.subTask("Cache table columns");
        return recycleBin.getAllObjects(monitor, this);
        @Override
                        "WHERE c.CONSTRAINT_TYPE<>'R' AND c.OWNER=? AND c.OWNER=col.OWNER AND c.CONSTRAINT_NAME=col.CONSTRAINT_NAME");
                    "i.OWNER,i.INDEX_NAME,i.INDEX_TYPE,i.TABLE_OWNER,i.TABLE_NAME,i.UNIQUENESS,i.TABLESPACE_NAME,i.STATUS,i.NUM_ROWS,i.SAMPLE_SIZE,\n" +
        for(String s : data) {
            trigger.setColumns(columns);
            return true;

                if (tableColumn == null) {
        throws DBException
    public OracleUser getSchemaUser(DBRProgressMonitor monitor) throws DBException {
                final OracleTableColumn tableColumn = refTable.getAttribute(session.getProgressMonitor(), columnName);
                    // To avoid java.sql.SQLException: ORA-31603
        @NotNull
                 dbStat.setString(3, OracleSchema.this.getName());
    @Association
                    // 1- owner
            }
            sql
    private volatile boolean hasStatistics;
    final public JavaCache javaCache = new JavaCache();
            throws SQLException, DBException
    {
    public TableCache getTableCache() {
    }
            sql.append("c.COLUMN_ID");
        throws DBException
     */
                    "JOIN " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "IND_COLUMNS") + " ic " +

    public Collection<OracleSchedulerProgram> getSchedulerPrograms(DBRProgressMonitor monitor)
            if (refTable != null) {
                         "                WHERE  col.OWNER =? AND col.TABLE_NAME = ? \r\n" + 
                throws SQLException, DBException
    @Association
                }
                    "WHERE S.SEGMENT_TYPE='TABLE'"  + (hasDBA ? " AND s.OWNER = ?" : "") + "\n" +
        if ((scope & STRUCT_ASSOCIATIONS) != 0) {
            boolean hasName = object == null && objectName != null;
    public synchronized void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope)
                dbStat.setString(3, ownerName);
    public String getName()

        throws DBException
                        "c.TABLE_NAME, c.CONSTRAINT_NAME,c.CONSTRAINT_TYPE,c.STATUS,c.SEARCH_CONDITION," +
    @Override
                }
    @Override
    final public TableCache tableCache = new TableCache();
            index.setColumns(rows);

        }
                    "AND NESTED = 'NO'\n";
                 // 1- owner
            monitor.beginTask("Load sequences", sequences.size());
                    " WHERE SEQUENCE_OWNER=? ORDER BY SEQUENCE_NAME");
                         "    c.TABLE_NAME,\r\n" + 

                .append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "OBJECTS")).append(" O\n")
            monitor.beginTask("Load procedures", procedures.size());
    static class PackageCache extends JDBCObjectCache<OracleSchema, OraclePackage> {

            if (synonymName != null) dbStat.setString(paramNum++, synonymName);
    {
     * DataType cache implementation
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner, @Nullable OracleTableBase forTable)

                 
                

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
     * Queue cache implementation
                .append("\nUNION ALL\n")
        {
                JDBCUtils.safeGetString(resultSet, "TABLE_NAME")
        }
        return new OracleTable(monitor, owner, dbResult);
            StringBuilder sql = new StringBuilder();
                         "    c.SEARCH_CONDITION,\r\n" + 
            }

        }
    /**
                            + "        ) COLUMN_NAMES_NUMS\r\n" + "FROM " + constraintsView + " c\r\n"
            @NotNull OracleTableTrigger trigger,
        {
                sql.append(tableQuery).append(unionAll).append(viewQuery).append(unionAll).append(mviewQuery);
    @Nullable
                    }

            }
    {
    public Collection<OracleMaterializedView> getMaterializedViews(DBRProgressMonitor monitor)
    }
                constraintCache.getAllObjects(monitor, schema);
        }
        @NotNull
 * You may obtain a copy of the License at
                        "    c.CONSTRAINT_TYPE <> 'R'\r\n" + 
                dbStat.setString(1, OracleSchema.this.getName());
                    "FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "INDEXES") + " i\n" +
        constraintCache.clearCache();
    }
                sql
                         "FROM\r\n" + 


                "SELECT " + OracleUtils.getSysCatalogHint(owner.getDataSource()) + " * " +
        return proceduresCache.getAllObjects(monitor, this);

            }

                        OracleTable table = getTable(monitor, tableName);
            if (hasName) {
import org.jkiss.dbeaver.model.meta.Association;
            return table;
            }
            StringBuilder sql = new StringBuilder(500);
            } else {
                         "    c.CONSTRAINT_TYPE,\r\n" + 
        @NotNull

                            + "    c.STATUS,c.R_OWNER,c.R_CONSTRAINT_NAME,\r\n"
                sql.append(mviewQuery);
        JDBCResultSet dbResult)
            boolean hasAllAllTables = owner.getDataSource().isViewAvailable(session.getProgressMonitor(), null, "ALL_ALL_TABLES");
    @Override

import org.jkiss.dbeaver.model.exec.DBCException;
                }
                    
            }
            dbStat.setString(1, owner.getName());

                    break;
        @NotNull
            }
                            table.fetchTableSize(dbResult);

            return new OracleJob(owner, dbResult);
    static class ProceduresCache extends JDBCObjectLookupCache<OracleSchema, OracleProcedureStandalone> {
            JDBCPreparedStatement dbStat = session.prepareStatement(
                OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "OBJECTS") +
        private final String column;
                    // 4-table name

    {

 * Copyright (C) 2010-2025 DBeaver Corp and others
            throw new DBCException("Error reading table statistics", e);
            oracleTableColumns.sort(DBUtils.orderComparator());
            }
            hasStatistics = true;
    

    public Collection<DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
    @Association
        @NotNull
        protected OracleTableIndex fetchObject(
    @Association
            }
        {
    }
        }
                    "SELECT * FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "SCHEDULER_PROGRAMS") + " WHERE OWNER=? ORDER BY PROGRAM_NAME");
 * OracleSchema
    public Class<? extends DBSEntity> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) {
                        "    ) COLUMN_NAMES_NUMS\r\n" + 
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    DBSSchema,
            tableTriggerCache.getAllObjects(monitor, this);
    DBSVisibilityScopeProvider
    public void setUser(OracleUser user)
import org.jkiss.dbeaver.model.struct.DBSVisibilityScopeProvider;
            return dbStat;
                tableColumn,
    final public SequenceCache sequenceCache = new SequenceCache();
        return tableCache;
            }
import org.jkiss.dbeaver.Log;
    final public QueueCache queueCache = new QueueCache();
        final OracleTableBase table = tableCache.getObject(monitor, this, childName);
                            column,

                            + "WHERE c.OWNER = ? AND c.TABLE_NAME = ? AND c.CONSTRAINT_TYPE = 'R'");
                    
            throws DBException
        @Override
                return owner.createTableImpl(session.getProgressMonitor(), owner, dbResult);
        }
            // Cache schema constraints if not table specified
                table.getDataSource(),
        this.loadMetadataOptions();
    {
        protected OracleDBLink fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult)
        return tableCache.getObject(monitor, this, name, OracleMaterializedView.class);
            if (forTable != null) {

            }
        }
                            positions.get(idx).getPos());

 *

    }
            Collection<OracleSchemaTrigger> triggers = getTriggers(monitor);
            int ordinalPosition = JDBCUtils.safeGetInt(dbResult, "COLUMN_POSITION");
        String indexName, @NotNull
            }
        
                        "FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "OBJECTS") + " O\n" +
                         + "    c.CONSTRAINT_NAME,\r\n"
                .append(" S WHERE S.OWNER = ?");
                    return null;
        return packageCache.getObject(monitor, this, childName);
                 dbStat = session.prepareStatement(sql.toString());
                }


                if (forTable != null) {

    }
        @NotNull
    @Property(order = 200)
                return tableColumn == null ? null : new OracleTableConstraintColumn[] { new OracleTableConstraintColumn(
                return (OracleDataType)object;
        @Override
        }
                    dbStat.setString(2, forTable.getName());
            if (hasName) {
    }

    @Association
                return result;
    }
                    }
    }
    public OracleMaterializedView getMaterializedView(DBRProgressMonitor monitor, String name)
            @NotNull OracleTable parent, @NotNull OracleTableForeignKey object, @NotNull JDBCResultSet dbResult)
                        dbStat.setString(2, forTable.getName());
                    }
    }
                
            StringBuilder sql = new StringBuilder();
                    "AND o.OBJECT_TYPE = 'MATERIALIZED VIEW'";
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
        return OracleTable.class;

    /**
                "AND O.OBJECT_TYPE NOT IN ('JAVA CLASS','PACKAGE BODY')\n");

            return new OracleDBLink(session.getProgressMonitor(), owner, dbResult);
            sql.append("GROUP BY OWNER, SYNONYM_NAME");
                sql.append("i.OWNER=?");
        @NotNull
     * User reference never read directly from database.
            }else {
    DBPRefreshableObject,
            String mviewQuery = "SELECT o.OWNER, o.OBJECT_NAME, 'MATERIALIZED VIEW' AS OBJECT_TYPE, o.STATUS, NULL, NULL, NULL, 'NO', NULL, NULL, o.TEMPORARY, o.SECONDARY, 'NO', 0\n" +
                        "    c.STATUS,\r\n" + 
    final public TriggerCache triggerCache = new TriggerCache();
                        "FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "CONSTRAINTS") +
        if (sequencesAsChildren) {
            @NotNull String childName,
    }


        {
            throws DBException
    @Property(order = 190)
        return id;
    @Override
            return;

            @NotNull OracleTableIndex object,
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner)
                throws SQLException, DBException
    }
            boolean useSimpleConnection = CommonUtils.toBoolean(session.getDataSource().getContainer().getConnectionConfiguration().getProviderProperty(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS));
     * It is used by managers to create/delete/alter schemas
    static class DBLinkCache extends JDBCObjectCache<OracleSchema, OracleDBLink> {
        protected OracleTableConstraint fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull OracleTableBase parent, @NotNull
            this.pos = pos;

        @NotNull
                .append("SELECT ").append(OracleUtils.getSysCatalogHint(owner.getDataSource())).append("\nc.*,c.TABLE_NAME as OBJECT_NAME " +
                "\nFROM " +
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner, @Nullable OracleTableBase object, @Nullable String objectName) throws SQLException {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner)
        return OracleConstants.USER_PUBLIC.equals(this.name);
                columnExpression) };
        
    public List<DBSObjectContainer> getPublicScopes(@NotNull DBRProgressMonitor monitor) {
        return tableCache.getObject(monitor, this, name, OracleView.class);
        }
     * Index cache implementation
        {
    public OracleSchema(@NotNull OracleDataSource dataSource, @NotNull ResultSet dbResult) {
        throws DBException
     */
                    ((OracleTable) table).setTableSize(0L);
    

            return dbStat;
            String tablesSource = hasAllAllTables ? "ALL_TABLES" : "TABLES";
    {
    @Association
                session.getProgressMonitor(),
    }
 *
        ) throws SQLException, DBException {
                    "WHERE ");

                    "WHERE OWNER=? ORDER BY TYPE_NAME");
            @NotNull JDBCResultSet dbResult
        if (value.length()<3) {
        @NotNull
                         + "      FROM ALL_CONS_COLUMNS col\r\n"
        if (CommonUtils.isEmpty(this.name)) {
                }
    public Collection<OraclePackage> getPackages(DBRProgressMonitor monitor)
                         "                       ROW_NUMBER() OVER (PARTITION BY col.CONSTRAINT_NAME ORDER BY col.POSITION) AS curr,\r\n" + 
            foreignKeyCache.getObjects(monitor, this, null);
            sql.append("SELECT OWNER, SYNONYM_NAME, MAX(TABLE_OWNER) as TABLE_OWNER, MAX(TABLE_NAME) as TABLE_NAME, MAX(DB_LINK) as DB_LINK, MAX(OBJECT_TYPE) as OBJECT_TYPE FROM (\n")
    static class JavaCache extends JDBCObjectCache<OracleSchema, OracleJavaClass> {
        {
import org.jkiss.code.NotNull;

        throws DBException
        @Nullable

    public void setName(String name)

            Collection<OracleProcedureStandalone> procedures = getProcedures(monitor);
        {
        this.loadMetadataOptions();
                OracleUtils.addDDLLine(sql, sequence.getObjectDefinitionText(monitor, options));
        }
                OracleUtils.addDDLLine(sql, tableBase.getDDL(monitor, OracleDDLFormat.getCurrentFormat(getDataSource()), options));
                    dbStat.setString(4, objectName);
            throws SQLException
            } else {
        ) throws DBException {
            String synonymTypeFilter = (session.getDataSource().getContainer().getPreferenceStore().getBoolean(OracleConstants.PREF_DBMS_READ_ALL_SYNONYMS) ?
                        continue;
        @Override
            } else {
        return triggerCache.getAllObjects(monitor, this);
    {
    class IndexCache extends JDBCCompositeCache<OracleSchema, OracleTableBase, OracleTableIndex, OracleTableIndexColumn> {
                dbStat = session.prepareStatement(sql.toString());
    {
    {
                         + "    c.DELETE_RULE,\r\n"
                OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), schema.getDataSource(), "TRIGGER_COLS") + " c" +
                if (table instanceof OracleTable && !((OracleTable) table).hasStatistics()) {
                dbStat.setString(2, forTable.getName());
                object,

    }
        @Override
                OracleUtils.addDDLLine(sql, dataType.getObjectDefinitionText(monitor, options));
        return result;

        }
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull OracleTableForeignKey foreignKey, @NotNull List<OracleTableForeignKeyColumn> rows)
        if ((scope & STRUCT_ATTRIBUTES) != 0) {
            throws SQLException, DBException
        {
                 dbStat.setString(3, OracleSchema.this.getName());
        protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner, @Nullable OracleTableBase forTable)
import org.jkiss.utils.CommonUtils;
        ) throws SQLException {

        }
        {
        @Override
        {

    {
        return dataTypeCache.getAllObjects(monitor, this);
                if (tableBase instanceof OracleTable && ((OracleTable) tableBase).isNested()) {
 * Licensed under the Apache License, Version 2.0 (the "License");

    static class TriggerCache extends JDBCObjectCache<OracleSchema, OracleSchemaTrigger> {
        }
            monitor.subTask("Cache table indexes");
                 dbStat.setString(2, forTable.getName());
            super.loadObjects(monitor, schema, forParent);
    }
    @Association
    @Association
    void resetStatistics() {
    }
    @NotNull
            }
                        "    c.CONSTRAINT_TYPE,\r\n" + 
    DBPScriptObject,
        if (hasStatistics && !forceRefresh) {
        }
        throws DBException
    DBPObjectStatisticsCollector,
                        "      WHERE col.OWNER =? AND col.TABLE_NAME = ? AND col.CONSTRAINT_NAME = c.CONSTRAINT_NAME GROUP BY CONSTRAINT_NAME \r\n"+
    @Override
                         "    c.STATUS,\r\n" + 
    @Override
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, "CREATED");
            JDBCPreparedStatement dbStat = session.prepareStatement(
        if (!monitor.isCanceled()) {
                return synonym;
        }
        {
            final JDBCPreparedStatement dbStat = session.prepareStatement(
        {
                        (object instanceof OracleView ? " AND O.OBJECT_TYPE='VIEW'" : "") +
                }
    @Association
                // 4-table name
    /**
                    if (column == null) {
    static class DataTypeCache extends JDBCObjectCache<OracleSchema, OracleDataType> {
            return new OracleTableColumn(session.getProgressMonitor(), table, dbResult);
            JDBCPreparedStatement dbStat;
        }
            throws SQLException
                colsView = "TAB_COLUMNS";
            monitor.done();
        @Nullable
            StringBuilder sql = new StringBuilder(500);
                sql.append("\nORDER BY SYNONYM_NAME");
                .append("SELECT S.*, NULL OBJECT_TYPE FROM ")

                
    }
//                    "LEFT OUTER JOIN " + OracleUtils.getSysSchemaPrefix(getDataSource()) + "ALL_COL_COMMENTS cc ON CC.OWNER=c.OWNER AND cc.TABLE_NAME=c.TABLE_NAME AND cc.COLUMN_NAME=c.COLUMN_NAME\n" +
        public SpecialPosition(String column, int pos) {
     */
                }
            if (forTable == null) {
    @Association
        }
            return column;
        @NotNull
            }

            String colsView;
        }
    static class JobCache extends JDBCObjectCache<OracleSchema, OracleJob> {
        @NotNull
            @Nullable OracleTableBase table
            }
                        (object == null && objectName == null ? "" : " AND O.OBJECT_NAME" + tableOper + "?") +
            return session.prepareStatement(
    public Collection<OracleDBLink> getDatabaseLinks(DBRProgressMonitor monitor)
    public Collection<OracleTableIndex> getIndexes(DBRProgressMonitor monitor)
                    if (forTable != null) {
            JDBCPreparedStatement dbStat;
            throws SQLException
        return indexCache.getObjects(monitor, this, null);
                    dbStat.setString(4, forTable.getName());
        protected OracleTableBase fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult)
            @NotNull JDBCResultSet resultSet
                            + " rc WHERE rc.OWNER = c.r_OWNER AND rc.CONSTRAINT_NAME = c.R_CONSTRAINT_NAME) AS R_TABLE_NAME,\r\n"
            OracleTableColumn tableColumn = columnName == null ? null : parent.getAttribute(session.getProgressMonitor(), columnName);
        return ArrayUtils.contains(OracleConstants.SYSTEM_SCHEMAS, getName());
    
    {
                            + "                       ROW_NUMBER() OVER (PARTITION BY col.CONSTRAINT_NAME ORDER BY col.POSITION) AS curr,\r\n"
            return dbStat;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner, @Nullable OracleTable forTable)
                        tableTypeColumns + ",t.TABLESPACE_NAME,t.PARTITIONED,t.IOT_TYPE,t.IOT_NAME,t.TEMPORARY,t.SECONDARY,t.NESTED,t.NUM_ROWS\n" +
                dbStat.setString(2, forTable.getName());
     * Constraint cache implementation
            //resultset has field COLUMN_NAMES_NUMS - special query was used
            throws DBException
            dbStat.setString(1, owner.getName());
                    break;
        return List.of(this.getDataSource().getPublicSchema());

        @Override
                    break;
    {
    @Property(order = 90)
    }
        }
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                return getTypeBySynonym(monitor, name);
        }
    }
                
                String consColumnsView = OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "CONS_COLUMNS");
        }
                        "AND O.OWNER=? AND O.OBJECT_TYPE IN ('TABLE', 'VIEW', 'MATERIALIZED VIEW')" +
        @Override
                         + "    c.CONSTRAINT_TYPE,\r\n"
            @NotNull OracleSchema owner,
    }
    /**
    /**
        jobCache.clearCache();
                 // 1- owner
        foreignKeyCache.clearCache();
            }
                } else {
    }
    @Override
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull OracleTableIndex index, @NotNull List<OracleTableIndexColumn> rows)
    @Override

import org.jkiss.dbeaver.model.meta.Property;
    }
                sql.append(") WHERE OBJECT_NAME").append("=?");
            throws SQLException, DBException
        @Override
                        "WHERE c.CONSTRAINT_TYPE='R' AND c.OWNER=?\n" +
            return Collections.emptyList();
    /**
        protected OracleTableTrigger fetchObject(

    @Association
                "SELECT * FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "JOBS") + " ORDER BY JOB"
    }

    private transient OracleUser user;
            
            JDBCPreparedStatement dbStat = session.prepareStatement(
    }


import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
            } else if (object instanceof OracleView) {
    {
                    "LEFT JOIN " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "IND_EXPRESSIONS") + " iex " +
        
            if (forTable != null) {
            return dbStat;
                JDBCUtils.safeGetString(resultSet, "TABLE_OWNER"),
     */
        
                monitor.subTask(procedure.getName());
                    "FROM " + OracleUtils.getSysSchemaPrefix(getDataSource()) + (hasDBA ? "DBA_SEGMENTS" : "USER_SEGMENTS") + " s\n" +
    final public SchedulerProgramCache schedulerProgramCache = new SchedulerProgramCache();
                "SELECT " + OracleUtils.getSysCatalogHint(owner.getDataSource()) + " * " +
        synonymsAsChildren = CommonUtils.getBoolean(cfg.getProviderProperty(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS));
    // Synonyms read is very expensive. Exclude them from children by default
            
    }
    static class SchedulerProgramCache extends JDBCObjectCache<OracleSchema, OracleSchedulerProgram> {
                " ORDER BY DB_LINK");
        }
        protected OracleQueue fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
            }
            return new OracleTableTrigger(table, resultSet);
                            + "                       col.CONSTRAINT_NAME cn,col.POSITION p,col.COLUMN_NAME cname,\r\n"
                "FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), schema.getDataSource(), "TRIGGERS") + " WHERE OWNER=? AND TRIM(BASE_OBJECT_TYPE) IN ('DATABASE','SCHEMA')\n" +

                    break;
                throws SQLException
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            constraintCache.getObjects(monitor, this, null);
                        "c.TABLE_NAME, c.CONSTRAINT_NAME,c.CONSTRAINT_TYPE,c.STATUS,c.R_OWNER,c.R_CONSTRAINT_NAME,rc.TABLE_NAME as R_TABLE_NAME,c.DELETE_RULE, \n" +
        return sql.toString();
            JDBCPreparedStatement dbStat = session.prepareStatement(
            @NotNull OracleTableBase parent,
    {
        throws DBException
                    }
                
            return dbStat;
                "" :
            String columnExpression = JDBCUtils.safeGetStringTrimmed(dbResult, "COLUMN_EXPRESSION");
    @NotNull
                        "FROM\r\n" + 
        @NotNull
        return type;
        protected OracleDataType fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet resultSet) throws SQLException
            
                        if (table != null) {
                monitor.worked(1);
                    "FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), tablesSource) + " t\n" +
        @Override
                    OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "OBJECTS") + " " +
    ///////////////////////////////////
    }
    final public TableTriggerCache tableTriggerCache = new TableTriggerCache();
        private final int pos;
        @Override
        if (tableColumn == null) {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        }
                }
                         "        SELECT LTRIM(MAX(SYS_CONNECT_BY_PATH(cname || ':' || NVL(p,1),','))    KEEP (DENSE_RANK LAST ORDER BY curr),',') \r\n" + 
                if (forTable != null) {
    @Association
                            object,
    @Override
    }
            String constraintsView = OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "CONSTRAINTS");
        @Override
        return proceduresCache.getObject(monitor, this, uniqueName);
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchema owner)
    private void loadMetadataOptions() {
                }
            if (table != null) {
        throws DBException
                
        {
                dbStat.setString(2, forTable.getName());
        if (synonym != null && (synonym.getObjectType() == OracleObjectType.TYPE || synonym.getObjectType() == OracleObjectType.TYPE_BODY)) {
                dbStat.setString(1, OracleSchema.this.getName());
                         + "WHERE c.OWNER = ? AND c.TABLE_NAME = ? AND c.CONSTRAINT_TYPE = 'R'");
    public class TableCache extends JDBCStructLookupCache<OracleSchema, OracleTableBase, OracleTableColumn> {
            return Collections.emptyList(); 
import org.jkiss.code.Nullable;
                    new OracleTriggerColumn(session.getProgressMonitor(), trigger, tableColumn, resultSet)
    static class RecycleBin extends JDBCObjectCache<OracleSchema, OracleRecycledObject> {
        }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        @Nullable
        throws DBException
                    sql.append("SELECT c.TABLE_NAME,c.CONSTRAINT_NAME,c.CONSTRAINT_TYPE,\r\n"
            }
            } else if ("MATERIALIZED VIEW".equals(tableType)) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
            StringBuilder sql = new StringBuilder();
        }
     */
        return getProcedures(monitor)
        @NotNull
        protected OracleTableIndexColumn[] fetchObjectRow(
        this.name = JDBCUtils.safeGetString(dbResult, "USERNAME");
            return new OracleRecycledObject(owner, dbResult);
                for(int idx = 0;idx < positions.size();idx++) {
                    "FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "TYPES") + " " +
                         + "    (\r\n"
    public Collection<OracleTableTrigger> getTableTriggers(DBRProgressMonitor monitor)
                sql.append(tableQuery);
        throws DBException
                OracleUtils.addDDLLine(sql, procedure.getObjectDefinitionText(monitor, options));
                        long bytes = dbResult.getLong(2);
            throws SQLException, DBException
        Collection<OracleDataType> dataTypes = getDataTypes(monitor);
            if (object instanceof OracleDataType) {
                    while (dbResult.next()) {
        @Override
    }
    public Collection<OracleJavaClass> getJavaClasses(DBRProgressMonitor monitor)
            return new OracleSchedulerProgram(owner, dbResult);
            @NotNull JDBCResultSet dbResult
            }
    @Association
import org.jkiss.utils.ArrayUtils;
        tableCache.clearCache();
            throws SQLException, DBException

    }
            }
        final OracleSynonym synonym = synonymCache.getObject(monitor, this, name);
    @Override
                    "WHERE o.OWNER =?\n" +
        }


                }
                    sql.append("SELECT " + OracleUtils.getSysCatalogHint(owner.getDataSource()) + " \r\n" +
            return new OracleSynonym(owner, resultSet);

            if (forTable != null) {

    }
        }
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName)
                
    }
            return new OracleSchedulerJob(owner, dbResult);
 * Unless required by applicable law or agreed to in writing, software
            .stream()
    @Property(viewable = true, editable = true, order = 1)
                        }
        ConstraintCache()
            monitor.done();
     */
        @Override
         
            );
        }
        }

                    
    private Date createTime;
            if (owner.getDataSource().isAtLeastV11() && forTable != null && !useSimpleConnection) {

        }
    {
                    // 2-table name
            .collect(Collectors.toList());
                 dbStat.setString(4, forTable.getName());
        }
        ) throws DBException {
        return tableColumn;
    private String name;
            } else {
                OracleUtils.addDDLLine(sql, trigger.getObjectDefinitionText(monitor, options));
                List<SpecialPosition>  positions = parsePositions(JDBCUtils.safeGetString(dbResult, "COLUMN_NAMES_NUMS"));
            for (OracleSchemaTrigger trigger : triggers) {
            dbStat.setString(1, owner.getName());
            if (!owner.getDataSource().isViewAvailable(session.getProgressMonitor(), OracleConstants.SCHEMA_SYS, "ALL_TAB_COLS")) {
    public Collection<OracleProcedureStandalone> getProceduresOnly(DBRProgressMonitor monitor) throws DBException {
        protected OracleTriggerColumn[] fetchObjectRow(
            children.addAll(sequenceCache.getAllObjects(monitor, this));
    }
                    "SELECT * FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "SCHEDULER_JOBS") + " WHERE OWNER=? ORDER BY JOB_NAME");
    }
            super(tableCache, OracleTable.class, OracleConstants.COL_TABLE_NAME, OracleConstants.COL_CONSTRAINT_NAME);

                };
    public OracleView getView(DBRProgressMonitor monitor, String name)
        throws DBException
                    dbStat.setString(2, object != null ? object.getName() : objectName);
    {
        if (synonymsAsChildren) {
        IndexCache()
                "\nORDER BY t.TRIGGER_NAME"
            sql.append("\nORDER BY ");
            
            }
            }
        dataTypeCache.clearCache();
                            + "                FROM   " + consColumnsView + " col \r\n"
                    object,
        {
        }
                if (columnName == null) {
        protected OraclePackage fetchObject(@NotNull JDBCSession session, @NotNull OracleSchema owner, @NotNull JDBCResultSet dbResult)
            return dbStat;
        }
    public Collection<OracleRecycledObject> getRecycledObjects(DBRProgressMonitor monitor)
        {
            this.pos = data.length == 1 ? 0 : CommonUtils.toInt(data[1]);
                    "ON iex.index_owner = i.owner AND iex.INDEX_NAME = i.INDEX_NAME AND iex.COLUMN_POSITION = ic.COLUMN_POSITION\n" +
                final String columnName = JDBCUtils.safeGetString(resultSet, "TRIGGER_COLUMN_NAME");
        public String getColumn() {
                    return null;
        return tableCache.getObject(monitor, this, name, OracleTable.class);
            final JDBCPreparedStatement dbStat = session.prepareStatement(
        synonymCache.clearCache();
    // Statistics
                monitor.subTask(trigger.getName());
        {
    }
            tableCache.loadChildren(monitor, this, null);
                isPublic ?
            Collection<OracleSequence> sequences = getSequences(monitor);
                .append("SELECT S.*,O.OBJECT_TYPE FROM ").append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner.getDataSource(), "SYNONYMS")).append(" S, ")
                 sql.append("SELECT\r\n" + 
                        "    AND c.OWNER = ?\r\n" + 
    public String getDescription()
        @Override
                         "        FROM   (SELECT \r\n" + 


                 // 2-table name
                    "ic.COLUMN_NAME,ic.COLUMN_POSITION,ic.COLUMN_LENGTH,ic.DESCEND,iex.COLUMN_EXPRESSION\n" +
            JDBCPreparedStatement dbStat = session.prepareStatement(

            @NotNull OracleTableBase parent,
            @NotNull JDBCSession session,
                            column,
                 dbStat.setString(1, OracleSchema.this.getName());
    }
                return new OracleTriggerColumn[]{
                
                            + "                       ROW_NUMBER() OVER (PARTITION BY col.CONSTRAINT_NAME ORDER BY col.POSITION) -1 AS prev\r\n"
     */
        throws DBException
        {
            sql.append(synonymTypeFilter)
        return null;
                    "GROUP BY SEGMENT_NAME"))
                
                if (owner.getDataSource().isAtLeastV10() && forTable != null && !useSimpleConnection) {
    public long getId()
                    "WHERE OBJECT_TYPE IN ('PROCEDURE','FUNCTION') " +
import java.sql.ResultSet;
        return packageCache.getAllObjects(monitor, this);
            dbStat.setString(1, owner.getName());
                    "SELECT * FROM " + OracleUtils.getSysSchemaPrefix(owner.getDataSource())+ "DBA_RECYCLEBIN WHERE OWNER=?");
        {
                            + "    (SELECT rc.TABLE_NAME FROM " + constraintsView
    final public ConstraintCache constraintCache = new ConstraintCache();
                    "WHERE c.OWNER=?");
        return "Schema " + name;
                 // 4-table name
    private static OracleTableColumn getTableColumn(JDBCSession session, OracleTableBase parent, ResultSet dbResult,String columnName) throws DBException
            return new OracleTableIndexColumn[] { new OracleTableIndexColumn(
            boolean isAscending = "ASC".equals(JDBCUtils.safeGetStringTrimmed(dbResult, "DESCEND"));
                    OracleTableColumn column = getTableColumn(session, parent, dbResult,positions.get(idx).getColumn());
                    
        {

                         + "    c.TABLE_NAME,\r\n"
            super.cacheChildren(parent, oracleTableColumns);
        }
            return dbStat;
            }
