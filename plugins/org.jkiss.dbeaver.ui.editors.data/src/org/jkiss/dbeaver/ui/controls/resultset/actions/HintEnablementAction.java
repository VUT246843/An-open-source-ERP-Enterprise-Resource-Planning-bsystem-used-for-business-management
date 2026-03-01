 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.registry.data.hints.ValueHintContextConfiguration;
        ValueHintContextConfiguration contextConfiguration = getResultSetViewer().getModel().getHintContext().getContextConfiguration();
 *
        configuration.setEnabled(!configuration.isEnabled());
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.controls.resultset.actions;
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
    ) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(resultSetViewer, hd.getLabel(), AS_CHECK_BOX);
        this.descriptor = hd;
        setToolTipText(hd.getDescription());
import org.jkiss.dbeaver.registry.data.hints.ValueHintProviderDescriptor;
    }


    private final DBDAttributeBinding attribute;
import org.jkiss.code.NotNull;
    private final ValueHintProviderDescriptor descriptor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        ValueHintProviderConfiguration configuration = contextConfiguration.getProviderConfiguration(descriptor);
 * Unless required by applicable law or agreed to in writing, software

 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isChecked() {
    @Override
 *
        contextConfiguration.saveConfiguration();
 * limitations under the License.
 * See the License for the specific language governing permissions and
        this.attribute = attribute;
    public void run() {
        @Nullable DBDAttributeBinding attribute
        getResultSetViewer().refreshData(null);
import org.jkiss.dbeaver.registry.data.hints.ValueHintProviderConfiguration;
/*
        return descriptor.isEnabled(null, getResultSetViewer().getModel().getHintContext(), true);
        @NotNull ResultSetViewer resultSetViewer,
 * You may obtain a copy of the License at
    public HintEnablementAction(

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    }
 * DBeaver - Universal Database Manager
 */
import org.jkiss.code.Nullable;

}
        @NotNull ValueHintProviderDescriptor hd,
public class HintEnablementAction extends AbstractResultSetViewerAction {
    @Override
 *
