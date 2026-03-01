    @Override
 *
 * you may not use this file except in compliance with the License.
    public long getCount() {
 * Label value pair with count
    private long count;
 */
    public DBDLabelValuePairExt(String label, Object value, long count) {
import org.jkiss.code.NotNull;
        return super.compareTo(o);


 */
/*
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
                return (int) countCmp;
 * You may obtain a copy of the License at
        if (o instanceof DBDLabelValuePairExt) {


public class DBDLabelValuePairExt extends DBDLabelValuePair {
            }
package org.jkiss.dbeaver.model.data;
            long countCmp = ((DBDLabelValuePairExt) o).count - count;
/**
        this.count = count;


        }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(label, value);
    }
}
        return count;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void incCount() {
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
    }
    public int compareTo(@NotNull Object o) {
    }
 *
        this.count++;

            if (countCmp != 0) {
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
