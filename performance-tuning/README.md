# Performance Tuning & Profiling

## Topics to Practice
- [ ] JVM memory areas — Heap, Stack, Metaspace, Code Cache
- [ ] GC algorithms — Serial, Parallel, G1, ZGC, Shenandoah
- [ ] GC tuning flags — `-Xmx`, `-Xms`, `-XX:+UseG1GC`, `-XX:MaxGCPauseMillis`
- [ ] GC logs — reading and interpreting
- [ ] Memory leak detection — heap dumps, `jmap`, MAT
- [ ] `jstack` — thread dumps for deadlock diagnosis
- [ ] `jstat` — live GC stats
- [ ] VisualVM / JProfiler / async-profiler
- [ ] JMH (Java Microbenchmark Harness) — `@Benchmark`, `@BenchmarkMode`
- [ ] Common pitfalls — autoboxing, string concatenation in loops, excessive object creation
- [ ] JIT compilation — warm-up, `@Contended` for false sharing
- [ ] Object pooling — when it helps, when it doesn't
