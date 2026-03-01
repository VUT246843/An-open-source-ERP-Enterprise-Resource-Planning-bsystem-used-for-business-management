                    }
            this.dataSource = dataSource;
                }; 
                }
        private final RestoredAttribute parent;
            super(
                case "option": {
            this.dataKind = original.getDataKind();
import org.jkiss.utils.CommonUtils;
                            SavedDataFilter sdf = entry.getValue();
            }
                    RestoredAttribute boundAttr = boundAttrs.get(savedAttrConstraint.getAttribute());


                flushConfig();
                            }
            return Status.OK_STATUS;
            // so we'll be able to reestablish child->parent references during deserialization
                SQLUtils.appendConditionString(
                    break;
import org.jkiss.utils.xml.XMLBuilder;
        SavedDataFilter(@NotNull DBPDataSource dataSource, @NotNull DBDDataFilter dataFilter) {
        @NotNull
                }
        private SavedDataFilter curSavedDataFilter = null;
                    flattenAttributes(attrsInfo, ((DBDAttributeConstraint) attrC).getAttribute());
                    query.insert(0, structSeparator);
                                    if (attrC instanceof DBDAttributeConstraint) {
            this.order = dataFilter.getOrder();
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                case "value": {
                String attrName = savedC.getKey();
            return dataSource;
            }
        @Nullable
 *
        
            @NotNull SAXReader reader,

                                    xml.addAttribute("name", attrCE.getKey());
        }
        public DBPDataKind getDataKind() {

            log.error("Error loading data filters config", e);
        synchronized (savedFilters) {
            @NotNull DBPDataSource dataSource
    private volatile ConfigSaver saver = null;
            }
            this.parent = boundParent;
        public static RestoredAttributesInfo bindToDataSource(
                        String name = attributes.getValue("name");
    }
                curSavedConstraint.setOption(curOptionName, GeneralUtils.deserializeObject(data));
        final Map<RestoredAttribute, RestoredAttribute> boundAttrs;
import org.jkiss.dbeaver.model.struct.*;
    private static final Log log = Log.getLog(DataFilterRegistry.class);
        }
        String objectId = makeObjectId(object);
                                log.error(e);
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0

            @NotNull DBDAttributeConstraintBase savedConstraint
            this.dataSource = null;

                }
                                xml.addAttribute("precision", attribute.getPrecision());
                            if (attribute instanceof DBDAttributeBinding binding) {
            instance = new DataFilterRegistry();
                    }
            if (!attrs.containsKey(attribute)) {
    private static final String CONFIG_FILE = "saved-data-filter.xml";
        
                attrs.put(attribute, "fa" + attrs.size());
                        if (!CommonUtils.isEmpty(operName)) {
                    dataFilter, offschemaConstraints, dataContainer.getDataSource(), null, sb, true, false);
                    String objectId = attributes.getValue("objectId");
                    if (parent != null) {
            } else {
                        curSavedConstraint.setVisible(CommonUtils.getBoolean(attributes.getValue("visible"), true));
                        attrC = restoredAttrsInfo.restoreOffschemaConstraint(attrName, savedConstraint);
                            xml.addAttribute("name", attribute.getName());
                        curSavedDataFilter.constraints.put(name, curSavedConstraint);
            final DBPDataSource dataSource = getDataSource();
    @NotNull
            StringBuilder query = new StringBuilder();
    }
                saver = new ConfigSaver();
                case "flatten-attribute-bindings": {
            }
import org.jkiss.utils.ArrayUtils;
            @NotNull DBSDataContainer dataContainer,
                                    if (attrC.getValue() != null) {

        @Override
        return instance;

                        curSavedConstraint.setEntityAlias(attributes.getValue("entity"));
                    }
        }
                case "value": {
                    offschemaConstraints.add(restoredAttrsInfo.restoreOffschemaConstraint(attrName, savedConstraint));
        }
        private String curOptionName = null;
            @NotNull DBRProgressMonitor monitor,
        @Override
                                    }
                            xml.addAttribute("ordinalPosition", attribute.getOrdinalPosition());
    private static final String OBJ_PATH_DELIMITER = "@@/@@";
        @Nullable
        
}                            for (Map.Entry<String, DBDAttributeConstraintBase> attrCE : sdf.constraints.entrySet()) {
                    if (attrsInfo != null) {
    
                    }
                }

