    public List<SQLDialectMetadata> getRootDialects() {
    static final String TAG_DIALECT = "dialect"; //$NON-NLS-1$
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void dispose() {
        return null;
    private void loadExtensions(IExtensionRegistry registry) {
    private static final String TAG_METHOD = "method"; //$NON-NLS-1$
        List<SQLDialectMetadata> roots = new ArrayList<>();
 * limitations under the License.
            // Load insert methods
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.SQLDialectMetadataRegistry;
            if (method.getId().equalsIgnoreCase(insertMethodId)) {
import org.eclipse.core.runtime.IExtensionRegistry;
                }
        return dialects.get(id);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

 * You may obtain a copy of the License at


    }
    public SQLDialectRegistry() {
        return null;
    public List<SQLDialectMetadata> getDialects() {
        for (IConfigurationElement ext : extConfigs) {

import java.util.Map;
            if (TAG_DIALECT.equals(ext.getName())) {
        }
import org.eclipse.core.runtime.IConfigurationElement;

import org.jkiss.utils.CommonUtils;
        for (SQLInsertReplaceMethodDescriptor method : insertMethods) {
                this.dialects.put(dialectDescriptor.getId(), dialectDescriptor);
 *
                return method;
            }
    }
import java.util.List;
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(SQLDialectDescriptor.EXTENSION_ID);


    public List<SQLInsertReplaceMethodDescriptor> getInsertMethods() {
    private final List<SQLInsertReplaceMethodDescriptor> insertMethods = new ArrayList<>();
    }
}
public class SQLDialectRegistry implements SQLDialectMetadataRegistry {
 * DBeaver - Universal Database Manager
        loadExtensions(Platform.getExtensionRegistry());
 *
import org.jkiss.dbeaver.model.sql.SQLDialectInsertReplaceMethod;
            }
        dialects.clear();


            if (dd.getParentDialect() == null) {
                    }
/*

                roots.add(dd);
                        dialect.setParentDialect(parentDialect);
    }
package org.jkiss.dbeaver.model.sql.registry;

            }
    public SQLDialectInsertReplaceMethod getInsertReplaceMethod(String insertMethodId) {
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
                    SQLDialectDescriptor dialect = dialects.get(dialectId);
    public SQLDialectDescriptor getDialect(String id) {
        }
import java.util.ArrayList;

    }
        return new ArrayList<>(dialects.values());
                    if (dialect != null && parentDialect != null) {
        return new ArrayList<>(insertMethods);
import java.util.LinkedHashMap;
            }


                SQLDialectDescriptor dialectDescriptor = new SQLDialectDescriptor(ext);
                String dialectId = ext.getAttribute("id");
    public SQLInsertReplaceMethodDescriptor getInsertMethodOnLabel(String label) {
        }

    private final Map<String, SQLDialectDescriptor> dialects = new LinkedHashMap<>();
    }
        }
 */
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                this.insertMethods.add(new SQLInsertReplaceMethodDescriptor(ext));
        for (SQLInsertReplaceMethodDescriptor method : insertMethods) {
        for (IConfigurationElement ext : registry.getConfigurationElementsFor(SQLInsertReplaceMethodDescriptor.EXTENSION_ID)) {
import org.eclipse.core.runtime.Platform;
            if (method.getLabel().equalsIgnoreCase(label)) {
 * you may not use this file except in compliance with the License.
        for (SQLDialectDescriptor dd : dialects.values()) {

    }
                return method;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
            }
        return roots;
        for (IConfigurationElement ext : extConfigs) {
                String parentDialectId = ext.getAttribute("parent");
                    SQLDialectDescriptor parentDialect = dialects.get(parentDialectId);
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            if (TAG_METHOD.equals(ext.getName())) {
        }
        }
                if (!CommonUtils.isEmpty(dialectId) && !CommonUtils.isEmpty(parentDialectId)) {
            if (TAG_DIALECT.equals(ext.getName())) {
