import org.jkiss.utils.ByteNumberFormat;
import java.sql.ResultSet;

    }
public class AltibaseDataFile4Mem extends AltibaseDataFile {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, order = 4, formatter = ByteNumberFormat.class)
 * You may obtain a copy of the License at

/*
    protected AltibaseDataFile4Mem(AltibaseTablespace tablespace, ResultSet dbResult) {
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * you may not use this file except in compliance with the License.
    public long getCurrSize() {
        super(tablespace, dbResult);
import java.math.BigInteger;
 *
 * limitations under the License.
    private long currSize;
        this.currSize = new BigInteger(JDBCUtils.safeGetString(dbResult, "CURRENT_SIZE")).longValue();
 * DBeaver - Universal Database Manager
        return currSize;
}

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    
 *
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.meta.Property;
 *
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.altibase.model;
