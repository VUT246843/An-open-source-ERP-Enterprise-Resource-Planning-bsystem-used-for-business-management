 *
 *
    }
    }
}
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

        }
    public Collection<ObjectPropertyDescriptor> getChildren()
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
{
        extractAnnotations(source, this, getGetter().getReturnType(), children, filter, locale);
    {
            }
        PropertyGroup groupInfo,
 * Unless required by applicable law or agreed to in writing, software
        throws IllegalAccessException, IllegalArgumentException, InvocationTargetException



/**
    }
 * See the License for the specific language governing permissions and
import java.util.Collection;
    public String getCategory()
        if (isLazy(object, false)) {

 * ObjectPropertyDescriptor
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.List;
import org.jkiss.code.NotNull;
        super(source, parent, getter, groupInfo.id(), groupInfo.order());
    @Override
                throw new IllegalAccessException("Can't read lazy properties with null progress monitor");
        return groupInfo.description();
 *
import org.jkiss.dbeaver.model.meta.PropertyGroup;
            return getGetter().invoke(object);

    public ObjectPropertyGroupDescriptor(
import java.util.ArrayList;
    }
        } else {
    {
    @Override
    }
 * limitations under the License.
        return groupInfo.groupId();
public class ObjectPropertyGroupDescriptor extends ObjectAttributeDescriptor
 * DBeaver - Universal Database Manager
import java.lang.reflect.Method;
            if (progressMonitor == null) {
    {
 */
            return getGetter().invoke(object, progressMonitor);
    {
            object = getParent().getGroupObject(object, progressMonitor);
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
        String locale)
        Method getter,
    public String getDescription()

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public Object getGroupObject(@NotNull Object object, @Nullable DBRProgressMonitor progressMonitor)
    public String getGroupId() {
        if (getParent() != null) {
        }
        IPropertyFilter filter,
        }
        return children;

        return groupInfo.category();
    private List<ObjectPropertyDescriptor> children = new ArrayList<ObjectPropertyDescriptor>();
package org.jkiss.dbeaver.runtime.properties;
    private PropertyGroup groupInfo;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        ObjectPropertyGroupDescriptor parent,
        DBPPropertySource source,
/*
        if (isLazy()) {
*/
        this.groupInfo = groupInfo;
