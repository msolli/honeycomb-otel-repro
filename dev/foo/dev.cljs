(ns foo.dev)

(defn main
  []
  (println "Loaded!"))

(defn ^:dev/after-load reload
  []
  (println "Reloaded!"))
