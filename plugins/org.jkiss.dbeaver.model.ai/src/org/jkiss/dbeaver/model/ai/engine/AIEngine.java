
 */
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
     */
    int getContextWindowSize(@NotNull DBRProgressMonitor monitor) throws DBException;

    /**
 *
/**
/*
     * @throws DBException if an error occurs
        @NotNull AIEngineRequest request,
     */
import java.util.List;

 *
     * @param monitor the progress monitor
 */

        @NotNull AIEngineResponseConsumer listener
}
     * @param request the completion request
    void close() throws DBException;

 *
        @NotNull AIEngineRequest request
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    AIEngineResponse requestCompletion(
 * you may not use this file except in compliance with the License.
    @NotNull
        @NotNull DBRProgressMonitor monitor,
 * limitations under the License.
    ) throws DBException;
    @NotNull

    @Override

 * Unless required by applicable law or agreed to in writing, software
     * Requests completions from the completion engine.
    void requestCompletionStream(
 * You may obtain a copy of the License at
        @NotNull DBRProgressMonitor monitor,

    ) throws DBException;
     * @return the completion response
     *
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
     * @throws DBException              if an error occurs
package org.jkiss.dbeaver.model.ai.engine;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    List<AIModel> getModels(@NotNull DBRProgressMonitor monitor) throws DBException;
import org.jkiss.code.NotNull;
    PROPS getProperties();
 * See the License for the specific language governing permissions and
     * Requests a stream of completion chunks from the completion engine.
 * Completion engine
public interface AIEngine<PROPS extends AIEngineProperties> extends AutoCloseable {
     * @throws TooManyRequestsException if the request limit is exceeded and the request can be retried
     * @throws TooManyRequestsException if the request limit is exceeded and the request can be retried

     * @param request  the completion request
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * @param monitor  the progress monitor
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param listener chat listener


     *
