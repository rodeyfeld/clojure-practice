(ns clojure-practice.solutions.sum-of-odd-elements)

(defn sum-of-odd-elements
    "
        You are given a list. Return the sum of odd elements from the given list.
    "
    [lst]
    (if (seq lst)
        (do
            (if (= (mod (first lst) 2) 1)
                (do
                    (+ (first lst)  (sum-of-odd-elements (rest lst)))
                    )
                (do
                    (+ 0 (sum-of-odd-elements (rest lst)))
                    )
                )

            )
        0
        )
    )
