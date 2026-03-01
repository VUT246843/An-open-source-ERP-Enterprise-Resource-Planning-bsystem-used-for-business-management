            log.debug(e);


    private final String id;

 * limitations under the License.
        return id;
        }
import org.jkiss.dbeaver.model.runtime.DBRInvoker;
public class DBPExternalConfiguration {
 *
package org.jkiss.dbeaver.model;
    public String getId() {

        } catch (DBException e) {
        try {
    }
 */
 *
        this.propertiesGetter = propertiesGetter;
 * you may not use this file except in compliance with the License.

 * You may obtain a copy of the License at
    private final DBRInvoker<Map<String, Object>> propertiesGetter;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
/**
 * Unless required by applicable law or agreed to in writing, software
import java.util.Collections;
    public DBPExternalConfiguration(String id, DBRInvoker<Map<String, Object>> propertiesGetter) {

    private static final Log log = Log.getLog(DBPExternalConfiguration.class);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * External configuration
import org.jkiss.dbeaver.DBException;
    }
    public Map<String, Object> getProperties() {
 */
    }

            return Collections.emptyMap();
            return propertiesGetter.invoke();
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        this.id = id;
import java.util.Map;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and
