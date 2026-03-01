 *
        return this.markerFactory;

    }

 *
    private ILoggerFactory defaultLoggerContext;
    }
        this.markerFactory = new BasicMarkerFactory();

import org.slf4j.helpers.NOPMDCAdapter;

    public void initialize() {
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 */
    public MDCAdapter getMDCAdapter() {
public class DBeaverLogServiceProvider implements SLF4JServiceProvider {
    public static String REQUESTED_API_VERSION = "2.0.99";
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.slf4j;
        this.defaultLoggerContext = DefaultLoggerBinder.getSingleton();

    private IMarkerFactory markerFactory;
    public DBeaverLogServiceProvider() {
    }

    }

        return REQUESTED_API_VERSION;
    }
import org.slf4j.spi.MDCAdapter;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.slf4j.IMarkerFactory;

    public String getRequestedApiVersion() {
 *
import org.slf4j.ILoggerFactory;
    }
    public IMarkerFactory getMarkerFactory() {
 * Unless required by applicable law or agreed to in writing, software
import org.slf4j.spi.SLF4JServiceProvider;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.
        return this.defaultLoggerContext;
        return this.mdcAdapter;
import org.slf4j.helpers.BasicMarkerFactory;
/*
        this.mdcAdapter = new NOPMDCAdapter();
 *     http://www.apache.org/licenses/LICENSE-2.0
    public ILoggerFactory getLoggerFactory() {
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    private MDCAdapter mdcAdapter;
