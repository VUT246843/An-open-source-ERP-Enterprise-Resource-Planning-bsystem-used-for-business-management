 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and

        throws WMIException;
public class WMIService {
//    static {
    public native void close();

 * you may not use this file except in compliance with the License.
 */
}


 *
//    }
 * Uses native Win32 API access
    public static native WMIService connect(String domain, String host, String user, String password, String locale, String resource)
    public native void enumClasses(String superClass, WMIObjectSink sink, long flags)
        throws WMIException;
 */
//        String arch = System.getProperty("os.arch");
    }
        System.load(libPath);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.wmi.service;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static void linkNative() {
//        if (arch != null && arch.indexOf("64") != -1) {
 * limitations under the License.
    public native WMIService openNamespace(String namespace)
/*
//        } else {
        throws WMIException;
        throws WMIException;
//            System.loadLibrary("jkiss_wmi_x86");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
    public native void executeQuery(String query, WMIObjectSink sink, long flags)
 * WMI Service
 *

//            System.loadLibrary("jkiss_wmi_x86_64");
        throws WMIException;
    }

 * DBeaver - Universal Database Manager
    public native void cancelSink(WMIObjectSink sink)
    public native void enumInstances(String className, WMIObjectSink sink, long flags)
/**

//        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        System.loadLibrary("jkiss_wmi");
 * distributed under the License is distributed on an "AS IS" BASIS,
    private long serviceHandle = 0l;

 *

        throws WMIException;



    public static void linkNative(String libPath) {

