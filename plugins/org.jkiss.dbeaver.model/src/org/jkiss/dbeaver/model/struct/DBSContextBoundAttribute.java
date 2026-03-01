 */

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPAttributeReferencePurpose;
     * @param isIncludeContainerName true to include container name, otherwise false
            boolean isIncludeContainerName,
 */
 * Context-specific entity attribute
            @Nullable String containerAliasOrNull,
    String formatMemberReference(
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;

 * Licensed under the Apache License, Version 2.0 (the "License");
     * @return attribute reference as a string (for example, {@code "(compositecolumn).datatypefield"})
package org.jkiss.dbeaver.model.struct;
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
     * @param purpose to specify in which part of query this reference will be used
            @NotNull DBPAttributeReferencePurpose purpose
 * See the License for the specific language governing permissions and
}
 * you may not use this file except in compliance with the License.
    );
 * limitations under the License.
     */
 *
/*
     * @param containerAliasOrNull data container name to use during formatting
    @NotNull

import org.jkiss.code.NotNull;
    /**
     * Makes a string addressing the attribute with respect to the context
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 *
       ({@code null} to substitute the explicit data container name, or explicit non-empty string)
public interface DBSContextBoundAttribute extends DBSEntityAttribute {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
