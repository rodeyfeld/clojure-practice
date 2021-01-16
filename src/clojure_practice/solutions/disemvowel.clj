(ns clojure-practice.solutions.disemvowel)


(defn disemvowel
    "Source: https://www.codewars.com/kata/52fba66badcd10859f00097e/train/clojure"
    [s]
    (println (clojure.string/replace s #"[aeiouAEIOU]" ""))
    )

(disemvowel "This website is for losers LOL!")