 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
import java.net.http.HttpRequest;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        for (var headerEntry : request.headers().map().entrySet()) {
    public OpenAIRequestFilter(String token) {

    public HttpRequest filter(@NotNull HttpRequest request, boolean setContentType) {
public class OpenAIRequestFilter implements OpenAIClient.HttpRequestFilter {

 *
import org.jkiss.code.NotNull;
            builder.header(HttpConstants.HEADER_CONTENT_TYPE, HttpConstants.CONTENT_TYPE_JSON);
        this.token = token;
        }
            }
    }
    private final String token;

 */
 *     http://www.apache.org/licenses/LICENSE-2.0
            .headers(HttpConstants.HEADER_AUTHORIZATION, "Bearer " + token);
            .uri(request.uri())
        }
 * you may not use this file except in compliance with the License.
 * limitations under the License.

        if (setContentType) {
 * Licensed under the Apache License, Version 2.0 (the "License");
}
    }
 * See the License for the specific language governing permissions and
    @NotNull
import org.jkiss.utils.HttpConstants;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software

                builder.header(headerEntry.getKey(), value);
 *
        return builder.build();
            for (String value : headerEntry.getValue()) {
 *
package org.jkiss.dbeaver.model.ai.engine.openai;
        HttpRequest.Builder builder = HttpRequest.newBuilder(request.uri())

 * You may obtain a copy of the License at
            .method(request.method(), request.bodyPublisher().orElse(HttpRequest.BodyPublishers.noBody()))
/*
