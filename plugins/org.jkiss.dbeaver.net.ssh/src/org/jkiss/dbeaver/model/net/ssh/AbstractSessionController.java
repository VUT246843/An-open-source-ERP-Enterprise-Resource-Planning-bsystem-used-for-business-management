        @Override

        } else {
        }
    public void invalidate(
        @NotNull
        }
            if (counter == null) {
        @Override
        }

                }
            ));
                throw new DBException("Unable to initialize SSH agent");
        return agentIdentityRepository;
        @Override

    protected static class WrapperSession<T extends AbstractSession> extends DelegateSession {
            super(destination);
import org.jkiss.dbeaver.DBException;

        public SSHPortForwardConfiguration setupPortForward(@NotNull SSHPortForwardConfiguration configuration) throws DBException {

            @NotNull AbstractSessionController<T> controller,
    @Override
                portForwards.put(resolved, new PortForwardInfo(resolved, new AtomicInteger(1)));
            inner.removePortForward(configuration);
        }
    private ShareableSession<T> getSharedSession(
import org.jkiss.dbeaver.model.net.ssh.config.SSHPortForwardConfiguration;

        return getDelegateSession(session).getDataSources();
                super.connect(monitor, destination, configuration);
 */

            } else {

        @Override
        private SSHPortForwardConfiguration jumpPortForward;
        @Override
                0,
                host.username(),
                dataSources.remove(container);
            super(destination);
            @NotNull DBRProgressMonitor monitor,

        @Property(viewable = true, order = 3, name = "Port Forwards")
            try {
        ) throws DBException, IOException {

            this.inner = inner;
                }
        @NotNull
    @NotNull
                origin.connect(monitor, origin.destination, configuration);
        } else {
        // Data source might be null if this tunnel is used for connection testing
            super(inner.destination);
                host.port()
        public String getClientVersion() {
    protected void registerSession(@NotNull ShareableSession<T> session, @NotNull DBWHandlerConfiguration configuration) {

 * You may obtain a copy of the License at
        }
            }
                super.removePortForward(info.resolved);
                log.debug("Error during SSH session close", e);
            try {
        public synchronized SSHPortForwardConfiguration setupPortForward(@NotNull SSHPortForwardConfiguration configuration) throws DBException {
    ) throws DBException {
        ) throws DBException {

            }
        @Override

            if (portForward != null) {
        getDelegateSession(session).disconnect(monitor, configuration, timeout);
        }
                dataSources.put(container, new AtomicInteger(1));
        public DirectSession(

    protected DelegateSession getDelegateSession(@NotNull SSHSession session) {
        if (phase == DBCInvalidatePhase.INVALIDATE) {
    @Override
        @Override
        }
            this.portForward = portForward;


        ) throws DBException {

            return delegate;
            long timeout
            @NotNull DBRProgressMonitor monitor,
        ) throws DBException {
        public String getConsumerInfo() {
            @NotNull String src,
            }
            this.origin = origin;
            this.session = controller.createSession();
            if (jumpPortForward != null) {
        public void connect(
            if (connector == null) {
        protected T getSession() {
            @NotNull DBRProgressMonitor monitor,

                host.auth()
        protected DBPDataSourceContainer[] getDataSources() {
        public void removePortForward(@NotNull SSHPortForwardConfiguration configuration) throws DBException {
    }
        ) throws DBException {

            agentIdentityRepository = new AgentIdentityRepository(connector);
    }

            return dataSources.keySet().toArray(new DBPDataSourceContainer[0]);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        @NotNull DBWHandlerConfiguration configuration,
        @Override
            @Nullable SSHPortForwardConfiguration portForward
    public DBPDataSourceContainer[] getDependentDataSources(@NotNull SSHSession session) {
            @NotNull DBWHandlerConfiguration configuration,
        }
        if (session == null) {

            return session;
        protected final SSHHostConfiguration destination;
        public void removePortForward(@NotNull SSHPortForwardConfiguration configuration) throws DBException {
        session.connect(monitor, destination, configuration);
        return new JumpSession<>(this, origin, destination, portForward);
                log.debug("SSHSessionController: Reusing session to " + destination + " for " + container);
                log.debug("SSHSessionController: pageant connect exception", e);
            @NotNull DBWHandlerConfiguration configuration
    protected static class JumpSession<T extends AbstractSession> extends DelegateSession {
            getSession().getFile(src, dst, monitor);
        if (canShareSessionForConfiguration(configuration)) {
        @Property(viewable = true, order = 1, name = "Destination")
    @NotNull
        }
        @Override
        public void connect(
                portForward = jumpDestination.setupPortForward(portForward);
    }
                info.usages.incrementAndGet();
            sessions.remove(session.destination);
        @NotNull

    }

            return getSession().getServerVersion();
    protected void unregisterSession(@NotNull ShareableSession<T> session, @NotNull DBWHandlerConfiguration configuration) {
            }
        }
        }
 * See the License for the specific language governing permissions and
    protected abstract T createSession();
        @NotNull
    }
            log.debug("SSHSessionController: Disconnecting session to " + destination);
import java.util.HashMap;
        @Override
    protected AgentIdentityRepository agentIdentityRepository;
        @NotNull DBRProgressMonitor monitor,
    @NotNull
                .map(info -> "%s (%d)".formatted(info.resolved.toDisplayString(), info.usages.get()))

    }
                try {
        @Override
    }

        @Override
                log.debug("SSHSessionController: connected with pageant");

        protected final ShareableSession<T> inner;
        ) {
        @Override
    ) throws DBException {

            if (dataSources.isEmpty()) {
import org.jkiss.dbeaver.model.exec.DBCInvalidatePhase;
            session = createDirectSession(configuration, destination, portForward);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                connector = new PageantConnector();
import java.io.InputStream;
        long timeout
            log.debug("SSHSessionController: Remove port forwarding " + configuration);
        @Override
    }
            @NotNull SSHHostConfiguration host,
            return origin.getDataSources();
                    jumpDestination.removePortForward(portForward);
    @Override
            return inner.setupPortForward(configuration);
            @NotNull DBRProgressMonitor monitor
            super.connect(monitor, destination, configuration);
import java.util.concurrent.atomic.AtomicInteger;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
        @Override
                throw new DBException("Session is not acquired for " + container);
        @NotNull
        private SSHPortForwardConfiguration portForward;
            @NotNull DBRProgressMonitor monitor,
    }
        public void disconnect(
 * you may not use this file except in compliance with the License.
            getSession().putFile(src, dst, monitor);
        @NotNull DBWHandlerConfiguration configuration,
 *
            getSession().disconnect(monitor, configuration, timeout);
        return sessions.values().toArray(SSHSession[]::new);
            }
        return !SSHUtils.DISABLE_SESSION_SHARING
            jumpDestination = controller.createDirectSession(configuration, jumpHost, null);
    protected static class DirectSession<T extends AbstractSession> extends WrapperSession<T> {
                // When opening session for the first time, it will be already connected
            final PortForwardInfo info = portForwards.get(configuration);
    }

            @NotNull DBWHandlerConfiguration configuration

        @NotNull SSHHostConfiguration destination
        }
    ) throws DBException {
                controller.registerSession(this, configuration);
import java.util.Map;

 *     http://www.apache.org/licenses/LICENSE-2.0
                super.removePortForward(portForward);
            } catch (Exception e) {
            throw new IllegalStateException("Unexpected session type: " + session + " (" + session.getClass().getName() + ")");
        @NotNull
import org.jkiss.dbeaver.model.DBConstants;
            return portForwards.values().stream()
    }
        @Override

import java.util.stream.Collectors;

            @NotNull DelegateSession origin,

    }

import org.jkiss.dbeaver.model.meta.Property;

        public String getPortForwardingInfo() {


            @NotNull DBRProgressMonitor monitor,

        @Property(viewable = true, order = 2, name = "Used By")
        @Override
        }
        public synchronized void disconnect(@NotNull DBRProgressMonitor monitor, @NotNull DBWHandlerConfiguration configuration, long timeout) throws DBException {
            this.registered = true;
            super.disconnect(monitor, configuration, timeout);
            @NotNull DBWHandlerConfiguration configuration,
    @Nullable
 * limitations under the License.
            release(monitor, delegate, configuration, timeout);

        protected final Map<DBPDataSourceContainer, AtomicInteger> dataSources = new HashMap<>();

        @Override
        @Override
        }
        @Override
    }
        }
            return dataSources.entrySet().stream()
        private DelegateSession jumpDestination;
            long timeout
                counter.incrementAndGet();
            @NotNull SSHHostConfiguration destination,
import java.io.IOException;
        protected final Map<SSHPortForwardConfiguration, PortForwardInfo> portForwards = new HashMap<>();
            @NotNull DBRProgressMonitor monitor,
                } catch (Exception e) {
            }

    protected static boolean canShareSessionForConfiguration(@NotNull DBWHandlerConfiguration configuration) {
                DBConstants.HOST_LOCALHOST_IP,
        public String getDestinationInfo() {
            @NotNull SSHHostConfiguration destination,
    protected IdentityRepository createAgentIdentityRepository() throws DBException {
import java.util.concurrent.ConcurrentHashMap;
            if (dataSources.isEmpty()) {
        }
        @NotNull DBRProgressMonitor monitor,
        if (origin != null) {
            final AtomicInteger counter = dataSources.get(container);
            } else {
        }
                controller.unregisterSession(this, configuration);
        private final DelegateSession origin;
            if (jumpDestination != null) {
    @NotNull
        @NotNull SSHSession session,
        }
            jumpDestination = null;
        @NotNull DBWHandlerConfiguration configuration,
            jumpPortForward = null;
            @NotNull OutputStream dst,

        public void putFile(
            }

            this.controller = controller;
        final AbstractSession session;
        ) throws DBException {
                host.hostname(),
            }
                jumpPortForward.localHost(),
        }
            }
            super(inner);
        @Nullable SSHPortForwardConfiguration portForward
            return destination.toDisplayString();
        }
        public void disconnect(

    }


            session = new ShareableSession<>(this, destination);

            this.portForward = portForward;
            if (portForward != null) {
        protected final AbstractSessionController<T> controller;
    ) {
            return null;
        @NotNull DBCInvalidatePhase phase,
            @NotNull DBWHandlerConfiguration configuration,
            final DBPDataSourceContainer container = configuration.getDataSource();
        public synchronized void connect(
}

            this.controller = controller;
                if (portForward != null) {
            final AtomicInteger counter = dataSources.get(container);
        protected abstract DBPDataSourceContainer[] getDataSources();

            }
            @NotNull DBWHandlerConfiguration configuration,
            final PortForwardInfo info = portForwards.get(configuration);

        ) throws DBException {
                // When revalidating, it's closed and then must be opened again
            @NotNull DBRProgressMonitor monitor
            log.debug("SSHSessionController: Connecting session to " + destination);
        }
                .map(entry -> "%s (%s)".formatted(entry.getKey(), entry.getValue()))

        }
                return resolved;

            if (info != null) {
        public ShareableSession(@NotNull AbstractSessionController<T> controller, @NotNull SSHHostConfiguration destination) {
            } catch (Exception e) {
public abstract class AbstractSessionController<T extends AbstractSession> implements SSHSessionController {
    protected static class ShareableSession<T extends AbstractSession> extends DelegateSession {
        @NotNull
            sessions.put(session.destination, session);
        @Nullable SSHSession origin,
        public void getFile(
 *
                .collect(Collectors.joining(", "));
    public SSHSession acquireSession(
                origin.removePortForward(jumpPortForward);
        }
            && configuration.getBooleanProperty(SSHConstants.PROP_SHARE_TUNNELS, true);
import com.jcraft.jsch.*;
        } else {
        ) throws DBException, IOException {
        @NotNull SSHHostConfiguration destination,
            @NotNull SSHHostConfiguration destination,
            }
        if (canShareSessionForConfiguration(configuration)) {
    @NotNull
        }
        }
    @NotNull
        }
            return getSession().setupPortForward(configuration);
                final SSHPortForwardConfiguration resolved = super.setupPortForward(configuration);
        }

        protected DBPDataSourceContainer[] getDataSources() {
            if (counter == null) {
            if (info == null) {
                super.disconnect(monitor, configuration, timeout);
        @NotNull DelegateSession origin,
                portForward = super.setupPortForward(portForward);
            } else if (info.usages.decrementAndGet() == 0) {
        }
        @NotNull SSHHostConfiguration destination,
                    log.debug("SSHSessionController: ssh-agent connection exception", e);
        public SSHPortForwardConfiguration setupPortForward(@NotNull SSHPortForwardConfiguration configuration) throws DBException {
        protected AbstractSession getSession() {
        @NotNull DBWHandlerConfiguration configuration,
        }
                jumpDestination.disconnect(monitor, configuration, timeout);

/*
            getSession().connect(monitor, destination, configuration);
        @NotNull DBWHandlerConfiguration configuration,
    ) {
                log.debug("SSHSessionController: Reusing port forward " + configuration);
            @NotNull DBWHandlerConfiguration configuration
            return getSession().getClientVersion();


        if (phase == DBCInvalidatePhase.BEFORE_INVALIDATE) {
        public void disconnect(
        @NotNull
import org.jkiss.dbeaver.Log;
            @NotNull DBRProgressMonitor monitor,
            this.destination = destination;
        @NotNull
    private DirectSession<T> createDirectSession(
        }
        }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            log.debug("SSHSessionController: Set up port forwarding " + configuration);
        protected final T session;
        public WrapperSession(@NotNull ShareableSession<T> inner) {
    @Override
            @NotNull DBWHandlerConfiguration configuration
        @NotNull
        if (canShareSessionForConfiguration(configuration)) {
        }
            if (counter.decrementAndGet() == 0) {
        }
        @Override
            AgentConnector connector = null;
    ) {
    @NotNull
 * DBeaver - Universal Database Manager
            return sessions.get(destination);
            long timeout
                jumpPortForward.localPort(),
 *
            && configuration.getDataSource() != null
        protected DBPDataSourceContainer[] getDataSources() {

            @NotNull ShareableSession<T> inner,
            }
        }
    protected final Map<SSHHostConfiguration, ShareableSession<T>> sessions = new ConcurrentHashMap<>();
        ) throws DBException {
        public void removePortForward(@NotNull SSHPortForwardConfiguration configuration) throws DBException {
        return new DirectSession<>(session, portForward);
                return info.resolved;

            @NotNull InputStream src,
        if (agentIdentityRepository == null) {
                portForwards.remove(configuration);
package org.jkiss.dbeaver.model.net.ssh;
            if (portForward != null) {

import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
    }
            registered = false;
            }
        return session;

                    connector = new SSHAgentConnector(new JUnixSocketFactory());
            long timeout
        final DelegateSession delegate = getDelegateSession(session);
            );
    public SSHSession[] getSessions() {
        @NotNull SSHSession session,
        }

            }

            if (!registered) {
        protected abstract AbstractSession getSession();
        @NotNull DBRProgressMonitor monitor,
            final DBPDataSourceContainer container = configuration.getDataSource();
        @Nullable SSHPortForwardConfiguration portForward
                    log.debug("SSHSessionController: Connected with ssh-agent");
        ShareableSession<T> session = getSharedSession(configuration, destination);
            }
        @NotNull
        ) {

import java.io.OutputStream;
import org.jkiss.code.NotNull;
            }

        }
        }
            @NotNull DBWHandlerConfiguration configuration
                origin.disconnect(monitor, configuration, timeout);
    }
        @Override

            inner.connect(monitor, destination, configuration);
            jumpPortForward = origin.setupPortForward(new SSHPortForwardConfiguration(

 * distributed under the License is distributed on an "AS IS" BASIS,
                log.debug("SSHSessionController: Releasing session for " + container);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Nullable SSHPortForwardConfiguration portForward
        @Nullable SSHPortForwardConfiguration portForward
    @NotNull
        @NotNull
        }
        ) throws DBException {
            @NotNull DBRProgressMonitor monitor,
        if (session instanceof DelegateSession delegate) {

            jumpDestination.connect(monitor, jumpHost, configuration);

        public synchronized void disconnect(
                .collect(Collectors.joining(", "));
            if (connector == null) {
            @NotNull DBRProgressMonitor monitor,


        }
    private JumpSession<T> createJumpSession(
        public JumpSession(
        @NotNull

        private boolean registered;
        public String getServerVersion() {
            @NotNull SSHHostConfiguration destination,
                log.debug("SSH port forward is not set up: " + configuration + ". Tunnel opening was interrupted?");
        }
        @Override
            getSession().removePortForward(configuration);
            session = createJumpSession(getDelegateSession(origin), destination, portForward);
        }

    protected static abstract class DelegateSession extends AbstractSession {
 * Unless required by applicable law or agreed to in writing, software
        }
            @NotNull SSHHostConfiguration destination,
        public DelegateSession(@NotNull SSHHostConfiguration destination) {

            delegate.connect(monitor, delegate.destination, configuration);
            inner.disconnect(monitor, configuration, timeout);
    private static final Log log = Log.getLog(AbstractSessionController.class);
        @Override
        private SSHPortForwardConfiguration portForward;
            return inner;
                log.debug("SSHSessionController: Creating new session to " + destination);
        ) throws DBException {
            return inner.getDataSources();
        }
        @Override
        @Override
    }
import org.jkiss.code.Nullable;
            }
        long timeout
    public void release(
        public void connect(

            final SSHHostConfiguration jumpHost = new SSHHostConfiguration(

            @NotNull String dst,
        public synchronized void connect(
                registered = true;
            return jumpDestination;
        protected record PortForwardInfo(@NotNull SSHPortForwardConfiguration resolved, @NotNull AtomicInteger usages) {
    @Override
        private final AbstractSessionController<T> controller;
        @NotNull SSHHostConfiguration destination,
            // Session will be registered during connect
        protected AbstractSession getSession() {

