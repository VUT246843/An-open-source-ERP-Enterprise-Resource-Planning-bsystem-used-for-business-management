
            System.load(dllFolder.getAbsolutePath() + "/ORAUTS.DLL");
            oraHomeLibraries = dllFolder.listFiles(new FilenameFilter()
 * Class loader loads libraries from Oracle home folder.
        File dllFolder = OCIUtils.isInstantClient(oracleHomeDescriptor.getName()) ? oraHomeFile : new File(oraHomeFile, "bin");
    private static final Log log = Log.getLog(OCIClassLoader.class);
    public String findLibrary(String libname)
 *
            {

    {
            System.load(dllFolder.getAbsolutePath() + "/ORAUNLS11.DLL");
import java.io.FilenameFilter;
                public boolean accept(File dir, String name)

package org.jkiss.dbeaver.ext.oracle.oci;
        }
            System.loadLibrary("MSVCRT");
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 *
        return super.findLibrary(libname);
 * See the License for the specific language governing permissions and
public class OCIClassLoader extends ClassLoader
    private File[] oraHomeLibraries;
            }
                {
    @Override
{
            System.load(dllFolder.getAbsolutePath() + "/ORACORE11.DLL");
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * Unless required by applicable law or agreed to in writing, software
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        File oraHomeFile = new File(oracleHomeDescriptor.getName());
            System.load(dllFolder.getAbsolutePath() + "/MSVCR80.DLL");
/*
    }
    public OCIClassLoader(OracleHomeDescriptor oracleHomeDescriptor, ClassLoader parent)
        }
 */
        for (File library : oraHomeLibraries) {
import java.io.File;
        if (dllFolder.exists()) {
            System.load(dllFolder.getAbsolutePath() + "/ADVAPI32.DLL");
            System.load(dllFolder.getAbsolutePath() + "/OCI.DLL");
            System.load(dllFolder.getAbsolutePath() + "/ORANLS11.DLL");
*/
            System.loadLibrary("WS2_32");
/*
 * limitations under the License.
    //private OracleHomeDescriptor oracleHomeDescriptor;
            System.loadLibrary("ADVAPI32");
 * Licensed under the Apache License, Version 2.0 (the "License");

            System.loadLibrary("WINMM");
}
            System.loadLibrary("KERNEL32");
        //this.oracleHomeDescriptor = oracleHomeDescriptor;

    {
            log.warn("Binary folder isn't found in Oracle home " + oracleHomeDescriptor.getName());
                @Override
        else {
 *     http://www.apache.org/licenses/LICENSE-2.0
            System.loadLibrary("USER32");
            });
        }
                return library.getAbsolutePath();
        String nativeName = System.mapLibraryName(libname);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at

        super(parent);
 *
                    return name.toLowerCase().endsWith(System.mapLibraryName("")); // OS dependent library extension
            System.loadLibrary("OLE32");
            if (library.getName().equalsIgnoreCase(nativeName)) {
            System.loadLibrary("PSAPI");
            System.load(dllFolder.getAbsolutePath() + "/ORAUTS.DLL");
 */
import org.jkiss.dbeaver.Log;
/**
