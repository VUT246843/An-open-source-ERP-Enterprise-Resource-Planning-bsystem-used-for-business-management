                    } else if (keyValue instanceof Float) {
                query.append(generateTableDeleteFrom(tableName));
                        session,
    {
import org.jkiss.dbeaver.model.data.*;
    }
        }
                DBCStatement dbStat = session.prepareStatement(DBCStatementType.QUERY, query.toString(), false, false, keysReceiver != null);
                    } else if (searchInKeys) {
        appendExtraSelectParameters(query);
                String tableAlias = null;
            throw new DBCException("Can't generate query conditions", e, session.getExecutionContext());
        }
    public void setPersisted(boolean persisted)
        public List<DBDLabelValuePair> getValues(long offset, int pageSize) throws DBException {
                    for (DBSEntityAttribute descAttr : descAttributes) {
        ) throws DBException {
            : null;
                String tableAlias = null;
            DBDAttributeConstraint constraint = new DBDAttributeConstraint(keyColumn, constraints.size());
        private final List<AttrInfo<DBDAttributeValue>> restAttrsInfo;
            query.append(")");
            DBUtils.getRowIdAttribute(this) : null;
        boolean sortByDesc
            {
        }
            getDataSource().getSQLDialect().getQueryGenerator().appendConditionString(patternFilter, getDataSource(), null, query, false);
                if (preceedingKeys != null && !preceedingKeys.isEmpty()) {
        }

            if (executeResult) {

                        return Long.parseLong(result.toString());
        boolean sortByValue,
            getAttributes(monitor);
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
        query.append("SELECT ");
                        hasKey = true;
                } else {
                log.error("Unsupported attribute argument: " + attribute);
    }
                }
        boolean sortByValue,
            query.append(",").append(rowIdAttribute.translateExpression(tableAlias));
            maxResults,
                    }
                        return DBVUtils.readDictionaryRows(

                        }
                if (keyValue != null) {
    public ExecuteBatch deleteData(


    }
                keyConstraint.setValue("%" + pattern + "%");
    {
        @NotNull List<DBSEntityAttribute> keyColumns,
    @Override

import org.jkiss.dbeaver.Log;
            }
        DBRProgressMonitor monitor = session.getProgressMonitor();
        boolean caseInsensitiveSearch,
    public DBCStatistics truncateData(@NotNull DBCSession session, @NotNull DBCExecutionSource source) throws DBException {
                DBCResultSet dbResult = dbStat.openResultSet();
                            log.debug("Internal error: too many dictionary key values: " + keyValue.length);
            } else {
        }
            query.append(", ").append(descColumns);

        }
                        constraints.add(descConstraint);
import org.jkiss.dbeaver.model.exec.*;
            SQLUtils.appendQueryConditions(dataSource, query, tableAlias, dataFilter);
            .map(c -> DBUtils.findValueHandler(c.getDataSource(), c)).toList();
            for (DBSEntityAttribute descAttr : descAttributes) {
 * See the License for the specific language governing permissions and
        public DBRProgressMonitor getProgressMonitor() {
                if (hasCond) query.append(" AND ");
    /**
            preceedingKeys,
            if (hasCond) query.append(" AND (");
                }
                }
                }
            if (CommonUtils.isNotEmpty(descColumns) && (descAttributes == null || descAttributes.isEmpty())) {
                    OrderingPolicy.get(prefs)
        }
                return 0;
                DBCStatementType.QUERY,
        @NotNull DBRProgressMonitor monitor,
            @NotNull DBDDataFilter existingFilter,
                        query.append("?"); //$NON-NLS-1$
            if (dbStat instanceof JDBCStatement && (fetchSize > 0 || maxRows > 0)) {
            DBCStatementType.SCRIPT,
        }
            }
        String tableAlias = null;
import org.jkiss.dbeaver.model.*;
                DBCStatement dbStat = session.prepareStatement(DBCStatementType.QUERY, query.toString(), false, false, false);
                    break;
            }
        }
        }
                    if (k >= updateAttributes.length && DBUtils.isNullValue(attributeValues[k])) {

                        float floatValue = (Float) keyValue;
            if (isKeyComparable() || sortByDesc) {
            StringBuilder query = prepareQueryString(filter);
            if (keyColumn.getDataKind() == DBPDataKind.STRING) {

            getDataSource().getSQLDialect().getQueryGenerator().appendConditionString(filter, getDataSource(), null, query, false);
                        final DBDValueHandler valueHandler = DBUtils.findValueHandler(session, a.attr);
            }
        }
                keyConstraint.setOperator(DBCLogicalOperator.EQUALS);
        @NotNull DBSEntityAttribute keyColumn,
        @NotNull
    }
                query.append(" WHERE ");
                if (keyColumn.getDataKind() == DBPDataKind.STRING) {
            statistics.addExecuteTime();
                    } else {

                            if (fetchProgress.isCanceled() || (hasLimits && fetchProgress.isMaxRowsFetched(maxRows))) {
        @Nullable String searchText,
 * Licensed under the Apache License, Version 2.0 (the "License");
    ////////////////////////////////////////////////////////////////////
                    query.append(DBUtils.getQuotedIdentifier(keyColumn));

        {
                    for (DBDAttributeValue precAttribute : preceedingKeys) {
public abstract class JDBCTable<DATASOURCE extends DBPDataSource, CONTAINER extends DBSObject>
                            DBDValueHandler precValueHandler = DBUtils.findValueHandler(session, precAttrValue.getAttribute());
                for (var a : descAttributesInfo) {
            boolean sortAsc,
            constraint.setOperator(DBCLogicalOperator.EQUALS);
import java.math.BigInteger;

            try {

        private final boolean isKeyComparable;
                        DBSAttributeBase attribute = keyAttributes[i];

                        if (i >= keyColumns.size()) {
                return statistics;
        if (!CommonUtils.isEmpty(preceedingKeys) || keyValue != null || searchInDesc) {
     * Enumerations supported only for unique constraints
                int paramIndex = 0;
            DBDDataFilter filter = new DBDDataFilter();
     *
                    hasKey = true;
        @Nullable DBDDataReceiver keysReceiver, @NotNull final DBCExecutionSource source)
                if (dbStat.executeStatement()) {
                query.append("?");
                    if (hasKey) query.append(","); //$NON-NLS-1$
        if (hasCond) query.append(" AND ");
                        query.append(identifier).append(" LIKE ?");
                this.restAttrsInfo = List.copyOf(restKeysInfo);
        }
                if (patternFilter.hasConditions()) {
            session,
        return new ExecuteInsertBatchImpl(attributes, keysReceiver, true, session, source, JDBCTable.this, useUpsert(session));
    }
        if (DBUtils.isNullValue(value)) {
            if (attribute instanceof DBDAttributeBindingMeta) {
        @NotNull
        private void appendSortingClause(@NotNull StringBuilder query, boolean isPreceeding) {
                // Execute

        return dialect instanceof JDBCSQLDialect && ((JDBCSQLDialect) dialect).supportsUpsertStatement();
            @Nullable List<DBDAttributeValue> restAttrs,
                        }
        if (asteriskString == null) {
                    try (dbResult) {
                batch.add(new Object[0]);
        @Nullable List<DBDAttributeValue> preceedingKeys,
    @Override
     */
                        DBDValueHandler precValueHandler = DBUtils.findValueHandler(session, precAttribute.getAttribute());
                keyValueHandler.bindValueObject(session, dbStat, keyColumn, paramPos++, "%" + pattern + "%");

        DBDPseudoAttribute pseudoAttribute = null;
            if (rowIdAttribute.getAlias() != null) {
                query.append(DBUtils.getQuotedIdentifier(keyColumn));
            }
            }
                // Its ok
        public boolean isKeyComparable() {
                hasCond = true;
                this.filter = new DBDDataFilter(constraints);
                    if (j > 0) query.append(",");

        int maxResults
            }
        @Nullable Object keyPattern,
                }
                        query.append(tableAlias).append(dialect.getStructSeparator());
 * DBeaver - Universal Database Manager

            constraint.setOperator(isPreceeding ^ sortAsc? DBCLogicalOperator.GREATER_EQUALS : DBCLogicalOperator.LESS);
        public List<DBDLabelValuePair> getSimilarValuesNear(
            try (DBCStatement dbStat = DBUtils.makeStatement(null, session, DBCStatementType.QUERY, query.toString(), 0, 1)) {
    public List<DBDLabelValuePair> getDictionaryEnumeration(
            this.handler = handler;
        return persisted;
        this.persisted = persisted;
            maxRows))
            try (DBCStatement dbStat = DBUtils.makeStatement(null, session, DBCStatementType.QUERY, query.toString(), offset, pageSize)) {
                if (CommonUtils.isNumber(pattern)) {

                        query.append(identifier).append(" LIKE ?");
        long firstRow,
            statistics.addStatementsCount();
                        descConstraint.setOperator(caseInsensitive && ilikeUsable ? DBCLogicalOperator.ILIKE : DBCLogicalOperator.LIKE);
        }
        return "TRUNCATE TABLE " + getFullyQualifiedName(DBPEvaluationContext.DML);
            this.isKeyComparable = ArrayUtils.contains(DBUtils.getAttributeOperators(keyColumn), DBCLogicalOperator.LESS);
                final String identifier = DBUtils.getQuotedIdentifier(keyColumn);
                    boolean allowNegative = ((Number) keyValue).longValue() < 0;
import org.jkiss.code.Nullable;
        private final boolean sortAsc;
        }
                }
        if (DBUtils.isPseudoAttribute(attribute)) {
    protected JDBCTable(CONTAINER container, DBSEntity source, boolean persisted)
                        searchInKeys = false;

        }
                query.append(descColumns);
        } else {
                    }
