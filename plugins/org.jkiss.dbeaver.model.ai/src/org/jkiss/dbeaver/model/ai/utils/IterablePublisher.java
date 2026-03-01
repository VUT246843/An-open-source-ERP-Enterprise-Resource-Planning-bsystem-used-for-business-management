                    } catch (Throwable throwable) {
                cancelled.set(true);
    }
        }
                    e++;
            cancelled.set(true);
                if (requested.compareAndSet(r, u)) {
        public void cancel() {
            }

 *     http://www.apache.org/licenses/LICENSE-2.0
            if (done.compareAndSet(false, true)) {
                }
                        signalError(t);
                if (u < 0L) {

            int missed = 1;
import java.util.Iterator;
        // One subscriber per publisher instance is fine; create a fresh Subscription per subscribe().
                        }
 */
        }



                if (!cancelled.get()) {
    private static final class IterableSubscription<T> implements Flow.Subscription {
 *
                try {
        private final AtomicBoolean cancelled = new AtomicBoolean(false);
                }

                    downstream.onError(t);
        }
            if (wip.getAndIncrement() == 0) {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (done.compareAndSet(false, true)) {
                        if (!it.hasNext()) {
        IterableSubscription(
                            return;
                }
                    }
            }
import java.util.concurrent.Executor;
    private static final Log log = Log.getLog(IterablePublisher.class);
                return it.hasNext();
        public void request(long n) {

                        log.error("Error in subscriber onComplete", throwable);
            }
 * Unless required by applicable law or agreed to in writing, software
        private static long addCap(AtomicLong requested, long n) {
import java.util.concurrent.atomic.AtomicBoolean;
        subscriber.onSubscribe(s);
                    return;
                        downstream.onNext(next);
                while (e != r && !cancelled.get()) {
                signalError(new IllegalArgumentException("Invalid request: " + n));
        }
                } catch (Throwable throwable) {
            this.executor = executor;
                    log.error("Error in subscriber", throwable);
                    try {
        }
    public void subscribe(@NotNull Flow.Subscriber<? super T> subscriber) {
import java.util.concurrent.atomic.AtomicInteger;
 * you may not use this file except in compliance with the License.

                        return;

            while (true) {
        @Override
        private void scheduleDrain() {
                    return u;

                }
        private final AtomicBoolean done = new AtomicBoolean(false);
        this.executor = executor;
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.downstream = downstream;

}
                    completeOnce();
        // Saturating add like Reactive Streams do
import org.jkiss.code.NotNull;
public final class IterablePublisher<T> implements Flow.Publisher<T> {
 * limitations under the License.
            synchronized (this) {
/*
                    } catch (Throwable t) {
        @Override
            }
        private final Iterator<T> it;
 * DBeaver - Universal Database Manager
        private void drain() {

            }
                long r = requested.get();
            @NotNull Executor executor
     */
        private final AtomicInteger wip = new AtomicInteger(0); // drain reentry guard
        IterableSubscription<T> s = new IterableSubscription<>(subscriber, source.iterator(), executor);
        }
        }
                }
    private final Iterable<T> source;
                    break;
        }
 *
        private boolean itHasMore() {
    @Override

        private final Executor executor;
            @NotNull Flow.Subscriber<? super T> downstream,
                    u = Long.MAX_VALUE;
                int w = wip.addAndGet(-missed);
 * See the License for the specific language governing permissions and
            }

    private final Executor executor;

        ) {
                    synchronized (this) { // iterator isn't thread-safe; guard it

import java.util.concurrent.Flow;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


                }
        private final Flow.Subscriber<? super T> downstream;
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    }
                        downstream.onComplete();
                    final T next;
            this.it = it;
                        next = it.next();
package org.jkiss.dbeaver.model.ai.utils;
                if (e != 0L) {
        this.source = source;
                long e = 0L;
 *
                    try {

        private final AtomicLong requested = new AtomicLong(0);
     * Publish all items from the given iterable using the provided executor.
                    requested.addAndGet(-e);
            while (!cancelled.get()) {
        private void completeOnce() {
    }
    public IterablePublisher(@NotNull Iterable<T> source, @NotNull Executor executor) {

            if (n <= 0) {
                long u = r + n;
    }
import org.jkiss.dbeaver.Log;
            @NotNull Iterator<T> it,
                executor.execute(this::drain);
                if (!itHasMore() && !done.get()) {
                    }
                return;
            addCap(requested, n);

                missed = 1;
                }
                if (w == 0) {

                long r = requested.get();
    /**
        private void signalError(Throwable t) {
import java.util.concurrent.atomic.AtomicLong;
                            completeOnce();


                }
 * You may obtain a copy of the License at
            scheduleDrain();
