    @Override
    public Class<?>[] getAdapterList() {
                } catch (Throwable e) {
                try {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.net.ssh.JSCHUserInfoPromptProvider;
            if (adapterType == JSCHUserInfoPromptProvider.class) {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    return null;
 * Unless required by applicable law or agreed to in writing, software

 *
    

 *     http://www.apache.org/licenses/LICENSE-2.0
 *

    }
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    }
        return CLASSES;
/*

            }
 *
public class JSCHUIPromptProviderAdapterFactory implements IAdapterFactory {
    @Override
package org.jkiss.dbeaver.ui.net.ssh.jsch;
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 * limitations under the License.
                    log.error("Error installing creating UI prompt provider", e);
                    return adapterType.cast(new JSCHUIPromptProvider());
 */
import org.jkiss.dbeaver.model.net.ssh.JSCHSessionController;
 * DBeaver - Universal Database Manager

import org.eclipse.core.runtime.IAdapterFactory;
                }
    private static final Class<?>[] CLASSES = new Class[] { JSCHSessionController.class };
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final Log log = Log.getLog(JSCHUIPromptProviderAdapterFactory.class);

import org.jkiss.dbeaver.Log;
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {

        if (adaptableObject instanceof JSCHSessionController) {
