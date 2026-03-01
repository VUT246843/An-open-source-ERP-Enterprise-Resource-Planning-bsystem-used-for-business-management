            });
                Map<String, String> props = store.getProperties();
            saveProfiles();

                    customProfiles.add(profile);
}
                    DataFormatterProfile profile = new DataFormatterProfile(profileName, curStore);
        }
        if (customProfiles == null) {
            String content = DBWorkbench.getPlatform().getProductConfigurationController().loadConfigurationFile(CONFIG_FILE_NAME);
    }
 *
        return globalProfile;
                }
import java.io.StringReader;
/*
                        attributes.getValue("value"));
    }

            if (localName.equals("profile")) {
    private synchronized void saveProfiles() {

        private String profileName;
                dataFormatterMap.put(formatterDescriptor.getId(), formatterDescriptor);
     * Delete custom data formatter profile
 * you may not use this file except in compliance with the License.
        if (customProfiles.remove(profile)) {
        {
import org.jkiss.utils.xml.XMLBuilder;
    @NotNull
    {
        return dataFormatterMap.get(typeId);
        getCustomProfilesInternal();
import org.jkiss.utils.xml.SAXReader;
        }

    private final Map<String, DataFormatterDescriptor> dataFormatterMap = new HashMap<>();
    }
    }
 *
    {
            instance = new DataFormatterRegistry(Platform.getExtensionRegistry());
    private class FormattersParser extends SAXListener.BaseListener
                    for (Map.Entry<String, String> entry : props.entrySet()) {
    }
                return;

        public void save() throws IOException
            WorkspaceConfigEventManager.addConfigChangedListener(CONFIG_FILE_NAME, o -> {
    public synchronized DBDDataFormatterProfile getGlobalProfile()
                } catch (Throwable ex) {
            }
        }
        if (customProfiles == null) {
            xml.endElement();
            }
        customProfiles.add(profile);
        public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) {

     */
import org.eclipse.core.runtime.Platform;
                xml.endElement();
            saveProfiles();
        }
    @NotNull
        } catch (Throwable ex) {
            log.warn("Can't load profiles config from " + CONFIG_FILE_NAME, ex);
        this.globalProfile = null;

    @Nullable
        DBDDataFormatterProfile profile = new DataFormatterProfile(profileName, new CustomProfileStore());

 *     http://www.apache.org/licenses/LICENSE-2.0
            }
    }

            DBWorkbench.getPlatform().getProductConfigurationController()
                .saveConfigurationFile(CONFIG_FILE_NAME, out.getBuffer().toString());
import java.io.IOException;
 *
                    }
        saveProfiles();
import org.jkiss.dbeaver.DBException;
    public synchronized DBDDataFormatterProfile getCustomProfile(@NotNull String name)
    private synchronized List<DBDDataFormatterProfile> getCustomProfilesInternal() {
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others

        }
                    parser.parse(new FormattersParser());
                DataFormatterDescriptor formatterDescriptor = new DataFormatterDescriptor(ext);
    @Override
