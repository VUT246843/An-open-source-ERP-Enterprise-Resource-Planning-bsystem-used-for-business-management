    }
 * Unless required by applicable law or agreed to in writing, software
 * CLOB handler
        int partCount = strValue.length() / MAX_PART_SIZE;
            return;
    public static final OracleCLOBValueHandler INSTANCE = new OracleCLOBValueHandler();
            int endOffset = Math.min(strValue.length(), startOffset + MAX_PART_SIZE);
        String strValue = ContentUtils.getContentStringValue(monitor, object);
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;
 *
 * See the License for the specific language governing permissions and
                String part = parts[i];
/**
import org.jkiss.dbeaver.utils.ContentUtils;
}
    public static final int MAX_PART_SIZE = 2000;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager
            parts[i] = strValue.substring(startOffset, endOffset);
 * limitations under the License.
                writer.write("TO_CLOB('");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            for (int i = 0; i < parts.length; i++) {
        if (strValue.length() % MAX_PART_SIZE > 0) partCount++;
    private static String[] splitString(String strValue) {

 * Licensed under the Apache License, Version 2.0 (the "License");


import java.io.Writer;
        for (int i = 0; i < partCount; i++) {
 */
 * you may not use this file except in compliance with the License.
                writer.write(part.replace("'", "''"));
        DBDContentStorage contents = object.getContents(monitor);
import org.jkiss.dbeaver.model.exec.DBCException;
public class OracleCLOBValueHandler extends JDBCContentValueHandler {
        }
import org.jkiss.dbeaver.model.DBPDataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.oracle.data;
/*
import org.jkiss.code.NotNull;
            writer.write("NULL");
            int startOffset = i * MAX_PART_SIZE;
        }
        if (strValue != null) {
        return parts;
 *
            String[] parts = splitString(strValue);
                writer.write("')");
import org.jkiss.dbeaver.model.data.DBDContentStorage;
    public void writeStreamValue(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull DBSTypedObject type, @NotNull DBDContent object, @NotNull Writer writer) throws DBCException, IOException {
    }
        String[] parts = new String[partCount];
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.io.IOException;

    @Override

        if (DBUtils.isNullValue(contents)) {
import org.jkiss.dbeaver.model.data.DBDContent;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 */

                if (i > 0) writer.write("||");
 *
            }
