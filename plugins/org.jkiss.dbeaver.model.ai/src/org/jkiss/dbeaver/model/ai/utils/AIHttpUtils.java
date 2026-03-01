import com.google.gson.JsonSyntaxException;
     * Resolves URI from base and paths
 * you may not use this file except in compliance with the License.
                    }
                    if (messageElement.isJsonPrimitive() && messageElement.getAsJsonPrimitive().isString()) {
                    JsonElement errorElement = errorResponse.getAsJsonObject().get("error");
            return body;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        }
                        return messageElement.getAsString();
    private AIHttpUtils() {
                        if (messageElement.isJsonPrimitive() && messageElement.getAsJsonPrimitive().isString()) {
        } catch (URISyntaxException e) {
    }
    private static final Log log = Log.getLog(AIHttpUtils.class);
    @NotNull
    /**
                        JsonElement messageElement = errorElement.getAsJsonObject().get("message");
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.net.URISyntaxException;
 *
     */
                if (errorResponse.getAsJsonObject().has("message")) {
            }
    public static URI resolve(String base, String... paths) throws DBException {
    }
            if (errorResponse != null && errorResponse.isJsonObject()) {
     * If the parsing fails or no suitable message field is found, the original input string is returned.
            throw new DBException("Incorrect URI", e);

 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
 * DBeaver - Universal Database Manager
 *
        try {
                    JsonElement messageElement = errorResponse.getAsJsonObject().get("message");
                }
 * Unless required by applicable law or agreed to in writing, software
import com.google.gson.JsonElement;
                }
            for (String path : paths) {
     *

     * Parses an OpenAI-style error message from a JSON string.
     * @param body the JSON string containing an OpenAI-style error message

 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
            log.debug("Failed to parse error response: " + e.getMessage());
import java.net.URI;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
public final class AIHttpUtils {
            JsonElement errorResponse = JSONUtils.GSON.fromJson(body, JsonElement.class);
                if (errorResponse.getAsJsonObject().has("error")) {
                    }
        try {
     */
                uri = uri.resolve(path);
                    if (errorElement.isJsonObject() && errorElement.getAsJsonObject().has("message")) {

            }
     * Extracts the "message" field from the "error" or root object of the JSON structure.
 *
import org.jkiss.dbeaver.DBException;
            URI uri = new URI(base);
        } catch (JsonSyntaxException e) {
import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.model.ai.utils;

                            return messageElement.getAsString();

}
    public static String parseOpenAIStyleErrorMessage(@NotNull String body) {
            return uri;
 * You may obtain a copy of the License at
                        }
    }
            return body;
        }
 * limitations under the License.
     * @return the extracted error message if present, otherwise the original input string
