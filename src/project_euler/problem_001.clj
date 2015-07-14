(ns project-euler.problem-001)

(defn sum-multiples [up-to & divs]
  (letfn [(multiple-of [num] (some zero? (map (partial rem num) divs)))]
    (->> (range up-to)
      (filter multiple-of)
      (reduce +))))

(defn solution-001 []
  (sum-multiples 1000 3 5))
