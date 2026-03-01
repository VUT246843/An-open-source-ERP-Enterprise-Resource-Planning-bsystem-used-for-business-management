            this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
import org.eclipse.core.runtime.IConfigurationElement;
    private static final Log log = Log.getLog(DriverFileSource.class);
import java.util.ArrayList;

        this.url = copyFrom.url;

        return name;
            this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
    public String toString() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
}
    @Override
    @Override

        this.name = copyFrom.name;
    }

    private final String url;
    }
import org.jkiss.utils.CommonUtils;
        return files;
    public static class FileInfo implements DBPDriverFileInfo {

        return url;
        public String getName() {
    public String getInstructions() {
 */
import org.jkiss.code.NotNull;
    @Override
        public String getDescription() {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

        }
            return optional;
        @Override
 * See the License for the specific language governing permissions and


 * limitations under the License.

        @Override
    }
            files.add(new FileInfo(cfg));
    }
    }
        @Nullable
        return url;

    public String getUrl() {
import org.jkiss.code.Nullable;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.List;
import org.jkiss.dbeaver.Log;
        this.instructions = copyFrom.instructions;
            return name;
        FileInfo(IConfigurationElement config) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.registry.driver;
            this.optional = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_OPTIONAL), false);
        private final String description;

        this.url = config.getAttribute(RegistryConstants.ATTR_URL);
 */
    @Override
        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
 * you may not use this file except in compliance with the License.
        return instructions;
        public boolean isOptional() {
{

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPDriverFileSource;

        }
        private final boolean optional;
 *
/*

/**
        this.instructions = config.getAttribute("instructions");
        for (IConfigurationElement cfg : config.getChildren(RegistryConstants.TAG_FILE)) {
    public DriverFileSource(DriverFileSource copyFrom) {
        this.files.addAll(copyFrom.files);
    @Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.registry.RegistryConstants;
        private final String name;
            return description;
    DriverFileSource(IConfigurationElement config) {
        @NotNull
    private final List<FileInfo> files = new ArrayList<FileInfo>();

        }
    public String getName() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
public class DriverFileSource implements DBPDriverFileSource
        @Override
import org.jkiss.dbeaver.model.connection.DBPDriverFileInfo;
 * Unless required by applicable law or agreed to in writing, software
 *
    private final String name;
    private final String instructions;
    public List<FileInfo> getFiles() {
        }

    }
 * DriverFileSource
