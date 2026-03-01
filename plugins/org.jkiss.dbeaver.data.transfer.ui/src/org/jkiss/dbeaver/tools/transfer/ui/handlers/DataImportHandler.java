    }
        DataTransferNodeDescriptor producerDesc = DataTransferRegistry.getInstance().getNodeById(StreamTransferProducer.NODE_ID);
                }
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
                } else {
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                    return new DatabaseTransferConsumer(objectContainer);
                    continue;
                    object = DBUtils.getPublicObject((DBSObject) object);
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferNodeDescriptor;

import org.jkiss.dbeaver.model.struct.*;
        if (CommonUtils.isEmpty(extension)) {
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
        } catch (DBException e) {
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_IMPORT)) {


    private static final Log log = Log.getLog(DataImportHandler.class);
        return null;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferConsumer;
 * You may obtain a copy of the License at
        if (processor != null) {
            return new StreamTransferProducer(
                HandlerUtil.getActiveShell(event),
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return new DatabaseTransferConsumer(adapted);
                    return processor;
        if (adapted != null) {
            }
 * limitations under the License.
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferProducer;
        DataTransferProcessorDescriptor processor = getProcessorByFile(file);
 *
        }
        if (producerDesc != null) {
            Class<? extends DBSObject> childType = object.getPrimaryChildType(null);
                }

                UIMessages.dialog_policy_data_import_title,
public class DataImportHandler extends DataTransferHandler {
                UIMessages.dialog_policy_data_import_msg,
            return null;
    }
                if (object instanceof DBSWrapper) {
        try {
import org.eclipse.core.resources.IFile;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Locale;
            DBSObjectContainer objectContainer = RuntimeUtils.getObjectAdapter(object, DBSObjectContainer.class);
            IFile file = RuntimeUtils.getObjectAdapter(object, IFile.class);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.internal.UIMessages;
                new StreamEntityMapping(file.getFullPath().toFile().toPath()),
 * Unless required by applicable law or agreed to in writing, software
 *
            }
                if (object instanceof DBSObjectContainer) {
        return false;
                    object = ((DBSWrapper) object).getObject();
    }
import org.jkiss.dbeaver.model.DBUtils;
                SWT.ICON_WARNING
            UIUtils.showMessageBox(

            log.error(e);
        }
            );
 * you may not use this file except in compliance with the License.
    private DataTransferProcessorDescriptor getProcessorByFile(IFile file) {
import org.eclipse.ui.handlers.HandlerUtil;
            return null;
        return super.execute(event);

                }
    private IDataTransferNode getNodeByFile(IFile file) {
            if (file != null) {

                if (object instanceof DBPObject) {
import org.jkiss.utils.ArrayUtils;
        String extension = file.getFileExtension();
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.tools.transfer.IDataTransferNode;
    }
        final DBSDataManipulator adapted = RuntimeUtils.getObjectAdapter(object, DBSDataManipulator.class);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
}                DBPPropertyDescriptor extList = processor.getProperty("extension");
            }
    public static boolean isObjectContainerSupportsImport(DBSObjectContainer object) {
                if (ArrayUtils.contains(defExtensions, extension)) {
        }
            return null;
        return null;
    @Override
                    DBWorkbench.getPlatformUI().showError("Wrong container", objectContainer.getName() + " doesn't support direct data import");
    public Object execute(ExecutionEvent event) throws ExecutionException {
    protected IDataTransferNode<?> adaptTransferNode(Object object)

 *
                String[] defExtensions = CommonUtils.split(CommonUtils.toString(extList.getDefaultValue()), ",");
                if (isObjectContainerSupportsImport(objectContainer)) {
import org.jkiss.dbeaver.ui.UIUtils;
                    objectContainer = (DBSObjectContainer) object;
/*

            if (objectContainer == null) {
        }
import org.jkiss.dbeaver.DBException;
            for (DataTransferProcessorDescriptor processor :  producerDesc.getProcessors()) {
 */
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.model.DBPObject;
                }
            if (objectContainer != null) {
                }
        extension = extension.toLowerCase(Locale.ENGLISH);

            return DBSDataContainer.class.isAssignableFrom(childType);
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.tools.transfer.ui.handlers;
                return getNodeByFile(file);
        } else {
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
        }
                processor);
import org.jkiss.dbeaver.tools.transfer.stream.StreamEntityMapping;
                if (extList == null) {

