        this.outParameter = outParameter;
    private WMIObject outParameter;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public String toString()
/**
        this.inParameter = inParameter;

 *

 */
 *
        return outParameter;
    public WMIObjectMethod(WMIObject owner, String name, WMIObject inParameter, WMIObject outParameter)
 * DBeaver - Universal Database Manager

 * you may not use this file except in compliance with the License.
    public WMIObject getInParameter()
 *
        return inParameter;
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    @Override

package org.jkiss.wmi.service;
    public WMIObject getOutParameter()
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WMI object property
        return getName() + "()";
 * You may obtain a copy of the License at
 * limitations under the License.
/*
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
        super(owner, name);
    {
}
    {
    }
public class WMIObjectMethod extends WMIObjectElement
{
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    private WMIObject inParameter;