import org.jkiss.utils.xml.SAXListener;
    {
import java.io.StringWriter;
            xml.setBeautify(true);
                if (props != null) {
    public synchronized DBDDataFormatterProfile createCustomProfile(String profileName) {
                }
        getCustomProfilesInternal();
            if (localName.equals("profile")) {
            XMLBuilder xml = new XMLBuilder(out, GeneralUtils.UTF8_ENCODING);
        return null;
 * See the License for the specific language governing permissions and

package org.jkiss.dbeaver.registry.formatter;
                return profile;

    public List<DataFormatterDescriptor> getDataFormatters()
import org.jkiss.utils.CommonUtils;
        }
            super(DBWorkbench.getPlatform().getPreferenceStore());
    }
import java.util.ArrayList;
    private class CustomProfileStore extends SimplePreferenceStore {
            return;
        }
        return instance;
                SimplePreferenceStore store = (SimplePreferenceStore) profile.getPreferenceStore();
    private static final Log log = Log.getLog(DataFormatterRegistry.class);
        } catch (DBException ex) {
        if (instance == null) {
    // Data formatters
            loadProfiles();
        return profile;
    {
        }
    public synchronized List<DBDDataFormatterProfile> getCustomProfiles() {
                        xml.addAttribute("value", entry.getValue());
        return customProfiles;
                if (curStore != null) {
    public static final String CONFIG_FILE_NAME = "dataformat-profiles.xml"; //$NON-NLS-1$
import org.xml.sax.Attributes;
        return List.copyOf(getCustomProfilesInternal());
            } else if (localName.equals("property")) {
        @Override
            log.warn("The user has no permission to save data formatter configuration");
                        xml.addAttribute("name", entry.getKey());
    private DataFormatterRegistry(IExtensionRegistry registry)
 * DBeaver - Universal Database Manager
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(DataFormatterDescriptor.EXTENSION_ID);
import org.jkiss.code.NotNull;
        {
    private List<DBDDataFormatterProfile> customProfiles = null;
import java.util.Map;
        if (globalProfile == null) {
            xml.startElement("profiles");
        }
import java.util.HashMap;
                xml.startElement("profile");
        @Override

                    throw new DBException("Datasource config parse error", ex);
import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
        this.dataFormatterList.clear();
    public synchronized static DataFormatterRegistry getInstance()
    private static DataFormatterRegistry instance = null;
 * limitations under the License.
    }
 * Unless required by applicable law or agreed to in writing, software
                loadProfiles();
        {
    {
        try {
    }
import org.jkiss.dbeaver.model.app.DBPDataFormatterRegistry;
    }
        }
                        xml.startElement("property");
    @Override
    }
            log.warn("Failed to save data formatter profiles to " + CONFIG_FILE_NAME, ex);

                "Global",
import java.util.List;
        @Override
import org.jkiss.dbeaver.model.WorkspaceConfigEventManager;
                }

     */
    ////////////////////////////////////////////////////
            for (IConfigurationElement ext : extElements) {
    private DBDDataFormatterProfile globalProfile;

        public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) {
        // Load data formatters from external plugins
    public void dispose()
    {
                if (!CommonUtils.isEmpty(profileName)) {
                xml.addAttribute("name", profile.getProfileName());
                try {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.preferences.SimplePreferenceStore;
        }

            try (StringReader is = new StringReader(content)) {

 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
        try (StringWriter out = new StringWriter()) {
import org.jkiss.dbeaver.model.rm.RMConstants;
    /**
    {

            globalProfile = new DataFormatterProfile(
import org.jkiss.dbeaver.Log;
        customProfiles = new ArrayList<>();
        return dataFormatterList;
    }
            if (profile.getProfileName().equals(name)) {

                curStore = new CustomProfileStore();
                        attributes.getValue("name"),
                    curStore.setValue(
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                DBWorkbench.getPlatform().getPreferenceStore());

        this.dataFormatterMap.clear();

                profileName = attributes.getValue("name");

            }
            return;
            for (DBDDataFormatterProfile profile : customProfiles) {
            if (CommonUtils.isEmpty(content)) {
    }

    private synchronized void loadProfiles() {
        if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
        private SimplePreferenceStore curStore;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            }
        for (DBDDataFormatterProfile profile : getCustomProfilesInternal()) {
                }
 */
            }
import org.jkiss.dbeaver.utils.GeneralUtils;
        }
                        xml.endElement();
    }
    /**
                dataFormatterList.add(formatterDescriptor);
    public DataFormatterDescriptor getDataFormatter(String typeId)
import org.eclipse.core.runtime.IExtensionRegistry;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public synchronized void deleteCustomProfile(DBDDataFormatterProfile profile) {
        private CustomProfileStore()
            }
    {

                SAXReader parser = new SAXReader(is);
public class DataFormatterRegistry implements DBPDataFormatterRegistry {
     * Create custom data formatter profile with specified name and default settings
        }
            xml.flush();

    }
    private final List<DataFormatterDescriptor> dataFormatterList = new ArrayList<>();
            out.flush();
import org.eclipse.core.runtime.IConfigurationElement;

