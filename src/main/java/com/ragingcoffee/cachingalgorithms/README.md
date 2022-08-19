# Caching Algorithms

- There have been plenty of use of the cache in various fields to speed up servicing requests. It is extensively used in designing systems with heavy load, computer organization and web development in conjunction to databases.
- Examples of caching tools include Redis, Memcached, Varnish Cache, Apache Ignite, Couchbase Server, etc.
- No matter what service is being used for caching (each have their own design principles and use-case recommendations), certain things are shared. The logic behind how the cache would operate and how data would get replaced when it fills up is dictated by caching algorithms.
- There are multiple caching algorithms out there. The ones that seemed to make the most sense without much research are given below.
- All algorithms here are implemented with the cache size set to 5 elements and the main memory/ database size to 20 elements, to ensure brevity.


## Least Recently Used Algorithm


## Most Recently Used Algorithm


## Least Frequently Used Algorithm


## First-In First-Out Algorithm

- This algorithm uses a very generic idea of caching that *may or may not apply well to all use-cases*. This algorithm is pretty much extinct, in face of more general-purpose and clearly performing algorithms
- The idea is that no matter how recently or how frequently data is being accessed from the cache, the first element that was introduced in the cache would always get deleted in exchange of a new element in case of cache miss. In case of cache hit, no change occurs in the data-store of the cache.
- The queue data structure has been used to realize the cache.
- `FirstInFirstOutCache.java` examines this method.


## Last-In First-Out Algorithm

- This algorithm uses the idea that *older data stored in cache would get accessed more frequently than new data*. So the algorithm would find use in any cases that follow this principle.
- The idea is that no matter how recently or how frequently data is being accessed from the cache, the last element that was introduced in the cache would always get deleted in exchange of a new element in case of cache miss. In case of cache hit, no change occurs in the data-store of the cache.
- The stack data structure has been used to realize the cache.
- `LastInFirstOutCache.java` examines this method.


## Issues

- None of the programs run without having the `Scanner` object open, which issues a linter error that the `Scanner` is not being closed. `NoSuchElementException` is issued in all cases. The fix has not yet been found.
- Due to random element addition from a set of 20 elements into the cache, replication of an element may occur. This violates a fundamental principle of cache that a particular element would (obviously) only occupy just one element.