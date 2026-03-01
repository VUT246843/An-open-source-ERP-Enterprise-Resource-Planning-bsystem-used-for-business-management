 *
                }
                    value = remappingFunction.apply(e.offset, value, e.data);
        private void checkCollectionState(TestState state) {

                return null;
                    return this.it.next();
                @Nullable
                ", data=" + data +

 * you may not use this file except in compliance with the License.
            boolean isLastOpMutation = true;
        public OffsetKeyedTreeMap.NodesIterator<T> nodesIteratorAt(int position) {
    @Test
            var t = new Tester();
            this.list.forEach(e -> action.accept(e.offset, e.data));
                    offsetParams.fromInclusive ? offsetParams.indexFrom - 1 : offsetParams.indexFrom,
                    // TODO consider limits
        public T data;
import org.junit.Assert;
            boolean a, b;
                offsetParams, "check "  + (forward ? "forward" : "backward") + " iterator from offset at random entry #" + offsetParams.indexFrom + "-#" + offsetParams.indexTo, false,  (s, entry, offset, index) -> {
                a = nextOp.test(it1);
            return () -> {
        return () -> {
            t.doInsertionsAllRandomRemovals(t.sb.makeEntriesGeneratorAscending(i, 1, 5), false);
            return result;
 *  - all insertions, then removeAtRange at existing key
                (p, q) -> p != null && q != null && p.offset == q.offset && ((p.data == null && p.data == null) || (p.data != null && q.data != null && p.data.equals(q.data)))
                    offsetParams.toInclusive ? offsetParams.indexTo : offsetParams.indexTo + 1
        }
        }
        public final IOKMCollection<Item> treeBacked = new TreeBackedOffsetKeyedCollection<Item>();
        @Override
        public String toString() {
                public boolean next() {
                    this.it = it;
                    var entries = s.arrayBacked.toListOfEntries();
                    this.checkIteratorAtOffset(forward, s, nextEntry, entry.offset + 1, i);
        public static OffsetGeneratorParameters makeInclusiveAndExact(int indexFrom, int indexTo, int amount, int deltaLimit) {
        }
            int presented = Math.max(25, count / 3);
        public String collect() {
        String collect();
            return () -> IntStream.range(0, count).mapToObj(n -> new TestEntry(from - n * step, new Item()));
        }
        }
            Iterator<T> seqIt = seq.get().iterator();
        T find(int position);
            this.ops = ops;
            });

        void forEach(BiConsumer<Integer, T> action);
                    end = ~end;
                }
        }
        };
        }
                        if (nextEntry == null) {

            int count = (int) insertions.get().count();
                s.arrayBacked.put(p.offset, p.data);
        @Override
            }));
                s.treeBacked.put(p.offset, p.data);
                @Override
            return new OffsetGeneratorParameters(indexFrom, false, indexTo, false, amount, deltaLimit, true);
                    action.accept(s, entry != null && entry.offset == offset ? entry : null, offset, entryIndex);
                sb.appendCheckIteratorEverywhere(true);

            t.doInsertionsAllRandomRemovals(t.sb.makeEntriesGeneratorRandom(i, 1, 500), false);
