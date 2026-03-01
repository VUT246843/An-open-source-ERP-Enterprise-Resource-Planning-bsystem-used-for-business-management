 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 *
        if (!object.isNull()) {
    @Override
 * See the License for the specific language governing permissions and
        }
            writer.write("')");
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.io.Writer;
    }
 * Unless required by applicable law or agreed to in writing, software
 * CLOB handler
import java.io.IOException;
            writer.write("HEXTORAW('");

package org.jkiss.dbeaver.ext.oracle.data;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.DBPDataSource;
    public void writeStreamValue(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull DBSTypedObject type, @NotNull DBDContent object, @NotNull Writer writer) throws DBCException, IOException {
 */
/*
 *
        if (!object.isNull()) {
    public static final OracleBLOBValueHandler INSTANCE = new OracleBLOBValueHandler();

import org.jkiss.dbeaver.model.data.DBDContent;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;
/**

 *
        }
 * limitations under the License.
}
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCException;
 * Licensed under the Apache License, Version 2.0 (the "License");
        super.writeStreamValue(monitor, dataSource, type, object, writer);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class OracleBLOBValueHandler extends JDBCContentValueHandler {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
