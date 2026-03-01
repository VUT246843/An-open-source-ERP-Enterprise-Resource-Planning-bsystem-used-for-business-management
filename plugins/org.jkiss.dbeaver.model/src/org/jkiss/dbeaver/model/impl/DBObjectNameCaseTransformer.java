
        }
    @Override
                return value;
 *     http://www.apache.org/licenses/LICENSE-2.0

        if (isNameCaseSensitive) {
        final SQLDialect dialect = dataSource.getSQLDialect();
    {
            value = DBUtils.getUnQuotedIdentifier(dataSource, value);
/**
/*
        if (!DBUtils.getQuotedIdentifier(dataSource, xName).equals(xName)) {
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
        if (DBUtils.isQuotedIdentifier(dataSource, value)) {
                return value;
    public static String transformName(@NotNull DBPDataSource dataSource, @Nullable String value)
 * DBeaver - Universal Database Manager
        final boolean isNameCaseSensitive = dataSource.getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CASE_SENSITIVE) ||
    public static String transformObjectName(DBSObject object, String value)
import org.jkiss.dbeaver.model.meta.IPropertyValueTransformer;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

            }
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.SQLDialect;

            if (dialect.supportsQuotedMixedCase()) {
    public String transform(@NotNull DBSObject object, @Nullable String value)
        return xName;
        return transformName(object.getDataSource(), value);
 * You may obtain a copy of the License at
            return value;
    @Nullable
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
            return null;
 */
package org.jkiss.dbeaver.model.impl;
            // Name contains special characters and has to be quoted - leave it as is
 *
            return value;
public class DBObjectNameCaseTransformer implements IPropertyValueTransformer<DBSObject, String> {
}
        if (value == null) {
            }
    {
 *
 * Object name case transformer
            dialect.storesUnquotedCase() == DBPIdentifierCase.MIXED;
        if (dataSource == null) {
import org.jkiss.dbeaver.model.DBPDataSource;
        }


        }
 * See the License for the specific language governing permissions and
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ModelPreferences;

            if (dialect.supportsUnquotedMixedCase() || dialect.storesUnquotedCase() == null) {
        } else {
        // condition added for mock test cases
    @Nullable
import org.jkiss.dbeaver.model.DBUtils;
        String xName = dialect.storesUnquotedCase().transform(value);
    {
            return value;
        }
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *
import org.jkiss.dbeaver.model.DBPIdentifierCase;
        return transformName(object.getDataSource(), value);
    }
