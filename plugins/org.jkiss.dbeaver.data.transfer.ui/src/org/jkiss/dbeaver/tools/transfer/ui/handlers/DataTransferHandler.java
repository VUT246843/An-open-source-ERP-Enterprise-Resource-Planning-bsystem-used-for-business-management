import org.eclipse.jface.viewers.ISelection;
 * Licensed under the Apache License, Version 2.0 (the "License");
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                consumers.add((IDataTransferConsumer<?, ?>) node);
        }
import java.util.ArrayList;
                DataTransferWizard.openWizard(
        // Run transfer wizard

            }
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
        return null;
                    consumers,
            } else if (node instanceof IDataTransferConsumer) {
 *
import org.jkiss.dbeaver.tools.transfer.IDataTransferProducer;


                    workbenchWindow,
import org.eclipse.core.commands.AbstractHandler;
        if (!producers.isEmpty() || !consumers.isEmpty()) {
            IDataTransferNode<?> node = adaptTransferNode(object);
public abstract class DataTransferHandler extends AbstractHandler {
        }
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.tools.transfer.ui.handlers;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
            return null;
                DBWorkbench.getPlatformUI().showError(DTUIMessages.data_transfer_handler_title_data_transfer_error, DTUIMessages.data_transfer_handler_message_data_transfer_error, e);
} * See the License for the specific language governing permissions and
/*
    }
        } else {
import org.jkiss.dbeaver.tools.transfer.ui.wizard.DataTransferWizard;

        IStructuredSelection ss = (IStructuredSelection)selection;
import org.eclipse.core.commands.ExecutionException;
            } catch (Exception e) {

        final IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
            try {
        for (Object object : ss) {
 *
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
            if (node instanceof IDataTransferProducer) {
        final List<IDataTransferProducer<?>> producers = new ArrayList<>();
 * You may obtain a copy of the License at


import org.jkiss.dbeaver.tools.transfer.IDataTransferNode;
                    true);
 *
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
            }
        final List<IDataTransferConsumer<?,?>> consumers = new ArrayList<>();
 * limitations under the License.
        }

 */
        if (!(selection instanceof IStructuredSelection)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Override
import org.eclipse.jface.viewers.IStructuredSelection;
                    producers,
            DBWorkbench.getPlatformUI().showError(DTUIMessages.data_transfer_handler_title_data_transfer_error, "Can't perform data transfer: selected objects are not recognized as data producers or data consumers");
    protected abstract IDataTransferNode<?> adaptTransferNode(Object object);
 * DBeaver - Universal Database Manager
                producers.add((IDataTransferProducer<?>) node);
import org.eclipse.core.commands.ExecutionEvent;
    public Object execute(ExecutionEvent event) throws ExecutionException {
import java.util.List;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
