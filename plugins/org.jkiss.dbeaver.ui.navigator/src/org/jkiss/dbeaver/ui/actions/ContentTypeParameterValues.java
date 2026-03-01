 *

            values.put(contentType.getName(), contentType.getId());

public class ContentTypeParameterValues implements IParameterValues {
 * You may obtain a copy of the License at
import java.util.HashMap;

 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
import org.eclipse.core.runtime.Platform;
 *

 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.runtime.content.IContentType;
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
        final Map<String, String> values = new HashMap<>();

        IContentType[] allContentTypes = Platform.getContentTypeManager().getAllContentTypes();

        return values;
/*
    public Map<String, String> getParameterValues() {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.actions;
    @Override
        for (IContentType contentType : allContentTypes) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
    }
 * See the License for the specific language governing permissions and
 *
import org.eclipse.core.commands.IParameterValues;
        }
