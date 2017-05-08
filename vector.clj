;creating vector using vector function
(def fst-vector (vector 1 2 3 4 5 6 7 8))

;creating vector using syntax
(def snd-vector [1,2,3,4,5,6])

;appending value to vector with conj
(def append-value (conj snd-vector 7))

;index access using get
; when index out of bound returns nil
(defn get-by-index [vector index] (get vector index))

; throws exception when index is out of bounds
(defn get-by-nth
  [vector index]
  (nth vector index))

(defn update-by-index
  [vector index value]
  (assoc vector index value))
