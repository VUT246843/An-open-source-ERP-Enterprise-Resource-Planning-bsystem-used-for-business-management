}
        if (term != null) {
        String visibleIf,
    private String itemLabel;
            for (DBXTreeNode subFolder : node.getChildren()) {
import org.jkiss.utils.CommonUtils;
        if (node instanceof DBXTreeFolder && node.getChildren() != null) {
        String recursiveLink)
        return null;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 *
 * DBXTreeItem
        final String term = getNodeTerm(dataSource, itemLabel, false);
                Class<?>[] parameterTypes = method.getParameterTypes();
        this.propertyName = propertyName;
        if (node instanceof DBXTreeItem && CommonUtils.equalObjects(((DBXTreeItem) node).getPath(), path)) {
            dummyMethod = Object.class.getMethod("hashCode");

            return (DBXTreeItem) node;
    }
        final String term = getNodeTerm(dataSource, label, true);
    }
        }
                (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) ||
    {
    }
            }
    @Override
        this.label = item.label;
                DBXTreeItem subItem = findChildItemByPath(subFolder, path);
    }

import org.jkiss.code.Nullable;
            log.error("Path is not specified for the item: " + config + " " + config.getAttribute("label"));
        if (CommonUtils.isEmpty(path)) {
    private static Method findPropertyGetter(Class<?> clazz, String getName, String isName) {
 */
        this.path = path;
            }
    private final boolean optional;
            return term;
    public String getPath()
    public String getNodeTypeLabel(@Nullable DBPDataSource dataSource, @Nullable String locale)
                }
    private final String propertyName;
        }
        }

        super(source, parent, config, navigable, inline, virtual, standalone, visibleIf, recursiveLink);

        this.path = item.path;

        String methodName = BeanUtils.propertyNameToMethodName(propertyName);
        return getter == NULL_GETTER ? null : getter;
        return optional;
    {
import java.lang.reflect.Modifier;
        if (term != null) {
    }
    {
    public synchronized Method getPropertyReadMethod(Class<?> objectClass) {
    private final String label;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                (method.getReturnType().equals(void.class)))
                if (parameterTypes.length == 0 || (parameterTypes.length == 1 && parameterTypes[0] == DBRProgressMonitor.class)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.itemLabel = item.itemLabel;
import org.jkiss.dbeaver.model.messages.ModelMessages;
        }
    }
 * limitations under the License.
import java.util.Map;
        boolean navigable,
import java.lang.reflect.Method;
    @Override
        if (termId.startsWith("#") && dataSource instanceof DBPTermProvider) {

 * See the License for the specific language governing permissions and
        }
        }
                // skip
                if (subItem != null) {
 * You may obtain a copy of the License at
        }
    private DBXTreeItem findChildItemByPath(DBXTreeNode node, String path) {

    public DBXTreeItem(
    }
        boolean inline,
                return term;
    }
                getter = NULL_GETTER;
            propertyGettersCache.put(objectClass, getter);
                }
    private static final Method NULL_GETTER;
        this.propertyName = item.propertyName;

 * you may not use this file except in compliance with the License.
        this.label = parent == null ? ModelMessages.model_navigator_Connection : config.getAttribute("label");
        IConfigurationElement config,
            }
    public DBXTreeItem(AbstractDescriptor source, DBXTreeNode parent, DBXTreeItem item) {
 *
        super(source, parent, item);


    public String toString() {

    public boolean isOptional()
import org.jkiss.utils.BeanUtils;
    public String getPropertyName()
 *
        String propertyName,
        NULL_GETTER = dummyMethod;
        try {

        }
                }

                DBXTreeItem subItem = findChildItemByPath(node, path);
        for (Method method : methods) {
    public DBXTreeItem findChildItemByPath(String path) {
 * DBeaver - Universal Database Manager
        return itemLabel;
        return "Item " + label;
import org.jkiss.dbeaver.Log;
        return propertyName;
    }
        return label;
            getter = findPropertyReadMethod(objectClass, propertyName);
                if (subItem != null) {
            for (DBXTreeNode node : getChildren()) {
        return null;
        Method[] methods = clazz.getDeclaredMethods();
import org.jkiss.dbeaver.model.DBPDataSource;

    }
    {
public class DBXTreeItem extends DBXTreeNode {
    static {
import java.util.IdentityHashMap;
            {


        Method getter = propertyGettersCache.get(objectClass);
                    return subItem;
    }
            if (term != null) {
/**
            }
    private final Map<Class<?>, Method> propertyGettersCache = new IdentityHashMap<>();
        if (getChildren() != null) {
            String term = ((DBPTermProvider) dataSource).getObjectTypeTerm(getPath(), termId.substring(1), multiple);
        String path,
                // If it matches the get name, it's the right method
    private final String path;

        this.itemLabel = parent == null ? ModelMessages.model_navigator_Connection : config.getAttribute("itemLabel");
    }
                    return subItem;
        return path;

    }
        } catch (NoSuchMethodException e) {
                    return method;
            } else if (method.getName().equals(getName) || (method.getName().equals(isName) && method.getReturnType().equals(boolean.class))) {
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others

            }
        boolean standalone,

    {
    }
        boolean optional,
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
            if (getter == null) {
        }

    public static Method findPropertyReadMethod(Class<?> clazz, String propertyName) {
    private String getNodeTerm(@Nullable DBPDataSource dataSource, String termId, boolean multiple)
        AbstractDescriptor source,
        this.optional = optional;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;

    @Override
        if (getter == null) {
            if ((!Modifier.isPublic(method.getModifiers())) ||

        return clazz == Object.class ? null : findPropertyGetter(clazz.getSuperclass(), getName, isName);
    private static final Log log = Log.getLog(DBXTreeItem.class);
            return term;
    public String getChildrenTypeLabel(@Nullable DBPDataSource dataSource, String locale)
import org.jkiss.dbeaver.model.DBPTermProvider;
            dummyMethod = null;
        }
        return findPropertyGetter(clazz, "get" + methodName, "is" + methodName);
    }
/*
        boolean virtual,
            itemLabel = label;
        if (itemLabel == null) {
        Method dummyMethod;
import org.eclipse.core.runtime.IConfigurationElement;
 * Unless required by applicable law or agreed to in writing, software
        this.optional = item.optional;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        DBXTreeNode parent,
package org.jkiss.dbeaver.model.navigator.meta;
