        for (OracleConnectionType odt : values()) {

 *
    SERVICE(OracleMessages.dialog_connection_service);
    public static OracleConnectionType getTypeForTitle(String title)
    public String getTitle()
            }
/**
 * You may obtain a copy of the License at
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
        return SID;
 *
    SID(OracleMessages.dialog_connection_sid),
            if (title.equals(odt.getTitle())) {

    {
package org.jkiss.dbeaver.ext.oracle.model.dict;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
*/
    }
import org.jkiss.dbeaver.ext.oracle.internal.OracleMessages;
* DB connection type
    {
    }
    {
    private final String title;
    OracleConnectionType(String title)
 *
        this.title = title;
public enum OracleConnectionType
{
 */
                return odt;
}
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * DBeaver - Universal Database Manager
        return title;
 * Unless required by applicable law or agreed to in writing, software
        }
