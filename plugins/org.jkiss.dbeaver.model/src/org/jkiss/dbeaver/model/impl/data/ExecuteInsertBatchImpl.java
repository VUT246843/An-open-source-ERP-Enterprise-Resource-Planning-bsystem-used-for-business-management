    protected void bindStatement(@NotNull DBDValueHandler[] handlers, @NotNull DBCStatement statement, Object[] attributeValues) throws DBCException {
 * See the License for the specific language governing permissions and

            queryForStatement.toString(),
            skipBindValues ? DBCStatementType.SCRIPT : DBCStatementType.QUERY,
            usedAttributes.add(i);
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
            }
        for (int i = 0; i < attributes.length; i++) {

        return dbStat;
        if (trailingClause != null) {
    @Override

        boolean skipBindValues = CommonUtils.toBoolean(options.get(DBSDataManipulator.OPTION_SKIP_BIND_VALUES));
     *
            query.append(SQLConstants.KEYWORD_UPSERT).append(" INTO");
    @Override
                break;
 */
    /**
            query.append(method.getOpeningClause(table, session.getProgressMonitor()));
        this.source = source;
        DBSAttributeBase[] attributes,
            if (session.getProgressMonitor().isCanceled()) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
                continue;
import org.jkiss.dbeaver.model.DBUtils;
    private DBCSession session;
        DBPDataSource dataSource = session.getDataSource();
 * distributed under the License is distributed on an "AS IS" BASIS,
                    rowValuesPart.add(((DBDValueBinder) valueHandler).makeQueryBind(attribute, attributeValues[k]));
        this.session = session;
    private boolean useUpsert;

        return paramIndex;
import java.util.StringJoiner;
        }
import org.jkiss.utils.CommonUtils;
 *
            DBSAttributeBase attribute = attributes[i];
 * Unless required by applicable law or agreed to in writing, software
        super(attributes, keysReceiver, reuseStatement);

 * DBeaver - Universal Database Manager
        DBSTable table,
import org.jkiss.dbeaver.model.struct.DBSDataManipulator;
    private boolean allColumnsDefault;
/*
        Assert.isLegal(attributes.length == handlers.length);
        @NotNull DBCSession session,
                    rowValuesPart.add("DEFAULT");
import org.jkiss.dbeaver.model.struct.DBStructUtils;
    }
    private final DBCExecutionSource source;
                continue;
            return false;
 * You may obtain a copy of the License at
        StringBuilder queryForStatement = prepareQueryForStatement(session, handlers, attributeValues, attributes, table,false, options);
    }
        DBSAttributeBase attribute = attributes[paramIndex];
        for (int i = 0; i < attributeValues.length / attributes.length; i++) {
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
        allNulls = true;
import org.jkiss.dbeaver.model.data.*;
            if (DBUtils.isPseudoAttribute(attribute) || (!useMultiRowInsert && (!allNulls && DBUtils.isNullValue(attributeValues[i])))) {
            }
                int k = i * attributes.length + j;
        }
        paramIndex++;
                break;
import org.jkiss.dbeaver.model.impl.sql.BaseInsertMethod;
    private DBSTable table;
        int paramIndex = 0;
        
        Object[] attributeValues,
    }
        query.append(" ").append(tableName).append(" ("); //$NON-NLS-1$ //$NON-NLS-2$

     * Constructs new batch

            String attributeName = DBStructUtils.getAttributeName(attribute);
        if (method == null) {
        if (allColumnsDefault) {
            if (!DBUtils.isNullValue(attributeValues[i])) {
    private boolean attributeHasDefaultValue(@NotNull DBSAttributeBase attribute) {
        for (int i = 0; i < attributes.length; i++) {
                } else if (allNulls && attributeHasDefaultValue(attribute)) {
        }
                DBDValueHandler valueHandler = handlers[j];
        boolean hasKey = false;
            false,
                    rowValuesPart.add("?");
        String trailingClause = method.getTrailingClause(table, session.getProgressMonitor(), attributes);
import java.util.Map;
            hasKey = true;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        }
import org.jkiss.dbeaver.model.sql.SQLUtils;

            valuesPart.add(rowValuesPart.toString());
        } else {
            allColumnsDefault = true;
            return entityAttribute != null && (CommonUtils.isNotEmpty(entityAttribute.getDefaultValue()));

        this.table = table;
        boolean useMultiRowInsert,
            }
    protected DBCStatement prepareStatement(@NotNull DBCSession session, DBDValueHandler[] handlers, Object[] attributeValues, Map<String, Object> options) throws DBCException {

     * @param keysReceiver   keys receiver (or null)
     * @param attributes     array of attributes used in batch
        List<Integer> usedAttributes = new ArrayList<Integer>();
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            query.setLength(0);
        }
        Map<String, Object> options) throws DBCException {
        dbStat.setStatementSource(source);
            for (int j : usedAttributesArr) {
    private boolean allNulls;
        }
import org.jkiss.dbeaver.model.exec.*;
            }
                DBSAttributeBase attribute = attributes[j];

        allColumnsDefault = false;
        DBCStatement dbStat = session.prepareStatement(
        DBDInsertReplaceMethod method = (DBDInsertReplaceMethod) options.get(DBSDataManipulator.OPTION_INSERT_REPLACE_METHOD);
        return query;
        query.append(")\n\tVALUES "); //$NON-NLS-1$
        for (int k = 0; k < handlers.length; k++) {
    StringBuilder prepareQueryForStatement(
package org.jkiss.dbeaver.model.impl.data;
        Assert.isLegal(useMultiRowInsert || attributes.length == attributeValues.length);
import org.jkiss.code.Nullable;
        }
                } else {
import org.jkiss.dbeaver.model.DBPDataSource;
    protected int getNextUsedParamIndex(Object[] attributeValues, int paramIndex) {
        DBDValueHandler[] handlers,
        String tableName = DBUtils.getEntityScriptName(table, options);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @param reuseStatement true if engine should reuse single prepared statement for each execution.
        }
 *
            DBSEntityAttribute entityAttribute = ((DBDAttributeBinding) attribute).getEntityAttribute();
        if (attribute instanceof DBDAttributeBinding) {
        }
            StringJoiner rowValuesPart = new StringJoiner(",", "(", ")");
            if (DBUtils.isPseudoAttribute(attribute) || (!allNulls && DBUtils.isNullValue(attributeValues[k]))) {

        StringJoiner valuesPart = new StringJoiner(",");
public class ExecuteInsertBatchImpl extends ExecuteBatchImpl {
import java.util.List;
        if (DBUtils.isPseudoAttribute(attribute) || DBUtils.isHiddenObject(attribute)) {
            }
import org.jkiss.dbeaver.model.sql.SQLConstants;
                continue;
            if (hasKey) query.append(","); //$NON-NLS-1$
        }
 * limitations under the License.
            query.append(attributeName);
            method = new BaseInsertMethod();
            keysReceiver != null);
            return query;
                    rowValuesPart.add(SQLUtils.convertValueToSQL(session.getDataSource(), attribute, valueHandler, attributeValues[k], DBDDisplayFormat.NATIVE, false));
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
        StringBuilder query = new StringBuilder(200);
    @NotNull
            false,
        this.useUpsert = useUpsert;
import org.eclipse.core.runtime.Assert;
        }
        
    public ExecuteInsertBatchImpl(@NotNull DBSAttributeBase[] attributes, @Nullable DBDDataReceiver keysReceiver, boolean reuseStatement, @NotNull DBCSession session, @NotNull final DBCExecutionSource source, @NotNull DBSTable table, boolean useUpsert) {

            // There is nothing to bind in this statement
    }

        }
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        while (DBUtils.isPseudoAttribute(attribute) || (!allNulls && DBUtils.isNullValue(attributeValues[paramIndex]))) {

            if (allNulls && attributeHasDefaultValue(attribute)) {
        // Make query
                if (valueHandler instanceof DBDValueBinder) {
            return;
            paramIndex++;
            handlers[k].bindValueObject(statement.getSession(), statement, attribute, paramIndex++, attributeValues[k]);
        return false;
        
     */
import java.util.ArrayList;
        int usedAttributesArr[] = usedAttributes.stream().mapToInt(Integer::intValue).toArray();
        boolean skipBindValues = CommonUtils.toBoolean(options.get(DBSDataManipulator.OPTION_SKIP_BIND_VALUES));
        query.append(valuesPart);
        if (allNulls && !useMultiRowInsert && method instanceof BaseInsertMethod && !useUpsert && dataSource.getSQLDialect().supportsInsertAllDefaultValuesStatement()) {

            query.append(trailingClause);
            query.append("INSERT INTO ").append(tableName).append(" DEFAULT VALUES");

    }
    }
                allNulls = false;
            DBSAttributeBase attribute = attributes[k];

        // Execute. USe plain statement if binding was disabled
        if (useUpsert) {

                } else if (skipBindValues) {
