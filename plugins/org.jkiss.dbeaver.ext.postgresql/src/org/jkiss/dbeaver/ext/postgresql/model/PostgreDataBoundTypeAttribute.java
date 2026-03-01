        } else {
            if (isIncludeContainerName) {
 * limitations under the License.
                if (containerAliasOrNull != null) {
    public PostgreSchema getSchema() {
 *
                    if (entityContext.getParentObject() != this.getTable()) {
                        parts.addFirst(DBUtils.getQuotedIdentifier(entityContext.getParentObject()));

    public String formatMemberReference(
 *
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

import org.jkiss.dbeaver.model.DBUtils;
    }
 * you may not use this file except in compliance with the License.
                    parts.addFirst(containerAliasOrNull);

package org.jkiss.dbeaver.ext.postgresql.model;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.model.struct.DBSEntity;
    
        LinkedList<String> parts = new LinkedList<>();
    public PostgreDataBoundTypeAttribute(
    ) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSAttributeEnumerable;
        if (purpose.equals(DBPAttributeReferencePurpose.DATA_SELECTION)) {
/**
            parts.addFirst(DBUtils.getQuotedIdentifier(entityContext));
        @Nullable DBDAttributeBinding context,
            }
    }
        DBSEntityAttribute entityContext = bindingContext.getEntityAttribute();
        @NotNull DBPAttributeReferencePurpose purpose
}
    @NotNull
    @NotNull
    }
import org.jkiss.dbeaver.model.DBPAttributeReferencePurpose;
        } else {
                parts.addFirst(DBUtils.getQuotedIdentifier(bindingContext));
        @NotNull DBRProgressMonitor monitor,
            return "(".repeat(parts.size() - 1) + String.join(").", parts);
            entityContext = bindingContext.getEntityAttribute();
        @NotNull PostgreDataTypeAttribute attr
public class PostgreDataBoundTypeAttribute<CONTAINER extends DBSEntity & PostgreObject> extends PostgreAttribute<CONTAINER>
        @NotNull CONTAINER container,
import org.jkiss.code.NotNull;
    implements DBSEntityAttribute, DBSAttributeEnumerable, DBSContextBoundAttribute {
import org.jkiss.dbeaver.model.struct.DBSContextBoundAttribute;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
            return String.join(".", parts);
            if (isIncludeContainerName) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.DBException;
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import java.util.LinkedList;
    @Override
        if (entityContext != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
    ) {
        this.member = attr;
                } else {
            parts.addFirst(DBUtils.getQuotedIdentifier(boundAttr.member));
                    parts.addFirst(containerAliasOrNull);
            bindingContext = boundAttr.context;
            }
        parts.addFirst(DBUtils.getQuotedIdentifier(this.member));
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return member.getSchema();
        }
        while (entityContext instanceof PostgreDataBoundTypeAttribute boundAttr) {
 * You may obtain a copy of the License at
                    parts.addFirst(DBUtils.getObjectFullName(this.getTable(), DBPEvaluationContext.DML));
 * See the License for the specific language governing permissions and
        }
 * Provides information about context for data type attribute
                    }
        DBDAttributeBinding bindingContext = this.context;
                if (containerAliasOrNull == null) {

    private final DBDAttributeBinding context;
        this.context = context;

                }
        boolean isIncludeContainerName,
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
 */
 */
 *
        @Nullable String containerAliasOrNull,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private final PostgreDataTypeAttribute member;
        super(monitor, container, attr);
