    @Override
        int options
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
            }
        @NotNull EnumSet<DBDValueHint.HintType> types,
 *
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
    ) {
        @NotNull DBDResultSetModel model,
 * Unless required by applicable law or agreed to in writing, software
/*
                        "SRS:" + srid,
 * you may not use this file except in compliance with the License.


 * See the License for the specific language governing permissions and
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.data.hints.ValueHintText;
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
import org.jkiss.dbeaver.model.data.DBDResultSetModel;
        @NotNull DBDAttributeBinding attribute,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Nullable Object value,
    }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
/**
                };
 *
            int srid = geometry.getSRID();
        }
        @NotNull DBDValueRow row,
 * GIS hint provider
 * You may obtain a copy of the License at
public class GisCellHintProvider implements DBDCellHintProvider {
                        "SRID", null)
                    new ValueHintText(
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBDValueHint[] getCellHints(
import org.jkiss.dbeaver.model.gis.DBGeometry;

            if (srid > 0) {
package org.jkiss.dbeaver.model.gis.hints;
import org.jkiss.dbeaver.model.data.hints.DBDCellHintProvider;
import org.jkiss.dbeaver.model.data.DBDValueRow;

import org.jkiss.code.Nullable;
 */
 *
import java.util.EnumSet;
}
import org.jkiss.code.NotNull;
                return new DBDValueHint[]{
        if (value instanceof DBGeometry geometry) {

