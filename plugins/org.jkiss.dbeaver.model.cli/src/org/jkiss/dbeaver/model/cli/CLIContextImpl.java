        return instanceController;

    @NotNull
 * See the License for the specific language governing permissions and
        this.postAction = postAction;
    private final Map<String, Object> contextParameter = new LinkedHashMap<>();
        return List.copyOf(results);

    private final List<Runnable> closeHandlers = new ArrayList<>();
        for (Runnable closeHandler : closeHandlers) {
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
 * Copyright (C) 2010-2026 DBeaver Corp and others
        return contextParameter;

    @NotNull
    @Nullable
    public void addResult(@NotNull String result) {
 *
    @Nullable
 *
    }
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
                log.error("Error during close cli context: " + e.getMessage(), e);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;
    @Nullable
 * You may obtain a copy of the License at
    }
    public void setPostAction(@Nullable CLIProcessResult.PostAction postAction) {
    }
    }
    @NotNull

        return postAction;
    public void addCloseHandler(@NotNull Runnable closeHandler) {
    @Override

        closeHandlers.add(closeHandler);
    private final ApplicationInstanceController instanceController;
    private final List<String> results = new ArrayList<>();
    private static final Log log = Log.getLog(CLIContextImpl.class);
    @Override
        this.results.add(result);
    public ApplicationInstanceController getInstanceController() {
            try {
    public Map<String, Object> getContextParameters() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        contextParameter.put(name, value);
        return (T) contextParameter.get(name);
    }
    @Nullable
package org.jkiss.dbeaver.model.cli;

    @NotNull
import org.jkiss.code.NotNull;
import java.util.LinkedHashMap;
    private CLIProcessResult.PostAction postAction = null;
    }
    @Override
}
    public <T> T getContextParameter(String name) {
 */
import java.util.ArrayList;
            } catch (Exception e) {
    public void close() {
 *

    public void setContextParameter(@NotNull String name, @NotNull Object value) {
    }
 * limitations under the License.
                closeHandler.run();
    @Override
    public CLIProcessResult.PostAction getPostAction() {
        }

    public CLIContextImpl(@Nullable ApplicationInstanceController instanceController) {
/*
    public List<String> getResults() {
 * distributed under the License is distributed on an "AS IS" BASIS,


    @Override


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }

 * you may not use this file except in compliance with the License.
    }
    @Override
import java.util.Map;
        this.instanceController = instanceController;
    @Override
    @Override

    }
import java.util.List;
public class CLIContextImpl implements AutoCloseable, CLIContext {
    }


    }
