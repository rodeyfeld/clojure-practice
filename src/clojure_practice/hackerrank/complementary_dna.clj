(ns clojure-practice.hackerrank.complementary-dna)

(defn complementary-dna
    [lst]
    (when (seq lst)
        (if (= (str (first lst)) "A")
            (str "T" (complementary-dna (rest lst)))
            (do
                (if (= (str (first lst))"T")
                    (str "A" (complementary-dna (rest lst)))
                    (do
                        (if (= (str (first lst)) "C")
                            (str "G" (complementary-dna (rest lst)))
                                (str "C" (complementary-dna (rest lst)))
                            )
                        )
                    )
                )
            )
        )
    )

(defn solution
    "
        Source: https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/clojure
        In DNA strings, symbols and 'T' are complements of each other, as 'C' and 'G'. You have function with one
        side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never
         empty or there is no DNA at all (again, except for Haskell).
    "
    [str]
    (complementary-dna (seq str))
    )

