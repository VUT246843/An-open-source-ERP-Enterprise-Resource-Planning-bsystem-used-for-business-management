
    protected void readObjectQualifiers(List<WMIQualifier> qualifiers) throws WMIException
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    protected WMIObjectElement(WMIObject owner, String name)
        return owner;
    }
 * Object element (property or method)
    {
        this.owner = owner;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
    }
    }
public abstract class WMIObjectElement extends WMIQualifiedObject {
        getOwner().readQualifiers(this instanceof WMIObjectAttribute, getName(), qualifiers);
    @Override


    private WMIObject owner;
        this.name = name;
    {

 */
    }
 */
package org.jkiss.wmi.service;
        return name;
    public WMIObject getOwner()

 * you may not use this file except in compliance with the License.
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getName()
    private String name;
/*
 *
    {
}
 * limitations under the License.
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others



    {

