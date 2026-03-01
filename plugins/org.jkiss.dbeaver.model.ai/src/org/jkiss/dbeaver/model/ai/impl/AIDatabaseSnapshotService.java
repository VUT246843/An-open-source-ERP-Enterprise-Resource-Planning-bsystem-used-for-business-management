                }
            .withSendColumnTypes(false)
            monitor,
        boolean refreshCache
import org.jkiss.dbeaver.Log;
 * Generates textual DB snapshots that are small enough to fit into an AI prompt.
                        requiresFqn(child, execCtx),
            }
            if (sb.length() + chunk.length() > maxChars) {
 * you may not use this file except in compliance with the License.
 *
     */
            }
            Collection<? extends DBSObject> children = container.getChildren(monitor);
            return true;
 */
        Objects.requireNonNull(aiDatabaseContext.getScopeObject(), "Scope object is null");
        }
 */
import org.jkiss.code.NotNull;
            return false;
            return prompt;
                        container.cacheStructure(
            return true;
                    entity,
            .filter(o -> Stream.iterate(o.getParentObject(), Objects::nonNull, DBSObject::getParentObject)
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    ) {
        @NotNull AISchemaGenerationOptions options
        if (obj instanceof DBSObjectContainer container) {
        }
        if (appendContext(monitor, aiDatabaseContext, options, prompt, true)) {

        var prompt = new TokenBoundedStringBuilder(options.maxDbSnapshotTokens(), false);

        }
        }
    public AIDatabaseSnapshotService() {
                return false;
            .withSendObjectComment(false)

    }
    }
import org.jkiss.dbeaver.model.ai.utils.AIUtils;

        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
 *
    }
