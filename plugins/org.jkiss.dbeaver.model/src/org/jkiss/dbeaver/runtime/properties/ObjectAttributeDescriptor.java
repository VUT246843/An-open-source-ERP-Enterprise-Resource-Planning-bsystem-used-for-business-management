/*
            // defines id of property if parent group has group id
        if (this.getter.getParameterTypes().length > 0 && getter.getParameterTypes()[0] == DBRProgressMonitor.class) {
            this.id = BeanUtils.getPropertyNameFromGetter(getter.getName());
        Object object = source == null ? null : source.getEditableValue();
                try {
        }
            if (propGroupInfo != null && method.getReturnType() != null) {

        if (isLazy) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return annoProps;
        annoProps.sort(ATTRIBUTE_DESCRIPTOR_COMPARATOR);
    {
            if (parent != null) {

        return orderNumber;

                    return true;
                annoProps.add(desc);
    }
    {
    public DBPPropertySource getSource() {
    }
                }
                }
        Method getter,
        }

            if (lazyInfo != null) {
    static void extractAnnotations(
    }
    public boolean isDescriptionProperty() {
    public String getId()
        this.orderNumber = orderNumber;
import org.jkiss.dbeaver.model.struct.DBSObject;
                if (parent.isLazy(object, true)) {
            annoProps.addAll(ObjectAttributeDescriptor.extractAnnotations(source, objectClass, filter, null));
        return id.equals(DBConstants.PROP_ID_NAME) || orderNumber == 1;
    {
        return id.equals(DBConstants.PROP_ID_DESCRIPTION);
                this.id = parentGroupId + "." + this.id;
    }
    public static Class<?> getObjectClass(Object theObject) {

        List<ObjectPropertyDescriptor> annoProps,
        if (isLazy && cacheValidator != null) {
                    annoProps.removeIf(
        Map<String, Method> passedNames = new HashMap<>();
        annoProps.sort(ATTRIBUTE_DESCRIPTOR_COMPARATOR);
    public int getOrderNumber()
                        objectPropertyDescriptor -> objectPropertyDescriptor.getId().equals(desc.getId()));
                if (newReturnType == null || prevReturnType == null || newReturnType == prevReturnType || !prevReturnType.isAssignableFrom(newReturnType)) {
    };

        }

    public Class<?> getDeclaringClass()
        extractAnnotations(source, null, theClass, annoProps, filter, locale);
                    log.debug(e);
                } catch (Exception e) {
    }
                try {
        Class<?> theClass,
                    continue;
import org.jkiss.utils.BeanUtils;
    ) {
        ObjectPropertyGroupDescriptor parent,
    }
    private final ObjectPropertyGroupDescriptor parent;
        }
import org.jkiss.dbeaver.model.DBConstants;
                ObjectPropertyDescriptor desc = new ObjectPropertyDescriptor(source, parent, propInfo, method, locale);
    public Method getGetter() {
    public ObjectAttributeDescriptor(
    public IPropertyCacheValidator getCacheValidator()
        return source;
                    // Parent isn't lazy so use null progress monitor
                }
    }
            }
        this.id = id;
                    continue;
                    // Remove previous anno
            }
    }
    @NotNull
                final Class<?> newReturnType = method.getReturnType();
                    continue;
        return parent;

 * You may obtain a copy of the License at
        return annoProps;
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
}
    {
            String methodFullName = method.getDeclaringClass().getName() + "." + method.getName();
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.getter = getter;
        Method[] methods = theClass.getMethods();
                if (propInfo == null || !BeanUtils.isGetterName(method.getName()) || method.getReturnType() == null) {
                    cacheValidator = lazyInfo.cacheValidator().getConstructor().newInstance();

        this.source = source;
        List<ObjectPropertyDescriptor> annoProps = new ArrayList<ObjectPropertyDescriptor>();
        if (CommonUtils.isEmpty(this.id)) {
    }
    }
        }
 */
import java.lang.reflect.Method;
            if (prevMethod != null) {
        IPropertyFilter filter,
            final PropertyGroup propGroupInfo = method.getAnnotation(PropertyGroup.class);
import org.jkiss.dbeaver.Log;
import org.jkiss.utils.CommonUtils;
    }
            return false;
                } catch (Exception e) {
 * you may not use this file except in compliance with the License.
                passedNames.put(methodFullName, method);


    {
                // Let it another chance. New return types seems to be subclass of previous

    }
 *
            }
    @NotNull
        }
        return isLazy;
                    return true;
 * Unless required by applicable law or agreed to in writing, software
