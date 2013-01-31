(defproject lein-release/lein-release "1.0.4-SNAPSHOT"
  :description "Leiningen Release Plugin"
  :dev-dependencies [[swank-clojure "1.4.2"]]
  :eval-in :leiningen
  :lein-release {:deploy-via :clojars}
  :dependencies [[org.clojure/clojure "1.3.0"]])
