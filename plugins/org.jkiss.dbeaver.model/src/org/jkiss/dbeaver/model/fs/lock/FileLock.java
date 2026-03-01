    public FileLock(@NotNull Path lockFilePath) {
 */
        return lockFilePath;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
     * Unlock resource and remove .lock file
        unlock();
    @Override
    }
import org.jkiss.dbeaver.Log;
            }
    }
    private final Path lockFilePath;
            if (Files.exists(lockFilePath)) {
    protected Path getLockFilePath() {

 * Unless required by applicable law or agreed to in writing, software
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    }
/*
 */
package org.jkiss.dbeaver.model.fs.lock;
import java.io.IOException;
    private static final Log log = Log.getLog(FileLock.class);
    public void close() {
                unlock();
            log.error("Failed to unlock file: " + lockFilePath, e);

    /**
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;

}

        try {

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
import java.nio.file.Files;
 * Resource Manager resource lock
     */
import java.nio.file.Path;
    public void unlock() {
        this.lockFilePath = lockFilePath;
 * limitations under the License.

            Files.deleteIfExists(lockFilePath);
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
        }
 *
                // file still locket, try to unlock again

 * distributed under the License is distributed on an "AS IS" BASIS,
     */
/**
        } catch (IOException e) {

public class FileLock implements AutoCloseable {
     * @return path to the lock file
 *
