 * limitations under the License.
    public enum Type {
    @Nullable
    public boolean isError() {
    private final List<AIMessageMeta> meta;
    public boolean isText() {
 * AI Assistant response
    public String getText() {
public class AIAssistantResponse {
        return type;
    public Type getType() {
        return type == Type.TEXT;
    }
 * See the License for the specific language governing permissions and
 *
    public List<AIFunctionReference> getFunctionsRefs() {
        this.functionsRefs = functionsRefs;
    private final Type type;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private List<AIFunctionReference> functionsRefs;
    public AIAssistantResponse(
 */
    @NotNull
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2026 DBeaver Corp and others


 */
    }

import java.util.List;
    @NotNull

    ) {
        ERROR
        this.result = result;



        this.meta = meta;
        FUNCTION,
        return functionsRefs;
    }
    }
        this.type = type;
package org.jkiss.dbeaver.model.ai;
    }
/*
        return meta;

    }
        TEXT,
/**
import org.jkiss.utils.CommonUtils;
 *
    }
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
        @NotNull Type type,
    }
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        @NotNull List<AIMessageMeta> meta


        return type == Type.ERROR;
}

 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setFunctionsRefs(@NotNull List<AIFunctionReference> functionsRefs) {
    }
        @NotNull Object result,
    public List<AIMessageMeta> getMeta() {
    private final Object result;
        return CommonUtils.toString(result);
 * you may not use this file except in compliance with the License.
