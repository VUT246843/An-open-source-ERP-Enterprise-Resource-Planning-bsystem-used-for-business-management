    public Number deserialize(JsonElement json, Type type, JsonDeserializationContext context)

 * See the License for the specific language governing permissions and
    @Override

    public JsonElement serialize(Number src, Type srcType, JsonSerializationContext context) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            return Double.parseDouble(s);
/**
}        if (s.contains(".") || s.contains("E")) {
 *
        }
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
import java.lang.reflect.Type;
/*
 * Originally from https://github.com/google/gson/issues/1084
            }

 *
                return Long.parseLong(s);
                return Double.parseDouble(s);
 */
            try {
    }
            } catch (NumberFormatException ex) {
        return new JsonPrimitive(src.toString());
    @Override
 *
 */
        throws JsonParseException {
        try {

public final class JSONBestNumberSerializer implements JsonSerializer<Number>, JsonDeserializer<Number> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (NumberFormatException e) {
    }
 * limitations under the License.

 * you may not use this file except in compliance with the License.
import com.google.gson.*;
        final String s = json.getAsString();
            return Integer.parseInt(s);
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Freaking workaround for GSON silly numbers deserialization.
package org.jkiss.dbeaver.model.data.json;
