package org.jkiss.dbeaver.model.runtime;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software

 */
    public LocalCacheProgressMonitor(DBRProgressMonitor original) {
 * limitations under the License.
/**
 * you may not use this file except in compliance with the License.
    }
}
 *
    public boolean isForceCacheUsage() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return true;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * DBeaver - Universal Database Manager

 *
import org.jkiss.dbeaver.Log;
/*
 * Progress monitor which forces cache usage
        super(original);
public class LocalCacheProgressMonitor extends ProxyProgressMonitor {
 */
    private static final Log log = Log.getLog(LocalCacheProgressMonitor.class);
