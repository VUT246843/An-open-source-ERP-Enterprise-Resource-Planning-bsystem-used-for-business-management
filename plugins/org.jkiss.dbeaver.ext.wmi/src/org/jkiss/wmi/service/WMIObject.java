    {

    }
}
    public String toString()
 */
        return attributes;
 * You may obtain a copy of the License at
    }

 *
    }
        return readObjectText();
    }
    protected void finalize() throws Throwable
        return methods;
    {
    private native void readAttributes(long flags, List<WMIObjectAttribute> attributes)
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
 * limitations under the License.
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
        throws WMIException;
    protected void readObjectQualifiers(List<WMIQualifier> qualifiers)

    @Override
    @Override
import java.util.ArrayList;
    public WMIObject() {

    }
    native void releaseObject();

    {
        readAttributes(flags, attributes);
        releaseObject();
        readMethods(flags, methods);
 * distributed under the License is distributed on an "AS IS" BASIS,
    private native void writeAttributeValue(String name, Object value)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private native void readMethods(long flags, List<WMIObjectMethod> method)
    }
 */
    {
        return readAttributeValue(name);
    }
    private native String readObjectText()
        throws WMIException;
        super.finalize();

        throws WMIException


package org.jkiss.wmi.service;

    native void readQualifiers(boolean isAttribute, String attrName, List<WMIQualifier> qualifiers)
 *     http://www.apache.org/licenses/LICENSE-2.0
 *


    {

    }

        throws WMIException;
    }
        throws WMIException;
        List<WMIObjectAttribute> attributes = new ArrayList<>();
 * you may not use this file except in compliance with the License.
    public void setValue(String name, Object value) throws WMIException
    }

    public List<WMIObjectMethod> getMethods(long flags) throws WMIException
        List<WMIObjectMethod> methods = new ArrayList<>();


    {
    private long objectHandle;
    {
 * See the License for the specific language governing permissions and
        throws WMIException
    public Object getValue(String name) throws WMIException
 * Licensed under the Apache License, Version 2.0 (the "License");
        throws WMIException;
    public List<WMIObjectAttribute> getAttributes(long flags) throws WMIException

        throws WMIException;
import java.util.List;
public class WMIObject extends WMIQualifiedObject {
        writeAttributeValue(name, value);

 * WQL ResultSet
    public String getObjectText()
    public void release()
    {
 *
        releaseObject();

    private native Object readAttributeValue(String name)
        return "WMIObject:" + objectHandle;
        readQualifiers(false, null, qualifiers);
    @Override

    {
