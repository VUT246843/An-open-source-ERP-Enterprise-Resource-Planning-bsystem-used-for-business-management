 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.tools.transfer.IDataTransferNode;
package org.jkiss.dbeaver.tools.transfer.ui.handlers;
 *
            UIUtils.showMessageBox(

import org.jkiss.dbeaver.utils.RuntimeUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                HandlerUtil.getActiveShell(event),
 * Unless required by applicable law or agreed to in writing, software
            return null;
            return null;
public class DataExportHandler extends DataTransferHandler {

        if (adapted != null) {
                SWT.ICON_WARNING);
        } else {
/*
 * DBeaver - Universal Database Manager
                UIMessages.dialog_policy_data_export_msg,
        }
 */
    }

 * See the License for the specific language governing permissions and
                UIMessages.dialog_policy_data_export_title,
        }
import org.jkiss.dbeaver.ui.UIUtils;
            return new DatabaseTransferProducer(adapted);
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
import org.eclipse.ui.handlers.HandlerUtil;
        return super.execute(event);
import org.jkiss.dbeaver.ui.internal.UIMessages;
 * limitations under the License.
import org.eclipse.core.commands.ExecutionEvent;
    public Object execute(ExecutionEvent event) throws ExecutionException {
    protected IDataTransferNode<?> adaptTransferNode(Object object) {
import org.eclipse.core.commands.ExecutionException;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.


 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
}    @Override
import org.eclipse.swt.SWT;
        final DBSDataContainer adapted = RuntimeUtils.getObjectAdapter(object, DBSDataContainer.class);
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EXPORT)) {
