        this.targetName = container.targetName;
            }
                log.error(e);
import org.jkiss.utils.CommonUtils;
    }
            // In case then we have only the raw map of changed container properties
                attributeMappings.get(i).getSource().getName(),
    private void readAttributes(DBRProgressMonitor monitor) throws DBException {
        if (!attributeMappings.isEmpty()) {
            default -> targetTableName;

        if (mappingType == DatabaseMappingType.skip) {
    public String getTargetName() {
        }
            }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                    // Change create to existing.
                } else {
                    if (sourceAttr != null) {
    public Collection<DatabaseMappingAttribute> getAttributeMappings() {
                        DBSDataContainer adapterSource = adaptable.getAdapter(DBSDataContainer.class);
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;

                }

            }
                    }
        return changedPropertiesMap;
        boolean forceRefresh,
    }
        for (DatabaseMappingAttribute attr : attributeMappings) {

    private Map<DBPPropertyDescriptor, Object> changedPropertiesMap;
                DBWorkbench.getPlatformUI().showError(

 *

import org.jkiss.dbeaver.tools.transfer.DTUtils;
 * you may not use this file except in compliance with the License.
                if (theSource != null) {
        }
        this.changedPropertiesMap = changedPropertiesMap;
                    DBSObjectContainer objectContainer = consumerSettings.getContainer();
    public DatabaseConsumerSettings getSettings() {
        boolean updateAttributesNames
    }

        return true;
    public void refreshMappingType(
        }
    }
 */
                    attrMapping.saveSettings(attrSettings);
                attr.updateMappingType(monitor, forceRefresh, updateAttributesNames);
                        targetTableName = theSource.getName();
    public void setTarget(DBSDataManipulator target) {
    private Map<String, Object> rawChangedPropertiesMap; // For tasks with empty container
            try {
    }
        if (!CommonUtils.equalObjects(source, mapping.source) ||
        return mappingType;
            case existing, recreate -> {
 *
        return DBIcon.TREE_TABLE;
    }
        }
            }
        }

            case skip -> DatabaseMappingAttribute.TARGET_NAME_SKIP;
        return attributeMappings;
        this.mappingType = container.mappingType;
        if (settings.get("mappingType") != null) {
                    newMappingType = DatabaseMappingType.create;
                    DBSAttributeBase sourceAttr = attrMapping.getSource();
    public boolean isCompleted() {
                    }
            settings.put("attributes", attrsSection);
                readAttributes(new VoidProgressMonitor());
        this.source = sourceObject;
                        NLS.bind(DTMessages.database_mapping_container_message_get_attributes_from, DBUtils.getObjectFullName(source, DBPEvaluationContext.UI)), e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.model.sql.SQLQueryContainer;
                for (DatabaseMappingAttribute attrMapping : attributeMappings) {
                DatabaseMappingType newMappingType = DatabaseMappingType.valueOf((String) settings.get("mappingType"));
    }

                    if (CommonUtils.isEmpty(targetTableName)) {
    public void loadSettings(DBRRunnableContext context, Map<String, Object> settings) {
            for (DatabaseMappingAttribute attrMapping : attributeMappings) {
        return attributeMappings;
                            attrMapping.getSourceLabelOrName(sourceAttr, false, false));

 * DBeaver - Universal Database Manager
    public void refreshMappingType(DBRRunnableContext context, DatabaseMappingType mappingType, boolean forceRefresh) throws DBException {
            CommonUtils.notNull(sourceAttr.getLabel(), sourceAttr.getName()),
            } catch (DBException e) {
        }
                refreshMappingType(context, newMappingType, false);
                if (!CommonUtils.isEmpty(targetName)) {
        refreshAttributesMappingTypes(monitor, forceRefresh, updateAttributesNames);
                    targetTableName = "";
        final Collection<DatabaseMappingAttribute> mappings = getAttributeMappings(monitor);
        } else if (target != null) {
                            theSource = adapterSource;
    }
            Map<String, Object> attrsSection = new LinkedHashMap<>();
                                if (table != null) {
        return rawChangedPropertiesMap;
                            target = (DBSDataManipulator) child;
            settings.put("targetName", targetName);
    }
            }
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
    ) throws DBException {
            }
public class DatabaseMappingContainer implements DatabaseMappingObject {
                    }
    @Override
    public boolean isSameMapping(DatabaseMappingContainer mapping) {
            attr -> attr.getSourceLabelOrName(attr.getSource(), false, false));
        DatabaseMappingAttribute mapping = new DatabaseMappingAttribute(this, attr);
import org.jkiss.dbeaver.model.data.json.JSONUtils;
                    }
                    Map<String, Object> attrSettings = new LinkedHashMap<>();
        if (!CommonUtils.isEmpty(mappings)) {
    }
    public Map<DBPPropertyDescriptor, Object> getChangedPropertiesMap() {
                    e);
    private final List<DatabaseMappingAttribute> attributeMappings = new ArrayList<>();
        }
        }
                readAttributes(monitor);
