package org.jkiss.dbeaver.model.edit.prop;

 */
 * you may not use this file except in compliance with the License.
}
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
/*
public interface DBEPropertyUpdater<OBJECT_TYPE extends DBPObject> extends DBEPropertyHandler<OBJECT_TYPE> {
 */
    void updateModel(OBJECT_TYPE object, Object value);
/**
 *

 * Unless required by applicable law or agreed to in writing, software
 *
 * Database object property updater
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");

 * DBeaver - Universal Database Manager
