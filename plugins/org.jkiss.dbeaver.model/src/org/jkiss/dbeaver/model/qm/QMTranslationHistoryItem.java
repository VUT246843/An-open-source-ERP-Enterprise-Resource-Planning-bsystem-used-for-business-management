    public QMTranslationHistoryItem(String naturalText, String completionText) {

    }
 * DBeaver - Universal Database Manager
        this.time = new Date(JSONUtils.getLong(map, "time", 0));

    public void setTime(Date time) {
        this.id = id;

        this.time = time;
 */
import java.util.LinkedHashMap;
    }
        this.id = JSONUtils.getString(map, "id");
    private String naturalText;
     * Converts item to map
 *
        map.put("naturalText", this.naturalText);

/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        this.naturalText = naturalText;
 * you may not use this file except in compliance with the License.
    public void setNaturalText(String naturalText) {
        return map;
    private String id;
        this.completionText = completionText;
    }
    private Date time;
        this.completionText = completionText;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
    public String getNaturalText() {
        map.put("completionText", this.completionText);
        Map<String, Object> map = new LinkedHashMap<>();
        return completionText;
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Date;

    public Date getTime() {
        map.put("id", this.id);


import org.jkiss.dbeaver.model.data.json.JSONUtils;

    }
    }
    public void setId(String id) {

        this.naturalText = naturalText;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
/**
    }
    }
        this.naturalText = JSONUtils.getString(map, "naturalText");
    public Map<String, Object> toMap() {
 * Natural language translator item
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public QMTranslationHistoryItem(Map<String, Object> map) {

    }
package org.jkiss.dbeaver.model.qm;
    }

     */
}
    public String getId() {
        return time;
        map.put("time", this.time == null ? 0L : this.time.getTime());
    public void setCompletionText(String completionText) {

    }
    private String completionText;
    public String getCompletionText() {
    public QMTranslationHistoryItem() {

        this.completionText = JSONUtils.getString(map, "completionText");

        return id;
public class QMTranslationHistoryItem {
        return naturalText;
 * limitations under the License.

    }
import java.util.Map;

 *
    }
