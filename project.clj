(defproject clj-linebot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/algo.monads "0.1.6"]
                 [org.clojure/core.async "0.2.385"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.clojure/test.check "0.9.0"]
                 [com.cemerick/pomegranate "0.3.1"]
                 [compojure "1.4.0"]
                 [clojail "1.0.6"]
                 [clj-http "2.0.1"]
                 [cheshire "5.5.0"]
                 [environ "1.0.2"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [com.linecorp.bot/line-bot-api-client "1.3.0"]
                 [com.linecorp.bot/line-bot-model "1.3.0"]
                 [com.linecorp.bot/line-bot-servlet "1.3.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler clj-linebot.core.handler/app}
  :uberjar-name "clj-linebot.jar"
  :main clj-linebot.core.handler
  :profiles
  {:dev {:repl-options {:init-ns clj-linebot.core.handler}
         :dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}
   :uberjar {:aot :all}})
