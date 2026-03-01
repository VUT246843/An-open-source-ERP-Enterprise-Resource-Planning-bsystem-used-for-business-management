    }

 */
    }
        this.openTime = getTimeStamp();
 * DBeaver - Universal Database Manager
 * Abstract QM meta object
        this.objectId = generateObjectId();
    public long getObjectId() {

    public boolean isUpdated() {
        if (!isClosed()) {
        this.openTime = openTime;
    public void setOpenTime(long openTime) {
public abstract class QMMObject {
    }

        return getCloseTime() - getOpenTime();

    }
    }
        this.type = type;


        return updated;

 */

    }

        this.closeTime = closeTime;
    // for serialization
 * you may not use this file except in compliance with the License.
    }
    private final QMMetaObjectType type;

 * Unless required by applicable law or agreed to in writing, software
            return -1L;
package org.jkiss.dbeaver.model.qm.meta;
    protected void close() {
        this.objectId = generateObjectId();
    public long getDuration() {

    }
    private final long objectId;
    public boolean isClosed() {
    private static int globalObjectId = 0;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public long getOpenTime() {

        this.closeTime = 0;
    public long getCloseTime() {
        this.type = type;
        this.closeTime = getTimeStamp();
    protected synchronized void update() {
        return openTime;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.openTime = openTime;
        return type;
    }
 *


    protected void reopen() {
    }
    public abstract String getText();
 *

/**

        return closeTime > 0;
        return System.currentTimeMillis();
 * limitations under the License.

        return objectId;
    private long closeTime;
    private transient boolean updated;
        return closeTime;
    protected QMMObject(QMMetaObjectType type, long openTime, long closeTime) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public QMMObject(QMMetaObjectType type) {
        }
 * See the License for the specific language governing permissions and
    public QMMetaObjectType getObjectType() {
    protected static long getTimeStamp() {
 *
        globalObjectId++;
    }

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.updated = true;
        this.openTime = getTimeStamp();

    }
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
/*
        this.update();

    private long openTime;
        this.update();
        return globalObjectId;
    private static synchronized long generateObjectId() {
    }
    public void setCloseTime(long closeTime) {

    }
    public abstract QMMConnectionInfo getConnection();



    static final Log log = Log.getLog(QMMObject.class);
}

        this.closeTime = closeTime;

 *     http://www.apache.org/licenses/LICENSE-2.0
