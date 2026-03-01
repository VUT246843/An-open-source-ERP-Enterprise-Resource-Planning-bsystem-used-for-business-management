                isVisible = prefs.getBoolean(prefKeyIsSet) ? prefs.getBoolean(prefKeyVisibility) : defaultVisibility;
    /**
    /**
    static final String NAME_ATTR_NAME = "name"; //$NON-NLS-1$
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.name = elements.stream().map(e -> e.getAttribute(NAME_ATTR_NAME))
            .flatMap(e -> Stream.of(e.getChildren(ITEM_ELEMENT_NAME)))
import org.eclipse.core.runtime.IConfigurationElement;
            String name = e.getAttribute(NAME_ATTR_NAME);
    private final String key;
        
                },

    static final String DEFAULT_VISIBILITY_ATTR_NAME = "defaultVisibility"; //$NON-NLS-1$
        }

            if (this.key == null) {
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
            log.error("Testing unknown item key " + itemKey + " for toolbar configuration " + key);
        private Boolean isVisible = null;
         */
    public Collection<Item> getItems() {
            }
        public Item(@NotNull IConfigurationElement e) {
    private static final Log log = Log.getLog(ToolBarConfigurationDescriptor.class);
        
                ToolBarConfigurationDescriptor.this.key, this.key, "isSet"  //$NON-NLS-1$
    static final String CMD_ID_ATTR_NAME = "commandId"; //$NON-NLS-1$
    public boolean isItemVisible(@NotNull String itemKey) {
    
            .findFirst().orElse(key);
            return isVisible;
        this.itemsByKey = elements.stream()
    public ToolBarConfigurationDescriptor(@NotNull String key, @NotNull List<IConfigurationElement> elements) {
            );
import java.util.List;
        return key;
            this.commandId = commandId;
import java.util.stream.Collectors;
import org.jkiss.utils.CommonUtils;
        }

                    log.error(msg);
        }
            return name;
            return commandId;
import java.util.stream.Stream;
 *
import org.eclipse.jface.preference.IPreferenceStore;
                IPreferenceStore prefs = DBeaverActivator.getInstance().getPreferenceStore();

        Item item = itemsByKey.get(itemKey);

    public String getName() {
            );
    }
import org.jkiss.code.NotNull;
            String commandId = e.getAttribute(CMD_ID_ATTR_NAME);
        }
                (a, b) -> {

            prefs.setValue(prefKeyIsSet, true);
        return name;
    static final String TOOLBAR_ELEMENT_NAME = "toolBar"; //$NON-NLS-1$
            
            return false;
 *
    }
     */
        

     * Returns if item visible
        private final String key;
        public void setVisible(boolean value) {
        return itemsByKey.values();
        }

        private final String prefKeyVisibility;
public class ToolBarConfigurationDescriptor {
 *

    public String getKey() {
import org.jkiss.dbeaver.Log;

package org.jkiss.dbeaver.ui.actions;
        public boolean isVisibleByDefault() {
    
                item -> item.getKey(),
    
}
            IPreferenceStore prefs = DBeaverActivator.getInstance().getPreferenceStore();
        private final boolean defaultVisibility;
                    String msg = "Duplicate toolbar " + key + " configuration item " + a.key;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.core.DBeaverActivator;
            this.key = CommonUtils.isNotEmpty(key) ? key : (CommonUtils.isNotEmpty(commandId) ?  commandId : null);
 */
     * Return known toolbar items keys
        public boolean isVisible() {

    static final String KEY_ATTR_NAME = "key"; //$NON-NLS-1$
    }

            isVisible = value;
 * You may obtain a copy of the License at

    
        }
            this.name = name;
        }
        public String getKey() {
            String key = e.getAttribute(KEY_ATTR_NAME);
        if (item != null) {
        public String getName() {
         * Set visibility for toolbar item
 * Licensed under the Apache License, Version 2.0 (the "License");
            prefs.setValue(prefKeyVisibility, value);
            this.prefKeyIsSet = ToolBarConfigurationRegistry.makeItemVisibilityPreferenceKeyName(
    public class Item {
    static final String ITEM_ELEMENT_NAME = "item"; //$NON-NLS-1$
        private final String name;
            this.prefKeyVisibility = ToolBarConfigurationRegistry.makeItemVisibilityPreferenceKeyName(
        /**
                    throw new RuntimeException(msg);
         * Returns is toolbar item visible
            .filter(CommonUtils::isNotEmpty)
        }
            .map(e -> new Item(e))

 * Unless required by applicable law or agreed to in writing, software
            }
        /**
    @NotNull
            return item.isVisible();
 * DBeaver - Universal Database Manager
        
            
    private final LinkedHashMap<String, Item> itemsByKey;
        
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
 * limitations under the License.
                ToolBarConfigurationDescriptor.this.key, this.key, "visibility"  //$NON-NLS-1$
/*
                item -> item,
 * See the License for the specific language governing permissions and
    }
            return key;
    }
import java.util.Collection;
            if (isVisible == null) {
            .collect(Collectors.toMap(
        public String getCommandId() {
                throw new RuntimeException("Failed to resolve toolbar configuration item key");
        
    }
        this.key = key;
            this.defaultVisibility = CommonUtils.getBoolean(e.getAttribute(DEFAULT_VISIBILITY_ATTR_NAME));
 *     http://www.apache.org/licenses/LICENSE-2.0
         */
import java.util.LinkedHashMap;

    private final String name;
                LinkedHashMap::new));
        private final String prefKeyIsSet;
        private final String commandId;
            return defaultVisibility;
