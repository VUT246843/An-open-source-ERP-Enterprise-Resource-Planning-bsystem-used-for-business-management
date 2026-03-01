                    continue;
import java.util.regex.Pattern;
                    if (DBUtils.isNullValue(itemValue)) {
import org.jkiss.dbeaver.model.data.*;
                            conString.append(constraint.getEntityAlias()).append('.');
                boolean hasValue = false;
                        if (dataSource.getSQLDialect().useEmptyStringForNulls()) {
                .map(DBDAttributeConstraintBase::getValue)
                }
        @NotNull DBDDataFilter filter,
        @NotNull DBPDataSource dataSource,
        @NotNull DBPDataSource dataSource,
            }
            for (int i = 0; i < count; i++) {
        @Nullable String conditionTable,
                        query.append(" AND ");
import java.lang.reflect.Array;
            if (value instanceof CharSequence) {
        if (filter.isUseDisjunctiveNormalForm() && constraints.size() > 1) {

                query.append(')');
                    }
        DBSAttributeBase cAttr = constraint.getAttribute();
                for (int j = 0; j < constraints.size(); j++) {

    protected StandardSQLDialectQueryGenerator() {
            }
            query.append("\nWHERE "); //$NON-NLS-1$
                        String strValue = getStringValue(dataSource, constraint, inlineCriteria, value);
                }
        @NotNull String sqlQuery,
        @Nullable DBDDataFilter dataFilter
                if (!hasNotNull) {

                } else {
import org.jkiss.dbeaver.model.sql.SQLUtils;
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
        boolean subQuery
        // Attribute name could be an expression. So check if this is a real attribute
        @NotNull DBDDataFilter dataFilter
        }
                if (operator.getArgumentCount() == 0) {
                if (values.get(i).length != count) {
                .toList();
            return conString.toString();
                    throw new DBException("DNF requires all constraints to be IN operator without NOT");
 * See the License for the specific language governing permissions and

        boolean inlineCriteria,
        Object value
                if (i > 0) {
                    query.append(name);
            return DBUtils.getQuotedIdentifier(dataSource, constraint.getAttributeName());
                    // Add parenthesis for the sake of sanity
            }
                            ));
                    if (attr instanceof DBDAttributeBinding attrBinding
    public static String getStringValue(
                }
    ) throws DBException {
    );
                if (!constraints.isEmpty()) {
        }
            .matcher(constraintName)
            SQLUtils.appendOrderString(dataFilter, dataSource, NESTED_QUERY_AlIAS, true, modifiedQuery);
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (!CommonUtils.isEmpty(filter.getOrder())) {
            modifiedQuery.append(" ORDER BY "); //$NON-NLS-1$
        if (dataFilter != null) {
            .getPreferenceStore()
                return '=' + criteria;
                    } else {
    @NotNull
                if (hasNull) {

                    query.append(operator).append('(').append(filter.getWhere()).append(')');
            for (int i = 1; i < values.size(); i++) {
                }
                }
                    }
                    conString.append("IS NULL OR ");
    public String getWrappedFilterQuery(
                    }
            if (co.isOrderDescending()) {
                            orderString = conditionTable + '.' + orderString;
    ) throws DBException {
                        }
                        DBPEvaluationContext.DML,
            int count = values.getFirst().length;
        if (!dataSource.getSQLDialect().supportsOrderByIndex()) {
                            query.append(" IS NULL");
        StringBuilder modifiedQuery = new StringBuilder(sqlQuery.length() + 100);
                return criteria;
            query.append(filter.getOrder());
                        ));
import org.jkiss.utils.CommonUtils;
    @Override
                query
                                    constraint.getAttributeName() :
import org.jkiss.code.NotNull;
    }
                            true, conditionTable, DBPAttributeReferencePurpose.DATA_SELECTION
                    query.append(')');
        modifiedQuery.append("\n) ").append(NESTED_QUERY_AlIAS);
                        // It is a simple column.
        }

                    for (int i = 0; i < operator.getArgumentCount(); i++) {
            } else if (operator.getArgumentCount() < 0) {
        @NotNull DBPDataSource dataSource,
                        binding,
                            query.append(" = ''");
    ) throws DBException {
                    return operator.getExpression();
                binding instanceof DBDAttributeBindingType) {
                            conString.append(" AND");
                    value = new Object[] {value};
            query.append(orderString);
            return true;
            }
        @NotNull DBDAttributeConstraint constraint,
 * You may obtain a copy of the License at
                        orderString = entityAttribute.formatMemberReference(
                        conString.append(operator.getExpression());

                if (dataSource.getSQLDialect().useEmptyStringForNulls()) {
                    if (i > 0) {
                        // Second option for some databases (like Firebird)
                String attrName = getConstraintAttributeName(dataSource, conditionTable, constraint, subQuery, true);
import org.jkiss.dbeaver.model.DBUtils;

                if (constraints.size() > 1) {
        }
        }
        } else {
                }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                    DBSAttributeBase attr = co.getAttribute();
                        } else {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull StringBuilder query,

            }
                    .append(getConstraintCondition(dataSource, constraint, conditionTable, inlineCriteria));
    public void appendQueryConditions(
                    conString.append(" ");
                    return entityAttribute.formatMemberReference(includeContainerName, conditionTable, DBPAttributeReferencePurpose.DATA_SELECTION);
        @NotNull StringBuilder query,

                        ));
        }
        if (constraint.getAttribute() == null) {
    public void appendConditionString(
        @NotNull DBPDataSource dataSource,
                        conString.append(DBUtils.getObjectFullName(
import org.jkiss.dbeaver.Log;
                    String attrName;
                } else {
                    for (int i = 0; i < array.length; i++) {
                    var value = values.get(j)[i];
    @Override
                    conString.append("NULL");
            var names = constraints.stream()

            if (dataFilter.hasOrdering()) {
            SQLUtils.appendConditionString(dataFilter, dataSource, NESTED_QUERY_AlIAS, modifiedQuery, true, true);
        } else if (constraint.getOperator() != null) {
            if (!CommonUtils.isEmpty(filter.getWhere())) {
        @NotNull DBPDataSource dataSource,
    ) {
                query.append('(');
                    // Constraint may consist of several conditions and we don't want to break operator precedence
                    // Most likely it is an expression so we don't want to quote it
            return null;
                binding.getEntityAttribute().getName().equals(binding.getMetaAttribute().getName()) ||
    }
        @NotNull String constraintName
            if (!Character.isLetter(firstChar) && firstChar != '=' && firstChar != '>' && firstChar != '<' && firstChar != '!') {
            // Construct ORDER BY
                if (binding.getMetaAttribute() == null || binding.getEntityAttribute() != null) {
 * limitations under the License.
        boolean hasOrder = false;
            if (DBUtils.isNullValue(value)) {
                || co.getAttribute() instanceof DBDAttributeBindingType) {
            .matches();
                    }
                        }
                query.append(" DESC"); //$NON-NLS-1$
                if (index > 0) {
            } else {
                        conString.append("NOT ");
                if (constraint.getAttribute() != null) {
        return modifiedQuery.toString();
                        && attrBinding.getEntityAttribute() instanceof DBSContextBoundAttribute entityAttribute
                } else {
        // and generate full/quoted name for it.
                        conString.append(dataSource.getSQLDialect().getTypeCastClause(constraint.getAttribute(), "?", true));
                            true, conditionTable, DBPAttributeReferencePurpose.DATA_SELECTION
                        } else if (conditionTable != null) {
                        query.append(" AND ");
                        if (i > 0) {
                }
            }
        }
        boolean includeContainerName
                        hasNotNull = true;
                // Special care for cases when we have no values. Reflects behavior in the else branch
                    log.debug("Can't generate column order: no name and no position found");
    public void appendOrderString(
                        String strValue = getStringValue(dataSource, constraint, inlineCriteria, array[i]);
                }
                        attrName = binding.getMetaAttribute().getLabel();
            appendConditionString(dataFilter, dataSource, tableAlias, query, true);
    ) {
                    if (CommonUtils.isNotEmpty(metaName)) {

                        conString.append(entityAttribute.formatMemberReference(
        @Nullable String tableAlias,
import org.jkiss.dbeaver.model.DBPAttributeReferencePurpose;
        @Nullable String tableAlias,
            var values = constraints.stream()
                    conString.append(operator.getExpression());
                        attrName = binding.getMetaAttribute().getName();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
        if (isForceFilterSubQuery) {
            }
        }
                }
    @NotNull
        } else if (inlineCriteria) {
        @NotNull DBDAttributeConstraint constraint,
 *
                if (canOrderByName(dataSource, co, orderColumn) && !filter.hasNameDuplicates(orderColumn)) {
                    }
    @Override
        "(([a-z_][a-z0-9_]*)|(\\\"([a-z_][a-z0-9_]*)\\\"))(\\.(([a-z_][a-z0-9_]*)|(\\\"([a-z_][a-z0-9_]*)\\\")))*",

                orderString = String.valueOf(orderIndex);
                    ) {
            }
                } else {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        @NotNull DBDDataFilter dataFilter
    ) throws DBException {
        }
            final String operator = filter.isAnyConstraint() ? " OR " : " AND ";  //$NON-NLS-1$ $NON-NLS-2$

    }
                    if (constraint.isReverseOperator()) {
                    if (!isNull && !hasNotNull) {
                    throw new DBException("DNF requires all constraints to have the same number of values");
                    query.append(names.get(i)).append(" IS NULL");
                    }
                }

        }
                    return DBUtils.getQuotedIdentifier(
                .map(constraint -> getConstraintAttributeName(dataSource, conditionTable, constraint, subQuery, true))
        modifiedQuery.append("SELECT * FROM (\n");
                    }
    ) {
    ) {
        } else {
import java.util.List;
                    if (inlineCriteria) {
                    hasValue = true;
                    }
            strValue = dataSource.getSQLDialect().getTypeCastClause(constraint.getAttribute(), "?", true);
                            conString.append(DBUtils.getQuotedIdentifier(
            DBDValueHandler valueHandler = DBUtils.findValueHandler(dataSource, constraint.getAttribute());
                } else {
                strValue = CommonUtils.toString(value);
            modifiedQuery.append(" WHERE ");
                }
            hasOrder = true;
    public String getConstraintAttributeName(
            return DBUtils.getObjectFullName(dataSource, cAttr, DBPEvaluationContext.DML, DBPAttributeReferencePurpose.DATA_SELECTION);
            return true;
    public static final Pattern PATTERN_COLUMN_NAME = Pattern.compile(
                .map(Object[].class::cast)
                        dataSource,
    public void appendQueryOrder(
        @NotNull DBDDataFilter filter,
                        query.append(getStringValue(dataSource, constraints.get(j), inlineCriteria, value));
        }
                    return DBUtils.getObjectFullName(
                    conString.append("=''");
                        dataSource,
                    // We must quote it because aliases/column names may contain spaces
            return getWrappedFilterQuery(dataSource, sqlQuery, dataFilter);
                    conString.append("IS ");
                    query.append(filter.getWhere());
                binding.getMetaAttribute() != null &&
                        subQuery ? constraint.getAttributeLabel() : constraint.getAttributeName()
    ) {
        modifiedQuery.append(sqlQuery);

                }
        } else {
            if (constraint.isReverseOperator()) {
                if (orderIndex == -1) {
                }
            }
                        orderString = co.getFullAttributeName();
            for (int index = 0; index < constraints.size(); index++) {
                                    constraint.getAttributeLabel()
                if (operator.equals(DBCLogicalOperator.EQUALS) && value instanceof Object[] array) {
                    if (DBUtils.isNullValue(value)) {
                        conString.append(",");
    }
public class StandardSQLDialectQueryGenerator implements SQLQueryGenerator {
    protected static boolean canOrderByName(
                }

        @NotNull StringBuilder query
                        );
 */
                    attrName = dataSource.getSQLDialect().getTypeCastClause(constraint.getAttribute(), attrName, true);
        @NotNull String sqlQuery,
    private static final Log log = Log.getLog(StandardSQLDialectQueryGenerator.class);
                strValue = dataSource.getSQLDialect().getQuotedString(value.toString());
        if (cAttr instanceof DBDAttributeBinding binding) {
                    );
    @Override
                }
            if (co.isPlainNameReference() || co.getAttribute() == null || co.getAttribute() instanceof DBDAttributeBindingMeta
            StringBuilder conString = new StringBuilder();
                conString.append("NOT ");
                    ) {

    }
            if (hasOrder) query.append(',');
            for (DBDAttributeConstraint c : constraints) {
 * DBeaver - Universal Database Manager
                    query.append(operator);
        }
        if (dataFilter.hasConditions()) {
                if (binding.getEntityAttribute() instanceof DBSContextBoundAttribute entityAttribute) {
                }
        } else if (cAttr != null) {
        boolean subQuery,
                if (c.getOperator() != DBCLogicalOperator.IN || c.isReverseOperator()) {
                int valueCount = Array.getLength(value);
import org.jkiss.dbeaver.DBException;
    @Nullable
        boolean subQuery,
import org.jkiss.dbeaver.ModelPreferences;
                    .append(' ')
            }
                        }
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
                    String metaName = binding.getMetaAttribute().getName();
            if (binding.getEntityAttribute() != null &&
import org.jkiss.code.Nullable;
        @NotNull DBPDataSource dataSource,
                    DBSAttributeBase attr = constraint.getAttribute();

                    // Special case for multiple values for IN
/*
            .getBoolean(ModelPreferences.SQL_FILTER_FORCE_SUBSELECT);
    }
        @NotNull List<DBDAttributeConstraint> constraints,
                    Object itemValue = Array.get(value, i);
 * Unless required by applicable law or agreed to in writing, software
            }
                final DBDAttributeConstraint constraint = constraints.get(index);
        @Nullable String conditionTable,
                    // Generate series of ORed conditions
                            conString.append(conditionTable).append('.');
        @NotNull DBDAttributeConstraint constraint,
            }
                }
    @Override
                        if (conditionTable != null) {
        String criteria = constraint.getCriteria();
                        query.append(" = ");
                    if (isNull && !hasNull) {
                    var name = names.get(j);
    @Override
            DBCLogicalOperator operator = constraint.getOperator();

                        }
        boolean isForceFilterSubQuery = dataSource.getSQLDialect().supportsSubqueries() && dataSource.getContainer()
                }
import org.jkiss.dbeaver.model.DBPDataSource;
            String orderString = null;
        @NotNull DBDAttributeConstraint constraint,
                conString.append(brackets.getSecond());
    public String getConstraintCondition(
                    final boolean isNull = DBUtils.isNullValue(Array.get(value, i));
        @NotNull DBPDataSource dataSource,

    @Override
            // We have only attribute name
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 *

    public static StandardSQLDialectQueryGenerator INSTANCE = new StandardSQLDialectQueryGenerator();
        }
        @Nullable String conditionTable,

                // Multiple arguments
                    }
                        conString.append(SQLUtils.convertValueToSQL(dataSource, constraint.getAttribute(), itemValue));
                        DBPAttributeReferencePurpose.DATA_SELECTION
                    if (attr instanceof DBDAttributeBinding attrBinding
        return PATTERN_COLUMN_NAME // we should assume columns of composite type like comp.x
        try {
        String strValue;
                    .append(attrName)
                    return "IS NULL";
    ) {
        @Nullable DBRProgressMonitor monitor,
                    }
                    // It is better to use real table column in expressions because aliases may not work
import org.jkiss.dbeaver.model.struct.DBSContextBoundAttribute;
            }
                    } else {
                        conString.append(' ').append(strValue);
        for (DBDAttributeConstraint co : filter.getOrderConstraints()) {

                            conString.append(' ');
        boolean inlineCriteria
    @NotNull
                for (int i = 0; i < valueCount; i++) {
                        conString.append(' ').append(strValue);
        Pattern.CASE_INSENSITIVE
                        if (i > 0) {
                return conString.toString();
                    return DBUtils.getQuotedIdentifier(dataSource, attrName);
                            conString.append(" OR ");
        @Nullable DBDDataFilter dataFilter
                if (constraints.size() > 1) {
                if (!value.getClass().isArray()) {
    }
        @NotNull DBPDataSource dataSource,
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
                String orderColumn = subQuery ? co.getAttributeLabel() : co.getAttributeName();
        // Construct ORDER BY
                    query.append(" OR ");

                    } else {
import org.jkiss.utils.Pair;

        if (!CommonUtils.isEmpty(criteria)) {
                                dataSource,
                for (int i = 0; i < valueCount; i++) {
            if (hasOrder) query.append(',');
        @NotNull DBPDataSource dataSource,
            Object value = constraint.getValue();
            } else {
        } else {
        if (dataFilter != null && dataFilter.hasConditions()) {
    public String getQueryWithAppliedFilters(
            if (count == 0) {
import org.jkiss.dbeaver.model.sql.SQLQueryGenerator;
}
                .toList();
                    }
                }
                }
package org.jkiss.dbeaver.model.impl.sql;
            }
        boolean inlineCriteria,
                Pair<String, String> brackets = dataSource.getSQLDialect().getInClauseParentheses();
            if (operator.getArgumentCount() > 0) {
                boolean hasNull = false, hasNotNull = false;
                query.append("\nORDER BY "); //$NON-NLS-1$
                    }
                    query.append('(');
            final char firstChar = criteria.trim().charAt(0);
                int orderIndex = SQLUtils.getConstraintOrderIndex(filter, co);
                        if (constraint.getEntityAlias() != null) {
            if (orderString == null) {

                conString.append(operator.getExpression());
            strValue = SQLUtils.convertValueToSQL(dataSource, constraint.getAttribute(), valueHandler, value, DBDDisplayFormat.NATIVE, true);
                    }
        } catch (DBException ignored) {
        @Nullable String conditionTable,
                for (int i = 0; i < constraints.size(); i++) {
        DBPDataSource dataSource,
                conString.append(' ').append(brackets.getFirst());
                        continue;
        }
 *
                    );
            }
                                CommonUtils.isEmpty(constraint.getAttributeLabel()) ?
                    if (hasValue) {
                        }
            return SQLSemanticProcessor.injectFiltersToQuery(monitor, dataSource, sqlQuery, dataFilter);
    private static final String NESTED_QUERY_AlIAS = "z_q";
            return getWrappedFilterQuery(dataSource, sqlQuery, dataFilter);
        return strValue;
    }


    }
                appendOrderString(dataFilter, dataSource, tableAlias, false, query);
                    if (j > 0) {

                    } else {
    }
                            dataSource, constraint.getAttribute(), DBPEvaluationContext.DML, DBPAttributeReferencePurpose.DATA_SELECTION
                    // Seems to a reference on a table column.
        @NotNull StringBuilder query,
                // Use position number
                        hasNull = true;
                    }
        if (dataFilter.hasOrdering()) {
                    } else {
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
                        && attrBinding.getEntityAttribute() instanceof DBSContextBoundAttribute entityAttribute
        if (constraint.getAttribute() == null) {
            } else {
 * you may not use this file except in compliance with the License.
