        if (Files.isWritable(installDir.toPath()))
import java.net.URI;
        } finally {
        File fileTest = null;
}
        return escaped.toString();
class LauncherUtils {
 * You may obtain a copy of the License at
        try {
 *
            //If an exception occured while trying to create the file, it means that it is not writtable
            '/', "\\/"
            // on Vista you are not allowed to write executable files on virtual directories like "Program Files"
            '\r', "\\r",

        if (trailingSlash == (file.endsWith("/"))) //$NON-NLS-1$
            return new File(new URI(spec));
            }
/*
import java.net.MalformedURLException;
            // Try to build it from a URI that will be properly decoded.
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.launcher;
            return false;
            '\\', "\\\\",
        StringBuilder escaped = new StringBuilder();
        return new URL(url.getProtocol(), url.getHost(), file);
import java.io.File;
        }
 * Unless required by applicable law or agreed to in writing, software
            char c = original.charAt(i);
 * limitations under the License.

    public static String escape(String original) {
            if (fileTest != null)

        for (int i = 0; i < original.length(); i++) {
            return url;
            if (CHARS_TO_ESCAPE.containsKey(c)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        );


            '\t', "\\t",
 *
            fileTest = File.createTempFile("writableArea", ".dll", installDir); //$NON-NLS-1$ //$NON-NLS-2$
    private static final Map<Character, String> CHARS_TO_ESCAPE =
                fileTest.delete();

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        }
                escaped.append(c);
import java.net.URISyntaxException;
    static boolean canWrite(File installDir) {
import java.net.URL;
                escaped.append(CHARS_TO_ESCAPE.get(c));
            '\b', "\\b",
            } else {
    static URL adjustTrailingSlash(URL url, boolean trailingSlash) throws MalformedURLException {
        } catch (IOException e) {
 *     http://www.apache.org/licenses/LICENSE-2.0

 */
            return true;
            return false;
            return new File(spec.substring(5));
            // we use the .dll suffix to properly test on Vista virtual directories
        file = trailingSlash ? file + "/" : file.substring(0, file.length() - 1); //$NON-NLS-1$
            '\f', "\\f",
            '\n', "\\n",
import java.util.Map;
        String file = url.getFile();
    }
    static File toFileURL(String spec) {
        } catch (URISyntaxException | IllegalArgumentException e) {

            '\"', "\\\"",
        }
 * See the License for the specific language governing permissions and
        if (!installDir.isDirectory())
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.nio.file.Files;
        try {

    }
 * you may not use this file except in compliance with the License.
        return true;
        Map.of(
import java.io.IOException;
 *

 * DBeaver - Universal Database Manager
