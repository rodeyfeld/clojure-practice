(ns clojure-practice.hackerrank.stones-on-table)

(defn stones-on-table
    [lst]
    (if (> (count lst) 1)
        (do
            (println lst)
            (if (= (first lst) (first (rest lst)))
                (do
                    (+ (stones-on-table (rest lst)) 1)
                    )
                (do
                    (+ (stones-on-table (rest lst)) 0)
                    )
                )
            )
        0
        )
    )

(defn solution
    "
        Source: https://www.codewars.com/kata/5f70e4cce10f9e0001c8995a/train/clojure
        Stones on a Table
    "
    [str]
    (stones-on-table (seq str))
    )
