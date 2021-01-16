(ns clojure-practice.solutions.predict-your-age)

(defn squarer
    [n]
    (* n n)
    )

(defn predict-age
    [lst]
    (println (Math/floor (/ (Math/sqrt(reduce + (map squarer lst))) 2)))

    )

(predict-age '(65 60 75 55 60 63 64 45))