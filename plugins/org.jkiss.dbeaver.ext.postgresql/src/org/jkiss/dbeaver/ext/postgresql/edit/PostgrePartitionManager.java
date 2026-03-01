

 * See the License for the specific language governing permissions and
    }
        return "CREATE " + getCreateTableType(table) + " " + tableName //$NON-NLS-1$
            + " PARTITION OF " + getParentTable(monitor, (PostgreTablePartition) table) + " "; //$NON-NLS-1$ //$NON-NLS-2$
        PostgreTableForeignKey.class,
 */
        }

    }
    public boolean canCreateObject(@NotNull Object container) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    );
package org.jkiss.dbeaver.ext.postgresql.edit;
    public boolean canDeleteObject(@NotNull PostgreTableBase object) {
        }
 * PostgrePartitionManager

    }
        return object instanceof PostgreTablePartition;
        } else if (CommonUtils.isEmpty(superTables) || superTables.size() > 1) {
    protected String beginCreateTableStatement(
        return false;
        @NotNull PostgreTableBase table,
 *
    protected boolean excludeFromDDL(NestedObjectCommand command, Collection<NestedObjectCommand> orderedCommands) {
    @Override



    protected boolean hasAttrDeclarations(PostgreTableBase table) {

        return !(command.getObject() instanceof PostgreTableConstraint) && !(command.getObject() instanceof PostgreIndex);
            return partition.getPartitionOf().getFullyQualifiedName(DBPEvaluationContext.DDL);



 * Licensed under the Apache License, Version 2.0 (the "License");
        List<PostgreTableBase> superTables;

import org.jkiss.utils.CommonUtils;
import java.util.List;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * distributed under the License is distributed on an "AS IS" BASIS,
            superTables = partition.getSuperTables(monitor);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return new PostgreTablePartition((PostgreTable) container);
import java.util.Map;
 *
    public Class<? extends DBSObject>[] getChildTypes() {
 * You may obtain a copy of the License at
    }
        return true;
 */
    }

        return superTables.get(0).getFullyQualifiedName(DBPEvaluationContext.DDL);
import java.util.Collection;
    protected PostgreTablePartition createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) {

    @Override
}
        @NotNull DBRProgressMonitor monitor,
        return CHILD_TYPES_PART;

/*
            return "";//$NON-NLS-1$
import org.jkiss.dbeaver.ext.postgresql.model.*;
 * Unless required by applicable law or agreed to in writing, software
public class PostgrePartitionManager extends PostgreTableManager {
    }
    @Override
 * you may not use this file except in compliance with the License.
    }
        PostgreTableConstraint.class,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        try {
    @Override
    private String getParentTable(@NotNull DBRProgressMonitor monitor, @NotNull PostgreTablePartition partition) {
    private static final Class<? extends DBSObject>[] CHILD_TYPES_PART = CommonUtils.array(

    private static final Log log = Log.getLog(PostgrePartitionManager.class);
        } catch (DBException e) {
    @Override
    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.DBException;
    @NotNull
        @NotNull String tableName,
        @NotNull Map<String, Object> options) {
import org.jkiss.code.NotNull;

    public boolean canEditObject(@NotNull PostgreTableBase object) {
 *     http://www.apache.org/licenses/LICENSE-2.0

/**

            log.error("Unable to get parent", e);
import org.jkiss.dbeaver.Log;
    }
    }
 *
        PostgreIndex.class
        if (superTables == null && partition.getPartitionOf() != null) {
 * limitations under the License.
 * DBeaver - Universal Database Manager
            log.error("Unable to get parent");
    @Override

            return "";//$NON-NLS-1$
        return container instanceof PostgreTable;
