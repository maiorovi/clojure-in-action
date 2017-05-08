; construct list using list function
(def my-list (list 1 2 3))

;peek element of a list
(peek my-list)


;check (the type of list
(list? my-list)

; construct a new list with prepended element
(def my-extended-list (conj my-list 4))
my-extended-list
;count the length of list
(count my-extended-list)
