
        return DBDValueHintProvider.class;

import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    public ValueHintProviderDescriptor(IConfigurationElement config) {
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean isVisibleByDefault() {

            DBDValueHintProvider.HintObject.class,
import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.dbeaver.model.DBPDataSource;
    public boolean isEnabled(DBSTypedObject typedObject, DBDValueHintContext context, boolean checkConfigDisable) {

    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataHintProvider"; //$NON-NLS-1$
import org.jkiss.dbeaver.model.data.hints.DBDValueHintContext;
    }
    protected Class<DBDValueHintProvider> getImplClass() {
    }
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        super(config);
 *
        String forAttr = config.getAttribute("for");
    public static final String TAG_HINT_PROVIDER = "hintProvider"; //$NON-NLS-1$

            }
        return label;
 * you may not use this file except in compliance with the License.
        if (association && typedObject != null) {
 * ValueHintProviderDescriptor
 */
               !CommonUtils.isEmpty(binding.getReferrers());
 * Unless required by applicable law or agreed to in writing, software
            DBSEntity contextEntity = dataSource == null ? null : context.getContextEntity();
        this.visibleByDefault = CommonUtils.getBoolean(config.getAttribute("visibleByDefault"), true);

    private final DBDValueHintProvider.HintObject forObject;
                dataSource == null ? null : dataSource.getContainer(),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            DBPDataSource dataSource = dataContainer == null ? null : dataContainer.getDataSource();

/**
    @NotNull
        return forObject;
    }
    public DBDValueHintProvider.HintObject getForObject() {
        }
import org.jkiss.dbeaver.model.data.hints.DBDValueHintProvider;
        this.forObject = CommonUtils.valueOf(
        this.label = config.getAttribute("label");
    private final String label;

            DBSDataContainer dataContainer = context.getDataContainer();
 *
        return visibleByDefault;
            forAttr,
 * Copyright (C) 2010-2024 DBeaver Corp and others
            ) {
        }
package org.jkiss.dbeaver.registry.data.hints;
    }
 *
                contextEntity)
            if (!ValueHintRegistry.getInstance().isHintEnabled(
    @NotNull
    }
    private final boolean association;
                return false;
import org.jkiss.dbeaver.Log;
    public String getLabel() {
    @NotNull
public class ValueHintProviderDescriptor extends AbstractValueBindingDescriptor<DBDValueHintProvider, DBDValueHintContext> {
 * limitations under the License.
        if (forAttr != null) forAttr = forAttr.toUpperCase();
            DBDValueHintProvider.HintObject.CELL);
import org.jkiss.dbeaver.model.struct.DBSEntity;
        if (checkConfigDisable) {
import org.jkiss.code.NotNull;
    @NotNull
 */
 * You may obtain a copy of the License at

        this.association = CommonUtils.getBoolean(config.getAttribute("association"));
import org.jkiss.utils.CommonUtils;
    @Override
    private static final Log log = Log.getLog(ValueHintProviderDescriptor.class);
                this,
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
}    private final boolean visibleByDefault;
    @Override
 * DBeaver - Universal Database Manager

            return typedObject instanceof DBDAttributeBinding binding &&
        return true;

