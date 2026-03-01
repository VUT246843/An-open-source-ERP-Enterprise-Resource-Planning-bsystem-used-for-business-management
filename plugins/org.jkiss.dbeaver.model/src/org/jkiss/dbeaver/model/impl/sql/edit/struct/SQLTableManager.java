    /**
     * @param cs          the character sequence to search
                    }
        }
                    if (commentPos != -1) {
        if (im != null && table instanceof DBSTable && !CommonUtils.getOption(options, DBPScriptObject.OPTION_SKIP_INDEXES)) {

    }
    }
                    }
                        if (!(foreignKey instanceof DBSTableForeignKey) ||
        if (toffset < 0 || toffset > sb.length() - prefix.length()) {
                }
    public static String getDelimiter(Map<String, Object> options) {
                // Create only foreign keys
                        table.getDataSource(),
                    result = i;
     *
                if (!script.endsWith(delimiter)) {
                if (inString && i + 1 < cs.length() && cs.charAt(i + 1) == '\'') {
            } catch (DBException e) {

                }
    }
                log.debug(e);

                    if (!isIncludeIndexInDDL(monitor, index)) {
    }
                }
    private static boolean startsWith(CharSequence sb, String prefix, int toffset) {

                }

import org.jkiss.dbeaver.model.struct.*;

            options.remove(DBPScriptObject.OPTION_COMPOSITE_OBJECT);

                        }
 * See the License for the specific language governing permissions and
            char ch = cs.charAt(i);
                for (DBSEntityAssociation foreignKey : CommonUtils.safeCollection(table.getAssociations(monitor))) {
                            continue;
    protected void appendTableModifiers(
                if (skipObject(column)) {
     */
        final NestedObjectCommand<?, ?> tableProps = command.getObjectCommands().get(table);
        }

        if (pkm != null && !CommonUtils.getOption(options, DBPScriptObject.OPTION_SKIP_UNIQUE_KEYS)) {

            (table.getDataSource() == null ||
        final Collection<NestedObjectCommand> orderedCommands = getNestedOrderedCommands(command);
    }
        }
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
            if (nestedCommand.getObject() == table) {
                options |= FEATURE_DELETE_CASCADE;
        List<DBEPersistAction> actions = new ArrayList<>();
        );
        if (table.isPersisted() && isIncludeDropInDDL(table) &&
        StringBuilder ddl,
        boolean inString = false;
     * @param query       the current SQL buffer
                inString = !inString;
                }
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.edit.DBERegistry;
        @NotNull String tableName,
    }
    protected void addStructObjectCreateActions(
         * FIXME: for indexes and foreign keys this may lead to incorrect manager provided for key
        }
 * You may obtain a copy of the License at
            }
     * @param startFrom   the position from which to start searching for a comment
            return actions.toArray(new DBEPersistAction[0]);
            if (sb.charAt(toffset + j) != prefix.charAt(j)) {
                    // Ignore primary keys
    protected String getCreateTableType(OBJECT_TYPE table) {
        }
        SQLObjectEditor<DBSTableCheckConstraint, OBJECT_TYPE> ccm = getObjectEditor(editorsRegistry, DBSTableCheckConstraint.class);
            queryPart += GeneralUtils.getDefaultLineSeparator();
        for (int i = start; i <= cs.length() - slComment.length(); i++) {
        return BASE_TABLE_NAME;

            log.warn("Object change command not found"); //$NON-NLS-1$
    @Override
    ) throws DBException {
        addExtraDDLCommands(monitor, table, options, command);
                        DBEPersistAction[] cmdActions = fkm.makeCreateCommand((DBSTableForeignKey) foreignKey, options).getPersistActions(monitor, executionContext, options);
    {
            }
                    Collections.addAll(actions, nestedActions);
    }
        return Boolean.TRUE.equals(options.get(DBPScriptObject.OPTION_SCRIPT_FORMAT_COMPACT));

 * Copyright (C) 2010-2024 DBeaver Corp and others
                    new SQLDatabasePersistActionComment(
        return isCompact(options) ? " " : GeneralUtils.getDefaultLineSeparator();
            // Return position after " --" so that the next search skips this comment
                command.aggregateCommand(tcm.makeCreateCommand(column, options));

    }
                } else {
            createQuery.append(")"); //$NON-NLS-1$
            while (insertPos > 0 && Character.isWhitespace(query.charAt(insertPos - 1))) {
        }

    protected void addExtraDDLCommands(DBRProgressMonitor monitor, OBJECT_TYPE table, Map<String, Object> options, StructCreateCommand createCommand) {
        options = new HashMap<>(options);
            return query.length();
                try {
    @Override
        @NotNull Map<String, Object> options) throws DBException {
            String nestedDeclaration = nestedCommand.getNestedDeclaration(monitor, table, options);
                // Insert nested declaration
                log.debug(e);
                    command.aggregateCommand(fkm.makeCreateCommand((DBSTableForeignKey) foreignKey, options));
            return false;
                if (hasNestedDeclarations) {
        final String tableName = DBUtils.getEntityScriptName(table, options);
                // Ignore primary keys
                            continue;
                if (!hasNestedDeclarations && !hasAttrDeclarations(table)) {
    public static int findCommentPos(CharSequence cs, String slComment) {
                continue;
    }
                    if (!isIncludeConstraintInDDL(monitor, constraint)) {
                    if (isCompact) {
            }
        Map<String, Object> options
        NestedObjectCommand tableProps,
         */

            } catch (DBException e) {
            }
                        continue;


            new SQLDatabasePersistAction(
        return true;




                (!DBUtils.isView(object) && CommonUtils.getOption(options, OPTION_DELETE_CASCADE) ? " CASCADE" : "") //$NON-NLS-2$
package org.jkiss.dbeaver.model.impl.sql.edit.struct;
        }
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
                // Ignore check constraints
        }
                        script));
        if (hasAttrDeclarations(table) || hasNestedDeclarations) {
    public static int findCommentPos(CharSequence cs, String slComment, int start, boolean findFirst) {
                    createQuery.append(isCompact ? " " : "\t");
                            Collections.addAll(actions, cmdActions);
    protected boolean hasAttrDeclarations(OBJECT_TYPE table) {
                    for (DBSTableCheckConstraint constraint : CommonUtils.safeCollection(((DBSCheckConstraintContainer)table).getCheckConstraints(monitor))) {
 *
        boolean hasNestedDeclarations = false;
            } else {
        int commentPos = findCommentPos(query, slComment, startFrom, false);
            }
 * limitations under the License.
        OBJECT_TYPE object = command.getObject();
        }
                        if (skipObject(constraint)) {
    public DBEPersistAction[] getTableDDL(
     * @param slComment   the single-line comment marker (e.g., "--")

import org.jkiss.dbeaver.model.sql.SQLDialect;
}
                        continue;
                ModelMessages.model_jdbc_drop_table,

        Collections.addAll(actions, command.getPersistActions(monitor, executionContext, options));
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
            if (excludeFromDDL(nestedCommand, orderedCommands)) {
                insertPos--;
        StructCreateCommand command = makeCreateCommand(table, options);
            try {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
    }

            }
                createQuery.append(nestedDeclaration); //$NON-NLS-1$
                        }
        if (childObject instanceof DBSTableIndex) {
        return !DBUtils.isHiddenObject(index) && !DBUtils.isInheritedObject(index);
        long options = FEATURE_EDITOR_ON_CREATE;

 * distributed under the License is distributed on an "AS IS" BASIS,
                        nestedDeclaration = nestedDeclaration.substring(0, commentPos - 1);
public abstract class SQLTableManager<OBJECT_TYPE extends DBSEntity, CONTAINER_TYPE extends DBSObjectContainer>
        }
import org.jkiss.dbeaver.model.DBPScriptObject;
        for (NestedObjectCommand<?, ?> nestedCommand : orderedCommands) {
    }
    }
        final String tableName = DBUtils.getEntityScriptName(object, options);
                table.getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_EXTRA_DDL_INFO))
        SQLObjectEditor<DBSTableForeignKey, OBJECT_TYPE> fkm = getObjectEditor(editorsRegistry, DBSTableForeignKey.class);
                } else {
                    continue;
            if (!inString && startsWith(cs, slComment, i)) {
    @Override
    protected boolean isIncludeDropInDDL(@NotNull OBJECT_TYPE table) {
            options.put(DBPScriptObject.OPTION_COMPOSITE_OBJECT, table);
                }
    public static final String BASE_MATERIALIZED_VIEW_NAME = "NewMView"; //$NON-NLS-1$

        }

                continue;
    }
        boolean alter,
        return options;
            if (fkm != null) {
        Map<String, Object> options) throws DBException {
                for (DBSEntityConstraint constraint : CommonUtils.safeCollection(table.getConstraints(monitor))) {
        DBRProgressMonitor monitor,
     * @param slComment   the comment prefix (e.g., "--")
            )
    }
    @Override
                query.insert(insertPos, ","); //$NON-NLS-1$
        int result = -1;
            return;

                final DBEPersistAction[] nestedActions = nestedCommand.getPersistActions(monitor, executionContext, options);

                    for (DBSEntityAssociation foreignKey : CommonUtils.safeCollection(table.getAssociations(monitor))) {
                actions.add(
        // Make options modifiable
        if (tcm != null) {
        List<DBEPersistAction> actions,
        @NotNull OBJECT_TYPE table,
                        createQuery.append(","); //$NON-NLS-1$
    extends SQLStructEditor<OBJECT_TYPE, CONTAINER_TYPE>
        return result;
        final String slComment = sqlDialect.getSingleLineComments()[0];
        String queryPart = "CREATE " + getCreateTableType(table) + " " + tableName + " (";  //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            } catch (DBException e) {
    protected boolean isIncludeChildObjectReference(DBRProgressMonitor monitor, DBSObject childObject) throws DBException {
            }
 */
        ) {


        StructCreateCommand command,
                        createQuery.append(lineSeparator);
                    } else {
                // Ignore foreign keys
                log.debug(e);
         * FIXME: We have a pretty major problem with inheritance and managers
        {
            if (!CommonUtils.isEmpty(nestedDeclaration)) {
        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_ONLY_FOREIGN_KEYS)) {
     * @return the position of the comment, or -1 if not found
        DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.dbeaver.model.DBUtils;
                } catch (DBException e) {
                // This command should be executed separately
    protected boolean isIncludeIndexInDDL(DBRProgressMonitor monitor, DBSTableIndex index) throws DBException {
                createQuery.append(lineSeparator);

                }
                        createQuery.append(" ");
        Map<String, Object> options) throws DBException {
            }
import org.jkiss.dbeaver.runtime.DBWorkbench;

        final boolean isCompact = isCompact(options);
                    // Do not include hidden (pseudo?) and inherited columns in DDL
    public static boolean isCompact(Map<String, Object> options) {
        SQLObjectEditor<DBSTableIndex, OBJECT_TYPE> im = getObjectEditor(editorsRegistry, DBSTableIndex.class);
                }
        /*
            if (!hasCommaBefore) {
    }
            int insertPos = commentPos;
import org.jkiss.dbeaver.model.struct.rdb.*;
import org.jkiss.dbeaver.DBException;
         * Temporary workaround - provide primary key before indexes and foreign keys in getChildTypes
                    }
        DBCExecutionContext executionContext = DBUtils.getDefaultContext(table, true);
                String script = delAction.getScript();

/**
                }
 * you may not use this file except in compliance with the License.
                }
        return !skipObject(constraint);
                    command.aggregateCommand(pkm.makeCreateCommand(constraint, options));

    }

                if (nestedActions != null) {

 * JDBC table manager
        return getCreateTableType(table);
                    }
            try {
        final String lineSeparator = GeneralUtils.getDefaultLineSeparator();
    }
            for (DBSEntityAttribute column : CommonUtils.safeCollection(table.getAttributes(monitor))) {
                    if (!isCompact) {
                String delimiter = SQLUtils.getScriptLineDelimiter(SQLUtils.getDialectFromObject(table));
                }
        final OBJECT_TYPE table = command.getObject();

            for (DBEPersistAction delAction : new ObjectDeleteCommand(table, ModelMessages.model_jdbc_delete_object).getPersistActions(monitor, executionContext, options)) {
            }

        OBJECT_TYPE table,
        final DBERegistry editorsRegistry = DBWorkbench.getPlatform().getEditorsRegistry();
     * @return updated index to be used for the next comment insertion pass
                if (table instanceof DBSCheckConstraintContainer) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

     *
            if (dataSource.getSQLDialect().supportsTableDropCascade()) {
import org.jkiss.dbeaver.utils.GeneralUtils;
                // Ignore indexes

        }
            }
    private boolean skipObject(Object object) {
        if (fkm != null && !CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SKIP_FOREIGN_KEYS)) {
                    } else {
                return false;
                if (isCompact) {
 * DBeaver - Universal Database Manager
        if (ccm != null) {

/*
    public static final String BASE_VIEW_NAME = "NewView"; //$NON-NLS-1$
import org.jkiss.dbeaver.ModelPreferences;
            }
    }
     * Inserts a comma before the last single-line comment (if needed).
        OBJECT_TYPE table,
            return commentPos + 3;
        SQLObjectEditor<DBSEntityAttribute, OBJECT_TYPE> tcm = getObjectEditor(editorsRegistry, DBSEntityAttribute.class);
    protected boolean isIncludeConstraintInDDL(DBRProgressMonitor monitor, DBSEntityConstraint constraint) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
        return false;
        }

            boolean hasCommaBefore = insertPos > 0 && query.charAt(insertPos - 1) == ',';
import org.jkiss.dbeaver.model.messages.ModelMessages;
            if (ch == '\'') {

                for (DBSTableIndex index : CommonUtils.safeCollection(((DBSTable)table).getIndexes(monitor))) {
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
                        // Check for embedded comment
        }
        actions.add(0, new SQLDatabasePersistAction(ModelMessages.model_jdbc_create_new_table, createQuery.toString()));
                    continue;
    }
        SQLObjectEditor<DBSEntityConstraint, OBJECT_TYPE> pkm = getObjectEditor(editorsRegistry, DBSEntityConstraint.class);

import org.jkiss.code.NotNull;
            }
            actions.add(new SQLDatabasePersistActionComment(table.getDataSource(), "Drop table"));
 */
                        continue;
    }
        DBRProgressMonitor monitor,
        } else {
            return isIncludeIndexInDDL(monitor, (DBSTableIndex) childObject);
    protected String getBaseObjectName() {
                        createQuery.append(lineSeparator).append('\t');
                    }
        DBCExecutionContext executionContext,
            }
    }

                }
                " " + tableName + //$NON-NLS-2$
        appendTableModifiers(monitor, table, tableProps, createQuery, false, options);
                    i++; // skip escaped quote ''
        return true;

            // Aggregate nested column, constraint and index commands
        return findCommentPos(cs, slComment, 0, true);

                "DROP " + getDropTableType(object) +  //$NON-NLS-2$
        }
        }
         * FIXME: we search for constraint manager by class which is also a parent
