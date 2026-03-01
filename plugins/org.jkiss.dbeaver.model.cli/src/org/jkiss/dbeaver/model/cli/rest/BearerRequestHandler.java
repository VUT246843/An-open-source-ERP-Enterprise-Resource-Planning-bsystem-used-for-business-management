    }
        this.token = token;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void handle(HttpExchange exchange) throws IOException {
        }
import org.jkiss.code.Nullable;
            || !authHeader.startsWith(HttpConstants.BEARER_PREFIX)
        @NotNull Class<T> cls,
import org.jkiss.utils.HttpConstants;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
import com.sun.net.httpserver.HttpExchange;
 * DBeaver - Universal Database Manager
    }
public class BearerRequestHandler<T> extends RestServer.RequestHandler<T> {
    public BearerRequestHandler(
}
        @NotNull Gson gson,
 *
 * limitations under the License.
    private final String token;
            return;
        super(cls, object, gson, filter, landingPage);
        @NotNull String token

import java.net.InetSocketAddress;
import org.jkiss.code.NotNull;
 *
import java.io.IOException;
import org.jkiss.utils.rest.RpcConstants;
        super.handle(exchange);
 * Unless required by applicable law or agreed to in writing, software
    ) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        String authHeader = exchange.getRequestHeaders().getFirst(HttpConstants.HEADER_AUTHORIZATION);
 * you may not use this file except in compliance with the License.
        ) {
import org.jkiss.utils.rest.RestServer;


            sendError(exchange, RpcConstants.SC_FORBIDDEN, "Not authorized");
            || !token.equals(authHeader.substring(HttpConstants.BEARER_PREFIX.length()))
package org.jkiss.dbeaver.model.cli.rest;
        @Nullable String landingPage,
 */
        @NotNull T object,
import java.util.function.Predicate;
 * You may obtain a copy of the License at
/*
        @NotNull Predicate<InetSocketAddress> filter,
import java.util.logging.Logger;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override

 *
import org.jkiss.utils.CommonUtils;
    private static final Logger log = Logger.getLogger(BearerRequestHandler.class.getName());

    @NotNull
        if (CommonUtils.isEmpty(authHeader)
import com.google.gson.Gson;
