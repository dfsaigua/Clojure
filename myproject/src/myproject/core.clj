(ns myproject.core
  (:gen-class))

;ejercicio 1
(defn factorial[x] ((fn [n m](if (<= n 1) m (recur (dec n)(* m n)))) x 1 ))

;ejercicio 2
(defn permutationwithrepetitions [n a b c]    ( / (factorial n)    
  (* (factorial a)(factorial b)(factorial c))
  
  ) 
)  


;ejercicio 3
(defn permutationwithoutrepetitions [n p] ( / (factorial n)   
  (factorial (- n p)) (factorial p) )
   
)



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  
(factorial 3)
(permutationwithrepetitions 2 3 4 5)
(permutationwithoutrepetitions 3 4)


)
