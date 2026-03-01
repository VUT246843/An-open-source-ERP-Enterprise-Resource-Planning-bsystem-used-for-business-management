        @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

 */
    public static GsonBuilder baseSecurePropertiesGsonBuilder() {
            Object propValue = entry.getValue();
            DBPPropertyDescriptor propDesc = editable.getProperty(propId);

 * limitations under the License.
                try {
    /**

        for (Map.Entry<String, ?> entry : properties.entrySet()) {
            .setStrictness(Strictness.LENIENT);
import com.google.gson.FieldAttributes;
package org.jkiss.dbeaver.utils;
 *

            complexProperties.updateCredentialsFromComplexProperties(properties);
            return fieldAttributes.getAnnotation(SecureProperty.class) != null;
import com.google.gson.Strictness;
        @NotNull Map<String, ?> properties
            String propId = entry.getKey();
 * you may not use this file except in compliance with the License.
    ) {
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        @Override
 *
    }
     */
    private static final Log log = Log.getLog(PropertySerializationUtils.class);
                    log.error("Error setting credential property '" + propId + "'", e);

    public static GsonBuilder baseNonSecurePropertiesGsonBuilder() {
            .setPrettyPrinting()
            }

        editable.collectProperties();
 * See the License for the specific language governing permissions and
    }

            return false;
import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
import org.jkiss.dbeaver.model.meta.SecureProperty;
        @NotNull DBAAuthCredentials credentials,
    public static void updateCredentialsFromProperties(
     */
            .setStrictness(Strictness.LENIENT);
 * Unless required by applicable law or agreed to in writing, software
                    editable.setPropertyValue(monitor, propId, propValue);
        public boolean shouldSkipClass(Class<?> aClass) {
    public static String EMPTY_JSON_OBJECT = "{}";
    }
    /**
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
import com.google.gson.GsonBuilder;

 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
        if (credentials instanceof DBAAuthCredentialsWithComplexProperties complexProperties) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.Log;
    }
}
            return fieldAttributes.getAnnotation(SecureProperty.class) == null;
        return new GsonBuilder().setExclusionStrategies(new SecurePropertiesExclusionStrategy())
/*
import com.google.gson.ExclusionStrategy;
        public boolean shouldSkipClass(Class<?> aClass) {
        }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (propDesc != null) {
        @NotNull DBRProgressMonitor monitor,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            return false;
    private static class NonSecurePropertiesExclusionStrategy implements ExclusionStrategy {
    }
                }
 *
            .setPrettyPrinting()
     * @return GsonBuilder which will exclude secured properties
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;
public class PropertySerializationUtils {
        @Override
import org.jkiss.dbeaver.model.access.DBAAuthCredentialsWithComplexProperties;
import java.util.Map;
     * @return GsonBuilder which will include only secured properties

        PropertySourceEditable editable = new PropertySourceEditable(credentials, credentials);

                } catch (Exception e) {
    private static class SecurePropertiesExclusionStrategy implements ExclusionStrategy {
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        return new GsonBuilder().setExclusionStrategies(new NonSecurePropertiesExclusionStrategy())
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        @Override

        }

