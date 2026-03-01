        try {
        }
package org.jkiss.dbeaver.registry.settings;
    private static final String DBEAVER_PROP_LANGUAGE = "nl";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private static Path getPropertiesFile() {
            properties = new Properties();
            }
        saveProperties();

        }
        if (properties == null) {


 * Unless required by applicable law or agreed to in writing, software
public class GlobalSettings {

    private static final String DBEAVER_CONFIG_FOLDER = "settings";
    private static final String DBEAVER_CONFIG_FILE = "global-settings.ini";
 * GlobalSettings
            try (Writer writer = Files.newBufferedWriter(file)) {


        } else {
                try (Reader reader = Files.newBufferedReader(file)) {
import java.nio.file.Path;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public synchronized void setGlobalProperty(@NotNull String key, @Nullable String value) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
}
        return properties.getProperty(key);
 * You may obtain a copy of the License at
    @NotNull
            log.error("Error loading global properties", e);
            final Path file = getPropertiesFile();
import org.jkiss.dbeaver.registry.BasePlatformImpl;

 * you may not use this file except in compliance with the License.

    }
            // Ensure the config directory exists
            log.error("Error saving global properties", e);

    public synchronized String getGlobalProperty(@NotNull String key) {
/*
    private void saveProperties() {
                    properties.load(reader);
        loadProperties();
        }

import org.jkiss.code.NotNull;
    private Properties properties;

    private static final Log log = Log.getLog(GlobalSettings.class);
    }

        } catch (IOException e) {

    }
 *
        properties = new Properties();
                }
 *

    public static synchronized GlobalSettings getInstance() {
    private static GlobalSettings instance;
    private void loadProperties() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        try {
        return root.resolve(DBEAVER_CONFIG_FOLDER).resolve(DBEAVER_CONFIG_FILE);
            }

 * limitations under the License.
            return;
import java.io.IOException;
        if (instance == null) {
            if (Files.exists(file)) {
                properties.store(writer, "DBeaver configuration");
 * See the License for the specific language governing permissions and
            properties.setProperty(key, value);
        final Path file = getPropertiesFile();
        final Path root = Path.of(RuntimeUtils.getWorkingDirectory(BasePlatformImpl.DBEAVER_DATA_DIR));
import org.jkiss.code.Nullable;
        }
        if (properties != null) {
 *
        }
 */

import java.nio.file.Files;
        if (value != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0


    }
        } catch (IOException e) {
import java.io.Writer;
import org.jkiss.dbeaver.Log;
 */
        }
        loadProperties();
            Files.createDirectories(file.getParent());

    }
 * DBeaver - Universal Database Manager
import java.util.Properties;
        return instance;
/**
            properties.remove(key);

            instance = new GlobalSettings();
import java.io.Reader;