import org.jkiss.dbeaver.model.impl.sql.edit.SQLStructEditor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
import java.util.*;
                    return i;

        for (int j = 0; j < prefix.length(); j++) {
        @NotNull DBRProgressMonitor monitor,
                    log.debug(e);
     * Finds the position of a single-line comment marker, ignoring string literals.

        if (commentPos != -1) {
        }

    public static final String BASE_TABLE_NAME = "NewTable"; //$NON-NLS-1$
                        }
        int lastComment = 0;

            try {
                    if (!(foreignKey instanceof DBSTableForeignKey) || skipObject(foreignKey)) {

    }
                    command.aggregateCommand(im.makeCreateCommand(index, options));
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        return super.isIncludeChildObjectReference(monitor, childObject);
                    script += delimiter;
            }
        StringBuilder createQuery = new StringBuilder(100);
     */
 * Unless required by applicable law or agreed to in writing, software
        final SQLDialect sqlDialect = SQLUtils.getDialectFromObject(table);
    protected boolean excludeFromDDL(NestedObjectCommand command, Collection<NestedObjectCommand> orderedCommands) {
                log.debug(e);
        return queryPart;

            query.append(","); //$NON-NLS-1$
    /**
            }
        return true;
                            skipObject(foreignKey)) {
                hasNestedDeclarations = true;
        createQuery.append(beginCreateTableStatement(monitor, table, tableName, options));

                    createQuery.append('(');
        if (tableProps == null) {
            } catch (DBException e) {
                }
     * @param findFirst   if true, returns the first match; if false, returns the last
                    int commentPos = findCommentPos(nestedDeclaration, slComment);
    public static int appendCommaBeforeLastComment(StringBuilder query, String slComment, int startFrom) {
                        command.aggregateCommand(ccm.makeCreateCommand(constraint, options));
{
            try {
        return actions.toArray(new DBEPersistAction[0]);
                    }
        actions.add(
                if (findFirst) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
     * @param start       the index to start searching from
    protected String beginCreateTableStatement(
    protected String getDropTableType(OBJECT_TYPE table) {
                        lastComment = appendCommaBeforeLastComment(createQuery, slComment, lastComment);
                        if (cmdActions != null) {
        return DBUtils.isHiddenObject(object) || DBUtils.isInheritedObject(object);
 *
                    }
        return DBUtils.isView(table) ? "VIEW" : "TABLE";//$NON-NLS-1$ //$NON-NLS-2$
        if (!isCompact(options)) {
            if (!isCompact) {
