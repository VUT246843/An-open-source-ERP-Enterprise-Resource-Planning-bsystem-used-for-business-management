    }
    }
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
}        return (getWizard().getSettings().getConsumer() != null &&
import org.jkiss.dbeaver.tools.transfer.IDataTransferProducer;
 *
/*
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
import org.jkiss.dbeaver.ui.dialogs.IWizardPageNavigable;
 *
    @Override
 * Unless required by applicable law or agreed to in writing, software

 * You may obtain a copy of the License at
        super(pageName);
        return (getWizard().getSettings().getProducer() != null &&
 * distributed under the License is distributed on an "AS IS" BASIS,

public abstract class DataTransferPageNodeSettings extends ActiveWizardPage<DataTransferWizard> implements IWizardPageNavigable {
 */
    protected DataTransferPageNodeSettings(String pageName) {
    public boolean isPageNavigable() {
    protected boolean isProducerOfType(Class<? extends IDataTransferProducer> nodeType) {


            nodeType.isAssignableFrom(getWizard().getSettings().getProducer().getNodeClass()));
 * limitations under the License.

 *
 * you may not use this file except in compliance with the License.
            nodeType.isAssignableFrom(getWizard().getSettings().getConsumer().getNodeClass()));

 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.tools.transfer.ui.wizard.DataTransferWizard;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected boolean isConsumerOfType(Class<? extends IDataTransferConsumer> nodeType) {
    }
        return true;
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
package org.jkiss.dbeaver.tools.transfer.ui.pages;
