
import java.util.Map;
    private final String fileExtension;
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
    public ProgramInfo(Program program, String fileExtension) {
import org.eclipse.swt.program.Program;
            }
            if (!CommonUtils.isEmpty(fileExtension)) {
    {
        }

 * distributed under the License is distributed on an "AS IS" BASIS,

    public Program getProgram() {
/*
 * Program info
                }
    }
 * See the License for the specific language governing permissions and


                return getProgram(fileExtension);
 * limitations under the License.
    }
    public static ProgramInfo getProgram(String fileExtension)
package org.jkiss.dbeaver.ui;
            programInfo = new ProgramInfo(program, fileExtension);
    private static final Map<String, ProgramInfo> programMap = new HashMap<>();
        return program;
import org.eclipse.core.resources.IFile;
        return null;
    }
    private DBIconBinary image;
/**
 * Licensed under the Apache License, Version 2.0 (the "License");


import org.jkiss.dbeaver.model.DBPImage;

import org.eclipse.swt.graphics.ImageData;
    public DBPImage getImage() {
 * you may not use this file except in compliance with the License.
        if (programInfo == null) {
                if (imageData[0] != null) {
 * DBeaver - Universal Database Manager
        return image;
import java.util.HashMap;
    }
            programMap.put(fileExtension, programInfo);

                final ImageData[] imageData = new ImageData[1];
}
                UIUtils.syncExec(() -> imageData[0] = program.getImageData());
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
            Program program = Program.findProgram(fileExtension);
        if (resource instanceof IFile) {
    public static ProgramInfo getProgram(IResource resource)
 *
import org.eclipse.core.resources.IResource;
 *
    public String getFileExtension() {
        ProgramInfo programInfo = programMap.get(fileExtension);
            if (program != null) {
        }
    }

    private final Program program;
        this.fileExtension = fileExtension;
            final String fileExtension = CommonUtils.notEmpty(resource.getFileExtension());
        return fileExtension;
 * Unless required by applicable law or agreed to in writing, software
                    programInfo.image = new DBIconBinary(program.getName(), imageData[0]);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    {
        return programInfo.program == null ? null : programInfo;
            }
 *
public class ProgramInfo {
 */
        this.program = program;
