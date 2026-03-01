    public String getStatusMessage() {


 * you may not use this file except in compliance with the License.
            statusMessage = "ERROR";
import org.jkiss.dbeaver.model.DBPObject;
        if(isError){

        super(object);
        return statusMessage;
 * DBeaver - Universal Database Manager
    public void setStatusMessage(String message) {
import org.jkiss.dbeaver.model.meta.Property;
    }
 *
        }
 * See the License for the specific language governing permissions and

            statusMessage = "OK";
 * distributed under the License is distributed on an "AS IS" BASIS,
        else{
package org.jkiss.dbeaver.model.sql.task;
 */
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.

}
    @Property(viewable = true, editable = true, updatable = true)
        this.statusMessage = message;
    }
public class SQLToolStatisticsSimple extends SQLToolStatistics{
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private String statusMessage;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
    }
    protected SQLToolStatisticsSimple(DBPObject object, boolean isError) {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
 *
 *
