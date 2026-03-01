        @NotNull AISchemaGenerationOptions options,
    }
        });
            return describeTable(monitor, table, ctx, options, useFqn);
            return "-- " + description + "\n";
            if (DBUtils.isHiddenObject(attr)) {
        @NotNull DBSTable table,
 *     http://www.apache.org/licenses/LICENSE-2.0
                    + (options.sendObjectComment() && !describe(attr).isBlank() ? describe(attr) : "")

import org.jkiss.dbeaver.model.ai.AISchemaGenerationOptions;
        String name = useFqn && ctx != null
import org.jkiss.dbeaver.model.ai.AISchemaGenerator;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (!tableDescription.isBlank()) {

        @Nullable DBCExecutionContext ctx,
        attributes.forEach(attr -> {
import org.jkiss.code.NotNull;
/*
 * See the License for the specific language governing permissions and
        }
        if (entity instanceof DBSTable table) {
        } else {
        }
        } else {
        StringJoiner columnsJoiner = new StringJoiner(",", " (", ") ");
 */
                ddl.append(tableDescription).append("\n");
}
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return ddl.append(columnsJoiner).toString();
        StringBuilder ddl = new StringBuilder();

    ) throws DBException {
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
            : DBUtils.getQuotedIdentifier(table);
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        } else {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                    + (options.sendColumnTypes() ? " " + attr.getTypeName() : "")
import java.util.StringJoiner;
        @NotNull DBRProgressMonitor monitor,
    public String generateSchema(
 *

            );

        if (table.isView()) {

import org.jkiss.dbeaver.DBException;
import java.util.List;
            return ddl.append(");").toString();
        ddl.append(name);
            return "";
        if (description == null || description.isBlank()) {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.dbeaver.model.DBUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,

        @NotNull DBSEntity entity,
            ddl.append("CREATE VIEW ");
            String tableDescription = describe(table);

        }
    private static String describe(@NotNull DBPObjectWithDescription object) {
    }
        if (options.sendObjectComment()) {
import org.jkiss.dbeaver.model.DBPObjectWithDescription;
            ddl.append("CREATE TABLE ");
 * you may not use this file except in compliance with the License.
        @NotNull AISchemaGenerationOptions options,
        }
            }
        if (attributes == null || attributes.isEmpty()) {
 *
    }
public class AISchemaGeneratorImpl implements AISchemaGenerator {
    @NotNull
 * You may obtain a copy of the License at
    public String describeTable(
                return;
package org.jkiss.dbeaver.model.ai.impl;
        @NotNull DBRProgressMonitor monitor,
        List<? extends DBSEntityAttribute> attributes = table.getAttributes(monitor);

        boolean useFqn
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            return "";

 * Licensed under the Apache License, Version 2.0 (the "License");
            }
    ) throws DBException {
                DBUtils.getQuotedIdentifier(attr)
            columnsJoiner.add(
        boolean useFqn
        @Nullable DBCExecutionContext ctx,
 * DBeaver - Universal Database Manager

 *
        String description = object.getDescription();
    @Override
            ? DBUtils.getObjectFullName(ctx.getDataSource(), table, DBPEvaluationContext.DDL)
        }
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.jkiss.code.Nullable;
    @NotNull

