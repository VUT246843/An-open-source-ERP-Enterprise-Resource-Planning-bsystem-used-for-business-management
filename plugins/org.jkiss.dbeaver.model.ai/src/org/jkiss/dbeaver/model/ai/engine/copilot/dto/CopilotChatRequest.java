        private boolean stream;
public record CopilotChatRequest(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
        private int topP;
 */
    @SerializedName("top_p") int topP,
            this.n = n;
    }


            return this;

        }
        }

        }
        public CopilotChatRequest build() {
    public static Builder builder() {
            this.stream = stream;
        private int n;
    }
            return new CopilotChatRequest(model, intent, messages, stream, n, topP, temperature);
            return this;
        public Builder withStream(boolean stream) {
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.ai.engine.copilot.dto;

        public Builder withN(int n) {
        public Builder withTemperature(double temperature) {
}
        }
        public Builder withTopP(int topP) {
        return new Builder();
            this.topP = topP;
        }
            return this;
    double temperature
 * distributed under the License is distributed on an "AS IS" BASIS,
        public Builder withModel(String model) {
 * you may not use this file except in compliance with the License.
            this.model = model;
 *     http://www.apache.org/licenses/LICENSE-2.0
        private boolean intent;
        }
    boolean intent,
            return this;

    boolean stream,

            return this;
 *

    int n,
    public static class Builder {
 *
 * See the License for the specific language governing permissions and
import com.google.gson.annotations.SerializedName;
            this.messages = messages;
 * DBeaver - Universal Database Manager
            return this;
        }
    String model,
            this.temperature = temperature;
        }
        private double temperature;
        public Builder withMessages(List<CopilotMessage> messages) {


        public Builder withIntent(boolean intent) {
 * Unless required by applicable law or agreed to in writing, software
) {

 * You may obtain a copy of the License at
 *
    List<CopilotMessage> messages,
            return this;
        private List<CopilotMessage> messages;

        private String model;
import java.util.List;
            this.intent = intent;
