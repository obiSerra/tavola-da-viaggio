(ns tavola.views.home
  (:require
   [re-frame.core :as re-frame]
   [re-com.core :as re-com]
   [tavola.subs :as subs]
   [tavola.views.events :as events]
   ))


;; home

(defn home-title []
  [re-com/title
   :label "Tavola da viaggio"
   :level :level1])

(defn home-subtitle []
  [re-com/title
   :label "Una semplice dashboard per semplificare le cene a tema"
   :level :level2]
)

(defn link-to-about-page []
  [re-com/hyperlink-href
   :label "go to About Page"
   :href "#/about"])

(defn home-panel []
  [re-com/v-box
   :gap "1em"
   :children [[home-title]
              [home-subtitle]
              [events/next-event-panel]
              [link-to-about-page]]])
