(ns aform.events
  (:require
   [re-frame.core :as re-frame]
   [aform.db :as db]
))

   (re-frame/reg-event-db
     :submit
      (fn [db]
       (assoc db :form-submitted true)))


(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))