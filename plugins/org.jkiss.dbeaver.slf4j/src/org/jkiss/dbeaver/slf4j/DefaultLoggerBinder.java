 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Override

 */
    private static final DefaultLoggerBinder SINGLETON = new DefaultLoggerBinder();
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    public static DefaultLoggerBinder getSingleton() {
 * limitations under the License.
import org.jkiss.dbeaver.Log;
}

import org.slf4j.Logger;
public class DefaultLoggerBinder implements ILoggerFactory {
 *
 * DBeaver - Universal Database Manager
    }
 * you may not use this file except in compliance with the License.
    private static final Log log = Log.getLog(DefaultLoggerBinder.class);

        return new SLFLogger(name);
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and
        return SINGLETON;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Logger getLogger(String name) {

/*
package org.jkiss.dbeaver.slf4j;
 * Unless required by applicable law or agreed to in writing, software
import org.slf4j.ILoggerFactory;
