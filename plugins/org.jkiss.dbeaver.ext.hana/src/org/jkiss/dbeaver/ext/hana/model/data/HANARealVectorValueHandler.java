                throw new DBCException("NULL elements are not allowed in REAL_VECTOR");
 * you may not use this file except in compliance with the License.
        }
            throw new DBCException("Only REAL numbers are allowed in REAL_VECTOR");
 * You may obtain a copy of the License at
            if (val == null) {
 * Contributors:
            @NotNull JDBCCollection collection)
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
        float[] nvals = new float[collection.size()];
public class HANARealVectorValueHandler extends HANAVectorValueHandler {

import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCollection;
import org.jkiss.code.NotNull;
 *    Stefan Uhrig - initial implementation
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
package org.jkiss.dbeaver.ext.hana.model.data;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
 *
    public static final HANARealVectorValueHandler INSTANCE = new HANARealVectorValueHandler();
 * See the License for the specific language governing permissions and

    protected void bindVectorParameter(@NotNull JDBCPreparedStatement statement, int paramIndex,
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
 *
        for (int i = 0; i < nvals.length; ++i) {
            throws DBCException, SQLException {
        if (collection.getComponentType().getTypeID() != Types.REAL) {
 * DBeaver - Universal Database Manager
 *
import java.sql.SQLException;
 */
    }
import java.sql.Types;
/*
 * Licensed under the Apache License, Version 2.0 (the "License");

        statement.setObject(paramIndex, nvals);
 *    Frederick Arand - moved code to separate file
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
}
 * limitations under the License.
            nvals[i] = val;

 * distributed under the License is distributed on an "AS IS" BASIS,
            Float val = (Float) collection.get(i);