import org.jkiss.dbeaver.model.runtime.AbstractJob;
                        
        private String order;
                }
            return query.toString();
import java.nio.file.Path;
            } else if (value instanceof JsonObject) {
                            xml.addAttribute("isRequired", attribute.isRequired());

            }
                try (var ignored = xml.startElement("data-filters")) {
        
                CommonUtils.getBoolean(atts.getValue("isRequired"), false),
                    if (attribute != null) {
                    }

                return DBPDataKind.BOOLEAN;
            this.anyConstraint = dataFilter.isAnyConstraint();
        }
                            try {
        private boolean anyConstraint; // means OR condition
 */
                } else if (savedConstraint != null) {
                                        xml.endElement();
                try (var ignored = xml.startElement("flatten-attribute-bindings")) {
    }
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
                                        xml.addAttribute("operator", attrC.getOperator().name());
                    break;
                                    if (attrC.getOperator() != null) {
                if (savedAttrConstraint.getAttribute() instanceof RestoredAttribute) {
                        if (CommonUtils.isNotEmpty(attrEntryId) && attrsInfo != null) {
            this.boundAttrs = boundAttrs;
                }
                    }

import org.eclipse.core.runtime.Status;
import java.lang.reflect.Array;
            return boundAttrs; 
        }
                        }
                }
        private final DBPDataKind dataKind;
            
                            }
                }
            for (RestoredAttribute attribute = this; attribute != null; attribute = attribute.getParentObject()) {
                    break;
                }
                } else {
    
import org.jkiss.dbeaver.model.impl.struct.AbstractAttribute;
        if (instance == null) {
                if (savedConstraint instanceof DBDAttributeConstraint) {
                    attrsInfo = new LinkedHashMap<>();
        if (Files.exists(columnsConfig)) {
    }
        }
                            }
            dataFilter.setOrder(this.order);
                            }
                                : boundAttrs.get(attr.getParentObject());
import org.jkiss.dbeaver.runtime.DBWorkbench;
            @NotNull RestoredAttribute original,
                        RestoredAttribute parent = CommonUtils.isEmpty(parentAttrEntryId) ? null : attrsInfo.get(parentAttrEntryId);
                        attrsInfo.put(attrEntryId, new RestoredAttribute(parent, attributes));
            }
