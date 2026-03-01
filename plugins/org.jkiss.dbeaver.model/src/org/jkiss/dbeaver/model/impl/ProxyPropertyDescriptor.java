    }
    }
 *
    @NotNull
 * See the License for the specific language governing permissions and
        return this.original.getDisplayName();
    public String[] getRequiredFeatures() {
    public Class<?> getDataType() {
        return this.original.getId();

public class ProxyPropertyDescriptor implements DBPPropertyDescriptor

        return original.getDataType();

 *


 * limitations under the License.
    public boolean isRequired() {
    public String getId()

/**
    }
    @Override
    {
    }
        return original.getRequiredFeatures();
        return original.getLength();
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

        return this.original.getCategory();
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return this.original.getHint();
    }
    @Nullable
        return original.isEditable(object);
    }
import org.jkiss.code.Nullable;
    public boolean hasFeature(@NotNull String feature) {

    public String getCategory()

    public ProxyPropertyDescriptor(DBPPropertyDescriptor original)
 */
 * Copyright (C) 2010-2026 DBeaver Corp and others

    @Override
import org.jkiss.dbeaver.model.meta.PropertyLength;
    public PropertyLength getLength() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * you may not use this file except in compliance with the License.
    @Nullable
        return original.isRequired();
 *
    @Override

    @Override

    public boolean isEditable(Object object) {
    @Override
 * DBeaver - Universal Database Manager
        return original.isDesktop();
    {
    }
        return this.original.getDescription();
    @Override
    }
    {
        return original.getFeatures();
    {
 * ProxyPropertyDescriptor

    }
/*
    @NotNull

    }
    public String getDescription()
        return original.getDefaultValue();
    @Override
    @Override
    @Override
    public String[] getFeatures() {
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
    protected final DBPPropertyDescriptor original;

    public Object getDefaultValue() {
    {

    }

    }
*/
 * Unless required by applicable law or agreed to in writing, software
    @Override
        return original.hasFeature(feature);
{
    public String getHint() {
        this.original = original;

}
    @Override
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public boolean isDesktop() {

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.impl;
    @Override

    public String getDisplayName()
