(defproject tailrecursion/hoplon.hammerjs "0.1.0-SNAPSHOT"
  :description  "FIXME: write description"
  :url          "http://example.com/FIXME"
  :license      {:name "Eclipse Public License"
                 :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [tailrecursion/hoplon "5.2.0-SNAPSHOT"]]
  :target-path  "target/%s"
  :profiles     {:uberjar {:aot :all}
                 :dev     {:dependencies [[org.clojure/clojurescript "0.0-2156"]]}})
