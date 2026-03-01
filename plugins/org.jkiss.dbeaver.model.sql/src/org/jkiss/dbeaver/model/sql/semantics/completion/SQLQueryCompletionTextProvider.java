    @NotNull
    private static final Log log = Log.getLog(SQLQueryCompletionTextProvider.class);
    private final SQLDialect dialect;
        this.dialect = request.getContext().getDataSource().getSQLDialect();
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }

            log.debug("Failed to validate database object completion name ambiguity", e);
    public String visitNamedObject(@NotNull SQLDbNamedObjectCompletionItem namedObject) {
public class SQLQueryCompletionTextProvider implements SQLQueryCompletionItemVisitor<String> {
        return compositeField.memberInfo.name();
            } else {
    private String prepareDefiningEntryName(@NotNull SQLQuerySymbol symbol) {
            : DBUtils.getSelectedObject(request.getContext().getExecutionContext()) instanceof DBSObjectContainer c ? c : null;
    }
                return child != null && !child.equals(object);
            if (columnName.sourceInfo.aliasOrNull != null) {
    }
                }
            this.queryCompletionContext.getExposedContexts().contains(objectContainer);
    @Override
    }
    }
        return this.prepareObjectName(namedObject);

        }
        String name;
        }
            log.error("Failed to obtain procedure parameters info", e);
import org.jkiss.dbeaver.model.sql.SQLDialect;
    private String convertCaseIfNeeded(@NotNull String name) {
    @NotNull
    @NotNull
    @NotNull
            }
                        this.queryCompletionContext.getAliasesInUse().contains(s.toLowerCase()) ||
    @Override

            return text;
        if (this.request.getContext().isUseShortNames() && !forceFullName) {
        if (this.request.getWordDetector().isQuoted(name)) {
        if (columnName.sourceInfo != null && columnName.absolute &&
    }
            if (name.equals(shortName)) { // catalog name is not being included in full name for some reason sometimes
                sb.append(")");
        } else {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    @Override
import org.jkiss.utils.CommonUtils;

                            sb.append(", ");
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbol;
            ? null
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                    tableName.object,
                sb.append(name).append("(");
            } else {
    private final SQLQueryCompletionContext queryCompletionContext;
            if (this.activeContext != null) {
    }

 */
                    if (param.getParameterKind().isInput()) {
            prefix = "";
        } else if (this.request.getContext().isUseFQNames() || forceFullName) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            .collect(Collectors.joining(this.structSeparator));
    @Nullable
    }
 * Unless required by applicable law or agreed to in writing, software
 *
            }
        } catch (DBException e) {
    }

        return specialText.text;
            if (dialect.supportsAliasInSelect()) {
            this.queryCompletionContext.getInspectionResult().expectingColumnReference() &&
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionItem.*;
        @NotNull SQLCompletionRequest request,
                || this.queryCompletionContext.isColumnNameConflicting(columnName.columnInfo.symbol.getName());
        ) {
 *
                for (DBSProcedureParameter param : parameters) {
        try {

    }
    @Override
    ) {

        }
        return this.convertCaseIfNeeded(name);
                prefix = this.prepareDefiningEntryName(columnName.sourceInfo.aliasOrNull) + this.structSeparator;

                        sb.append(":").append(param.getName());
                prefix = this.prepareObjectName(columnName.sourceInfo.tableOrNull) + this.structSeparator;
    @Override
        this.aliasMode = SQLTableAliasInsertMode.fromPreferences(request.getContext().getSyntaxManager().getPreferenceStore());
    public String visitProcedure(@NotNull SQLProcedureCompletionItem procedure) {
                StringBuilder sb = new StringBuilder();
        }
            name = shortName;
                text = name + "()";
            return name;
    private String prepareQualifiedName(@NotNull DBSObject object, DBSObject knownSubroot) {
        return this.prepareDefiningEntryName(subqueryAlias.symbol);
    @NotNull
                    }
            this.dialect.supportsQualifiedColumnNames()
                );
            } else if (columnName.sourceInfo.tableOrNull != null && forceQualifiedName) {
    public String visitReservedWord(@NotNull SQLReservedWordCompletionItem reservedWord) {
                            && this.queryCompletionContext.getDataContext().resolveSource(monitor, List.of(s)) != null)
        }
        return SQLCompletionAnalyzer.convertKeywordCase(this.request, reservedWord.text, false);
        }
    public String visitTableName(@NotNull SQLTableNameCompletionItem tableName) {
        return name;
    }

            name = shortName;
    private final String structSeparator;
    @Override
            .map(s -> DBUtils.getQuotedIdentifier(dataSource, s))
    }
    private final SQLTableAliasInsertMode aliasMode;
        return object.getParentObject() instanceof DBSObjectContainer objectContainer &&
        this.queryCompletionContext = queryCompletionContext;
    @NotNull
import java.util.List;
                DBSObject child = activeContext.getChild(this.monitor, object.getName());

        return joinCondition.left.apply(this) + " = " + joinCondition.right.apply(this);
        String suffix = "";
            if (objectCompletionItem.resolvedContext.preventFullName()) {
    public String visitCompositeField(@NotNull SQLCompositeFieldCompletionItem compositeField) {
    }
import java.util.Collection;
    public String visitJoinCondition(@NotNull SQLJoinConditionCompletionItem joinCondition) {
            String accomplishedPart;
            boolean forceQualifiedName = this.request.getContext().isForceQualifiedColumnNames()
}
        this.structSeparator = Character.toString(dialect.getStructSeparator());
    }
            }
        return String.join(this.structSeparator, parts);

    }
