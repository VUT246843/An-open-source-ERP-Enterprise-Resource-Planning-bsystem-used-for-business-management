        @NotNull
import org.jkiss.dbeaver.Log;
        public String prepareSqlString(@Nullable String subqueryAlias) {
        @NotNull
            }
     *
    @Override
        @Override
        @Override
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
        @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
        public String getDisplayName() {
    }
            this.dataSource = dataSource;
                // treat any invalid expression as identifier

            return Objects.hash(this.expressionString);
}
 * Unless required by applicable law or agreed to in writing, software

        public boolean equals(Object o) {
    }
        public int hashCode() {
    public static class BoundAttribute extends SQLGroupingAttribute {
                if (!(expression instanceof Column)) {
        }
 * See the License for the specific language governing permissions and
        }
    @NotNull
     */
        public String prepareSqlString(@Nullable String subqueryAlias) {
                return SQLSemanticProcessor.parseExpression(this.expressionString); // return any valid expression as its model
    public abstract Expression prepareExpression();
            return Objects.hashCode(this.displayName);
     * Creates an instance of the grouping attribute provided by the result set attribute binding
        @Override
        @NotNull
 * limitations under the License.
        @Override
        public int hashCode() {
    public static SQLGroupingAttribute makeCustom(@NotNull DBPDataSource dataSource, @NotNull String expressionString) {

public abstract class SQLGroupingAttribute {
        @NotNull

        return new BoundAttribute(attributeBinding);
            return Objects.equals(this.binding, that.binding);
     */
        public String getExpressionString() {

        }
        }
        }

        }
        @Override
                    return this.expressionString; // return valid non-column-ref expression as raw string
        public Expression prepareExpression() {
import net.sf.jsqlparser.schema.Column;

        public BoundAttribute(@NotNull DBDAttributeBinding binding) {
    public abstract String getDisplayName();
        private static String getAttributeBindingName(@NotNull DBDAttributeBinding binding) {
        @NotNull
            return StandardSQLDialectQueryGenerator.INSTANCE.getConstraintAttributeName(
    private static final Log log = Log.getLog(SQLGroupingAttribute.class);
    /**
    public static SQLGroupingAttribute makeBound(@NotNull DBDAttributeBinding attributeBinding) {

 *
    @NotNull
            try {
     * Creates an instance of the grouping attribute describing sql expression or custom column reference
     */

    public abstract DBPDataSource getDataSource();
            } catch (DBException e) {
 */
        @NotNull
        @NotNull
                subqueryAlias != null
        }

                subqueryAlias,

import org.jkiss.dbeaver.model.impl.sql.StandardSQLDialectQueryGenerator;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        }
import net.sf.jsqlparser.expression.Expression;

    /**
        @Override
        }
    /**
                return false;
            }
            return this.expressionString;
 *

    }

    @NotNull
        private final String expressionString;
        @Override
                return new Column(DBUtils.getQuotedIdentifier(this.dataSource, this.expressionString));
        @Override
    /**
        @Override
    @Override
            return this.binding;
            return DBUtils.getQuotedIdentifier(this.dataSource, this.expressionString);
        @Override
            return Objects.equals(this.expressionString, that.expressionString);
            this.binding = binding;
            // treat valid column ref or any invalid expression as identifier
            }
                log.debug("Can't parse expression " + this.expressionString, e);
import org.jkiss.dbeaver.DBException;
                return false;

        return new CustomAttribute(dataSource, expressionString);
        @NotNull

        public String getBindingName() {
        }

            );
                return DBUtils.getQuotedIdentifier(binding.getDataSource(), binding.getMetaAttribute().getLabel());
     * @param expressionString - a column name or an expression string to be used as a grouping key
 * A column or an expression used as a grouping key
            try {
    /**
        @NotNull
        @Override
        }
                log.debug("Can't parse expression " + this.expressionString, e);
     */
     * Returns the data source of the query to apply grouping to

            }

     */
        }

        }
    public static class CustomAttribute extends SQLGroupingAttribute {
        @NotNull
        }
            if (!(o instanceof BoundAttribute that)) {
        }
        private final String displayName;
        @NotNull
     * Generates a query expression string for this grouping attribute

     */
            if (!(o instanceof CustomAttribute that)) {


import org.jkiss.dbeaver.model.DBUtils;
        }

 * You may obtain a copy of the License at
/**
    }
import org.jkiss.dbeaver.model.DBPDataSource;
            } else {
    public abstract boolean equals(Object obj);
import org.jkiss.code.NotNull;

import java.util.Objects;
        @NotNull
        @Override
        public DBPDataSource getDataSource() {

                return binding.getFullyQualifiedName(DBPEvaluationContext.DML);
 *
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                this.getDataSource(),
/*

        public DBPDataSource getDataSource() {
    @NotNull
            this.expressionString = expressionString;
            return binding.getName();
        }
            } catch (DBException e) {
                new DBDAttributeConstraint(this.binding),
        }
                subqueryAlias != null,
        private final DBDAttributeBinding binding;
                Expression expression = SQLSemanticProcessor.parseExpression(this.expressionString);
            return new Column(this.prepareSqlString(null));
 * Licensed under the Apache License, Version 2.0 (the "License");
        public Expression prepareExpression() {
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;

    public abstract String prepareSqlString(@Nullable String subqueryAlias);
 * you may not use this file except in compliance with the License.
        public String getDisplayName() {
        private final DBPDataSource dataSource;

        public DBDAttributeBinding getBinding() {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            if (binding instanceof DBDAttributeBindingMeta && binding.getMetaAttribute() != null) {
    /**
        @NotNull
        public boolean equals(Object o) {
            return this.dataSource;
        public CustomAttribute(@NotNull DBPDataSource dataSource, @NotNull String expressionString) {
            this.displayName = getAttributeBindingName(binding);
 */

import org.jkiss.dbeaver.model.data.DBDAttributeBindingMeta;

package org.jkiss.dbeaver.model.sql;
        @NotNull
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
            return this.expressionString;
    public abstract int hashCode();
            return this.displayName;

 * Copyright (C) 2010-2025 DBeaver Corp and others
            return this.binding.getDataSource();
     * @param dataSource - the data source of the query to apply grouping to
     * Generates query expression tree for this grouping attribute
     * Returns the grouping attribute display name
