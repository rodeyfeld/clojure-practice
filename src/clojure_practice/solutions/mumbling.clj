(ns clojure-practice.solutions.mumbling)


(defn print-multiple
    [lst]
    (print (repeat (+ (first lst) 1) (nth lst 1)))
    (print "-")
    )

(defn accum
    "
      Source: https://www.codewars.com/kata/5667e8f4e3f572a8f2000039
    "
    [s]
    (map print-multiple (map-indexed vector s))

    )

(accum "ZpglnRxqenU")