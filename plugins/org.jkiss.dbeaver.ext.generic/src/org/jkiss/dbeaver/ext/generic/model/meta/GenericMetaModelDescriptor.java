 * Licensed under the Apache License, Version 2.0 (the "License");
        instance.descriptor = this;
    }
    private final Map<String, GenericMetaObject> objects = new HashMap<>();
        dialectId = CommonUtils.toString(cfg.getAttribute("dialect"), GenericSQLDialect.GENERIC_DIALECT_ID);


    private List<String> modelReplacements;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    public GenericMetaModel getInstance() throws DBException {
        } catch (Throwable e) {
    {

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            modelReplacements.add(modelId);
        }
    }
    }
        implType = new ObjectType(GenericMetaModel.class.getName());
                modelReplacements = new ArrayList<>();
        return driverClass;
        super(cfg);
 *

            for (IConfigurationElement childConfig : objectList) {
            this.driverClass = new String[0];
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ext.generic.model.meta;

 *
        IConfigurationElement[] objectList = cfg.getChildren("object");
    public SQLDialectMetadata getDialect() {
    }
}
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
    }

 * DBeaver - Universal Database Manager

        return id;

        }
        return DBWorkbench.getPlatform().getSQLDialectRegistry().getDialect(dialectId);
 * Unless required by applicable law or agreed to in writing, software


import java.util.ArrayList;
        String driverClassList = cfg.getAttribute("driverClass");
public class GenericMetaModelDescriptor extends AbstractDescriptor {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                objects.put(metaObject.getType(), metaObject);
        this.id = cfg.getAttribute("id");
    private ObjectType implType;
    public String[] getDriverClass() {

            return instance;
    public String getId()
import java.util.HashMap;
            String modelId = replace.getAttribute("model");
        } else {
    private String id;
    }
import org.jkiss.utils.ArrayUtils;
        IConfigurationElement[] replaceElements = cfg.getChildren("replace");
        return objects.get(id);
    private final String dialectId;
        return instance;
 * you may not use this file except in compliance with the License.
            throw new DBException("Can't instantiate meta model", e);

 */
        implType = new ObjectType(cfg.getAttribute("class"));
        }
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
import org.jkiss.code.NotNull;
import java.util.List;
        if (!ArrayUtils.isEmpty(objectList)) {
/*
        this.contributorConfig = cfg;
        try {
            if (modelReplacements == null) {
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
        Class<? extends GenericMetaModel> implClass = implType.getImplClass(GenericMetaModel.class);
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.utils.CommonUtils;
        }

    public GenericMetaModelDescriptor(IConfigurationElement cfg) {
        if (CommonUtils.isEmpty(driverClassList)) {
    private IConfigurationElement contributorConfig;
        }
        instance.descriptor = this;

                GenericMetaObject metaObject = new GenericMetaObject(childConfig);
    public GenericMetaModelDescriptor() {

            }

        dialectId = GenericSQLDialect.GENERIC_DIALECT_ID;

            this.driverClass = driverClassList.split(",");
        return CommonUtils.safeList(modelReplacements);
 * You may obtain a copy of the License at
    }
    public List<String> getModelReplacements() {
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
            instance = implClass.getDeclaredConstructor().newInstance();
        this.modelReplacements = modelReplacements;
        for (IConfigurationElement replace : replaceElements) {
    private String[] driverClass;
    private GenericMetaModel instance;
import java.util.Map;
    }
import org.eclipse.core.runtime.IConfigurationElement;
    public void setModelReplacements(List<String> modelReplacements) {
 * See the License for the specific language governing permissions and
            }
        if (instance != null) {
    {
    @NotNull
    public GenericMetaObject getObject(String id)
        instance = new GenericMetaModel();
        super("org.jkiss.dbeaver.ext.generic");

