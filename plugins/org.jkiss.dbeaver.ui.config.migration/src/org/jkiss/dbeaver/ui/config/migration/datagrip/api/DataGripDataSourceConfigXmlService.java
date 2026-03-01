     * Trying to extract a path to most recent project folder by iterating idea folder in JetBrains home folder
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @param pathToIdeaFolder path to project folder which consist .idea folder.

 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
    /**
    @NotNull ImportConnectionInfo buildIdeaConnectionFromProps(@NotNull Map<String, String> conProps);
     * Build a ImportConnectionInfo by single entry of {@link DataGripDataSourceConfigXmlService#buildIdeaConfigProps(String)}
    @NotNull
 * You may obtain a copy of the License at
import java.util.Map;
/**
     */
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
     * @return path to most recent project
 */
 *
     *

    List<Path> tryExtractRecentProjectPath();
 * Unless required by applicable law or agreed to in writing, software
import java.util.List;

     */
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     *
 */
    /**
public interface DataGripDataSourceConfigXmlService {
     * Build a map where key is uuid of the datasource against config
}
package org.jkiss.dbeaver.ui.config.migration.datagrip.api;
/*

 * Interface for importing Idea data source configs. Mainly aimed to work with .idea folder in a project
 *

 * and home directory of JetBrains.
import java.nio.file.Path;
    @NotNull Map<String, Map<String, String>> buildIdeaConfigProps(@NotNull String pathToIdeaFolder) throws Exception;
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * limitations under the License.
     */
