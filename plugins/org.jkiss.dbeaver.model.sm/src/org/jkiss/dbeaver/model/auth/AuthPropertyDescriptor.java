    private final boolean admin; // Parameter value can be configured in admin panel

 *
    }


 * Unless required by applicable law or agreed to in writing, software
 * Auth provider property.
 * limitations under the License.
 *
    private final AuthPropertyEncryption encryption;
        super(category, config);
 * Has some extra attributes.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return encryption;

    public boolean isIdentifying() {
 *
        return user;
    }
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    }
    private final boolean identifying; // Identifying parameter. Will be used during auth for user search by credentials
import org.jkiss.utils.CommonUtils;
 * DBeaver - Universal Database Manager

        return admin;
import org.jkiss.dbeaver.model.impl.LocalizedPropertyDescriptor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.auth;
        this.admin = CommonUtils.getBoolean(config.getAttribute("admin"), false);
    public AuthPropertyEncryption getEncryption() {
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;

/*
}
        this.encryption = CommonUtils.valueOf(AuthPropertyEncryption.class, config.getAttribute("encryption"), AuthPropertyEncryption.none);
    }
        this.identifying = CommonUtils.getBoolean(config.getAttribute("identifying"), false);
        return identifying;

 */
import org.eclipse.core.runtime.IConfigurationElement;
/**
    }
    public AuthPropertyDescriptor(String category, IConfigurationElement config) {
 *     http://www.apache.org/licenses/LICENSE-2.0

    public boolean isUser() {

    public boolean isAdmin() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.user = CommonUtils.getBoolean(config.getAttribute("user"), false);
    private final boolean user; // Parameter can be passed by end-user from UI
 * distributed under the License is distributed on an "AS IS" BASIS,
public class AuthPropertyDescriptor extends LocalizedPropertyDescriptor {
 */
