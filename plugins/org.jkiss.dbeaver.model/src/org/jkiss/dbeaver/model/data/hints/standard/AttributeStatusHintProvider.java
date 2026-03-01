import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.data.hints.DBDAttributeHintProvider;
        String readOnlyStatus = model.getReadOnlyStatus(dataSource == null ? null : dataSource.getContainer());
 * Unless required by applicable law or agreed to in writing, software
 */
    @Override
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
        @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
        int options
 * Copyright (C) 2010-2026 DBeaver Corp and others
        public int getHintOptions() {
}
    }


 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBExecUtils;
    }
public class AttributeStatusHintProvider implements DBDAttributeHintProvider {
                    "Read-only: " + readOnlyStatus)
            super(text, null, null);
                new ValueHintReadOnly(


package org.jkiss.dbeaver.model.data.hints.standard;
    static class ValueHintReadOnly extends ValueHintText {
        @NotNull DBDResultSetModel model,
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        public ValueHintReadOnly(@NotNull String text) {
import org.jkiss.dbeaver.model.data.DBDResultSetModel;
        @NotNull DBDAttributeBinding attribute,
            return OPTION_READ_ONLY;
    public DBDValueHint[] getAttributeHints(
 * limitations under the License.
        DBPDataSource dataSource = attribute.getDataSource();
        }
            };
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSource;

 *

        @NotNull EnumSet<DBDValueHint.HintType> types,
        }
    @Nullable
 */
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
import org.jkiss.dbeaver.model.data.hints.ValueHintText;
 *

        if (readOnlyStatus == null) {
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
 * Attribute status hint provider
            return new DBDValueHint[] {
        }
import java.util.EnumSet;
            readOnlyStatus = DBExecUtils.getAttributeReadOnlyStatus(attribute, true);
    ) {
 *


        if (readOnlyStatus != null) {
