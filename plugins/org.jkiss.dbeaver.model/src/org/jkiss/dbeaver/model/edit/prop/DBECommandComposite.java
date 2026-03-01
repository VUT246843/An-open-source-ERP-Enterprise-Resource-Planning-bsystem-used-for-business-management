    {
        return properties.get(id);
/**
 * DBeaver - Universal Database Manager

 */
        properties.put(handler.getId(), value);
//    }
 *
package org.jkiss.dbeaver.model.edit.prop;
    public void addPropertyHandler(HANDLER_TYPE handler, Object value)
    public Map<Object, Object> getProperties()
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
//    public static <OBJECT_TYPE extends DBPObject> DBECommandComposite getFromContext(DBECommandContext context, OBJECT_TYPE object, DBEPropertyHandler<OBJECT_TYPE> handler)


    }
    {
//        String compositeName = object.toString() + PROP_COMPOSITE_COMMAND;
}    }
 * you may not use this file except in compliance with the License.
    }
 */
//        if (compositeCommand == null) {
    public Object getProperty(HANDLER_TYPE handler)

 * Licensed under the Apache License, Version 2.0 (the "License");

//            context.getUserParams().put(compositeName, compositeCommand);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * Unless required by applicable law or agreed to in writing, software
//            compositeCommand = handler.createCompositeCommand(object);

public abstract class DBECommandComposite<OBJECT_TYPE extends DBPObject, HANDLER_TYPE extends DBEPropertyHandler<OBJECT_TYPE>>

    extends DBECommandAbstract<OBJECT_TYPE> {
    {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public boolean hasProperty(Object id)

        return properties.containsKey(id);
    {
//        }
import java.util.HashMap;
        super(object, title);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Object getProperty(Object id)
    {
 * limitations under the License.
//        DBECommandComposite compositeCommand = (DBECommandComposite)context.getUserParams().get(compositeName);
 *

//    {
        return properties;
    }
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
 * Composite object command
 * You may obtain a copy of the License at
//        return compositeCommand;
import org.jkiss.dbeaver.model.DBPObject;
    private Map<Object, Object> properties = new HashMap<>();

 *
        return properties.get(handler.getId());

    {

import java.util.Map;

    protected DBECommandComposite(OBJECT_TYPE object, String title)
