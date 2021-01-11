(ns clojure-practice.hackerrank.averages)

(defn better-than-average
    [classPoints yourPoints]
    (> yourPoints (/ (+ (reduce + classPoints) yourPoints) yourPoints))
    )