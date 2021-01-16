(ns clojure-practice.solutions.averages)

(defn better-than-average
    [classPoints yourPoints]
    (> yourPoints (/ (+ (reduce + classPoints) yourPoints) yourPoints))
    )