/**
        return declaringClass;
            return o1.getOrderNumber() - o2.getOrderNumber();
 * Copyright (C) 2010-2025 DBeaver Corp and others
                if (filter != null && !filter.select(object, desc)) {
    private final Method getter;
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
 * limitations under the License.
 *
    public static final Comparator<ObjectAttributeDescriptor> ATTRIBUTE_DESCRIPTOR_COMPARATOR = new Comparator<ObjectAttributeDescriptor>() {
        }
                    object = parent.getGroupObject(object, null);
        public int compare(ObjectAttributeDescriptor o1, ObjectAttributeDescriptor o2) {
                // The same method but probably with another return type

        @Nullable String locale)


        if (object instanceof DBSObject dbso && !dbso.isPersisted()) {
            return !cacheValidator.isPropertyCached(object, id);
    public abstract String getCategory();
                }
        IPropertyFilter filter)
                annoProps.addAll(groupDescriptor.getChildren());

        }
            }
    }
        return theObject.getClass();
        return id;
        @Nullable String locale

    public static List<ObjectPropertyDescriptor> extractAnnotations(
        for (Class<?> objectClass : classList) {
        @Nullable DBPPropertySource source,
        @Override
import java.lang.annotation.Annotation;

                // Property group
                ObjectPropertyGroupDescriptor groupDescriptor = new ObjectPropertyGroupDescriptor(source, parent, method, propGroupInfo, filter, locale);
        declaringClass = parent == null ? getter.getDeclaringClass() : parent.getDeclaringClass();
            // cloudbeaver param
            String parentGroupId = parent == null ? null : parent.getGroupId();



        for (Method method : methods) {

    private final int orderNumber;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    log.warn("Can't instantiate lazy cache validator '" + lazyInfo.cacheValidator().getName() + "'", e);
                // Single property
import org.jkiss.dbeaver.model.meta.LazyProperty;
    static final Log log = Log.getLog(ObjectAttributeDescriptor.class);
        Class<?> theClass,
        return cacheValidator;
    public boolean isNameProperty() {
public abstract class ObjectAttributeDescriptor {
import org.jkiss.dbeaver.model.meta.Property;
package org.jkiss.dbeaver.runtime.properties;
        return getter == null ? null : getter.getAnnotation(annoType);
 * Abstract object attribute
import java.util.*;
import org.jkiss.code.Nullable;
            } else {
 */
    private IPropertyCacheValidator cacheValidator;

        Collection<Class<?>> classList,
    public abstract String getDescription();
 * See the License for the specific language governing permissions and
        List<ObjectPropertyDescriptor> annoProps = new ArrayList<>();
    }
import org.jkiss.code.NotNull;
    }
    public ObjectPropertyGroupDescriptor getParent()
    {
        @Nullable ObjectPropertyGroupDescriptor parent,
    public boolean isLazy()

        return isLazy || (checkParent && parent != null && parent.isLazy(object, checkParent));

        this.parent = parent;
        String id,
    public boolean isRemote()
        return getter;
        return isLazy || parent != null && parent.isRemote();
        int orderNumber)
    }
            }
    {
    {
                final Class<?> prevReturnType = prevMethod.getReturnType();
            final LazyProperty lazyInfo = getter.getAnnotation(LazyProperty.class);
    private boolean isLazy;
    public static List<ObjectPropertyDescriptor> extractAnnotations(
        DBPPropertySource source,

                if (prevMethod != null) {
            if (CommonUtils.isNotEmpty(parentGroupId)) {

    private String id;
import org.jkiss.dbeaver.model.meta.PropertyGroup;
                }
    }
    public <T extends Annotation> T getAnnotation(Class<T> annoType) {
            this.isLazy = true;
    public boolean isLazy(@NotNull Object object, boolean checkParent)
            final Method prevMethod = passedNames.get(methodFullName);

        @Nullable DBPPropertySource source,
    @NotNull
                final Property propInfo = method.getAnnotation(Property.class);
    {

    }
 * DBeaver - Universal Database Manager
        IPropertyFilter filter,
import org.jkiss.dbeaver.model.meta.IPropertyCacheValidator;
        @Nullable DBPPropertySource source,
 *
    {
                }
    private final Class<?> declaringClass;
                }
    private final DBPPropertySource source;
 * distributed under the License is distributed on an "AS IS" BASIS,
