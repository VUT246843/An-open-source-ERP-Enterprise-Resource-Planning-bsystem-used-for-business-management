 * Command filter.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.edit;

    void filterCommands(DBECommandQueue<OBJECT_TYPE> queue);
import org.jkiss.dbeaver.model.struct.DBSObject;
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
 * You may obtain a copy of the License at


 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
/*
} * distributed under the License is distributed on an "AS IS" BASIS,
 */

 *
 *
/**
public interface DBECommandFilter<OBJECT_TYPE extends DBSObject> {