import org.eclipse.core.runtime.IAdaptable;
                            attrMapping.loadSettings(attrSettings);
    }

        this.targetName = targetName;
    @Override
        DBRProgressMonitor monitor,

        String targetTableName = targetName;
    private final DatabaseConsumerSettings consumerSettings;
                return false;
        return switch (mappingType) {
        }
    private String targetName;
            settings.put("targetName", target.getName());
    public void saveSettings(Map<String, Object> settings) {
    }
    }

        return true;
                }
            } catch (Exception e) {

    public boolean hasNewTargetObject() {

                    yield target.getName();
        this.consumerSettings = container.consumerSettings;
                // Do not use runnable context! It changes active focus and locks UI, which breaks the whole jface editing framework
    public DBSDataContainer getSource() {
import org.jkiss.dbeaver.model.DBPImage;
import net.sf.jsqlparser.schema.Table;
import java.util.*;
    public void setTargetName(String targetName) {
            settings.put("changedProperties", propertiesMap);
        boolean forceRefresh,
        return consumerSettings;
                    DTMessages.database_mapping_container_title_attributes_read_failed,
}
                                    targetTableName = table.getName();
        for (int i = 0; i < attributeMappings.size(); i++) {
            } catch (DBException e) {
    }
                    }
            }

                DBSAttributeBase sourceAttr = attrMapping.getSource();
        attributeMappings.add(mapping);
            for (Map.Entry<DBPPropertyDescriptor, Object> entry : changedPropertiesMap.entrySet()) {
                DBWorkbench.getPlatformUI().showError(DTMessages.database_mapping_container_title_attributes_read_failed,
    public Map<String, Object> getRawChangedPropertiesMap() {
        this.consumerSettings = consumerSettings;
        }
                }
            for (DatabaseMappingAttribute attr : mappings) {

import org.jkiss.dbeaver.model.DBUtils;
            }
            try {

    }

    public String getTargetFullName() {
            attributeMappings,
        DBRProgressMonitor monitor,
                        DBUtils.getObjectFullName(source, DBPEvaluationContext.UI)),
        this.mappingType = DatabaseMappingType.unspecified;

                        }
    @Override
 * See the License for the specific language governing permissions and
            if (!CommonUtils.equalObjects(
            try {
            return false;

                DBSDataContainer theSource = this.source;
                targetTableName = target.getName();
    private DatabaseMappingType mappingType;
            if (!attrsSection.isEmpty()) {
                                }
                        if (child instanceof DBSDataManipulator) {
package org.jkiss.dbeaver.tools.transfer.database;
    public void refreshAttributesMappingTypes(
    public DatabaseMappingContainer(DatabaseConsumerSettings consumerSettings, DBSDataContainer source) {
        if (CommonUtils.isEmpty(targetTableName)) {
                    if (theSource instanceof IAdaptable adaptable) {
    }
                        DTMessages.database_mapping_container_message_get_attributes_from,
        if (container instanceof DBSSchema || container instanceof DBSCatalog) {
        refreshMappingType(monitor, DatabaseMappingType.existing, false, false);
        this.source = source;
        return CommonUtils.findBestCaseAwareMatch(
        if (mappingType != null) {
                if (target != null) {
    private void addAttributeMapping(DBRProgressMonitor monitor, DBSAttributeBase attr) throws DBException {
        DBSObjectContainer container = consumerSettings.getContainer();
 */

        this.targetName = null;
import org.jkiss.dbeaver.model.struct.*;
import org.jkiss.dbeaver.DBException;
 * DatabaseMappingContainer
        } else if (!CommonUtils.isEmpty(rawChangedPropertiesMap)) {
                } else if (target == null && newMappingType == DatabaseMappingType.existing) {
        this.target = targetObject;

 *     http://www.apache.org/licenses/LICENSE-2.0
        for (DBSAttributeBase attr : DTUtils.getAttributes(monitor, source, this)) {
                return false;
    }
    @Override

                    if (theSource instanceof SQLQueryContainer sqlQueryContainer) {

        }
    }
            addAttributeMapping(monitor, attr);
        this.source = sourceObject;
                    newMappingType = DatabaseMappingType.existing;
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
    private final DBSDataContainer source;
        return source;
                mapping.attributeMappings.get(i).getSource().getName())) {
            if (target != null) {
                        }
                            }
                        if (adapterSource != null) {
        return mappingType == DatabaseMappingType.create || mappingType == DatabaseMappingType.recreate;

 *
/*

            this.attributeMappings.add(new DatabaseMappingAttribute(attribute, this));
            if (attr.getMappingType() == DatabaseMappingType.unspecified) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.jkiss.dbeaver.model.DBIcon;
                    attrsSection.put(attrMapping.getSourceLabelOrName(sourceAttr, false, false), attrSettings);
 * You may obtain a copy of the License at

    public DBPImage getIcon() {
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
import net.sf.jsqlparser.statement.select.Select;
        return target;
        refreshMappingType(new VoidProgressMonitor(), mappingType, forceRefresh, false);
                if (target != null && newMappingType == DatabaseMappingType.create) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
            settings.put("mappingType", mappingType.name());
        this.mappingType = mappingType;
        if (!CommonUtils.isEmpty(targetName)) {
                }

        mapping.updateMappingType(monitor, false, false);
/**
            Map<String, Object> attrsSection = JSONUtils.getObject(settings, "attributes");
            } else {
        for (DatabaseMappingAttribute attribute : container.attributeMappings) {
    }
import org.eclipse.osgi.util.NLS;
    private static final Log log = Log.getLog(DatabaseMappingContainer.class);
                    if (objectContainer != null) {

        this.consumerSettings = consumerSettings;
                            attrsSection,
    public DBSDataManipulator getTarget() {
    public DatabaseMappingContainer(DatabaseMappingContainer container, DBSDataContainer sourceObject) {
                        DBSObject child = objectContainer.getChild(new VoidProgressMonitor(), targetName);
import org.jkiss.code.NotNull;
    }
     */
    public DatabaseMappingContainer(DBRProgressMonitor monitor, DatabaseConsumerSettings consumerSettings, DBSDataContainer sourceObject, DBSDataManipulator targetObject) throws DBException {
        this.mappingType = mappingType;
import org.jkiss.dbeaver.model.sql.SQLQuery;

        boolean updateAttributesNames
    private DBSDataManipulator target;
                    NLS.bind(
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
                Object value = entry.getValue();

    }
                                final Table table = SQLSemanticProcessor.getTableFromSelect((Select) sqlQuery.getStatement());
        }
     * Returns attribute mappings collection without a monitor
        this.target = target;
        if (attributeMappings.isEmpty()) {

        if (!attributeMappings.isEmpty()) {
            }
            return true;
    }
    void setMappingType(DatabaseMappingType mappingType) {
            }
                        }
        }
                }
 * limitations under the License.
        }
import org.jkiss.dbeaver.Log;
        DatabaseMappingType mappingType,
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                        if (!attrSettings.isEmpty()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                            if (sqlQuery.getStatement() instanceof Select) {
            }
            return DBUtils.getObjectFullName(container, DBPEvaluationContext.DML) + "." + targetName;
    }
        if (attributeMappings.isEmpty()) {
    ) throws DBException {
    }
 * Unless required by applicable law or agreed to in writing, software
                propertiesMap.put(entry.getKey().getId(), value.toString());
                yield targetTableName;
    public DatabaseMappingType getMappingType() {
        return targetName;
                        if (sqlQueryContainer.getQuery() instanceof SQLQuery sqlQuery) {
        };
    }
        targetName = CommonUtils.toString(settings.get("targetName"), targetName);
    DatabaseMappingAttribute getAttributeMapping(@NotNull DBDAttributeBinding sourceAttr) {
    public void setChangedPropertiesMap(Map<DBPPropertyDescriptor, Object> changedPropertiesMap) {
        if (!CommonUtils.isEmpty(changedPropertiesMap)) {
            Map<String, Object> propertiesMap = new LinkedHashMap<>();
        rawChangedPropertiesMap = JSONUtils.getObject(settings, "changedProperties");
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
    }

            settings.put("changedProperties", rawChangedPropertiesMap);
        }

                if (sourceAttr != null) {

                        }
                        Map<String, Object> attrSettings = JSONUtils.getObject(
            attributeMappings.size() != mapping.attributeMappings.size()) {
        this.target = container.target;
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                }
    public Collection<DatabaseMappingAttribute> getAttributeMappings(DBRProgressMonitor monitor) {
        }
