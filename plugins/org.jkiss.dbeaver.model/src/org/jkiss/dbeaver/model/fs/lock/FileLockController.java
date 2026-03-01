                    throw new DBException("Failed to create lock file: " + lockFile, e);
        }
    public FileLock lockIfNotLocked(@NotNull String lockFileName, @NotNull String operationName) throws DBException {

     */

     * @return - lock
    protected void awaitingUnlock(@NotNull Path lockFile) throws DBException, InterruptedException {
                    .setOperationName(operationName)
        synchronized (FileLockController.class) {
                return null;
 *
                Files.write(lockFile, gson.toJson(lockInfo).getBytes(StandardCharsets.UTF_8));
     * @param operationName - executed operation name
    @Nullable
        log.info("Waiting for a file to be unlocked: " + lockFile);
                    throw new DBException("Failed to remove invalid lock file: " + lockFile, ex);
     * @param operationName - executed operation name
        long maxIterations = maxLockTime / CHECK_PERIOD;
        int currentCheckCount = 0;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    protected void awaitUnlock(@NotNull Path lockFile) throws InterruptedException, DBException {
     * @param lockFileName  - file to be locked
    }
            }
        log.warn("File has not been unlocked within the expected period, force unlock");
import org.jkiss.dbeaver.Log;
                Files.createDirectories(lockFolderPath);
        //checking that this is not a new lock from another operation
            }
        if (fileUnlocked) {
            // file unlocked now
 *
            }
            }
            }
    }

            return;


    private static final String LOCK_META_FOLDER = ".locks";
import java.nio.file.Files;
    }
                    .setApplicationId(applicationId)
import java.time.Duration;
            Files.deleteIfExists(projectLockFile);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                throw new DBException("Failed to lock: " + lockFile.getFileName(), e);
            if (originalLockInfo != null && originalLockInfo.isBlank()) {
    }
                createLockFolderIfNeeded();

    @Nullable
                    continue;
    @NotNull
                return null;

public class FileLockController {
import org.jkiss.code.NotNull;
    @NotNull
    }
/*

     * exceeds the maximum available locking time {@link #maxLockTime} or the lock is invalid {@link #awaitUnlock)}.

                awaitUnlock(lockFile);
                } else {

     * @return - lock
                }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Other threads/processes will also see this lock, and will wait for it to end
    public boolean isFileLocked(@NotNull String lockFileName) {
                throw new DBException("Failed to lock file: " + lockFileName, e);
            } catch (IOException e) {
            return;
    private static final long DEFAULT_MAX_LOCK_TIME = Duration.ofMinutes(1).toMillis(); // 1 min
     - empty lock info if the lock has just been created and the information has not yet been written;
import org.jkiss.utils.IOUtils;
            }
            }
    /**

    /**
                }
        FileLockInfo originalLockInfo = readLockInfo(lockFile);
    private Path getLockFilePath(@NotNull String lockFileName) {

        boolean lockFileCreated = false;
 * File based resource locks
        this.maxLockTime = maxLockTime;
            } catch (Exception e) {
                }
    }
                    log.debug("Error deleting lock file " + lockFile, e);
    private void createLockFolderIfNeeded() throws IOException {
        while (!fileUnlocked) {
            currentCheckCount++;
     *
                if (Files.exists(lockFile)) {
    /**
    private static final int CHECK_PERIOD = 10;
    }
            if (currentCheckCount >= maxIterations || fileUnlocked) {

     *
        this.lockFolderPath = metadataFolder

    protected void forceUnlock(Path projectLockFile) {
            if (isLocked(getLockFilePath(lockFileName))) {
        this(applicationId, DEFAULT_MAX_LOCK_TIME, metadataFolder);
        } else {
            log.warn("Failed to read lock file info, but lock file still exist: " + lockFile);
                    return new FileLock(lockFilePath);
                    // fake lock for external file system?

                    .build();
                log.error("Failed to write lock info, unlock: " + lockFile);

 * limitations under the License.

     * Check that file locked
        while (!lockFileCreated) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

            if (Files.notExists(lockFolderPath)) {
import java.util.UUID;
        // something went wrong and lock is invalid
            return null;
    private final Gson gson = new Gson();
        return lockFolderPath.resolve(lockFileName + LOCK_FILE_EXTENSION);
                if (!IOUtils.isFileFromDefaultFS(lockFolderPath)) {
                FileLockInfo lockInfo = new FileLockInfo.Builder(UUID.randomUUID().toString())
    private final Path lockFolderPath;
    private void createLockFile(@NotNull Path lockFile, @NotNull FileLockInfo lockInfo) throws DBException, InterruptedException {
import com.google.gson.Gson;
            awaitUnlock(lockFile);
 * DBeaver - Universal Database Manager
    }
    }
        } catch (IOException e) {
                }
     * Lock the project for the duration of any operation.
     */
    }
            try {
        } catch (IOException e) {
            return gson.fromJson(reader, FileLockInfo.class);
import java.io.IOException;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        }
    private static final String LOCK_FILE_EXTENSION = ".lock";
