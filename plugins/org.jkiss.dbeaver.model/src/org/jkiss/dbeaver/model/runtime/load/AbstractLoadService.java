package org.jkiss.dbeaver.model.runtime.load;
    private String serviceName;
    {
 */
}                List<DBRBlockingObject> activeBlocks = progressMonitor.getActiveBlocks();
    }
import org.jkiss.dbeaver.DBException;
/**
                throw new InvocationTargetException(e);
 * Lazy loading service

    private DBRProgressMonitor progressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
    public void initService(DBRProgressMonitor monitor, AbstractJob ownerJob)
    @Override
    {
                    BlockCanceler.cancelBlock(progressMonitor, activeBlocks.get(activeBlocks.size() - 1));
 */
 * you may not use this file except in compliance with the License.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.progressMonitor = monitor;
    }
    @Override
import org.jkiss.dbeaver.model.runtime.BlockCanceler;
 * DBeaver - Universal Database Manager
    }
    public boolean cancel() throws InvocationTargetException
    private AbstractJob ownerJob;

        }

 * @param <RESULT> result type
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
        this.serviceName = serviceName;

    }
            try {
        } else if (progressMonitor != null) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
    protected AbstractLoadService()
    {
            }
                if (!CommonUtils.isEmpty(activeBlocks)) {
 * See the License for the specific language governing permissions and
/*
    public String getServiceName()
    {

                Thread.currentThread().interrupt();
        this.ownerJob = ownerJob;
        return false;

            return this.ownerJob.cancel();
        if (this.ownerJob != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.DBRBlockingObject;
 *
                }
import java.lang.reflect.InvocationTargetException;
public abstract class AbstractLoadService<RESULT> implements ILoadService<RESULT> {
 * Unless required by applicable law or agreed to in writing, software
 *
import java.util.List;
                return true;
            } catch (DBException e) {


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected AbstractLoadService(String serviceName)
        this("Loading");
        return serviceName;
 * limitations under the License.
 *
