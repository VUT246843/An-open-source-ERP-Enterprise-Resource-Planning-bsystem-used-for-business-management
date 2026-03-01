} *

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.navigator;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
public interface DBNNodeWithCache extends DBNLazyNode {
/**
 * Node with lazy children initialization
    void setCachedChildren(DBNNode[] children);
 */
 * you may not use this file except in compliance with the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager

 * You may obtain a copy of the License at
 *

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    DBNNode[] getCachedChildren();
 * Licensed under the Apache License, Version 2.0 (the "License");
