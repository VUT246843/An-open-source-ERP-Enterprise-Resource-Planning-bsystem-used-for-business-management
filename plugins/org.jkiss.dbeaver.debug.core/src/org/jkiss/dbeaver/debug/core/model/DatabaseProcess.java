 * you may not use this file except in compliance with the License.
    public IStreamsProxy getStreamsProxy() {
    }


    public void setAttribute(String key, String value) {
 *
        this.name = name;

    @Override
        return attributes.get(key);
            launch.removeProcess(this);
        return terminated;
    }
    }
}

        }
import org.eclipse.debug.core.DebugException;

 *
 *
    }
public class DatabaseProcess implements IProcess {
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
        launch.addProcess(this);
        attributes.put(key, value);
    public String getAttribute(String key) {
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
    public <T> T getAdapter(Class<T> adapter) {
    public boolean canTerminate() {

    @Override
    public void terminate() throws DebugException {
        this.launch = launch;
import java.util.HashMap;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!terminated) {
    @Override
    @Override
    }
    public int getExitValue() throws DebugException {
    }
    private final String name;
        return 0;
    }

            DebugUtils.fireTerminate(this);
import java.util.Map;
import org.eclipse.debug.core.model.IStreamsProxy;
        return name;
    }
    }
import org.jkiss.dbeaver.debug.core.DebugUtils;




    }
    public boolean isTerminated() {

    public DatabaseProcess(ILaunch launch, String name) {
        return null;
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean terminated = false;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return !terminated;
    @Override

    public ILaunch getLaunch() {
 * You may obtain a copy of the License at
/*
import org.eclipse.debug.core.ILaunch;
    @Override
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.debug.core.model;
    @Override
            terminated = true;
        return null;

    private final ILaunch launch;
 * See the License for the specific language governing permissions and
    }
 */


import org.eclipse.debug.core.model.IProcess;
    private final Map<String, String> attributes = new HashMap<>();
    public String getLabel() {

    @Override
 * DBeaver - Universal Database Manager
 * limitations under the License.
        return launch;
