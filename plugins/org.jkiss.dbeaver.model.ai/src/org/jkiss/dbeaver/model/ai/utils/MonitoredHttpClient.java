 */
     * The method will also check if the progress monitor is cancelled and cancel the request if it is.
                    errorHandler.accept(e);
            monitor.done();
        monitor.beginTask("Request AI completion", 1);
            });
import java.util.concurrent.CompletableFuture;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String send(
     * Send an HTTP request and return the response body as an object.

                response.body().forEach(eventHandler);
    private final HttpClient client;
 *
        DBException map(int statusCode, @NotNull String body);
 * DBeaver - Universal Database Manager
            })
import java.util.concurrent.TimeUnit;
            HttpResponse<String> response = responseCompletableFuture.get();
 * limitations under the License.
        this.errorMapper = errorMapper;
public class MonitoredHttpClient implements AutoCloseable {
import java.util.concurrent.ExecutionException;
     * The request is sent asynchronously and the method will block until the response is received.
        client.close();
    /**
                int statusCode = response.statusCode();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofLines())
/*
import java.net.http.HttpRequest;
                return response.body();
        this.client = client;
            .thenAccept(response -> {

import java.util.stream.Collectors;
        @NotNull Consumer<Throwable> errorHandler,
                }

            }


    public interface ErrorMapper {
import java.net.http.HttpResponse;
                    throw new InterruptedException();
        return client;
    public void close() {

        @NotNull
            .whenComplete((v, e) -> {
            if (response.statusCode() == 200) {
                    errorHandler.accept(errorMapper.map(statusCode, responseBody));


        } catch (ExecutionException e) {
     * Maps an HTTP status code and response body to a {@link DBException}.
            throw new DBException("Request was cancelled", e);
            throw new DBException("Request failed", e);
    public MonitoredHttpClient(@NotNull HttpClient client, @NotNull ErrorMapper errorMapper) {
    }
        } finally {
            monitor.subTask("Sending request to " + request.uri());
        @NotNull Consumer<String> eventHandler,
                }
    public CompletableFuture<Void> sendAsync(
            }
        }
        DBRProgressMonitor monitor,
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.function.Consumer;
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
                    return;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        } catch (InterruptedException e) {
                TimeUnit.MILLISECONDS.sleep(100);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
    @NotNull
            while (true) {
}
                if (monitor.isCanceled()) {

package org.jkiss.dbeaver.model.ai.utils;
    public HttpClient getHttpClient() {

 * Unless required by applicable law or agreed to in writing, software
import java.net.http.HttpClient;
 *
                } else {
    ) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
        @NotNull Runnable completionHandler
                    break;
import org.jkiss.code.NotNull;
    private final ErrorMapper errorMapper;
    }
        try {
            } else {
    ) {
        HttpRequest request
 * you may not use this file except in compliance with the License.
 *

        CompletableFuture<HttpResponse<String>> responseCompletableFuture = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

                if (statusCode != 200) {
                }
    @FunctionalInterface
                    completionHandler.run();
                    String responseBody = response.body().collect(Collectors.joining());
    }
    @NotNull
                throw errorMapper.map(response.statusCode(), response.body());

    }
                if (responseCompletableFuture.isDone()) {
    }

    /**
        @NotNull HttpRequest request,
    @Override
 * See the License for the specific language governing permissions and

                    responseCompletableFuture.cancel(true);
                if (e != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
