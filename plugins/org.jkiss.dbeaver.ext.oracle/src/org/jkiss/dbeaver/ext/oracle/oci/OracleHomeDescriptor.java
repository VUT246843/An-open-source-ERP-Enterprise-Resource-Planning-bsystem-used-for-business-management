            log.debug("Unrecognized Oracle client version at " + oraHome);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
public class OracleHomeDescriptor extends LocalNativeClientLocation

 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (tnsNames == null) {
        }
        if (displayName != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
            return getName();
    }
    private static final Log log = Log.getLog(OracleHomeDescriptor.class);
{
}
import org.jkiss.dbeaver.model.connection.LocalNativeClientLocation;
    @NotNull
        return tnsNames;
package org.jkiss.dbeaver.ext.oracle.oci;
import org.jkiss.utils.CommonUtils;

    {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }

/*
    private String displayName;
        }
        super(CommonUtils.removeTrailingSlash(oraHome), oraHome);
        else {

    public OracleHomeDescriptor(String oraHome)
 * You may obtain a copy of the License at
            tnsNames = new ArrayList<>(OCIUtils.readTnsNames(getPath(), true).keySet());
 */
        }
    @Override
 * limitations under the License.
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.oracle.OracleDataSourceProvider;
import java.util.ArrayList;
    public List<String> getOraServiceNames()
        this.oraVersion = OracleDataSourceProvider.getOracleVersion(this);
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;
            return displayName;
    {


 *
    }
        if (oraVersion == null) {
    public String getDisplayName()

    private List<String> tnsNames;
    private Integer oraVersion; // short version (9, 10, 11...)
    }
        this.displayName = OCIUtils.readWinRegistry(oraHome, OCIUtils.WIN_REG_ORA_HOME_NAME);
import java.util.List;
    {

