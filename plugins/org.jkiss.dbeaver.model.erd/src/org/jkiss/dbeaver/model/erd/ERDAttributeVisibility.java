
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    PRIMARY(ERDMessages.erd_attribute_visibility_selection_item_primary_key),
 *


    }
    public String getTitle()
        return title;
            ERDConstants.PREF_ATTR_VISIBILITY,
    }
            }
    ERDAttributeVisibility(String title)
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    private final String title;
 * Unless required by applicable law or agreed to in writing, software
            } catch (IllegalArgumentException e) {
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                log.warn(e);
 * See the License for the specific language governing permissions and
    {
 * Entity attribute visibility

        this.title = title;
    ALL(ERDMessages.erd_attribute_visibility_selection_item_all),
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.erd;
public enum ERDAttributeVisibility
/**
    {
    }

        String attrVisibilityString = store.getString(ERDConstants.PREF_ATTR_VISIBILITY);

 * you may not use this file except in compliance with the License.
{


import org.jkiss.dbeaver.model.erd.internal.ERDMessages;
 *
    private static final Log log = Log.getLog(ERDAttributeVisibility.class);

 *     http://www.apache.org/licenses/LICENSE-2.0
/*
        return ALL;
            visibility.name());
        }
    }
    KEYS(ERDMessages.erd_attribute_visibility_selection_item_any_keys),
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
 *
            try {
        if (!CommonUtils.isEmpty(attrVisibilityString)) {

    public static void setDefaultVisibility(DBPPreferenceStore store, ERDAttributeVisibility visibility)
import org.jkiss.utils.CommonUtils;

 * distributed under the License is distributed on an "AS IS" BASIS,
        store.setValue(
    public static ERDAttributeVisibility getDefaultVisibility(DBPPreferenceStore store)
 * DBeaver - Universal Database Manager
                return ERDAttributeVisibility.valueOf(attrVisibilityString);
 */
    NONE(ERDMessages.erd_attribute_visibility_selection_item_none);
    public static boolean isHideAttributeAssociations(DBPPreferenceStore store) {
    {
}
        return getDefaultVisibility(store) != ALL;
import org.jkiss.dbeaver.Log;
