                    Files.delete(file);
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.SimpleFileVisitor;
                    return FileVisitResult.CONTINUE;
import java.io.IOException;
 *
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
public class TaskClearHistoryHandler implements DBRRunnableWithProgress {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.Log;
                }

        } finally {
import java.nio.file.FileVisitResult;
        final DBPProject project = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
import java.lang.reflect.InvocationTargetException;
                    log.trace("Deleting " + file);
 * You may obtain a copy of the License at
            monitor.done();
    public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        } catch (IOException e) {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.tasks.ui.handlers;
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
import org.jkiss.dbeaver.model.task.DBTTaskManager;
            monitor.worked(1);
            throw new InvocationTargetException(e);
                @Override

                    Files.delete(dir);
            manager.cancelRunningTasks();
            monitor.worked(1);
 */
    }

 * DBeaver - Universal Database Manager
                    log.trace("Deleting " + dir);
 *
import java.nio.file.Files;
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
                }
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    return FileVisitResult.CONTINUE;
            monitor.subTask("Cancel running tasks");
            monitor.subTask("Delete task run records");
            monitor.beginTask("Clear task run history", 2);
                @Override
    private static final Log log = Log.getLog(TaskClearHistoryHandler.class);
            });

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
}
        try {

        final DBTTaskManager manager = project.getTaskManager();
 *
import org.jkiss.dbeaver.model.app.DBPProject;

/*

        }
import java.nio.file.Path;
            Files.walkFileTree(manager.getStatisticsFolder(), new SimpleFileVisitor<>() {
