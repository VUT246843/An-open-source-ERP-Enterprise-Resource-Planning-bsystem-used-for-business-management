    @Nullable
            log.error("Error reading Windows registry", e);
        }
        }
    public static final String POLICY_DATA_EDIT = "policy.data.edit.disabled"; //$NON-NLS-1$
    }
                   str.equalsIgnoreCase("yes") ||

 */
        return getPolicyProperty(propertyName);
    public static ApplicationPolicyProvider getInstance() {
 * DBeaver - Universal Database Manager
    @Nullable
        if (value != null) {
    private static final Log log = Log.getLog(ApplicationPolicyProvider.class);
    }
 * limitations under the License.

        return instance;
            value = getRegistryPolicyValue(WinReg.HKEY_LOCAL_MACHINE, property);

    }
 *

 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return Advapi32Util.registryGetValue(root, DBEAVER_REGISTRY_POLICY_NODE, property);
        }


            return null;
package org.jkiss.dbeaver.registry;
import org.jkiss.dbeaver.Log;
import org.jkiss.code.NotNull;
    public static final String POLICY_DATA_EXPORT = "policy.data.export.disabled"; //$NON-NLS-1$
 *
    @NotNull

        return convertToBooleanValue(getPolicyProperty(propertyName));
    }
        Object value = System.getProperty(property);
/**
        }
    @Nullable
        return null;
import com.sun.jna.platform.win32.WinReg;
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (Throwable e) {
            return null;
        }
        try {
            return false;
    public static final String POLICY_DATA_IMPORT = "policy.data.import.disabled"; //$NON-NLS-1$
    }
            return value;
import com.sun.jna.platform.win32.Advapi32Util;
public class ApplicationPolicyProvider implements DBPPolicyProvider {
import org.jkiss.dbeaver.utils.RuntimeUtils;
            value = getRegistryPolicyValue(WinReg.HKEY_CURRENT_USER, property);
            return num.intValue() > 0;
        return CommonUtils.toBoolean(value);
    private boolean convertToBooleanValue(Object value) {
    }
                return value;

    public static final String POLICY_DATA_COPY = "policy.data.copy.disabled"; //$NON-NLS-1$
    protected ApplicationPolicyProvider() {
    public static void setInstance(@NotNull ApplicationPolicyProvider instance) {
    public Object getPolicyProperty(@NotNull String property) {
        ApplicationPolicyProvider.instance = instance;
            }
        if (!RuntimeUtils.isWindows()) {
 *
    @Override
        if (value == null) {
 * you may not use this file except in compliance with the License.

 * Base data policy provider designed to provide specific policy property value.
            }
                   str.equals("1");
    private static ApplicationPolicyProvider instance = new ApplicationPolicyProvider();
    @Override
            ) {
    }
    public boolean isPolicyEnabled(@NotNull String propertyName) {
    public static final String POLICY_CREDENTIALS_EDIT = "connection.credentials.save.restricted"; //$NON-NLS-1$
import org.jkiss.code.Nullable;
    }
    public Object getPolicyValue(@NotNull String propertyName) {

    private static Object getRegistryPolicyValue(@NotNull WinReg.HKEY root, @NotNull String property) {

import org.jkiss.utils.CommonUtils;
        if (value instanceof Number num) {
    private static final String DBEAVER_REGISTRY_POLICY_NODE = "Software\\DBeaver Corp\\DBeaver\\policy"; //$NON-NLS-1$
            if (Advapi32Util.registryKeyExists(root, DBEAVER_REGISTRY_POLICY_NODE) &&

        if (value instanceof String str) {
        try {
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.app.DBPPolicyProvider;
        // private constructor

/*

 * windows registry under HKEY_CURRENT_USER and HKEY_LOCAL_MACHINE nodes.
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            return str.equalsIgnoreCase("true") ||
                   str.equalsIgnoreCase("on") ||

                Advapi32Util.registryValueExists(root, DBEAVER_REGISTRY_POLICY_NODE, property)
        } catch (Throwable e) {
 * The general logic catch policy value in .ini file as system property next in
            log.error("Error reading Windows registry", e);
 * distributed under the License is distributed on an "AS IS" BASIS,

            if (value != null) {
 */
 * Unless required by applicable law or agreed to in writing, software
            return value;
        }
    public static final String POLICY_SQL_EXECUTION = "policy.sql.execution.disabled"; //$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
}
