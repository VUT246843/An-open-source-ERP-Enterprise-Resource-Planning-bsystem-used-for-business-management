 * See the License for the specific language governing permissions and
        exceptions.add(e);
import java.util.List;
    public ProgressMonitorWithExceptionContext(DBRProgressMonitor monitor) {
 *
 * limitations under the License.
    public List<Exception> getExceptions() {
 * Progress monitor with extra logging
        super(monitor);
    }
 */

}
 * You may obtain a copy of the License at
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.runtime;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final List<Exception> exceptions = new ArrayList<>();
 * you may not use this file except in compliance with the License.
        return exceptions;



 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * Unless required by applicable law or agreed to in writing, software
    public void addException(Exception e) {
import java.util.ArrayList;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    }
public class ProgressMonitorWithExceptionContext extends ProxyProgressMonitor {
/*

    }
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
