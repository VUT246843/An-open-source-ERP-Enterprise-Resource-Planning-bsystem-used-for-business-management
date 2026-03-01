}
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
public interface DBEPropertyPersister<OBJECT_TYPE extends DBPObject> extends DBEPropertyHandler<OBJECT_TYPE> {
 * See the License for the specific language governing permissions and
 *
 */


 * You may obtain a copy of the License at
 */
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    DBEPersistAction[] getPersistActions(OBJECT_TYPE object, Object value);
 * Unless required by applicable law or agreed to in writing, software
 * Database object validator
import org.jkiss.dbeaver.model.DBPObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.edit.prop;
 * you may not use this file except in compliance with the License.

/**
/*
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
