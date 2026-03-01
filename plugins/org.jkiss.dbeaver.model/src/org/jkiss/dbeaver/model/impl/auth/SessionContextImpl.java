import org.jkiss.dbeaver.DBException;
                        addSession(session);

 * Licensed under the Apache License, Version 2.0 (the "License");

    }
 *
        return session;
import org.jkiss.dbeaver.model.auth.SMSessionProviderService;
 * limitations under the License.
import java.util.ArrayList;
        } else {
    public void clear() {
}
public class SessionContextImpl implements SMSessionContext {
        //log.debug(">> Session not found in context " + this + " for space " + space);
    }
            if (CommonUtils.equalObjects(session.getSessionSpace(), space)) {
            //log.debug(">> Session added to context " + this + ", space=" + session.getSessionSpace() + ": " + session, new Exception());
    public SessionContextImpl(SMSessionContext parentContext) {

    public SMSession getSpaceSession(@NotNull DBRProgressMonitor monitor, @NotNull SMAuthSpace space, boolean open) throws DBException {
                }
 * Session context implementation
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return sessions.get(0).getSessionSpace();
        this.parentContext = parentContext;
                } catch (Exception e) {
            return session;

            //log.debug(">> Session removed from context " + this + ", space=" + session.getSessionSpace()  + ": " + session, new Exception());
 *

                    session = sessionProviderService.acquireSession(monitor, this, space);
    public SMAuthSpace getPrimaryAuthSpace() {
            return null;
/*
    }
        }
 */
import org.jkiss.code.Nullable;
    @Override
            SMSessionProviderService sessionProviderService = DBWorkbench.getService(SMSessionProviderService.class);
    private final List<SMSession> sessions = new ArrayList<>();
        this.sessions.clear();
    @Override
    private static final Log log = Log.getLog(SessionContextImpl.class);
                    // Session will be added in this context by itself (if needed)

 * You may obtain a copy of the License at
 *
                    throw new DBException("Error acquiring session", e);
 * DBeaver - Universal Database Manager
    @Nullable
    @Override
        SMSession session = findSpaceSession(space);
import org.jkiss.code.NotNull;
    }
    @Nullable
            sessions.add(session);
            }
    }
            log.debug("Session '" + session + "' was added twice");
        if (session == null && open) {
package org.jkiss.dbeaver.model.impl.auth;
                    }
import org.jkiss.dbeaver.model.auth.SMSession;
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final SMSessionContext parentContext;
        session = parentContext == null ? null : parentContext.getSpaceSession(monitor, space, false);
 * See the License for the specific language governing permissions and
            if (sessionProviderService != null) {
        if (!sessions.contains(session)) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    if (session != null) {
import org.jkiss.dbeaver.model.auth.SMAuthSpace;
    }
        }
                try {
                return session;
import org.jkiss.dbeaver.Log;
        for (SMSession session : sessions) {
            return true;
        return null;
        }
import org.jkiss.dbeaver.model.auth.SMSessionContext;
    }
    public boolean removeSession(@NotNull SMSession session) {

 */
    @Override
        if (sessions.remove(session)) {


 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 * Unless required by applicable law or agreed to in writing, software
import java.util.List;

            }
    public SMSession findSpaceSession(@NotNull SMAuthSpace space) {
        }

            log.debug("Session '" + session + "' was removed twice");
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
    @Nullable

        if (session != null) {
        if (CommonUtils.isEmpty(sessions)) {
        } else {
        }
    public void addSession(@NotNull SMSession session) {

            return false;
