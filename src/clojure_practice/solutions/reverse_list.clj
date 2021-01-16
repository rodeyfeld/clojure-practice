(ns clojure-practice.solutions.reverse-list)

(defn reverse-list
    [lst]
    (when (seq lst)
        (do
            (reverse-list (rest lst))
            (println (first lst))
            )
        )
    )
