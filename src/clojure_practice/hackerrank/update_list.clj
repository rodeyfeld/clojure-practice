(ns clojure-practice.hackerrank.update-list)

(defn update-list
    "
        Source: https://www.hackerrank.com/challenges/fp-update-list/problem
        Update the values of a list with their absolute values.
    "
    [lst]
    (if (seq lst)
        (do
            (if (< (first lst) 0)
                (println(* (first lst) -1))
                (println (first lst))
                )
            (update-list (rest lst))
            )
        )
    )