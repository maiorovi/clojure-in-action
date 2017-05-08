(def my-addition(fn [op1 op2] (+ op1 op2)))

(def x 1)

(cond
  (> x 0) "greater"
  (= x 0) "zero"
  (< x 0) "less"
)


(def a-map {:a 1  :b 2 :c 3})


(defn mult[op1 op2] (* op1 op2))

(comment
  defn this-is-not-working [x y] (* x y))

(defn inc [x] (+ x 1))

(defn dec [x] (- x 1))
