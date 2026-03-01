    public DBECommandDeleteObject(OBJECT_TYPE object, String title)
 * you may not use this file except in compliance with the License.
        }
 */
 */
 *
    public DBECommand<?> merge(@NotNull DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams)
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (prevCommand != null && prevCommand.getObject() == getObject()) {
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
            return null;
 * You may obtain a copy of the License at
import java.util.Map;
import org.jkiss.dbeaver.model.DBPObject;
    }
        super(object, title);
package org.jkiss.dbeaver.model.edit.prop;
 * Delete object command

public abstract class DBECommandDeleteObject<OBJECT_TYPE extends DBPObject> extends DBECommandAbstract<OBJECT_TYPE> {

    @Override
        return this;
    //public static final String PROP_COMPOSITE_COMMAND = ".composite";

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and

/*
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
 * Unless required by applicable law or agreed to in writing, software
    {
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * DBeaver - Universal Database Manager
    }
 *
    @NotNull
}import org.jkiss.dbeaver.model.edit.DBECommand;
    {

 * limitations under the License.
