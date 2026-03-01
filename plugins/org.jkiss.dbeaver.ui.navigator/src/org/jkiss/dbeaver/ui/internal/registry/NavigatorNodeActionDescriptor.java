    public String toString() {
/*

    @Override
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;

import org.jkiss.dbeaver.ui.navigator.INavigatorNodeActionHandler;
 *
    public int getOrder() {
import org.eclipse.core.expressions.Expression;
        return object != null && isExpressionTrue(enablementExpression, object) && appliesTo(object, null);
    @NotNull
    NavigatorNodeActionDescriptor(@NotNull IConfigurationElement config) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
            } catch (Exception e) {
 */
    private final ObjectType implType;
public class NavigatorNodeActionDescriptor extends AbstractContextDescriptor {
    private final int order;
 * See the License for the specific language governing permissions and
import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.utils.CommonUtils;
    }

            try {
    public INavigatorNodeActionHandler getHandler() {
    private INavigatorNodeActionHandler instance;

    public boolean appliesTo(@NotNull DBPObject object) {

    public static final String EXTENSION_ID = "org.jkiss.dbeaver.navigator.nodeAction"; //NON-NLS-1 //$NON-NLS-1$
                this.instance = implType.createInstance(INavigatorNodeActionHandler.class);

 * limitations under the License.
package org.jkiss.dbeaver.ui.internal.registry;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
        return instance;
        this.implType = new ObjectType(config.getAttribute("class"));
 *
            }
        this.enablementExpression = getEnablementExpression(config);

    }

import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at

        return order;
        }
/**
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        super(config);
        this.order = CommonUtils.toInt(config.getAttribute("order"));
                throw new IllegalStateException(e);
import org.jkiss.dbeaver.model.DBPObject;

        return implType.getImplName();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (instance == null) {
 * you may not use this file except in compliance with the License.
}
    private final Expression enablementExpression;
 * NavigatorNodeActionDescriptor
 *
