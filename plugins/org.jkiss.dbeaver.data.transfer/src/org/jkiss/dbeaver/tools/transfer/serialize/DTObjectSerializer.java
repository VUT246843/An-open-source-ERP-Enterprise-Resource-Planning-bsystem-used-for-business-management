import java.util.Map;
 * limitations under the License.
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
/*

        @NotNull CONTEXT_TYPE context,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull Map<String, Object> state) throws DBException;
 */
 * You may obtain a copy of the License at
        @NotNull CONTEXT_TYPE objectContext,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
public interface DTObjectSerializer<CONTEXT_TYPE, OBJECT_TYPE> {
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
    void serializeObject(

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        @NotNull Map<String, Object> state) throws DBException;
        @NotNull DBRRunnableContext runnableContext,
        @NotNull OBJECT_TYPE object,

 *
        @NotNull SerializerContext serializeContext,

 * Object serializer
        @NotNull DBRRunnableContext runnableContext,
 * distributed under the License is distributed on an "AS IS" BASIS,
}

    OBJECT_TYPE deserializeObject(
import org.jkiss.code.NotNull;
 *
 *

 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.tools.transfer.serialize;
