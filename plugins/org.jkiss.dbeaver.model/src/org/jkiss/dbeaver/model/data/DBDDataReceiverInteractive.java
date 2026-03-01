 */
 *
 * See the License for the specific language governing permissions and
 *
 * We need to stop data receive visualization in this case.
/*
}
 */
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.

 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
public interface DBDDataReceiverInteractive extends DBDDataReceiver {

    boolean isDataReceivePaused();

 * Data receiving process may be paused by some UI interactions.
 * Interactive data receiver.
package org.jkiss.dbeaver.model.data;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
    void setDataReceivePaused(boolean paused);

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