import java.util.Collections;
    public String visitColumnName(@NotNull SQLColumnNameCompletionItem columnName) {
            } else {
    public String visitSpecialCompositeField(@NotNull SQLSpecialCompositeFieldCompletionItem compositeField) {
    private <T extends DBSObject> String prepareObjectName(@NotNull DBSObject namedObject) {
        String name = this.prepareObjectName(procedure);
 * you may not use this file except in compliance with the License.


import org.jkiss.dbeaver.model.sql.SQLUtils;
    private boolean objectBelongsToTheActiveContext(@NotNull DBSObject object) {
                        (this.queryCompletionContext.getDataContext() != null
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSObject;
        this.activeContext = request.getContext().getExecutionContext() == null

    }

import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolEntry;
                prefix = "";
        this.request = request;
        return prefix + preparedColumnName;
package org.jkiss.dbeaver.model.sql.semantics.completion;

 * DBeaver - Universal Database Manager
import java.util.stream.Collectors;
    public String visitBuiltinFunction(@NotNull SQLBuiltinFunctionCompletionItem function) {
/*
    public String visitSubqueryAlias(@NotNull SQLRowsSourceAliasCompletionItem subqueryAlias) {
        return symbol.getDefinition() instanceof SQLQuerySymbolEntry entry ? entry.getRawName() : symbol.getName();


        return compositeField.memberInfo.name();
        boolean forceFullName = !this.objectBelongsToTheActiveContext(namedObject) || this.activeContextHasConflictingName(namedObject);
    @NotNull
                prefix = this.prepareQualifiedName(columnName.sourceInfo.referenceName.stringParts) + this.structSeparator;
        @NotNull DBRProgressMonitor monitor
        List<String> parts = SQLQueryCompletionItem.prepareQualifiedNameParts(object, knownSubroot);

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    private final SQLCompletionRequest request;
        }
            ? (" " + SQLCompletionAnalyzer.convertKeywordCase(this.request, "as", false) + " ") : " ";
        if (this.queryCompletionContext.getInspectionResult().expectingTableSourceIntroduction() &&
        this.monitor = monitor;

                text = sb.toString();


                    s -> dialect.getKeywordType(s) != null ||
                accomplishedPart = this.convertCaseIfNeeded(DBUtils.getQuotedIdentifier(objectCompletionItem.getObject()));
import org.jkiss.dbeaver.model.sql.SQLTableAliasInsertMode;
        String name;
        DBPDataSource dataSource = this.request.getContext().getDataSource();
                suffix = this.prepareAliasPrefix() + this.convertCaseIfNeeded(alias);
            // It is table name completion after FROM. Auto-generate table alias
                        if (index++ > 0) {
import org.jkiss.dbeaver.model.DBUtils;

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Set;
            Collection<? extends DBSProcedureParameter> parameters = procedure.getObject().getParameters(monitor);
        return result;
    }
    public String visitSpecialText(@NotNull SQLSpecialTextCompletionItem specialText) {
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        return function.name + "()";
        } else {
        } else {
        @NotNull SQLQueryCompletionContext queryCompletionContext,
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
    private String prepareObjectName(@NotNull SQLDbObjectCompletionItem<?> objectCompletionItem) {
    public SQLQueryCompletionTextProvider(
        String result;

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;
                String alias = SQLUtils.generateEntityAlias(
        return this.aliasMode == SQLTableAliasInsertMode.EXTENDED
 *
    @Override
        try {
            this.aliasMode != SQLTableAliasInsertMode.NONE) {
                accomplishedPart = this.prepareQualifiedName(objectCompletionItem.object, objectCompletionItem.resolvedContext.object());
    @Nullable
    @Override
            if (!CommonUtils.isEmpty(parameters)) {
    }
    }
                int index = 0;
    @NotNull
        return this.prepareObjectName(tableName) + suffix;
        String shortName = DBUtils.getQuotedIdentifier(namedObject);
    private final DBSObjectContainer activeContext;
    @Nullable
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
            result = name;
        return false;
            name = this.prepareObjectName(objectCompletionItem.object);
    @Override
            }

        } catch (DBException e) {
    private final DBRProgressMonitor monitor;
            name = DBUtils.getObjectFullName(namedObject, DBPEvaluationContext.DML);
import org.jkiss.code.NotNull;
    @NotNull
            String text;
    private boolean activeContextHasConflictingName(@NotNull DBSObject object) {

    private String prepareAliasPrefix() {
    @NotNull

        } else {
    @Nullable

            }
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionAnalyzer;

            name = objectCompletionItem.resolvedContext.string() + this.convertCaseIfNeeded(accomplishedPart);
                name = this.prepareQualifiedName(namedObject, null);
        String prefix;

 * limitations under the License.
        return nameParts.stream()
        String preparedColumnName = this.convertCaseIfNeeded(columnName.columnInfo.symbol.getName());
import org.jkiss.dbeaver.Log;
            result = SQLCompletionAnalyzer.convertKeywordCase(this.request, name, true);
            } else if (columnName.sourceInfo.referenceName != null && forceQualifiedName) {
    private String prepareQualifiedName(@NotNull List<String> nameParts) {
import org.jkiss.dbeaver.model.DBPDataSource;
                        }
 * You may obtain a copy of the License at
        if (objectCompletionItem.resolvedContext != null) {
