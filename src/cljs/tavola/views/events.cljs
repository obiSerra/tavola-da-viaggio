(ns tavola.views.events
  (:require
   [re-frame.core :as re-frame]
   [re-com.core :as re-com]
   [tavola.subs :as subs]
   [tavola.db :as db]))


(defn format-info [info]
  (or info
      "da definire"))

(defn format-partecipants [lst]
  (if (empty? lst)
      "..."
      [:ul
       (map (fn [m i] [:li {:key (str "w-" i)} m]) lst (range))]))

(defn next-event-panel []
  [re-com/v-box
   :gap "1em"
   :children [[re-com/title
               :label "Prossimo evento: "  
               :level :level3]
              [:ul
               [:li "Cosa: " (format-info (:theme (db/next-event)))]
               [:li "Quando: " (format-info (:date (db/next-event)))]
               [:li "Dove: " (format-info (:where (db/next-event)))]
               [:li "Chi: " (format-partecipants (:who (db/next-event)))]]]]

)
