        this.maxValue = maxValue;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public boolean getCycle() {
            sb.append("MINVALUE ").append(getMinValue()).append(" ");
}
    }
    @Property(viewable = true, editable = true, updatable = true, order = 3)
        if (isCycle()) {
            return lastValue;
        return source;
    }
            sb.append("CYCLE");
    public void setMinValue(BigDecimal minValue) {
        this.minValue       = new BigDecimal(1);


    
    
    @Override
    }

import java.math.BigDecimal;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public BigDecimal getMinValue() {
     * Unable to use DBMS_METADATA for sequence because it returns 'START_WITH' value 
import org.jkiss.dbeaver.DBException;
        return startWith;
    }
    public BigDecimal getStartWith() {
        
    }
        sb.append(";");
        this.lastValue      = JDBCUtils.safeGetBigDecimal(dbResult, "CURRENT_SEQ");
    public AltibaseSequence(GenericStructContainer container, String name) {
    @Property(viewable = true, editable = true, updatable = true, order = 7)
        this.minValue = minValue;
/*
    public void setMaxValue(BigDecimal maxValue) {
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (lastValue == null) {
        } else {
        
        
        return flagCycle;
    public void setLastValue(BigDecimal lastValue) {
    private BigDecimal cacheSize;
        return sb.toString();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public BigDecimal getIncrementBy() {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {

        super(container, JDBCUtils.safeGetString(dbResult, "TABLE_NAME"), "", 0, 0, 0, 0);
    @Property(viewable = true, editable = true, updatable = true, order = 5)
        if (getCacheSize().compareTo(BigDecimal.ZERO) > 0) {
    }
 */
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
    }
        if (getIncrementBy() != null) {
            sb.append("MAXVALUE ").append(getMaxValue()).append(" ");
    public boolean isCycle() { 
        this.incrementBy    = new BigDecimal(1);

    
 * You may obtain a copy of the License at

    }
    }
    }

        if (source == null) {
        this.maxValue       = JDBCUtils.safeGetBigDecimal(dbResult, "MAX_SEQ");
    @Property(viewable = true, editable = true, updatable = true, order = 6)

            sb.append("NOCYCLE");
        }
    }
    public String getDescription() {
    public void setCacheSize(BigDecimal cacheSize) {
        return flagCycle; 

 * Unless required by applicable law or agreed to in writing, software



        if (getMinValue() != null) {
    }
            source = buildStatement(false);
    /**
import java.util.Map;
 * DBeaver - Universal Database Manager
        this.cacheSize = cacheSize;
        }
        return maxValue;
        this.lastValue = lastValue;
    }
    @Override
    private BigDecimal maxValue;
            sb.append("INCREMENT BY ").append(getIncrementBy()).append(" ");
        /* If the target sequence has not been used at all, the CURRENT_SEQ returns NULL value */
        // Default sequence


        StringBuilder sb = new StringBuilder();
 * See the License for the specific language governing permissions and
        if ((!forUpdate) && (getStartWith() != null)) {
            sb.append("CREATE SEQUENCE ");
    @Override


import org.jkiss.dbeaver.model.DBPScriptObject;
    

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    private String source;
    @NotNull

    public AltibaseSequence(GenericStructContainer container, JDBCResultSet dbResult) {
        } else {
        super(container, name);
            sb.append("NOCACHE ");
            sb.append("CACHE ").append(getCacheSize()).append(" ");
        
        this.flagCycle = flagCycle;
 */
 * limitations under the License.

        return null;
    }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class AltibaseSequence extends GenericSequence implements DBPScriptObject {
    private BigDecimal lastValue;
    }
            sb.append("ALTER SEQUENCE ");
        this.cacheSize      = JDBCUtils.safeGetBigDecimal(dbResult, "CACHE_SIZE");
        this.incrementBy    = JDBCUtils.safeGetBigDecimal(dbResult, "INCREMENT_SEQ");
        }
    @Property(viewable = true, order = 2)

     */
        return minValue;
        return cacheSize;
    public void setCycle(boolean flagCycle) {
/**

    public BigDecimal getCacheSize() {
        this.flagCycle      = JDBCUtils.safeGetBoolean(dbResult, "IS_CYCLE", AltibaseConstants.RESULT_YES_VALUE);
        this.flagCycle      = true;
    @Override

 * you may not use this file except in compliance with the License.
 *
    private BigDecimal startWith;
    public BigDecimal getMaxValue() {
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
        }
    @Property(viewable = false, hidden = true, order = 10)

        this.startWith      = JDBCUtils.safeGetBigDecimal(dbResult, "START_SEQ");
    @Override
 *
        }
        this.startWith      = new BigDecimal(1);
        sb.append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" ");
import org.jkiss.code.NotNull;

        this.maxValue       = new BigDecimal(9223372036854775806L);
    }
        this.incrementBy = incrementBy;
    @Property(viewable = true, editable = true, updatable = true, order = 4)
        
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        this.minValue       = JDBCUtils.safeGetBigDecimal(dbResult, "MIN_SEQ");
        } else {
        }
    public String buildStatement(boolean forUpdate) {
        }
        return incrementBy;

    public void setIncrementBy(BigDecimal incrementBy) {

    private BigDecimal minValue;

    }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    public BigDecimal getLastValue() {
     * as CURRENT_SEQ+INCREMENT_SEQ for schema migration
        if (forUpdate) {
        this.cacheSize      = new BigDecimal(20);
 * AltibaseSequence
        if (getMaxValue() != null) {
    }
    private BigDecimal incrementBy;
        } else {
    private boolean flagCycle;
        }
package org.jkiss.dbeaver.ext.altibase.model;
            sb.append("START WITH ").append(getStartWith()).append(" ");
    @Property(viewable = true, editable = true, updatable = true, order = 8)
            return startWith;