import org.jkiss.dbeaver.model.impl.data.ExecuteBatchWithMultipleInsert;
                return readValues(dbStat);
                }
            query.append("SELECT ").append(DBUtils.getQuotedIdentifier(keyColumn, DBPAttributeReferencePurpose.DATA_SELECTION));
        boolean caseInsensitiveSearch,
        appendSelectSource(monitor, query, tableAlias, rowIdAttribute);
        return new ExecuteBatchImpl(keyAttributes, null, false) {
     * @param sortByValue           sort results by eky value. If false then sort by description
        }
 *

            // If we have pseudo attributes then query gonna be more complex
            query.append(" IS NULL"); //$NON-NLS-1$
/**
            }
    }
                }
     * @param preceedingKeys        other constrain key values. May be null.
                        if (hasKey) query.append(" AND "); //$NON-NLS-1$
{
                }
    @Override
            appendSortingClause(query, isPreceeding);
 *
        return "UPDATE " + tableName;
    ////////////////////////////////////////////////////////////////////
        if (hasCond) query.append(")");
    @Override
        };

        @NotNull
        this.persisted = persisted;
        return super.getName();
        }
                        query.append(" OR ");

    @NotNull
    }
                boolean ilikeUsable = ArrayUtils.contains(keyValueHandler.getSupportedOperators(keyColumn), DBCLogicalOperator.ILIKE);
import org.jkiss.utils.CommonUtils;

                    keyValueHandler.bindValueObject(session, dbStat, keyColumn, paramPos++, pattern);
                try (DBCResultSet dbResult = dbStat.openResultSet()) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
        String descColumns = DBVUtils.getDictionaryDescriptionColumns(monitor, keyColumns.get(0));
        @NotNull DBSEntityAttribute keyColumn,

        @Override
        long flags,
 * limitations under the License.
    throws DBCException
        @NotNull DBSEntityAttribute keyColumn,
            if (dbResult == null) {
            @Override
            asteriskString = "";
            }
        DBPDataSource dataSource = session.getDataSource();

    public DBSDictionaryAccessor getDictionaryAccessor(
    public abstract JDBCStructCache<CONTAINER, ? extends DBSEntity, ? extends DBSEntityAttribute> getCache();
        } else if (rowIdAttribute != null) {
            DBDAttributeConstraint keyConstraint = new DBDAttributeConstraint(keyColumn, constraints.size());
    {
                if (!CommonUtils.isEmpty(updateSet)) {
        try {
        final SQLDialect dialect = getDataSource().getSQLDialect();
                if (DBUtils.findObject(descAttributes, keyColumn.getName(), true) != null) {
            {
        String sqlQuery = query.toString();
        boolean sortByValue,
            List<DBDAttributeConstraint> constraints = filter.getConstraints();
        public List<DBDLabelValuePair> getValuesNear(
                        keyValue = allowNegative || intValue > gapSize ? intValue - gapSize : 0;
        StringBuilder query = new StringBuilder();
                    query.append(' ').append(tableAlias);
            DBCStatementType.QUERY,
        DBRProgressMonitor monitor = session.getProgressMonitor();
                    paramPos++,
                if (dialect.supportsAliasInUpdate()) {
                    if (hasCondition) {
            for (int i = 0; i < keyValues.size(); i++) {
                        fetchProgress.dumpStatistics(statistics);
    @Override
                        }
                }
            }
    protected boolean needAliasInSelect(
                    boolean hasKey = false;
        String tableFullName = getTableName();
            return;
        @NotNull final DBSAttributeBase[] keyAttributes,
            keyColumn,
            DBDDataFilter filter = new DBDDataFilter(this.filter);
     * Reads and caches metadata which is required for data requests
    {
     * Returns prepared statements for enumeration fetch
        } else {
                // Make query
            }
            boolean hasCondition = false;
                    query.append(" ASC");
                        if (descAttr.getDataKind() == DBPDataKind.STRING) {
                int paramIndex = 0;
                }
        }
                    }
     */
    private void appendAttributeCriteria(@Nullable String tableAlias, SQLDialect dialect, StringBuilder query, DBSAttributeBase attribute, Object value) {
    ////////////////////////////////////////////////////////////////////
                int paramPos = 0;
        if (preceedingKeys != null && !preceedingKeys.isEmpty()) {
        public void close() throws Exception {
    public long countData(@NotNull DBCExecutionSource source, @NotNull DBCSession session, @Nullable DBDDataFilter dataFilter, long flags) throws DBException

        private final String descColumns;
            } else {
    public boolean supportsDictionaryEnumeration() {
        private final DBDValueHandler keyValueHandler;
        );
        catch (DBException e) {
                                break;

        private final Collection<AttrInfo<DBSEntityAttribute>> descAttributesInfo;
            appendSortingClause(query, false);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                query.append(tableAlias).append(dialect.getStructSeparator());
        if (omitNonDescriptive && (descColumns == null || descColumns.equals(DBUtils.getQuotedIdentifier(keyColumns.get(0))))) {
        if (keyValues.size() > 1) {
            if (descAttributes != null) {
            this.sortAsc = sortAsc;
        }
                if (dbResult != null && !monitor.isCanceled()) {
                }
            }
            boolean byDesc
 * You may obtain a copy of the License at
                tableAlias = this.getFullyQualifiedName(DBPEvaluationContext.DML);
    ////////////////////////////////////////////////////////////////////
        super(container, tableName);
            query.append(" ORDER BY ");
            DBCStatistics statistics = new DBCStatistics();
    }
                    }
            boolean hasStringAttrs = false;
            int paramPos = bindAt;
        @Nullable Object keyValue,
    }
        } else {
        @Nullable DBDDataFilter dataFilter,
                            dbResult,
        }
    protected String getTruncateTableQuery() {
        @NotNull DBDDataReceiver dataReceiver,
                return batch.execute(session, Collections.emptyMap());
                if (sortByDesc) {
            long offset,
                return 0;
            query.toString(),
                throw new DBCException("Error getting table attributes", e);
                    query.append(identifier).append(" >= ?");
    protected JDBCTable(CONTAINER container, @Nullable String tableName, boolean persisted)

            } else if (pattern instanceof CharSequence) {

    @Override
            List<DBDAttributeConstraint> constraints = filter.getConstraints();
            if (keyColumn.getDataKind() == DBPDataKind.NUMERIC) {
                    if (DBUtils.isNullValue(attributeValues[k])) {

    }
            }
        Collection<DBSEntityAttribute> descAttributes = null;
                for (DBDAttributeValue pkColumn : pk) {
    @Override
    private boolean persisted;
            }
                    DBSEntityAttribute keyAttr = keyColumns.get(j);
                keysReceiver,
            appendByPatternCondition(query, filter, pattern, caseInsensitive, byDesc);
            } else {
                if (i > 0) query.append(",");
            query.append("(");
        }
            for (DBSEntityAttribute descAttr : descAttributes) {
                    } else {
        @Nullable DBDDataFilter dataFilter,
import org.jkiss.dbeaver.model.virtual.DBVEntity;
                } else {
 */
        if (keyColumns.size() == 1) {


        }
    // Utils
            constraint.setValue(value);
                }
            // For single column key use IN
                    for (DBDAttributeValue key : restAttrs) {
                int paramPos = bindAttributes(dbStat);
                            true,
            query.append(tableAlias).append(".").append(asteriskString); //$NON-NLS-1$
                    DBSAttributeBase attribute = attributes[k];
        @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    } else {
    private void readRequiredMeta(DBRProgressMonitor monitor)

                            gapSize = 0;
        @NotNull final DBSAttributeBase[] updateAttributes,
                return readValues(dbStat);
            if (!existingFilter.getConstraints().isEmpty()) {
        }
            this.session = DBUtils.openUtilSession(monitor, JDBCTable.this, "Load attribute values count");
    {
            query.append(dialect.getCastedAttributeName(attribute, DBStructUtils.getAttributeName(attribute)));
                    query.append("\n\tWHERE "); //$NON-NLS-1$ //$NON-NLS-2$
        if (!getDataSource().getContainer().isExtraMetadataReadEnabled()) {
                Collections.emptyMap());
                if (sortAsc ^ isPreceeding) {
            DBSEntityAttribute keyColumn = keyColumns.get(i);
                        appendAttributeCriteria(tableAlias, dialect, query, keyAttributes[i], attributeValues[i]);
                    this,
            } else {
                    dataFilter,
        @Nullable List<DBDAttributeValue> preceedingKeys,
                constraints.add(keyConstraint);
            for (int i = 0; i < keyValues.size(); i++) {
            if (!sortAsc) {
            }
                        int shortValue = (Short) keyValue;
            // Add desc columns conditions
            query.append(asteriskString);
        @NotNull DBRProgressMonitor monitor,
        public List<DBDLabelValuePair> getSimilarValues(
                query.append(DBUtils.getQuotedIdentifier(getDataSource(), preceedingKeys.get(i).getAttribute().getName())).append(" = ?");
            this.sortByDesc = sortByDesc;
        } catch (DBException e) {
            } else {

import org.jkiss.utils.ArrayUtils;
            }
                for (int k = 0; k < handlers.length; k++) {

    {
                    } else if (keyValue instanceof Long) {
            boolean caseInsensitive,

                }

    @Override

                            valueHandler.bindValueObject(session, dbStat, descAttr, paramPos++,
        private List<DBDLabelValuePair> readValues(@NotNull DBCStatement dbStat) throws DBException {
    implements DBSDictionary, DBSDataManipulator, DBPSaveableObject, SQLQueryGeneratorUpdate
                    } else {
                        return DBVUtils.readDictionaryRows(session, keyColumns, keyValueHandler, dbResult, true, false);
            }
                    }
                        Collections.singletonList(keyColumn),
                dbStat.setLimit(0, keyValues.size());
            return statistics;

                StringBuilder query = new StringBuilder();
                    query.append("\n\tWHERE "); //$NON-NLS-1$
 * you may not use this file except in compliance with the License.

            }
                    query.append("\n\t").append(updateSet); //$NON-NLS-1$ //$NON-NLS-2$
                // Sort by description
                List<DBDAttributeConstraint> constraints = new ArrayList<>();
        readRequiredMeta(session.getProgressMonitor());
            this.keyColumn = keyColumn;
                    }
        SQLDialect dialect = session.getDataSource().getSQLDialect();
            }
        @NotNull DBCSession session,
                        }
            try (DBCStatement dbStat = DBUtils.makeStatement(null, session, DBCStatementType.QUERY, query.toString(), offset, maxResults)) {
                if (descAttr.getDataKind() == DBPDataKind.STRING) {
                }

                    DBSAttributeBase attribute = updateAttributes[i];
     * @param monitor progress monitor
                for (int j = 0; j < keyColumns.size(); j++) {
            }
    protected class DictionaryAccessor implements DBSDictionaryAccessor {
                query.append(" DESC");
            List<DBDAttributeConstraint> constraints = filter.getConstraints();
        DBCStatistics statistics = new DBCStatistics();
     * @param sortAsc               sort ascending/descending
        @Override
                        precValueHandler.bindValueObject(session, dbStat, precAttribute.getAttribute(), paramPos++, precAttribute.getValue());
                if (dialect.supportsAliasInUpdate()) {
            @Override
    ) throws DBException {
        @NotNull
                    }

        boolean sortAsc,
            if (monitor.isCanceled()) {
    }
            if (dbStat.executeStatement()) {
    // Update
                        appendAttributeCriteria(tableAlias, dialect, query, attribute, attributeValues[updateAttributes.length + i]);

            descAttributes = DBVEntity.getDescriptionColumns(monitor, this, descColumns);
    protected void appendSelectSource(DBRProgressMonitor monitor, StringBuilder query, String tableAlias, DBDPseudoAttribute rowIdAttribute) throws DBCException {
                        keyValue = allowNegative || shortValue > gapSize ? shortValue - gapSize : (short)0;

                            precValueHandler.bindValueObject(session, dbStat, precAttrValue.getAttribute(), paramPos++, precAttrValue.getValue());
            } else if (keyColumn.getDataKind() == DBPDataKind.NUMERIC) {
    }
import org.jkiss.dbeaver.model.impl.data.ExecuteInsertBatchImpl;
    {
                    query.append(DBStructUtils.getAttributeName(attribute, DBPAttributeReferencePurpose.UPDATE_TARGET)).append("="); //$NON-NLS-1$
            }
                        double doubleValue = (Double) keyValue;
            if (dataSource.getSQLDialect().supportsAsKeywordBeforeAliasInFromClause()) {
                if (tableAlias != null) {
                false, false, false)) {
                        // Skip NULL criteria binding
        return (dataFilter != null || rowIdAttribute != null) && dataSource.getSQLDialect().supportsAliasInSelect();
        }
                        query.append(caseInsensitiveFormatter.format(identifier, "?"));
                if (keyValue instanceof Number && maxResults > 0) {
        boolean sortAsc,
            @NotNull DBRProgressMonitor monitor,

            boolean caseInsensitive,
                        keyValueToSet = "%" + keyValue + "%";

                    hasKey = false;
                } else if (keyColumn.getDataKind() == DBPDataKind.NUMERIC && searchInKeys) {
    }
            query.append(" ").append(tableAlias); //$NON-NLS-1$
        return "DELETE FROM " + tableName;
            try (DBCStatement dbStat = DBUtils.makeStatement(null, session, DBCStatementType.QUERY, query.toString(), offset, maxResults)) {

                        true,
        if (descColumns != null) {
            @NotNull
    @NotNull
                // Make query
        // Some criteria doesn't work without alias
        }
                query.append(" DESC");
            DBDAttributeConstraint constraint = new DBDAttributeConstraint(keyColumn, constraints.size());
                }
                    if (hasCond) query.append(" AND ");
                        gapSize = Math.max(Math.round((float) maxResults / 2), 1) - offset;
                    }
                attributes = CommonUtils.safeList(getAttributes(monitor));

        } else {
        try {
        boolean sortAsc,
        // Always use alias if we have data filter or ROWID.
     * @return true for unique constraint else otherwise

        ) throws DBException {
        DBSAttributeBase[] attributes = ArrayUtils.concatArrays(updateAttributes, keyAttributes);
            query.append(" FROM ").append(DBUtils.getObjectFullName(JDBCTable.this, DBPEvaluationContext.DML));
                    DBDValueHandler valueHandler = handlers[i];
        }
            }
                query.append(" ORDER BY ");
                } else {
        private final JDBCSession session;
 */
            readRequiredMeta(monitor);
                query.append(attributes.get(i).getName());
                if (descAttr.getDataKind() == DBPDataKind.STRING) {
            throw new DBCException("Can't cache table columns", e);
        query.append("SELECT ");
                    }
            }
                            false);

            if (DBUtils.findObject(descAttributes, keyColumn.getName(), true) != null) {
                            Collections.singletonList(keyValueHandler),
            try (DBCStatement dbStat = session.prepareStatement(
                int paramPos = bindAttributes(dbStat);

                if (dbResult.nextRow()) {
            if (tableAlias == null) {
                keyConstraint.setValue(pattern);
                String tableName = DBUtils.getEntityScriptName(JDBCTable.this, options);

            }
                if (dbStat.executeStatement()) {
                JDBCStringValueHandler.INSTANCE.bindValueObject(

            DBRProgressMonitor monitor = session.getProgressMonitor();
        boolean hasCond = false;
        // (e.g. structured attributes in Oracle or composite types in PostgreSQL requires table alias)
        int maxResults,


                    query.append(' ').append(tableAlias);
                }
            SQLDialect sqlDialect = SQLUtils.getDialectFromObject(this);
    }
        final SQLExpressionFormatter caseInsensitiveFormatter = caseInsensitiveSearch
            constraints.add(constraint);
import org.jkiss.dbeaver.model.virtual.DBVUtils;
            DBDDataFilter filter = new DBDDataFilter(this.filter);
                        keyValueHandler.get(i).bindValueObject(session, dbStat, keyColumns.get(i), paramPos++, cellValue);
        query.append(getTableName());
                }
                    hasCond = true;
        }
        @Override
        public List<DBDLabelValuePair> getValueEntry(@NotNull Object keyValue) throws DBException {
                    } else {
            StringBuilder query = prepareQueryString(filter);
    @Override
        @NotNull
            protected void bindStatement(@NotNull DBDValueHandler[] handlers, @NotNull DBCStatement statement, Object[] attributeValues) throws DBCException {
                        long longValue = (Long) keyValue;
                    if (a.attr.getDataKind() == DBPDataKind.STRING) {
            Object value, boolean isPreceeding,
        if (asteriskString == null) {
    }
            protected DBCStatement prepareStatement(@NotNull DBCSession session, DBDValueHandler[] handlers, Object[] attributeValues, Map<String, Object> options) throws DBCException {
        }
    ) {
                keyConstraint.setOperator(caseInsensitive && ilikeUsable ? DBCLogicalOperator.ILIKE : DBCLogicalOperator.LIKE);



        private int bindAttributes(@NotNull DBCStatement dbStat) throws DBCException {
    }
        if (needAliasInSelect(dataFilter, rowIdAttribute, dataSource)) {
            } finally {
                    }
        DBDValueHandler keyValueHandler = DBUtils.findValueHandler(keyColumn.getDataSource(), keyColumn);
     * @param caseInsensitiveSearch use case-insensitive search for {@code keyPattern}
                    }
                            continue;
    ) throws DBException {
     * @param maxResults            maximum enumeration values in result set
        if (useUpsert(session)) {
            if (!filter.getConstraints().isEmpty()) {
            }
                    return Collections.emptyList();
        return getFullyQualifiedName(DBPEvaluationContext.DML);
    private static class AttrInfo<T> {
        private StringBuilder prepareQueryString(@NotNull DBDDataFilter filter) throws DBException {
    }
                    }
     */
            boolean byDesc,
                dbStat.setLimit(0, maxResults);
     * @param keyPattern            pattern for enumeration values. If null or empty then returns full enumration set
            query.append(")");
                    // Add alias for value column to avoid ambiguity
                if (CommonUtils.isNumber(pattern)) {
            throw new DBException("Empty key columns");


            // Append all table attributes
        boolean sortAsc,
            StringBuilder query = new StringBuilder();
        query.append(" FROM ").append(tableFullName);
        String asteriskString = getDataSource().getSQLDialect().getAllAttributesAlias();
                        keyValueToSet = keyValue;
        }
            for (int i = 0; i < attributes.size(); i++) {
    private static final Log log = Log.getLog(JDBCTable.class);
    }
        return new DictionaryAccessor(monitor, keyColumn, restColumns, sortAsc, sortByDesc);
            SQLUtils.appendQueryConditions(getDataSource(), query, null, dataFilter);
        @NotNull

        @Nullable String searchText,
                }
    }
        @NotNull
    }
            dbStat.setStatementSource(source);
                for (var k : restAttrsInfo) {
    }
            return query;
import org.jkiss.dbeaver.model.impl.data.ExecuteBatchImpl;
            StringBuilder query = prepareQueryString(filter);
        ) throws DBException {
    ////////////////////////////////////////////////////////////////////
        List<DBDValueHandler> keyValueHandler = keyColumns.stream()
            int paramPos = 0;
 * distributed under the License is distributed on an "AS IS" BASIS,
            constraint.setValue(value);
            appendSortingClause(query, false);
        String descColumns = DBVUtils.getDictionaryDescriptionColumns(monitor, keyColumn);


import org.jkiss.dbeaver.model.sql.SQLUtils;
                query.append("(");
import org.jkiss.dbeaver.model.data.order.OrderingStrategy;
    {
        try {
            }
                    }
    throws DBCException
            if (!restAttrsInfo.isEmpty()) {
                        for (DBDAttributeValue precAttrValue : precAttribute) {
                        } else {
                query.append(descColumns);
        if (!isTruncateSupported()) {
            caseInsensitiveSearch,
                        dbResult,
        private final boolean sortByDesc;
            DBDAttributeConstraint constraint = new DBDAttributeConstraint(keyColumn, constraints.size());
                    if (keyValue instanceof Integer) {
            return session.getProgressMonitor();
                        continue;
            query.append(" WHERE ");
        } else {

            }
        StringBuilder query = new StringBuilder();
                    hasCondition = true;
                OrderingUtils.addOrderingOnServerSide(
    protected boolean isTruncateSupported() {
            sortAsc,
import org.jkiss.dbeaver.model.impl.struct.AbstractTable;
            if (tableAlias != null) {
                }

        if (keyColumn.getParentObject() != this) {


            return paramPos;
    ////////////////////////////////////////////////////////////////////
                pseudoAttribute = ((DBDAttributeBindingMeta) attribute).getPseudoAttribute();
            rowIdAttribute = null;
                dbStat.setStatementSource(source);
        } else {
            if (keyValue != null) {
            @NotNull StringBuilder query,
            ? dialect.getCaseInsensitiveExpressionFormatter(DBCLogicalOperator.LIKE)
        if (rowIdAttribute != null && tableAlias == null) {


            query.append(DBUtils.getQuotedIdentifier(keyColumn));
        if (pseudoAttribute != null) {


                    // Ignore it

                    DBSAttributeBase attribute = attributes[k];

        query.append("SELECT ").append(DBUtils.getQuotedIdentifier(keyColumn, DBPAttributeReferencePurpose.DATA_SELECTION));

import org.jkiss.code.NotNull;
            @NotNull Object pattern, boolean caseInsensitive, boolean byDesc,
                } else {
                        query.append(identifier).append(" = ?");
    ) throws DBCException {
                    query.append(descColumns);
            }
        }
        StringBuilder query = new StringBuilder(100);
                dbResult.close();
    ////////////////////////////////////////////////////////////////////
                    for (int i = 0; i < keyAttributes.length; i++) {
            try {
        return true;
    public DBCStatistics readData(
                        }
            if (i > 0) query.append(",");
        StringBuilder query = new StringBuilder();
            this.keyValueHandler = DBUtils.findValueHandler(keyColumn.getDataSource(), keyColumn);
                bindPattern(dbStat, pattern, byDesc, paramPos);
                    }
    @NotNull
            }
                    query.append(DBUtils.getQuotedIdentifier(getDataSource(), pkColumn.getAttribute().getName())).append(" = ?");
    private static final String DEFAULT_TABLE_ALIAS = "x";
                }
                    if (searchInKeys && keyColumn.getDataKind() == DBPDataKind.STRING) {
        };

                    query.append(DBUtils.getQuotedIdentifier(keyAttr)).append("=?");
}
                    return DBVUtils.readDictionaryRows(
    }
        return "SET ";
                if (keyAttributes.length > 0) {
        statistics.setQueryText(sqlQuery);
                            Collections.singletonList(keyColumn),
                        query.append(((DBDValueBinder) valueHandler).makeQueryBind(attribute, attributeValues[i]));
                }
                // Sort by description
            throw new DBCException("Can't generate query conditions", e, session.getExecutionContext());
    protected void appendExtraSelectParameters(@NotNull StringBuilder query) {
    @NotNull
    @NotNull
                }
                List<AttrInfo<DBDAttributeValue>> restKeysInfo = new ArrayList<>();
        }
    /**
            }
        }
        String asteriskString = getDataSource().getSQLDialect().getDefaultGroupAttribute();
        if (isTruncateSupported()) {
                    keyConstraint.setOperator(DBCLogicalOperator.GREATER_EQUALS);

        try (JDBCSession session = DBUtils.openUtilSession(monitor, this, "Load attribute value enumeration")) {
                query.append(", ").append(descColumns);
                searchInKeys = false;


                        keyValue = allowNegative || floatValue > gapSize ? floatValue - gapSize : 0.0f;
                dbStat.executeStatement();
                        a.handler.bindValueObject(session, dbStat, a.attr, paramPos++, "%" + pattern + "%");
                            }
        @Nullable List<DBDAttributeValue> restColumns,
    @Override
                return readValues(dbStat);
            if (!sortAsc) {
        @NotNull final DBSAttributeBase[] keyAttributes,

                query.append(" WHERE ");
    protected String getTableName() {
            constraint.setOperator(isPreceeding ^ sortAsc? DBCLogicalOperator.GREATER_EQUALS : DBCLogicalOperator.LESS);
        } catch (DBException e) {
                    tableAlias = DEFAULT_TABLE_ALIAS;
                for (int k = 0; k < handlers.length; k++) {
                for (var a : descAttributesInfo) {

        public final T attr;
                    if (caseInsensitiveSearch && caseInsensitiveFormatter != null) {
                }
                        query.append(caseInsensitiveFormatter.format(identifier, "?"));
            }
        // Add desc columns conditions
        return new ExecuteBatchImpl(attributes, keysReceiver, false) {
            searchText,

        return readKeyEnumeration(
        }
                    } else if (keyValue instanceof Double) {
                if (i > 0) query.append(" OR ");
        private final DBSEntityAttribute keyColumn;
            // For multi-column keys use series of OR
    {
                    if (j > 0) query.append(" AND ");
import org.jkiss.dbeaver.model.data.order.OrderingUtils;
        @NotNull List<Object[]> keyValues,
        @NotNull
     * @param keyColumn             enumeration column.
            for (int i = 0; i < preceedingKeys.size(); i++) {
                return readValues(dbStat);
    throws DBException
            String criteria = pseudoAttribute.translateExpression(tableAlias);
            appendByPatternCondition(query, filter, pattern, caseInsensitive, byDesc);
                );
                if (keyAttributes.length > 0) {

            }
                    }
            this.descAttributes = descColumns == null ? null : DBVEntity.getDescriptionColumns(monitor, JDBCTable.this, descColumns);


                    Object keyValueToSet;

                session,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        long maxRows,
                if (i > 0) {
            if (keyValue != null) {
            DBPPreferenceStore prefs = session.getDataSource().getContainer().getPreferenceStore();
                        constraint.setOperator(DBCLogicalOperator.EQUALS);
     * @param offset                enumeration values offset in result set
                ArrayUtils.concatArrays(updateAttributes, keyAttributes),
                }
                }
                        while (dbResult.nextRow()) {
                query.append(" AND (");
        boolean searchInKeys = keyValue != null;

            log.warn(e);
            if (byDesc && pattern instanceof CharSequence) {
 * JDBC abstract table implementation
                if (tableAlias != null) {
            try (DBCStatement dbStat = session.prepareStatement(DBCStatementType.QUERY, query.toString(), false, false, false)) {
            return new ExecuteBatchWithMultipleInsert(attributes, keysReceiver, true, session, source, JDBCTable.this);
        if (searchInKeys || searchInDesc) {
            if (sortByValue) {
                    }
                                // Fetch not more than max rows
                    query.append(tableAlias).append("."); //$NON-NLS-1$
                    query.append(DBUtils.getQuotedIdentifier(keyAttr));
    ) throws DBException {

            keyPattern,
    }
    {
            tableAlias = SQLUtils.generateEntityAlias(this, s -> sqlDialect.getKeywordType(s) != null);
            return Collections.emptyList();
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    // Copy constructor
                for (int j = 0; j < keyColumns.size(); j++) {
                return dbStat;
            }
        @Nullable DBDPseudoAttribute rowIdAttribute,
            StringBuilder query = prepareQueryString(filter);
                SQLDialect dialect = session.getDataSource().getSQLDialect();

    // Truncate
            }
    @Override
                        DBDDataReceiver.startFetchWorkflow(dataReceiver, session, dbResult, firstRow, maxRows);
    public String generateTableUpdateSet() {
            }
                    for (int i = 0; i < keyValue.length; i++) {
                    Object result = dbResult.getAttributeValue(0);
                    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        super(container);
        readRequiredMeta(session.getProgressMonitor());
import org.jkiss.dbeaver.model.sql.SQLQueryGeneratorUpdate;
            @NotNull DBSEntityAttribute keyColumn,
                        // Skip NULL criteria binding
                            dataReceiver.fetchRow(session, dbResult);

        if (keyValue != null) {
                    if (tableAlias != null) {
        DBDPseudoAttribute rowIdAttribute = (flags & FLAG_READ_PSEUDO) != 0 ?
            try (DBCStatement dbStat = session.prepareStatement(DBCStatementType.QUERY, query.toString(), false, false, false)) {
        if (descColumns != null) {
            }
        public final DBDValueHandler handler;

                boolean hasKey = false;
                    keyConstraint.setValue(pattern);

                }
        boolean omitNonDescriptive) throws DBException
            constraint.setValue(keyValue);
        if (tableAlias != null) {
    public List<DBDLabelValuePair> getDictionaryValues(
            }
            throw new IllegalArgumentException("Bad key column argument");
            StringBuilder query = prepareQueryString(filter);
    private List<DBDLabelValuePair> readKeyEnumeration(
            DBDDataFilter patternFilter = prepareByPatternCondition(pattern, caseInsensitive, byDesc);
                if (tableAlias != null) {

            boolean sortByDesc
                    }
            source,
                } else {
package org.jkiss.dbeaver.model.impl.jdbc.struct;
import java.math.BigDecimal;
                query.append("(").append(descColumns).append(") LIKE ").append("?");
 * Copyright (C) 2010-2025 DBeaver Corp and others
            } else if (pattern instanceof CharSequence) {
                }
        @NotNull final DBCExecutionSource source
                        if (offset == 0) {
                    } else if (keyValue instanceof BigInteger biValue) {
                if (restAttrs != null) {
     */
                query.append(" AND ");

            long startTime = System.currentTimeMillis();
                    if (valueHandler instanceof DBDValueBinder) {
        @NotNull DBRProgressMonitor monitor,
        monitor.subTask(ModelMessages.model_jdbc_fetch_table_row_count);
                    }
        try {
    {
        }
        ) throws DBException {
        boolean hasCond = false;
        query.append(" FROM ").append(DBUtils.getObjectFullName(this, DBPEvaluationContext.DML)).append(" WHERE ");

        this.persisted = persisted;


        }
                    for (DBDAttributeValue[] precAttribute : preceedingKeys) {
        public DictionaryAccessor(
        if (searchInDesc) {
 *
                            final DBDValueHandler valueHandler = DBUtils.findValueHandler(session, descAttr);
        try (DBCStatement dbStat = DBUtils.makeStatement(
        }
                    final String identifier = DBUtils.getQuotedIdentifier(descAttr);

            } else {
                int paramPos = bindAttributes(dbStat);
            boolean isPreceeding,
                        DBDAttributeConstraint constraint = new DBDAttributeConstraint(key.getAttribute(), constraints.size());
        int fetchSize
            }
            this.descColumns = DBVUtils.getDictionaryDescriptionColumns(monitor, keyColumn);
            @NotNull Object pattern,
                    try (DBCResultSet dbResult = dbStat.openResultSet()) {
            }

            query.append("(");
            query.append(")");
            firstRow,
                String tableName = DBUtils.getEntityScriptName(JDBCTable.this, options);
import org.jkiss.dbeaver.model.struct.*;
                            fetchProgress.monitorRowFetch();
                        DBFetchProgress fetchProgress = new DBFetchProgress(session.getProgressMonitor());
    public String getName()
        try (DBCStatement dbStat = session.prepareStatement(
    }
    /**
            if (!dbStat.executeStatement()) {
            }
        {
            if (keyConstraint.getValue() != null) {
                            session,
        }
        @Nullable DBCExecutionSource source,
                        restKeysInfo.add(new AttrInfo<>(key, DBUtils.findValueHandler(session, key.getAttribute())));
            for (DBDAttributeValue[] pk : preceedingKeys) {
            @Override
        private final DBDDataFilter filter;
                    query.append(identifier).append(" = ?");
import java.util.*;
    ////////////////////////////////////////////////////////////////////
                    }
                DBExecUtils.setStatementFetchSize(dbStat, firstRow, maxRows, fetchSize);
                }
                bindAttributes(dbStat);
        @Override
            }
            monitor.subTask("Truncate data");
                        keyValue = allowNegative || bdValue.longValue() > gapSize ? bdValue.subtract(new BigDecimal(gapSize)) : new BigDecimal(0);
    // Count
                        keyValue = allowNegative || biValue.longValue() > gapSize ? biValue.subtract(BigInteger.valueOf(gapSize)) : new BigInteger("0");
        super(container, source);
            statistics.setExecuteTime(System.currentTimeMillis() - startTime);
 * Unless required by applicable law or agreed to in writing, software
                    query.append(" DESC");
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
                    handlers[k].bindValueObject(statement.getSession(), statement, attribute, paramIndex++, attributeValues[k]);
                    int gapSize;
                bindPattern(dbStat, pattern, byDesc, paramPos);
            }
        private void appendByPatternCondition(
                query.append(generateTableUpdateBegin(tableName));
            this.session.close();
            return new String[] {FEATURE_DATA_COUNT, FEATURE_DATA_FILTER, FEATURE_DATA_SEARCH, FEATURE_DATA_INSERT, FEATURE_DATA_UPDATE, FEATURE_DATA_DELETE, FEATURE_DATA_TRUNCATE};
        }
                    k.handler.bindValueObject(session, dbStat, k.attr.getAttribute(), paramPos++, k.attr.getValue());
                        descConstraint.setValue("%" + pattern + "%");
            DBDDataFilter filter = new DBDDataFilter(this.filter);
            sqlQuery,
                for (int i = 0; i < updateAttributes.length; i++) {
    {
                    tableAlias = DEFAULT_TABLE_ALIAS;
        @Override
            if (strategy == OrderingStrategy.SERVER_SIDE) {
                    if (result == null) {

                dbStat.setStatementSource(source);
     * @throws DBCException on error
                        Collections.singletonList(keyValueHandler),
                    try (DBCResultSet dbResult = dbStat.openResultSet()) {
    public ExecuteBatch updateData(
    @NotNull


        boolean hasLimits = firstRow >= 0 && maxRows > 0;
                // Add alias for value column to avoid ambiguity
        boolean multiRowInsertSupported = getDataSource().getSQLDialect().getDefaultMultiValueInsertMode() == SQLDialect.MultiValueInsertMode.GROUP_ROWS;
        }


import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;
    protected JDBCTable(CONTAINER container, boolean persisted)
                .map(a -> new AttrInfo<>(a, DBUtils.findValueHandler(session, a))).collect(Collectors.toList());
    @NotNull
        for (int i = 0; i < keyColumns.size(); i++) {
        }
            }

import org.jkiss.dbeaver.model.sql.SQLDialect;
        }
            @NotNull Object value,
            }
                        constraints.add(constraint);
    /**
        SQLUtils.appendQueryOrder(dataSource, query, tableAlias, dataFilter);
        }

                    if (((String) keyValue).isEmpty() || !Character.isDigit(((String)keyValue).charAt(0)) ) {
            monitor,
            List<DBDAttributeConstraint> constraints = filter.getConstraints();
        private DBDDataFilter prepareByPatternCondition(@NotNull Object pattern, boolean caseInsensitive, boolean byDesc) {
            return insertData(
                        false);
            }
            false, false, false))
            } else if (keyValue instanceof CharSequence) {
                    monitor,
                keyValueHandler.bindValueObject(session, dbStat, keyColumn, paramPos++, value);
            }
        }
    // Dictionary
    }
            if (sortByValue) {
                    DBSEntityAttribute keyAttr = keyColumns.get(j);
                    if (a.attr.getDataKind() == DBPDataKind.STRING) {
                    dbStat,
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
    extends AbstractTable<DATASOURCE, CONTAINER>
                keyValueHandler.bindValueObject(session, dbStat, keyColumn, paramPos, value);
                query.append(")");
            } else if (keyColumn.getDataKind() == DBPDataKind.NUMERIC) {
            if (keyColumn.getDataKind() == DBPDataKind.STRING) {
        private void bindPattern(@NotNull DBCStatement dbStat, @NotNull Object pattern, boolean byDesc, int bindAt) throws DBCException {
        @NotNull DBCSession session,
        }

            log.warn("Can't query ROWID - table alias not supported");
            }
        if (preceedingKeys != null && !preceedingKeys.isEmpty()) {
            }
        monitor.subTask(ModelMessages.model_jdbc_fetch_table_data);
     * Note: if column value is NULL then it will be skipped (to let default value to be applied)
            }

        }
    public String generateTableUpdateBegin(String tableName) {
                        keyValue = allowNegative || longValue > gapSize ? longValue - gapSize : (long)0;
        query.append(" FROM ").append(DBUtils.getObjectFullName(this, DBPEvaluationContext.DML));
        }
                    }
    @Override

                }
        }
            }
                query.append(" AS");

                    } else if (keyValue instanceof BigDecimal bdValue) {
            }
                    session,
        readRequiredMeta(session.getProgressMonitor());
        if (keyColumns.isEmpty()) {
                StringBuilder query = new StringBuilder();
    public String generateTableDeleteFrom(String tableName) {
    throws DBCException
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
     * @param searchText
                keyValueHandler.bindValueObject(session, dbStat, keyColumn, paramPos, keyValue);
        try (JDBCSession session = DBUtils.openUtilSession(monitor, this, "Load dictionary values")) {
import org.jkiss.dbeaver.model.meta.Property;
            try (DBCStatement dbStat = DBUtils.makeStatement(null, session, DBCStatementType.QUERY, query.toString(), offset, maxResults)) {
            // handle custom expression for description assuming it returns string
                    query.append(" OR ");
        return true;
                    null, // It is ok to pass null here because JDBCStringValueHandler doesn't use attr type
            }
                        DBDAttributeConstraint descConstraint = new DBDAttributeConstraint(a.attr, constraints.size());
                    if (maxResults == 1) {
    }
            filter.setAnyConstraint(true);
    }
                searchInDesc = false;
    public boolean isPersisted()

                } else if (keyValue instanceof String) {
            OrderingStrategy strategy = OrderingStrategy.get(prefs);
            @NotNull
            if (CommonUtils.isNotEmpty(descColumns) && (descAttributes == null || descAttributes.isEmpty())) {
            return isKeyComparable;
        @NotNull DBCSession session,
        }
                    keyValueHandler.bindValueObject(session, dbStat, keyColumn, paramPos++, keyValueToSet);
            @Override
                        hasKey = true;
                                descAttr.getDataKind() == DBPDataKind.STRING ? "%" + searchText + "%" : keyValue);
                        if (hasKey) query.append(" AND "); //$NON-NLS-1$
        query.append("SELECT COUNT(").append(asteriskString).append(") FROM "); //$NON-NLS-1$
                        continue;
                }
        int offset,
        ) throws DBException {
                        return 0;
                }
                String updateSet = generateTableUpdateSet();
            this.descAttributesInfo = descAttributes == null ? Collections.emptyList() : descAttributes.stream()
import org.jkiss.dbeaver.model.sql.SQLExpressionFormatter;
        if (CommonUtils.toBoolean(options.get(DBSDataManipulator.OPTION_USE_MULTI_INSERT)) && multiRowInsertSupported) {

        // Leading keys
                        constraint.setValue(key.getValue());
                        searchInKeys = false;
        this.persisted = persisted;
        if (keyValue != null) {
        boolean searchInDesc = searchText != null && descAttributes != null;
                if (searchInDesc) {
                query.append(tableAlias).append(".");
                    return Collections.emptyList();
            long offset,
import java.util.stream.Collectors;
            if (tableAlias != null) {
            query.append(DBUtils.getQuotedIdentifier(keyColumns.get(0))).append(" IN (");
                query.append(")");
            query.append(", ").append(descColumns);

            query.append("=").append(dialect.getTypeCastClause(attribute, "?", true)); //$NON-NLS-1$
        if (searchInDesc) {

    public String[] getSupportedFeatures()
        }
        @NotNull DBRProgressMonitor monitor,
                getTruncateTableQuery(),
            protected DBCStatement prepareStatement(@NotNull DBCSession session, DBDValueHandler[] handlers, Object[] attributeValues, Map<String, Object> options) throws DBCException {
                    "%" + pattern + "%");
                if (preceedingKeys != null && !preceedingKeys.isEmpty()) {
import org.jkiss.dbeaver.model.data.order.OrderingPolicy;
            constraints.add(constraint);
            long offset, long maxResults
                    for (int i = 0; i < keyAttributes.length; i++) {
                    } else if (result instanceof Number) {

    @NotNull
    // Select
    public ExecuteBatch insertData(@NotNull DBCSession session, @NotNull final DBSAttributeBase[] attributes, @Nullable DBDDataReceiver keysReceiver, @NotNull final DBCExecutionSource source, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;

            constraints.add(constraint);
        @NotNull DBPDataSource dataSource
    // Insert
                query.append(" dbvrvalue");
     * @param monitor               execution context
        @NotNull
            sortByValue,
                }
                        int intValue = (Integer) keyValue;
        @Override
    @Override
                }
                SQLDialect dialect = session.getDataSource().getSQLDialect();
                    }
     * Inserts data row.
            }
                source,
                for (Object[] keyValue : keyValues) {
                        return ((Number) result).longValue();
            }
            query.append(criteria);
                }
            long maxResults
            return new String[] {FEATURE_DATA_COUNT, FEATURE_DATA_FILTER, FEATURE_DATA_SEARCH, FEATURE_DATA_INSERT, FEATURE_DATA_UPDATE, FEATURE_DATA_DELETE};
        }
                return dbStat;
                    hasStringAttrs = true;
    @NotNull
        }
            // handle custom expression for decription assuming it returns string
        public AttrInfo(T attr, DBDValueHandler handler) {
            }
        private final Collection<DBSEntityAttribute> descAttributes;
                }

        }
        if (dataFilter != null && !dataFilter.hasOrdering()) {
                    } else if (keyValue instanceof Short) {
            try (ExecuteBatch batch = deleteData(session, new DBSAttributeBase[0], source)) {
        @Nullable List<DBDAttributeValue[]> preceedingKeys,

                keyValueHandler.bindValueObject(session, dbStat, keyColumn, paramPos++, pattern);
                dbStat.setStatementSource(source);
                    if (caseInsensitiveSearch && caseInsensitiveFormatter != null) {
            DBCResultSet dbResult = dbStat.openResultSet();
                int paramPos = 0;
                query.append(" as ").append(rowIdAttribute.getAlias());
        @Override
                return readValues(dbStat);
                            gapSize = offset >= 0 ? -1 : 1;
    // Delete
                        Object cellValue = keyValue[i];
        } catch (DBException e) {
                }
                int paramPos = bindAttributes(dbStat);
            List<? extends DBSEntityAttribute> attributes;
                // Execute
            }
     * If ALL columns are null then explicit NULL values will be used for all of them (to let INSERT to execute - it won't work with empty column list)
            appendSortingClause(query, isPreceeding);

                    return 0;
                    query.append(" dbvrvalue");
            if (byDesc && pattern instanceof CharSequence) {
            return statistics;
    }
        }
    @NotNull
                    } else {
        // Preceeding keys
        }
    @NotNull

                }
            }
    }
                } else {
                    // Sort by description
            this.attr = attr;
            }
                        keyValue = allowNegative || doubleValue > gapSize ? doubleValue - gapSize : 0.0;
        int offset)
                    }
                        boolean ilikeUsable = ArrayUtils.contains(valueHandler.getSupportedOperators(a.attr), DBCLogicalOperator.ILIKE);
    }
        }
                    }
            @NotNull Object pattern,
                    //keyPattern = Double.parseDouble((String) keyPattern);
        }
            query.append(" ORDER BY ");
    @Override
            boolean executeResult = dbStat.executeStatement();
            protected void bindStatement(@NotNull DBDValueHandler[] handlers, @NotNull DBCStatement statement, Object[] attributeValues) throws DBCException {

    private boolean useUpsert(@NotNull DBCSession session) {
            long maxResults
    {
                return Collections.emptyList();
            offset
            } catch (Exception e) {
                }
            return filter;
                    } else {
            if (!hasStringAttrs) {
                    handlers[k].bindValueObject(statement.getSession(), statement, attribute, paramIndex++, attributeValues[k]);
                    query.append(", "); //$NON-NLS-1$
    }
    }
