                return result;
public abstract class PropertySourceAbstract implements DBPPropertyManager, IPropertySourceMulti
    ) {
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            refreshProperties(false);
            }

    /**
        public Object getFamily() {
        }
        propValues.put(id, value);
    public final void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value)
                                @Override
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        }
    }
                                new PropertyValueLoadVisualizer());
    private Job lazyLoadJob;
        return enableFilters;
                    throw ite;
    }
    }
        public PropertyValueLoadService()
    public synchronized void removeProperty(DBPPropertyDescriptor prop) {

    private String locale;
    public synchronized boolean isEmpty()
        Object value = propValues.get(id);
        try {
                if (ex instanceof InvocationTargetException ite) {
 * Licensed under the Apache License, Version 2.0 (the "License");

            // Do not add it to property list
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
                e = ite.getTargetException();

        return props.contains(prop);
            if (e instanceof InvocationTargetException ite) {
            if (result != null) {
        {
        props.remove(prop);
                filter = null;
        return props.isEmpty();
    @Override
    }
            case 2: dots = ".."; break;
    private Map<DBPPropertyDescriptor, Object> changedPropertiesValues = new HashMap<>();
                return prop.readValue(object, monitor, formatValue);
 *

        propValues.clear();
    }
 *
        {
        propValues.put(prop.getId(), prop);
    @NotNull
                            lazyLoadJob = DBWorkbench.getPlatformUI().createLoadingService(
        if (prop instanceof ObjectPropertyDescriptor) {
        {

    }
                                }
import org.jkiss.dbeaver.model.struct.DBSObject;
    public synchronized void addProperty(@NotNull DBPPropertyDescriptor prop) {
    private final Object sourceObject;
                }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            try {
            return completed;
            return !prop.isLazy(object, true) && prop.readValue(object, null, false) != null;
            final Object editableValue = getEditableValue();
    {
            if (isEnableFilters()) {
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

            throw new UnsupportedOperationException("Direct property reset not implemented");
    public boolean collectProperties() {
    }
        if (value instanceof ObjectPropertyDescriptor opd) {
    private final List<DBPPropertyDescriptor> props = new ArrayList<>();
                    return null;
                    }
                List<ObjectPropertyDescriptor> result = new ArrayList<>(lazyProps);
        }
            props.add(prop);
        }
        if (value instanceof ObjectPropertyDescriptor opd) {

    }
/*
    }
import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;
                } else {
    }
 * Unless required by applicable law or agreed to in writing, software
            if (prop.getId().equals(id)) {
        try {


import java.lang.reflect.InvocationTargetException;
    @Override
    }
        //private Object propertyId;
    private final Object object;
    public synchronized void addProperty(@Nullable String category, String id, String name, Object value)
                    return value;
        }
                        if (lazyLoadJob == null) {
                                public void done(IJobChangeEvent event)
    private final boolean loadLazyProps;

        }
            }
        if (value instanceof ObjectPropertyDescriptor) {
        @Nullable Object value
            throws InvocationTargetException
                }
    public void setEnableFilters(boolean enableFilters) {
        props.clear();
                    }
                    }
import org.jkiss.dbeaver.model.messages.ModelMessages;
        }
    {
                        }
            }
                } else if (editableValue instanceof DBPContextProvider) {
    public Object getSourceObject()
    {
                return prop;
                if (lazyValues.containsKey(prop.getId())) {
    private final Map<Object, Object> lazyValues = new HashMap<>();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            }

        }
 * limitations under the License.
    public Object getPropertyValue(
                    PropertiesContributor.getInstance().notifyPropertyLoad(getEditableValue(), entry.getKey(), entry.getValue(), true);
        public DBRProgressMonitor overwriteMonitor(DBRProgressMonitor monitor)
        this.loadLazyProps = loadLazyProps;
            List<ObjectPropertyDescriptor> annoProps = ObjectAttributeDescriptor.extractAnnotations(
                    result.put(prop, prop.readValue(getEditableValue(), monitor, true));
                }


    }
        Object value = propValues.get(id);

            return false;
        throw new UnsupportedOperationException("Cannot reset property in non-editable property source");
    public boolean isEnableFilters() {
                            // So, start lazy loading job to update it after value will be loaded
    @Override
        @NotNull ObjectPropertyDescriptor prop,
        } else {
        @Override
                    if (monitor.isCanceled()) {
            }
        return false;
        return sourceObject;
        propValues.clear();
    {
    @Override
    @Override
                                    synchronized (lazyProps) {
        @Override
        } else {


        return value;
                if (value != null) {
                if (desc.isPropertyVisible(editableValue, editableValue)) {
        } catch (Throwable e) {
    public boolean isPropertySet(@NotNull Object object, @NotNull ObjectPropertyDescriptor prop) {
                }
    ) {
                            });
    public Object getEditableValue()
            case 0: dots = ""; break;
            }

     * constructs property source
import org.jkiss.code.NotNull;
        }

        propValues.remove(prop.getId());
                            lazyLoadJob.schedule(100);
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull Object object, @NotNull ObjectPropertyDescriptor id) {
        @Override


        props.add(new PropertyDescriptor(category, id, name, null, value == null ? null : value.getClass(), false, null, null, false));


import org.eclipse.core.runtime.jobs.Job;
                    filter = context == null ? new DataSourcePropertyFilter() : new DataSourcePropertyFilter(context.getDataSource());
            } catch (Throwable ex) {
    }
    {
    public DBPPropertyDescriptor[] getProperties() {
{
 * you may not use this file except in compliance with the License.
        {

import org.jkiss.dbeaver.Log;

    private boolean enableFilters = true;
        return object;
                if (!loadLazyProps) {
                        lazyProps.add(prop);
        } else {
                    DBCExecutionContext context = ((DBPContextProvider) editableValue).getExecutionContext();

            if (monitor == null && prop.isLazy(object, true) && !prop.supportsPreview()) {
            } else {
    }
        return enableFilters;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return editableValue instanceof DBSObject ? ((DBSObject) editableValue).getDataSource() : editableValue;
            String dots;
                                        } else {
                                            lazyLoadJob.schedule(100);
        {
                    // Some lazy props has null value
                    // Return dummy string for now
    }
                for (ObjectPropertyDescriptor prop : obtainLazyProperties()) {
                }
    @Override

        private boolean completed = false;
    @Override
    {
            log.error("Error reading property '" + prop.getId() + "' from " + object, e);
        }
    public synchronized void clearProperties() {

import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
            switch (callCount++ % 4) {

    private class PropertyValueLoadService extends AbstractLoadService<Map<ObjectPropertyDescriptor, Object>> {
    @Override
            if (lazyProps.isEmpty()) {
        if (editableValue != null) {
*/
 */
