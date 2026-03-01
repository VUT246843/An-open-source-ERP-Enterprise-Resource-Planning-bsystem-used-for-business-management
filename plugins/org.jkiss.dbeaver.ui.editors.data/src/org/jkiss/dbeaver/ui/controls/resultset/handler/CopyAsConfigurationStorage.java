            }

                jsonWriter.endObject();
import java.nio.charset.StandardCharsets;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    @NotNull
import com.google.gson.Strictness;
        for (Map.Entry<String, Map<String, Object>> entry : JSONUtils.getNestedObjects(jsonMap, COPY_AS_CFG)) {
class CopyAsConfigurationStorage {
        try (Writer writer = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
 */
import java.io.*;
 * See the License for the specific language governing permissions and
    }
        return DataEditorsActivator.getDefault().getPreferences();
                jsonWriter.beginObject();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsActivator;
import com.google.gson.GsonBuilder;
        .setStrictness(Strictness.LENIENT)
    }
                for (Map.Entry<DataTransferProcessorDescriptor, Map<String, Object>> entries: properties.entrySet()) {
}
            if (descriptor != null) {
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
 *
    }
        String json = getPreferenceStore().getString(COPY_AS_CFG);
            return propertiesMap;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                jsonWriter.endObject();

 *
        String json = new String(os.toByteArray(), StandardCharsets.UTF_8);
            DataTransferProcessorDescriptor descriptor = DataTransferRegistry.getInstance().getProcessor(entry.getKey());
        Map<DataTransferProcessorDescriptor, Map<String, Object>> propertiesMap = new HashMap<>();
            try (JsonWriter jsonWriter = GSON.newJsonWriter(writer)) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        if (json == null || json.isEmpty()) {
    private static DBPPreferenceStore getPreferenceStore() {
        }
                jsonWriter.name(COPY_AS_CFG);
        getPreferenceStore().setValue(COPY_AS_CFG, json);
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
    static void saveProcessorProperties(@NotNull Map<DataTransferProcessorDescriptor, Map<String, Object>> properties) throws IOException {
        }
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others

        }
import com.google.gson.Gson;
    private static final Gson GSON = new GsonBuilder()

import org.jkiss.code.NotNull;
import java.util.HashMap;
 * Unless required by applicable law or agreed to in writing, software
        .serializeNulls()

import com.google.gson.stream.JsonWriter;
    static Map<DataTransferProcessorDescriptor, Map<String, Object>> getProcessorProperties() {
                jsonWriter.setIndent("    ");
 *
    private static final String COPY_AS_CFG = "CopyAsConfig";
 * distributed under the License is distributed on an "AS IS" BASIS,
        .create();

        return propertiesMap;
package org.jkiss.dbeaver.ui.controls.resultset.handler;
 * You may obtain a copy of the License at
                }
                jsonWriter.beginObject();
import java.util.Map;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        //intentionally left blank
 *     http://www.apache.org/licenses/LICENSE-2.0

                    JSONUtils.serializeProperties(jsonWriter, entries.getKey().getFullId(), entries.getValue(), true);
/*
 * DBeaver - Universal Database Manager

        Map<String, Object> jsonMap = JSONUtils.parseMap(GSON, new StringReader(json));
 * limitations under the License.
 * you may not use this file except in compliance with the License.
                propertiesMap.put(descriptor, entry.getValue());
    private CopyAsConfigurationStorage() {
                jsonWriter.flush();
        .setPrettyPrinting()
