 * limitations under the License.

        super(dataSourceNode);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.resource.ImageDescriptor;
 */
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 * ErrorEditorInput
import org.eclipse.core.runtime.IStatus;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
public class ErrorEditorInput extends DatabaseEditorInput<DBNDatabaseNode>
    private final IStatus error;
package org.jkiss.dbeaver.ui.editors;
    @Override
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at

 *

        this.error = error;

 */
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
    public ErrorEditorInput(@NotNull IStatus error, @Nullable DBNDatabaseNode dataSourceNode) {
 *
    }
{
 *
    public ImageDescriptor getImageDescriptor() {
        return error;
    public IStatus getError() {
 * you may not use this file except in compliance with the License.
/**
        return error.getMessage();
    }
import org.jkiss.dbeaver.ui.UIUtils;
    public String getToolTipText() {

 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
import org.eclipse.ui.ISharedImages;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return UIUtils.getShardImageDescriptor(ISharedImages.IMG_OBJS_ERROR_TSK);


