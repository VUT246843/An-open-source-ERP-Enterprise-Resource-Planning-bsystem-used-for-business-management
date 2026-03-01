        }

    }
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        public boolean belongsTo(Object family) {
                    } catch (Exception e) {
            schedule(CHECK_PERIOD);
package org.jkiss.dbeaver.model.websocket.event;
    public void stop() {

 * Licensed under the Apache License, Version 2.0 (the "License");
        if (eventCheckJob != null) {
    protected final List<WSEvent> eventsPool = new ArrayList<>();
    private boolean forceSkipEvents = false;
        eventHandlerDescriptors.forEach(descriptor -> {
        @Override
                });
 * you may not use this file except in compliance with the License.

        eventCheckJob = new CBEventCheckJob();
            }
        }
                eventHandlersByType.getOrDefault(event.getTopicId(), List.of()).forEach(handler -> {

    public void addEvent(@NotNull WSEvent event) {
            if (monitor.isCanceled() || Thread.currentThread().isInterrupted()) {
import org.jkiss.code.NotNull;
            var handler = descriptor.getInstance();
    }
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            setSystem(true);
    public void setForceSkipEvents(boolean forceSkipEvents) {
     */

            eventCheckJob.cancel();
    public static final Object JOB_EVENT_HANDLER_FAMILY = new Object();
        if (!event.isForceProcessed() && forceSkipEvents) {
 * limitations under the License.
import java.util.HashMap;
import java.util.List;
            eventCheckJob = null;
                        log.error("Error on event handle " + event.getTopicId(), e);
            for (WSEvent event : events) {
                return Status.CANCEL_STATUS;
        private static final long CHECK_PERIOD = 1000;
/*
            return;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import java.util.Map;

    }

                return Status.CANCEL_STATUS;
        protected CBEventCheckJob() {
import java.util.ArrayList;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and



 * You may obtain a copy of the License at
            descriptor.getSupportedTopics().forEach(

                    }
        synchronized (eventsPool) {
            synchronized (eventsPool) {


                eventsPool.clear();
    }
            super("CloudBeaver events job");
            );
            return Status.OK_STATUS;
        @NotNull


    private CBEventCheckJob eventCheckJob;
        eventCheckJob.schedule();
    }

import org.jkiss.dbeaver.Log;
     * Add cb event to the event pool
            if (monitor.isCanceled() || Thread.currentThread().isInterrupted()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
}    private static final Log log = Log.getLog(WSEventController.class);
                events = List.copyOf(eventsPool);
    }
 *
public class WSEventController {

    private final Map<String, List<WSEventHandler>> eventHandlersByType = new HashMap<>();

import org.jkiss.dbeaver.model.websocket.WSEventHandler;
        this.forceSkipEvents = forceSkipEvents;
                        handler.handleEvent(event);
            }
        }
import org.eclipse.core.runtime.IStatus;
import org.jkiss.dbeaver.model.websocket.registry.WSEventHandlersRegistry;
     */
     * Add cb event to the event pool
    /**
 * Unless required by applicable law or agreed to in writing, software
        });
            eventsPool.add(event);
            List<WSEvent> events;
    public WSEventController() {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        @Override
            return JOB_EVENT_HANDLER_FAMILY.equals(family);
import org.eclipse.core.runtime.Status;
     */
        var eventHandlerDescriptors = WSEventHandlersRegistry.getInstance().readDescriptors();
     * Flag to check if we need to skip events
                    try {


                topic -> eventHandlersByType.computeIfAbsent(topic, x -> new ArrayList<>()).add(handler)

    private class CBEventCheckJob extends AbstractJob {
    /**
        }

        }
            }
            setUser(false);
 */
    /**
 *
    public void scheduleCheckJob() {
 * DBeaver - Universal Database Manager
