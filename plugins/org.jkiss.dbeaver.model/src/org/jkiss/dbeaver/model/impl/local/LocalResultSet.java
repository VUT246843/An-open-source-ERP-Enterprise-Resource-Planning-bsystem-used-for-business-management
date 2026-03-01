 *     http://www.apache.org/licenses/LICENSE-2.0
        }

        LocalResultSetColumn column = new LocalResultSetColumn(this, metaColumns.size(), label, typedObject);

            }
        }
    protected void addColumn(@NotNull LocalResultSetColumn column) {

        return true;

        metaColumns.add(column);
    @NotNull
 * limitations under the License.
public class LocalResultSet<SOURCE_STMT extends DBCStatement> extends AbstractResultSet<DBCSession, SOURCE_STMT> {

package org.jkiss.dbeaver.model.impl.local;
import org.jkiss.code.Nullable;
        return metaColumns.get(index);
        if (curPosition + 1 >= rows.size()) {
        Object[] row = rows.get(curPosition);


        metaColumns.clear();
    public int getColumnCount() {
    @Override
    @Override
            if (metaColumns.get(i).getName().equals(name)) {

}
 * you may not use this file except in compliance with the License.
    public Object getAttributeValue(int index) throws DBCException {
    }
 * LocalResultSet
        return super.getFeature(name);
        for (int i = 0; i < metaColumns.size(); i++) {
        return column;
    }
 * DBeaver - Universal Database Manager
    public DBCAttributeMetaData addColumn(String label, DBSTypedObject typedObject) {
        super(session, statement);
    }
import org.jkiss.code.NotNull;
    @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        return metaColumns.size();
 * You may obtain a copy of the License at
    }
        curPosition = -1;
    @Override
        curPosition++;
    @Override
            return true;
    }
                return getAttributeValue(i);
        return row[index];
    @NotNull
 */
    public LocalResultSet(@NotNull DBCSession session, @NotNull SOURCE_STMT statement) {

        rows.clear();
 */
import java.util.ArrayList;
    public Object getFeature(String name) {

    public DBCAttributeMetaData addColumn(String label, DBPDataKind dataKind) {
        return true;
/**
    private final List<DBCAttributeMetaData> metaColumns = new ArrayList<>();
        metaColumns.add(column);
    @Override

            return false;
    }
    protected final List<Object[]> rows = new ArrayList<>();


            return false;
        if (name.equals(FEATURE_NAME_LOCAL)) {
    public boolean nextRow() {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        throw new DBCException("Bad attribute name: " + name);
    protected int curPosition = -1;
 *
        LocalResultSetColumn column = new LocalResultSetColumn(this, metaColumns.size(), label, dataKind);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPDataKind;
/*
        }
    }
    }
        if (index >= row.length) {
 *

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

    protected DBCAttributeMetaData getMetaColumn(int index) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.*;
import org.jkiss.dbeaver.model.impl.AbstractResultSet;
    }
        return column;
        metaColumns.add(column);
            throw new DBCException("Attribute index out of range (" + index + "/" + row.length + ")");
    public void addRow(Object... values) {

        }
        rows.add(values);
 * Unless required by applicable law or agreed to in writing, software

 *
        if (position < 0 || position >= rows.size()) {
    public Object getAttributeValue(String name) throws DBCException {
    public boolean moveTo(int position) throws DBCException {
    public DBCResultSetMetaData getMeta() throws DBCException {

        }
    @Override
import java.util.List;

        return new LocalResultSetMeta(metaColumns);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Nullable
    public void close() {
    }
        curPosition = position;
    }
