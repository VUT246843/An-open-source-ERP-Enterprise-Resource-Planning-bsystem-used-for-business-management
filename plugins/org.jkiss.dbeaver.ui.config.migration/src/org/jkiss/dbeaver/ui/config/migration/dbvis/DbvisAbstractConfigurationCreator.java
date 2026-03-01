 * Unless required by applicable law or agreed to in writing, software
        if (configFolder.exists()) {
        final Matcher portMatcher = PATTERN_PORT.matcher(sampleURL);
import java.util.regex.Pattern;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
                port = portString;
import java.util.List;
        sampleURL = PATTERN_HOST.matcher(sampleURL).replaceAll("{host}");
        }
 *
import java.util.Optional;
            configFile = new File(configFolder, getConfigurationFile());
        driverInfo.setSampleURL(sampleURL);
        String driverName = substituteDriverName(name);
            }
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
    protected void adaptSampleUrl(ImportDriverInfo driverInfo) {
            }
                .filter(d -> d.getName().contains(driverName))
    }
    static Pattern PATTERN_PORT = Pattern.compile("<port([0-9]*)>"); //$NON-NLS-1$

        sampleURL = PATTERN_DATABASE.matcher(sampleURL).replaceAll("{database}");
                return configFile;
        return configFile;
import java.io.File;
            .collect(Collectors.toList());
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
}
 * you may not use this file except in compliance with the License.
 * limitations under the License.
            if (!CommonUtils.isEmpty(portString)) {
/*
    public File getConfigurationAsset(File folder) {
import java.util.regex.Matcher;
        }
        Optional<DriverDescriptor> descriptor = descriptors.stream()


 * See the License for the specific language governing permissions and

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.stream.Collectors;
        sampleURL = portMatcher.replaceAll("{port}");
            if (configFile.exists()) {

        File configFolder = new File(folder, getConfigurationFolder());
 *
 * DBeaver - Universal Database Manager
    static Pattern PATTERN_DATABASE = Pattern.compile("<database>|<databaseName>|<sid>|<datasource>"); //$NON-NLS-1$
        }
        sampleURL = PATTERN_PROTOCOL.matcher(sampleURL).replaceAll("{protocol}");
        if (portMatcher.find()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        File configFile = null;
 *     http://www.apache.org/licenses/LICENSE-2.0
public abstract class DbvisAbstractConfigurationCreator implements DbvisConfigurationCreator {
            .flatMap(provider -> provider.getEnabledDrivers().stream())
        if (port != null) {

 */
            final String portString = portMatcher.group(1);
    public DriverDescriptor getDriverByName(String name) {
    static Pattern PATTERN_PROTOCOL = Pattern.compile("<protocol>"); //$NON-NLS-1$
        List<DriverDescriptor> descriptors = registry.getDataSourceProviders().stream()
    }
            .findFirst();
    static Pattern PATTERN_HOST = Pattern.compile("<server>"); //$NON-NLS-1$
    protected abstract String substituteDriverName(String name);
        final DataSourceProviderRegistry registry = DataSourceProviderRegistry.getInstance();
        return descriptor.orElse(null);
                .findFirst();


    }
            .filter(d -> d.getName().equals(driverName))
        }
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
            descriptor = descriptors.stream()
package org.jkiss.dbeaver.ui.config.migration.dbvis;
        if (descriptor.isEmpty()) {
        String sampleURL = driverInfo.getSampleURL();
            driverInfo.setDefaultPort(port);
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
        String port = null;
