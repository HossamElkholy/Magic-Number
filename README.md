Find the magic numbers


A number m is called a "magic number", when it's digits can be reordered such that the resulting number n is k times the original number m, where k is a positive integer > 1.

Example:
Original number: m=142857
Reorder digits:     n=571428 = 4*142857 (k=4)
=> 142857 is magic
(Note that in the example above, n=714285=5*142857 works too, so there are several k's and n's that make m magic!)

The program shall work as follows:
- User inputs a number M
- The program outputs all magic numbers m<=M and their corresponding k and n (or k's and n's if there are more solutions for m) in the form
  i: n=k*m

where i is a simple counter counting all solutions.