import org.jkiss.dbeaver.utils.GeneralUtils;
                                    xml.addAttribute("parentAttrEntryId", attrsInfo.get(parent));
        private void flattenAttributes(@NotNull Map<DBSAttributeBase, String> attrs, @NotNull DBSAttributeBase attribute) {
            this.isPseudoAttribute = original.isPseudoAttribute();
                CommonUtils.toInt(atts.getValue("precision"), -1),
                                    }
                                        xml.startElement("value");
                        constraint = savedAttrConstraint;
                        dataSource, c.getAttribute().getName()), new DBDAttributeConstraint(c));
        
        StringBuilder objName = new StringBuilder();
                                            xml.startElement("option");
                CommonUtils.getBoolean(atts.getValue("isAutoGenerated"), false)
            if (isInValue) {
        synchronized (savedFilters) {
                            DBSAttributeBase attribute = entry.getKey();
import java.io.OutputStream;
                        curSavedConstraint.setCriteria(attributes.getValue("criteria"));
                        return dataKind;
            Path configFile = DBWorkbench.getPlatform().getLocalConfigurationFile(CONFIG_FILE);
            synchronized (savedFilters) {
 * See the License for the specific language governing permissions and
    }
                    if (attrC != null) {
            if (!objName.isEmpty()) objName.append(OBJ_PATH_DELIMITER);
                return getAttributeValueKind(Array.get(value, 0));
            return new RestoredAttributesInfo(
                if (hasPrevIdentifier) {
                                ? null
            );
        private final Map<String, DBDAttributeConstraintBase> constraints = new LinkedHashMap<>();
            if (dataFilter.isDirty()) {
                            attr = attr.getParentObject()
            ArrayList<RestoredAttribute> restoredAttributes = new ArrayList<>();
    private void loadConfiguration(@NotNull Path configFile) {
                    constraints.put(DBUtils.getQuotedIdentifier(

        }
        private String where;
                ) {
    static class SavedDataFilter {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            Map<DBSAttributeBase, String> attrsInfo = new LinkedHashMap<>();
            @NotNull SavedDataFilter savedFilter,
            char structSeparator = dataSource.getSQLDialect().getStructSeparator();
            if (savedConstraint instanceof DBDAttributeConstraint savedAttrConstraint) {

            
            @NotNull String localName,
                if (dataContainer.getDataSource() != null) {
                            boundAttrs.put(attr, new RestoredAttribute(boundParent, attr, dataSource));
                                        }
        }
            return constraint;
        }
                                curSavedConstraint.setOperator(DBCLogicalOperator.valueOf(operName));
                xml.setBeautify(true);
            }
                    }
                                xml.addAttribute("scale", attribute.getScale());
import java.util.Map.Entry;
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
            } else if (value instanceof Date) {
                if (attrC == null && dataContainer instanceof DBSEntity) {
/*
            switch (localName) {
 *
        @Override
    }
                            }
                    } else {
        }
                                    if (!ArrayUtils.isEmpty(options)) {
        public DBDAttributeConstraint restoreOffschemaConstraint(
                                if (parent != null) {
                            if (attribute.getScale() != null) {
                        ) {
            }
                if (attribute instanceof DBDAttributeBinding) {
                saver.schedule(3000);
                                        xml.addAttribute("entity", attrC.getEntityAlias());
                return DBPDataKind.NUMERIC;

                case "constraint": {
                atts.getValue("name"),
            }
                original.getPrecision(), original.isRequired(), original.isAutoGenerated());
        }
        ConfigSaver() {
        public RestoredAttribute(@Nullable RestoredAttribute parent, Attributes atts) {
            // we are going to iterate through the collected info in the "root first, children later" order,
                query.insert(0, DBUtils.getQuotedIdentifier(dataSource, attribute.getName()));
        ) throws XMLException {
                    }
            @NotNull DBPDataSource dataSource
            for (DBDAttributeConstraintBase attrC : sdf.constraints.values()) {
    public static synchronized DataFilterRegistry getInstance() {
                            Map<DBSAttributeBase, String> attrsInfo = collectAttrsInfo(xml, sdf);
            } else {
            this.isPseudoAttribute = CommonUtils.getBoolean(atts.getValue("isPseudoAttribute"), false);

            return dataKind;
                    break;
                    if (savedAttr instanceof RestoredAttribute) {
                    curSavedDataFilter = new SavedDataFilter();
 * you may not use this file except in compliance with the License.
            // which is guaranteed by the flattenAttributes(..) implementation,
            @Nullable RestoredAttribute boundParent,
                                        xml.addText(GeneralUtils.serializeObject(attrC.getValue()));
                atts.getValue("typeName"),
            for (DBDAttributeConstraint c : dataFilter.getConstraints()) {
    private static class RestoredAttribute extends AbstractAttribute implements DBSObject, DBSAttributeBase, DBPQualifiedObject {
            dataFilter.setAnyConstraint(anyConstraint);
                case "option": {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return DBPDataKind.DATETIME;
import org.jkiss.code.Nullable;
        for (DBSObject p : path) {
        }
            for (Map.Entry<String, DBDAttributeConstraintBase> savedC : constraints.entrySet()) {
                        dataFilter.addConstraints(Collections.singletonList(attrC));
                DBDAttributeConstraint attrC = dataFilter.getConstraint(attrName);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    break;
                    isInValue = false;
        String objectId = makeObjectId(object);
                    break;
            } catch (Exception e) {
        }
            }
        try (InputStream in = Files.newInputStream(configFile)) {
 * Viewer columns registry
        private void flushConfig() {
                    @Override
        public void saxText(@NotNull SAXReader reader, @NotNull String data) throws XMLException {
            for (DBDAttributeConstraintBase savedConstraint : savedFilter.constraints.values()) {
            return attrsInfo;
        private boolean isInValue = false;
    @Nullable
            }
 * limitations under the License.
            objName.append(p.getName());
                    this, dataContainer.getDataSource()
    @NotNull
                DBSAttributeBase attribute = new AbstractAttribute(
        private final boolean isPseudoAttribute;
                    if (curSavedDataFilter != null) {
                            DBSAttributeBase attr = attrsInfo.get(attrEntryId);
                }
            } else {
                dataFilter.setWhere(sb.toString());


                        if (attributes.getValue("order") != null) {
import java.io.InputStream;
        @NotNull

                        String operName = attributes.getValue("operator");
            }
            }
        public RestoredAttribute getParentObject() {
                            RestoredAttribute attr = restoredAttributes.removeLast();
                        constraint.copyFrom(savedConstraint);
            }
        @Override
                            } catch (IllegalArgumentException e) {
            final DataFilterParser dsp = new DataFilterParser();
                        }
import org.jkiss.utils.xml.XMLException;
        public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) throws XMLException {
            }
                                    if (!attrC.isVisible()) {
        @NotNull
            if (saver == null) {
    private class ConfigSaver extends AbstractJob {
                            xml.addAttribute("typeId", attribute.getTypeID());
                            RestoredAttribute boundParent = attr.getParentObject() == null
import java.util.*;
                }
                    attrsInfo = null;
        private Map<DBSAttributeBase, String> collectAttrsInfo(@NotNull XMLBuilder xml, @NotNull SavedDataFilter sdf) throws IOException {
import org.jkiss.utils.xml.SAXListener;
                        }

            } else if (value instanceof Number) {
                                    Object[] options = attrC.getOptions();
                                    if (!CommonUtils.isEmpty(attrC.getEntityAlias())) {
 * You may obtain a copy of the License at
                        for (RestoredAttribute attr = (RestoredAttribute) savedAttr;
                        curOptionName = CommonUtils.toString(attributes.getValue("name"));
                    // Skip pseudo attributes and document attributes (e.g. Mongo root document)
    }
                if (attrC instanceof DBDAttributeConstraint) {
import org.jkiss.dbeaver.model.data.DBDDataFilter;
        private DBDAttributeConstraintBase curSavedConstraint = null;
                            attr != null && !boundAttrs.containsKey(attr);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        try (var ignored1 = xml.startElement("attribute")) {
        @Nullable
                        String parentAttrEntryId = attributes.getValue("parentAttrEntryId");
        @NotNull

                                        xml.addAttribute("criteria", attrC.getCriteria());
                            if (!CommonUtils.isEmpty(sdf.where)) xml.addAttribute("where", sdf.where);
        
        private Map<String, RestoredAttribute> attrsInfo = null;
                case "filter": {
 * Unless required by applicable law or agreed to in writing, software


            @NotNull String unquottedAttrName,
                                    }
        @Override
        
        ) {
            }
        Path columnsConfig = DBWorkbench.getPlatform().getLocalConfigurationFile(CONFIG_FILE);
        }
                    unquottedAttrName, dataKind.name(), 0, savedConstraint.getVisualPosition(), 0, 0, 0, false, false
        private RestoredAttributesInfo(@NotNull Map<RestoredAttribute, RestoredAttribute> boundAttrs) {
            @Nullable String namespaceURI,
                return DBPDataKind.ARRAY;
                        constraint = new DBDAttributeConstraint(boundAttr, savedConstraint.getVisualPosition());
                }
            if (offschemaConstraints != null && dataContainer.getDataSource() != null) {
                        while (!restoredAttributes.isEmpty()) {
                    }
                    for (Entry<DBSAttributeBase, String> entry : attrsInfo.entrySet()) {
                case "constraint": {
            boolean hasPrevIdentifier = false;
                    curOptionName = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
            super("Data filters config save");
    private final Map<String, SavedDataFilter> savedFilters = new HashMap<>();
            }
        @Override
import org.jkiss.dbeaver.DBException;
                DBDAttributeConstraintBase savedConstraint = savedC.getValue();
        }
    }
                CommonUtils.toInt(atts.getValue("typeId")),
                savedFilters.remove(objectId);
                    curSavedConstraint = null;
                    DBSEntityAttribute attribute = ((DBSEntity) dataContainer).getAttribute(monitor, attrName); 
                            xml.addAttribute("attrEntryId", entry.getValue());
                }

class DataFilterRegistry {
            try (OutputStream out = Files.newOutputStream(configFile)) {
    public DataFilterRegistry() {
        public boolean isPseudoAttribute() {
            if (!attrsInfo.isEmpty()) {
 * DBeaver - Universal Database Manager
                                        xml.addAttribute("visible", false);
                    // we don't actually bother about the order, cause we are just going to resolve attr by name
            if (getParentObject() == null) {
                    break;
            if (value instanceof String) {
        }
            }
        ) {
        @NotNull

                                curSavedConstraint = new DBDAttributeConstraint(attr, attr.getOrdinalPosition());
        } catch (Exception e) {
                CommonUtils.toInt(atts.getValue("ordinalPosition")),
        void restoreDataFilter(
import com.google.gson.JsonObject;
                curSavedConstraint.setValue(GeneralUtils.deserializeObject(data));
                        isInValue = true;

import org.xml.sax.Attributes;
            SAXReader parser = new SAXReader(in);
                if (attribute.isPseudoAttribute() || (attribute.getParentObject() == null && attribute.getDataKind() == DBPDataKind.DOCUMENT)) {
            Map<RestoredAttribute, RestoredAttribute> boundAttrs = new HashMap<>();
                    break;
        
                case "attribute": {
                hasPrevIdentifier = true;
                curSavedConstraint.setOption(curOptionName, GeneralUtils.deserializeObject(data));
                }
            return savedFilters.get(objectId);
                                    if (!CommonUtils.isEmpty(attrC.getCriteria())) {
                                        xml.addAttribute("orderDesc", attrC.isOrderDescending());
                                            xml.addAttribute("name", CommonUtils.toString(options[i]));
                }
                xml.flush();
                }
        }
                                }
import org.jkiss.dbeaver.model.*;
                                    }
                    DBSAttributeBase savedAttr = ((DBDAttributeConstraint) savedConstraint).getAttribute();
        return objName.toString();
                                        xml.addAttribute("attrEntryId", attrsInfo.get(((DBDAttributeConstraint) attrC).getAttribute()));
import org.eclipse.core.runtime.IStatus;
                            xml.addAttribute("objectId", entry.getKey());
        }
import com.google.gson.JsonArray;
    private static DataFilterRegistry instance;
                        }
                return DBPDataKind.STRUCT;
                                DBDAttributeBinding parent = binding.getParentObject();
                case "filter": {
                                xml.addAttribute("isPseudoAttribute", binding.isPseudoAttribute());
                                try (var ignored3 = xml.startElement("constraint")) {
        @Nullable
            parser.parse(dsp);
                CommonUtils.toInt(atts.getValue("scale"), -1),
                constraint = new DBDAttributeConstraint(attribute, savedConstraint.getVisualPosition());
        }

            RestoredAttributesInfo restoredAttrsInfo = RestoredAttributesInfo.bindToDataSource(
                log.error("Error saving columns configuration", e);
                }
                            if (!CommonUtils.isEmpty(sdf.order)) xml.addAttribute("order", sdf.order);
                    if (offschemaConstraints == null) {
                                        xml.addAttribute("order", attrC.getOrderPosition());
        public void saxStartElement(
        }
        @NotNull
                }
                            xml.addAttribute("maxLength", attribute.getMaxLength());
                constraint.copyFrom(savedConstraint);
    
        
            return parent;
                    DBDAttributeBinding parent = ((DBDAttributeBinding) attribute).getParentObject();
                    attrName = DBUtils.getUnQuotedIdentifier(dataContainer.getDataSource(), attrName);
                    curSavedDataFilter = null;
        }
                        } 
    private static class RestoredAttributesInfo {


        }
                        if (curSavedConstraint == null) {
                            if (attribute.getPrecision() != null) {
import java.nio.file.Files;
        }
                            restoredAttributes.add(attr);
            } else if (value != null && value.getClass().isArray() && Array.getLength(value) > 0) {
                        try (var ignored2 = xml.startElement("filter")) {
                    }
                    break;
    private class DataFilterParser extends SAXListener.BaseListener {
            @NotNull Attributes attributes
        private static Map<RestoredAttribute, RestoredAttribute> bindToDataSourceImpl(
            );
                    @NotNull
                    }
import org.jkiss.code.NotNull;
        private final DBPDataSource dataSource;
        DBSObject[] path = DBUtils.getObjectPath(object, true);
            @NotNull DBDDataFilter dataFilter
    @NotNull
        }
                    if (curSavedConstraint != null) {
                    continue;
                DBPDataKind dataKind = getAttributeValueKind(savedConstraint.getValue());
                        }
                    constraint = savedAttrConstraint;
                }
                saver = null;
                            curSavedConstraint = new DBDAttributeConstraintBase();
import org.jkiss.utils.xml.SAXReader;
        ) {
                                    }
                }
                    if (curSavedConstraint != null) {
            List<DBDAttributeConstraint> offschemaConstraints = null;

        savedFilters.clear();
                return DBUtils.getQuotedIdentifier(dataSource, getName());
                        offschemaConstraints = new ArrayList<>();
    public static String makeObjectId(@NotNull DBSObject object) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
            } else if (curOptionName != null) {
                XMLBuilder xml = new XMLBuilder(out, GeneralUtils.UTF8_ENCODING);
 */
            dataFilter.setWhere(this.where);
/**
                            curSavedConstraint.setOrderDescending(CommonUtils.toBoolean(attributes.getValue("orderDesc")));
        @NotNull
                }
            @NotNull SavedDataFilter savedFilter,
    }
                                            xml.endElement();
package org.jkiss.dbeaver.ui.controls.resultset;
                            if (attr != null) {
                            curSavedConstraint.setOrderPosition(CommonUtils.toInt(attributes.getValue("order")));
        SavedDataFilter() {
            @Nullable DBPDataSource dataSource
                                    }
                                    xml.addAttribute("pos", attrC.getVisualPosition());
            } else if (value instanceof JsonArray) {

                            xml.addAttribute("typeName", attribute.getTypeName());
            loadConfiguration(columnsConfig);
                        curSavedConstraint.setVisualPosition(CommonUtils.toInt(attributes.getValue("pos")));
        }
            DBDAttributeConstraint constraint;
        }
        }
                    curSavedDataFilter.anyConstraint = CommonUtils.toBoolean(attributes.getValue("anyConstraint"));
                CommonUtils.toLong(atts.getValue("maxLength")),
                        }
                    for (Map.Entry<String, SavedDataFilter> entry : savedFilters.entrySet()) {
        
 * Licensed under the Apache License, Version 2.0 (the "License");
                                            xml.addText(GeneralUtils.serializeObject(options[i + 1]));
                original.getOrdinalPosition(), original.getMaxLength(), original.getScale(),

                        }
        public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    void saveDataFilter(@NotNull DBSDataContainer object, @NotNull DBDDataFilter dataFilter) {
import java.io.IOException;
        private DataFilterParser() {
                        flattenAttributes(attrs, parent);
                    }
                                        for (int i = 0; i < options.length; i += 2) {
        private static DBPDataKind getAttributeValueKind(@NotNull Object value) {

        ) throws DBException {
 *
                    curSavedDataFilter.order = attributes.getValue("order");
                                }
                                    }
    public SavedDataFilter getSavedConfig(@NotNull DBSDataContainer object) {
                    if (boundAttr != null) {
                    savedFilters.put(objectId, curSavedDataFilter);
                savedFilters.put(objectId, newStates);
                                    DBDAttributeConstraintBase attrC = attrCE.getValue();
                        curSavedConstraint = null;
    }
        @Override
                                    }
        ) {

                }
                                    if (attrC.getOrderPosition() > 0) {
        @Override
            super(original.getName(), original.getTypeName(), original.getTypeID(),
                            }
                if (c.getAttribute() != null) {
            } else if (value instanceof Boolean) {
                    attrC.copyFrom(savedConstraint);

        public RestoredAttribute(
                    curSavedDataFilter.where = attributes.getValue("where");
            switch (localName) {
                        String attrEntryId = attributes.getValue("attrEntryId");
                    break;
                            xml.addAttribute("anyConstraint", sdf.anyConstraint);
                            xml.addAttribute("dataKind", attribute.getDataKind().name());
                SavedDataFilter newStates = new SavedDataFilter(object.getDataSource(), dataFilter);
                return DBPDataKind.STRING;

                        String attrEntryId = attributes.getValue("attrEntryId");
import org.jkiss.dbeaver.Log;
                    public DBPDataKind getDataKind() {
                            xml.addAttribute("isAutoGenerated", attribute.isAutoGenerated());
            this.parent = parent;
            this.dataKind = DBPDataKind.valueOf(atts.getValue("dataKind"));
                    }
                //log.debug("Save column config " + System.currentTimeMillis());
import org.jkiss.dbeaver.model.data.DBDAttributeConstraintBase;
                        attrC = new DBDAttributeConstraint(attribute, attribute.getOrdinalPosition());
                dataSource == null ? Collections.emptyMap() : bindToDataSourceImpl(savedFilter, dataSource));
    }
                return DBPDataKind.OBJECT;

        public DBPDataSource getDataSource() {

                    } else if (savedConstraint != null) {
            return isPseudoAttribute;
                StringBuilder sb = new StringBuilder();
            this.where = dataFilter.getWhere();
                if (attrC != null) {
        }
