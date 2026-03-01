                attrMap.put("defaultValue", entityAttribute.getDefaultValue());

 * Created on Jul 13, 2004
    public DBPImage getLabelImage() {
    }

            attrMap.put("fullTypeName", entityAttribute.getFullTypeName());

        attrMap.put("name", this.getName());
 * distributed under the License is distributed on an "AS IS" BASIS,
 * @author Serge Rider
import java.util.LinkedHashMap;
    public void setAlias(String alias) {
    }
            }

    public String getAlias() {
/*
        if (entityAttribute != null && fullInfo) {



 *     http://www.apache.org/licenses/LICENSE-2.0
            attrMap.put("checked", true);
    public String toString() {
        this.inForeignKey = inForeignKey;
/**
import org.jkiss.code.NotNull;
    }
 * you may not use this file except in compliance with the License.
    }

    }
        super(attribute);

        inForeignKey = JSONUtils.getBoolean(attrMap, "inForeignKey");
        return inForeignKey;
        this.order = order;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    @Override
        inPrimaryKey = JSONUtils.getBoolean(attrMap, "inPrimaryKey");
        return attrMap;

            if (!CommonUtils.isEmpty(entityAttribute.getDescription())) {
import org.jkiss.utils.CommonUtils;
        }
}    public void setInForeignKey(boolean inForeignKey) {
    private int order = -1;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (this.isInForeignKey()) {
 * DBeaver - Universal Database Manager
    public ERDEntityAttribute(DBSEntityAttribute attribute, boolean inPrimaryKey) {
        alias = JSONUtils.getString(attrMap, "alias");
 * See the License for the specific language governing permissions and
    private boolean inForeignKey;
    }
        isChecked = JSONUtils.getBoolean(attrMap, "checked");
    public void setOrder(int order) {
            attrMap.put("typeName", entityAttribute.getTypeName());
    }
    }

        return object.getName();
        return DBValueFormatting.getObjectImage(object);
        this.alias = alias;
    public void setChecked(boolean checked) {
        if (this.isChecked()) {
        if (fullInfo) {
    }
            attrMap.put("iconIndex", iconIndex);
    }
/*
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
    }
    }
            if (!CommonUtils.isEmpty(entityAttribute.getDefaultValue())) {
 *
                attrMap.put("inForeignKey", true);
 * Unless required by applicable law or agreed to in writing, software

                attrMap.put("optional", true);
        DBSEntityAttribute entityAttribute = this.getObject();
        }
    @Override
        this.inPrimaryKey = inPrimaryKey;

        Map<String, Object> attrMap = new LinkedHashMap<>();
    public int getOrder() {
 * You may obtain a copy of the License at
            if (this.isInPrimaryKey()) {

package org.jkiss.dbeaver.model.erd;
 *
        return isChecked;
    }
    @Override
 * limitations under the License.

            attrMap.put("dataKind", entityAttribute.getDataKind().name());
    public String getLabelText() {
            }
    @NotNull

import java.util.Map;
    private boolean isChecked;
    public void fromMap(@NotNull ERDContext context, Map<String, Object> attrMap) {
 *
        return inPrimaryKey;
    public boolean isChecked() {
        isChecked = checked;
            if (!entityAttribute.isRequired()) {
        return getObject().getName();

    @Override
 *
import org.jkiss.dbeaver.model.data.json.JSONUtils;
import org.jkiss.dbeaver.model.DBPImage;
    }
            }
 */
        }
    }
public class ERDEntityAttribute extends ERDObject<DBSEntityAttribute> {
 */
    public boolean isInPrimaryKey() {
            }
 * Column entry in model Table
        return getName();

    public String getName() {
            int iconIndex = context.getIconIndex(DBValueFormatting.getObjectImage(entityAttribute));
    public boolean isInForeignKey() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public Map<String, Object> toMap(@NotNull ERDContext context, boolean fullInfo) {
                attrMap.put("description", entityAttribute.getDescription());
        }



            }
    private String alias;

    private boolean inPrimaryKey;
        return order;
            attrMap.put("alias", this.getAlias());
 */
        if (!CommonUtils.isEmpty(this.getAlias())) {
                attrMap.put("inPrimaryKey", true);
        return alias;
import org.jkiss.dbeaver.model.DBValueFormatting;
