(ns clojure-practice.hackerrank.string-mingling)

(defn string-mingle
    "
        Source: https://www.hackerrank.com/challenges/string-mingling/problem
        String Mingling
    "
    [lst1 lst2]
    (when (and (seq lst1) (seq lst2))
        (print (first lst1))
        (print (first lst2))
        (string-mingle (rest lst1) (rest lst2))
        )
    )

(defn string-mingling
    [lst1 lst2]
    (string-mingle (seq lst1 ) (seq lst2))
    )


