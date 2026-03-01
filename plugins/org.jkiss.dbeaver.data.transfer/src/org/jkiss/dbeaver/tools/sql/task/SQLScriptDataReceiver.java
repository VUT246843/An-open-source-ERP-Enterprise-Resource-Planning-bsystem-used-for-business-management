        this.dumpWriter = writer;
            return;
            try {
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) throws DBCException {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
                throw new DBCException("IOException writing to dumpWriter", e);
 * limitations under the License.
        if (dumpWriter != null) {
    }
    }
            } catch (IOException e) {
                throw new DBCException("IOException writing to dumpWriter", e);
 * SQLScriptDataReceiver
import org.jkiss.dbeaver.model.data.DBDValueHandler;
            try {
/**
                dumpWriter.append("\n");
 */
 */
package org.jkiss.dbeaver.tools.sql.task;
 *     http://www.apache.org/licenses/LICENSE-2.0

        }

    @Override
        return dumpWriter;
                    } else {
    public void fetchEnd(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) throws DBCException {
            attributes = rsMeta.getAttributes();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Writer getDumpWriter() {
                dumpWriter.append("Columns:\t");

                dumpWriter.append("\n");
        if (dumpWriter != null) {

                }
    }
 *
                throw new DBCException("IOException writing to dumpWriter", e1);
}
import java.io.Writer;
    }
                dumpWriter.flush();
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBUtils;
 * you may not use this file except in compliance with the License.
            } catch (IOException e) {

                        dumpWriter.append("NULL\t");
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
            rowSize = attributes.size();
    @Override
    private Integer rowSize;
 *
    private List<? extends DBCAttributeMetaData> attributes;
import org.jkiss.dbeaver.model.exec.*;
import java.util.List;
    }
            }
 * You may obtain a copy of the License at
    }
            }
                    if (resultSet.getAttributeValue(i) != null) {
    public void setDumpWriter(Writer writer) {
        if (resultSet == null) {

        if (dumpWriter != null) {

    private Writer dumpWriter;
    public void fetchStart(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, long offset, long maxRows) throws DBCException {
            DBCResultSetMetaData rsMeta = resultSet.getMeta();
public class SQLScriptDataReceiver implements DBDDataReceiver {
                for (DBCAttributeMetaData attribute : attributes) {
            return;
            }



 *
    @Override
                        dumpWriter.append(object.toString()).append("\t");
                for (int i = 0; i < rowSize; i++) {
        if (resultSet == null) {
        }
        }
                    	DBCAttributeMetaData type = attributes.get(i);
        }
    @Override
 * Unless required by applicable law or agreed to in writing, software
                    }
        }
import java.io.IOException;
 * See the License for the specific language governing permissions and

            try {

                }
    public void close() {
                    	Object object = valueHandler.fetchValueObject(session, resultSet, type, i);
                    	DBDValueHandler valueHandler = DBUtils.findValueHandler(session, type);
                    dumpWriter.append(attribute.getLabel() + "\t");
            } catch (IOException e1) {
