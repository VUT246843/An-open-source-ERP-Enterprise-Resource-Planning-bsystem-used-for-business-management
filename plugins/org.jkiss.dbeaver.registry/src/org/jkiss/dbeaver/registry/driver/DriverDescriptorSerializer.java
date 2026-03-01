/**
                path = GeneralUtils.variablePattern(ps.getValue()) + path.substring(ps.getKey().length());
    static String substitutePathVariables(Map<String, String> pathSubstitutions, String path) {

            if (path.startsWith(ps.getKey())) {
import org.jkiss.utils.CommonUtils;
        }
 * limitations under the License.
 *
        return path;
                SystemVariablesResolver.VAR_WORKSPACE,
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
    abstract void serializeDrivers(OutputStream os, List<DataSourceProviderDescriptor> providers) throws IOException;
    static String replacePathVariables(String path) {
import org.jkiss.code.NotNull;
            DriverVariablesResolver varResolver = new DriverVariablesResolver();
                DriverVariablesResolver.VAR_DRIVERS_HOME,
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        return pathSubstitutions;
 * DBeaver - Universal Database Manager
                }
 */

    }
                String varValue = varResolver.get(varName);
            for (String varName : variables) {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected Map<String, String> getPathSubstitutions() {
public abstract class DriverDescriptorSerializer {
                SystemVariablesResolver.VAR_APP_PATH,
                if (!CommonUtils.isEmpty(varValue)) {
 * Unless required by applicable law or agreed to in writing, software
        {
            }
package org.jkiss.dbeaver.registry.driver;
                SystemVariablesResolver.VAR_HOME,
        return GeneralUtils.replaceVariables(path, new DriverVariablesResolver());
import org.jkiss.dbeaver.utils.GeneralUtils;
 * DriverDescriptorSerializer
import java.util.Map;
                    pathSubstitutions.put(varValue, varName);

                break;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
            }

 */
import java.io.OutputStream;
    }
import java.io.IOException;
                SystemVariablesResolver.VAR_DBEAVER_HOME};
        for (Map.Entry<String, String> ps : pathSubstitutions.entrySet()) {
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");


 * You may obtain a copy of the License at

        Map<String, String> pathSubstitutions = new HashMap<>();
    }
 * See the License for the specific language governing permissions and
 *
import java.util.List;

/*
            String[] variables = new String[]{
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
import java.util.HashMap;
