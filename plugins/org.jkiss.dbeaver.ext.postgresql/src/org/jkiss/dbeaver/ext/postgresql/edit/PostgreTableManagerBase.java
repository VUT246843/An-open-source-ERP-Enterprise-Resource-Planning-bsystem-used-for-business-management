    @Override
        if ((showComments && !CommonUtils.isEmpty(comment)) || command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
                    // Column comments
                ) {
                            hasComments = true;
                // Add RLS enable DDL
                // Partitions
                if (!table.isPartition() && !monitor.isCanceled()
                // Rules
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
                        if (addExtraActionComment) {
/*
                    && table.getDataSource().getServerType().supportsAlterStorageStrategy()
                                "Create policy",
        }
                    if (!CommonUtils.isEmpty(rules)) {
                                actions.add(new SQLDatabasePersistActionComment(dataSource, "Column storage"));
                            actions.add(new SQLDatabasePersistAction("Create trigger", trigger.getObjectDefinitionText(monitor, options)));
    }
                    }
import java.util.Collection;

                    for (DBSEntityAssociation fk : CommonUtils.safeCollection(table.getAssociations(monitor))) {
import org.jkiss.code.NotNull;
                    }
public abstract class PostgreTableManagerBase extends SQLTableManager<PostgreTableBase, PostgreSchema> {
                }
                    }
 * you may not use this file except in compliance with the License.
        if (isDDL || !table.isPersisted()) {
                        }
                        }
                            actions.add(

                            actions.add(new SQLDatabasePersistAction(
        }
                            hasComments = true;
                        }
                "Comment table",
                            actions.add(new SQLDatabasePersistActionComment(dataSource, "Table Triggers"));
                        for (PostgreTrigger trigger : triggers) {
                        if (addExtraActionComment) {

                        if (!CommonUtils.isEmpty(constr.getDescription())) {
                                actions.add(new SQLDatabasePersistActionComment(dataSource, "Foreign key comments"));
                }
            }
        if (!table.isPersisted()) {
                        }
                            }
                    boolean hasComments = false;
 * limitations under the License.
                            + " ENABLE ROW LEVEL SECURITY"
package org.jkiss.dbeaver.ext.postgresql.edit;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                            ));
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
                            if (!hasComments && addExtraActionComment) {
    }
import org.jkiss.dbeaver.model.DBPScriptObject;
}
 *
                    }
            comment = table.getDescription();
                    Collection<PostgreRule> rules = ((PostgreTableReal) table).getRules(monitor);
                            if (!hasComments && addExtraActionComment) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
/**
        }
 * See the License for the specific language governing permissions and
                    ));
                    // Constraint comments
            boolean addExtraActionComment =
import org.jkiss.dbeaver.ModelPreferences;
                        }

                            actions.add(new SQLDatabasePersistActionComment(dataSource, "Table Policies"));
                if (isDDL && !table.isPartition() && !monitor.isCanceled()) {
                        }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                        if (!column.isHidden() && !column.hasDefaultStorage()) {
                                actions.add(new SQLDatabasePersistActionComment(dataSource, "Constraint comments"));
import org.jkiss.dbeaver.ext.postgresql.model.*;
                    if (!CommonUtils.isEmpty(triggers)) {
                    boolean hasComments = false;
 * Licensed under the Apache License, Version 2.0 (the "License");
                            actions.add(new SQLDatabasePersistActionComment(dataSource, "Table Rules"));
        // Add comments
                // Triggers
 * DBeaver - Universal Database Manager

                            hasComments = true;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                // Add policy DDL
                    && !table.getDataSource().getServerType().supportsStorageModifier()) {
        } else {
                        for (PostgreTableBase partition : partitions) {

                            if (!hasStorage && addExtraActionComment) {
                log.error(e);
    protected boolean isIncludeIndexInDDL(DBRProgressMonitor monitor, DBSTableIndex index) throws DBException {
                }
                if (table instanceof PostgreTable pgTable
 *
                if (table instanceof PostgreTableReal && !table.isPartition() && !monitor.isCanceled()) {
                                actions.add(new SQLDatabasePersistActionComment(dataSource, "Column comments"));
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            Object descProp = command.getProperty(DBConstants.PROP_ID_DESCRIPTION);
            try {
 * Unless required by applicable law or agreed to in writing, software
        String comment;
                    && !monitor.isCanceled()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
                if (table instanceof PostgreTable pgTable && pgTable.isHasRowLevelSecurity()) {
                            PostgreTableColumnManager.addColumnStorageAction(actions, column);
                        }
                    && table.getDataSource().getServerType().supportsRowLevelSecurity()
                    actions.add(new SQLDatabasePersistAction(
                            }

        return !table.isPartition();

    }
                        if (addExtraActionComment) {
                table.getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_EXTRA_DDL_INFO);
                            PostgreConstraintManager.addConstraintCommentAction(actions, (PostgreTableForeignKey)fk);
                    PostgreUtils.getObjectGrantPermissionActions(monitor, table, actions, options);
                        }
                    Collection<PostgreTablePolicy> policies = pgTable.getPolicies(monitor);
                    for (PostgreTableConstraintBase constr : CommonUtils.safeCollection(table.getConstraints(monitor))) {
                    }
                }
 * Postgre table manager
                        if (addExtraActionComment) {
        PostgreTableBase table = command.getObject();

                if (showComments) {
                    if (!CommonUtils.isEmpty(policies)) {
                            actions.add(new SQLDatabasePersistAction("Create rule", rule.getObjectDefinitionText(monitor, options)));
                        "ALTER TABLE " + table.getFullyQualifiedName(DBPEvaluationContext.DDL)
            PostgreDataSource dataSource = table.getDataSource();
                    " IS " + SQLUtils.quoteString(table, CommonUtils.notEmpty(comment))));
                    List<PostgreTableBase> partitions = postgreTable.getPartitions(monitor);
    protected boolean isIncludeDropInDDL(@NotNull PostgreTableBase table) {
                        }
                    if (postgreTable.hasPartitions() && !CommonUtils.isEmpty(partitions)) {
                }
                                policy.getObjectDefinitionText(monitor, options)
                            PostgreTableColumnManager.addColumnCommentAction(actions, column);
            // show comment commands for DDL and new objects
                        if (fk instanceof PostgreTableForeignKey && !CommonUtils.isEmpty(fk.getDescription())) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
                            }
 *
            actions.add(new SQLDatabasePersistAction(
                        "Enable row level security",
                        }
                }
                    }
            CommonUtils.getOption(options, DBPScriptObject.OPTION_OBJECT_SAVE);

import java.util.List;
                if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_PARTITIONS)
                            actions.add(new SQLDatabasePersistActionComment(dataSource, "Partitions"));
                    for (PostgreTableColumn column : CommonUtils.safeCollection(table.getAttributes(monitor))) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreTableBase, PropertyHandler> command, @NotNull Map<String, Object> options) {
                        }
                if (showComments && !table.isPartition() && !monitor.isCanceled()) {
            } catch (DBException e) {
        boolean isDDL = CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SOURCE);


                    }

                }
import java.util.Map;
        boolean showComments =
                        }
                    && !monitor.isCanceled()
import org.jkiss.dbeaver.DBException;
                    PostgreTable postgreTable = (PostgreTable) table;
                }
                ) {
        return !((PostgreIndex)index).isPrimaryKeyIndex() && super.isIncludeIndexInDDL(monitor, index);
                        for (PostgreRule rule : rules) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                "COMMENT ON " + table.getTableTypeName() + " " + table.getFullyQualifiedName(DBPEvaluationContext.DDL) +
                    for (PostgreTableColumn column : CommonUtils.safeCollection(table.getAttributes(monitor))) {

import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
            CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS) ||
                // Column storage

                            hasStorage = true;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            comment = descProp != null ? descProp.toString() : null;
                            if (!hasComments && addExtraActionComment) {
 * You may obtain a copy of the License at
    @Override
                    Collection<PostgreTrigger> triggers = ((PostgreTableReal) table).getTriggers(monitor);
                    boolean hasStorage = false;
import org.jkiss.utils.CommonUtils;
                        for (PostgreTablePolicy policy : policies) {
                    }
                            PostgreConstraintManager.addConstraintCommentAction(actions, constr);
                        if (!CommonUtils.isEmpty(column.getDescription())) {
                if (table instanceof PostgreTableReal && !table.isPartition() && !monitor.isCanceled()) {
                            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    && table instanceof PostgreTable

 */
                                new SQLDatabasePersistAction("Create partition", partition.getObjectDefinitionText(monitor, options)));
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
