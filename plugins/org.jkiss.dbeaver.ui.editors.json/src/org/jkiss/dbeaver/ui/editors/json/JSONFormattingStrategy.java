import org.jkiss.utils.CommonUtils;
 *
            .disableHtmlEscaping()
 * limitations under the License.
 * DBeaver - Universal Database Manager
            return content;
import org.eclipse.jface.text.formatter.ContextBasedFormattingStrategy;
    }
    }
        this.svConfig = svConfig;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
}    private ISourceViewer sourceViewer;
 * See the License for the specific language governing permissions and

            .serializeNulls()
        JsonElement jsonElement = JsonParser.parseString(content);
        .setStrictness(Strictness.LENIENT)
        .serializeNulls()
            .create();
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            .setPrettyPrinting()
 */
 * you may not use this file except in compliance with the License.

    public static Gson GSON_UNFORMATTED = new GsonBuilder()
/**
    @Override
import com.google.gson.*;

    @Override

    public static Gson GSON_FORMATTED = new GsonBuilder()
 * Unless required by applicable law or agreed to in writing, software
            .setStrictness(Strictness.LENIENT)


public class JSONFormattingStrategy extends ContextBasedFormattingStrategy {
 * The formatting strategy that transforms SQL keywords to upper case

    JSONFormattingStrategy(ISourceViewer sourceViewer, JSONSourceViewerConfiguration svConfig) {
    public void formatterStarts(String initialIndentation) {
/*
package org.jkiss.dbeaver.ui.editors.json;
    }
        .disableHtmlEscaping()
 */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return GSON_FORMATTED.toJson(jsonElement);
 *

        }
        if (CommonUtils.isEmpty(content)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
        .create();
    public String format(String content, boolean isLineStart, String indentation, int[] positions) {
    private JSONSourceViewerConfiguration svConfig;
    public void formatterStops() {
import org.eclipse.jface.text.source.ISourceViewer;
        this.sourceViewer = sourceViewer;
 * You may obtain a copy of the License at
 *

