import org.jkiss.utils.ByteNumberFormat;


    private State state;
    }
    @Property(viewable = true, order = 4, formatter = ByteNumberFormat.class)
    public String getState() {
import java.math.BigInteger;
    
import org.jkiss.dbeaver.ext.altibase.model.AltibaseTablespace.State;

        this.maxSize  = new BigInteger(JDBCUtils.safeGetString(dbResult, "MAXSIZE"));
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.meta.Property;
        return maxSize.multiply(new BigInteger(this.getParentObject().getPageSizeInBytesStr()));
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
}public class AltibaseDataFile4Disk extends AltibaseDataFile {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
        return currSize.multiply(new BigInteger(this.getParentObject().getPageSizeInBytesStr()));
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    
    }

    private BigInteger nextSize;
    
        this.nextSize = new BigInteger(JDBCUtils.safeGetString(dbResult, "NEXTSIZE"));
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return this.isAutoExtend;
        this.isAutoExtend = (JDBCUtils.safeGetInt(dbResult, "AUTOEXTEND") == 1);
 * you may not use this file except in compliance with the License.
        return initSize.multiply(new BigInteger(this.getParentObject().getPageSizeInBytesStr()));
    }
    private BigInteger initSize;
 * limitations under the License.
    
 * DBeaver - Universal Database Manager
        return nextSize.multiply(new BigInteger(this.getParentObject().getPageSizeInBytesStr()));
        return this.state.name();
    @Property(viewable = true, order = 6, formatter = ByteNumberFormat.class)
    
    protected AltibaseDataFile4Disk(AltibaseTablespace tablespace, ResultSet dbResult) {
        this.state = State.getStateByIdx(JDBCUtils.safeGetInt(dbResult, "STATE"));
        this.currSize = new BigInteger(JDBCUtils.safeGetString(dbResult, "CURRSIZE"));
    @Property(viewable = true, order = 7, formatter = ByteNumberFormat.class)
 * You may obtain a copy of the License at
    public BigInteger getInitSize() {
        super(tablespace, dbResult);
    private BigInteger maxSize;
    public BigInteger getCurrSize() {
    @Property(viewable = true, order = 8)
package org.jkiss.dbeaver.ext.altibase.model;
    }
    @Property(viewable = true, order = 10)
 *
    public BigInteger getMaxSize() {

        this.initSize = new BigInteger(JDBCUtils.safeGetString(dbResult, "INITSIZE"));
 *
 */
    private boolean isAutoExtend;
    
    @Property(viewable = true, order = 5, formatter = ByteNumberFormat.class)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    
    public BigInteger getNextSize() {
    private BigInteger currSize;
    }
    public boolean getAutoExtend() {
/*
import java.sql.ResultSet;
