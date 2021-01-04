(ns clojure-practice.hackerrank.list-replication)

(defn printer
  "
  Source: https://www.hackerrank.com/challenges/fp-list-replication/copy-from/194169662
  Given a list, repeat each element in the list n amount of times.
  The input and output portions will be handled automatically by the grader.
  You need to write a function with the recommended method signature.
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