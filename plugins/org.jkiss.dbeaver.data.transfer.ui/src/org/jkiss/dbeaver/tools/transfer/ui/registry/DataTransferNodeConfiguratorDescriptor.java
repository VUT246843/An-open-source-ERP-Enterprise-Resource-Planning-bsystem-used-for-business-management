import org.eclipse.core.runtime.IConfigurationElement;
                type.checkObjectClass(IWizardPage.class);
                return pd;
        List<Map.Entry<String, DataTransferPageDescriptor>> replacements = new ArrayList<>();
    }
        }

            if (pd.getPageClass().getImplName().equals(page.getClass().getName())) {
    public String getId()
public class DataTransferNodeConfiguratorDescriptor extends AbstractDescriptor {
import org.jkiss.code.NotNull;
            if (page.isProducerSelector() && !producerOptional) continue;
                    pages.add(type.createInstance(IWizardPage.class));
                replacements.add(Map.entry(replaces, descriptor));
            DataTransferPageDescriptor descriptor = new DataTransferPageDescriptor(pageCfg);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

 * you may not use this file except in compliance with the License.

                log.error("Can't create wizard page", e);
    private static final Log log = Log.getLog(DataTransferNodeConfiguratorDescriptor.class);
                }

        for (DataTransferPageDescriptor page : pageTypes) {
 * See the License for the specific language governing permissions and
        }
    public DataTransferPageDescriptor getPageDescriptor(IWizardPage page) {
        return pages.toArray(new IWizardPage[0]);
            }

 */

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
            String replaces = pageCfg.getAttribute("replaces");
/*

 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others

            if (replaces != null && !replaces.isEmpty()) {
    @NotNull
        pageTypes.addAll(new HashSet<>(pagesById.values()));
            try {
        // Second pass: apply all declared replacements so they override whatever was there
    }

        return id;
            String id = pageCfg.getAttribute("id");
                        }

            if (settingsPage != (page.getPageType() == DataTransferPageType.SETTINGS)) continue;

        Map<String, DataTransferPageDescriptor> pagesById = new HashMap<>();

        pageTypes.clear();
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (page.isConsumerSelector() && !consumerOptional) continue;
                if (!ArrayUtils.isEmpty(existingPages)) {
                            added = true;

    DataTransferNodeConfiguratorDescriptor(IConfigurationElement config) {
    List<DataTransferPageDescriptor> patPageDescriptors() {
package org.jkiss.dbeaver.tools.transfer.ui.registry;


                    for (IWizardPage ep : existingPages) {
    @NotNull
 */
            } catch (Throwable e) {
                boolean added = false;
import org.eclipse.jface.wizard.IWizardPage;

    private final String id;
/**
        // Remember all replacement pairs to apply in a second pass
        loadNodeConfigurations(config);
        return null;
import org.jkiss.dbeaver.Log;
        this.id = config.getAttribute("node");
 *
    {
    public IWizardPage[] createWizardPages(IWizardPage[] existingPages, boolean consumerOptional, boolean producerOptional, boolean settingsPage)
                Class<?> pageClass = type.getObjectClass();
            }
            if (id == null || id.isEmpty()) {
    public String toString() {
 * Unless required by applicable law or agreed to in writing, software
    {
            pagesById.put(id, descriptor);      // own id always wins
import java.util.*;
}
        }
        return pageTypes;
import org.jkiss.utils.ArrayUtils;
                log.warn("Page descriptor without id: " + config.getContributor().getName());
                            break;
        // Deduplicate before exporting
    }

 * You may obtain a copy of the License at
                            pages.add(ep);
        List<IWizardPage> pages = new ArrayList<>();
                }
    }


 * DataTransferNodeDescriptor
    }
                ObjectType type = page.getPageClass();
        // Own descriptors by their id
        for (Map.Entry<String, DataTransferPageDescriptor> r : replacements) {
 *

            }
    }
        for (IConfigurationElement pageCfg : ArrayUtils.safeArray(config.getChildren("page"))) {
                        if (pageClass == ep.getClass()) {
        }
        for (DataTransferPageDescriptor pd : pageTypes) {
            pagesById.put(r.getKey(), r.getValue());
 * DBeaver - Universal Database Manager
                    }
        super(config);
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        return id;
    void loadNodeConfigurations(IConfigurationElement config) {
                if (!added) {
    @Override
    private final List<DataTransferPageDescriptor> pageTypes = new ArrayList<>();
 *
