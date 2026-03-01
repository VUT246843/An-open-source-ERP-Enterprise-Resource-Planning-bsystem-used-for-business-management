 *     http://www.apache.org/licenses/LICENSE-2.0
            case PostgreOid.INTERVAL:
    }
        if (PostgreUtils.isGISDataType(type.getTypeName().toLowerCase())) {
    private PostgreTypeHandlerProvider() {
 * limitations under the License.

    @Nullable
    }
                return PostgreStringTypeHandler.INSTANCE;
    public static PostgreTypeHandler getTypeHandler(@NotNull PostgreDataType type) {
            case PostgreOid.FLOAT8:
            case PostgreOid.TIMETZ:
            case PostgreOid.TIMESTAMPTZ:
 *
}

            case PostgreOid.FLOAT4:
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.postgresql.model.PostgreOid;
 * See the License for the specific language governing permissions and
            case PostgreOid.BIT:
            if (type.getDataSource().getServerType() instanceof PostgreServerRedshift) {
/*
package org.jkiss.dbeaver.ext.postgresql.model.data.type;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.postgresql.model.impls.redshift.PostgreServerRedshift;
 * distributed under the License is distributed on an "AS IS" BASIS,
            case PostgreOid.BPCHAR:
                return PostgreIntervalTypeHandler.INSTANCE;
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
public class PostgreTypeHandlerProvider {
            case PostgreOid.CHAR:
 */
 * DBeaver - Universal Database Manager
            }
        }
import org.jkiss.code.Nullable;
                return PostgreEmptyTypeHandler.INSTANCE;
 *
                return PostgreNumericTypeHandler.INSTANCE;
            case PostgreOid.TIMESTAMP:
            default:
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // disallow constructing singleton class
            } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            case PostgreOid.VARCHAR:

            case PostgreOid.NUMERIC:
            case PostgreOid.VARBIT:

                return PostgreGeometryTypeHandler.INSTANCE;
                return null;
        }
            case PostgreOid.TIME:
        switch ((int) type.getObjectId()) {
 *
                return PostgreTimeTypeHandler.INSTANCE;
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
