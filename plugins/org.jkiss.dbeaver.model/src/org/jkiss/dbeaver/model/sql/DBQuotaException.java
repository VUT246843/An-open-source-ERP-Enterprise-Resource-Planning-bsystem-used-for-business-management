
public class DBQuotaException extends DBCException {
/*
        return quotaId;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Quota exceeded exception
        return quotaValue;
    private final Object quotaValue;


    }
 * You may obtain a copy of the License at
    public String getQuotaId() {
    private final String quotaId;

        this.quotaId = quotaId;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        this.quotaValue = quotaValue;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return exceededValue;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    }
        this.exceededValue = exceededValue;
 *

    public Object getQuotaValue() {
/**

 * limitations under the License.
}

        super(message + " (>" + quotaValue + ")");
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final Object exceededValue;
    public DBQuotaException(String message, String quotaId, Object quotaValue, Object exceededValue) {
    }
    }
package org.jkiss.dbeaver.model.sql;
import org.jkiss.dbeaver.model.exec.DBCException;
    public Object getExceededValue() {
