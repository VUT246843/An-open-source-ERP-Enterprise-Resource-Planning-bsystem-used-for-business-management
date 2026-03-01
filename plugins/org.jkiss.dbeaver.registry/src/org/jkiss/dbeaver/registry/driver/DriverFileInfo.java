    public String getFileLocation() {
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setFileCRC(long fileCRC) {
    public String getVersion() {


        this.file = library.getLocalFile();
    }
        return id;
        this.file = file;
        return file;
}
    public DriverFileInfo(String id, String version, DBPDriverLibrary.FileType type, Path file, String fileLocation) {

 *
    }
 * limitations under the License.
    public long getFileCRC() {
        this.fileCRC = library.getFileCRC();
        this.id = id;
    DriverFileInfo(DBPDriverLibrary library) {
 * DBeaver - Universal Database Manager
    @Override

    }

    private final Path file;
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return version;
        this.version = version;
        return fileLocation;
    public String toString() {
        this.fileCRC = fileCRC;
 * you may not use this file except in compliance with the License.


    public DBPDriverLibrary.FileType getType() {
/*
    }
        this.type = library.getType();
        this.id = library.getId();
    private final DBPDriverLibrary.FileType type;
 */

        return fileCRC;
    public String getId() {

    private long fileCRC;

 *

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
import java.nio.file.Path;
    }
 *
        this.fileLocation = fileLocation;

    private final String id;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return file != null ? file.getFileName().toString() : this.id;
package org.jkiss.dbeaver.registry.driver;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    private final String version;
public class DriverFileInfo {
        this.version = library.getVersion();
        this.type = type;
        this.fileLocation = library.getLocalFile() != null ? library.getLocalFile().toString() : library.getPath();
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        return type;
    public Path getFile() {
    private final String fileLocation;
