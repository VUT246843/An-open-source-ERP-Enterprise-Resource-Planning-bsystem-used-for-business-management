    public static final String PROP_SIZE = "SIZE";

            propertyCollector.collectProperties();
    }
import org.jkiss.dbeaver.model.DBPNamedObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public abstract void fromMap(@NotNull ERDContext context, Map<String, Object> map);
        return userData;
    }
        if (listeners != null) {
 *
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    public static final String PROP_CHILD = "CHILD";
 *     http://www.apache.org/licenses/LICENSE-2.0
    private transient PropertyChangeSupport listeners = null;//new PropertyChangeSupport(this);
        listeners.addPropertyChangeListener(l);
    public void removePropertyChangeListener(PropertyChangeListener l) {
        this.object = object;
        }
 * @author Serge Rider

 * Unless required by applicable law or agreed to in writing, software
        if (adapter == DBPPropertySource.class) {
 * limitations under the License.
    public OBJECT getObject() {
    public static final String PROP_NAME = "NAME";
 * Provides base class support for model objects to participate in event handling framework
    public static final String PROP_REORDER = "REORDER";
        if (listeners != null) {

 * Created on Jul 15, 2004


 */
        this.userData = userData;
import java.beans.PropertyChangeSupport;
    private Object userData;
 */
 * you may not use this file except in compliance with the License.
        return object;
package org.jkiss.dbeaver.model.erd;
        }
import java.util.Map;
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
            listeners.firePropertyChange(prop, old, newValue);
    }
    public void firePropertyChange(String prop, Object old, Object newValue) {

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.beans.PropertyChangeListener;

/*

    public static final String PROP_CONTENTS = "CONTENTS";
    }

import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
            PropertyCollector propertyCollector = new PropertyCollector(object, false);


        }
public abstract class ERDObject<OBJECT> implements DBPAdaptable, DBPNamedObject {
    public abstract Map<String, Object> toMap(@NotNull ERDContext context, boolean fullInfo);
            listeners.removePropertyChangeListener(l);

    @Override
 *
    public Object getUserData() {
            listeners = new PropertyChangeSupport(this);
    protected ERDObject(OBJECT object) {
    }

            return adapter.cast(propertyCollector);
        if (listeners == null) {

/*
        return null;
    public <T> T getAdapter(@NotNull Class<T> adapter) {
    }
    }
 */
import org.jkiss.dbeaver.model.DBPAdaptable;
import org.jkiss.code.NotNull;
    public void addPropertyChangeListener(PropertyChangeListener l) {
    public static final String PROP_OUTPUT = "OUTPUT";
    public void setObject(OBJECT object) {
    public static final String PROP_INPUT = "INPUT";
        this.object = object;
    public void setUserData(Object userData) {
    }

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
/**



    }
}
    protected OBJECT object;
 *
 *
 * You may obtain a copy of the License at
