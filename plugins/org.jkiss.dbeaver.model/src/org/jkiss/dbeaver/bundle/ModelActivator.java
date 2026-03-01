
        throws Exception
     */
 * The activator class controls the plug-in life cycle
    {
    }
        super.start(context);
        instance = null;
    /**
        throws Exception

 *
            try {
    {
            if (debugLogFile.exists()) {
 */
                    System.err.println("Can't delete debug log file"); //$NON-NLS-1$
 * limitations under the License.
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
    private static ModelActivator instance;
/**

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
        super.stop(context);

 *     http://www.apache.org/licenses/LICENSE-2.0
    // The shared instance
     * The constructor
    }
 *
    public ModelActivator()
    public static ModelActivator getInstance()

        return instance;
    {

    @Override
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                }
        }
/*
 * You may obtain a copy of the License at
                if (!debugLogFile.delete()) {
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (debugWriter == null) {
 */
            } catch (FileNotFoundException e) {
            File logPath = GeneralUtils.getMetadataFolder();
        return debugWriter;
public class ModelActivator extends Plugin
        instance = this;
    {
    public synchronized PrintStream getDebugWriter()
                e.printStackTrace(System.err);
{
 * Licensed under the Apache License, Version 2.0 (the "License");

            }
    }
 * Unless required by applicable law or agreed to in writing, software
/*
import org.eclipse.core.runtime.Plugin;
*/
    }
                debugWriter = new PrintStream(debugLogFile);
 * you may not use this file except in compliance with the License.
    public void stop(BundleContext context)
        SQLSemanticProcessor.shutdownExecutor();
    @Override
 * See the License for the specific language governing permissions and

    }
import org.osgi.framework.BundleContext;
    public void start(BundleContext context)
    {
            File debugLogFile = new File(logPath, "dbeaver-debug.log"); //$NON-NLS-1$
package org.jkiss.dbeaver.bundle;
