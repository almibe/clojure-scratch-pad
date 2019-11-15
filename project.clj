(defproject clojure-scratch-pad "0.1.0-SNAPSHOT"
  :description "Repo for messing around with clojure."
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot clojure-scratch-pad.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
