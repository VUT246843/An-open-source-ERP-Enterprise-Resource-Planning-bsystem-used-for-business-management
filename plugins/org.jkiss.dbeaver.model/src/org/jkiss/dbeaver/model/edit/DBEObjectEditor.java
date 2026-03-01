 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.edit.prop.DBEPropertyHandler;
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");

}
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    boolean canEditObject(@NotNull OBJECT_TYPE object);
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
/*
 */
 *
/**
import org.jkiss.code.NotNull;

    DBEPropertyHandler<OBJECT_TYPE> makePropertyHandler(@NotNull OBJECT_TYPE object, @NotNull DBPPropertyDescriptor property);
 * limitations under the License.
 * You may obtain a copy of the License at
 */
package org.jkiss.dbeaver.model.edit;
 *
 * See the License for the specific language governing permissions and


 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPObject;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Object editor

public interface DBEObjectEditor <OBJECT_TYPE extends DBPObject> extends DBEObjectManager<OBJECT_TYPE> {