/**

        private PropertyValueLoadVisualizer()
        @Nullable DBRProgressMonitor monitor,
     * @param object object
    public void setChangedPropertiesMap(Map<DBPPropertyDescriptor, Object> newMap) {
 *
                    return null;
                                new PropertyValueLoadService(),
        } catch (Exception e) {
    }
                                {
            }
    public void setPropertyValue(
        lazyValues.clear();
    }
        }
            propValues.put(propertyId, PropertyValueLoadService.TEXT_LOADING + dots);

import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizer;
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
    public void setLocale(String locale) {
                DBPPropertyDescriptor[] ownProperties = ownPropSource.getProperties();
import org.jkiss.dbeaver.runtime.DBWorkbench;
            setPropertyValue(monitor, getEditableValue(), (ObjectPropertyDescriptor) prop, value);
            } else {

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
            completed = true;
            return false;
                this, ObjectPropertyDescriptor.getObjectClass(editableValue), filter, locale);
                        break;
            IPropertyFilter filter;

        this.changedPropertiesValues = newMap;
        @NotNull Object object,
    @Nullable
        } else {
    }
                Map<ObjectPropertyDescriptor, Object> result = new IdentityHashMap<>();
        Object value = propValues.get(id);
                        propValues.put(prop.getId(), ownPropSource.getPropertyValue(null, prop.getId()));
    public synchronized boolean hasProperty(ObjectPropertyDescriptor prop)
    @Nullable
        synchronized (lazyProps) {
            resetPropertyValue(monitor, getEditableValue(), (ObjectPropertyDescriptor) value);
        } else {
        lazyValues.clear();
    public void resetPropertyValueToDefault(@NotNull String id) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        }
        @Nullable DBRProgressMonitor monitor,
    }
        //private int callCount = 0;
            if (editableValue instanceof DBPPropertySource ownPropSource) {

    }

        boolean formatValue
                        props.add(prop);
        }
        }
        @Override
                            lazyLoadJob.addJobChangeListener(new JobChangeAdapter() {
            return monitor;
import org.jkiss.code.Nullable;
    public boolean getEnableFilters() {
    }
        changedPropertiesValues.put(descriptor, newValue);

import org.jkiss.dbeaver.model.preferences.DBPPropertyManager;
        if (value instanceof ObjectPropertyDescriptor opd) {
    @Override
 * See the License for the specific language governing permissions and
                    filter = new DataSourcePropertyFilter();
    }
        this.enableFilters = enableFilters;
            case 3: default: dots = "..."; break;
        final Object editableValue = getEditableValue();
    public final Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull final String id) {
            value = getPropertyValue(monitor, getEditableValue(), opd, true);
        public void visualizeLoading()
            log.error("Error reading property '" + prop.getId() + "' from " + object, e);

            case 1: dots = "."; break;
    private class PropertyValueLoadVisualizer implements ILoadVisualizer<Map<ObjectPropertyDescriptor, Object>> {
/*
                return result;
}            }
                    lazyValues.put(prop.getId(), null);

        public void completeLoading(Map<ObjectPropertyDescriptor, Object> result)
     */
    }
    @Override
                    addProperty(desc);
                                    }
                } else {
                if (editableValue instanceof DBSObject) {
                lazyProps.clear();
    private static final Log log = Log.getLog(PropertySourceAbstract.class);

    }
            return isPropertySet(getEditableValue(), opd);
        {
        if (prop instanceof ObjectPropertyDescriptor opd && opd.isHidden()) {
                    throw new InvocationTargetException(ex);
 *     http://www.apache.org/licenses/LICENSE-2.0
                    filter = new DataSourcePropertyFilter(((DBSObject) editableValue).getDataSource());
                if (!ArrayUtils.isEmpty(ownProperties)) {
        }
                for (Map.Entry<ObjectPropertyDescriptor, Object> entry : result.entrySet()) {
    {
                final Object value = lazyValues.get(prop.getId());
        public boolean isCompleted()
                            // We assume that it can be called ONLY by properties viewer
            lazyValues.put(((ObjectPropertyDescriptor) prop).getId(), value);
 * PropertyCollector
        Object value = propValues.get(id);
    private final List<ObjectPropertyDescriptor> lazyProps = new ArrayList<>();
    public DBPPropertyDescriptor getProperty(String id) {
            for (final ObjectPropertyDescriptor desc : annoProps) {
    @NotNull
            // No by default
        this.locale = locale;
        public Map<ObjectPropertyDescriptor, Object> evaluate(@NotNull DBRProgressMonitor monitor)
    public Map<DBPPropertyDescriptor, Object> getChangedPropertiesValues() {
        {
        throw new UnsupportedOperationException("Cannot update property in non-editable property source");
        @NotNull ObjectPropertyDescriptor prop,
    }
    }
                    synchronized (lazyProps) {
            return e.getMessage();
    }
    public void addChangedProperties(DBPPropertyDescriptor descriptor, Object newValue) {
        throw new UnsupportedOperationException("Cannot reset property in non-editable property source");
        @Override
                return Collections.emptyList();
    public boolean isPropertySet(@NotNull String id) {
        }
        return changedPropertiesValues;
        this.object = object;
    public boolean isPropertyResettable(@NotNull String id) {
    }
                                        }
    private List<ObjectPropertyDescriptor> obtainLazyProperties()
    private final Map<Object, Object> propValues = new HashMap<>();
            return value != null;

        }
import org.jkiss.utils.ArrayUtils;
        props.clear();
    public final void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
            propValues.put(id, value);
            } else {
    @Override
                }
    @Override
                                            lazyLoadJob = null;
    public PropertySourceAbstract(Object sourceObject, Object object, boolean loadLazyProps) {
import org.jkiss.dbeaver.model.DBPContextProvider;
        @NotNull Object object,
    }
            super(ModelMessages.model_navigator_load_);
            }
    }
    {
                                        if (!lazyProps.isEmpty()) {
    public boolean isPropertyResettable(@NotNull Object object, @NotNull ObjectPropertyDescriptor prop)
    @Override
        @Override
                    return null;
    }
                }
                    for (DBPPropertyDescriptor prop : ownProperties) {


                } else {
 */

        this.sourceObject = sourceObject;
        return null;
        lazyValues.remove(prop.getId());
            return isPropertyResettable(getEditableValue(), opd);
                }

        return !props.isEmpty();
        for (DBPPropertyDescriptor prop : props) {

        Object prop = propValues.get(id);
                }


import java.util.*;
        }
                    lazyValues.put(entry.getKey().getId(), entry.getValue());
package org.jkiss.dbeaver.runtime.properties;
        return props.toArray(new DBPPropertyDescriptor[0]);
    }
