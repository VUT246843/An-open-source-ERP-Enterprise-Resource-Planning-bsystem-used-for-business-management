    }
import org.jkiss.dbeaver.model.DBUtils;
    }

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
        return super.equals(obj);
        this.state = STATE_NORMAL;
 * Row data
 * Unless required by applicable law or agreed to in writing, software
 *
 */
        this.visualNumber = visualNumber;
        changes.remove(attr);

            DBUtils.releaseValue(oldValue);
        return changes.get(attr);
    }
import org.jkiss.code.Nullable;
        return values;
    // Physical row number

        @Nullable
    }
        this.values = values;
 * See the License for the specific language governing permissions and
/**
    ResultSetRow(int rowNumber, @NotNull Object[] values) {
public class ResultSetRow implements DBDValueRow {
    }
    }
    public void setState(byte state) {

    public Object[] getValues() {
    public ColorInfo colorInfo;
    void release() {
            ResultSetRow row = (ResultSetRow)obj;

    public int getVisualNumber() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.



import java.util.Collection;
 * you may not use this file except in compliance with the License.
    public int getRowNumber() {
    @Override
    }

        this.rowNumber = rowNumber;
        public Color rowBackground;
    private final Map<DBDAttributeBinding, Object> changes = new HashMap<>();
        return changes.keySet();
    }
        return !changes.isEmpty();
        }
package org.jkiss.dbeaver.ui.controls.resultset;
            DBUtils.releaseValue(value);
        changes.clear();
 */
 * limitations under the License.
    public void clearChange(@NotNull DBDAttributeBinding attr) {
    public static final byte STATE_NORMAL = 1;
        @Nullable
    @Override
        changes.put(attr, oldValue);
        return rowNumber;
    private int visualNumber;
    public boolean equals(Object obj) {
                this.visualNumber == row.visualNumber;
        for (Object value : values) {
    }
        public Color rowForeground;
    }
        @Nullable
        return state;
    public void setRowNumber(int rowNumber) {
    public static final byte STATE_ADDED = 2;

    }
    public static class ColorInfo {
        public Color[] cellFgColors;
    }
    @Nullable
    }
import org.jkiss.code.NotNull;
 *
    }
    @Override
    private int rowNumber;

        return attr != null && changes.containsKey(attr);
            return
    }
    @NotNull
        @Nullable

}

    // Column values
    private byte state;
/*
        this.state = state;
    public String toString() {
        return String.valueOf(rowNumber);
import java.util.Map;
    }
    public boolean isChanged(@Nullable DBDAttributeBinding attr) {

    public void addChange(@NotNull DBDAttributeBinding attr, @Nullable Object oldValue) {
import java.util.HashMap;
    public Object getChange(@NotNull DBDAttributeBinding attr) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;


    public Iterable<Map.Entry<DBDAttributeBinding, Object>> getChanges() {

    public Collection<DBDAttributeBinding> getChangedAttributes() {
    public static final byte STATE_REMOVED = 3;
 * DBeaver - Universal Database Manager
        return visualNumber;

    public Object[] values;
    @NotNull
    }
        changes.entrySet().removeIf(entry -> attr.equals(entry.getValue()));
    @Override
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.data.DBDValueRow;
        }

        // We reset entire row changes. Cleanup all references on the same top attribute
    // Row number in grid
        }
                this.rowNumber == row.rowNumber &&
        this.rowNumber = rowNumber;



        if (obj instanceof ResultSetRow) {
    public void setVisualNumber(int visualNumber) {
 * You may obtain a copy of the License at
    public int getChangesCount() {
 *
    // Row state
        this.visualNumber = rowNumber;
        return changes.size();
    }

    }

    }
    public boolean isChanged() {
    public void clearChanges() {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.graphics.Color;
        for (Object oldValue : changes.values()) {


    public byte getState() {


 * distributed under the License is distributed on an "AS IS" BASIS,
        public Color[] cellBgColors;

        return () -> changes.entrySet().iterator();
    @Nullable
