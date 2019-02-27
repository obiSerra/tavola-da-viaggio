(ns tavola.db)

(def default-db
  {:name "Tavola da Viaggio"
   :next-event {:theme "Vietnamita"
                :date nil
                :where nil
                :who ["Lara e Obi + Matteo e Tommi"
                               "Massi e Laura"]} })

(defn next-event []
  (:next-event default-db))
