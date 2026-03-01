            return null;
        if (CommonUtils.isEmpty(referrers)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
 * You may obtain a copy of the License at
 * It is declared in UI bundle because it provides interaction with data editor
    @Nullable
import java.util.EnumSet;
 */
        return new DBDValueHint[]{new ValueHintReference(references)};
        }
        @NotNull DBDValueRow row,
import org.jkiss.code.NotNull;
/**
import org.jkiss.dbeaver.model.data.DBDResultSetModel;
            return null;
package org.jkiss.dbeaver.ui.data.hints;
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
 * Reference hint provider.
}
 *
        @NotNull EnumSet<DBDValueHint.HintType> types,
 */
 * Unless required by applicable law or agreed to in writing, software
import java.util.ArrayList;
import org.jkiss.utils.CommonUtils;
 *
        for (DBSEntityReferrer referrer : referrers) {
        @NotNull DBDAttributeBinding attribute,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

            }
 * See the License for the specific language governing permissions and
                    references.add(new ValueHintReference.Reference(row, association));
                if (constraint != null) {
/*
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
 * DBeaver - Universal Database Manager
        int options
        if (DBUtils.isNullValue(value)) {
        }
    }
 * limitations under the License.
import org.jkiss.dbeaver.model.data.DBDValueRow;
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
        }
            if (referrer instanceof DBSEntityAssociation association) {
import org.jkiss.code.Nullable;
        if (references.isEmpty()) {
 * you may not use this file except in compliance with the License.
 *
        }

        @Nullable Object value,

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
    public DBDValueHint[] getCellHints(
import org.jkiss.dbeaver.model.data.hints.DBDCellHintProvider;

        var referrers = attribute.getReferrers();
        @NotNull DBDResultSetModel model,
        var references = new ArrayList<ValueHintReference.Reference>();
    ) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            return null;
                DBSEntityConstraint constraint = association.getReferencedConstraint();
public class ReferenceCellHintProvider implements DBDCellHintProvider {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
