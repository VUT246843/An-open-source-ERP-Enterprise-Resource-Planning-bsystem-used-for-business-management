

import org.jkiss.code.NotNull;
    private ContextTypeRegistry templateContextTypeRegistry;
 *     http://www.apache.org/licenses/LICENSE-2.0
            //TemplateContextType contextType= registry.getContextType("sql");
 *
 * DBeaver - Universal Database Manager
import org.eclipse.jface.text.templates.ContextTypeRegistry;

import org.jkiss.dbeaver.Log;
    {
     * Creates and loads SQLTemplateStore or returns an existing one
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
                log.error("Can't load template store", e);
        return templateContextTypeRegistry;
    /**


        return instance;
                }

    }
            instance = new SQLTemplatesRegistry();
            WorkspaceConfigEventManager.addConfigChangedListener(SQLTemplateStore.TEMPLATES_CONFIG_XML, o -> {
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
            
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Global SQL template registry
    public synchronized static SQLTemplatesRegistry getInstance()

    public synchronized ContextTypeRegistry getTemplateContextRegistry() {
        }
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.WorkspaceConfigEventManager;
            }
     */
package org.jkiss.dbeaver.ui.editors.sql.templates;
public class SQLTemplatesRegistry {
            });
        }
    private static SQLTemplatesRegistry instance;
                try {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

            templateStore.startListeningForPreferenceChanges();
        return templateStore;

import java.io.IOException;
            try {
            } catch (IOException e) {
    public SQLTemplateStore getTemplateStore() {
/**
        if (templateStore == null) {
    }
        if (instance == null) {
                    templateStore.reload();


        }
            templateContextTypeRegistry = new SQLContextTypeRegistry();

 * limitations under the License.
    private static final Log log = Log.getLog(SQLTemplatesRegistry.class);
 * you may not use this file except in compliance with the License.

                templateStore.load();
                } catch (IOException e) {
}
    }
 * You may obtain a copy of the License at
    private SQLTemplateStore templateStore;
 *
                    log.error("Can't reload template store", e);
    @NotNull
/*
        if (templateContextTypeRegistry == null) {
            templateStore = SQLTemplateStore.createInstance(getTemplateContextRegistry());
            //SQLContextTypeRegistry registry = new SQLContextTypeRegistry();
