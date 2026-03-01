 */
    private static class VoidRegistry implements Registry {
    private static final Log log = Log.getLog(ApplicationPolicyProvider.class);
        @Override
        }
        public String registryGetStringValue(String root, String key, String value) {
import org.jkiss.dbeaver.Log;
        public String[] registryGetKeys(String root, String keyPath) {


        }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        @Override
        @Override


        }


        private WinReg.HKEY getRootHkey(String root) {
            return false;
        public boolean registryKeyExists(String root, String key) {

public class LocalSystemRegistry {
 *
            }
}
        boolean registryValueExists(String root, String key, String value);

import com.sun.jna.platform.win32.Advapi32Util;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        @Override
            } else {
        @Override
        String registryGetStringValue(String root, String key, String value);
 * Unless required by applicable law or agreed to in writing, software
        @Override
        }
import com.sun.jna.platform.win32.WinReg;
 * LocalSystemRegistry
        return instance;
                return new WinReg.HKEY();
        Map<String, Object> registryGetValues(String root, String keyPath);


        public Map<String, Object> registryGetValues(String root, String keyPath) {
package org.jkiss.dbeaver.registry;
/**

        @Override
 * DBeaver - Universal Database Manager
                log.debug(e);
                instance = new VoidRegistry();

            try {
        }
        public String[] registryGetKeys(String root, String keyPath) {
    private static Registry instance;
            return Advapi32Util.registryGetValues(getRootHkey(root), keyPath);
            return false;
        public boolean registryValueExists(String root, String key, String value) {
    }
            if (RuntimeUtils.isWindows()) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (instance == null) {
        @Override
import java.util.Collections;

        }
            } catch (Exception e) {
                instance = new WindowsRegistry();
 * you may not use this file except in compliance with the License.

            return Advapi32Util.registryKeyExists(getRootHkey(root), key);
        String[] registryGetKeys(String root, String keyPath);

        }
 */
    public static Registry getInstance() {
/*
        }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        @Override
            return Advapi32Util.registryValueExists(getRootHkey(root), key, value);
            return null;
            return Advapi32Util.registryGetKeys(getRootHkey(root), keyPath);


        public boolean registryValueExists(String root, String key, String value) {
    private static class WindowsRegistry implements Registry {
    }
        public Map<String, Object> registryGetValues(String root, String keyPath) {
        boolean registryKeyExists(String root, String key);

            return Advapi32Util.registryGetStringValue(getRootHkey(root), key, value);
        @Override

        }
import java.util.Map;

 *
 * limitations under the License.
            return Collections.emptyMap();
        }

            return new String[0];
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public interface Registry {
        public boolean registryKeyExists(String root, String key) {
                return (WinReg.HKEY) WinReg.class.getField(root).get(null);

            }
 * distributed under the License is distributed on an "AS IS" BASIS,
        public String registryGetStringValue(String root, String key, String value) {
