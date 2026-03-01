package org.jkiss.dbeaver.model.edit.prop;
 * limitations under the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
public interface DBEPropertyReflector<OBJECT_TYPE extends DBPObject> extends DBEPropertyHandler<OBJECT_TYPE> {
} * Database object property change reflector

 * you may not use this file except in compliance with the License.


 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 */
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
/**
 *
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    void reflectValueChange(OBJECT_TYPE object, Object oldValue, Object newValue);
 * See the License for the specific language governing permissions and
 *
/*
