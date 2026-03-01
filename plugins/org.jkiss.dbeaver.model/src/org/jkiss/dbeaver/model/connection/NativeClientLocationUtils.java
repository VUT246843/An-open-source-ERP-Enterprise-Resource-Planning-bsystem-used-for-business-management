        if (RuntimeUtils.isLinux()) {

     * can supply extra folders to examine.
     * @param extraFoldersToExamine extra folders to look for the clients
                        return FileVisitResult.SKIP_SIBLINGS;
                return true;
     * @return map of local client locations
                            if (grandparent != null) {
        return foldersToExamine;
            } else if (RuntimeUtils.isOSArchAArch64()) {
 */
import java.nio.file.attribute.BasicFileAttributes;
     *

        foldersToExamine.add("/usr/local/bin");
import org.jkiss.code.Nullable;
     * @return a path representing the path's grandparent
        return parent.getParent();
            try {
        // No instances for you!
    ) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.code.NotNull;
        for (String folder : foldersToExamine) {
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
     * @param path a path
     * Finds native client locations. Designed to work on Unix and Unix-like systems.
     * @param fileEndings the endings of full file paths to search for

    private static boolean somethingEndsWith(Path file, Iterable<String> fileEndings) {

            return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                        if (!somethingEndsWith(file, fileEndings)) {
            if (file.endsWith(endings)) {
            foldersToExamine.add("/etc/alternatives");
            }
import java.util.HashMap;
            if (RuntimeUtils.isOSArchAMD64()) {
import java.nio.file.Path;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.Log;
        }
    private static Collection<String> unixFoldersToExamine() {
    @NotNull
                foldersToExamine.add("/opt/homebrew/opt");
        Map<String, DBPNativeClientLocation> result = new HashMap<>();
            Path folderPath = Path.of(folder);
import java.util.function.Function;
import java.nio.file.FileVisitResult;
        } else if (RuntimeUtils.isMacOS()) {
/*
        return false;

        foldersToExamine.addAll(extraFoldersToExamine);
     *
 * you may not use this file except in compliance with the License.
        foldersToExamine.add("/usr/bin");

                        }
            } catch (IOException e) {
            }
        if (parent == null) {
        Collection<String> extraFoldersToExamine,
                                result.put(grandparent.toString(), grandparentPathToClientLocationMapper.apply(grandparent));
 * Licensed under the Apache License, Version 2.0 (the "License");
                foldersToExamine.add("/opt/homebrew/Cellar");
    private static Path getGrandparent(@NotNull Path path) {
    }
     * @param grandparentPathToClientLocationMapper maps tool's grandparent folder to an instance of {@code DBPNativeClientLocation}
            if (Files.notExists(folderPath)) {
                log.warn("Unable to examine folder %s while looking for a client home".formatted(folder), e);
    private NativeClientLocationUtils() {
public final class NativeClientLocationUtils {
     * It does so by examining some common disk locations for the clients. A user of this function
                Files.walkFileTree(folderPath, new SimpleFileVisitor<>() {
    /**
        return result;
    private static final Log log = Log.getLog(NativeClientLocationUtils.class);
}
        }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Collection<String> foldersToExamine = new ArrayList<>();
    public static Map<String, DBPNativeClientLocation> findLocalClientsOnUnix(
        Path parent = path.getParent();
        Function<? super Path, ? extends DBPNativeClientLocation> grandparentPathToClientLocationMapper
                continue;
import java.util.Map;

        Iterable<String> fileEndings,
        for (String endings : fileEndings) {
        }
     */
import java.util.Collection;
 * You may obtain a copy of the License at
                            Path grandparent = getGrandparent(file.toRealPath());
     */
            foldersToExamine.add("/usr/lib"); // it seems like native clients never appear in this folder on macOS
     * Returns the <em>grandparent path</em>, or {@code null} if this path does not have a grandparent.
                        }
import java.nio.file.SimpleFileVisitor;
                foldersToExamine.add("/usr/local/Cellar/"); // homebrew on Intel-based macs
                            }
                        if (Files.isExecutable(file)) {
 *
import java.nio.file.Files;
 * DBeaver - Universal Database Manager
                });
                foldersToExamine.add("/opt/homebrew/bin");
 *
            }
                            return FileVisitResult.CONTINUE;
    @Nullable
 * limitations under the License.

        }
            }
    }
 * See the License for the specific language governing permissions and
 *
import java.util.ArrayList;
package org.jkiss.dbeaver.model.connection;
        Collection<String> foldersToExamine = unixFoldersToExamine();
                    }
    /**
import java.io.IOException;
