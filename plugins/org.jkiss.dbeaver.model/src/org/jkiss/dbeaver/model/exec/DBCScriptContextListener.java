    }
 * You may obtain a copy of the License at
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
/**

 *
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
        DELETE
 * Script context listener.
 * DBeaver - Universal Database Manager
    void parameterChanged(ContextAction action, String name, Object value);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
        UPDATE,
 *
 */

package org.jkiss.dbeaver.model.exec;
/*
}
    void variableChanged(ContextAction action, DBCScriptContext.VariableInfo variable);
 * See the License for the specific language governing permissions and

 *     http://www.apache.org/licenses/LICENSE-2.0

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
public interface DBCScriptContextListener {
 * you may not use this file except in compliance with the License.
    enum ContextAction {
        ADD,
