(defproject clj-antlr "0.1.1-SNAPSHOT"
  :description "Clojure sugar over the ANTLR 4 parser library."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.antlr/antlr4-runtime "4.2"]
                 [org.antlr/antlr4 "4.2"]]
  :profiles {:dev {:dependencies
                   [[midje "1.5.0"]
                    [criterium "0.4.0"]
                    [instaparse "1.2.6"]]}}
  :java-source-paths ["src/java/"]
  :global-vars {*warn-on-reflection* true})
