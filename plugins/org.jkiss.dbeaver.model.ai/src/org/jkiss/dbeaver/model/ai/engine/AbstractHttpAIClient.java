/*
 * Unless required by applicable law or agreed to in writing, software
public abstract class AbstractHttpAIClient implements AutoCloseable {
    protected final MonitoredHttpClient client;
import org.jkiss.dbeaver.model.ai.utils.MonitoredHttpClient;
        );

        this.client = new MonitoredHttpClient(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param body the body of the HTTP error response, not null
    }
     * Maps an HTTP error response to a corresponding {@link DBException}.
 */
            HttpClient.newHttpClient(),
     */
import java.net.http.HttpClient;
    protected abstract DBException mapHttpError(int statusCode, @NotNull String body);
        client.close();
 * See the License for the specific language governing permissions and
    public void close() {
 * You may obtain a copy of the License at


    @Override
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
 *

 * limitations under the License.
 * you may not use this file except in compliance with the License.
            this::mapHttpError
package org.jkiss.dbeaver.model.ai.engine;
 *
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
     * @return a {@link DBException} that represents the mapped error, not null
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
     *
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Licensed under the Apache License, Version 2.0 (the "License");
     * @param statusCode the HTTP status code of the error response

    public AbstractHttpAIClient() {
import org.jkiss.dbeaver.DBException;
    /**
