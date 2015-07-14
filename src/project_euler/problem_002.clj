(ns project-euler.problem-002)

(defn sum-even-fibs [up-to]
  (->> [0 1]
       (iterate (fn [[a b]] [b (+ a b)]))
       (map first)
       (take-while (partial > up-to))
       (filter even?)
       (reduce +)))

(defn solution-002 []
  (sum-even-fibs 4000000))
