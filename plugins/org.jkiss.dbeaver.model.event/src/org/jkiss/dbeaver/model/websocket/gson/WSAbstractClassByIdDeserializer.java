    }
 * DBeaver - Universal Database Manager
    private final Map<String, Class<? extends T>> eventClassById;
 * You may obtain a copy of the License at

 *
                         Type type,
    @Override
public abstract class WSAbstractClassByIdDeserializer<T> implements JsonDeserializer<T> {
 * See the License for the specific language governing permissions and
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    public WSAbstractClassByIdDeserializer(Map<String, Class<? extends T>> eventClassById) {
import com.google.gson.*;
    private static final String EVENT_ID_FIELD = "id";
        }
                         JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        var jsonObject = jsonElement.getAsJsonObject();
        var resultClass = eventClassById.get(eventIdElement.getAsString());

            throw new JsonParseException("Event id not present: " + jsonElement);
    public T deserialize(JsonElement jsonElement,
            throw new JsonParseException("Unknown event: " + eventIdElement);
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
        return gson.fromJson(jsonElement, resultClass);
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (eventIdElement == null) {
        if (resultClass == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final Gson gson = new Gson();
        var eventIdElement = jsonObject.get(EVENT_ID_FIELD);
 */
        this.eventClassById = eventClassById;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
import java.lang.reflect.Type;
        }

    }


import java.util.Map;
package org.jkiss.dbeaver.model.websocket.gson;
 * limitations under the License.
