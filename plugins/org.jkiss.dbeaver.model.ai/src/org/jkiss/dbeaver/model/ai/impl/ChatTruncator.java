                    used += cutTokens;
                AIMessage cut = truncateToTokens(m, remaining);
    }
        String mergedMessage = systems.stream()
        }
        if (headLen <= 0) {
        this.reserveForReply = b.reserveForReply;
        for (AIMessage m : in) {
/*
        int headroom = maxTokens - reserveForReply - reserveForOverhead;
        ArrayList<AIMessage> pickedReverse = new ArrayList<>(rest.size());
            return this;
    private final int reserveForReply;
        // 4) Place SYSTEM in front
    }

     * Keeps the BEGINNING of the content (most stable/system prompts, etc).
        }
        return systems.getFirst().withContent(mergedMessage);
        private TokenCounter counter;
            int remainingForSystem = Math.max(0, headroom - used);
    public static Builder builder() {
    }
                    break;
        this.maxTokens = b.maxTokens;
     * Truncate the conversation to fit into (maxDbSnapshotTokens - reserves).
    private static String safeHead(String s, int headLen) {


                rest.add(m);
        public Builder reserveForReply(int v) {
                }

        }
            return this;
                used += t;
import java.util.List;
            if (used + t <= budget) {

                int cutTokens = counter.count(cut.getContent());
            if (m.getRole() == AIMessageType.SYSTEM) {
            if (m != null && !m.getContent().isBlank()) {

    private final TokenCounter counter;
        this.reserveForSystem = b.reserveForSystem;

 *
    }
 * See the License for the specific language governing permissions and
        int hi = content.length();
        }
            String slice = safeHead(content, mid); // <-- keep the start
        }
            return message;
    private static AIMessage mergeSystems(List<AIMessage> systems) {
        if (maxTokens <= reserveForReply + reserveForOverhead) {
        public Builder reserveForSystem(int v) {
    private AIMessage truncateToTokens(AIMessage message, int maxTokens) {
     */

            }
        }


        // 1) Extract and merge SYSTEM messages

 * Copyright (C) 2010-2025 DBeaver Corp and others
            int mid = (lo + hi) >>> 1;
            this.counter = c;
    @NotNull
     * Ordering in the result is chronological (SYSTEM first, then oldest->newest).

            this.reserveForOverhead = v;
        ArrayList<AIMessage> out = new ArrayList<>(in.size());
        }
import org.jkiss.dbeaver.model.ai.AIMessage;

 * DBeaver - Universal Database Manager
public final class ChatTruncator {
            return this;
                best = candidate;   // can fit more from the start
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
            return new ChatTruncator(this);

        AIMessage best = message.withContent("");
        }
        Collections.reverse(pickedReverse);

    private static List<AIMessage> filterNonEmpty(List<AIMessage> in) {

        public Builder tokenCounter(TokenCounter c) {
        if (counter.count(message.getContent()) <= maxTokens) {
        }
        for (int i = rest.size() - 1; i >= 0; i--) {
        int used = 0;
        private int reserveForSystem;
    }
        assert !systems.isEmpty() : "At least one SYSTEM message is required";
        this.counter = Objects.requireNonNull(b.counter, "TokenCounter is required");
            return "";
        return best;
            throw new IllegalArgumentException("maxDbSnapshotTokens too small for the reserves");
        }
    private final int reserveForSystem;
        String content = message.getContent();
            return s;
                    pickedReverse.add(cut);
        if (headLen >= s.length()) {
            assert maxTokens > reserveForReply + reserveForOverhead + reserveForSystem
        private int reserveForOverhead;

import java.util.Objects;
        result.addAll(pickedReverse);
        // Preserve chronological order; newest last has the highest precedence for humans reading.
            this.reserveForSystem = v;

        ArrayList<AIMessage> rest = new ArrayList<>(messages.size());
        int systemCap = Math.min(systemTokens, reserveForSystem);

        if (in == null || in.isEmpty()) {
     */
import org.jkiss.dbeaver.model.ai.AIMessageType;

            AIMessage m = rest.get(i);
    /**

        List<AIMessage> messages = filterNonEmpty(input);
import java.util.ArrayList;
        int lo = 0;
            AIMessage candidate = message.withContent(slice);
        if (maxTokens <= 0) {
        AIMessage mergedSystem = systems.isEmpty() ? null : mergeSystems(systems);
        while (lo <= hi) {
            }
import java.util.Collections;
            int t = counter.count(candidate.getContent());
    }
        for (AIMessage m : messages) {
        }
import java.util.stream.Collectors;

                if (remaining <= 0) {
        public Builder reserveForOverhead(int v) {
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
            } else {
        int systemTokens = mergedSystem != null ? counter.count(mergedSystem.getContent()) : 0;

        ArrayList<AIMessage> result = new ArrayList<>(pickedReverse.size() + 1);

            }
            return List.of();
            } else {
        return s.substring(0, headLen);
            .collect(Collectors.joining("\n\n---\n\n"));
        public Builder maxTokens(int v) {
        if (messages.isEmpty()) {
        }
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                : "maxDbSnapshotTokens must be greater than the sum of reserves";

        return result;
            return List.of();

        }
        }
            return this;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            if (t <= maxTokens) {
        // Simple greedy: newest -> oldest
                pickedReverse.add(m);
            .map(AIMessage::getContent)
    public List<AIMessage> truncate(@NotNull List<AIMessage> input) {
        this.reserveForOverhead = b.reserveForOverhead;
 * limitations under the License.


        private int maxTokens;
    private ChatTruncator(Builder b) {
        return new Builder();
            int t = counter.count(m.getContent());
     * Truncate message content to <= maxDbSnapshotTokens using binary search over substring length.
    /**
            return message.withContent("");
                }

package org.jkiss.dbeaver.model.ai.impl;
        // 3) Chronological order
                systems.add(m);
        }
        }
                int remaining = budget - used;
            } else {
    }
                lo = mid + 1;
    private final int reserveForOverhead;
                if (cutTokens > 0) {
                out.add(m);
 *

 * you may not use this file except in compliance with the License.
}
        }
    private final int maxTokens;
 *
        private int reserveForReply;
                hi = mid - 1;
        // 2) Walk from newest to oldest
        int budget = Math.max(0, headroom - systemCap);
                break;
    public static final class Builder {

        public ChatTruncator build() {
        List<AIMessage> systems = new ArrayList<>();
            .filter(s -> !s.isBlank())


            this.maxTokens = v;
    // ----- builder -----
        return out;
        }
            result.add(truncateToTokens(mergedSystem, remainingForSystem));
            this.reserveForReply = v;
        if (mergedSystem != null) {
            return this;
