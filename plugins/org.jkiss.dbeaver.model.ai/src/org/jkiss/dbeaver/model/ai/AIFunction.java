 * See the License for the specific language governing permissions and

 */
    @NotNull
    AIFunctionResult callFunction(
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
    /**
import java.util.Map;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * You may obtain a copy of the License at
 * AI function.

     */
     * Calls function
 */
public interface AIFunction {
        @NotNull AIFunctionContext context,

 * DBeaver - Universal Database Manager
 *
}
        @NotNull Map<String, Object> parameters
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

package org.jkiss.dbeaver.model.ai;
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    ) throws DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software

