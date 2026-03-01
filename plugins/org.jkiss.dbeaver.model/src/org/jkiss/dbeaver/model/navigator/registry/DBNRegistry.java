 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.IConfigurationElement;
package org.jkiss.dbeaver.model.navigator.registry;
    public synchronized static DBNRegistry getInstance() {

                if (enList != null) {
            }
    public void extendNode(DBNNodeExtendable parentNode, boolean reflect) {
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.Log;
 *
import org.jkiss.dbeaver.DBException;
                    }
 * See the License for the specific language governing permissions and
    private final List<DBNModelExtenderDescriptor> modelExtenders = new ArrayList<>();
        for (IConfigurationElement ext : extElements) {
                log.debug("Error getting model extenders", e);
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (DBNModelExtenderDescriptor med : modelExtenders) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
        }
import java.util.ArrayList;
    private static final Log log = Log.getLog(DBNRegistry.class);
import org.eclipse.core.runtime.Platform;
/*
import org.eclipse.core.runtime.IExtensionRegistry;

    }
            instance = new DBNRegistry(Platform.getExtensionRegistry());
    private DBNModelExtenderDescriptor defaultApplication;
                parentNode.addExtraNode(eNode, reflect);
public class DBNRegistry {
        }
import org.jkiss.dbeaver.model.navigator.DBNRoot;
    }
                        extraNodes = new ArrayList<>();
            if (ext.getName().equals("extender")) {
            }

        List<DBNNode> extraNodes = null;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
                DBNModelExtenderDescriptor app = new DBNModelExtenderDescriptor(ext);
        if (!CommonUtils.isEmpty(extraNodes)) {
        if (modelExtenders.isEmpty()) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNNode;
        }
        return instance;
 * limitations under the License.
        if (instance == null) {

            }
                DBNNode[] enList = med.getInstance().getExtraNodes((DBNNode) parentNode);
            } catch (DBException e) {

 */
                }
            for (DBNNode eNode : extraNodes) {
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
            if (parentNode instanceof DBNRoot && !med.isRoot()) {
            try {
import org.jkiss.dbeaver.model.navigator.DBNNodeExtendable;
    private DBNRegistry(IExtensionRegistry registry) {

                    Collections.addAll(extraNodes, enList);
 * You may obtain a copy of the License at

        }
 *
 * Unless required by applicable law or agreed to in writing, software
            return;

import org.jkiss.utils.CommonUtils;
                continue;
                    if (extraNodes == null) {

    private static DBNRegistry instance = null;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.navigator"; //$NON-NLS-1$
import java.util.Collections;
            }
                modelExtenders.add(app);
        }
import java.util.List;

