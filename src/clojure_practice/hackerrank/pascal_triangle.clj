(ns clojure-practice.hackerrank.pascal-triangle)

(defn factorial
    [n]
    (if (> n 0)
        (* n (factorial (- n 1)))
        1
        )
    )

(defn pascal-triangle
    [n]
    (when (>= n 0)
        (do
            (loop [x 0]
                (when (<= x n)
                    (do
                        (print (format "%2d" (/ (factorial n) (* (factorial x) (factorial (- n x))))))
                        (recur (+ x 1))
                        )
                    )
                )
            (println "")
            )

        (pascal-triangle (- n 1))
        )
    )
