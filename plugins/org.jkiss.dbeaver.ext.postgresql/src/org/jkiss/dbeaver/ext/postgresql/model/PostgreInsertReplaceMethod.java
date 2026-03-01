
import org.jkiss.dbeaver.model.DBUtils;
            }
                updateExpression.append("(");
        return "INSERT INTO";
                Collection<? extends DBSTableIndex> indexes = table.getIndexes(monitor);
                    .filter(key -> key.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY)
    @NotNull
            constraintAttrNames.append(DBUtils.getQuotedIdentifier(attribute));
            }
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
            }
import java.util.Collection;
            if (hasKey) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) {
            Collection<? extends DBSTableConstraint> constraints = table.getConstraints(monitor);
import org.jkiss.utils.CommonUtils;
        for (DBSAttributeBase attribute : attributes) {
            if (!CommonUtils.isEmpty(constraints)) {
                StringBuilder updateExpression = new StringBuilder();
    public String getOpeningClause(@NotNull DBSTable table, @NotNull DBRProgressMonitor monitor) {
            String onConflictExpression = "ON CONFLICT (%s) DO UPDATE SET %s";
 * limitations under the License.
            if (attribute == null) {
import java.util.Optional;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    }

            hasKey = true;
 * you may not use this file except in compliance with the License.
                        getConstraintAttributesNames(constraintAttrNames, attributeReferences);
        boolean hasKey = false;
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            DBSEntityAttribute attribute = column.getAttribute();
                    DBSTableConstraint dbsTableConstraint = tableConstraint.get();
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
            } else {
 * Unless required by applicable law or agreed to in writing, software
                updateExpression.append("EXCLUDED."); //$NON-NLS-1$
                        DBSTableIndex tableIndex = optional.get();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull DBSTable table,
    }
        StringBuilder query = new StringBuilder();
            if (!constraintAttrNames.isEmpty()) {
                    if (optional.isPresent()) {
        boolean hasKey = false;

            hasKey = true;
                    List<? extends DBSEntityAttributeRef> attributeReferences = dbsTableConstraint.getAttributeReferences(monitor);
                    if (!CommonUtils.isEmpty(attributeReferences)) {
    ) {
 * You may obtain a copy of the License at
/*
                            getConstraintAttributesNames(constraintAttrNames, references);
        // Do not quote pseudo attribute name
                    }
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                addAttributesNamesList(table, attributes, true, updateExpression);
                        }
 *
                constraintAttrNames.append(",");
                updateExpression.append(") = (");
        } catch (DBException e) {
            log.debug("Can't read table constraints list", e);
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;
    private String getAttributeName(@NotNull DBSTable table, @NotNull DBSAttributeBase attribute) {
    public String getTrailingClause(@NotNull DBSTable table, @NotNull DBRProgressMonitor monitor, DBSAttributeBase[] attributes) {
                log.debug("Can't find table constraints for the correct update on conflict operation.");
                query.append(" ").append(String.format(onConflictExpression, constraintAttrNames, updateExpression));
        @NotNull StringBuilder updateExpression
                    Optional<? extends DBSTableIndex> optional = indexes.stream().filter(DBSTableIndex::isUnique).findFirst();
                }
        }
package org.jkiss.dbeaver.ext.postgresql.model;
                        List<? extends DBSTableIndexColumn> references = tableIndex.getAttributeReferences(monitor);
    @Override
        }
import java.util.List;
        }
            }

            if (DBUtils.isPseudoAttribute(attribute)) {
 */
        return query.toString();
            if (hasKey) updateExpression.append(","); //$NON-NLS-1$
    }
                if (tableConstraint.isPresent()) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;
    private void getConstraintAttributesNames(
        return DBUtils.isPseudoAttribute(attribute) ? attribute.getName() : DBUtils.getObjectFullName(table.getDataSource(), attribute, DBPEvaluationContext.DML);
        @NotNull List<? extends DBSEntityAttributeRef> attributeReferences
public class PostgreInsertReplaceMethod implements DBDInsertReplaceMethod {
                return null;
                    }

import org.jkiss.dbeaver.model.struct.DBSAttributeBase;

    @Override
}
 * DBeaver - Universal Database Manager
                continue;
        @NotNull StringBuilder constraintAttrNames,
                updateExpression.append(")");
            }
 *
                if (!CommonUtils.isEmpty(indexes)) {
    private static final Log log = Log.getLog(PostgreInsertReplaceMethod.class);
 * See the License for the specific language governing permissions and
                addAttributesNamesList(table, attributes, false, updateExpression);
        for (DBSEntityAttributeRef column : attributeReferences) {
        @NotNull DBSAttributeBase[] attributes,
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (isExcluded) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                        if (!CommonUtils.isEmpty(references)) {
        boolean isExcluded,
                continue;
                    .findFirst();
                // Let's search for a unique index
            if (constraintAttrNames.isEmpty()) {
    private void addAttributesNamesList(
            StringBuilder constraintAttrNames = new StringBuilder();
                }
                Optional<? extends DBSTableConstraint> tableConstraint = constraints.stream()
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.Log;
                // First we are looking for a primary key
 *
            updateExpression.append(getAttributeName(table, attribute));
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
        try {
            }
import org.jkiss.code.NotNull;