/*

            Entry<?> entry = (Entry<?>) o;
            return new OffsetGeneratorParameters(indexFrom, true, indexTo, true, amount, deltaLimit, false);
        public void appendRemovalsRandom(int indexFrom, int indexTo, int amount) {
            int uniqueCount = (int) insertions.get().map(e -> e.offset).distinct().count();
            this.ops = Stream.concat(this.ops, ops.get());
 * limitations under the License.

        private static final Random staticRandom = new Random(12345);
        T put(int pos, T value);
            this.treeMap.applyOffset(position, delta);
            int indexFrom, boolean fromInclusive,
        }
                throw new IllegalArgumentException();

        }


        @Override
                s.treeBacked.applyOffset(pos, delta);
                StreamSupplier.of(
                @Override
                }));
        public List<Entry<T>> toListOfEntries() {
            sb.appendRemovalsConsequent(0, uniqueCount, removalsForward);
    }
                var it = s.treeBacked.nodesIteratorAt(pos);
 *  - intermixed insertions, remove, apply offset (different series proportions n,m,p)

            int count = (int) insertions.get().count();
                    this.checkIteratorAtOffset(forward, s, entry, offset, index);


        public T put(int pos, T value) {

import org.jkiss.dbeaver.model.stm.STMUtils;
            Assert.assertEquals(entry == null ? null : entry.data, presentedValueAtOffset);
    }
                    return this.index < this.limit && this.it.hasNext();
        private final OffsetKeyedTreeMap<T> treeMap = new OffsetKeyedTreeMap<>();
import org.junit.Test;
            this.append(this.makeCheckFindRandomOffset(offsetParams));

            return new OffsetGeneratorParameters(Integer.MAX_VALUE, true, Integer.MAX_VALUE, false, 1, 50, true);
 *     http://www.apache.org/licenses/LICENSE-2.0
            return () -> Stream.of(sources).map(Supplier::get);
    ).flatMapToInt(x -> x);
        @Override
        }
 *  - all insertions (n)
            var t = new Tester();
            };
        }
public class OffsetKeyedTreeMapTest extends DBeaverUnitTest {
    }
                s.arrayBacked.applyOffset(pos, delta);
            return this.list.removeIf(e -> e.offset == position);

        }
        }
                Entry<T> e = this.list.get(index);
import org.jkiss.code.Nullable;
                    int offset = rnd.nextInt(offsetFrom, offsetTo);
        @Override
        @Override
            ));
    private static class TestState {
                            offsetFrom = entries.get(entries.size() - 1).offset;
        @Override
        }
        }
        public void append(Supplier<Stream<TestOperation>> ops) {
        }
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorRandom(i, 1, 500), false, true);
/**
        IntStream.of(50, 100, 150)
        }
        Assert.assertTrue(sequences.get().allMatch(s -> s.spliterator().hasCharacteristics(Spliterator.SIZED)));
    }
 *  - all insertions, then removeAtRange offset at missing key
                    var entry = entryIndex >= 0 && entryIndex < entries.size() ? entries.get(entryIndex) : null;
            }
                presentedEntries.addLast(new Entry<>(it1.getCurrOffset(), it1.getCurrValue()));
                private final long limit;
                @Override
                    } else {
            Assert.assertEquals(expectedValueAtOffset, presentedValueAtOffset);
            assertEntryStreamsEqual(expectedEntries.stream(), presentedEntries.stream());
    }
        Iterator<R> it = new Iterator<R>() {
                            offsetTo = nextEntry.offset;
        }
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorRandom(i, 1, 500), true, true);

                sb.appendCheckIteratorAtRandomOffset(offsetParameters, false);
            this.treeMap.forEach(action);
        }

                return IntStream.range(0, amount).mapToObj(n -> this.makeOperation("remove at offset of random entry #" + indexFrom + "-#" + (indexTo - n), true, s -> {
                        s.arrayBacked.applyOffset(offset, delta);
            OffsetGeneratorParameters offsetParameters = OffsetGeneratorParameters.makeExclusiveAndExact(0, count, count / 2, 5);
        public T put(int pos, T value, OffsetKeyedTreeMap.RemappingFunction<T> remappingFunction) {
        }
                sb.appendCheckIteratorEverywhere(false);

            };

            this.data = data;
            OffsetGeneratorParameters offsetParams,
            }
            ).get();
                Assert.assertEquals(offset, it1.getCurrOffset());
                    Entry<Item> nextEntry = i >= entries.size() - 1 || entries.get(i + 1).offset != entry.offset + 1 ? null : entries.get(i + 1);
                    }
        public void appendRemovalsConsequent(int index, int amount, boolean forward) {
        @Override
        }

                sb.appendApplyOffsetRandom(offsetParameters);
        public boolean equals(Object o) {
                        return position;
            if (max - min < count) {

 * Unless required by applicable law or agreed to in writing, software
                () -> mapIndexed(
    private static <T> void assertEntryStreamsEqual(Stream<Entry<T>> a, Stream<Entry<T>> b) {
                    if (this.initial && this.index < 0) {
                    }

            this.append(this.makeOperation("assert interator not null at " + pos, false, s -> {
                if (end < 0) {
            int index = Collections.binarySearch(this.list, new Entry<>(pos, null), Comparator.comparingInt(e -> e.offset));
        }
        T put(int pos, T value, OffsetKeyedTreeMap.RemappingFunction<T> remappingFunction);
            if (index < 0) {
                '}';
            int index = Collections.binarySearch(this.list, new Entry<>(position, null), Comparator.comparingInt(e -> e.offset));

            if (count < 10) {
            @Override
        }
            this.ops = Stream.empty();
                ).get().mapToLong(y -> y)
        @Override
                expectedEntries.addLast(new Entry<>(it2.getCurrOffset(), it2.getCurrValue()));
        }
                    this.initial = false;
            };
                a,
        @Override
            return new OffsetGeneratorParameters(indexFrom, true, indexTo, true, amount, deltaLimit, true);
            sb.append(makeProportionalSeries(
            return () -> IntStream.range(0, count).mapToObj(n -> new TestEntry(from + n * step, new Item()));
                return function.apply(x.hasNext() ? x.next() : null, y.hasNext() ? y.next() : null);
            );
 *  - random
        }
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorDescending(i, 1500, 5), false, true);

                @Override
 *  - all insertions, then all remove (different series proportions n,m)
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorAscending(i, 1, 5), true, false);
                if (isLastOpMutation) {
        @Override



                    int entryIndex = rnd.nextInt(indexes.a, indexes.b);

                var indexes = Interval.of(indexFrom, indexTo);
        };
        }
        }
                private boolean initial = true;
            int seed = staticRandom.nextInt();
                    list.add(new Entry<>(x, y));
        public boolean removeAt(int position) {
        }
            Item presentedValueAtOffset = it1.getCurrValue();
                private int index = STMUtils.binarySearchByKey(list, e -> e.offset, position, Comparator.comparingInt(x -> x));
 * distributed under the License is distributed on an "AS IS" BASIS,

        public OffsetKeyedTreeMap.NodesIterator<T> nodesIteratorAt(int position) {
            public boolean hasNext() {

            return new OffsetKeyedTreeMap.NodesIterator<T>() {
        public void appendInsertions(Supplier<Stream<TestEntry>> entries) {
        }

        public Supplier<Stream<TestOperation>> makeRemovalsRandom(int indexFrom, int indexTo, int amount) {
                    return this.index >= 0 && this.index < list.size() ? list.get(this.index).data : null;
            String description,
                public BatchIterator(long limit, Iterator<T2> it) {
                public boolean prev() {
                    } else {
 *

    }
        public void applyOffset(int position, int delta) {
                var indexes = Interval.of(
            Iterator<R> it = new Iterator<R>() {
 */
                private int index = 0;
                        return list.get(this.index).offset;
                        int delta = rnd.nextInt(1, offsetParams.deltaLimit);
                            offsetTo = Integer.MAX_VALUE / 2;
                    offsetParams, "apply offset at random entry #" + offsetParams.indexFrom + "-#" + offsetParams.indexTo, true, (s, entry, offset, index) -> {
 *  - find existing key
    private interface ObjObjIntIntConsumer<A, B> {
 *  - find existing key and iterate forward/backward till the end/head
            sb.appendRemovalsRandom(0, uniqueCount, count < 10 ? count : uniqueCount / 2);
        public TestScenario(List<TestOperation> ops) {
        public void appendAssertionIteratorNotNullAt(int pos) {
                index = ~index;
                if (y != null) {
            this.list.removeIf(e -> e.offset >= from && e.offset < to);

                    var nextEntry = entryIndex + 1 >= 0 && entryIndex + 1 < entries.size() ? entries.get(entryIndex + 1) : null;
        public Supplier<Stream<TestEntry>> makeEntriesGeneratorDescending(int count, int from, int step) {
        }
            this.append(this.makeInsertions(entries));
            }));
        public void forEach(BiConsumer<Integer, T> action) {
    private static class TestScenario {
            @Override
        public void doInsertionsAllRandomRemovals(Supplier<Stream<TestEntry>> insertions, boolean applyOffsets) {
        public static OffsetGeneratorParameters makeExclusiveNoExact(int indexFrom, int indexTo, int amount, int deltaLimit) {
    }
                @Override
        @Override
 *  - find missing key
            return this.put(pos, value, null);
        private final List<TestOperation> ops;
        }
        }
    }
                () -> IntStream.range(0, 6 * 4).mapToDouble(n -> 100 / 6.0)
                }
 * orderings (M)
            ).allMatch(c -> c));
            return () -> entries.get().map(p -> this.makeOperation("insert " + p.data + " at " + p.offset, true, s -> {
            Predicate<OffsetKeyedTreeMap.NodesIterator<Item>> nextOp = forward ? it -> it.next() : it -> it.prev();
    public void testInsertionsThenApplyOffsetsThenRemovals() {
        }
            return Collections.unmodifiableList(list);
                public boolean hasNext() {
                public int getCurrOffset() {
                TestOperation op = this.ops.get(i);

        @Override
            TestState state = new TestState();

                return IntStream.range(0, offsetParams.amount).mapToObj(n -> this.makeOperation(description, isMutation, s -> {
                    if (entry == null) {
                e.data = value;
            sb.appendInsertions(insertions);
            return this.treeMap.put(pos, value, remappingFunction);
                }
                    this.checkCollectionState(state);
        @Override
        public static <T> Supplier<Stream<Stream<T>>> of(Supplier<Stream<T>> ... sources) {
            TestScenario result = new TestScenario(this.ops.toList());
        OffsetKeyedTreeMap.NodesIterator<T> nodesIteratorAt(int position);
        }
        public void applyOffset(int position, int delta) {
            return this.treeMap.put(pos, value);
                public T2 next() {
    }
        }
        public boolean removeAt(int position) {
        }
                        this.index = ~this.index;

            this.append(this.makeApplyOffsetRandom(offsetParams));
        };
                return this.makeOpsAtRandomOffsets(
            if (delta < 0) {
            return this.list.stream().map(e -> e.offset + ": " + e.data).collect(Collectors.joining(", ", "[", "]"));
            int uniqueCount = (int) insertions.get().map(e -> e.offset).distinct().count();
        for (int i : SERIES.get().toArray()) {


                }

                            offsetTo = entry.offset + offsetParams.deltaLimit;
            int index = Collections.binarySearch(this.list, new Entry<>(position, null), Comparator.comparingInt(e -> e.offset));
            };
        @Override
        }
                    indexes.b--;
            Item expectedValueAtOffset = it2.getCurrValue();

            this.offset = offset;
                op.action.accept(state);
import java.util.*;
            return this.treeMap.nodesIteratorAt(position);
                        return Integer.MAX_VALUE;
            return new OffsetGeneratorParameters(indexFrom, false, indexTo, false, amount, deltaLimit, false);
    public void testIntermixedInsertionsAndRemovals() {
        @Override
            return this.treeMap.size();
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorRandom(i, 1, 500), false, false);
                    () -> proportionPercents.get().mapToObj(x -> x), (n, p) -> (long) (streamSize[n % streamSize.length] * p / 100.0)
            }
        @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


                    int offsetFrom, offsetTo;
                        return Integer.MIN_VALUE;
                            offsetFrom = 0;
                offsetParams, "check find offset at random entry #" + offsetParams.indexFrom + "-#" + offsetParams.indexTo, true,  (s, entry, offset, index) -> {
    }
        public static OffsetGeneratorParameters makeAfterLast() {
    private static <T> void assertCollectionsEqual(IOKMCollection<T> a, IOKMCollection<T> b) {
        }
        }
            return () -> IntStream.range(0, amount).mapToObj(n -> this.makeOperation("remove at offset of entry #" + (forward ? index : (index - n)), true, s -> {
            }
            TestScenarioBuilder sb = new TestScenarioBuilder();

    private record TestOperation(int id, String description, boolean isMutation, Consumer<TestState> action) { }
        void applyOffset(int position, int delta);

    @FunctionalInterface
        public void appendApplyOffsetAt(int pos, int delta) {
            this.append(this.makeOperation("apply offset at " + pos + " with delta " + delta, true, s -> {
    private record OffsetGeneratorParameters(
 *

        private void checkIteratorAtOffset(boolean forward, TestState s, Entry<Item> entry, int offset, int index) {
            sb.complete().run();
            return "Entry{" +
        public Supplier<Stream<TestOperation>> makeCheckFindRandomOffset(OffsetGeneratorParameters offsetParams) {
        public void forEach(BiConsumer<Integer, T> action) {
                    return seqIt.hasNext();
            }
            t.doInsertionsAllRandomRemovals(t.sb.makeEntriesGeneratorDescending(i, 1500, 5), true);

        @Override
    private static <A, B, R> Stream<R> zip(Stream<A> a, Stream<B> b, BiFunction<A, B, R> function) {
        @Override
                        }
 *  - all insertions, then apply offset at missing key
            sb.complete().run();
    private static <T, R> Supplier<Stream<R>> mapIndexed(Supplier<Stream<T>> seq, BiFunction<Integer, T, R> function) {

            class BatchIterator<T2> implements Iterator<T2> {
                var rnd = new Random(staticRandom.nextInt());

                Assert.assertEquals(s.arrayBacked.find(pos), s.treeBacked.find(pos));
            this.treeMap.forEach((x, y) -> {
                    }
        public Item() {
            this.list.subList(index, this.list.size()).forEach(e -> e.offset += delta);

            int seed = staticRandom.nextInt();
            if (this == o) return true;
            }
        @Override
            }));
        }
                }
    @Test

        public void appendCheckFind(int pos) {
                        s.treeBacked.applyOffset(offset, delta);

                    s.treeBacked.removeAt(entry.offset);
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorDescending(i, 1500, 5), false, false);

        return () -> {


    @Test
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorAscending(i, 1, 5), true, true);
        }
        public Supplier<Stream<TestEntry>> makeEntriesGeneratorRandom(int count, int min, int max) {
    }
        public TestScenario complete() {
            } else {
        }
                var rnd = new Random(seed);
            return mapIndexed(() -> seriesSizes.get().mapToObj(x -> x), (n, s) -> new BatchIterator<T>(s, iterators.get(n % iterators.size())))
        }
        }
 * <p>
            this.append(this.makeRemovalsRandom(indexFrom, indexTo, amount));
            return value;
                }
        int size();
        }
                throw new IllegalArgumentException();
        public void removeAtRange(int from, int to) {
        }
                public boolean hasNext() {
                List<Entry<Item>> entries = s.arrayBacked.toListOfEntries();
        private final int id;
            if (!isLastOpMutation) {

 *
                Assert.assertNotNull(it.getCurrValue());


            this.append(this.makeCheckIteratorAtRandomOffset(offsetParams, forward));
            zip(

            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorAscending(i, 1, 5), false, false);
    }
                }
        }
            return offset == entry.offset && Objects.equals(data, entry.data);
                for (int i = 0; i < entries.size(); i++) {
        Iterator<A> x = a.iterator();
    }
        public void run() { // boolean selectionsAfterEachStep) {

        public Supplier<Stream<TestOperation>> makeInsertions(Supplier<Stream<TestEntry>> entries) {
                }
            this.append(this.makeRemovalsConsequent(index, amount, forward));
            } while (a && b);
    private static class ArrayBackedOffsetKeyedCollection<T> implements IOKMCollection<T> {
    }
                list.add(index, new Entry<>(pos, value));
    private static class TreeBackedOffsetKeyedCollection<T> implements IOKMCollection<T> {

        public T put(int pos, T value, OffsetKeyedTreeMap.RemappingFunction<T> remappingFunction) {
                ),

        assertEntryStreamsEqual(a.toListOfEntries().stream(), b.toListOfEntries().stream());




                    if (this.initial && this.index < 0) {
        }
            return this.makeOpsAtRandomOffsets(

                }
    public void testInsertionsThenRemovals() {


                var entry = s.arrayBacked.toListOfEntries().get(forward ? index : Math.max(0, index - n));
            t.doInsertionsAllRandomRemovals(t.sb.makeEntriesGeneratorAscending(i, 1, 5), true);
        public void appendApplyOffsetRandom(OffsetGeneratorParameters offsetParams) {

        public TestEntry(int offset, Item data) {
                return IntStream.range(1, count).mapToObj(n -> new TestEntry(rnd.nextInt(min, max), new Item()));
        for (int i : SERIES.get().toArray()) {
            return "Item[" + this.id + "]";
                            offsetTo = nextEntry.offset;
        public void doInsertionsAllConsequentRemovals(Supplier<Stream<TestEntry>> insertions, boolean applyOffsets, boolean removalsForward) {
                    return function.apply(index++, seqIt.next());
            // add run log if needed
            }
        }
                if (remappingFunction != null) {
        public T put(int pos, T value) {
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorAscending(i, 1, 5), false, true);

    ).flatMapToInt(x -> x);
                this.list.subList(index, end).clear();
        }
 *  - descending
            sb.appendInsertions(sb.makeEntriesGeneratorRandom(presented, 1, 4000));
        public final TestScenarioBuilder sb = new TestScenarioBuilder();
        public Supplier<Stream<TestOperation>> makeCheckIteratorAtRandomOffset(OffsetGeneratorParameters offsetParams, boolean forward) {
    }
        }


            return this.treeMap.removeAt(position);
            if (o == null || getClass() != o.getClass()) return false;
            ObjObjIntIntConsumer<TestState, Entry<Item>> action
            this.treeMap.applyOffset(from, to - from); /* see dropInvisibleScriptItems() */
 *  - intermixed insertions and remove (different series proportions n,m)
                    this.initial = false;
        }
        public final IOKMCollection<Item> arrayBacked = new ArrayBackedOffsetKeyedCollection<Item>();
        }
                        } else {
            assertCollectionsEqual(state.arrayBacked, state.treeBacked);

        public void removeAtRange(int from, int to) {

            this.append(this.makeOperation("check find at " + pos, false, s -> {
            }
        private Stream<TestOperation> ops = Stream.empty();
            OffsetGeneratorParameters offsetParams = OffsetGeneratorParameters.makeExclusiveAndExact(5, presented - 5, dynamic, 3);
            OffsetKeyedTreeMap.NodesIterator<Item> it1 = s.treeBacked.nodesIteratorAt(offset);
            return () -> {
    }
import org.jkiss.dbeaver.model.sql.semantics.OffsetKeyedTreeMap;
                sequences,
            );
            }));
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorDescending(i, 1500, 5), true, true);
        Assert.assertTrue(

                Random rnd = new Random(seed);
                }
                    s.arrayBacked.removeAt(entry.offset);
            long[] streamSize = sequences.get().mapToLong(Stream::count).toArray();
        IntStream.range(0, 26),
                }
    private static final Supplier<IntStream> INTERMIXED_SERIES = () -> Stream.of(
                        if (nextEntry == null) {
        public T find(int position) {
        @Override
        }
    private static class TestScenarioBuilder {
            List<Iterator<T>> iterators = sequences.get().map(s -> s.iterator()).toList();
        for (int count : INTERMIXED_SERIES.get().toArray()) {
            if (it1.getCurrValue() != null) {
}
    private static class Tester {
        }
    private static <T> Supplier<Stream<T>> makeExactSeries(Supplier<Stream<Stream<T>>> sequences, Supplier<LongStream> seriesSizes) {
        public Supplier<Stream<TestOperation>> makeOpsAtRandomOffsets(
            public R next() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
        public Entry(int offset, T data) {

    private static final Supplier<IntStream> SERIES = () -> Stream.of(
        };
            return Collections.unmodifiableList(this.list);

            };
        @Override
 *  - ascending
        public void appendCheckFindRandomOffset(OffsetGeneratorParameters offsetParams) {
    private static class StreamSupplier {
        }
        public static OffsetGeneratorParameters makeExclusiveAndExact(int indexFrom, int indexTo, int amount, int deltaLimit) {
            if (indexTo - indexFrom < amount) {

 * DBeaver - Universal Database Manager
 * modification scenarios (P)
                    return this.index < list.size();
        }



import java.util.function.*;
            return this.makeOpsAtRandomOffsets(
    }
                    var entry = s.arrayBacked.toListOfEntries().get(rnd.nextInt(indexes.a, indexes.b));
        return () -> {
 */
 *  - random backward-forward iterations
 * <p>
                    sb.makeCheckIteratorAtRandomOffset(offsetParams, true),
            if (index < 0) {

            t.doInsertionsAllRandomRemovals(t.sb.makeEntriesGeneratorDescending(i, 1500, 5), false);
        public void append(TestOperation op) {

                Random rnd = new Random(seed);


    }

            }

            return () -> {
                // 6 iterations for 4 sets of operations, each turn for 1/6 of dynamically introduced entries

        IntStream.of(50, 100, 150)

            }

            sb.appendInsertions(insertions);

        }
            OffsetKeyedTreeMap.NodesIterator<Item> it2 = s.arrayBacked.nodesIteratorAt(offset);

                    this.limit = limit;
 * Test scenarios to cover OffsetKeyedTreeMap data structure
                ).get();
        public Supplier<Stream<TestOperation>> makeApplyOffsetRandom(OffsetGeneratorParameters offsetParams) {
        public void appendCheckIteratorAtRandomOffset(OffsetGeneratorParameters offsetParams, boolean forward) {
                }
                @Override
        @Override


            if (index < 0) {
package org.jkiss.dbeaver.model.lsm.test;
            this.ops = Stream.concat(this.ops, Stream.of(op));
    private static class TestEntry extends Entry<Item> {
            return this.treeMap.find(position);
    private static class Item {

        Iterator<B> y = b.iterator();
                    this.index++;
        public static OffsetGeneratorParameters makeInclusiveNoExact(int indexFrom, int indexTo, int amount, int deltaLimit) {

            for (int i = 0; i < this.ops.size(); i++) {
        public int size() {
            }
        }
 *  - all insertions, then apply offset at existing key
                    sb.makeCheckIteratorAtRandomOffset(offsetParams, false)
                    Entry<Item> prevEntry = i <= 0 || entries.get(i - 1).offset != entry.offset - 1 ? null : entries.get(i - 1);
                s.treeBacked.removeAt(entry.offset);
            do {
                        } else {
            } else {
        }
        @Override
            return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
            LinkedList<Entry<Item>> presentedEntries = new LinkedList<>();
            return new OffsetGeneratorParameters(-1, true, -1, false, 1, 50, true);
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorRandom(i, 1, 500), true, false);
                );

        }
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
                        this.index = ~this.index;


                    } else if (this.index >= 0 && this.index < list.size()) {
                return x.hasNext() || y.hasNext();
        public void appendCheckIteratorEverywhere(boolean forward) {
                return this.list.get(index).data;
            this.id = ++idCounter;
            int indexTo, boolean toInclusive,

                    if (this.initial) {
            super(offset, data);
            int seed = staticRandom.nextInt();
            };

    private interface IOKMCollection<T> {
 *  - intermixed insertions, removeAtRange, apply offset (different series proportions n,m,p)
                .get().flatMap(it -> StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false));
                isLastOpMutation = op.isMutation;
                private long index = 0;
import org.jkiss.junit.DBeaverUnitTest;
            List<Entry<T>> list = new ArrayList<>(this.treeMap.size());
                    this.checkIteratorAtOffset(forward, s, entry, entry.offset, i);
import java.util.stream.*;
            int amount, int deltaLimit, boolean excludeExact) {
        public Supplier<Stream<TestOperation>> makeRemovalsConsequent(int index, int amount, boolean forward) {
                    }
        void accept(A a, B b, int n, int m);
            this.append(this.makeOperation("test iterator everywhere", false, s -> {

        private int opsCounter = 0;
                public R next() {
                    }
            }));

        public List<Entry<T>> toListOfEntries() {
        }
        }
            return makeExactSeries(
        }
    private static class Entry<T> {
            }));
        }
                index = ~index;
                    Entry<Item> entry = entries.get(i);
                        offsetFrom = offsetParams.excludeExact ? entry.offset + 1 : entry.offset;


                }
                @Override
        void removeAtRange(int from, int to);

    private static <T> Supplier<Stream<T>> makeProportionalSeries(Supplier<Stream<Stream<T>>> sequences, Supplier<DoubleStream> proportionPercents) {

                    } else if (this.index >= list.size()) {
    }
                }

        ) {
        public Supplier<Stream<TestEntry>> makeEntriesGeneratorAscending(int count, int from, int step) {
                    sb.makeRemovalsRandom(0, presented, presented),
                s.arrayBacked.removeAt(entry.offset);

            int dynamic = (count - presented);
        private TestOperation makeOperation(String description, boolean isMutation, Consumer<TestState> operation) {
        private final ArrayList<Entry<T>> list = new ArrayList<>();
        }

        @Override

                }));
        public String toString() {
        public static OffsetGeneratorParameters makeBeforeFirst() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  - find missing key and iterate forward/backward till the end/head
            boolean isMutation,
            return new TestOperation(++this.opsCounter, description, isMutation, operation);
            }
                }
        public int size() {
 *
                        this.index++;
                b,
    }
                int end = Collections.binarySearch(this.list, new Entry<>(position - delta, null), Comparator.comparingInt(e -> e.offset));
            return this.list.size();
        public String collect() {
 * <p>

                b = nextOp.test(it2);
                    return this.index >= 0;
                    Assert.assertEquals(entry == null ? null : entry.data, s.treeBacked.find(offset));
            LinkedList<Entry<Item>> expectedEntries = new LinkedList<>();

        List<Entry<T>> toListOfEntries();
        private static int idCounter = 0;
import org.antlr.v4.runtime.misc.Interval;


                    this.checkIteratorAtOffset(forward, s, prevEntry, entry.offset - 1, i);
                private final Iterator<T2> it;
        public T find(int position) {
                    } else {


            }
                @Override
            if (applyOffsets) {
            t.doInsertionsAllConsequentRemovals(t.sb.makeEntriesGeneratorDescending(i, 1500, 5), true, false);

            } else {
        }

    }

            t.doInsertionsAllRandomRemovals(t.sb.makeEntriesGeneratorRandom(i, 1, 500), true);
                sb.appendCheckIteratorAtRandomOffset(offsetParameters, true);



                Assert.assertEquals(a, b);
        boolean removeAt(int position);
            return () -> {
                this.checkCollectionState(state);
        public int offset;
 * You may obtain a copy of the License at
                    sb.makeInsertions(sb.makeEntriesGeneratorRandom(dynamic, 1, 4000)),
                public T getCurrValue() {
                        }
                "offset=" + offset +
 * inspection scenarios (Q)
                    this.index--;
 * See the License for the specific language governing permissions and


            return this.treeMap.collect();
    }
        }
