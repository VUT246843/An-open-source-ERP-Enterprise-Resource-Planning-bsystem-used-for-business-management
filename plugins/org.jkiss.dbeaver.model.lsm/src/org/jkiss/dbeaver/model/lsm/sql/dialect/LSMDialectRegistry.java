import org.osgi.framework.Bundle;

import java.util.Map;
        }
public class LSMDialectRegistry {
    private final Map<Class<? extends SQLDialect>, LSMAnalyzerFactory> knownLsmAnalyzerByDialects = new HashMap<>();
    private void loadExtensions(IExtensionRegistry registry) {
     */
import org.eclipse.core.runtime.IExtensionRegistry;
 */
            instance = new LSMDialectRegistry();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    
import org.eclipse.core.runtime.IConfigurationElement;
            for (IConfigurationElement sqlDialectRef : dialectElement.getChildren("appliesTo")) {
    }
            log.error("Failed to register LSM dialect " + dialectElement.getAttribute("analyzerFactoryClass"), e);
 * DBeaver - Universal Database Manager
    }
    
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.lsm.LSMAnalyzerFactory;
        
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(EXTENSION_ID);
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            LSMAnalyzerFactory analyzerFactory = (LSMAnalyzerFactory) dialectElement.createExecutableExtension("analyzerFactoryClass");
    static final String EXTENSION_ID = "org.jkiss.dbeaver.lsm.dialectSyntax"; //$NON-NLS-1$
import org.jkiss.dbeaver.model.lsm.LSMAnalyzer;
                String dialectClassName = sqlDialectRef.getAttribute("dialectClass");
import java.util.HashMap;


                "Failed to resolve LSMAnalyzer for " + dialect.getDialectName() + " dialect. Illegal database driver configuration."
        
     * Returns an instance of this singleton
            dialectClass = dialectClass.getSuperclass();
        do {
    public static synchronized LSMDialectRegistry getInstance() {
            throw new IllegalStateException(
                Class<? extends SQLDialect> dialectType = AbstractDescriptor.getObjectClass(bundle, dialectClassName, SQLDialect.class);
    }
 * Unless required by applicable law or agreed to in writing, software
        if (analyzerFactory == null) {
        LSMAnalyzerFactory analyzerFactory;
    }


            instance.loadExtensions(Platform.getExtensionRegistry());
        }
import org.jkiss.dbeaver.model.sql.SQLDialect;
            }
package org.jkiss.dbeaver.model.lsm.sql.dialect;
 *     http://www.apache.org/licenses/LICENSE-2.0
        Class<?> dialectClass = dialect.getClass();
    
            return analyzerFactory;
    private void registerLsmDialect(IConfigurationElement dialectElement) {
import java.util.stream.Stream;

        } else {
    public LSMAnalyzerFactory getAnalyzerFactoryForDialect(SQLDialect dialect) {
 * limitations under the License.
 *
 *
 * you may not use this file except in compliance with the License.

                knownLsmAnalyzerByDialects.put(dialectType, analyzerFactory);
/*
 *

    private LSMDialectRegistry() {
        } catch (CoreException e) {
 * See the License for the specific language governing permissions and

        Stream.of(extConfigs).filter(e -> "lsmDialect".equals(e.getName())).forEach(this::registerLsmDialect);
        return instance;
            analyzerFactory = knownLsmAnalyzerByDialects.get(dialectClass);
}            );
    private static LSMDialectRegistry instance = null;
        Bundle bundle = Platform.getBundle(dialectElement.getContributor().getName());
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.Log;
        }
import org.eclipse.core.runtime.CoreException;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.Platform;
    
        try {
        } while (analyzerFactory == null && dialectClass != null);
    }
    private static final Log log = Log.getLog(LSMDialectRegistry.class);
        if (instance == null) {
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