/**
        try (Reader reader = Files.newBufferedReader(lockFile, StandardCharsets.UTF_8)) {
                Files.createFile(lockFile);
    }
            return FileLockInfo.emptyLock();
                } catch (IOException ex) {
import org.jkiss.code.Nullable;

                try {
        this(applicationId, DEFAULT_MAX_LOCK_TIME, GeneralUtils.getMetadataFolder());

            }
 * Unless required by applicable law or agreed to in writing, software
        FileLockInfo currentLockInfo = readLockInfo(lockFile);

            log.error(e);
package org.jkiss.dbeaver.model.fs.lock;
            }
        if (Files.notExists(lockFile)) {
    }
    private final String applicationId;
     */
        if (currentLockInfo == null) {
     @return
                // and the lock information has not yet been written
}
                try {
     * @param lockFileName - file to be locked
import java.io.Reader;
    public FileLockController(@NotNull String applicationId, long maxLockTime, @NotNull Path metadataFolder) throws DBException {

                Path lockFilePath = getLockFilePath(lockFileName);
            .resolve(LOCK_META_FOLDER);

    }
 * you may not use this file except in compliance with the License.

        if (!isLocked(lockFile)) {
            }
        }
                originalLockInfo = readLockInfo(lockFile);
        try {
     */
            Thread.sleep(CHECK_PERIOD);
        }
    protected boolean isLocked(@NotNull Path lockFilePath) {

     * if the project is already locked, the operation will be executed as a child of the first lock,
    public FileLockController(@NotNull String applicationId, @NotNull Path metadataFolder) throws DBException {
                    log.info("Looks like file was locked by another rm instance at the same time");
            if (Files.exists(lockFile)) {
            forceUnlock(lockFile);
    public FileLock lock(@NotNull String lockFileName, @NotNull String operationName) throws DBException {
        }
     - lock info
            try {
    private final long maxLockTime;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;

    }
            if (!isLocked(lockFile)) {
            fileUnlocked = !isLocked(lockFile);

        Path projectLockFilePath = getLockFilePath(lockFileName);
                break;
        }
        return Files.exists(lockFilePath);
     * otherwise it creates its own lock.
 */
            } catch (IOException e) {
            if (Files.exists(lockFile)) {
        }
    private FileLockInfo readLockInfo(@NotNull Path lockFile) {
        }
     * or force intercept lock, if the operation will take too long and
                } catch (IOException e) {
                // possible in situation where the project has just been locked
    private static final Log log = Log.getLog(FileLockController.class);
import java.nio.charset.StandardCharsets;
        if (originalLockInfo != null && originalLockInfo.getOperationId().equals(currentLockInfo.getOperationId())) {
        awaitingUnlock(lockFile);
        return isLocked(projectLockFilePath);
        synchronized (FileLockController.class) {
    public FileLockController(@NotNull String applicationId) throws DBException {
                return new FileLock(lockFilePath);
            return lock(lockFileName, operationName);
    // for tests
import java.nio.file.Path;
        }
    /**
                    .setOperationStartTime(System.currentTimeMillis())
        synchronized (FileLockController.class) {
        this.applicationId = applicationId;
                    Files.delete(lockFile);
 */
            try {
        boolean fileUnlocked = originalLockInfo == null; //lock can be removed at the moment when we try to read lock file info
                lockFileCreated = true;
import org.jkiss.dbeaver.utils.GeneralUtils;
     - null if lock not exist;
 * See the License for the specific language governing permissions and
                createLockFile(lockFilePath, lockInfo);
 *
                    Files.deleteIfExists(lockFile);
            return;
