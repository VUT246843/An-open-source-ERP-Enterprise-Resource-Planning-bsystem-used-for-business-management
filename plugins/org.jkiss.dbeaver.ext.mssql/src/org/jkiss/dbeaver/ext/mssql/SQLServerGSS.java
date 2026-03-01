 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!CommonUtils.isEmpty(connectionInfo.getUserName())) {
import org.jkiss.dbeaver.model.exec.DBCException;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 */
 */
 * SQLServerGSS
package org.jkiss.dbeaver.ext.mssql;
    public static void initCredentials(DBPConnectionConfiguration connectionInfo, Properties properties) throws DBCException {
}

                GSSName name = gssManager.createName(connectionInfo.getUserName(), GSSName.NT_USER_NAME);
                properties.put("gsscredential", impersonatedUserCredential);

import java.util.Properties;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 *
        }
 * limitations under the License.
 *
 * Unless required by applicable law or agreed to in writing, software

                GSSManager gssManager = GSSManager.getInstance();

 * you may not use this file except in compliance with the License.
/**
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
            try {
public class SQLServerGSS {
    }
import org.jkiss.utils.CommonUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
/*
            } catch (GSSException e) {
                GSSCredential impersonatedUserCredential = gssManager.createCredential(name, GSSCredential.DEFAULT_LIFETIME, (Oid)null, GSSCredential.ACCEPT_ONLY);
                throw new DBCException ("Error initializing GSS", e);
 * DBeaver - Universal Database Manager
 *
import org.ietf.jgss.*;
