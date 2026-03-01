        ) {

 */

        @NotNull DBDResultSetModel model,
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.data.DBDRowIdentifier;

                    null));
 *
import org.jkiss.utils.CommonUtils;
        @NotNull EnumSet<DBDValueHint.HintType> types,
            .map(r -> {
        DBDRowIdentifier rowIdentifier = attribute.getRowIdentifier();
import org.jkiss.dbeaver.model.data.hints.ValueHintText;
                    DataMessages.hint_attr_keys_refers_to + ": " + getRefTableNames(attribute.getReferrers()),
 * Attribute keys hint provider
 * you may not use this file except in compliance with the License.
    }
                    "Unique key which will be used to edit this column's value",
        }
    @Nullable
        if (!CommonUtils.isEmpty(attribute.getReferrers())) {
    }
                           .map(ar -> ar.getAttribute().getName())+ ")"*/;
                    DataMessages.hint_attr_keys_part_of + ": " +
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
import org.jkiss.dbeaver.model.data.hints.DBDAttributeHintProvider;
                    DBIcon.OVER_REFERENCE));
/**
import java.util.List;
        }
                        rowIdentifier.getAttributes().stream().map(DBDAttributeBinding::getName)
                    }
 * You may obtain a copy of the License at
                        "(" +
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
                return null;

                if (r instanceof DBSEntityAssociation assoc) {
    public DBDValueHint[] getAttributeHints(
import java.util.stream.Collectors;
                    null,
                }
        if (rowIdentifier != null &&
        return referrers.stream()
public class AttributeKeysHintProvider implements DBDAttributeHintProvider {
 * See the License for the specific language governing permissions and
                    DBSEntity entity = assoc.getAssociatedEntity();
        return hints.toArray(new DBDValueHint[0]);
 * Licensed under the Apache License, Version 2.0 (the "License");
            .collect(Collectors.joining(","));
                    null,
        int options
        if (rowIdentifier != null && rowIdentifier.hasAttribute(attribute)) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            .filter(Objects::nonNull)
import org.jkiss.dbeaver.model.struct.DBSEntity;
 */
        @NotNull DBDAttributeBinding attribute,
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
package org.jkiss.dbeaver.model.data.hints.standard;
    private String getRefTableNames(List<DBSEntityReferrer> referrers) {
                           r.getAttributeReferences(null).stream()
                        return DBUtils.getObjectFullName(entity, DBPEvaluationContext.UI)
import org.jkiss.dbeaver.model.data.messages.DataMessages;
                        /* + "(" +
 * limitations under the License.


import org.jkiss.dbeaver.model.DBIcon;
 * Unless required by applicable law or agreed to in writing, software
            hints.add(
 * DBeaver - Universal Database Manager
/*
import org.jkiss.dbeaver.model.data.DBDResultSetModel;

    ) {
                    DBIcon.OVER_KEY));
            !rowIdentifier.isIncomplete() &&
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import java.util.EnumSet;
            rowIdentifier != model.getDefaultRowIdentifier()
                    DataMessages.hint_attr_keys_unique_key + ": " +
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
                        rowIdentifier.getEntity().getName() +
    @Override
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
            hints.add(
            hints.add(
                        ")",
import org.jkiss.code.NotNull;
import java.util.ArrayList;
import java.util.Objects;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        DBUtils.getObjectFullName(rowIdentifier.getUniqueKey(), DBPEvaluationContext.UI),
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

                new ValueHintText(
                    if (entity != null) {
            })
                            .collect(Collectors.joining(",")) +
                new ValueHintText(
 *
                new ValueHintText(
        List<DBDValueHint> hints = new ArrayList<>();
