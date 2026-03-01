            }
        }
    }
 *
/*
 * limitations under the License.
    public Collection<WMIQualifier> getQualifiers()

    protected abstract void readObjectQualifiers(List<WMIQualifier> qualifiers) throws WMIException;
    {
 * Qualified object
            synchronized (this) {

        throws WMIException
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
        throws WMIException
 * Unless required by applicable law or agreed to in writing, software

        return null;
 */
 *
        if (qualifiers == null) {
                }
import java.util.ArrayList;
 * DBeaver - Universal Database Manager
                if (qualifiers == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Collection;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (q.getName().equalsIgnoreCase(name)) {
 * you may not use this file except in compliance with the License.
            }

public abstract class WMIQualifiedObject {
                    qualifiers = new ArrayList<>();

package org.jkiss.wmi.service;

                return q.getValue();
import java.util.List;
    public Object getQualifier(String name)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        for (WMIQualifier q : getQualifiers()) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    private volatile List<WMIQualifier> qualifiers;
 * See the License for the specific language governing permissions and
 *

        return qualifiers;
    {
                    readObjectQualifiers(qualifiers);
 * You may obtain a copy of the License at
        }
/**
