    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.wmi.service.WMIQualifier;
    }
 *
    {
 * You may obtain a copy of the License at
 * Value meta information

    public WMIValueMeta(Collection<WMIQualifier> qualifiers)
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 */
/**
}
import org.jkiss.dbeaver.model.data.DBDValueMeta;
 * See the License for the specific language governing permissions and
    private Collection<WMIQualifier> qualifiers;
 * limitations under the License.
    public Collection<WMIQualifier> getQualifiers()
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.wmi.model;
 */
 *
public class WMIValueMeta implements DBDValueMeta {
 *
        return qualifiers;
/*
 * Unless required by applicable law or agreed to in writing, software
import java.util.Collection;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.qualifiers = qualifiers;


