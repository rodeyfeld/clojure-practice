(ns clojure-practice.solutions.filter-array)

(defn filter-array
    "
        Source: https://www.hackerrank.com/challenges/fp-filter-array/problem
        Filter a given array of integers and output only those values that are
        less than a specified value.
        The output integers should be in the same sequence as they were in the input.
    "
    [num lst]
    (when (seq lst)
        (when (< (first lst) num)
            (println (first lst))
            )
        (filter-array num (rest lst))
        )
    )




