(ns clojure-practice.solutions.list-length)

(defn list-length
[lst]
(if (seq lst)
    (do
        (+ 1 (list-length (rest lst)))
        )
    0
    )
)
