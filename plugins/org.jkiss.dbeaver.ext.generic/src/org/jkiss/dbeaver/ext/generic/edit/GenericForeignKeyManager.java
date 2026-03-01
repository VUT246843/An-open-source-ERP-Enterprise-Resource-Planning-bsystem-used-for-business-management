    @Override
 */
    }
    protected GenericTableForeignKey createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object from, @NotNull Map<String, Object> options) {
        if (!CommonUtils.isEmpty(onDeleteRule)) {
    @Override
        return GenericUtils.isLegacySQLDialect(owner);
        return object.getParentObject().getContainer().getForeignKeysCache();
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        }
            null,
        return GenericUtils.canAlterTable(object);
    @Override
            false);
            DBSForeignKeyModifyRule.NO_ACTION,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 * limitations under the License.
        }
 *
        }
        ) {

    }

        return foreignKey;
/**
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
    protected boolean isFKConstraintDuplicated(GenericTableBase owner) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
public class GenericForeignKeyManager extends SQLForeignKeyManager<GenericTableForeignKey, GenericTableBase> {
            null,
    public boolean canCreateObject(@NotNull Object container) {
        return super.getNestedDeclaration(monitor, owner, command, options);
        if (!CommonUtils.isEmpty(onUpdateFK)) {
    @Override
    @Override
import org.jkiss.dbeaver.model.DBPScriptObject;

import org.jkiss.dbeaver.ext.generic.model.GenericTable;


import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;

            null,
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
}
    {
    public boolean canEditObject(@NotNull GenericTableForeignKey object) {
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyDeferability;
            && GenericUtils.canAlterTable((GenericTable) container);
            tableBase,
    public boolean canDeleteObject(@NotNull GenericTableForeignKey object) {
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            DBSForeignKeyModifyRule.NO_ACTION,
    @Override
    @Nullable
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
            && ((GenericTable) container).getDataSource().getInfo().supportsReferentialIntegrity()
import org.jkiss.code.Nullable;
        if (options.get(DBPScriptObject.OPTION_COMPOSITE_OBJECT) instanceof DBSEntity &&
            !owner.getDataSource().getMetaModel().supportNestedForeignKeys()

 *

 * you may not use this file except in compliance with the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSEntity;
        return (container instanceof GenericTable)
        GenericTableBase tableBase = (GenericTableBase)container;
    protected void appendUpdateDeleteRule(GenericTableForeignKey foreignKey, StringBuilder decl) {

            return null;
    }
 */
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKey;
    protected boolean isLegacyForeignKeySyntax(GenericTableBase owner) {

        return owner.getDataSource().getMetaModel().isFKConstraintWordDuplicated();
import java.util.Map;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
    public DBSObjectCache<? extends DBSObject, GenericTableForeignKey> getObjectsCache(GenericTableForeignKey object)
    }
package org.jkiss.dbeaver.ext.generic.edit;
    }
        return GenericUtils.canAlterTable(object);
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        String onDeleteRule = foreignKey.getDataSource().getMetaModel().generateOnDeleteFK(foreignKey.getDeleteRule());

            DBSForeignKeyDeferability.NOT_DEFERRABLE,
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
    }
            decl.append(" ").append(onUpdateFK);
        GenericTableForeignKey foreignKey = tableBase.getDataSource().getMetaModel().createTableForeignKeyImpl(
        foreignKey.setName(getNewConstraintName(monitor, foreignKey));
    protected StringBuilder getNestedDeclaration(DBRProgressMonitor monitor, GenericTableBase owner, DBECommandAbstract<GenericTableForeignKey> command, Map<String, Object> options) {
        String onUpdateFK = foreignKey.getDataSource().getMetaModel().generateOnUpdateFK(foreignKey.getUpdateRule());

 *
import org.jkiss.dbeaver.ext.generic.model.GenericUtils;
 * Generic foreign manager
            decl.append(" ").append(onDeleteRule);
