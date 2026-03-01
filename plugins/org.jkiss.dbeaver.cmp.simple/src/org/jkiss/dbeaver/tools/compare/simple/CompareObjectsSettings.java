        if (dialogSettings.get("compareLazy") != null) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    }
    public boolean isCompareScripts() {
    public void saveTo(DBPSettingsSection dialogSettings) {
        dialogSettings.put("outputFolder", outputFolder);


 * DBeaver - Universal Database Manager

        this.showOnlyDifferences = showOnlyDifferences;
    }
        }

/*

        if (dialogSettings.get("skipSystem") != null) {
        this.outputType = outputType;

 * Compare settings
        return outputFolder;
        private OutputType(String title) {
    }
    }
        }
            outputType = OutputType.valueOf(dialogSettings.get("outputType"));
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    private boolean compareLazyProperties = false;

    public void loadFrom(DBPSettingsSection dialogSettings) {
    public String getOutputFolder() {
        if (dialogSettings.get("outputType") != null) {

        }
            outputFolder = dialogSettings.get("outputFolder");
        dialogSettings.put("showDifference", showOnlyDifferences);
    }
            showOnlyDifferences = dialogSettings.getBoolean("showDifference");
/**
    private String outputFolder;


            skipSystemObjects = dialogSettings.getBoolean("skipSystem");
package org.jkiss.dbeaver.tools.compare.simple;
    private boolean compareOnlyStructure = false;
    public boolean isSkipSystemObjects() {
import java.util.List;
    }
        return skipSystemObjects;

    }

        if (dialogSettings.get("outputFolder") != null) {
        this.compareLazyProperties = compareLazyProperties;
    }

    public void setCompareScripts(boolean compareScripts) {
    public void setCompareOnlyStructure(boolean compareOnlyStructure) {
    public boolean isCompareOnlyStructure() {
 *
            compareOnlyStructure = dialogSettings.getBoolean("compareStructure");
        dialogSettings.put("compareLazy", compareLazyProperties);

        dialogSettings.put("compareScripts", compareScripts);
    public OutputType getOutputType() {
        FILE(CompareMessages.save_to_file);
        if (dialogSettings.get("compareScripts") != null) {
    }

        dialogSettings.put("compareStructure", compareOnlyStructure);
 * distributed under the License is distributed on an "AS IS" BASIS,

        }
        this.outputFolder = outputFolder;
    private final List<DBNDatabaseNode> nodes;

            this.title = title;
 *

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        }
        this.nodes = nodes;
    private boolean skipSystemObjects = true;
        dialogSettings.put("skipSystem", skipSystemObjects);
    }

        if (dialogSettings.get("compareStructure") != null) {
}
    }

        this.skipSystemObjects = skipSystemObjects;
    }
    public List<DBNDatabaseNode> getNodes() {
        private final String title;
        return compareOnlyStructure;
    public void setCompareLazyProperties(boolean compareLazyProperties) {
        public String getTitle() {
        return nodes;
    }
        }
 */
            return title;
    public void setOutputType(OutputType outputType) {
    public boolean isCompareLazyProperties() {
    }
        return showOnlyDifferences;
        return compareLazyProperties;
    }
 * You may obtain a copy of the License at
    }
    }
import org.jkiss.dbeaver.tools.compare.simple.messages.CompareMessages;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            compareLazyProperties = dialogSettings.getBoolean("compareLazy");
    public void setOutputFolder(String outputFolder) {
    public boolean isShowOnlyDifferences() {
    private OutputType outputType = OutputType.BROWSER;
        this.compareScripts = compareScripts;
 * limitations under the License.

    public void setShowOnlyDifferences(boolean showOnlyDifferences) {
        }
        if (dialogSettings.get("showDifference") != null) {

        }
        BROWSER(CompareMessages.open_in_browser),
        return outputType;
    }

    private boolean compareScripts = false;
        this.compareOnlyStructure = compareOnlyStructure;
public class CompareObjectsSettings {
 */
            compareScripts = dialogSettings.getBoolean("compareScripts");
 * Licensed under the Apache License, Version 2.0 (the "License");
        dialogSettings.put("outputType", outputType.name());
    private boolean showOnlyDifferences = false;
        return compareScripts;
    }

 * Unless required by applicable law or agreed to in writing, software
    public void setSkipSystemObjects(boolean skipSystemObjects) {
    public enum OutputType {
    public CompareObjectsSettings(List<DBNDatabaseNode> nodes) {

import org.jkiss.dbeaver.model.preferences.DBPSettingsSection;
