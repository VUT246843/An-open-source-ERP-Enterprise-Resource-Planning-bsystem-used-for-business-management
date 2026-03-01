
                DBRFeature feature = (DBRFeature) field.get(null);


 */
            }
    public void endTracking() {
 * See the License for the specific language governing permissions and
                log.error(e);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }

            tracker.startTracking();
public class DBRFeatureRegistry {
    private final Map<String, DBRFeature> commandFeatures = new HashMap<>();
                    if (allFeatures.containsKey(id)) {

        this.tracker = GeneralUtils.adapt(this, DBRFeatureTracker.class);



 *
            instance = new DBRFeatureRegistry();
        }
    }
 * DBeaver - Universal Database Manager
    }

                    }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
            tracker.dispose();

                if (feature != null) {
    }
    private static DBRFeatureRegistry instance = null;
            try {
                }
import org.jkiss.dbeaver.Log;
    public DBRFeature findCommandFeature(String commandId) {
                    if (!CommonUtils.isEmpty(feature.getCommandId())) {
import java.lang.reflect.Modifier;

import org.jkiss.dbeaver.utils.GeneralUtils;
                    }
        }
import java.lang.reflect.Field;
        QMUtils.getDefaultHandler().handleFeatureUsage(feature, parameters);
        }
 * you may not use this file except in compliance with the License.
 *
        if (instance == null) {
        return commandFeatures.get(commandId);
        }


 *
    private static final Log log = Log.getLog(DBRFeatureRegistry.class);
    }
                        commandFeatures.put(feature.getCommandId(), feature);
/**
                continue;
            if ((field.getModifiers() & Modifier.STATIC) == 0 || field.getType() != DBRFeature.class) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    allFeatures.put(id, feature);
    public static void useFeature(DBRFeature feature, Map<String, Object> parameters) {
 * You may obtain a copy of the License at
                    feature.setId(id);
    private final Map<String, DBRFeature> allFeatures = new LinkedHashMap<>();
                        log.warn("Duplicate feature definition: " + id);
    }


        if (tracker != null) {
    public List<DBRFeature> getAllFeatures() {

 * Unless required by applicable law or agreed to in writing, software
    public synchronized void registerFeatures(Class<?> theClass) {
                    String id = field.getName();
    private final DBRFeatureTracker tracker;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver feature registry
    public synchronized static DBRFeatureRegistry getInstance() {
package org.jkiss.dbeaver.model.runtime.features;
import org.jkiss.dbeaver.model.qm.QMUtils;
        if (tracker != null) {
    public void startTracking() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private DBRFeatureRegistry() {
        for (Field field : theClass.getDeclaredFields()) {
    }
    }
        return instance;
            } catch (Exception e) {
/*
        return new ArrayList<>(allFeatures.values());
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
}
import java.util.*;
        if (instance.tracker != null) {
            instance.tracker.trackFeature(feature, parameters);
