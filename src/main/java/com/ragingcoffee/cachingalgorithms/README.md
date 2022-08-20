# Caching Algorithms

- There have been plenty of use of the cache in various fields to speed up servicing requests. It is extensively used in designing systems with heavy load, computer organization and web development in conjunction to databases.
- Examples of caching tools include Redis, Memcached, Varnish Cache, Apache Ignite, Couchbase Server, etc.
- No matter what service is being used for caching (each have their own design principles and use-case recommendations), certain things are shared. The logic behind how the cache would operate and how data would get replaced when it fills up is dictated by caching algorithms.
- There are multiple caching algorithms out there. The ones that seemed to make the most sense without much research are given below.
- All algorithms here are implemented with the cache size set to 5 elements and the main memory/ database size to 20 elements, to ensure brevity.
- A `CacheMechanism.java` file exists to define an interface that dictates behaviour as well as helps in data types of similar classes implementing it get evaluated in a certain way in a method in `ImplementCache.java` class.
- The `ImplementCache.java` class is used to run all the simulations of the algorithms.


## Least Recently Used Algorithm

- This algorithm works on the idea that *cache elements that have not been much used, at any given time, should be evicted*. This algorithm appears to be pretty helpful if the data store has been working for a long time and there are set records for certain types of data being used more at a given time.
- In case of a cache miss, the data is fetched and added to the end of the data structure that houses recent elements and evicts data items that are at the other end of the data structure (not recently used). In case of a cache hit, the data retrieved is put to the recently used end.
- The linked list data structure has been used.
- `LeastRecentlyUsedCache.java` examines this method.


## Most Recently Used Algorithm

- This algorithm works on the idea that *cache elements that have been much used, at any given time, should be evicted*. A MRU algorithm is good in situations in which the older an item is, the more likely it is to be accessed.
- In case of a cache miss, the data is fetched and added to the end of the data structure that houses recent elements and evicts data items that are at that very end of the data structure. In case of a cache hit, the data retrieved is put to the recently used end.
- The linked list data structure has been used.
- `MostRecentlyUsedCache.java` examines this method.


## Least Frequently Used Algorithm

- This algorithm works on the idea that *cache elements that have not been used to a very large degree as compared to the rest, at any given time, should be evicted*. This algorithm appears to be pretty helpful if the data store has been working for a long time and there are set records for certain types of data being used more, overall, throughout the history.
- In case of a cache miss, the data is fetched from the main memory and put in place of the element that has had the least hits in the cache. In case of a hit, the counter associated to an element increases.
- The double dimensional array data structure has been used (somewhat like a lower-level hashtable implementation).
- `LeastFrequentlyUsedCache.java` examines this method.


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


## Random Replacement Algorithm

- This algorithm uses the idea of *replacing elements randomly with no associated logic*. This may at times provide for a more uniform spread in data eviction from cache. This may not be an ideal method to go for as far as caching is concerned in most cases.
- This certainly should not be chosen at moments when there is uncertainty as to the adoption of a technique. Use LFU or LRU in such situations.
- The linked list data structure has been used to realize the cache.
- `RandomReplacementCache.java` examines this method.


## Issues

- None of the programs run without having the `Scanner` object open, which issues a linter error that the `Scanner` is not being closed. `NoSuchElementException` is issued in all cases. The fix has not yet been found.
- Due to random element addition from a set of 20 elements into the cache, replication of an element may occur. This violates a fundamental principle of cache that a particular element would (obviously) only occupy just one element. The fix has not yet been found.