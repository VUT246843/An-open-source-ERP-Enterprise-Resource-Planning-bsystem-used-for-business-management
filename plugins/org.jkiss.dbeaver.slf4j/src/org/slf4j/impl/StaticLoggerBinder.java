 * Licensed under the Apache License, Version 2.0 (the "License");

    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
package org.slf4j.impl;

 * limitations under the License.
 */
    @Override


        return StaticLoggerBinder.class.getName();

 * SLF logger binder for dbeaver
 * See the License for the specific language governing permissions and
 *
 * you may not use this file except in compliance with the License.
    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
 *
    }
import org.slf4j.ILoggerFactory;
    public String getLoggerFactoryClassStr() {
public class StaticLoggerBinder implements LoggerFactoryBinder, ILoggerFactory {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;
 *
/*
    public Logger getLogger(String name) {
        return this;
import org.jkiss.dbeaver.slf4j.SLFLogger;

import org.slf4j.Logger;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return new SLFLogger(name);
 * Unless required by applicable law or agreed to in writing, software
 */
import org.slf4j.spi.LoggerFactoryBinder;
 * You may obtain a copy of the License at
    public ILoggerFactory getLoggerFactory() {
/**
    private static final Log log = Log.getLog(StaticLoggerBinder.class);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
}
