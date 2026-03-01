        } else {
        return implementation;
 *
    private final boolean serverApplication;
        if (implementation == null) {
    }
 * limitations under the License.
    public ApplicationDescriptor getParent() {
    public String getId() {
        this.parent = parent;
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * You may obtain a copy of the License at
    public boolean isServerApplication() {
    public boolean isHidden() {

    public String[] getUmbrellaProductIds() {
public class ApplicationDescriptor extends AbstractDescriptor {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    public void setName(String name) {

 * DBeaver - Universal Database Manager

    public String getDescription() {
    }
        return parentId;
        super(config);
            this.umbrellaProductIds = new String[0];


        return implClass.getImplClass(DBPApplication.class);
            implementation = getImplClass().getConstructor().newInstance();

 *
        this.description = config.getAttribute("description");
        return umbrellaProductIds;
    }


    private String name;

    @NotNull
    }
        this.name = name;
    void setParent(@NotNull ApplicationDescriptor parent) {

        return id;
    public String getName() {
    }

import org.jkiss.code.NotNull;
    @Nullable
        this.id = config.getAttribute("id");
 * DBeaver application descriptor.
 * Unless required by applicable law or agreed to in writing, software
 */
    private final ObjectType implClass;
    private final String productFamily;
    }
    private boolean finalApplication = true;
        this.implClass = new ObjectType(config, "class");
        return finalApplication;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    private final boolean hidden;
    private final String parentId;
    @NotNull
    String getParentId() {
    }

        this.licenseProductId = CommonUtils.toString(config.getAttribute("licenseProductId"), this.id);
 * See the License for the specific language governing permissions and
/**
 * you may not use this file except in compliance with the License.
    }
        return productFamily;
    public String getLicenseProductId() {
        return parent;
        return description;
import org.jkiss.dbeaver.model.app.DBPApplication;
    private Class<? extends DBPApplication> getImplClass() {
        this.name = config.getAttribute("name");
    }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    }
    @Nullable
        this.productFamily = CommonUtils.toString(config.getAttribute("family"), "DB");
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }

    ApplicationDescriptor(IConfigurationElement config) {
    private final String[] umbrellaProductIds;
    public DBPApplication getInstance() throws Exception {
    @NotNull

        String umbrella = config.getAttribute("umbrella");
    private ApplicationDescriptor parent;
    private DBPApplication implementation;

        if (!CommonUtils.isEmptyTrimmed(umbrella)) {

/*
    public String getProductFamily() {
        this.parentId = config.getAttribute("parent");
        return name;
    @NotNull
import org.jkiss.code.Nullable;
}
 */
    private final String id;
    private final String description;
 *
        return licenseProductId;
        this.parent.finalApplication = false;

        this.hidden = CommonUtils.toBoolean(config.getAttribute("hidden"));
        return serverApplication;

    }
        return hidden;
import org.jkiss.utils.CommonUtils;
        }

        this.serverApplication = CommonUtils.toBoolean(config.getAttribute("server"));
import org.eclipse.core.runtime.IConfigurationElement;
    @Nullable
package org.jkiss.dbeaver.model.impl.app;
    boolean isFinalApplication() {

            this.umbrellaProductIds = umbrella.split(",");
    private final String licenseProductId;
 * distributed under the License is distributed on an "AS IS" BASIS,
    // Never call it directly
    }

    @Nullable
