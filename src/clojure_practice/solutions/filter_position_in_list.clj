(ns clojure-practice.solutions.filter-position-in-list)

(defn filter-position-in-list
    "
        For a given list with  integers, return a new list removing the elements
        at odd positions.
    "
    [lst]
    (take-nth 2 (rest lst))
    )
