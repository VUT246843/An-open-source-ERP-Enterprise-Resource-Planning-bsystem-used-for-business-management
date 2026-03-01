                        (filter == null || filter.accept(event)))
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        metaHandler = new QMMCollectorImpl();
        }
        }
    public QMRegistryImpl() {
                        } catch (InvocationTargetException e) {
                List<QMMetaEvent> filtered = new ArrayList<>();
    {
import org.jkiss.code.NotNull;
    List<QMExecutionHandler> getHandlers()
    private final List<QMExecutionHandler> handlers = new ArrayList<>();
                            statementInfo = (QMMStatementInfo) event.getObject();
                } else {
        return metaHandler;
        synchronized (handlers) {

        return eventBrowser;
                        }

            getClass().getClassLoader(),
                        }

                return new QMUtils.ListCursorImpl(pastEvents);
                        iter.remove();
import org.jkiss.dbeaver.model.qm.meta.*;
                    }

            log.debug("Error executing QM method " + method, e);
                    {
                // Filter by query type and object type
        public Object invoke(Object proxy, Method method, Object[] args)
            if (CommonUtils.isEmpty(criteria.getSearchString())) {
                this.eventBrowser = defaultEventBrowser;
        synchronized (handlers) {
    @Override
        synchronized (handlers) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 */
                return ArrayUtils.contains(objectTypes, QMObjectType.txn);
            }
            var criteria = cursorFilter.getCriteria();
            } else {
                    for (QMExecutionHandler handler : handlersCopy) {
                    if (filter != null && !filter.accept(event)) {
        registerHandler(metaHandler);
                    if (event.getObject().getText().toLowerCase().contains(searchString) &&

                log.warn("Some QM handlers are still registered: " + handlers);

            else if (object instanceof QMMTransactionInfo || object instanceof QMMTransactionSavepointInfo)
        metaHandler.addListener(metaListener);


import java.util.Collections;
                        {
    }
        synchronized (handlers) {
                            log.debug("Error notifying QM handler '" + handler.getHandlerName() + "'", e.getTargetException());
        }

                    if (criteria.getObjectTypes() != null) {
            new NotifyInvocationHandler());
import java.lang.reflect.InvocationTargetException;
                    if (criteria.getQueryTypes() != null) {
    private class NotifyInvocationHandler implements InvocationHandler {
    public synchronized QMEventBrowser getEventBrowser(boolean currentSessionOnly) {

import org.jkiss.dbeaver.model.qm.*;
            unregisterHandler(metaHandler);
    }
                        if (statementInfo != null &&
import java.lang.reflect.Method;
        }
    }
    public void unregisterMetaListener(QMMetaListener metaListener)
    @Override
            }

    @Override
                    }
import java.util.ArrayList;
 * you may not use this file except in compliance with the License.
            }
            // just ignore it
 * limitations under the License.
        if (currentSessionOnly) {

    {
                return ArrayUtils.contains(objectTypes, QMObjectType.session);
            List<QMMetaEvent> pastEvents = metaHandler.getPastEvents();
    }
        defaultHandler = (QMExecutionHandler) Proxy.newProxyInstance(
    {
            else
                        if (!matchesObjectType(event.getObject(), criteria.getObjectTypes())) {
                            continue;
                        try {
    private class DefaultEventBrowser implements QMEventBrowser {
        {
 * DBeaver - Universal Database Manager

                for (Iterator<QMMetaEvent> iter = pastEvents.iterator(); iter.hasNext(); ) {
 *
import org.jkiss.dbeaver.Log;
    @Override
            var filter = cursorFilter.getFilter();
 * QMController default implementation

    private QMExecutionHandler defaultHandler;
                return new QMUtils.ListCursorImpl(filtered);
                } else if (method.getName().equals("getHandlerName")) {
                        filtered.add(event);
                            method.invoke(handler, args);
                        continue;
    }
import java.lang.reflect.Proxy;
                        }
            return null;
    @Override
                            statementInfo = ((QMMStatementExecuteInfo) event.getObject()).getStatement();
                if (method.getReturnType() == Void.TYPE && method.getName().startsWith("handle")) {
import org.jkiss.dbeaver.model.qm.filters.QMCursorFilter;
                    }
            handlers.add(handler);
                // Default browser
                    }
      	defaultHandler = null;
                        if (event.getObject() instanceof QMMStatementInfo) {

                }
                        handlersCopy = handlers.toArray(new QMExecutionHandler[0]);
        @Override
            metaHandler.dispose();
            return handlers;
                    return method.invoke(this, args);

                for (QMMetaEvent event : pastEvents) {

    }
 */
                            !ArrayUtils.contains(criteria.getQueryTypes(), statementInfo.getPurpose()))
    }
        }
    private QMEventBrowser eventBrowser;
        public QMEventCursor getQueryHistoryCursor(@NotNull QMCursorFilter cursorFilter) {

 *
            if (object instanceof QMMConnectionInfo)
        }
}
/*
import org.jkiss.utils.ArrayUtils;
        }
import java.util.List;
        }
    public QMMCollector getMetaCollector()
 * Unless required by applicable law or agreed to in writing, software
                        QMMStatementInfo statementInfo = null;
    @Override
    {
        if (metaHandler != null) {

                handlers.clear();
        return defaultHandler;

        }
            if (criteria.getObjectTypes() != null || criteria.getQueryTypes() != null) {

            if (!handlers.isEmpty()) {
 *
import org.jkiss.utils.CommonUtils;
    }
                        } else if (event.getObject() instanceof QMMStatementExecuteInfo) {
package org.jkiss.dbeaver.runtime.qm;
        }
 * See the License for the specific language governing permissions and
        if (eventBrowser == null) {
                String searchString = criteria.getSearchString().toLowerCase();
            return defaultEventBrowser;
    public void registerHandler(QMExecutionHandler handler) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
                        }
    }

                    return null;
            }
                            iter.remove();
    public QMExecutionHandler getDefaultHandler() {
 * You may obtain a copy of the License at
                log.warn("QM handler '" + handler + "' isn't registered within QM controller");
                }
import org.jkiss.dbeaver.utils.GeneralUtils;
import java.util.Iterator;
            if (eventBrowser == null) {
        @NotNull
import java.lang.reflect.InvocationHandler;
    @Override
    private QMMCollectorImpl metaHandler;
/**

public class QMRegistryImpl implements QMRegistry {
            try {
        }
    private static final Log log = Log.getLog(QMRegistryImpl.class);
            eventBrowser = GeneralUtils.adapt(this, QMEventBrowser.class);
            metaHandler = null;
                    return "Default";
                return ArrayUtils.contains(objectTypes, QMObjectType.query);
    public void registerMetaListener(QMMetaListener metaListener)
            } catch (Throwable e) {
                    QMExecutionHandler[] handlersCopy;
        @Override
                    QMMetaEvent event = iter.next();
                    synchronized (handlers) {
            Collections.reverse(pastEvents);
    public void unregisterHandler(QMExecutionHandler handler) {
    private final DefaultEventBrowser defaultEventBrowser = new DefaultEventBrowser();
    }
            new Class[]{ QMExecutionHandler.class },
 *     http://www.apache.org/licenses/LICENSE-2.0
                            iter.remove();
                    }
        private boolean matchesObjectType(QMMObject object, QMObjectType[] objectTypes) {
            if (!handlers.remove(handler)) {
        metaHandler.removeListener(metaListener);
                }
            }
    public void dispose()
                    }
    }
