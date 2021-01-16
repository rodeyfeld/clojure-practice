(ns clojure-practice.solutions.list-replication)

(defn printer
    "
        Source: https://www.hackerrank.com/challenges/fp-list-replication/problem
        Given a list, repeat each element in the list n amount of times.
    "
    [num lst]
    (when (seq lst)
        (do
            (loop [x num]
                (when (> x 0)
                    (println(first lst))
                    (recur (- x 1))
                    )
                )
            (printer num (rest lst))
            )
        )
    )