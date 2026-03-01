    <T> T getContextParameter(String name);
/*
import java.util.Map;

 * Copyright (C) 2010-2026 DBeaver Corp and others
package org.jkiss.dbeaver.model.cli;
    CLIProcessResult.PostAction getPostAction();
 *
 * limitations under the License.
 * See the License for the specific language governing permissions and
    void addCloseHandler(@NotNull Runnable closeHandler);
 */
    List<String> getResults();

    @NotNull
import java.util.List;
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
}

 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    void setPostAction(@Nullable CLIProcessResult.PostAction postAction);
    @Nullable

 *
 * DBeaver - Universal Database Manager
    void addResult(@NotNull String result);


    @Nullable

 *
    Map<String, Object> getContextParameters();
 * You may obtain a copy of the License at


import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");

public interface CLIContext {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void setContextParameter(@NotNull String name, @NotNull Object value);
