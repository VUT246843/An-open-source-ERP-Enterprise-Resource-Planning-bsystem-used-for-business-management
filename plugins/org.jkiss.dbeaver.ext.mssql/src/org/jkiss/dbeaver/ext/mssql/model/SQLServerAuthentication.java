import java.util.Properties;
 * you may not use this file except in compliance with the License.
    AD_INTEGRATED(SQLServerMessages.authentication_ad_integrated_title, SQLServerMessages.authentication_ad_integrated_description, false, false, false, SQLServerAuthModelADIntegrated.ID),
    SQL_SERVER_PASSWORD(SQLServerMessages.authentication_sql_server_title, SQLServerMessages.authentication_sql_server_description, true, true, true, SQLServerAuthModelDatabase.ID),
    }

    public interface AuthInitializer {
        void initializeAuthentication(DBPConnectionConfiguration connectionInfo, Properties properties) throws DBCException;
        this.title = title;
@Deprecated
    WINDOWS_INTEGRATED(SQLServerMessages.authentication_windows_title, SQLServerMessages.authentication_windows_description, true, false, false, SQLServerAuthModelWindows.ID),

        this.supportsJTDS = supportsJTDS;
    private final boolean allowsPassword;
 * You may obtain a copy of the License at
    private final String replacedByAuthModelId;
 * distributed under the License is distributed on an "AS IS" BASIS,
public enum SQLServerAuthentication {
import org.jkiss.dbeaver.ext.mssql.SQLServerMessages;
    public String getDescription() {
 * limitations under the License.

        this.allowsUserName = allowsUserName;
import org.jkiss.dbeaver.model.exec.DBCException;

 *
    public boolean isAllowsPassword() {
    public String getTitle() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.description = description;
 * Unless required by applicable law or agreed to in writing, software

    public String getReplacedByAuthModelId() {
        return replacedByAuthModelId;
        this.allowsPassword = allowsPassword;
        return title;
    private final String title;
    private final boolean allowsUserName;

 *


    private final String description;
    AD_MSI(SQLServerMessages.authentication_ad_msi_title, SQLServerMessages.authentication_ad_msi_description, false, true, false, SQLServerAuthModelMSI.ID),

 * See the License for the specific language governing permissions and
 *
    SQLServerAuthentication(String title, String description, boolean supportsJTDS, boolean allowsUserName, boolean allowsPassword, String replacedByAuthModelId) {
    AD_INTERACTIVE(SQLServerMessages.authentication_ad_interactive_title, SQLServerMessages.authentication_ad_interactive_description, false, true, false, SQLServerAuthModelMFA.ID),
    public boolean isSupportsJTDS() {
    private final boolean supportsJTDS;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return allowsPassword;

/*
 */
    public boolean isAllowsUserName() {
 */
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.mssql.auth.*;
package org.jkiss.dbeaver.ext.mssql.model;
    OTHER(SQLServerMessages.authentication_other_title, SQLServerMessages.authentication_other_description, true, true, true, SQLServerAuthModelCustom.ID)
 * SQLServerAuthentication.
 * Deprecated. Replaced by auth models.
    }
        this.replacedByAuthModelId = replacedByAuthModelId;
 * DBeaver - Universal Database Manager
    AD_PASSWORD(SQLServerMessages.authentication_ad_password_title, SQLServerMessages.authentication_ad_password_description, false, true, true, SQLServerAuthModelADPassword.ID),
    }
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }

}
        return description;
    ;


 *
/**
    }
        return supportsJTDS;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    NTLM("NTLM", "NTLM authentication", true, true, true, SQLServerAuthModelNTLM.ID),

        return allowsUserName;
