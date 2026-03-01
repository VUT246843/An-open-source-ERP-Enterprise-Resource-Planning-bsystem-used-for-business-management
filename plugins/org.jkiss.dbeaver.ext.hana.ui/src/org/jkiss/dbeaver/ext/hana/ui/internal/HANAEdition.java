    
        return GENERIC;
package org.jkiss.dbeaver.ext.hana.ui.internal;
    CLOUD(HANAMessages.edition_cloud);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    EXPRESS(HANAMessages.edition_express),
    GENERIC(HANAMessages.edition_generic),
        }
    }
    PLATFORM_SYSTEM_DB(HANAMessages.edition_platform_system_db),
 * Unless required by applicable law or agreed to in writing, software
 *
                return edition;
            if(edition.name().equals(name)) {
/*
        
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0

    public static HANAEdition fromTitle(String title) {
 * See the License for the specific language governing permissions and
    private final String title;
    }

        for(HANAEdition edition : HANAEdition.values()) {
            }
    public String getTitle() { return title; }
        this.title = title;
    HANAEdition(String title)
public enum HANAEdition {
 * you may not use this file except in compliance with the License.
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    PLATFORM_SINGLE_DB(HANAMessages.edition_platform_single_db),
    {
}
    
    
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    PLATFORM_TENANT_DB(HANAMessages.edition_platform_tenant_db),
 * limitations under the License.
            }
        return GENERIC;
    }
 * DBeaver - Universal Database Manager

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static HANAEdition fromName(String name) {
            if(edition.getTitle().equals(title)) {
 *
        for(HANAEdition edition : HANAEdition.values()) {
                return edition;
