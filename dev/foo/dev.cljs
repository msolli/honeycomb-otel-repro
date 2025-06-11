(ns foo.dev
  (:require
    ["@honeycombio/opentelemetry-web" :refer [HoneycombWebSDK]]))

(defn main
  []
  (println "Loaded!"))

(defn ^:dev/after-load reload
  []
  (println "Reloaded!"))
