*/
    }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
public abstract class BaseValueManager implements IValueManager {

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.code.NotNull;
        // nothing
 * DBeaver - Universal Database Manager
    }
            if (executionContext == null) {
import org.eclipse.jface.action.IContributionManager;
 * Base value manager
import org.jkiss.dbeaver.ui.data.IValueController;
                    valueController.getValueHandler(),
import org.jkiss.dbeaver.ui.data.IValueManager;
            }
 *
    public void contributeProperties(@NotNull DBPPropertyManager propertySource, @NotNull IValueController controller) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        // Base value manager do not support any edit type.
            activeEditor.contributeActions(manager, controller);
            return null;
        }
 *
 *
            }
            try (DBCSession session = executionContext.openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Set NULL value")) {
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
    @Override
} * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCSession;

        if (activeEditor != null) {

    public IValueController.EditType[] getSupportedEditTypes() {

    private static final Log log = Log.getLog(BaseValueManager.class);
            log.error("Can't make NULL value", e);
                    valueController.getValueType());

            // We are going to create NULL value - it shouldn't result in any DB roundtrips so let's use dummy monitor
    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller, @Nullable IValueEditor activeEditor) throws DBCException {
/*

import org.jkiss.dbeaver.model.exec.DBCException;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
            DBCExecutionContext executionContext = valueController.getExecutionContext();
/*
 */
/**

 * you may not use this file except in compliance with the License.
                return DBUtils.makeNullValue(
 * You may obtain a copy of the License at
    {
package org.jkiss.dbeaver.ui.data.managers;
        try {
        }
 */
import org.jkiss.dbeaver.model.preferences.DBPPropertyManager;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    session,
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.ui.data.IValueEditor;
        return new IValueController.EditType[] {};
    public static Object makeNullValue(@NotNull final IValueController valueController)
        } catch (DBCException e) {

    @Nullable
                throw new DBCException(ModelMessages.error_not_connected_to_database);
import org.jkiss.dbeaver.model.DBUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.Log;
    }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

