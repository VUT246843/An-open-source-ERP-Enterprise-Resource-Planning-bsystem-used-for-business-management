import org.jkiss.code.NotNull;
     *
     * Entity full qualified name.
 * Named object extension
package org.jkiss.dbeaver.model;
 * DBeaver - Universal Database Manager
     */
 *

    @NotNull
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
     * @param context evaluation context


    String getFullyQualifiedName(@NotNull DBPEvaluationContext context);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 */
 * Unless required by applicable law or agreed to in writing, software
/*
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
public interface DBPQualifiedObject extends DBPObject {
     * Should include all parent objects' names and thus uniquely identify this entity within database.
    /**
     * @return full qualified name, never returns null.
/**

 *
