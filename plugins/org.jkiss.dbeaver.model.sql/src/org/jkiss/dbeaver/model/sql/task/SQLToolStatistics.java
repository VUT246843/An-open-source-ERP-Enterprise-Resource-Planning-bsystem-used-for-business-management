
import org.jkiss.dbeaver.model.DBPObject;

public abstract class SQLToolStatistics<OBJECT_TYPE extends DBPObject> implements DBPObject {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.ElapsedTimeNumberFormat;
/**
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final OBJECT_TYPE object;
    public long getExecutionTime() {
 * You may obtain a copy of the License at
    private long executionTime;
 */
 *
import org.jkiss.dbeaver.model.meta.Property;
}
package org.jkiss.dbeaver.model.sql.task;
 *
    protected SQLToolStatistics(OBJECT_TYPE object) {
 * Unless required by applicable law or agreed to in writing, software
    }
 */
        return object;
    public void setExecutionTime(long executionTime) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and

    @Property(viewable = true, order = 1)
 * SQLToolStatistics
    public OBJECT_TYPE getObject() {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, order = 100, formatter = ElapsedTimeNumberFormat.class)
    }
 * you may not use this file except in compliance with the License.
        this.executionTime = executionTime;
/*



 *
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        return executionTime;
        this.object = object;
