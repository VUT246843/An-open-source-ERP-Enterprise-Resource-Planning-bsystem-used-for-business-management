            if (status == WMIObjectSinkStatus.error) {
            // Read everything
import java.util.Collections;
    }
            Collections.addAll(objectList, objects);
            while (!monitor.isCanceled() && !finished) {
        }
        }
    private volatile boolean finished = false;
        if (errorDesc != null) {
                startPos = 0;
 */
    private long totalIndicated = 0;
            errorObject.release();
        } else {
    {
            totalIndicated += objects.length;
        this.monitor = monitor;
                    break;
    private final WMIService service;
        try {
        this.service = service;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
            service.cancelSink(this);
        this.maxRows = 0;


                    return;
            }
                if (objectList.size() >= maxRows) {
    }
                    startPos = 0;
            //service.cancelAsyncOperation(wmiObjectSink);
            // do nothing
    {
    public void indicate(WMIObject[] objects)
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                }
        this.firstRow = firstRow;
            int startPos, lastPos = objects.length - 1;
            } else {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    private String errorDesc;
                } catch (WMIException e) {
import java.util.List;
        this.firstRow = 0;
        if (firstRow <= 0 && maxRows <= 0) {
    private final long maxRows;
        this.service = service;

        throws WMIException

import java.util.ArrayList;
            }
 * you may not use this file except in compliance with the License.
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            finished = true;
}
                if (totalIndicated + objects.length < firstRow) {
    {

                Thread.sleep(100);
                    log.warn(e);
    {
                    totalIndicated += objects.length;
    private final DBRProgressMonitor monitor;
                // We read everything so lets cancel the sink
import org.jkiss.wmi.service.*;
/*
        this.maxRows = maxRows;
            }
        if (finished) {
            //Collections.addAll(objectList, objects);
        }
        }
{
    public List<WMIObject> getObjectList()

                }
            if (finished) {
    private final List<WMIObject> objectList = new ArrayList<>();
                } else {
                } else if (totalIndicated < firstRow) {
class WMIObjectCollectorSink implements WMIObjectSink
    private static final Log log = Log.getLog(WMIObjectCollectorSink.class);
    }
 * See the License for the specific language governing permissions and
        return objectList;
                try {
        }
            }
        if (errorObject != null) {
            //totalIndicated += objects.length;

 *

            finished = true;
        monitor.subTask(String.valueOf(objectList.size()) + " objects loaded");
            return;

            if (firstRow > 0) {
            throw new WMIException(errorDesc);

            }
    public void setStatus(WMIObjectSinkStatus status, int result, String param, WMIObject errorObject)
                    service.cancelSink(this);
    @Override
    {
package org.jkiss.dbeaver.ext.wmi.model;

    }
 * DBeaver - Universal Database Manager
        this.monitor = monitor;

                    startPos = (int)(firstRow - totalIndicated);
 * Unless required by applicable law or agreed to in writing, software

        if (monitor.isCanceled()) {
    private final long firstRow;
    public WMIObjectCollectorSink(DBRProgressMonitor monitor, WMIService service)
            for (int i = startPos; i <= lastPos; i++) {
                }
 *
    WMIObjectCollectorSink(DBRProgressMonitor monitor, WMIService service, long firstRow, long maxRows)
            totalIndicated += startPos;
    }
import org.jkiss.dbeaver.Log;
        if (status == WMIObjectSinkStatus.complete || status == WMIObjectSinkStatus.error) {
                    finished = true;
        } catch (InterruptedException e) {
    public void waitForFinish()
 * limitations under the License.
            // Add part (or all) of new objects
                totalIndicated++;
                errorDesc = param;
                objectList.add(objects[i]);