import org.jkiss.dbeaver.model.ai.AISchemaGenerator;
        boolean useFqn,

            .sorted(Comparator.comparing(DBPNamedObject::getName, String.CASE_INSENSITIVE_ORDER))
        @NotNull DBSObject obj,
                if (count > 1) { // avoid unnecessary caching
                log.warn("Failed to read metadata for entity '" + entity.getName() + "'", e);
                    refreshCache
        @NotNull DBRProgressMonitor monitor,
            try {
        return true;
                cacheStructuresIfNeeded(monitor, entities);
        @NotNull TokenBoundedStringBuilder out,

        @NotNull DBRProgressMonitor monitor,
    }
            }
                    requiresFqn(entity, ctx.getExecutionContext()),

        var partialPrompt = new TokenBoundedStringBuilder(options.maxDbSnapshotTokens(), true);

            });
        @NotNull DBSObject obj,
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
     */
                        );
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.ai.AIDatabaseScope;



                    continue;
     * Simple {@link StringBuilder} that stops accepting data once the specified
                        log.debug("Object description is too long, truncated at: " + child.getName());
 * See the License for the specific language governing permissions and
                    }

        if (AIUtils.isExcludableObject(monitor, obj)) {          // ignore system or hidden objects
            refreshCache
                    try {
                        return false;
 * You may obtain a copy of the License at
        }
        appendContext(monitor, aiDatabaseContext, fallback, partialPrompt, false);
                if (!appendObjectDescription(
        }
                        refreshCache
        @NotNull DBSObjectContainer container,
                return out.append(ddl);
 * Copyright (C) 2010-2026 DBeaver Corp and others
        @NotNull AISchemaGenerationOptions options,
    ) {
        }
    private boolean appendContainerDDL(
                .noneMatch(unique::contains))
            .withSendConstraints(false)
    ) throws DBException {
        boolean append(@NotNull CharSequence chunk) {
        return true;    // nothing to append for other object types
                    monitor,
                            DBSObjectContainer.STRUCT_ENTITIES | DBSObjectContainer.STRUCT_ATTRIBUTES
        return partialPrompt;

        @Override
            List<DBSObject> entities = normalizeCustomEntities(ctx.getCustomEntities());
        return original.toBuilder()
import org.jkiss.dbeaver.DBException;

            if (refreshCache) {
    private static void cacheStructuresIfNeeded(
        @Nullable DBCExecutionContext ctx
 *
            }
    /**
                log.warn("Failed to cache for '" + container.getName() + "'. Proceeding.", e);
            return null;
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
            this.maxChars = (maxTokens - SAFE_MARGIN_TOKENS) * DummyTokenCounter.TOKEN_TO_CHAR_RATIO;
            out,
        if (ctx.getScope() == AIDatabaseScope.CUSTOM && ctx.getCustomEntities() != null) {
    }
        Objects.requireNonNull(aiDatabaseContext.getExecutionContext(), "Execution context is null");
package org.jkiss.dbeaver.model.ai.impl;
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        @Nullable DBCExecutionContext execCtx,
            return true;
}
        if (obj instanceof DBSEntity entity) {
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static boolean requiresFqn(
        DBCExecutionContextDefaults<?, ?> def = ctx.getContextDefaults();
            .map(o -> (DBSObjectContainer) o.getParentObject())
        public String toString() {


        TokenBoundedStringBuilder(int maxTokens, boolean isTruncated) {
                        monitor,
                            monitor,
            options,
    private boolean appendContext(
                    } catch (DBException e) {
            return appendContainerDDL(monitor, out, container, execCtx, options, refreshCache);

            return isTruncated;

import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;

import org.jkiss.dbeaver.model.ai.AISchemaGenerationOptions;
     * Pre-caches container structures if many entities belong to the same container.
        log.debug("Context description is too long, generating partial description");


        @NotNull AISchemaGenerationOptions options,
            .withSendForeignKeys(false)
        }

        boolean refreshCache
                } catch (DBException e) {
    public TokenBoundedStringBuilder createDbSnapshot(
        try {

                    )) {
     * Leaves only top-level objects and sorts them to get deterministic output.
            }
        if (monitor.isCanceled()) {
        }
                        options,

            }
        );
                return true;
        private static final int SAFE_MARGIN_TOKENS = 20;
    public static class TokenBoundedStringBuilder {
import org.jkiss.dbeaver.model.ai.registry.AIAssistantRegistry;
                    out,
            throw new DBException("Snapshot generation was canceled");
                        out,
    }
            for (DBSObject entity : entities) {
        }
        }
    private static final Log log = Log.getLog(AIDatabaseSnapshotService.class);
            } catch (DBException e) {
            .filter(DBSEntity.class::isInstance)


        }
        schemaGenerator = AIAssistantRegistry.getInstance().getDescriptor().createSchemaGenerator();
        AISchemaGenerationOptions fallback = buildFallbackOptions(options);
        @NotNull AIDatabaseContext ctx,
                    return false;
     */
        if (aiDatabaseContext == null) {
    ) {
        private final StringBuilder sb = new StringBuilder();
        return appendObjectDescription(

                    monitor,
import java.util.stream.Stream;
        @NotNull TokenBoundedStringBuilder out,
                return true;
 * limitations under the License.
    private static AISchemaGenerationOptions buildFallbackOptions(AISchemaGenerationOptions original) {
                    }
        // --- fall-back -----------------------------------------------------
                        e
 * DBeaver - Universal Database Manager
            if (children == null) {
        }
     * Returns {@code true} when the entire context fits into the provided builder.
        @NotNull DBRProgressMonitor monitor,
            return true;
        if (refreshCache) {
    ) throws DBException {
            .toList();
                }
import org.jkiss.dbeaver.model.struct.DBSObject;
import java.util.*;
        @NotNull AISchemaGenerationOptions options,
        } catch (DBException e) {
/*
            return prompt;
    }
            return sb.toString();
        DBSObject parent = obj.getParentObject();
        if (options.equals(fallback)) {        // nothing else we can exclude
                if (AIUtils.isExcludableObject(monitor, child)) {
            for (DBSObject child : children) {
    private static List<DBSObject> normalizeCustomEntities(@NotNull List<DBSObject> entities) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                );
     * token limit (converted to characters) is reached.
            log.warn("Failed to children for '" + container.getName() + "'", e);
            && !(parent.equals(def.getDefaultCatalog()) || parent.equals(def.getDefaultSchema()));

                }
    }
            false,
        boolean refreshCache

                )) {
        @Nullable AIDatabaseContext aiDatabaseContext,
                try {
                    if (!appendObjectDescription(
            sb.append(chunk);
    @Nullable
/**
            .forEach((container, count) -> {
        return parent != null
                        child,
        @NotNull TokenBoundedStringBuilder out,
     */
        entities.stream()
        @NotNull DBRProgressMonitor monitor,
        return unique.stream()
    }

        private final int maxChars;
                        execCtx,
import org.jkiss.dbeaver.model.struct.DBSEntity;
                }
        private final boolean isTruncated;
import java.util.stream.Collectors;
        Set<DBSObject> unique = new HashSet<>(entities);
        @NotNull List<DBSObject> entities

                            + "' of container '" + container.getName() + "'",
                    );
            }
                    ctx.getExecutionContext(),
    /**
        }
                    log.warn(
                    DBSObjectContainer.STRUCT_ENTITIES | DBSObjectContainer.STRUCT_ATTRIBUTES
public class AIDatabaseSnapshotService {
        if (ctx == null || ctx.getContextDefaults() == null) {

        boolean isTruncated() {
                String ddl = schemaGenerator.generateSchema(monitor, entity, execCtx, options, useFqn) + "\n";

    @NotNull
    private AISchemaGenerator schemaGenerator;
            .build();
            this.isTruncated = isTruncated;

    private boolean appendObjectDescription(
    ) throws DBException {
                container.cacheStructure(
        @Nullable DBCExecutionContext execCtx,
            try {
import org.jkiss.dbeaver.model.DBPNamedObject;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } catch (DBException e) {
                        log.error("Failed to cache structure for " + container.getName(), e);
                    options,
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                        "Failed to read metadata for child '" + child.getName()
        }
            ctx.getExecutionContext(),
            ctx.getScopeObject(),

