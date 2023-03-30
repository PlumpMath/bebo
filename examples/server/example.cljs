(ns example
  (:require
   ["https://deno.land/std@0.146.0/http/server.ts" :as server]))

(def port 8080)

(defn handler [req]
  (let [agent (-> req (.-headers) (.get "user-agent"))
        body (str "너의 사용자 에이전트는: " (or agent
                                             "Unknown"))]
    (new js/Response body #js {:status 200})))

(server/serve handler #js {:port port})
