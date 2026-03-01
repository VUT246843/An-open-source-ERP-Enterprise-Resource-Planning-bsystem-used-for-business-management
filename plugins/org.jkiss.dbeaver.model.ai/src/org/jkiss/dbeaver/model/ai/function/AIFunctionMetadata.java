 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
import org.jkiss.code.NotNull;
        @NotNull Map<String, Object> parameters
    ) throws DBException {
import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
public class AIFunctionMetadata implements AIFunction {
/*
    @Override
 *
 * DBeaver - Universal Database Manager
 * Metadata function.

}
    }
import org.jkiss.dbeaver.model.ai.AIFunctionResult;
import java.util.Map;

package org.jkiss.dbeaver.model.ai.function;
 * You may obtain a copy of the License at
 *
        return new AIFunctionResult(AIFunctionResult.FunctionType.INFORMATION, "N/A");
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 *

 * limitations under the License.
/**
import org.jkiss.dbeaver.model.ai.AIFunctionContext;
    public AIFunctionResult callFunction(
        @NotNull AIFunctionContext context,
import org.jkiss.dbeaver.model.ai.AIFunction;

