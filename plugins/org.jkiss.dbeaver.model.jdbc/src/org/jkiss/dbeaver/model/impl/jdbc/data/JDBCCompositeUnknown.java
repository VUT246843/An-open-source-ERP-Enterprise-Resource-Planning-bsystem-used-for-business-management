/**
        return new JDBCCompositeUnknown(this, monitor);
/*
    public String getStringRepresentation() {
import org.jkiss.dbeaver.model.exec.DBCException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.attributes = new DBSEntityAttribute[0];// { new StructAttribute(type, 0, structData) };
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
    public JDBCCompositeUnknown cloneValue(DBRProgressMonitor monitor) throws DBCException {

 * DBeaver - Universal Database Manager
    public JDBCCompositeUnknown(@NotNull JDBCComposite struct, @NotNull DBRProgressMonitor monitor) throws DBCException {
 * you may not use this file except in compliance with the License.
public class JDBCCompositeUnknown extends JDBCComposite {
    public JDBCCompositeUnknown(@NotNull DBCSession session, @Nullable Object structData) {
        super(monitor, struct);
        return Arrays.toString(values);
}

 * You may obtain a copy of the License at
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    @Override
        super(null);
    }


        this.type = new StructType(session.getDataSource());
        this.values = new Object[]{structData};
import org.jkiss.code.Nullable;
    }
 *
import java.util.Arrays;

    }
 */

import org.jkiss.dbeaver.model.exec.DBCSession;
 * Unknown struct.
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

 *
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.impl.jdbc.data;
