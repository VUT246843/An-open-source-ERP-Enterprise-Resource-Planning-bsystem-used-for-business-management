 * limitations under the License.
        }
        return new GsonBuilder()
    public static URI convertUriToWS(@NotNull URI wsServerUri) {
 * See the License for the specific language governing permissions and
 *
    public static final Gson clientGson = baseGsonBuilder()

 * Licensed under the Apache License, Version 2.0 (the "License");
public class WSUtils {
 *
import org.jkiss.dbeaver.model.websocket.gson.WSClientEventDeserializer;
 * DBeaver - Universal Database Manager
 *
 * you may not use this file except in compliance with the License.
        .create();
        return URI.create(wsEndpointLink);

    private static GsonBuilder baseGsonBuilder() {

        .setExclusionStrategies(new WSClientSideExclusionStrategy())

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.websocket.event.WSClientEvent;

package org.jkiss.dbeaver.model.websocket;
/*
            .enableComplexMapKeySerialization();
            return wsServerUri;

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.websocket.event.WSEvent;

import com.google.gson.GsonBuilder;

        var wsScheme = wsServerUri.getScheme().equals("https") ? "wss" : "ws";
        var wsEndpointLink = wsScheme + wsServerUri.toString().replaceFirst("^(http[s]?)", "");
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.websocket.gson.WSClientSideExclusionStrategy;
import com.google.gson.Gson;
            .registerTypeAdapter(WSClientEvent.class, new WSClientEventDeserializer())
import org.jkiss.code.NotNull;
 */
 * You may obtain a copy of the License at
    }
        .create();
    public static final Gson gson = baseGsonBuilder()
import java.net.URI;
    }
            .registerTypeAdapter(WSEvent.class, new WSEventDeserializer())
        if (wsServerUri.getScheme().startsWith("ws")) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
import org.jkiss.dbeaver.model.websocket.gson.WSEventDeserializer;
