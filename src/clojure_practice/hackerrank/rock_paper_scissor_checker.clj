(ns clojure-practice.hackerrank.rock-paper-scissor-checker)

(def counters {
     :rock "scissors"
     :scissors "paper"
     :paper "rock"
     })

(defn rock-paper-scissor-checker
    [playerOne playerTwo]
    (when (= playerOne playerTwo)
        "DRAW"
        )
    (when (= playerOne "scissors")
        (counters :playerOne)
        (if (= playerTwo "rock")
            "Player 2 won!"
            "Player 1 won!"
            )

        )
    )