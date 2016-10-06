(defproject n-net "0.0.1-SNAPSHOT"
  :description "Biblioteca de Redes Neuronales"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot n-net.core
  :target-path "target/%s"
  :global-vars {*print-length* 20}
  :profiles {:uberjar {:aot :all}
             :dev {:source-paths ["dev"]
                   :dependencies [[pjstadig/humane-test-output "0.7.1"]]
                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]}})
