# functionalEuler

Introduction to functional coding in Java. The idea is to solve the Euler problems [https://projecteuler.net/archives] using techniques from functional programming.

In practice, this means adhering by some rules

- All variables to be declared final (this is so they can't be reassigned)
- No loops: no for loops; no while loops (as far as possible)  

The emphasis instead is on programming using both recursion and the composition of functions - typically combinations of _stream_, _map_, _filter_, _reduce_.
 
Note: while loops can't be fully eliminated in Java due to stack overflows. This isn't the case in certain other functional languages. 

See [https://github.com/neiljmcl/euler] for some examples I've done before. 