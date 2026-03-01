                insertReplaceMethods = methodsList.toArray(new DBDInsertReplaceMethod[0]);
    }
                }
    }
    @Override
/**
        }
    private List<String> functions;
    public boolean isHidden() {
            list.set(i, list.get(i).toUpperCase(Locale.ENGLISH));
        this.label = config.getAttribute("label");
                }


            try {
        return description;
    private List<String> insertMethodNames;
                case "types" -> this.types = loadList(propValue);
/*
    }

        this.isHidden = CommonUtils.getBoolean(config.getAttribute("hidden"));
                case "keywords" -> this.keywords = loadList(propValue);
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

 * You may obtain a copy of the License at
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.sql.SQLDialectInsertReplaceMethod;
        this.implClass = new ObjectType(config.getAttribute("class"));
    @Override
                for (String insertMethodId : insertMethodNames) {
    private List<String> txnKeywords;
    public List<SQLDialectMetadata> getSubDialects(boolean addNested) {
    private final String label;
    @NotNull
            switch (propName) {
    @Override
                case "execKeywords" -> this.execKeywords = loadList(propValue);
    }
                subs.addAll(sd.getSubDialects(false));

    private SQLDialectDescriptor parentDialect;
    public SQLDialectMetadata getParentDialect() {
            String propName = propElement.getAttribute("name");
    @Override
import org.jkiss.code.NotNull;
        }
            }
        }
    @NotNull
    private final DBPImage icon;
    private List<String> loadList(String str) {
    private List<SQLDialectDescriptor> subDialects = null;
            } catch (DBException e) {
    }
 *
import org.jkiss.utils.ArrayUtils;
    private final String id;
                log.debug("Can't get SQL insert replace methods");
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
                case "txnKeywords" -> this.txnKeywords = loadList(propValue);
    }

    }

import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
}
    private List<String> keywords;
    }
        return CommonUtils.safeList(types);
    private List<String> execKeywords;
        this.description = config.getAttribute("description");
                    this.properties.put(propName, propValue);
            if (propName == null || CommonUtils.isEmpty(propValue)) {
    @Override
    @Override
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sqlDialect"; //$NON-NLS-1$
    @Override

        return CommonUtils.safeList(functions);
import org.jkiss.dbeaver.model.DBPImage;
    public List<String> getDMLKeywords() {

    @NotNull
    }
import org.eclipse.core.runtime.IConfigurationElement;
                continue;
    }
 * See the License for the specific language governing permissions and
    }
    }
            }
        return id;
    private List<SQLDialectInsertReplaceMethod> insertMethodDescriptors;
            parentDialect.subDialects = psd;
        return CommonUtils.safeList(execKeywords);

    }
    }


    public SQLDialect createInstance() throws DBException {
    public boolean isAbstract() {
                    methodsList.add(method.createInsertMethod());
    public String getId() {
import org.jkiss.dbeaver.model.sql.SQLDialect;
    public DBPImage getIcon() {
                case "dmlKeywords" -> this.dmlKeywords = loadList(propValue);
    private static final Log log = Log.getLog(SQLDialectDescriptor.class);
    @Override
    @Override
                    insertMethodDescriptors.add(method);
        super(config);
    public List<String> getFunctions() {
        }
                subs.add(sd);
    @Override
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
        for (IConfigurationElement propElement : config.getChildren("property")) {
            return Collections.emptyList();
        return isAbstract;
    public String getScriptDelimiter() {
    }
        return implClass.createInstance(SQLDialect.class);
    @Override
            if (sd.isHidden) {
    private List<String> ddlKeywords;
                case "insertMethods" -> insertMethodNames = loadList(propValue);
        if (psd == null) {
    }

        return ";";
    public List<String> getDataTypes() {
    @NotNull
package org.jkiss.dbeaver.model.sql.registry;
            } else {

        return subs;
        for (int i = 0; i < list.size(); i++) {
        for (SQLDialectDescriptor sd : subDialects) {

        return icon;
        }
    @Nullable
        return CommonUtils.safeList(dmlKeywords);
        List<String> list = Arrays.asList(str.split(","));
    }
        return insertMethodDescriptors != null ? new ArrayList<>(insertMethodDescriptors) : new ArrayList<>();
        return CommonUtils.safeList(txnKeywords);
    public List<String> getExecuteKeywords() {
    public List<String> getTransactionKeywords() {

    public String getLabel() {
    @NotNull
        return properties == null ? null : properties.get(name);
 */
    SQLDialectDescriptor(IConfigurationElement config) {
    @Override

 *
import java.util.*;
            psd = new ArrayList<>();
        return label + " (" + id + ")";
    @NotNull
    }
    public List<SQLDialectInsertReplaceMethod> getSupportedInsertReplaceMethodsDescriptors() {

        }
                default -> {
    private List<String> types;


    @NotNull

        return label;
import org.jkiss.dbeaver.Log;
    public String getDescription() {
    public List<String> getDDLKeywords() {
        return CommonUtils.safeList(ddlKeywords);
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
        List<SQLDialectMetadata> subs = new ArrayList<>();

        if (!ArrayUtils.isEmpty(insertReplaceMethods)) {
    private final boolean isHidden;
        this.icon = iconToImage(config.getAttribute("icon"));
 * Unless required by applicable law or agreed to in writing, software
    }

    @Override
        this.parentDialect = parentDialect;

        this.id = config.getAttribute("id");

 *


 * SQLDialectDescriptor
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.utils.CommonUtils;
        getSupportedInsertReplaceMethodsDescriptors();
    private final boolean isAbstract;
                List<DBDInsertReplaceMethod> methodsList = new ArrayList<>();
    @NotNull
    }
        return parentDialect;
        return list;
 * limitations under the License.
                    SQLDialectInsertReplaceMethod method = DBWorkbench.getPlatform().getSQLDialectRegistry().getInsertReplaceMethod(insertMethodId);
    @Override
    @Override

        List<SQLDialectDescriptor> psd = parentDialect.subDialects;
    }
    private List<String> dmlKeywords;
    @NotNull
                        properties = new LinkedHashMap<>();
        return new DBDInsertReplaceMethod[0];

        if (subDialects == null) {


 *     http://www.apache.org/licenses/LICENSE-2.0
    private DBDInsertReplaceMethod[] insertReplaceMethods;
    public String toString() {
    @NotNull
                case "ddlKeywords" -> this.ddlKeywords = loadList(propValue);
    private Map<String, Object> properties;
            String propValue = propElement.getAttribute("value");


        psd.add(this);

    }

public class SQLDialectDescriptor extends AbstractContextDescriptor implements SQLDialectMetadata {
        return isHidden;
    public List<String> getReservedWords() {
    }
import org.jkiss.dbeaver.DBException;
    public DBDInsertReplaceMethod[] getSupportedInsertReplaceMethods() {
 * you may not use this file except in compliance with the License.
            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * DBeaver - Universal Database Manager
    }
    private final ObjectType implClass;
                case "functions" -> this.functions = loadList(propValue);
            return insertReplaceMethods;
            }
        return CommonUtils.safeList(keywords);
 */
                    if (properties == null) {
        if (insertReplaceMethods == null && !CommonUtils.isEmpty(insertMethodNames)) {
    @Override
    void setParentDialect(SQLDialectDescriptor parentDialect) {
    @Override
import org.jkiss.code.Nullable;

    private final String description;

    public Object getProperty(String name) {
        this.isAbstract = CommonUtils.getBoolean(config.getAttribute("abstract"));

                    }
                insertMethodDescriptors = new ArrayList<>();
