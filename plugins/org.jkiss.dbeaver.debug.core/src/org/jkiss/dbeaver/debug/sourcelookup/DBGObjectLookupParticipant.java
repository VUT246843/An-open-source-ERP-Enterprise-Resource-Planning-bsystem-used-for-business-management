    @Override
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 *
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;
 *
 * See the License for the specific language governing permissions and
        return DebugUtils.getSourceName(object);
public class DBGObjectLookupParticipant extends AbstractSourceLookupParticipant {
package org.jkiss.dbeaver.debug.sourcelookup;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    public String getSourceName(Object object) throws CoreException {
import org.jkiss.dbeaver.debug.core.DebugUtils;
}
 * Unless required by applicable law or agreed to in writing, software

/*

 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 */
import org.eclipse.core.runtime.CoreException;
 * limitations under the License.

 * you may not use this file except in compliance with the License.
