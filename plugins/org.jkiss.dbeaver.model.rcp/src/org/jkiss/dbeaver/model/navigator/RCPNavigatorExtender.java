    public DBNNode[] getExtraNodes(@NotNull DBNNode parentNode) {
                @Override
        }
                    super.dispose(reflect);
 * Unless required by applicable law or agreed to in writing, software
public class RCPNavigatorExtender implements DBNModelExtender {
                    resourceListener = null;
 * you may not use this file except in compliance with the License.
    @Override
        if (parentNode instanceof DBNProject) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            EFSNIOMonitor.addListener(resourceListener);
 * limitations under the License.
 *
            if (ArrayUtils.isEmpty(DBWorkbench.getPlatform().getFileSystemRegistry().getFileSystemProviders())) {
    }
import org.jkiss.code.Nullable;
 *
/*
            return new DBNNode[]{ fsNode };
 *
                protected void dispose(boolean reflect) {
import org.jkiss.code.NotNull;
                    EFSNIOMonitor.removeListener(resourceListener);
import org.jkiss.dbeaver.model.fs.nio.EFSNIOMonitor;


 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    @Nullable
                }
 */
}
                return null;
import org.jkiss.utils.ArrayUtils;
            resourceListener = new DBFResourceListener(fsNode);
            }
 * distributed under the License is distributed on an "AS IS" BASIS,



    private DBFResourceListener resourceListener;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.navigator;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
            DBNFileSystems fsNode = new DBNFileSystems((DBNProject) parentNode) {
        return null;
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystems;
            };

import org.jkiss.dbeaver.runtime.DBWorkbench;
